package defpackage;

import com.google.ads.interactivemedia.v3.impl.data.NetworkRequestData;
import com.google.ads.interactivemedia.v3.impl.data.NetworkResponseData;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.mbridge.msdk.foundation.download.Command;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class cwn implements vwn {
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x00af: MOVE (r7 I:??[OBJECT, ARRAY]) = (r0 I:??[OBJECT, ARRAY]) (LINE:176), block:B:56:0x00ae */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d8  */
    @Override // defpackage.vwn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final NetworkResponseData a(NetworkRequestData networkRequestData) {
        HttpURLConnection httpURLConnection;
        IOException e;
        HttpURLConnection httpURLConnection2;
        HttpURLConnection httpURLConnection3 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(networkRequestData.url()).openConnection()));
                try {
                    httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, networkRequestData.userAgent());
                    httpURLConnection.setConnectTimeout(networkRequestData.connectionTimeoutMs());
                    httpURLConnection.setReadTimeout(networkRequestData.readTimeoutMs());
                    if (networkRequestData.requestType() == NetworkRequestData.RequestType.POST) {
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setChunkedStreamingMode(0);
                        String content = networkRequestData.content();
                        if (content != null) {
                            OutputStream outputStream = httpURLConnection.getOutputStream();
                            try {
                                outputStream.write(content.getBytes(StandardCharsets.UTF_8));
                                outputStream.close();
                            } catch (Throwable th) {
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        }
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                        StringBuilder sb = new StringBuilder();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream, StandardCharsets.UTF_8));
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb.append(readLine);
                        }
                        String sb2 = sb.toString();
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        String contentType = httpURLConnection.getContentType();
                        httpURLConnection.disconnect();
                        return NetworkResponseData.forResponse(networkRequestData.id(), sb2, contentType);
                    } catch (Throwable th3) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                } catch (IOException e2) {
                    e = e2;
                    NetworkResponseData forError = e instanceof SocketTimeoutException ? NetworkResponseData.forError(networkRequestData.id(), 101) : NetworkResponseData.forError(networkRequestData.id(), 100);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return forError;
                }
            } catch (Throwable th5) {
                th = th5;
                httpURLConnection3 = httpURLConnection2;
                if (httpURLConnection3 != null) {
                    httpURLConnection3.disconnect();
                }
                throw th;
            }
        } catch (IOException e3) {
            httpURLConnection = null;
            e = e3;
        } catch (Throwable th6) {
            th = th6;
            if (httpURLConnection3 != null) {
            }
            throw th;
        }
    }
}
