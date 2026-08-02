package com.plaid.internal;

import android.net.Network;
import android.os.Build;
import com.plaid.internal.InterfaceC3731r1;
import com.twilio.voice.VoiceURLConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import javax.net.SocketFactory;

/* renamed from: com.plaid.internal.i7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3657i7 implements InterfaceC3731r1 {

    /* renamed from: a, reason: collision with root package name */
    public final C3784x0 f40683a;

    /* renamed from: b, reason: collision with root package name */
    public final C3636g4 f40684b;

    /* renamed from: c, reason: collision with root package name */
    public int f40685c;

    public C3657i7(C3636g4 c3636g4) {
        W3 w32 = Z3.f39803a;
        this.f40683a = new C3784x0("socket-http-client");
        this.f40685c = 0;
        this.f40684b = c3636g4;
    }

    @Override // com.plaid.internal.InterfaceC3731r1
    public final InterfaceC3731r1.b a(InterfaceC3731r1.a aVar) {
        boolean z10;
        Socket socket;
        OutputStream outputStream;
        URL url;
        Socket createSocket;
        C3749t1 c3749t1;
        C3784x0 c3784x0 = this.f40683a;
        StringBuilder sb2 = new StringBuilder("request ");
        sb2.append(aVar.f41012b ? VoiceURLConnection.METHOD_TYPE_POST : "GET");
        sb2.append(" ");
        sb2.append(aVar.f41011a);
        W3 w32 = W3.DEBUG;
        c3784x0.a(w32, sb2.toString(), new Object[0]);
        try {
            z10 = new URL(aVar.f41011a).getProtocol().equals("https");
        } catch (MalformedURLException unused) {
            z10 = false;
        }
        if (z10) {
            throw new IOException("https not supported by this httpclient");
        }
        int i10 = aVar.f41013c;
        if (i10 <= -1) {
            i10 = this.f40685c;
        }
        try {
            url = new URL(aVar.f41011a);
            Network network = this.f40684b.f40625a;
            InetAddress byName = network.getByName(url.getHost());
            this.f40683a.a(w32, "host " + url.getHost() + " resolved to " + byName, new Object[0]);
            SocketFactory socketFactory = network.getSocketFactory();
            int port = url.getPort();
            if (port == -1) {
                port = url.getDefaultPort();
            }
            createSocket = socketFactory.createSocket(byName, port);
        } catch (Throwable th2) {
            th = th2;
            socket = null;
        }
        try {
            createSocket.setSoTimeout(i10);
            OutputStream outputStream2 = createSocket.getOutputStream();
            try {
                if (aVar.f41012b) {
                    c3749t1 = new C3749t1(url, VoiceURLConnection.METHOD_TYPE_POST);
                    C3615e1 c3615e1 = C3615e1.f40575c;
                    c3749t1.f41070c.put("accept".toLowerCase(), (String) c3615e1.a("http.accept.post", "application/json", String.class));
                    c3749t1.f41070c.put("accept".toLowerCase(), (String) c3615e1.a("http.accept.post", "application/json", String.class));
                    c3749t1.f41073f = aVar.f41014d;
                    c3749t1.f41074g = !c3615e1.a("http.no-gzip");
                } else {
                    c3749t1 = new C3749t1(url, "GET");
                    c3749t1.f41070c.put("accept".toLowerCase(), (String) C3615e1.f40575c.a("http.accept.get", "application/json, */*", String.class));
                }
                if (!C3615e1.f40575c.a("http.no-user-agent")) {
                    StringBuilder sb3 = new StringBuilder("Prove SDK;version=2.9.1;os=Android ");
                    sb3.append(Build.VERSION.RELEASE);
                    sb3.append(";device=");
                    String str = Build.MANUFACTURER;
                    String str2 = Build.MODEL;
                    if (!str2.toLowerCase().startsWith(str.toLowerCase())) {
                        str2 = str + " " + str2;
                    }
                    sb3.append(str2);
                    c3749t1.f41070c.put("user-agent".toLowerCase(), sb3.toString());
                }
                c3749t1.a(outputStream2);
                InputStream inputStream = createSocket.getInputStream();
                C3758u1 a10 = C3758u1.a(inputStream);
                inputStream.close();
                InterfaceC3731r1.b bVar = new InterfaceC3731r1.b(a10.f41108a, a10.f41109b, a10.f41111d, a10.f41110c);
                AbstractC3767v1.a(outputStream2);
                AbstractC3767v1.a(createSocket);
                return bVar;
            } catch (Throwable th3) {
                th = th3;
                outputStream = outputStream2;
                socket = createSocket;
                AbstractC3767v1.a(outputStream);
                AbstractC3767v1.a(socket);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            socket = createSocket;
            outputStream = null;
            AbstractC3767v1.a(outputStream);
            AbstractC3767v1.a(socket);
            throw th;
        }
    }

    @Override // com.plaid.internal.InterfaceC3731r1
    public final EnumC3801z isConnected() {
        return null;
    }

    @Override // com.plaid.internal.InterfaceC3731r1
    public final void a() {
        try {
            C3636g4 c3636g4 = this.f40684b;
            if (c3636g4.f40628d) {
                return;
            }
            c3636g4.f40628d = true;
            c3636g4.f40626b.run();
        } catch (Exception e10) {
            this.f40683a.a(e10, "couldn't release the network");
        }
    }
}
