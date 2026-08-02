package com.reactnativecompressor.Utils;

import android.util.Log;
import androidx.media3.common.MimeTypes;
import com.facebook.react.bridge.ReactApplicationContext;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: Downloader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/reactnativecompressor/Utils/Downloader;", "", "<init>", "()V", "Companion", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Downloader {
    private static final String TAG = "react-native-compessor";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int[] downloadCompression = {0};

    /* compiled from: Downloader.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u0014\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/reactnativecompressor/Utils/Downloader$Companion;", "", "<init>", "()V", "TAG", "", "downloadMediaWithProgress", "mediaUrl", "uuid", "progressDivider", "", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "downloadCompression", "", "getDownloadCompression", "()[I", "sendProgressUpdate", "", "progress", "sendErrorResult", "error", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String downloadMediaWithProgress(String mediaUrl, final String uuid, final int progressDivider, final ReactApplicationContext reactContext) {
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            Intrinsics.checkNotNullParameter(reactContext, "reactContext");
            getDownloadCompression()[0] = 0;
            OkHttpClient okHttpClient = new OkHttpClient();
            Request.Builder builder = new Request.Builder();
            Intrinsics.checkNotNull(mediaUrl);
            Request build = builder.url(mediaUrl).build();
            final Semaphore semaphore = new Semaphore(0);
            final AtomicReference atomicReference = new AtomicReference(null);
            okHttpClient.newCall(build).enqueue(new Callback() { // from class: com.reactnativecompressor.Utils.Downloader$Companion$downloadMediaWithProgress$1
                /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x00df A[Catch: all -> 0x0125, LOOP:0: B:25:0x00d8->B:27:0x00df, LOOP_END, TryCatch #0 {all -> 0x0125, blocks: (B:21:0x0095, B:24:0x00b2, B:25:0x00d8, B:27:0x00df, B:29:0x00f8), top: B:20:0x0095 }] */
                /* JADX WARN: Removed duplicated region for block: B:28:0x00f8 A[SYNTHETIC] */
                @Override // okhttp3.Callback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void onResponse(Call call, Response response) throws IOException {
                    String str;
                    File file;
                    String str2;
                    int i;
                    FileOutputStream fileOutputStream;
                    BufferedInputStream bufferedInputStream;
                    byte[] bArr;
                    long contentLength;
                    long j;
                    int read;
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response, "response");
                    if (response.isSuccessful()) {
                        ResponseBody body = response.body();
                        if (body == null) {
                            return;
                        }
                        String header$default = Response.header$default(response, "Content-Type", null, 2, null);
                        try {
                            try {
                                if (header$default != null) {
                                    int hashCode = header$default.hashCode();
                                    if (hashCode != -1487394660) {
                                        if (hashCode != -879258763) {
                                            if (hashCode == 1331848029 && header$default.equals(MimeTypes.VIDEO_MP4)) {
                                                str = RRWebVideoEvent.REPLAY_CONTAINER;
                                            }
                                        } else if (header$default.equals(MimeTypes.IMAGE_PNG)) {
                                            str = "png";
                                        }
                                    } else if (header$default.equals("image/jpeg")) {
                                        str = "jpg";
                                    }
                                    file = new File(ReactApplicationContext.this.getCacheDir(), UUID.randomUUID() + "." + str);
                                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                                    str2 = uuid;
                                    i = progressDivider;
                                    AtomicReference<String> atomicReference2 = atomicReference;
                                    fileOutputStream = fileOutputStream2;
                                    bufferedInputStream = new BufferedInputStream(body.byteStream());
                                    bArr = new byte[4096];
                                    contentLength = body.getContentLength();
                                    j = 0;
                                    if (contentLength <= 0) {
                                        contentLength = 31457280;
                                    }
                                    Log.d("react-native-compessor", "0 totalBytesRead " + contentLength);
                                    Log.d("react-native-compessor", response + " responseBody " + body);
                                    while (true) {
                                        read = bufferedInputStream.read(bArr);
                                        if (read == -1) {
                                            fileOutputStream.write(bArr, 0, read);
                                            long j2 = j + read;
                                            j = j2;
                                            Downloader.INSTANCE.sendProgressUpdate((int) ((j2 / contentLength) * 100), str2, i);
                                            file = file;
                                        } else {
                                            fileOutputStream.flush();
                                            String str3 = "file://" + file.getAbsolutePath();
                                            MediaCache.INSTANCE.addCompletedImagePath(str3);
                                            atomicReference2.set(str3);
                                            Unit unit = Unit.INSTANCE;
                                            CloseableKt.closeFinally(fileOutputStream2, null);
                                            return;
                                        }
                                    }
                                }
                                fileOutputStream = fileOutputStream2;
                                bufferedInputStream = new BufferedInputStream(body.byteStream());
                                bArr = new byte[4096];
                                contentLength = body.getContentLength();
                                j = 0;
                                if (contentLength <= 0) {
                                }
                                Log.d("react-native-compessor", "0 totalBytesRead " + contentLength);
                                Log.d("react-native-compessor", response + " responseBody " + body);
                                while (true) {
                                    read = bufferedInputStream.read(bArr);
                                    if (read == -1) {
                                    }
                                    fileOutputStream.write(bArr, 0, read);
                                    long j22 = j + read;
                                    j = j22;
                                    Downloader.INSTANCE.sendProgressUpdate((int) ((j22 / contentLength) * 100), str2, i);
                                    file = file;
                                }
                            } finally {
                            }
                            FileOutputStream fileOutputStream22 = new FileOutputStream(file);
                            str2 = uuid;
                            i = progressDivider;
                            AtomicReference<String> atomicReference22 = atomicReference;
                        } catch (IOException e) {
                            e.printStackTrace();
                            Downloader.INSTANCE.sendErrorResult(e.getMessage(), uuid);
                            return;
                        } finally {
                            semaphore.release();
                        }
                        str = "unknown";
                        file = new File(ReactApplicationContext.this.getCacheDir(), UUID.randomUUID() + "." + str);
                    } else {
                        Downloader.INSTANCE.sendErrorResult("Failed to download media: " + response.message(), uuid);
                    }
                }

                @Override // okhttp3.Callback
                public void onFailure(Call call, IOException e) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(e, "e");
                    e.printStackTrace();
                    Downloader.INSTANCE.sendErrorResult(e.getMessage(), uuid);
                    semaphore.release();
                }
            });
            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return (String) atomicReference.get();
        }

        public final int[] getDownloadCompression() {
            return Downloader.downloadCompression;
        }

        static /* synthetic */ void sendProgressUpdate$default(Companion companion, int i, String str, int i2, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                i2 = 0;
            }
            companion.sendProgressUpdate(i, str, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void sendProgressUpdate(int progress, String uuid, int progressDivider) {
            int round = Math.round(progress);
            if (progressDivider == 0 || (round % progressDivider == 0 && round > getDownloadCompression()[0])) {
                double d = progress / 100.0d;
                EventEmitterHandler.INSTANCE.emitDownloadProgress(d, uuid);
                Log.d(Downloader.TAG, "downloadProgress: " + d);
                getDownloadCompression()[0] = round;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void sendErrorResult(String error, String uuid) {
            EventEmitterHandler.INSTANCE.emitDownloadProgressError(uuid, error);
        }
    }
}
