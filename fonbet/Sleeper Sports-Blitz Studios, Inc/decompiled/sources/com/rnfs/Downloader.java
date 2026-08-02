package com.rnfs;

import android.os.AsyncTask;
import android.util.Log;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.google.common.net.HttpHeaders;
import com.rnfs.DownloadParams;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public class Downloader extends AsyncTask<DownloadParams, long[], DownloadResult> {
    private AtomicBoolean mAbort = new AtomicBoolean(false);
    private DownloadParams mParam;
    DownloadResult res;

    protected void onPostExecute(Exception exc) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public DownloadResult doInBackground(DownloadParams... downloadParamsArr) {
        this.mParam = downloadParamsArr[0];
        this.res = new DownloadResult();
        new Thread(new Runnable() { // from class: com.rnfs.Downloader.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Downloader downloader = Downloader.this;
                    downloader.download(downloader.mParam, Downloader.this.res);
                    Downloader.this.mParam.onTaskCompleted.onTaskCompleted(Downloader.this.res);
                } catch (Exception e) {
                    Downloader.this.res.exception = e;
                    Downloader.this.mParam.onTaskCompleted.onTaskCompleted(Downloader.this.res);
                }
            }
        }).start();
        return this.res;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void download(DownloadParams downloadParams, DownloadResult downloadResult) throws Exception {
        HttpURLConnection httpURLConnection;
        BufferedInputStream bufferedInputStream;
        int i;
        long j;
        long j2;
        int i2;
        int i3;
        int i4;
        FileOutputStream fileOutputStream = null;
        try {
            httpURLConnection = (HttpURLConnection) downloadParams.src.openConnection();
            try {
                ReadableMapKeySetIterator keySetIterator = downloadParams.headers.keySetIterator();
                while (keySetIterator.hasNextKey()) {
                    String nextKey = keySetIterator.nextKey();
                    httpURLConnection.setRequestProperty(nextKey, downloadParams.headers.getString(nextKey));
                }
                httpURLConnection.setConnectTimeout(downloadParams.connectionTimeout);
                httpURLConnection.setReadTimeout(downloadParams.readTimeout);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                long contentLength = getContentLength(httpURLConnection);
                if (responseCode != 200 && (responseCode == 301 || responseCode == 302 || responseCode == 307 || responseCode == 308)) {
                    String headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
                    httpURLConnection.disconnect();
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(headerField).openConnection();
                    try {
                        httpURLConnection2.setConnectTimeout(5000);
                        httpURLConnection2.connect();
                        int responseCode2 = httpURLConnection2.getResponseCode();
                        contentLength = getContentLength(httpURLConnection2);
                        responseCode = responseCode2;
                        httpURLConnection = httpURLConnection2;
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream = null;
                        httpURLConnection = httpURLConnection2;
                        if (fileOutputStream != null) {
                        }
                        if (bufferedInputStream != null) {
                        }
                        if (httpURLConnection != null) {
                        }
                        throw th;
                    }
                }
                if (responseCode < 200 || responseCode >= 300) {
                    bufferedInputStream = null;
                } else {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    HashMap hashMap = new HashMap();
                    Iterator<Map.Entry<String, List<String>>> it = headerFields.entrySet().iterator();
                    while (true) {
                        i = 0;
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry<String, List<String>> next = it.next();
                        String key = next.getKey();
                        String str = next.getValue().get(0);
                        if (key != null && str != null) {
                            hashMap.put(key, str);
                        }
                    }
                    if (this.mParam.onDownloadBegin != null) {
                        this.mParam.onDownloadBegin.onDownloadBegin(responseCode, contentLength, hashMap);
                    }
                    bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream(), 8192);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(downloadParams.dest);
                        try {
                            byte[] bArr = new byte[8192];
                            boolean z = this.mParam.onDownloadProgress != null;
                            long j3 = 0;
                            long j4 = 0;
                            double d = 0.0d;
                            while (true) {
                                int read = bufferedInputStream.read(bArr);
                                int i5 = i;
                                if (read != -1) {
                                    if (this.mAbort.get()) {
                                        throw new Exception("Download has been aborted");
                                    }
                                    boolean z2 = z;
                                    long j5 = j4 + read;
                                    if (!z2) {
                                        j = contentLength;
                                        j2 = j5;
                                        i2 = read;
                                    } else if (downloadParams.progressInterval > 0) {
                                        long currentTimeMillis = System.currentTimeMillis();
                                        if (currentTimeMillis - j3 > downloadParams.progressInterval) {
                                            long[] jArr = new long[2];
                                            jArr[i5] = contentLength;
                                            jArr[1] = j5;
                                            publishProgress(jArr);
                                            j3 = currentTimeMillis;
                                        }
                                        j = contentLength;
                                        i4 = read;
                                        i3 = i5;
                                        j2 = j5;
                                        fileOutputStream2.write(bArr, i3, i4);
                                        j4 = j2;
                                        z = z2;
                                        i = i3;
                                        contentLength = j;
                                    } else if (downloadParams.progressDivider <= 0.0f) {
                                        long[] jArr2 = new long[2];
                                        jArr2[i5] = contentLength;
                                        jArr2[1] = j5;
                                        publishProgress(jArr2);
                                        j = contentLength;
                                        i2 = read;
                                        j2 = j5;
                                    } else {
                                        i2 = read;
                                        j2 = j5;
                                        double round = Math.round((j2 * 100.0d) / contentLength);
                                        j = contentLength;
                                        if (round % downloadParams.progressDivider == 0.0d && (round != d || j2 == j)) {
                                            Log.d("Downloader", "EMIT: " + String.valueOf(round) + ", TOTAL:" + String.valueOf(j2));
                                            long[] jArr3 = new long[2];
                                            jArr3[i5] = j;
                                            jArr3[1] = j2;
                                            publishProgress(jArr3);
                                            d = round;
                                        }
                                    }
                                    i3 = i5;
                                    i4 = i2;
                                    fileOutputStream2.write(bArr, i3, i4);
                                    j4 = j2;
                                    z = z2;
                                    i = i3;
                                    contentLength = j;
                                } else {
                                    fileOutputStream2.flush();
                                    downloadResult.bytesWritten = j4;
                                    fileOutputStream = fileOutputStream2;
                                    break;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            if (bufferedInputStream != null) {
                                bufferedInputStream.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                downloadResult.statusCode = responseCode;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th4) {
                th = th4;
                bufferedInputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection = null;
            bufferedInputStream = null;
        }
    }

    private long getContentLength(HttpURLConnection httpURLConnection) {
        return httpURLConnection.getContentLengthLong();
    }

    protected void stop() {
        this.mAbort.set(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onProgressUpdate(long[]... jArr) {
        super.onProgressUpdate((Object[]) jArr);
        if (this.mParam.onDownloadProgress != null) {
            DownloadParams.OnDownloadProgress onDownloadProgress = this.mParam.onDownloadProgress;
            long[] jArr2 = jArr[0];
            onDownloadProgress.onDownloadProgress(jArr2[0], jArr2[1]);
        }
    }
}
