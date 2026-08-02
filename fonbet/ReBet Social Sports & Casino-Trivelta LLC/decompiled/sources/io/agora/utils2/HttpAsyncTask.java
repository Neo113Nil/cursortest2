package io.agora.utils2;

import android.os.AsyncTask;
import android.util.Base64;
import android.util.Log;
import com.twilio.voice.VoiceURLConnection;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zendesk.core.Constants;

/* loaded from: classes3.dex */
class HttpAsyncTask extends AsyncTask<HttpAsyncTaskParam, Void, Void> {
    private static final int RESPONSE_COMPLETED = 1;
    private static final int RESPONSE_COMPLETED_REASON_NONE = 0;
    private static final int RESPONSE_COMPLETED_REASON_OTHER_ERROR = 4;
    private static final int RESPONSE_COMPLETED_REASON_SOCKET_TIMEOUT = 3;
    private static final int RESPONSE_COMPLETED_REASON_SUCCESS = 1;
    private static final int RESPONSE_COMPLETED_REASON_UNKNOWN_HOST = 2;
    private static final int RESPONSE_ON_GOING = 0;
    private static final int SIZE_FOR_CALLBACK = 16384;
    private static final String TAG = "HttpAsyncTask";
    private long nativeHandle;

    public HttpAsyncTask(long j10) {
        this.nativeHandle = j10;
    }

    private static native int nativeNotifyResponse(long j10, int i10, int i11, int i12, byte[] bArr, int i13, Map<String, String> map);

    private int notifyNativeResponse(int i10, int i11, int i12, byte[] bArr, Map<String, String> map) {
        return nativeNotifyResponse(this.nativeHandle, i10, i11, i12, bArr, bArr != null ? bArr.length : 0, map);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:(5:64|(1:66)(1:70)|67|68|69)|72|73|(2:118|119)(1:75)|76|(3:77|78|(3:80|(5:82|83|84|85|(2:91|92)(3:87|88|89))(1:107)|90)(2:108|109))|93|94|95|96|68|69) */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01db, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01dc, code lost:
    
        r17 = r10;
        r9 = null;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01f8 A[Catch: Exception -> 0x002f, SocketTimeoutException -> 0x0227, UnknownHostException -> 0x022e, TRY_ENTER, TryCatch #9 {SocketTimeoutException -> 0x0227, UnknownHostException -> 0x022e, Exception -> 0x002f, blocks: (B:8:0x001d, B:10:0x0028, B:11:0x002c, B:12:0x0037, B:14:0x003b, B:15:0x0043, B:17:0x0049, B:19:0x005f, B:21:0x0063, B:23:0x0069, B:25:0x006d, B:27:0x0073, B:28:0x00a9, B:30:0x00ad, B:32:0x00b3, B:33:0x00ba, B:35:0x00cc, B:36:0x00d4, B:38:0x00de, B:39:0x00e1, B:41:0x00e5, B:42:0x00f6, B:44:0x0105, B:45:0x010d, B:47:0x0113, B:54:0x0135, B:57:0x0139, B:59:0x0152, B:61:0x0156, B:64:0x015b, B:66:0x0161, B:68:0x0202, B:71:0x016e, B:95:0x01d5, B:101:0x01f8, B:115:0x020b, B:116:0x020e, B:127:0x0032), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x020b A[Catch: Exception -> 0x002f, SocketTimeoutException -> 0x0227, UnknownHostException -> 0x022e, TryCatch #9 {SocketTimeoutException -> 0x0227, UnknownHostException -> 0x022e, Exception -> 0x002f, blocks: (B:8:0x001d, B:10:0x0028, B:11:0x002c, B:12:0x0037, B:14:0x003b, B:15:0x0043, B:17:0x0049, B:19:0x005f, B:21:0x0063, B:23:0x0069, B:25:0x006d, B:27:0x0073, B:28:0x00a9, B:30:0x00ad, B:32:0x00b3, B:33:0x00ba, B:35:0x00cc, B:36:0x00d4, B:38:0x00de, B:39:0x00e1, B:41:0x00e5, B:42:0x00f6, B:44:0x0105, B:45:0x010d, B:47:0x0113, B:54:0x0135, B:57:0x0139, B:59:0x0152, B:61:0x0156, B:64:0x015b, B:66:0x0161, B:68:0x0202, B:71:0x016e, B:95:0x01d5, B:101:0x01f8, B:115:0x020b, B:116:0x020e, B:127:0x0032), top: B:7:0x001d }] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Void doInBackground(HttpAsyncTaskParam... httpAsyncTaskParamArr) {
        int i10;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        DataInputStream dataInputStream;
        HashMap hashMap;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        DataInputStream dataInputStream2;
        String str;
        int i11 = 1;
        if (httpAsyncTaskParamArr.length < 1) {
            notifyNativeResponse(404, 1, 4, null, null);
            return null;
        }
        int i12 = 0;
        HttpAsyncTaskParam httpAsyncTaskParam = httpAsyncTaskParamArr[0];
        try {
            URL url = new URL(httpAsyncTaskParam.fullUrl);
            Proxy proxy = httpAsyncTaskParam.httpProxy;
            HttpURLConnection httpURLConnection = (HttpURLConnection) (proxy != null ? url.openConnection(proxy) : url.openConnection());
            HashMap<String, String> hashMap2 = httpAsyncTaskParam.headers;
            if (hashMap2 != null) {
                for (Map.Entry<String, String> entry : hashMap2.entrySet()) {
                    httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
            }
            String str2 = httpAsyncTaskParam.user;
            if (str2 != null && !str2.isEmpty() && (str = httpAsyncTaskParam.pass) != null && !str.isEmpty()) {
                String encodeToString = Base64.encodeToString((httpAsyncTaskParam.user + ":" + httpAsyncTaskParam.pass).getBytes(), 0);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Basic ");
                sb2.append(encodeToString);
                httpURLConnection.setRequestProperty(Constants.AUTHORIZATION_HEADER, sb2.toString());
            }
            String str3 = httpAsyncTaskParam.agent;
            if (str3 != null && !str3.isEmpty()) {
                httpURLConnection.setRequestProperty(Constants.USER_AGENT_HEADER_KEY, httpAsyncTaskParam.agent);
            }
            httpURLConnection.setRequestMethod(httpAsyncTaskParam.method);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(false);
            int i13 = httpAsyncTaskParam.timeout_millsec;
            if (i13 > 0) {
                httpURLConnection.setConnectTimeout(i13);
                httpURLConnection.setReadTimeout(httpAsyncTaskParam.timeout_millsec);
            }
            if (VoiceURLConnection.METHOD_TYPE_POST.equals(httpAsyncTaskParam.method)) {
                httpURLConnection.setDoOutput(true);
            }
            if (httpAsyncTaskParam.body != null) {
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.write(httpAsyncTaskParam.body);
                dataOutputStream.flush();
            }
            int responseCode = httpURLConnection.getResponseCode();
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            HashMap hashMap3 = new HashMap();
            if (headerFields != null) {
                for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                    String key = entry2.getKey();
                    String str4 = entry2.getValue().get(0);
                    if (key == null) {
                        key = "";
                    }
                    if (str4 == null) {
                        str4 = "";
                    }
                    hashMap3.put(key, str4);
                }
            }
            Log.i(TAG, "resp code: " + responseCode);
            int i14 = 0;
            try {
                if (responseCode / 100 != 2 && responseCode / 100 != 3 && responseCode / 100 != 4) {
                    String responseMessage = httpURLConnection.getResponseMessage();
                    bArr4 = responseMessage != null ? responseMessage.getBytes() : null;
                    hashMap = hashMap3;
                    notifyNativeResponse(responseCode, 1, i14, bArr4, hashMap);
                    return null;
                }
                if (responseCode / 100 == 4) {
                    try {
                        dataInputStream2 = new DataInputStream(httpURLConnection.getErrorStream());
                    } catch (Exception e10) {
                        e = e10;
                        dataInputStream = null;
                        bArr2 = null;
                        hashMap = hashMap3;
                        Log.e(TAG, "got exception " + e.toString());
                        if (dataInputStream != null) {
                        }
                        responseCode = 404;
                        i11 = 4;
                        bArr3 = bArr2;
                        bArr4 = bArr3;
                        i14 = i11;
                        notifyNativeResponse(responseCode, 1, i14, bArr4, hashMap);
                        return null;
                    }
                } else {
                    dataInputStream2 = new DataInputStream(httpURLConnection.getInputStream());
                }
                dataInputStream = dataInputStream2;
                bArr2 = null;
                while (true) {
                    try {
                        try {
                            int read = dataInputStream.read(bArr);
                            if (read <= 0) {
                                hashMap = hashMap3;
                                break;
                            }
                            byteArrayOutputStream.write(bArr, i12, read);
                            if (byteArrayOutputStream.size() >= 16384) {
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                hashMap = hashMap3;
                                try {
                                    if (notifyNativeResponse(responseCode, 0, 0, byteArray, hashMap) != 0) {
                                        bArr2 = byteArray;
                                        break;
                                    }
                                    byteArrayOutputStream.reset();
                                    bArr2 = byteArray;
                                    hashMap3 = hashMap;
                                } catch (Exception e11) {
                                    e = e11;
                                    bArr2 = byteArray;
                                    Log.e(TAG, "got exception " + e.toString());
                                    if (dataInputStream != null) {
                                    }
                                    responseCode = 404;
                                    i11 = 4;
                                    bArr3 = bArr2;
                                    bArr4 = bArr3;
                                    i14 = i11;
                                    notifyNativeResponse(responseCode, 1, i14, bArr4, hashMap);
                                    return null;
                                }
                            }
                            i12 = 0;
                        } catch (Exception e12) {
                            e = e12;
                            hashMap = hashMap3;
                            Log.e(TAG, "got exception " + e.toString());
                            if (dataInputStream != null) {
                                dataInputStream.close();
                            }
                            responseCode = 404;
                            i11 = 4;
                            bArr3 = bArr2;
                            bArr4 = bArr3;
                            i14 = i11;
                            notifyNativeResponse(responseCode, 1, i14, bArr4, hashMap);
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (dataInputStream != null) {
                            dataInputStream.close();
                        }
                        throw th;
                    }
                }
                bArr3 = byteArrayOutputStream.toByteArray();
                dataInputStream.close();
                bArr4 = bArr3;
                i14 = i11;
                notifyNativeResponse(responseCode, 1, i14, bArr4, hashMap);
                return null;
            } catch (Throwable th3) {
                th = th3;
                dataInputStream = null;
                if (dataInputStream != null) {
                }
                throw th;
            }
            byteArrayOutputStream = new ByteArrayOutputStream();
            bArr = new byte[4096];
        } catch (SocketTimeoutException unused) {
            Log.e(TAG, "got time out exception");
            i10 = 3;
            notifyNativeResponse(404, 1, i10, null, null);
            return null;
        } catch (UnknownHostException unused2) {
            Log.e(TAG, "got unknown host exception");
            i10 = 2;
            notifyNativeResponse(404, 1, i10, null, null);
            return null;
        } catch (Exception e13) {
            Log.e(TAG, "got exception " + e13.toString());
            i10 = 4;
            notifyNativeResponse(404, 1, i10, null, null);
            return null;
        }
    }
}
