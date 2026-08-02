package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.download.Command;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ood implements xj3 {
    public static final Map P;
    public static final Logger Q;
    public final SocketFactory A;
    public final SSLSocketFactory B;
    public int C;
    public final LinkedList D;
    public final hk3 E;
    public oia F;
    public boolean G;
    public long H;
    public long I;
    public final kac J;
    public final int K;
    public final j0l L;
    public final m8a M;
    public final ki9 N;
    public final int O;
    public final InetSocketAddress a;
    public final String b;
    public final String c;
    public final Random d;
    public final tmi e;
    public final int f;
    public final sg9 g;
    public yih h;
    public zd6 i;
    public axn j;
    public final Object k;
    public final f8a l;
    public int m;
    public final HashMap n;
    public final Executor o;
    public final k6h p;
    public final ScheduledExecutorService q;
    public final int r;
    public int s;
    public nod t;
    public sm0 u;
    public xei v;
    public boolean w;
    public ch9 x;
    public boolean y;
    public boolean z;

    static {
        EnumMap enumMap = new EnumMap(up5.class);
        xei xeiVar = xei.l;
        enumMap.put((EnumMap) up5.NO_ERROR, (up5) xeiVar.h("No error: A GRPC status of OK should have been sent"));
        enumMap.put((EnumMap) up5.PROTOCOL_ERROR, (up5) xeiVar.h("Protocol error"));
        enumMap.put((EnumMap) up5.INTERNAL_ERROR, (up5) xeiVar.h(UnityAdsConstants.Messages.MSG_INTERNAL_ERROR));
        enumMap.put((EnumMap) up5.FLOW_CONTROL_ERROR, (up5) xeiVar.h("Flow control error"));
        enumMap.put((EnumMap) up5.STREAM_CLOSED, (up5) xeiVar.h("Stream closed"));
        enumMap.put((EnumMap) up5.FRAME_TOO_LARGE, (up5) xeiVar.h("Frame too large"));
        enumMap.put((EnumMap) up5.REFUSED_STREAM, (up5) xei.m.h("Refused stream"));
        enumMap.put((EnumMap) up5.CANCEL, (up5) xei.f.h("Cancelled"));
        enumMap.put((EnumMap) up5.COMPRESSION_ERROR, (up5) xeiVar.h("Compression error"));
        enumMap.put((EnumMap) up5.CONNECT_ERROR, (up5) xeiVar.h("Connect error"));
        enumMap.put((EnumMap) up5.ENHANCE_YOUR_CALM, (up5) xei.j.h("Enhance your calm"));
        enumMap.put((EnumMap) up5.INADEQUATE_SECURITY, (up5) xei.i.h("Inadequate security"));
        P = Collections.unmodifiableMap(enumMap);
        Q = Logger.getLogger(ood.class.getName());
    }

    public ood(fod fodVar, InetSocketAddress inetSocketAddress, String str, sm0 sm0Var, ki9 ki9Var, kac kacVar) {
        l49 l49Var = n49.r;
        sg9 sg9Var = new sg9();
        this.d = new Random();
        Object obj = new Object();
        this.k = obj;
        this.n = new HashMap();
        this.C = 0;
        this.D = new LinkedList();
        this.M = new m8a(this, 2);
        this.O = 30000;
        z1a.y(inetSocketAddress, "address");
        this.a = inetSocketAddress;
        this.b = str;
        this.r = fodVar.g;
        this.f = fodVar.k;
        Executor executor = fodVar.b;
        z1a.y(executor, "executor");
        this.o = executor;
        this.p = new k6h(fodVar.b);
        ScheduledExecutorService scheduledExecutorService = fodVar.d;
        z1a.y(scheduledExecutorService, "scheduledExecutorService");
        this.q = scheduledExecutorService;
        this.m = 3;
        this.A = SocketFactory.getDefault();
        this.B = fodVar.e;
        hk3 hk3Var = fodVar.f;
        z1a.y(hk3Var, "connectionSpec");
        this.E = hk3Var;
        z1a.y(l49Var, "stopwatchFactory");
        this.e = l49Var;
        this.g = sg9Var;
        this.c = "grpc-java-okhttp/1.62.2";
        this.N = ki9Var;
        this.J = kacVar;
        this.K = fodVar.l;
        this.L = new j0l(2);
        this.l = f8a.a(ood.class, inetSocketAddress.toString());
        sm0 sm0Var2 = sm0.b;
        rm0 rm0Var = j72.e;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(rm0Var, sm0Var);
        for (Map.Entry entry : sm0Var2.a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((rm0) entry.getKey(), entry.getValue());
            }
        }
        this.u = new sm0(identityHashMap);
        synchronized (obj) {
        }
    }

    public static String n(xk0 xk0Var) {
        long j;
        x52 x52Var = new x52();
        do {
            long read = xk0Var.read(x52Var, 1L);
            j = x52Var.b;
            if (read == -1) {
                throw new EOFException("\\n not found: " + x52Var.l0(j).i());
            }
        } while (x52Var.t(j - 1) != 10);
        if (Long.MAX_VALUE < 0) {
            ogj.h(vxd.l(Long.MAX_VALUE, "limit < 0: "));
            return null;
        }
        long j2 = Long.MAX_VALUE == Long.MAX_VALUE ? Long.MAX_VALUE : Long.MAX_VALUE + 1;
        long C = x52Var.C((byte) 10, 0L, j2);
        if (C != -1) {
            return e.c(x52Var, C);
        }
        if (j2 < x52Var.b && x52Var.t(j2 - 1) == 13 && x52Var.t(j2) == 10) {
            return e.c(x52Var, j2);
        }
        x52 x52Var2 = new x52();
        x52Var.p(x52Var2, 0L, Math.min(32L, x52Var.b));
        a70.k(x52Var2.l0(x52Var2.b).i(), Math.min(x52Var.b, Long.MAX_VALUE));
        return null;
    }

    public static xei u(up5 up5Var) {
        xei xeiVar = (xei) P.get(up5Var);
        if (xeiVar != null) {
            return xeiVar;
        }
        return xei.g.h("Unknown http2 error code: " + up5Var.a);
    }

    @Override // defpackage.asb
    public final void a(xei xeiVar) {
        synchronized (this.k) {
            try {
                if (this.v != null) {
                    return;
                }
                this.v = xeiVar;
                this.h.q(xeiVar);
                t();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.e8a
    public final f8a b() {
        return this.l;
    }

    @Override // defpackage.asb
    public final Runnable c(zrb zrbVar) {
        this.h = (yih) zrbVar;
        if (this.G) {
            oia oiaVar = new oia(new t9d(this), this.q, this.H, this.I);
            this.F = oiaVar;
            synchronized (oiaVar) {
            }
        }
        tk0 tk0Var = new tk0(this.p, this);
        sg9 sg9Var = this.g;
        kof kofVar = new kof(tk0Var);
        sg9Var.getClass();
        rk0 rk0Var = new rk0(tk0Var, new qg9(kofVar));
        synchronized (this.k) {
            zd6 zd6Var = new zd6(this, rk0Var);
            this.i = zd6Var;
            this.j = new axn(this, zd6Var);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.p.execute(new lv4(6, this, countDownLatch, tk0Var));
        try {
            o();
            countDownLatch.countDown();
            this.p.execute(new kac(this, 4));
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    @Override // defpackage.dy2
    public final yx2 d(ujg ujgVar, qic qicVar, jh2 jh2Var, cy2[] cy2VarArr) {
        lod lodVar;
        z1a.y(ujgVar, "method");
        sm0 sm0Var = this.u;
        uei ueiVar = new uei(cy2VarArr);
        for (cy2 cy2Var : cy2VarArr) {
            cy2Var.n(sm0Var, qicVar);
        }
        synchronized (this.k) {
            lodVar = new lod(ujgVar, qicVar, this.i, this, this.j, this.k, this.r, this.f, this.b, this.c, ueiVar, this.L, jh2Var);
        }
        return lodVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0097 A[ADDED_TO_REGION, EDGE_INSN: B:132:0x0097->B:54:0x0097 BREAK  A[LOOP:2: B:30:0x0093->B:52:0x0161], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a0  */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k1d e(InetSocketAddress inetSocketAddress, String str, String str2) {
        String substring;
        k1d k1dVar;
        ?? lowerCase;
        int i;
        InetAddress byAddress;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        char c = 0;
        b10 b10Var = new b10(c, 6);
        b10Var.b = -1;
        b10Var.c = HttpRequest.DEFAULT_SCHEME;
        String hostName = inetSocketAddress.getHostName();
        if (hostName == null) {
            a70.p("host == null");
            return null;
        }
        int length = hostName.length();
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                substring = hostName.substring(0, length);
                break;
            }
            if (hostName.charAt(i8) != '%') {
                i8++;
            } else {
                x52 x52Var = new x52();
                x52Var.f1(0, i8, hostName);
                while (i8 < length) {
                    int codePointAt = hostName.codePointAt(i8);
                    if (codePointAt == 37 && (i7 = i8 + 2) < length) {
                        int a = kl9.a(hostName.charAt(i8 + 1));
                        int a2 = kl9.a(hostName.charAt(i7));
                        if (a != -1 && a2 != -1) {
                            x52Var.Y0((a << 4) + a2);
                            i8 = i7;
                            i8 += Character.charCount(codePointAt);
                        }
                    }
                    x52Var.h1(codePointAt);
                    i8 += Character.charCount(codePointAt);
                }
                substring = x52Var.E0();
            }
        }
        if (!substring.startsWith(U3.j.d) || !substring.endsWith(U3.j.e)) {
            k1dVar = null;
            try {
                lowerCase = IDN.toASCII(substring).toLowerCase(Locale.US);
                if (!lowerCase.isEmpty()) {
                    for (int i9 = 0; i9 < lowerCase.length(); i9++) {
                        char charAt = lowerCase.charAt(i9);
                        if (charAt > 31 && charAt < 127 && " #%/:?@[\\]".indexOf(charAt) == -1) {
                        }
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            lowerCase = k1dVar;
            break;
        }
        int length2 = substring.length() - 1;
        int i10 = 16;
        byte[] bArr = new byte[16];
        int i11 = 0;
        int i12 = -1;
        int i13 = -1;
        int i14 = 1;
        k1dVar = null;
        while (i14 < length2) {
            if (i11 == i10) {
                break;
            }
            int i15 = i14 + 2;
            char c2 = 2;
            if (i15 <= length2 && substring.regionMatches(i14, "::", c, 2)) {
                if (i12 != -1) {
                    break;
                }
                i11 += 2;
                if (i15 == length2) {
                    i12 = i11;
                    i = 16;
                    break;
                }
                i14 = i15;
                i12 = i11;
                i4 = i14;
                i5 = 0;
                while (i4 < length2) {
                }
                i6 = i4 - i14;
                if (i6 == 0) {
                }
            } else if (i11 == 0) {
                i4 = i14;
                i5 = 0;
                while (i4 < length2) {
                }
                i6 = i4 - i14;
                if (i6 == 0) {
                    break;
                }
                int i16 = i11 + 1;
                bArr[i11] = (byte) (255 & (i5 >>> 8));
                i11 += 2;
                bArr[i16] = (byte) (i5 & 255);
                i13 = i14;
                i14 = i4;
                c = 0;
                i10 = 16;
            } else if (substring.regionMatches(i14, ":", c, 1)) {
                i14++;
                i4 = i14;
                i5 = 0;
                while (i4 < length2) {
                    int a3 = kl9.a(substring.charAt(i4));
                    char c3 = c2;
                    if (a3 == -1) {
                        break;
                    }
                    i5 = (i5 << 4) + a3;
                    i4++;
                    c2 = c3;
                }
                i6 = i4 - i14;
                if (i6 == 0 || i6 > 4) {
                    break;
                    break;
                }
                int i162 = i11 + 1;
                bArr[i11] = (byte) (255 & (i5 >>> 8));
                i11 += 2;
                bArr[i162] = (byte) (i5 & 255);
                i13 = i14;
                i14 = i4;
                c = 0;
                i10 = 16;
            } else if (substring.regionMatches(i14, ".", c, 1)) {
                int i17 = i11 - 2;
                int i18 = i17;
                int i19 = i13;
                loop7: while (true) {
                    if (i19 >= length2) {
                        int i20 = i12;
                        if (i18 == i11 + 2) {
                            i11 += 2;
                            i12 = i20;
                        }
                    } else {
                        if (i18 == 16) {
                            break;
                        }
                        if (i18 != i17) {
                            if (substring.charAt(i19) != '.') {
                                break;
                            }
                            i19++;
                        }
                        int i21 = i19;
                        int i22 = 0;
                        while (true) {
                            i2 = i17;
                            if (i21 >= length2) {
                                i3 = i12;
                                break;
                            }
                            char charAt2 = substring.charAt(i21);
                            i3 = i12;
                            if (charAt2 < '0' || charAt2 > '9') {
                                break;
                            }
                            if ((i22 == 0 && i19 != i21) || ((i22 * 10) + charAt2) - 48 > 255) {
                                break loop7;
                            }
                            i21++;
                            i17 = i2;
                            i12 = i3;
                        }
                        if (i21 - i19 == 0) {
                            break;
                        }
                        bArr[i18] = (byte) i22;
                        i19 = i21;
                        i18++;
                        i17 = i2;
                        i12 = i3;
                    }
                }
            }
        }
        i = i10;
        try {
            if (i11 != i) {
                if (i12 != -1) {
                    int i23 = i11 - i12;
                    System.arraycopy(bArr, i12, bArr, 16 - i23, i23);
                    Arrays.fill(bArr, i12, (16 - i11) + i12, (byte) 0);
                }
                byAddress = null;
                if (byAddress != null) {
                    byte[] address = byAddress.getAddress();
                    int i24 = 16;
                    if (address.length != 16) {
                        ogj.b();
                        return null;
                    }
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = -1;
                    while (i25 < address.length) {
                        int i28 = i25;
                        while (i28 < i24 && address[i28] == 0 && address[i28 + 1] == 0) {
                            i28 += 2;
                            i24 = 16;
                        }
                        int i29 = i28 - i25;
                        if (i29 > i26) {
                            i27 = i25;
                            i26 = i29;
                        }
                        i25 = i28 + 2;
                        i24 = 16;
                    }
                    x52 x52Var2 = new x52();
                    int i30 = 0;
                    while (i30 < address.length) {
                        if (i30 == i27) {
                            x52Var2.Y0(58);
                            i30 += i26;
                            if (i30 == 16) {
                                x52Var2.Y0(58);
                            }
                        } else {
                            if (i30 > 0) {
                                x52Var2.Y0(58);
                            }
                            x52Var2.a1(((address[i30] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (address[i30 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
                            i30 += 2;
                        }
                    }
                    lowerCase = x52Var2.E0();
                }
                lowerCase = k1dVar;
                break;
            }
            byAddress = InetAddress.getByAddress(bArr);
            if (byAddress != null) {
            }
            lowerCase = k1dVar;
            break;
        } catch (UnknownHostException unused2) {
            ogj.b();
            return null;
        }
        if (lowerCase == 0) {
            a70.p("unexpected host: ".concat(hostName));
            return k1dVar;
        }
        b10Var.d = lowerCase;
        int port = inetSocketAddress.getPort();
        if (port <= 0 || port > 65535) {
            a70.p(ljg.j(port, "unexpected port: "));
            return k1dVar;
        }
        b10Var.b = port;
        if (((String) b10Var.d) == null) {
            a70.r("host == null");
            return k1dVar;
        }
        kl9 kl9Var = new kl9(b10Var);
        k1d k1dVar2 = new k1d(25, false);
        k1dVar2.c = new k89(0, false);
        k1dVar2.b = kl9Var;
        k1dVar2.t("Host", kl9Var.a + ":" + kl9Var.b);
        k1dVar2.t(Command.HTTP_HEADER_USER_AGENT, this.c);
        if (str != null && str2 != null) {
            try {
                byte[] bytes = (str + ":" + str2).getBytes("ISO-8859-1");
                gc2 gc2Var = gc2.d;
                k1dVar2.t("Proxy-Authorization", "Basic " + q1f.r(bytes).d());
            } catch (UnsupportedEncodingException unused3) {
                ogj.b();
                return k1dVar;
            }
        }
        if (((kl9) k1dVar2.b) != null) {
            return new k1d(k1dVar2);
        }
        a70.r("url == null");
        return k1dVar;
    }

    public final Socket f(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) {
        String str3;
        int i;
        String str4;
        Socket socket = null;
        try {
            InetAddress address = inetSocketAddress2.getAddress();
            SocketFactory socketFactory = this.A;
            Socket createSocket = address != null ? socketFactory.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : socketFactory.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            try {
                createSocket.setTcpNoDelay(true);
                createSocket.setSoTimeout(this.O);
                qoh qohVar = new qoh(createSocket);
                InputStream inputStream = createSocket.getInputStream();
                inputStream.getClass();
                xk0 xk0Var = new xk0(qohVar, new xk0(inputStream, qohVar));
                qoh qohVar2 = new qoh(createSocket);
                OutputStream outputStream = createSocket.getOutputStream();
                outputStream.getClass();
                kof kofVar = new kof(new wk0(qohVar2, new wk0(outputStream, qohVar2)));
                k1d e = e(inetSocketAddress, str, str2);
                String[] strArr = ((n89) e.c).b;
                kl9 kl9Var = (kl9) e.b;
                Locale locale = Locale.US;
                kofVar.S("CONNECT " + kl9Var.a + ":" + kl9Var.b + " HTTP/1.1");
                kofVar.S("\r\n");
                int length = strArr.length / 2;
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = i2 * 2;
                    if (i3 >= 0 && i3 < strArr.length) {
                        str3 = strArr[i3];
                        kofVar.S(str3);
                        kofVar.S(": ");
                        i = i3 + 1;
                        if (i >= 0 && i < strArr.length) {
                            str4 = strArr[i];
                            kofVar.S(str4);
                            kofVar.S("\r\n");
                        }
                        str4 = null;
                        kofVar.S(str4);
                        kofVar.S("\r\n");
                    }
                    str3 = null;
                    kofVar.S(str3);
                    kofVar.S(": ");
                    i = i3 + 1;
                    if (i >= 0) {
                        str4 = strArr[i];
                        kofVar.S(str4);
                        kofVar.S("\r\n");
                    }
                    str4 = null;
                    kofVar.S(str4);
                    kofVar.S("\r\n");
                }
                kofVar.S("\r\n");
                kofVar.flush();
                b10 z = b10.z(n(xk0Var));
                int i4 = z.b;
                while (!n(xk0Var).equals("")) {
                }
                if (i4 >= 200 && i4 < 300) {
                    createSocket.setSoTimeout(0);
                    return createSocket;
                }
                x52 x52Var = new x52();
                try {
                    createSocket.shutdownOutput();
                    xk0Var.read(x52Var, 1024L);
                } catch (IOException e2) {
                    x52Var.g1("Unable to read body: " + e2.toString());
                }
                try {
                    createSocket.close();
                } catch (IOException unused) {
                }
                Locale locale2 = Locale.US;
                throw new zei(xei.m.h("Response returned from proxy was not successful (expected 2xx, got " + i4 + " " + ((String) z.d) + "). Response body:\n" + x52Var.E0()));
            } catch (IOException e3) {
                e = e3;
                socket = createSocket;
                if (socket != null) {
                    n49.b(socket);
                }
                throw new zei(xei.m.h("Failed trying to connect with proxy").g(e));
            }
        } catch (IOException e4) {
            e = e4;
        }
    }

    public final void g(int i, xei xeiVar, zx2 zx2Var, boolean z, up5 up5Var, qic qicVar) {
        synchronized (this.k) {
            try {
                lod lodVar = (lod) this.n.remove(Integer.valueOf(i));
                if (lodVar != null) {
                    if (up5Var != null) {
                        this.i.h(i, up5.CANCEL);
                    }
                    if (xeiVar != null) {
                        kod kodVar = lodVar.l;
                        if (qicVar == null) {
                            qicVar = new qic();
                        }
                        kodVar.l(xeiVar, zx2Var, z, qicVar);
                    }
                    if (!r()) {
                        t();
                        l(lodVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.xj3
    public final sm0 getAttributes() {
        return this.u;
    }

    public final qwd[] h() {
        qwd[] qwdVarArr;
        qwd qwdVar;
        synchronized (this.k) {
            qwdVarArr = new qwd[this.n.size()];
            Iterator it = this.n.values().iterator();
            int i = 0;
            while (it.hasNext()) {
                int i2 = i + 1;
                kod kodVar = ((lod) it.next()).l;
                synchronized (kodVar.v) {
                    qwdVar = kodVar.I;
                }
                qwdVarArr[i] = qwdVar;
                i = i2;
            }
        }
        return qwdVarArr;
    }

    public final int i() {
        URI a = n49.a(this.b);
        return a.getPort() != -1 ? a.getPort() : this.a.getPort();
    }

    public final zei j() {
        synchronized (this.k) {
            try {
                xei xeiVar = this.v;
                if (xeiVar != null) {
                    return new zei(xeiVar);
                }
                return new zei(xei.m.h("Connection closed"));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean k(int i) {
        boolean z;
        synchronized (this.k) {
            if (i < this.m) {
                z = true;
                if ((i & 1) == 1) {
                }
            }
            z = false;
        }
        return z;
    }

    public final void l(lod lodVar) {
        if (this.z && this.D.isEmpty() && this.n.isEmpty()) {
            this.z = false;
            oia oiaVar = this.F;
            if (oiaVar != null) {
                synchronized (oiaVar) {
                    int i = oiaVar.d;
                    if (i == 2 || i == 3) {
                        i = 1;
                        oiaVar.d = 1;
                    }
                    if (i == 4) {
                        oiaVar.d = 5;
                    }
                }
            }
        }
        if (lodVar.c) {
            this.M.N(lodVar, false);
        }
    }

    public final void m(Exception exc) {
        q(0, up5.INTERNAL_ERROR, xei.m.g(exc));
    }

    public final void o() {
        synchronized (this.k) {
            try {
                zd6 zd6Var = this.i;
                zd6Var.getClass();
                try {
                    zd6Var.b.h();
                } catch (IOException e) {
                    zd6Var.a.m(e);
                }
                e7a e7aVar = new e7a(3, false);
                e7aVar.j(7, this.f);
                zd6 zd6Var2 = this.i;
                zd6Var2.c.t(2, e7aVar);
                try {
                    zd6Var2.b.m(e7aVar);
                } catch (IOException e2) {
                    zd6Var2.a.m(e2);
                }
                if (this.f > 65535) {
                    this.i.i(0, r1 - 65535);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p(xei xeiVar) {
        a(xeiVar);
        synchronized (this.k) {
            try {
                Iterator it = this.n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    it.remove();
                    ((lod) entry.getValue()).l.m(xeiVar, false, new qic());
                    l((lod) entry.getValue());
                }
                for (lod lodVar : this.D) {
                    lodVar.l.l(xeiVar, zx2.d, true, new qic());
                    l(lodVar);
                }
                this.D.clear();
                t();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q(int i, up5 up5Var, xei xeiVar) {
        synchronized (this.k) {
            try {
                if (this.v == null) {
                    this.v = xeiVar;
                    this.h.q(xeiVar);
                }
                if (up5Var != null && !this.w) {
                    this.w = true;
                    this.i.f(up5Var, new byte[0]);
                }
                Iterator it = this.n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((Integer) entry.getKey()).intValue() > i) {
                        it.remove();
                        ((lod) entry.getValue()).l.l(xeiVar, zx2.b, false, new qic());
                        l((lod) entry.getValue());
                    }
                }
                for (lod lodVar : this.D) {
                    lodVar.l.l(xeiVar, zx2.d, true, new qic());
                    l(lodVar);
                }
                this.D.clear();
                t();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean r() {
        boolean z = false;
        while (true) {
            LinkedList linkedList = this.D;
            if (linkedList.isEmpty() || this.n.size() >= this.C) {
                break;
            }
            s((lod) linkedList.poll());
            z = true;
        }
        return z;
    }

    public final void s(lod lodVar) {
        boolean g;
        z1a.D("StreamId already assigned", lodVar.l.J == -1);
        this.n.put(Integer.valueOf(this.m), lodVar);
        if (!this.z) {
            this.z = true;
            oia oiaVar = this.F;
            if (oiaVar != null) {
                oiaVar.b();
            }
        }
        if (lodVar.c) {
            this.M.N(lodVar, true);
        }
        kod kodVar = lodVar.l;
        int i = this.m;
        z1a.B(i, "the stream has been started with id %s", kodVar.J == -1);
        kodVar.J = i;
        axn axnVar = kodVar.E;
        kodVar.I = new qwd(axnVar, i, axnVar.a, kodVar);
        kod kodVar2 = kodVar.K.l;
        z1a.E(kodVar2.j != null);
        synchronized (kodVar2.b) {
            z1a.D("Already allocated", !kodVar2.f);
            kodVar2.f = true;
        }
        synchronized (kodVar2.b) {
            g = kodVar2.g();
        }
        if (g) {
            kodVar2.j.B();
        }
        kodVar2.c.getClass();
        TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (kodVar.G) {
            zd6 zd6Var = kodVar.D;
            boolean z = kodVar.K.o;
            int i2 = kodVar.J;
            ArrayList arrayList = kodVar.w;
            zd6Var.getClass();
            try {
                qg9 qg9Var = zd6Var.b.a;
                synchronized (qg9Var) {
                    if (qg9Var.e) {
                        throw new IOException("closed");
                    }
                    qg9Var.f(i2, arrayList, z);
                }
            } catch (IOException e) {
                zd6Var.a.m(e);
            }
            for (cy2 cy2Var : kodVar.K.j.a) {
                cy2Var.h();
            }
            kodVar.w = null;
            x52 x52Var = kodVar.x;
            if (x52Var.b > 0) {
                kodVar.E.a(kodVar.y, kodVar.I, x52Var, kodVar.z);
            }
            kodVar.G = false;
        }
        lodVar.h.getClass();
        if (lodVar.o) {
            this.i.flush();
        }
        int i3 = this.m;
        if (i3 < 2147483645) {
            this.m = i3 + 2;
        } else {
            this.m = Integer.MAX_VALUE;
            q(Integer.MAX_VALUE, up5.NO_ERROR, xei.m.h("Stream ids exhausted"));
        }
    }

    public final void t() {
        if (this.v == null || !this.n.isEmpty() || !this.D.isEmpty() || this.y) {
            return;
        }
        this.y = true;
        oia oiaVar = this.F;
        if (oiaVar != null) {
            synchronized (oiaVar) {
                try {
                    if (oiaVar.d != 6) {
                        oiaVar.d = 6;
                        ScheduledFuture scheduledFuture = oiaVar.e;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        ScheduledFuture scheduledFuture2 = oiaVar.f;
                        if (scheduledFuture2 != null) {
                            scheduledFuture2.cancel(false);
                            oiaVar.f = null;
                        }
                    }
                } finally {
                }
            }
        }
        ch9 ch9Var = this.x;
        if (ch9Var != null) {
            zei j = j();
            synchronized (ch9Var) {
                try {
                    if (!ch9Var.d) {
                        ch9Var.d = true;
                        ch9Var.e = j;
                        LinkedHashMap linkedHashMap = ch9Var.c;
                        ch9Var.c = null;
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            try {
                                ((Executor) entry.getValue()).execute(new bh9((nia) entry.getKey(), j));
                            } catch (Throwable th) {
                                ch9.g.log(Level.SEVERE, "Failed to execute PingCallback", th);
                            }
                        }
                    }
                } finally {
                }
            }
            this.x = null;
        }
        if (!this.w) {
            this.w = true;
            this.i.f(up5.NO_ERROR, new byte[0]);
        }
        this.i.close();
    }

    public final String toString() {
        en0 I = qea.I(this);
        I.c(this.l.c, "logId");
        I.e(this.a, "address");
        return I.toString();
    }
}
