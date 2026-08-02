package lh;

import gh.i0;
import gh.m0;
import gh.n0;
import gh.o0;
import gh.r;
import gh.r0;
import gh.z;
import java.io.IOException;
import java.net.ProtocolException;
import kh.p;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import okio.Okio;
import okio.Sink;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class c implements z {

    /* renamed from: a, reason: collision with root package name */
    public static final c f20085a = new c();

    /* JADX WARN: Removed duplicated region for block: B:101:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01cf A[Catch: IOException -> 0x0153, TryCatch #2 {IOException -> 0x0153, blocks: (B:82:0x013a, B:84:0x0143, B:28:0x0156, B:36:0x01b6, B:40:0x01cf, B:45:0x01dd, B:46:0x01e4, B:50:0x01e7, B:56:0x01fd, B:57:0x0240, B:59:0x024c, B:66:0x0269, B:68:0x0276, B:69:0x029a, B:70:0x0256, B:71:0x0223, B:75:0x0183, B:77:0x018c, B:79:0x0197), top: B:81:0x013a }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e7 A[Catch: IOException -> 0x0153, TRY_LEAVE, TryCatch #2 {IOException -> 0x0153, blocks: (B:82:0x013a, B:84:0x0143, B:28:0x0156, B:36:0x01b6, B:40:0x01cf, B:45:0x01dd, B:46:0x01e4, B:50:0x01e7, B:56:0x01fd, B:57:0x0240, B:59:0x024c, B:66:0x0269, B:68:0x0276, B:69:0x029a, B:70:0x0256, B:71:0x0223, B:75:0x0183, B:77:0x018c, B:79:0x0197), top: B:81:0x013a }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018c A[Catch: IOException -> 0x0153, TryCatch #2 {IOException -> 0x0153, blocks: (B:82:0x013a, B:84:0x0143, B:28:0x0156, B:36:0x01b6, B:40:0x01cf, B:45:0x01dd, B:46:0x01e4, B:50:0x01e7, B:56:0x01fd, B:57:0x0240, B:59:0x024c, B:66:0x0269, B:68:0x0276, B:69:0x029a, B:70:0x0256, B:71:0x0223, B:75:0x0183, B:77:0x018c, B:79:0x0197), top: B:81:0x013a }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // gh.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o0 a(h chain) {
        String str;
        boolean z5;
        IOException iOException;
        n0 n0Var;
        o0 response;
        int i5;
        r0 r0Var;
        boolean z7;
        String str2;
        o0 a7;
        p pVar;
        r rVar;
        p pVar2;
        f fVar;
        f fVar2;
        m0 m0Var;
        Intrinsics.checkNotNullParameter(chain, "chain");
        kh.h hVar = chain.f20092d;
        Intrinsics.checkNotNull(hVar);
        i0 request = chain.f20093e;
        m0 m0Var2 = request.f10209d;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z10 = false;
        boolean z11 = com.google.android.play.core.appupdate.b.D(request.f10207b) && m0Var2 != null;
        String str3 = "Connection";
        boolean equalsIgnoreCase = "upgrade".equalsIgnoreCase(request.a("Connection"));
        n0 n0Var2 = null;
        try {
            pVar = (p) hVar.f19119b;
            rVar = (r) hVar.f19120c;
            pVar2 = (p) hVar.f19119b;
            fVar = (f) hVar.f19122e;
            Intrinsics.checkNotNullParameter(request, "request");
        } catch (IOException e7) {
            e = e7;
            str = "Connection";
            str3 = "upgrade";
        }
        try {
            try {
                rVar.t(pVar);
                fVar.j(request);
                rVar.s(pVar, request);
                if (z11) {
                    try {
                        if ("100-continue".equalsIgnoreCase(request.a("Expect"))) {
                            try {
                                fVar.e();
                                n0 d10 = hVar.d(true);
                                try {
                                    rVar.y(pVar2);
                                    n0Var = d10;
                                    z5 = false;
                                } catch (IOException e9) {
                                    e = e9;
                                    n0Var2 = d10;
                                    z5 = true;
                                    str = "Connection";
                                    str3 = "upgrade";
                                    if (!(e instanceof nh.a)) {
                                    }
                                }
                            } catch (IOException e10) {
                                ((r) hVar.f19120c).r((p) hVar.f19119b, e10);
                                hVar.f(e10);
                                throw e10;
                            }
                        } else {
                            z5 = true;
                            n0Var = null;
                        }
                        if (n0Var == null) {
                            try {
                                m0Var2.getClass();
                                Intrinsics.checkNotNullParameter(request, "request");
                                m0Var = request.f10209d;
                                Intrinsics.checkNotNull(m0Var);
                                str = "Connection";
                            } catch (IOException e11) {
                                e = e11;
                                str = "Connection";
                            }
                            try {
                                long a10 = m0Var.a();
                                rVar.q(pVar2);
                                Sink c2 = fVar.c(request, a10);
                                fVar2 = fVar;
                                BufferedSink buffer = Okio.buffer(new kh.e(hVar, c2, a10, false));
                                m0Var2.d(buffer);
                                buffer.close();
                                str3 = "upgrade";
                            } catch (IOException e12) {
                                e = e12;
                                str3 = "upgrade";
                                n0Var2 = n0Var;
                                if (!(e instanceof nh.a)) {
                                    throw e;
                                }
                                if (!hVar.f19118a) {
                                    throw e;
                                }
                                iOException = e;
                                n0Var = n0Var2;
                                if (n0Var == null) {
                                }
                                n0 n0Var3 = n0Var;
                                n0Var3.getClass();
                                Intrinsics.checkNotNullParameter(request, "request");
                                n0Var3.f10257a = request;
                                n0Var3.f10261e = hVar.b().f19159f;
                                n0Var3.f10267l = currentTimeMillis;
                                n0Var3.f10268m = System.currentTimeMillis();
                                response = n0Var3.a();
                                i5 = response.f10276d;
                                while (true) {
                                    r0Var = response.f10279g;
                                    if (i5 != 100) {
                                        break;
                                    }
                                    n0 d11 = hVar.d(false);
                                    Intrinsics.checkNotNull(d11);
                                    if (!z5) {
                                    }
                                    d11.getClass();
                                    Intrinsics.checkNotNullParameter(request, "request");
                                    d11.f10257a = request;
                                    d11.f10261e = hVar.b().f19159f;
                                    d11.f10267l = currentTimeMillis;
                                    d11.f10268m = System.currentTimeMillis();
                                    response = d11.a();
                                    i5 = response.f10276d;
                                }
                                Intrinsics.checkNotNullParameter(response, "response");
                                ((r) hVar.f19120c).x((p) hVar.f19119b, response);
                                if (i5 != 101) {
                                }
                                if (z7) {
                                }
                                if (z7) {
                                }
                                if (equalsIgnoreCase) {
                                }
                                i body = hVar.c(response);
                                n0 k6 = response.k();
                                Intrinsics.checkNotNullParameter(body, "body");
                                k6.f10263g = body;
                                b trailersSource = new b();
                                Intrinsics.checkNotNullParameter(trailersSource, "trailersSource");
                                k6.f10270o = trailersSource;
                                a7 = k6.a();
                                if (!"close".equalsIgnoreCase(a7.f10273a.a(str2))) {
                                }
                                ((f) hVar.f19122e).g().e();
                                if (i5 == 204) {
                                }
                                throw new ProtocolException("HTTP " + i5 + " had non-zero Content-Length: " + a7.f10279g.k());
                            }
                        } else {
                            fVar2 = fVar;
                            str = "Connection";
                            str3 = "upgrade";
                            try {
                                pVar2.i(hVar, true, false, false, false, null);
                                if (!(hVar.b().f19162i != null)) {
                                    fVar2.g().e();
                                }
                            } catch (IOException e13) {
                                e = e13;
                                n0Var2 = n0Var;
                                if (!(e instanceof nh.a)) {
                                }
                            }
                        }
                    } catch (IOException e14) {
                        e = e14;
                    }
                } else {
                    fVar2 = fVar;
                    str = "Connection";
                    str3 = "upgrade";
                    pVar2.i(hVar, true, false, false, false, null);
                    n0Var = null;
                    z5 = true;
                }
            } catch (IOException e15) {
                rVar.r(pVar, e15);
                hVar.f(e15);
                throw e15;
            }
        } catch (IOException e16) {
            e = e16;
            z5 = true;
            if (!(e instanceof nh.a)) {
            }
        }
        try {
            fVar2.a();
            iOException = null;
            if (n0Var == null) {
                try {
                    n0Var = hVar.d(false);
                    Intrinsics.checkNotNull(n0Var);
                    if (z5) {
                        ((r) hVar.f19120c).y((p) hVar.f19119b);
                        z5 = false;
                    }
                } catch (IOException e17) {
                    if (iOException == null) {
                        throw e17;
                    }
                    gf.d.a(iOException, e17);
                    throw iOException;
                }
            }
            n0 n0Var32 = n0Var;
            n0Var32.getClass();
            Intrinsics.checkNotNullParameter(request, "request");
            n0Var32.f10257a = request;
            n0Var32.f10261e = hVar.b().f19159f;
            n0Var32.f10267l = currentTimeMillis;
            n0Var32.f10268m = System.currentTimeMillis();
            response = n0Var32.a();
            i5 = response.f10276d;
            while (true) {
                r0Var = response.f10279g;
                if (i5 != 100 && (102 > i5 || i5 >= 200)) {
                    break;
                }
                n0 d112 = hVar.d(false);
                Intrinsics.checkNotNull(d112);
                if (!z5) {
                    ((r) hVar.f19120c).y((p) hVar.f19119b);
                }
                d112.getClass();
                Intrinsics.checkNotNullParameter(request, "request");
                d112.f10257a = request;
                d112.f10261e = hVar.b().f19159f;
                d112.f10267l = currentTimeMillis;
                d112.f10268m = System.currentTimeMillis();
                response = d112.a();
                i5 = response.f10276d;
            }
            Intrinsics.checkNotNullParameter(response, "response");
            ((r) hVar.f19120c).x((p) hVar.f19119b, response);
            z7 = i5 != 101;
            if (z7) {
                if (hVar.b().f19162i != null) {
                    throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
                }
            }
            if (z7) {
                str2 = str;
            } else {
                str2 = str;
                if (str3.equalsIgnoreCase(o0.c(response, str2))) {
                    z10 = true;
                }
            }
            if (equalsIgnoreCase || !z10) {
                i body2 = hVar.c(response);
                n0 k62 = response.k();
                Intrinsics.checkNotNullParameter(body2, "body");
                k62.f10263g = body2;
                b trailersSource2 = new b();
                Intrinsics.checkNotNullParameter(trailersSource2, "trailersSource");
                k62.f10270o = trailersSource2;
                a7 = k62.a();
            } else {
                n0 k9 = response.k();
                hh.c body3 = new hh.c(r0Var.n(), r0Var.k());
                Intrinsics.checkNotNullParameter(body3, "body");
                k9.f10263g = body3;
                kh.g socket = hVar.g();
                Intrinsics.checkNotNullParameter(socket, "socket");
                k9.f10264h = socket;
                a7 = k9.a();
            }
            if (!"close".equalsIgnoreCase(a7.f10273a.a(str2)) || "close".equalsIgnoreCase(o0.c(a7, str2))) {
                ((f) hVar.f19122e).g().e();
            }
            if ((i5 == 204 && i5 != 205) || a7.f10279g.k() <= 0) {
                return a7;
            }
            throw new ProtocolException("HTTP " + i5 + " had non-zero Content-Length: " + a7.f10279g.k());
        } catch (IOException e18) {
            ((r) hVar.f19120c).r((p) hVar.f19119b, e18);
            hVar.f(e18);
            throw e18;
        }
    }
}
