package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final int f12242a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12243b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12244c;

    public G(int i5, int i10, int i11) {
        this.f12242a = i5;
        this.f12243b = i10;
        this.f12244c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(G.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.id.AdvIdGetterController.CanTrackIdentifiers");
        }
        G g10 = (G) obj;
        return this.f12242a == g10.f12242a && this.f12243b == g10.f12243b && this.f12244c == g10.f12244c;
    }

    public final int hashCode() {
        return K7.a(this.f12244c) + ((K7.a(this.f12243b) + (K7.a(this.f12242a) * 31)) * 31);
    }

    public final String toString() {
        return "CanTrackIdentifiers(canTrackGaid=" + H.a(this.f12242a) + ", canTrackHoaid=" + H.a(this.f12243b) + ", canTrackYandexAdvId=" + H.a(this.f12244c) + ')';
    }
}
