package com.android.billingclient.api;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final k f3967a;

    /* renamed from: b, reason: collision with root package name */
    public final List f3968b;

    public a0(k billingResult, List list) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.f3967a = billingResult;
        this.f3968b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.areEqual(this.f3967a, a0Var.f3967a) && Intrinsics.areEqual(this.f3968b, a0Var.f3968b);
    }

    public final int hashCode() {
        int hashCode = this.f3967a.hashCode() * 31;
        List list = this.f3968b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "SkuDetailsResult(billingResult=" + this.f3967a + ", skuDetailsList=" + this.f3968b + ")";
    }
}
