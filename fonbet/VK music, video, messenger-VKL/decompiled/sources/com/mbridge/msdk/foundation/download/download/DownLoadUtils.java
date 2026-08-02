package com.mbridge.msdk.foundation.download.download;

import android.webkit.URLUtil;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.foundation.same.task.a;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes13.dex */
public class DownLoadUtils {
    private static final int DOWNLOAD_CONNECTION_TIME_OUT = 20000;
    private static final int DOWNLOAD_READ_TIME_OUT = 30000;
    public static final String END_TAG = "<mbridgeloadend></mbridgeloadend>";
    private static final String TAG = "DownLoadUtils";

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        r3.onFailed("url is error");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void getSourceCodeFromNetUrl(final String str, final H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source, final boolean z) {
        try {
            if (!a1.a(str) && URLUtil.isNetworkUrl(str)) {
                DownloadTask.getInstance().runTask(new a() { // from class: com.mbridge.msdk.foundation.download.download.DownLoadUtils.1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:105:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:37:0x011f A[Catch: all -> 0x011b, TryCatch #12 {all -> 0x011b, blocks: (B:69:0x010a, B:72:0x0110, B:74:0x0113, B:37:0x011f, B:39:0x0125, B:41:0x012b, B:43:0x0133, B:45:0x0137, B:65:0x013d, B:67:0x0141), top: B:68:0x010a }] */
                    /* JADX WARN: Removed duplicated region for block: B:67:0x0141 A[Catch: all -> 0x011b, TRY_LEAVE, TryCatch #12 {all -> 0x011b, blocks: (B:69:0x010a, B:72:0x0110, B:74:0x0113, B:37:0x011f, B:39:0x0125, B:41:0x012b, B:43:0x0133, B:45:0x0137, B:65:0x013d, B:67:0x0141), top: B:68:0x010a }] */
                    /* JADX WARN: Removed duplicated region for block: B:68:0x010a A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:85:0x00fc A[Catch: Exception -> 0x00f8, TRY_LEAVE, TryCatch #3 {Exception -> 0x00f8, blocks: (B:92:0x00f4, B:85:0x00fc), top: B:91:0x00f4 }] */
                    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:99:0x0179 A[Catch: Exception -> 0x0175, TRY_LEAVE, TryCatch #4 {Exception -> 0x0175, blocks: (B:106:0x0171, B:99:0x0179), top: B:105:0x0171 }] */
                    @Override // com.mbridge.msdk.foundation.same.task.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public void runTask() {
                        ByteArrayOutputStream byteArrayOutputStream;
                        InputStream inputStream;
                        ByteArrayOutputStream byteArrayOutputStream2;
                        Object obj;
                        InputStream inputStream2;
                        Object obj2;
                        Exception e;
                        String message;
                        byte[] bArr;
                        String str2;
                        H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source2;
                        Object obj3;
                        boolean z2;
                        Object obj4;
                        InputStream inputStream3 = null;
                        boolean z3 = false;
                        try {
                            H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source3 = H5DownLoadManager.IOnDownLoadH5Source.this;
                            if (iOnDownLoadH5Source3 != null) {
                                iOnDownLoadH5Source3.onStart();
                            }
                            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
                            httpsURLConnection.setHostnameVerifier(new MBridgeHostnameVerifier(str));
                            httpsURLConnection.setReadTimeout(30000);
                            httpsURLConnection.setConnectTimeout(20000);
                            int responseCode = httpsURLConnection.getResponseCode();
                            q0.a(DownLoadUtils.TAG, "response code " + responseCode);
                            if (responseCode == 200) {
                                inputStream2 = httpsURLConnection.getInputStream();
                                try {
                                    byte[] bArr2 = new byte[6144];
                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                    while (true) {
                                        try {
                                            try {
                                                int read = inputStream2.read(bArr2);
                                                if (read == -1) {
                                                    break;
                                                } else {
                                                    byteArrayOutputStream.write(bArr2, 0, read);
                                                }
                                            } catch (Exception e2) {
                                                e = e2;
                                                byteArrayOutputStream2 = null;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            if (inputStream2 != null) {
                                                try {
                                                    inputStream2.close();
                                                } catch (Exception e3) {
                                                    e3.printStackTrace();
                                                    e3.getMessage();
                                                    throw th;
                                                }
                                            }
                                            if (byteArrayOutputStream != null) {
                                                byteArrayOutputStream.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    if (byteArrayOutputStream.toByteArray() != null) {
                                        bArr = byteArrayOutputStream.toByteArray();
                                        try {
                                            obj4 = !z ? new String(bArr) : null;
                                        } catch (Exception e4) {
                                            byteArrayOutputStream2 = bArr;
                                            e = e4;
                                            obj2 = null;
                                            message = e.getMessage();
                                            q0.b(DownLoadUtils.TAG, "getStringFromUrl failed " + e.getLocalizedMessage());
                                            if (inputStream2 != null) {
                                            }
                                            if (byteArrayOutputStream != null) {
                                            }
                                            bArr = byteArrayOutputStream2;
                                            str2 = obj2;
                                            if (z3) {
                                            }
                                            if (z3) {
                                            }
                                            iOnDownLoadH5Source2 = H5DownLoadManager.IOnDownLoadH5Source.this;
                                            if (iOnDownLoadH5Source2 != null) {
                                            }
                                        }
                                    } else {
                                        bArr = null;
                                        obj4 = null;
                                    }
                                    message = "";
                                    z2 = true;
                                    obj3 = obj4;
                                } catch (Exception e5) {
                                    inputStream = inputStream2;
                                    e = e5;
                                    byteArrayOutputStream2 = null;
                                    byteArrayOutputStream = byteArrayOutputStream2;
                                    obj = byteArrayOutputStream;
                                    InputStream inputStream4 = inputStream;
                                    e = e;
                                    inputStream2 = inputStream4;
                                    obj2 = obj;
                                    message = e.getMessage();
                                    q0.b(DownLoadUtils.TAG, "getStringFromUrl failed " + e.getLocalizedMessage());
                                    if (inputStream2 != null) {
                                    }
                                    if (byteArrayOutputStream != null) {
                                    }
                                    bArr = byteArrayOutputStream2;
                                    str2 = obj2;
                                    if (z3) {
                                    }
                                    if (z3) {
                                    }
                                    iOnDownLoadH5Source2 = H5DownLoadManager.IOnDownLoadH5Source.this;
                                    if (iOnDownLoadH5Source2 != null) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    byteArrayOutputStream = null;
                                    inputStream3 = inputStream2;
                                    inputStream2 = inputStream3;
                                    if (inputStream2 != null) {
                                    }
                                    if (byteArrayOutputStream != null) {
                                    }
                                    throw th;
                                }
                            } else {
                                message = "responseCode is " + responseCode;
                                inputStream2 = null;
                                bArr = null;
                                byteArrayOutputStream = null;
                                obj3 = null;
                                z2 = false;
                            }
                            try {
                                try {
                                    httpsURLConnection.disconnect();
                                    if (inputStream2 != null) {
                                        try {
                                            inputStream2.close();
                                        } catch (Exception e6) {
                                            e6.printStackTrace();
                                            message = e6.getMessage();
                                            str2 = obj3;
                                        }
                                    }
                                    if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.close();
                                    }
                                    z3 = z2;
                                    str2 = obj3;
                                } catch (Exception e7) {
                                    ByteArrayOutputStream byteArrayOutputStream3 = bArr;
                                    inputStream = inputStream2;
                                    e = e7;
                                    byteArrayOutputStream2 = byteArrayOutputStream3;
                                    obj = obj3;
                                    InputStream inputStream42 = inputStream;
                                    e = e;
                                    inputStream2 = inputStream42;
                                    obj2 = obj;
                                    message = e.getMessage();
                                    q0.b(DownLoadUtils.TAG, "getStringFromUrl failed " + e.getLocalizedMessage());
                                    if (inputStream2 != null) {
                                        try {
                                            inputStream2.close();
                                        } catch (Exception e8) {
                                            e8.printStackTrace();
                                            message = e8.getMessage();
                                            bArr = byteArrayOutputStream2;
                                            str2 = obj2;
                                            if (z3) {
                                            }
                                            if (z3) {
                                            }
                                            iOnDownLoadH5Source2 = H5DownLoadManager.IOnDownLoadH5Source.this;
                                            if (iOnDownLoadH5Source2 != null) {
                                            }
                                        }
                                    }
                                    if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.close();
                                    }
                                    bArr = byteArrayOutputStream2;
                                    str2 = obj2;
                                    if (z3) {
                                    }
                                    if (z3) {
                                    }
                                    iOnDownLoadH5Source2 = H5DownLoadManager.IOnDownLoadH5Source.this;
                                    if (iOnDownLoadH5Source2 != null) {
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                inputStream3 = inputStream2;
                                inputStream2 = inputStream3;
                                if (inputStream2 != null) {
                                }
                                if (byteArrayOutputStream != null) {
                                }
                                throw th;
                            }
                        } catch (Exception e9) {
                            e = e9;
                            inputStream = null;
                            byteArrayOutputStream2 = null;
                        } catch (Throwable th4) {
                            th = th4;
                            byteArrayOutputStream = null;
                            inputStream2 = inputStream3;
                            if (inputStream2 != null) {
                            }
                            if (byteArrayOutputStream != null) {
                            }
                            throw th;
                        }
                        if (z3) {
                            try {
                                if (z && bArr != null && bArr.length > 0) {
                                    H5DownLoadManager.IOnDownLoadH5Source.this.onSuccess(null, bArr, str);
                                }
                            } catch (Throwable th5) {
                                if (MBridgeConstans.DEBUG) {
                                    th5.printStackTrace();
                                }
                                H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source4 = H5DownLoadManager.IOnDownLoadH5Source.this;
                                if (iOnDownLoadH5Source4 != null) {
                                    try {
                                        iOnDownLoadH5Source4.onFailed(th5.getMessage());
                                        return;
                                    } catch (Exception e10) {
                                        e10.printStackTrace();
                                        return;
                                    }
                                }
                                return;
                            }
                        }
                        if (z3 || !a1.b(str2) || str2.length() <= 0 || !str2.contains(DownLoadUtils.END_TAG)) {
                            iOnDownLoadH5Source2 = H5DownLoadManager.IOnDownLoadH5Source.this;
                            if (iOnDownLoadH5Source2 != null) {
                                iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                            }
                        } else {
                            H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source5 = H5DownLoadManager.IOnDownLoadH5Source.this;
                            if (iOnDownLoadH5Source5 != null) {
                                iOnDownLoadH5Source5.onSuccess(str2, bArr, str);
                            }
                        }
                    }

                    @Override // com.mbridge.msdk.foundation.same.task.a
                    public void cancelTask() {
                    }

                    @Override // com.mbridge.msdk.foundation.same.task.a
                    public void pauseTask(boolean z2) {
                    }
                });
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }
}
