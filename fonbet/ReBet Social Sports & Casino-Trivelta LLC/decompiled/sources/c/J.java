package c;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final String f26433a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26434b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26435c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26436d;

    /* renamed from: e, reason: collision with root package name */
    public final long f26437e;

    /* renamed from: f, reason: collision with root package name */
    public final N0 f26438f;

    /* renamed from: g, reason: collision with root package name */
    public final C2436d f26439g;

    /* renamed from: h, reason: collision with root package name */
    public final C2444h f26440h;

    /* renamed from: i, reason: collision with root package name */
    public final C2467t f26441i;

    /* renamed from: j, reason: collision with root package name */
    public final C2429B f26442j;

    /* renamed from: k, reason: collision with root package name */
    public final String f26443k;

    /* renamed from: l, reason: collision with root package name */
    public final Q0 f26444l;

    /* renamed from: m, reason: collision with root package name */
    public final C2460p f26445m;

    /* renamed from: n, reason: collision with root package name */
    public final C2452l f26446n;

    /* renamed from: o, reason: collision with root package name */
    public final F f26447o;

    /* renamed from: p, reason: collision with root package name */
    public final C2471x f26448p;

    /* renamed from: q, reason: collision with root package name */
    public final Double f26449q;

    public J(String fingerprint, int i10, String risk_level, long j10, long j11, N0 n02, C2436d hardware, C2444h integrity, C2467t security, C2429B c2429b, String str, Q0 q02, C2460p c2460p, C2452l c2452l, F f10, C2471x c2471x, Double d10) {
        Intrinsics.checkNotNullParameter(fingerprint, "fingerprint");
        Intrinsics.checkNotNullParameter(risk_level, "risk_level");
        Intrinsics.checkNotNullParameter(hardware, "hardware");
        Intrinsics.checkNotNullParameter(integrity, "integrity");
        Intrinsics.checkNotNullParameter(security, "security");
        this.f26433a = fingerprint;
        this.f26434b = i10;
        this.f26435c = risk_level;
        this.f26436d = j10;
        this.f26437e = j11;
        this.f26438f = n02;
        this.f26439g = hardware;
        this.f26440h = integrity;
        this.f26441i = security;
        this.f26442j = c2429b;
        this.f26443k = str;
        this.f26444l = q02;
        this.f26445m = c2460p;
        this.f26446n = c2452l;
        this.f26447o = f10;
        this.f26448p = c2471x;
        this.f26449q = d10;
    }

    public final Map a() {
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("fingerprint", this.f26433a), TuplesKt.to("verification_count", Integer.valueOf(this.f26434b)), TuplesKt.to("risk_level", this.f26435c), TuplesKt.to("first_seen", Long.valueOf(this.f26436d)), TuplesKt.to("last_seen", Long.valueOf(this.f26437e)), TuplesKt.to("hardware", this.f26439g.a()), TuplesKt.to("integrity", this.f26440h.a()), TuplesKt.to("security", this.f26441i.a()));
        N0 n02 = this.f26438f;
        if (n02 != null) {
            mutableMapOf.put("attestation", n02.a());
        }
        C2429B c2429b = this.f26442j;
        if (c2429b != null) {
            mutableMapOf.put("software", c2429b.a());
        }
        String str = this.f26443k;
        if (str != null) {
            mutableMapOf.put("timezone", str);
        }
        Q0 q02 = this.f26444l;
        if (q02 != null) {
            mutableMapOf.put("battery", q02.a());
        }
        C2460p c2460p = this.f26445m;
        if (c2460p != null) {
            mutableMapOf.put("network", c2460p.a());
        }
        C2452l c2452l = this.f26446n;
        if (c2452l != null) {
            mutableMapOf.put("location", c2452l.a());
        }
        F f10 = this.f26447o;
        if (f10 != null) {
            mutableMapOf.put("wifi", f10.a());
        }
        C2471x c2471x = this.f26448p;
        if (c2471x != null) {
            mutableMapOf.put("sim_card", c2471x.a());
        }
        Double d10 = this.f26449q;
        if (d10 != null) {
            mutableMapOf.put("confidence", Double.valueOf(d10.doubleValue()));
        }
        return mutableMapOf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j10 = (J) obj;
        return Intrinsics.areEqual(this.f26433a, j10.f26433a) && this.f26434b == j10.f26434b && Intrinsics.areEqual(this.f26435c, j10.f26435c) && this.f26436d == j10.f26436d && this.f26437e == j10.f26437e && Intrinsics.areEqual(this.f26438f, j10.f26438f) && Intrinsics.areEqual(this.f26439g, j10.f26439g) && Intrinsics.areEqual(this.f26440h, j10.f26440h) && Intrinsics.areEqual(this.f26441i, j10.f26441i) && Intrinsics.areEqual(this.f26442j, j10.f26442j) && Intrinsics.areEqual(this.f26443k, j10.f26443k) && Intrinsics.areEqual(this.f26444l, j10.f26444l) && Intrinsics.areEqual(this.f26445m, j10.f26445m) && Intrinsics.areEqual(this.f26446n, j10.f26446n) && Intrinsics.areEqual(this.f26447o, j10.f26447o) && Intrinsics.areEqual(this.f26448p, j10.f26448p) && Intrinsics.areEqual((Object) this.f26449q, (Object) j10.f26449q);
    }

    public final int hashCode() {
        int hashCode = (Long.hashCode(this.f26437e) + ((Long.hashCode(this.f26436d) + ((this.f26435c.hashCode() + ((Integer.hashCode(this.f26434b) + (this.f26433a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        N0 n02 = this.f26438f;
        int hashCode2 = (this.f26441i.hashCode() + ((this.f26440h.hashCode() + ((this.f26439g.hashCode() + ((hashCode + (n02 == null ? 0 : n02.hashCode())) * 31)) * 31)) * 31)) * 31;
        C2429B c2429b = this.f26442j;
        int hashCode3 = (hashCode2 + (c2429b == null ? 0 : c2429b.hashCode())) * 31;
        String str = this.f26443k;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Q0 q02 = this.f26444l;
        int hashCode5 = (hashCode4 + (q02 == null ? 0 : q02.hashCode())) * 31;
        C2460p c2460p = this.f26445m;
        int hashCode6 = (hashCode5 + (c2460p == null ? 0 : c2460p.hashCode())) * 31;
        C2452l c2452l = this.f26446n;
        int hashCode7 = (hashCode6 + (c2452l == null ? 0 : c2452l.hashCode())) * 31;
        F f10 = this.f26447o;
        int hashCode8 = (hashCode7 + (f10 == null ? 0 : f10.hashCode())) * 31;
        C2471x c2471x = this.f26448p;
        int hashCode9 = (hashCode8 + (c2471x == null ? 0 : c2471x.hashCode())) * 31;
        Double d10 = this.f26449q;
        return hashCode9 + (d10 != null ? d10.hashCode() : 0);
    }

    public final String toString() {
        return "ModelsDTO(fingerprint=" + this.f26433a + ", verification_count=" + this.f26434b + ", risk_level=" + this.f26435c + ", first_seen=" + this.f26436d + ", last_seen=" + this.f26437e + ", attestation=" + this.f26438f + ", hardware=" + this.f26439g + ", integrity=" + this.f26440h + ", security=" + this.f26441i + ", software=" + this.f26442j + ", timezone=" + this.f26443k + ", battery=" + this.f26444l + ", network=" + this.f26445m + ", location=" + this.f26446n + ", wifi=" + this.f26447o + ", sim_card=" + this.f26448p + ", confidence=" + this.f26449q + ')';
    }
}
