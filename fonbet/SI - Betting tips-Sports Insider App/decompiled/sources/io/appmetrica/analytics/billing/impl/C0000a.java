package io.appmetrica.analytics.billing.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.billing.impl.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0000a {

    /* renamed from: a, reason: collision with root package name */
    public final List f11410a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11411b;

    public C0000a(List list, boolean z5) {
        this.f11410a = list;
        this.f11411b = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0000a)) {
            return false;
        }
        C0000a c0000a = (C0000a) obj;
        return Intrinsics.areEqual(this.f11410a, c0000a.f11410a) && this.f11411b == c0000a.f11411b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f11410a.hashCode() * 31;
        boolean z5 = this.f11411b;
        int i5 = z5;
        if (z5 != 0) {
            i5 = 1;
        }
        return hashCode + i5;
    }

    public final String toString() {
        return "AutoInappCollectingInfo(billingInfos=" + this.f11410a + ", firstInappCheckOccurred=" + this.f11411b + ')';
    }
}
