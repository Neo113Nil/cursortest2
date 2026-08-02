package zg;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.nio.CharBuffer;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.net.ssl.SSLContext;
import kotlin.jvm.internal.ByteCompanionObject;
import ug.AbstractC6573a;
import vg.C6689a;

/* loaded from: classes4.dex */
public class d extends AbstractC6991a {

    /* renamed from: q, reason: collision with root package name */
    public static SSLContext f69125q;

    /* renamed from: d, reason: collision with root package name */
    public URI f69126d;

    /* renamed from: g, reason: collision with root package name */
    public String f69129g;

    /* renamed from: h, reason: collision with root package name */
    public int f69130h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f69131i;

    /* renamed from: e, reason: collision with root package name */
    public CharBuffer f69127e = CharBuffer.allocate(1024);

    /* renamed from: f, reason: collision with root package name */
    public String f69128f = null;

    /* renamed from: j, reason: collision with root package name */
    public int f69132j = 0;

    /* renamed from: k, reason: collision with root package name */
    public Socket f69133k = null;

    /* renamed from: l, reason: collision with root package name */
    public InputStream f69134l = null;

    /* renamed from: m, reason: collision with root package name */
    public OutputStream f69135m = null;

    /* renamed from: n, reason: collision with root package name */
    public final SecureRandom f69136n = new SecureRandom();

    /* renamed from: o, reason: collision with root package name */
    public c f69137o = null;

    /* renamed from: p, reason: collision with root package name */
    public boolean f69138p = false;

    public class a {

        /* renamed from: a, reason: collision with root package name */
        public byte f69139a;
        private byte[] data;

        public a(d dVar, int i10, String str) {
            this(i10, str, true);
        }

        public byte[] a() {
            return this.data;
        }

        public final byte[] b(byte[] bArr, boolean z10) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length + 10);
                byteArrayOutputStream.write((byte) (this.f69139a | ByteCompanionObject.MIN_VALUE));
                int length = bArr.length;
                if (length < 126) {
                    if (z10) {
                        length |= 128;
                    }
                    byteArrayOutputStream.write((byte) length);
                } else {
                    int i10 = 255;
                    if (length <= 65535) {
                        byteArrayOutputStream.write((byte) (z10 ? 254 : 126));
                        byteArrayOutputStream.write(new byte[]{(byte) (length >>> 8), (byte) (length & 255)});
                    } else if (length > 65535) {
                        if (!z10) {
                            i10 = 127;
                        }
                        byteArrayOutputStream.write((byte) i10);
                        byteArrayOutputStream.write(new byte[]{(byte) (length >>> 56), (byte) (length >>> 48), (byte) (length >>> 40), (byte) (length >>> 32), (byte) (length >>> 24), (byte) (length >>> 16), (byte) (length >>> 8), (byte) length});
                    }
                }
                if (z10) {
                    byte[] r10 = d.this.r(4);
                    byteArrayOutputStream.write(r10);
                    for (int i11 = 0; i11 < bArr.length; i11++) {
                        bArr[i11] = (byte) (bArr[i11] ^ r10[i11 % 4]);
                    }
                }
                byteArrayOutputStream.write(bArr);
                return byteArrayOutputStream.toByteArray();
            } catch (Exception e10) {
                throw new C6689a("Unable to prepare write frame : " + e10.getMessage());
            }
        }

        public a(int i10, String str, boolean z10) {
            try {
                this.f69139a = (byte) i10;
                this.data = b(str.getBytes("UTF-8"), z10);
            } catch (C6689a e10) {
                throw e10;
            } catch (Exception e11) {
                throw new C6689a("Unable to prepare write frame : " + e11.getMessage());
            }
        }
    }

    static {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            f69125q = sSLContext;
            sSLContext.init(null, null, null);
        } catch (KeyManagementException | NoSuchAlgorithmException e10) {
            Log.e("WebSocket", Log.getStackTraceString(e10));
        }
    }

    public d(String str) {
        this.f69129g = null;
        this.f69130h = -1;
        this.f69131i = false;
        try {
            URI uri = new URI(str);
            this.f69126d = uri;
            if (!uri.getScheme().equals("ws") && !this.f69126d.getScheme().equals("wss")) {
                throw new C6689a("Invalid url");
            }
            this.f69131i = this.f69126d.getScheme().equals("wss");
            int port = this.f69126d.getPort();
            this.f69130h = port;
            if (port == -1) {
                if (this.f69131i) {
                    this.f69130h = 443;
                } else {
                    this.f69130h = 80;
                }
            }
            this.f69129g = this.f69126d.getHost();
        } catch (URISyntaxException unused) {
            throw new C6689a("Invalid Url");
        } catch (Exception e10) {
            throw new C6689a("Exception : " + e10.getMessage());
        }
    }

    @Override // zg.AbstractC6991a
    public void a(String str, String str2) {
        if (this.f69128f == null) {
            this.f69128f = str + "=" + str2;
            return;
        }
        this.f69128f += "; " + str + "=" + str2;
    }

    @Override // zg.AbstractC6991a
    public void c() {
        try {
            t(new a(this, 8, "").a());
        } catch (Exception unused) {
        }
    }

    @Override // zg.AbstractC6991a
    public void d() {
        if (this.f69132j != 0) {
            return;
        }
        if (this.f69129g == null) {
            throw new C6689a("Invalid host " + this.f69129g);
        }
        if (this.f69130h >= 0) {
            p();
            q();
        } else {
            throw new C6689a("Invalid port " + this.f69130h);
        }
    }

    @Override // zg.AbstractC6991a
    public boolean f() {
        return false;
    }

    @Override // zg.AbstractC6991a
    public void i(boolean z10) {
        this.f69123b = z10;
    }

    @Override // zg.AbstractC6991a
    public void j(c cVar) {
        this.f69137o = cVar;
    }

    @Override // zg.AbstractC6991a
    public boolean m(String str) {
        throw new C6689a("Unsupported Operation for this connection");
    }

    public final void o(String str, String str2) {
        this.f69127e.put(str);
        this.f69127e.put(": ");
        this.f69127e.put(str2);
        this.f69127e.put("\r\n");
    }

    public final void p() {
        try {
            if (this.f69131i) {
                this.f69133k = f69125q.getSocketFactory().createSocket(this.f69129g, this.f69130h);
            } else {
                this.f69133k = new Socket(this.f69129g, this.f69130h);
            }
            this.f69134l = this.f69133k.getInputStream();
            this.f69135m = this.f69133k.getOutputStream();
        } catch (UnknownHostException e10) {
            throw new C6689a("Invalid Host : " + e10);
        } catch (IOException e11) {
            throw new C6689a("IO Exception : " + e11);
        } catch (SecurityException e12) {
            throw new C6689a("Secruity Exception : " + e12);
        } catch (Exception e13) {
            throw new C6689a("Exception : " + e13.getMessage());
        }
    }

    public final void q() {
        try {
            this.f69127e.clear();
            String path = this.f69126d.getPath();
            if (path == null) {
                path = "/";
            } else if (this.f69126d.getQuery() != null) {
                path = path + "?" + this.f69126d.getRawQuery();
            }
            this.f69127e.put("GET " + path + " HTTP/1.1\r\n");
            o("Host", this.f69129g);
            o("Upgrade", "websocket");
            o("Connection", "Upgrade");
            o("Sec-WebSocket-Version", "13");
            o("Sec-WebSocket-Key", AbstractC6573a.b(r(16)));
            HashMap a10 = this.f69137o.a();
            for (String str : a10.keySet()) {
                String str2 = (String) a10.get(str);
                if (str2 != null && !str2.trim().isEmpty()) {
                    o(str, str2);
                }
            }
            String str3 = this.f69128f;
            if (str3 != null) {
                o("Cookie", str3);
            }
            this.f69127e.put("\r\n");
            this.f69127e.flip();
            t(this.f69127e.toString().getBytes("UTF-8"));
            byte[] bArr = new byte[1024];
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            do {
                bArr[i10] = s();
                int i11 = i10 + 1;
                if (bArr[i10] == 10 && bArr[i10 - 1] == 13) {
                    String str4 = new String(bArr, "UTF-8");
                    if (str4.trim().equals("")) {
                        if (arrayList.size() == 0) {
                            throw new C6689a("Insuffcient response header");
                        }
                        try {
                            int parseInt = Integer.parseInt(((String) arrayList.remove(0)).substring(9, 12));
                            if (parseInt != 101) {
                                throw new C6689a("Invalid status code : " + parseInt);
                            }
                            try {
                                HashMap hashMap = new HashMap();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    String[] split = ((String) it.next()).split(": ", 2);
                                    hashMap.put(split[0], split[1]);
                                }
                                if (((String) hashMap.get("Upgrade")).toLowerCase().equals("websocket") && ((String) hashMap.get("Connection")).equals("Upgrade")) {
                                    return;
                                } else {
                                    throw new C6689a("Headers on upgrade not found");
                                }
                            } catch (C6689a e10) {
                                throw e10;
                            } catch (Exception e11) {
                                throw new C6689a("Unable to verify response header : " + e11.getMessage());
                            }
                        } catch (C6689a e12) {
                            throw e12;
                        } catch (Exception unused) {
                            throw new C6689a("Invalid Status message in response");
                        }
                    }
                    arrayList.add(str4.trim());
                    bArr = new byte[1024];
                    i10 = 0;
                } else {
                    i10 = i11;
                }
                if (i10 >= 1020) {
                    throw new C6689a("Header too long : " + new String(bArr, "UTF-8"));
                }
            } while (arrayList.size() <= 10);
            throw new C6689a("Too many headers : " + arrayList);
        } catch (IOException e13) {
            throw new C6689a("IOException : " + e13.getMessage());
        } catch (C6689a e14) {
            throw e14;
        } catch (Exception e15) {
            throw new C6689a("Exception doHandshake : " + e15.getMessage());
        }
    }

    public final byte[] r(int i10) {
        byte[] bArr = new byte[i10];
        this.f69136n.nextBytes(bArr);
        return bArr;
    }

    public final byte s() {
        try {
            byte read = (byte) this.f69134l.read();
            if (read != -1) {
                return read;
            }
            throw new C6689a("Stream Closed");
        } catch (IOException unused) {
            throw new C6689a("IOException on read");
        } catch (C6689a e10) {
            throw e10;
        }
    }

    public final void t(byte[] bArr) {
        try {
            this.f69135m.write(bArr);
            this.f69135m.flush();
        } catch (IOException unused) {
            throw new C6689a("IOException on write");
        }
    }

    @Override // zg.AbstractC6991a
    public void e() {
    }

    @Override // zg.AbstractC6991a
    public void g() {
    }

    @Override // zg.AbstractC6991a
    public void h() {
    }

    @Override // zg.AbstractC6991a
    public void k() {
    }

    @Override // zg.AbstractC6991a
    public void l() {
    }
}
