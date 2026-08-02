package com.android.billingclient.api;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final k f4104a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4105b;

    public u(k billingResult, List list) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.f4104a = billingResult;
        this.f4105b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.areEqual(this.f4104a, uVar.f4104a) && Intrinsics.areEqual(this.f4105b, uVar.f4105b);
    }

    public final int hashCode() {
        int hashCode = this.f4104a.hashCode() * 31;
        List list = this.f4105b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "PurchaseHistoryResult(billingResult=" + this.f4104a + ", purchaseHistoryRecordList=" + this.f4105b + ")";
    }
}
