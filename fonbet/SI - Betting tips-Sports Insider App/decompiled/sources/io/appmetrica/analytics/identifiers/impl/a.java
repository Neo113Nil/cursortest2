package io.appmetrica.analytics.identifiers.impl;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f11802a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11803b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f11804c;

    public a(String str, String str2, Boolean bool) {
        this.f11802a = str;
        this.f11803b = str2;
        this.f11804c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f11802a, aVar.f11802a) && Intrinsics.areEqual(this.f11803b, aVar.f11803b) && Intrinsics.areEqual(this.f11804c, aVar.f11804c);
    }

    public final int hashCode() {
        int hashCode = this.f11802a.hashCode() * 31;
        String str = this.f11803b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f11804c;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "AdvIdInfo(provider=" + this.f11802a + ", advId=" + this.f11803b + ", limitedAdTracking=" + this.f11804c + ')';
    }
}
