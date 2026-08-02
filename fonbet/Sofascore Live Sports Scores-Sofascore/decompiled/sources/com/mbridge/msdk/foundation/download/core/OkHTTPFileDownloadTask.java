package com.mbridge.msdk.foundation.download.core;

import android.text.TextUtils;
import com.ironsource.C4094gc;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.DownloadResponse;
import com.mbridge.msdk.foundation.download.DownloadStatus;
import com.mbridge.msdk.foundation.download.core.DownloaderReporter;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream;
import com.mbridge.msdk.foundation.download.utils.Objects;
import com.mbridge.msdk.foundation.download.utils.Utils;
import com.mbridge.msdk.foundation.same.d;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.c;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.tracker.network.p;
import com.mbridge.msdk.tracker.network.toolbox.OKHTTPEventListener;
import defpackage.vxd;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
class OkHTTPFileDownloadTask implements IDownloadTask {
    private static final String CLOSE = "close";
    private static final String CONNECTION = "Connection";
    private static final String FORMAT_RANGE = "bytes=%d-";
    private static final String RESPONSE_BODY_IS_NULL = "response body is null";
    private static final String RESPONSE_CODE = "responseCode ";
    private static final String RESPONSE_CONTENT_LENGTH_IS_NULL = "response content length is null";
    private static final String RESPONSE_INPUTSTREAM_IS_NULL = "response inputStream is null";
    private static final String RESPONSE_IS_NULL = "response is null";
    private final IDatabaseHelper _databaseHelper;
    private volatile DownloadMessage _downloadMessage;
    private DownloadModel _downloadModel;
    private final DownloadRequest _downloadRequest;
    private DownloadResponse _downloadResponse;
    private DownloaderReporter.Builder _downloaderReporter;
    private String _etag = "";
    private InputStream _inputStream;
    private DownloadFileOutputStream _outputStream;
    private b0 _responseBody;
    private p monitor;

    private OkHTTPFileDownloadTask(DownloadRequest downloadRequest, DownloadModel downloadModel, IDatabaseHelper iDatabaseHelper, DownloadMessage downloadMessage, DownloaderReporter.Builder builder) {
        this._downloadRequest = downloadRequest;
        this._downloadModel = downloadModel;
        this._databaseHelper = iDatabaseHelper;
        this._downloadMessage = downloadMessage;
        this._downloaderReporter = builder;
    }

    public static IDownloadTask create(DownloadRequest downloadRequest, DownloadModel downloadModel, IDatabaseHelper iDatabaseHelper, DownloadMessage downloadMessage, DownloaderReporter.Builder builder) {
        if (Objects.isNull(builder)) {
            builder = new DownloaderReporter.Builder(DownloadCommon.DOWNLOAD_REPORT_KEY);
        }
        return new OkHTTPFileDownloadTask(downloadRequest, downloadModel, iDatabaseHelper, downloadMessage, builder);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x01a2, code lost:
    
        r2 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x021a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a2 A[EDGE_INSN: B:92:0x01a2->B:41:0x01a2 BREAK  A[LOOP:0: B:24:0x013d->B:89:0x01b7], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private DownloadResponse handleInputStream(String str, String str2, String str3, String str4) throws IOException, IllegalAccessException {
        String str5;
        DownloadResponse downloadResponse;
        boolean z;
        String str6;
        String str7;
        String str8;
        MessageDigest messageDigest;
        String str9;
        boolean z2;
        p pVar;
        byte[] bArr;
        int read;
        DownloadResponse downloadResponse2;
        p pVar2;
        String str10;
        DownloadResponse downloadResponse3;
        DownloadResponse downloadResponse4 = new DownloadResponse();
        if (Objects.isNull(this._downloadModel)) {
            String downloadId = this._downloadRequest.getDownloadId();
            String downloadUrl = this._downloadMessage.getDownloadUrl();
            String resourceUrl = this._downloadMessage.getResourceUrl();
            String saveFileName = this._downloadMessage.getSaveFileName();
            long totalBytes = this._downloadRequest.getTotalBytes();
            int downloadRate = this._downloadMessage.getDownloadRate();
            DownloadResourceType downloadResourceType = this._downloadMessage.getDownloadResourceType();
            downloadResponse = downloadResponse4;
            z = true;
            str6 = "";
            str7 = IDownloadTask.TAG;
            DownloadModel create = DownloadModel.create(downloadId, downloadUrl, resourceUrl, str4, str2, saveFileName, totalBytes, 0L, downloadRate, 1, downloadResourceType);
            str5 = str2;
            this._downloadModel = create;
            this._databaseHelper.insert(create);
        } else {
            str5 = str2;
            downloadResponse = downloadResponse4;
            z = true;
            str6 = "";
            str7 = IDownloadTask.TAG;
            DownloadModel create2 = DownloadModel.create(this._downloadModel.getDownloadId(), this._downloadModel.getDownloadUrl(), this._downloadMessage.getResourceUrl(), this._downloadModel.getEtag(), this._downloadModel.getSaveDirectorPath(), this._downloadModel.getSaveFileName(), this._downloadRequest.getTotalBytes(), this._downloadModel.getDownloadedBytes(), this._downloadMessage.getDownloadRate(), this._downloadModel.getUsageCounter() + 1, this._downloadMessage.getDownloadResourceType());
            this._downloadModel = create2;
            this._databaseHelper.update(create2, str5);
        }
        DownloadFileOutputStream downloadFileOutputStream = MBResourceManager.getInstance().getDownloadFileOutputStream(new File(str5, str));
        this._outputStream = downloadFileOutputStream;
        downloadFileOutputStream.seek(this._downloadRequest.getDownloadedBytes());
        MessageDigest messageDigest2 = null;
        try {
        } catch (Throwable th) {
            th = th;
            str8 = str6;
        }
        if (this._downloadMessage == null || !this._downloadMessage.isCheckMD5() || TextUtils.isEmpty(this._downloadMessage.getMd5())) {
            messageDigest = null;
            z2 = false;
            str9 = str6;
        } else {
            str8 = this._downloadMessage.getMd5();
            try {
                messageDigest2 = MessageDigest.getInstance(SameMD5.TAG);
                if (this._downloadMessage.getDownloadRate() == 100) {
                    if (!TextUtils.isEmpty(str8)) {
                        messageDigest = messageDigest2;
                        str9 = str8;
                        z2 = z;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                GlobalComponent.getInstance().getLogger().log(str7, th.getMessage());
                messageDigest = messageDigest2;
                str9 = str8;
                z2 = false;
                pVar = this.monitor;
                if (pVar != null) {
                }
                bArr = new byte[GlobalComponent.getInstance().getByteBufferSize()];
                while (true) {
                    read = this._inputStream.read(bArr);
                    if (read != -1) {
                    }
                    z = true;
                }
                pVar2 = this.monitor;
                if (pVar2 != null) {
                }
                MessageDigest messageDigest3 = messageDigest;
                String str11 = str5;
                DownloadResponse downloadResponse5 = downloadResponse2;
                String str12 = str7;
                GlobalComponent.getInstance().getDatabaseHelper().updateProgress(str3, str11, DownloadModel.create(str3, this._downloadMessage.getDownloadUrl(), this._downloadMessage.getResourceUrl(), str4, str11, this._downloadMessage.getSaveFileName(), this._downloadRequest.getTotalBytes(), this._downloadRequest.getDownloadedBytes(), this._downloadMessage.getDownloadRate(), this._downloadModel.getUsageCounter(), this._downloadMessage.getDownloadResourceType()));
                if (z2) {
                }
                downloadResponse3 = downloadResponse5;
                if (!downloadResponse3.isCancelled()) {
                }
                return downloadResponse3;
            }
            messageDigest = messageDigest2;
            str9 = str8;
            z2 = false;
        }
        pVar = this.monitor;
        if (pVar != null) {
            pVar.d("process_data_start");
        }
        bArr = new byte[GlobalComponent.getInstance().getByteBufferSize()];
        while (true) {
            read = this._inputStream.read(bArr);
            if (read != -1) {
                break;
            }
            this._outputStream.write(bArr, 0, read);
            DownloadRequest downloadRequest = this._downloadRequest;
            downloadRequest.setDownloadedBytes(downloadRequest.getDownloadedBytes() + read);
            if (z2 && messageDigest != null) {
                try {
                    messageDigest.update(bArr, 0, read);
                } catch (Exception unused) {
                }
            }
            this._outputStream.flushAndSync();
            int downloadRate2 = Utils.getDownloadRate(this._downloadRequest.getTotalBytes(), this._downloadRequest.getDownloadedBytes());
            sendProgress(this._downloadRequest, this._downloadMessage, this._downloadRequest.getDownloadedBytes(), this._downloadRequest.getTotalBytes(), downloadRate2);
            p pVar3 = this.monitor;
            if (pVar3 != null) {
                pVar3.c(this._downloadRequest.getDownloadedBytes());
            }
            if (this._downloadMessage.getDownloadRate() != 100 && downloadRate2 >= this._downloadMessage.getDownloadRate()) {
                break;
            }
            if (this._downloadRequest.getStatus() == DownloadStatus.CANCELLED) {
                downloadResponse2 = downloadResponse;
                downloadResponse2.setCancelled(z);
                break;
            }
            z = true;
        }
        pVar2 = this.monitor;
        if (pVar2 != null) {
            pVar2.d("process_data_end");
        }
        MessageDigest messageDigest32 = messageDigest;
        String str112 = str5;
        DownloadResponse downloadResponse52 = downloadResponse2;
        String str122 = str7;
        GlobalComponent.getInstance().getDatabaseHelper().updateProgress(str3, str112, DownloadModel.create(str3, this._downloadMessage.getDownloadUrl(), this._downloadMessage.getResourceUrl(), str4, str112, this._downloadMessage.getSaveFileName(), this._downloadRequest.getTotalBytes(), this._downloadRequest.getDownloadedBytes(), this._downloadMessage.getDownloadRate(), this._downloadModel.getUsageCounter(), this._downloadMessage.getDownloadResourceType()));
        if (z2) {
            try {
            } catch (Throwable th3) {
                th = th3;
                str10 = str122;
            }
            if (this._downloadRequest.getStatus() != DownloadStatus.CANCELLED) {
                p pVar4 = this.monitor;
                if (pVar4 != null) {
                    pVar4.d("validate_data_start");
                }
                String hexEncode = SameMD5.hexEncode(messageDigest32.digest());
                String lowerCase = TextUtils.isEmpty(str9) ? str6 : str9.toLowerCase(Locale.US);
                str10 = str122;
                try {
                    GlobalComponent.getInstance().getLogger().log(str10, hexEncode + " " + lowerCase);
                    p pVar5 = this.monitor;
                    if (pVar5 != null) {
                        pVar5.d("validate_data_end");
                    }
                } catch (Throwable th4) {
                    th = th4;
                    downloadResponse3 = downloadResponse52;
                    GlobalComponent.getInstance().getLogger().log(str10, th.getMessage());
                    if (!downloadResponse3.isCancelled()) {
                    }
                    return downloadResponse3;
                }
                if (!TextUtils.isEmpty(hexEncode) && !hexEncode.equals(lowerCase)) {
                    this._downloadMessage.setMd5VerifyResult(1);
                    downloadResponse3 = downloadResponse52;
                    try {
                        downloadResponse3.setFailed(true);
                        downloadResponse3.setError(new DownloadError(new Exception("File MD5 check fail.")));
                    } catch (Throwable th5) {
                        th = th5;
                        GlobalComponent.getInstance().getLogger().log(str10, th.getMessage());
                        if (!downloadResponse3.isCancelled()) {
                        }
                        return downloadResponse3;
                    }
                    return downloadResponse3;
                }
            }
        }
        downloadResponse3 = downloadResponse52;
        if (!downloadResponse3.isCancelled()) {
            downloadResponse3.setSuccessful(true);
        }
        return downloadResponse3;
    }

    private void handlerException(String str, String str2, String str3, Exception exc) {
        try {
            if (Objects.isNotNull(this._databaseHelper) && Objects.isNotNull(this._downloadRequest)) {
                if (!s0.a().a("r_f_s_d_e", true)) {
                    this._databaseHelper.remove(str3, str2);
                    MBResourceManager.getInstance().deleteFile(new File(this._downloadRequest.getCacheDirectoryPath() + this._downloadMessage.getSaveFileName()));
                }
                this._downloadRequest.setDownloadedBytes(0L);
                this._downloadRequest.setTotalBytes(0L);
            }
        } catch (Exception e) {
            GlobalComponent.getInstance().getLogger().log(IDownloadTask.TAG, e.getMessage());
        }
        this._downloadResponse.setError(exc);
    }

    private DownloadResponse handlerRequestSuccessful(String str, String str2, String str3, a0 a0Var, int i) throws IOException, IllegalAccessException {
        DownloadResponse downloadResponse = new DownloadResponse();
        boolean isSupportResume = isSupportResume(i, this._downloadModel);
        boolean z = (a0Var == null || this._downloadRequest == null || i != 206 || a0Var.d() == null || this._downloadRequest.getTotalBytes() <= 0 || a0Var.d().k() == this._downloadRequest.getTotalBytes() - this._downloadRequest.getDownloadedBytes()) ? false : true;
        if (!isSupportResume && z) {
            this._downloadRequest.setDownloadedBytes(0L);
            this._downloadRequest.setTotalBytes(0L);
            if (Objects.isNotNull(this._databaseHelper)) {
                this._databaseHelper.remove(str3, str2);
            }
            this._downloadModel = null;
            MBResourceManager.getInstance().deleteFile(new File(this._downloadRequest.getCacheDirectoryPath() + this._downloadMessage.getSaveFileName()));
        }
        b0 d = a0Var.d();
        this._responseBody = d;
        if (Objects.isNull(d)) {
            downloadResponse.setError(new IOException(RESPONSE_BODY_IS_NULL));
            this._downloadRequest.setTotalBytes(0L);
            this._downloadRequest.setDownloadedBytes(0L);
            return downloadResponse;
        }
        long k = this._responseBody.k();
        if (k <= 0) {
            downloadResponse.setError(new IOException(RESPONSE_CONTENT_LENGTH_IS_NULL));
            return downloadResponse;
        }
        if (this._downloadRequest.getTotalBytes() == 0) {
            this._downloadRequest.setTotalBytes(k);
        }
        InputStream d2 = this._responseBody.d();
        this._inputStream = d2;
        if (Objects.isNull(d2)) {
            downloadResponse.setError(new IOException(RESPONSE_INPUTSTREAM_IS_NULL));
            return downloadResponse;
        }
        this._downloadMessage.setContentLength(this._downloadRequest.getTotalBytes());
        this._downloadRequest.handlerResponseStartEvent(this._downloadMessage);
        return handleInputStream(str, str2, str3, this._etag);
    }

    private boolean isSupportResume(int i, DownloadModel downloadModel) {
        if (i != 206 || TextUtils.isEmpty(this._etag)) {
            return false;
        }
        return downloadModel == null || TextUtils.equals(this._etag, downloadModel.getEtag());
    }

    private void reportDownloadMessage() {
        boolean isSuccessful = this._downloadResponse.isSuccessful();
        this._downloaderReporter.add("su", Boolean.toString(isSuccessful));
        boolean isCancelled = this._downloadResponse.isCancelled();
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_CANCEL, Boolean.toString(isCancelled));
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RATE, String.valueOf(Utils.getDownloadRate(this._downloadRequest.getTotalBytes(), this._downloadRequest.getDownloadedBytes())));
        if (!isSuccessful && !isCancelled) {
            this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_REASON, this._downloadResponse.getErrorMessage());
        }
        p pVar = this.monitor;
        if (pVar != null) {
            if (isSuccessful) {
                pVar.a(1);
            } else {
                String errorMessage = this._downloadResponse.getErrorMessage();
                DownloadError error = this._downloadResponse.getError();
                Exception exception = error == null ? null : error.getException();
                p pVar2 = this.monitor;
                if (isCancelled) {
                    exception = new IOException("download request canceled");
                }
                pVar2.a(exception);
                boolean equals = TextUtils.equals(errorMessage, "timeout");
                p pVar3 = this.monitor;
                if (equals) {
                    pVar3.a(3);
                } else {
                    pVar3.a(2);
                }
            }
        }
        this._downloaderReporter.build().report();
    }

    private void sendProgress(DownloadRequest downloadRequest, DownloadMessage downloadMessage, long j, long j2, int i) {
        if (downloadRequest.getStatus() != DownloadStatus.CANCELLED) {
            if (downloadMessage != null) {
                downloadMessage.setCurrentDownloadRate(i);
                downloadMessage.setContentLength(j2);
            }
            downloadRequest.handlerProcessEvent(downloadMessage, new DownloadProgress(j, j2, i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x02ba, code lost:
    
        if (r7.h() == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02bc, code lost:
    
        r7.cancel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02bf, code lost:
    
        reportDownloadMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x02c4, code lost:
    
        return r21._downloadResponse;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x025c, code lost:
    
        if (r7.h() == false) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19 */
    @Override // com.mbridge.msdk.foundation.download.core.IDownloadTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DownloadResponse run() {
        String str;
        String str2;
        this._downloadResponse = new DownloadResponse();
        if (this._downloadRequest.getStatus() == DownloadStatus.CANCELLED) {
            this._downloadResponse.setCancelled(true);
            return this._downloadResponse;
        }
        long totalBytes = this._downloadRequest.getTotalBytes();
        long downloadedBytes = this._downloadRequest.getDownloadedBytes();
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_CURRENT_RATE, String.valueOf(Utils.getDownloadRate(totalBytes, downloadedBytes)));
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_DOWNLOAD_BYTES, String.valueOf(downloadedBytes));
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_TOTAL_BYTES, String.valueOf(totalBytes));
        if (totalBytes != 0 && downloadedBytes != 0 && totalBytes == downloadedBytes) {
            this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR_VALUE);
            this._downloaderReporter.build().report();
            this._downloadResponse.setSuccessful(true);
            return this._downloadResponse;
        }
        String saveFileName = this._downloadMessage.getSaveFileName();
        String cacheDirectoryPath = this._downloadRequest.getCacheDirectoryPath();
        String downloadId = this._downloadRequest.getDownloadId();
        String downloadUrl = this._downloadMessage.getDownloadUrl();
        p monitor = this._downloadRequest.getMonitor();
        this.monitor = monitor;
        if (monitor == null && this._downloadRequest.canTrack() && !TextUtils.isEmpty(downloadUrl)) {
            p pVar = new p(d.a((DownloadRequest<?>) this._downloadRequest), C4094gc.a);
            this.monitor = pVar;
            pVar.f(downloadUrl);
            this._downloadRequest.setMonitor(this.monitor);
        }
        long timeout = this._downloadRequest.getTimeout();
        long connectTimeout = this._downloadRequest.getConnectTimeout();
        long readTimeout = this._downloadRequest.getReadTimeout();
        long writeTimeout = this._downloadRequest.getWriteTimeout();
        long requestQueueTime = this._downloadRequest.getRequestQueueTime();
        p pVar2 = this.monitor;
        if (pVar2 != null) {
            pVar2.i(timeout);
            this.monitor.e(connectTimeout);
            this.monitor.f(readTimeout);
            this.monitor.j(writeTimeout);
            p pVar3 = this.monitor;
            str = RESPONSE_CODE;
            pVar3.d("queue");
            this.monitor.a(requestQueueTime);
        } else {
            str = RESPONSE_CODE;
        }
        Locale locale = Locale.ENGLISH;
        String m = vxd.m("bytes=", downloadedBytes, "-");
        try {
            v.b s = GlobalComponent.getInstance().getOkHttpClient().s();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            v a = s.b(connectTimeout, timeUnit).a(new MBridgeHostnameVerifier(downloadUrl)).d(readTimeout, timeUnit).e(writeTimeout, timeUnit).a(Math.max(0L, timeout), timeUnit).a(new OKHTTPEventListener(this.monitor)).b(true).a();
            String str3 = "close";
            y a2 = new y.a().b(downloadUrl).a(new c.a().b().a()).a(CONNECTION, "close").a(Command.HTTP_HEADER_RANGE, m).a(Command.HTTP_HEADER_USER_AGENT).a(Command.HTTP_HEADER_USER_AGENT, Command.DEFAULT_USER_AGENT).a();
            this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_HOST, a2.g().g());
            String str4 = "url";
            this._downloaderReporter.add("url", downloadUrl);
            com.mbridge.msdk.thrid.okhttp.d a3 = a.a(a2);
            a0 a0Var = null;
            try {
                try {
                    a0 d = a3.d();
                    try {
                        try {
                            try {
                                if (Objects.isNull(d) || Objects.isNull(d.d())) {
                                    this._downloadResponse.setError(new IOException(RESPONSE_IS_NULL));
                                    DownloadResponse downloadResponse = this._downloadResponse;
                                    Objects.closeInputStream(this._inputStream);
                                    Objects.closeOutputStream(this._outputStream);
                                    Objects.closeResponse(d);
                                    Objects.closeResponseBody(this._responseBody);
                                    if (!a3.h()) {
                                        a3.cancel();
                                    }
                                    reportDownloadMessage();
                                    return downloadResponse;
                                }
                                int k = d.k();
                                p pVar4 = this.monitor;
                                if (pVar4 != null) {
                                    try {
                                        pVar4.b(k);
                                    } catch (Exception e) {
                                        e = e;
                                        a0Var = d;
                                        str2 = saveFileName;
                                        str4 = cacheDirectoryPath;
                                        str3 = downloadId;
                                        handlerException(str2, str4, str3, e);
                                        Objects.closeInputStream(this._inputStream);
                                        Objects.closeOutputStream(this._outputStream);
                                        Objects.closeResponse(a0Var);
                                        Objects.closeResponseBody(this._responseBody);
                                    }
                                }
                                this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RESPONSE_CODE, String.valueOf(k));
                                if (!d.n()) {
                                    this._downloadResponse.setError(new IOException(str + k));
                                    DownloadResponse downloadResponse2 = this._downloadResponse;
                                    Objects.closeInputStream(this._inputStream);
                                    Objects.closeOutputStream(this._outputStream);
                                    Objects.closeResponse(d);
                                    Objects.closeResponseBody(this._responseBody);
                                    if (!a3.h()) {
                                        a3.cancel();
                                    }
                                    reportDownloadMessage();
                                    return downloadResponse2;
                                }
                                this._etag = d.a(Command.HTTP_HEADER_ETAG, "");
                                try {
                                    this._downloadResponse = handlerRequestSuccessful(saveFileName, cacheDirectoryPath, downloadId, d, k);
                                    Objects.closeInputStream(this._inputStream);
                                    Objects.closeOutputStream(this._outputStream);
                                    Objects.closeResponse(d);
                                    Objects.closeResponseBody(this._responseBody);
                                } catch (Exception e2) {
                                    e = e2;
                                    str3 = downloadId;
                                    str4 = cacheDirectoryPath;
                                    a = saveFileName;
                                    a0Var = d;
                                    str2 = a;
                                    handlerException(str2, str4, str3, e);
                                    Objects.closeInputStream(this._inputStream);
                                    Objects.closeOutputStream(this._outputStream);
                                    Objects.closeResponse(a0Var);
                                    Objects.closeResponseBody(this._responseBody);
                                }
                            } catch (Exception e3) {
                                e = e3;
                            }
                        } catch (Throwable th) {
                            th = th;
                            a0Var = d;
                            Objects.closeInputStream(this._inputStream);
                            Objects.closeOutputStream(this._outputStream);
                            Objects.closeResponse(a0Var);
                            Objects.closeResponseBody(this._responseBody);
                            if (!a3.h()) {
                                a3.cancel();
                            }
                            reportDownloadMessage();
                            throw th;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        a = saveFileName;
                        str4 = cacheDirectoryPath;
                        str3 = downloadId;
                    }
                } catch (Exception e5) {
                    e = e5;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e6) {
            handlerException(saveFileName, cacheDirectoryPath, downloadId, e6);
            this._downloadResponse.setSuccessful(false);
            return this._downloadResponse;
        }
    }
}
