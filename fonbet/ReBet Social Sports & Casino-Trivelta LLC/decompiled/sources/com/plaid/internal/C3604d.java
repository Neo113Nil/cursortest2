package com.plaid.internal;

import android.os.Build;
import com.plaid.internal.InterfaceC3731r1;
import com.twilio.voice.VoiceURLConnection;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import zendesk.core.Constants;

/* renamed from: com.plaid.internal.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3604d implements InterfaceC3731r1 {

    /* renamed from: a, reason: collision with root package name */
    public final C3784x0 f40547a;

    /* renamed from: b, reason: collision with root package name */
    public final C3636g4 f40548b;

    /* renamed from: c, reason: collision with root package name */
    public int f40549c;

    public C3604d(C3636g4 c3636g4) {
        W3 w32 = Z3.f39803a;
        this.f40547a = new C3784x0("http-client");
        this.f40549c = 0;
        this.f40548b = c3636g4;
    }

    @Override // com.plaid.internal.InterfaceC3731r1
    public final void a() {
        try {
            C3636g4 c3636g4 = this.f40548b;
            if (c3636g4.f40628d) {
                return;
            }
            c3636g4.f40628d = true;
            c3636g4.f40626b.run();
        } catch (Exception e10) {
            this.f40547a.a(e10, "couldn't release the network");
        }
    }

    @Override // com.plaid.internal.InterfaceC3731r1
    public final EnumC3801z isConnected() {
        C3636g4 c3636g4 = this.f40548b;
        return c3636g4.f40628d ? EnumC3801z.NO : c3636g4.f40627c;
    }

    @Override // com.plaid.internal.InterfaceC3731r1
    public final InterfaceC3731r1.b a(InterfaceC3731r1.a aVar) {
        InputStream errorStream;
        byte[] bytes;
        C3784x0 c3784x0 = this.f40547a;
        StringBuilder sb2 = new StringBuilder("request ");
        sb2.append(aVar.f41012b ? VoiceURLConnection.METHOD_TYPE_POST : "GET");
        sb2.append(" ");
        sb2.append(aVar.f41011a);
        c3784x0.a(W3.DEBUG, sb2.toString(), new Object[0]);
        int i10 = aVar.f41013c;
        if (i10 <= -1) {
            i10 = this.f40549c;
        }
        HttpURLConnection httpURLConnection = null;
        OutputStream outputStream = null;
        String str = null;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) this.f40548b.f40625a.openConnection(new URL(aVar.f41011a));
            try {
                httpURLConnection2.setInstanceFollowRedirects(false);
                httpURLConnection2.setConnectTimeout(i10);
                httpURLConnection2.setReadTimeout(i10);
                httpURLConnection2.setRequestProperty("Connection", "close");
                httpURLConnection2.setRequestProperty("Cache-Control", "no-cache");
                C3615e1 c3615e1 = C3615e1.f40575c;
                if (!c3615e1.a("http.no-user-agent")) {
                    StringBuilder sb3 = new StringBuilder("Prove SDK;version=2.9.1;os=Android ");
                    sb3.append(Build.VERSION.RELEASE);
                    sb3.append(";device=");
                    String str2 = Build.MANUFACTURER;
                    String str3 = Build.MODEL;
                    if (!str3.toLowerCase().startsWith(str2.toLowerCase())) {
                        str3 = str2 + " " + str3;
                    }
                    sb3.append(str3);
                    httpURLConnection2.setRequestProperty("user-agent", sb3.toString());
                }
                if (aVar.f41012b) {
                    httpURLConnection2.setRequestMethod(VoiceURLConnection.METHOD_TYPE_POST);
                    httpURLConnection2.setRequestProperty(Constants.ACCEPT_HEADER, (String) c3615e1.a("http.accept.post", "application/json", String.class));
                    httpURLConnection2.setRequestProperty("Content-Type", "application/json");
                    httpURLConnection2.setDoOutput(true);
                    boolean a10 = c3615e1.a("http.no-gzip");
                    if (!a10) {
                        bytes = AbstractC3767v1.a(aVar.f41014d);
                    } else {
                        bytes = aVar.f41014d.getBytes(StandardCharsets.UTF_8);
                    }
                    if (!a10) {
                        httpURLConnection2.setRequestProperty("Content-Encoding", "gzip");
                    }
                    httpURLConnection2.setRequestProperty("Content-Length", String.valueOf(bytes.length));
                    try {
                        OutputStream outputStream2 = httpURLConnection2.getOutputStream();
                        try {
                            outputStream2.write(bytes, 0, bytes.length);
                            AbstractC3767v1.a(outputStream2);
                        } catch (Throwable th2) {
                            th = th2;
                            outputStream = outputStream2;
                            AbstractC3767v1.a(outputStream);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    httpURLConnection2.setRequestProperty(Constants.ACCEPT_HEADER, (String) c3615e1.a("http.accept.get", "application/json, */*", String.class));
                }
                httpURLConnection2.connect();
                try {
                    errorStream = httpURLConnection2.getInputStream();
                } catch (FileNotFoundException unused) {
                    errorStream = httpURLConnection2.getErrorStream();
                }
                int responseCode = httpURLConnection2.getResponseCode();
                String responseMessage = httpURLConnection2.getResponseMessage();
                if (errorStream != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = errorStream.read(bArr, 0, 1024);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    byteArrayOutputStream.flush();
                    str = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
                }
                InterfaceC3731r1.b bVar = new InterfaceC3731r1.b(responseCode, responseMessage, str, httpURLConnection2.getHeaderFields());
                httpURLConnection2.disconnect();
                return bVar;
            } catch (Throwable th4) {
                th = th4;
                httpURLConnection = httpURLConnection2;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
