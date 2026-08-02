package ah;

import com.plaid.internal.EnumC3631g;
import io.agora.rtc2.video.FaceShapeAreaOptions;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes3.dex */
public final class v implements Comparable {

    /* renamed from: p2, reason: collision with root package name */
    public static final List f16226p2;

    /* renamed from: x2, reason: collision with root package name */
    public static final Map f16236x2;

    /* renamed from: a, reason: collision with root package name */
    public final int f16240a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16241b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f16209c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final v f16210d = new v(100, "Continue");

    /* renamed from: e, reason: collision with root package name */
    public static final v f16211e = new v(101, "Switching Protocols");

    /* renamed from: f, reason: collision with root package name */
    public static final v f16212f = new v(102, "Processing");

    /* renamed from: g, reason: collision with root package name */
    public static final v f16213g = new v(200, "OK");

    /* renamed from: h, reason: collision with root package name */
    public static final v f16216h = new v(201, "Created");

    /* renamed from: i, reason: collision with root package name */
    public static final v f16217i = new v(202, "Accepted");

    /* renamed from: j, reason: collision with root package name */
    public static final v f16218j = new v(203, "Non-Authoritative Information");

    /* renamed from: k, reason: collision with root package name */
    public static final v f16219k = new v(204, "No Content");

    /* renamed from: l, reason: collision with root package name */
    public static final v f16220l = new v(205, "Reset Content");

    /* renamed from: m, reason: collision with root package name */
    public static final v f16221m = new v(206, "Partial Content");

    /* renamed from: n, reason: collision with root package name */
    public static final v f16222n = new v(EnumC3631g.SDK_ASSET_ICON_COMMENT_VALUE, "Multi-Status");

    /* renamed from: o, reason: collision with root package name */
    public static final v f16223o = new v(300, "Multiple Choices");

    /* renamed from: p, reason: collision with root package name */
    public static final v f16224p = new v(301, "Moved Permanently");

    /* renamed from: q, reason: collision with root package name */
    public static final v f16227q = new v(302, "Found");

    /* renamed from: r, reason: collision with root package name */
    public static final v f16228r = new v(303, "See Other");

    /* renamed from: s, reason: collision with root package name */
    public static final v f16229s = new v(304, "Not Modified");

    /* renamed from: t, reason: collision with root package name */
    public static final v f16230t = new v(305, "Use Proxy");

    /* renamed from: u, reason: collision with root package name */
    public static final v f16231u = new v(306, "Switch Proxy");

    /* renamed from: v, reason: collision with root package name */
    public static final v f16232v = new v(307, "Temporary Redirect");

    /* renamed from: w, reason: collision with root package name */
    public static final v f16233w = new v(308, "Permanent Redirect");

    /* renamed from: x, reason: collision with root package name */
    public static final v f16234x = new v(400, "Bad Request");

    /* renamed from: y, reason: collision with root package name */
    public static final v f16237y = new v(FaceShapeAreaOptions.FACE_SHAPE_AREA_MOUTHPOSITION, "Unauthorized");

    /* renamed from: z, reason: collision with root package name */
    public static final v f16239z = new v(FaceShapeAreaOptions.FACE_SHAPE_AREA_MOUTHSMILE, "Payment Required");

    /* renamed from: A, reason: collision with root package name */
    public static final v f16184A = new v(FaceShapeAreaOptions.FACE_SHAPE_AREA_MOUTHLIP, "Forbidden");

    /* renamed from: B, reason: collision with root package name */
    public static final v f16185B = new v(404, "Not Found");

    /* renamed from: C, reason: collision with root package name */
    public static final v f16186C = new v(405, "Method Not Allowed");

    /* renamed from: D, reason: collision with root package name */
    public static final v f16187D = new v(406, "Not Acceptable");

    /* renamed from: E, reason: collision with root package name */
    public static final v f16188E = new v(407, "Proxy Authentication Required");

    /* renamed from: F, reason: collision with root package name */
    public static final v f16189F = new v(408, "Request Timeout");

    /* renamed from: G, reason: collision with root package name */
    public static final v f16190G = new v(409, "Conflict");

    /* renamed from: H, reason: collision with root package name */
    public static final v f16191H = new v(410, "Gone");

    /* renamed from: I, reason: collision with root package name */
    public static final v f16192I = new v(411, "Length Required");

    /* renamed from: J, reason: collision with root package name */
    public static final v f16193J = new v(412, "Precondition Failed");

    /* renamed from: K, reason: collision with root package name */
    public static final v f16194K = new v(413, "Payload Too Large");

    /* renamed from: L, reason: collision with root package name */
    public static final v f16195L = new v(414, "Request-URI Too Long");

    /* renamed from: O, reason: collision with root package name */
    public static final v f16196O = new v(415, "Unsupported Media Type");

    /* renamed from: P, reason: collision with root package name */
    public static final v f16197P = new v(416, "Requested Range Not Satisfiable");

    /* renamed from: R, reason: collision with root package name */
    public static final v f16198R = new v(417, "Expectation Failed");

    /* renamed from: T, reason: collision with root package name */
    public static final v f16199T = new v(422, "Unprocessable Entity");

    /* renamed from: V, reason: collision with root package name */
    public static final v f16201V = new v(423, "Locked");

    /* renamed from: W, reason: collision with root package name */
    public static final v f16203W = new v(424, "Failed Dependency");

    /* renamed from: X, reason: collision with root package name */
    public static final v f16204X = new v(425, "Too Early");

    /* renamed from: Y, reason: collision with root package name */
    public static final v f16205Y = new v(426, "Upgrade Required");

    /* renamed from: Z, reason: collision with root package name */
    public static final v f16206Z = new v(429, "Too Many Requests");

    /* renamed from: b1, reason: collision with root package name */
    public static final v f16207b1 = new v(431, "Request Header Fields Too Large");

    /* renamed from: g1, reason: collision with root package name */
    public static final v f16214g1 = new v(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION, "Internal Server Error");

    /* renamed from: p1, reason: collision with root package name */
    public static final v f16225p1 = new v(FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWTHICKNESS, "Not Implemented");

    /* renamed from: x1, reason: collision with root package name */
    public static final v f16235x1 = new v(502, "Bad Gateway");

    /* renamed from: y1, reason: collision with root package name */
    public static final v f16238y1 = new v(503, "Service Unavailable");

    /* renamed from: T1, reason: collision with root package name */
    public static final v f16200T1 = new v(504, "Gateway Timeout");

    /* renamed from: V1, reason: collision with root package name */
    public static final v f16202V1 = new v(505, "HTTP Version Not Supported");

    /* renamed from: b2, reason: collision with root package name */
    public static final v f16208b2 = new v(506, "Variant Also Negotiates");

    /* renamed from: g2, reason: collision with root package name */
    public static final v f16215g2 = new v(507, "Insufficient Storage");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v A() {
            return v.f16213g;
        }

        public final v B() {
            return v.f16221m;
        }

        public final v C() {
            return v.f16194K;
        }

        public final v D() {
            return v.f16239z;
        }

        public final v E() {
            return v.f16233w;
        }

        public final v F() {
            return v.f16193J;
        }

        public final v G() {
            return v.f16212f;
        }

        public final v H() {
            return v.f16188E;
        }

        public final v I() {
            return v.f16207b1;
        }

        public final v J() {
            return v.f16189F;
        }

        public final v K() {
            return v.f16195L;
        }

        public final v L() {
            return v.f16197P;
        }

        public final v M() {
            return v.f16220l;
        }

        public final v N() {
            return v.f16228r;
        }

        public final v O() {
            return v.f16238y1;
        }

        public final v P() {
            return v.f16231u;
        }

        public final v Q() {
            return v.f16211e;
        }

        public final v R() {
            return v.f16232v;
        }

        public final v S() {
            return v.f16204X;
        }

        public final v T() {
            return v.f16206Z;
        }

        public final v U() {
            return v.f16237y;
        }

        public final v V() {
            return v.f16199T;
        }

        public final v W() {
            return v.f16196O;
        }

        public final v X() {
            return v.f16205Y;
        }

        public final v Y() {
            return v.f16230t;
        }

        public final v Z() {
            return v.f16208b2;
        }

        public final v a() {
            return v.f16217i;
        }

        public final v a0() {
            return v.f16202V1;
        }

        public final v b() {
            return v.f16235x1;
        }

        public final v c() {
            return v.f16234x;
        }

        public final v d() {
            return v.f16190G;
        }

        public final v e() {
            return v.f16210d;
        }

        public final v f() {
            return v.f16216h;
        }

        public final v g() {
            return v.f16198R;
        }

        public final v h() {
            return v.f16203W;
        }

        public final v i() {
            return v.f16184A;
        }

        public final v j() {
            return v.f16227q;
        }

        public final v k() {
            return v.f16200T1;
        }

        public final v l() {
            return v.f16191H;
        }

        public final v m() {
            return v.f16215g2;
        }

        public final v n() {
            return v.f16214g1;
        }

        public final v o() {
            return v.f16192I;
        }

        public final v p() {
            return v.f16201V;
        }

        public final v q() {
            return v.f16186C;
        }

        public final v r() {
            return v.f16224p;
        }

        public final v s() {
            return v.f16222n;
        }

        public final v t() {
            return v.f16223o;
        }

        public final v u() {
            return v.f16219k;
        }

        public final v v() {
            return v.f16218j;
        }

        public final v w() {
            return v.f16187D;
        }

        public final v x() {
            return v.f16185B;
        }

        public final v y() {
            return v.f16225p1;
        }

        public final v z() {
            return v.f16229s;
        }

        public a() {
        }
    }

    static {
        List a10 = w.a();
        f16226p2 = a10;
        List list = a10;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(Integer.valueOf(((v) obj).f16240a), obj);
        }
        f16236x2 = linkedHashMap;
    }

    public v(int i10, String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f16240a = i10;
        this.f16241b = description;
    }

    @Override // java.lang.Comparable
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public int compareTo(v other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f16240a - other.f16240a;
    }

    public final int c0() {
        return this.f16240a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof v) && ((v) obj).f16240a == this.f16240a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f16240a);
    }

    public String toString() {
        return this.f16240a + ' ' + this.f16241b;
    }
}
