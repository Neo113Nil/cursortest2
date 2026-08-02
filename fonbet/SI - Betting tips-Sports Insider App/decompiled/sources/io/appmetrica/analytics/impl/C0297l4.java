package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.l4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0297l4 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14164a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14165b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14166c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14167d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14168e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f14169f;

    public C0297l4(C0246j4 c0246j4) {
        boolean z5;
        boolean z7;
        boolean z10;
        boolean z11;
        boolean z12;
        Boolean bool;
        z5 = c0246j4.f13999a;
        this.f14164a = z5;
        z7 = c0246j4.f14000b;
        this.f14165b = z7;
        z10 = c0246j4.f14001c;
        this.f14166c = z10;
        z11 = c0246j4.f14002d;
        this.f14167d = z11;
        z12 = c0246j4.f14003e;
        this.f14168e = z12;
        bool = c0246j4.f14004f;
        this.f14169f = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0297l4.class == obj.getClass()) {
            C0297l4 c0297l4 = (C0297l4) obj;
            if (this.f14164a != c0297l4.f14164a || this.f14165b != c0297l4.f14165b || this.f14166c != c0297l4.f14166c || this.f14167d != c0297l4.f14167d || this.f14168e != c0297l4.f14168e) {
                return false;
            }
            Boolean bool = this.f14169f;
            Boolean bool2 = c0297l4.f14169f;
            if (bool != null) {
                return bool.equals(bool2);
            }
            if (bool2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = (((((((((this.f14164a ? 1 : 0) * 31) + (this.f14165b ? 1 : 0)) * 31) + (this.f14166c ? 1 : 0)) * 31) + (this.f14167d ? 1 : 0)) * 31) + (this.f14168e ? 1 : 0)) * 31;
        Boolean bool = this.f14169f;
        return i5 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "CollectingFlags{permissionsCollectingEnabled=" + this.f14164a + ", featuresCollectingEnabled=" + this.f14165b + ", googleAid=" + this.f14166c + ", simInfo=" + this.f14167d + ", huaweiOaid=" + this.f14168e + ", sslPinning=" + this.f14169f + '}';
    }
}
