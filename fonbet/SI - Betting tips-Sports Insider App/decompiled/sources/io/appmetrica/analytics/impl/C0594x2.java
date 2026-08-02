package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.x2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0594x2 {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC0569w2 f14885a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f14886b;

    public C0594x2(EnumC0569w2 enumC0569w2, Boolean bool) {
        this.f14885a = enumC0569w2;
        this.f14886b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0594x2.class == obj.getClass()) {
            C0594x2 c0594x2 = (C0594x2) obj;
            if (this.f14885a != c0594x2.f14885a) {
                return false;
            }
            Boolean bool = this.f14886b;
            if (bool != null) {
                return bool.equals(c0594x2.f14886b);
            }
            if (c0594x2.f14886b == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        EnumC0569w2 enumC0569w2 = this.f14885a;
        int hashCode = (enumC0569w2 != null ? enumC0569w2.hashCode() : 0) * 31;
        Boolean bool = this.f14886b;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "BackgroundRestrictionsState{mAppStandByBucket=" + this.f14885a + ", mBackgroundRestricted=" + this.f14886b + '}';
    }
}
