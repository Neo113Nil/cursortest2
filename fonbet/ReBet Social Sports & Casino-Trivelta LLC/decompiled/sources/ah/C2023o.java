package ah;

import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zendesk.core.Constants;

/* renamed from: ah.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2023o {

    @NotNull
    private static final String[] UnsafeHeadersArray;

    /* renamed from: V0, reason: collision with root package name */
    public static final List f16108V0;

    /* renamed from: a, reason: collision with root package name */
    public static final C2023o f16113a = new C2023o();

    /* renamed from: b, reason: collision with root package name */
    public static final String f16115b = Constants.ACCEPT_HEADER;

    /* renamed from: c, reason: collision with root package name */
    public static final String f16117c = "Accept-Charset";

    /* renamed from: d, reason: collision with root package name */
    public static final String f16119d = "Accept-Encoding";

    /* renamed from: e, reason: collision with root package name */
    public static final String f16121e = Constants.ACCEPT_LANGUAGE;

    /* renamed from: f, reason: collision with root package name */
    public static final String f16123f = "Accept-Ranges";

    /* renamed from: g, reason: collision with root package name */
    public static final String f16125g = "Age";

    /* renamed from: h, reason: collision with root package name */
    public static final String f16127h = "Allow";

    /* renamed from: i, reason: collision with root package name */
    public static final String f16129i = "ALPN";

    /* renamed from: j, reason: collision with root package name */
    public static final String f16131j = "Authentication-Info";

    /* renamed from: k, reason: collision with root package name */
    public static final String f16133k = Constants.AUTHORIZATION_HEADER;

    /* renamed from: l, reason: collision with root package name */
    public static final String f16135l = "Cache-Control";

    /* renamed from: m, reason: collision with root package name */
    public static final String f16137m = "Connection";

    /* renamed from: n, reason: collision with root package name */
    public static final String f16139n = "Content-Disposition";

    /* renamed from: o, reason: collision with root package name */
    public static final String f16141o = "Content-Encoding";

    /* renamed from: p, reason: collision with root package name */
    public static final String f16143p = "Content-Language";

    /* renamed from: q, reason: collision with root package name */
    public static final String f16145q = "Content-Length";

    /* renamed from: r, reason: collision with root package name */
    public static final String f16147r = "Content-Location";

    /* renamed from: s, reason: collision with root package name */
    public static final String f16149s = "Content-Range";

    /* renamed from: t, reason: collision with root package name */
    public static final String f16151t = "Content-Type";

    /* renamed from: u, reason: collision with root package name */
    public static final String f16153u = "Cookie";

    /* renamed from: v, reason: collision with root package name */
    public static final String f16155v = "DASL";

    /* renamed from: w, reason: collision with root package name */
    public static final String f16157w = "Date";

    /* renamed from: x, reason: collision with root package name */
    public static final String f16159x = "DAV";

    /* renamed from: y, reason: collision with root package name */
    public static final String f16161y = "Depth";

    /* renamed from: z, reason: collision with root package name */
    public static final String f16163z = "Destination";

    /* renamed from: A, reason: collision with root package name */
    public static final String f16065A = "ETag";

    /* renamed from: B, reason: collision with root package name */
    public static final String f16067B = "Expect";

    /* renamed from: C, reason: collision with root package name */
    public static final String f16069C = "Expires";

    /* renamed from: D, reason: collision with root package name */
    public static final String f16071D = "From";

    /* renamed from: E, reason: collision with root package name */
    public static final String f16073E = "Forwarded";

    /* renamed from: F, reason: collision with root package name */
    public static final String f16075F = "Host";

    /* renamed from: G, reason: collision with root package name */
    public static final String f16077G = "HTTP2-Settings";

    /* renamed from: H, reason: collision with root package name */
    public static final String f16079H = "If";

    /* renamed from: I, reason: collision with root package name */
    public static final String f16081I = "If-Match";

    /* renamed from: J, reason: collision with root package name */
    public static final String f16083J = "If-Modified-Since";

    /* renamed from: K, reason: collision with root package name */
    public static final String f16085K = "If-None-Match";

    /* renamed from: L, reason: collision with root package name */
    public static final String f16087L = "If-Range";

    /* renamed from: M, reason: collision with root package name */
    public static final String f16089M = "If-Schedule-Tag-Match";

    /* renamed from: N, reason: collision with root package name */
    public static final String f16091N = "If-Unmodified-Since";

    /* renamed from: O, reason: collision with root package name */
    public static final String f16093O = "Last-Modified";

    /* renamed from: P, reason: collision with root package name */
    public static final String f16095P = "Location";

    /* renamed from: Q, reason: collision with root package name */
    public static final String f16097Q = "Lock-Token";

    /* renamed from: R, reason: collision with root package name */
    public static final String f16099R = "Link";

    /* renamed from: S, reason: collision with root package name */
    public static final String f16101S = "Max-Forwards";

    /* renamed from: T, reason: collision with root package name */
    public static final String f16103T = "MIME-Version";

    /* renamed from: U, reason: collision with root package name */
    public static final String f16105U = "Ordering-Type";

    /* renamed from: V, reason: collision with root package name */
    public static final String f16107V = "Origin";

    /* renamed from: W, reason: collision with root package name */
    public static final String f16109W = "Overwrite";

    /* renamed from: X, reason: collision with root package name */
    public static final String f16110X = "Position";

    /* renamed from: Y, reason: collision with root package name */
    public static final String f16111Y = "Pragma";

    /* renamed from: Z, reason: collision with root package name */
    public static final String f16112Z = "Prefer";

    /* renamed from: a0, reason: collision with root package name */
    public static final String f16114a0 = "Preference-Applied";

    /* renamed from: b0, reason: collision with root package name */
    public static final String f16116b0 = "Proxy-Authenticate";

    /* renamed from: c0, reason: collision with root package name */
    public static final String f16118c0 = "Proxy-Authentication-Info";

    /* renamed from: d0, reason: collision with root package name */
    public static final String f16120d0 = "Proxy-Authorization";

    /* renamed from: e0, reason: collision with root package name */
    public static final String f16122e0 = "Public-Key-Pins";

    /* renamed from: f0, reason: collision with root package name */
    public static final String f16124f0 = "Public-Key-Pins-Report-Only";

    /* renamed from: g0, reason: collision with root package name */
    public static final String f16126g0 = "Range";

    /* renamed from: h0, reason: collision with root package name */
    public static final String f16128h0 = "Referer";

    /* renamed from: i0, reason: collision with root package name */
    public static final String f16130i0 = "Retry-After";

    /* renamed from: j0, reason: collision with root package name */
    public static final String f16132j0 = "Schedule-Reply";

    /* renamed from: k0, reason: collision with root package name */
    public static final String f16134k0 = "Schedule-Tag";

    /* renamed from: l0, reason: collision with root package name */
    public static final String f16136l0 = "Sec-WebSocket-Accept";

    /* renamed from: m0, reason: collision with root package name */
    public static final String f16138m0 = "Sec-WebSocket-Extensions";

    /* renamed from: n0, reason: collision with root package name */
    public static final String f16140n0 = "Sec-WebSocket-Key";

    /* renamed from: o0, reason: collision with root package name */
    public static final String f16142o0 = "Sec-WebSocket-Protocol";

    /* renamed from: p0, reason: collision with root package name */
    public static final String f16144p0 = "Sec-WebSocket-Version";

    /* renamed from: q0, reason: collision with root package name */
    public static final String f16146q0 = "Server";

    /* renamed from: r0, reason: collision with root package name */
    public static final String f16148r0 = "Set-Cookie";

    /* renamed from: s0, reason: collision with root package name */
    public static final String f16150s0 = "SLUG";

    /* renamed from: t0, reason: collision with root package name */
    public static final String f16152t0 = "Strict-Transport-Security";

    /* renamed from: u0, reason: collision with root package name */
    public static final String f16154u0 = "TE";

    /* renamed from: v0, reason: collision with root package name */
    public static final String f16156v0 = "Timeout";

    /* renamed from: w0, reason: collision with root package name */
    public static final String f16158w0 = "Trailer";

    /* renamed from: x0, reason: collision with root package name */
    public static final String f16160x0 = "Transfer-Encoding";

    /* renamed from: y0, reason: collision with root package name */
    public static final String f16162y0 = "Upgrade";

    /* renamed from: z0, reason: collision with root package name */
    public static final String f16164z0 = Constants.USER_AGENT_HEADER_KEY;

    /* renamed from: A0, reason: collision with root package name */
    public static final String f16066A0 = "Vary";

    /* renamed from: B0, reason: collision with root package name */
    public static final String f16068B0 = "Via";

    /* renamed from: C0, reason: collision with root package name */
    public static final String f16070C0 = "Warning";

    /* renamed from: D0, reason: collision with root package name */
    public static final String f16072D0 = "WWW-Authenticate";

    /* renamed from: E0, reason: collision with root package name */
    public static final String f16074E0 = "Access-Control-Allow-Origin";

    /* renamed from: F0, reason: collision with root package name */
    public static final String f16076F0 = "Access-Control-Allow-Methods";

    /* renamed from: G0, reason: collision with root package name */
    public static final String f16078G0 = "Access-Control-Allow-Credentials";

    /* renamed from: H0, reason: collision with root package name */
    public static final String f16080H0 = "Access-Control-Allow-Headers";

    /* renamed from: I0, reason: collision with root package name */
    public static final String f16082I0 = "Access-Control-Request-Method";

    /* renamed from: J0, reason: collision with root package name */
    public static final String f16084J0 = "Access-Control-Request-Headers";

    /* renamed from: K0, reason: collision with root package name */
    public static final String f16086K0 = "Access-Control-Expose-Headers";

    /* renamed from: L0, reason: collision with root package name */
    public static final String f16088L0 = "Access-Control-Max-Age";

    /* renamed from: M0, reason: collision with root package name */
    public static final String f16090M0 = "X-Http-Method-Override";

    /* renamed from: N0, reason: collision with root package name */
    public static final String f16092N0 = "X-Forwarded-Host";

    /* renamed from: O0, reason: collision with root package name */
    public static final String f16094O0 = "X-Forwarded-Server";

    /* renamed from: P0, reason: collision with root package name */
    public static final String f16096P0 = "X-Forwarded-Proto";

    /* renamed from: Q0, reason: collision with root package name */
    public static final String f16098Q0 = "X-Forwarded-For";

    /* renamed from: R0, reason: collision with root package name */
    public static final String f16100R0 = "X-Forwarded-Port";

    /* renamed from: S0, reason: collision with root package name */
    public static final String f16102S0 = "X-Request-ID";

    /* renamed from: T0, reason: collision with root package name */
    public static final String f16104T0 = "X-Correlation-ID";

    /* renamed from: U0, reason: collision with root package name */
    public static final String f16106U0 = "X-Total-Count";

    static {
        String[] strArr = {"Transfer-Encoding", "Upgrade"};
        UnsafeHeadersArray = strArr;
        f16108V0 = ArraysKt.asList(strArr);
    }

    public final void a(String name) {
        boolean b10;
        Intrinsics.checkNotNullParameter(name, "name");
        int i10 = 0;
        int i11 = 0;
        while (i10 < name.length()) {
            char charAt = name.charAt(i10);
            int i12 = i11 + 1;
            if (Intrinsics.compare((int) charAt, 32) > 0) {
                b10 = AbstractC2024p.b(charAt);
                if (!b10) {
                    i10++;
                    i11 = i12;
                }
            }
            throw new x(name, i11);
        }
    }

    public final void b(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int i10 = 0;
        int i11 = 0;
        while (i10 < value.length()) {
            char charAt = value.charAt(i10);
            int i12 = i11 + 1;
            if (Intrinsics.compare((int) charAt, 32) < 0 && charAt != '\t') {
                throw new y(value, i11);
            }
            i10++;
            i11 = i12;
        }
    }

    public final String c() {
        return f16115b;
    }

    public final String d() {
        return f16117c;
    }

    public final String e() {
        return f16133k;
    }

    public final String f() {
        return f16141o;
    }

    public final String g() {
        return f16145q;
    }

    public final String h() {
        return f16151t;
    }

    public final String i() {
        return f16157w;
    }

    public final String j() {
        return f16069C;
    }

    public final String k() {
        return f16083J;
    }

    public final String l() {
        return f16091N;
    }

    public final String m() {
        return f16093O;
    }

    public final String n() {
        return f16095P;
    }

    public final List o() {
        return f16108V0;
    }

    public final String p() {
        return f16164z0;
    }
}
