package com.android.billingclient.api;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final k f4110a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4111b;

    public w(k billingResult, List purchasesList) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(purchasesList, "purchasesList");
        this.f4110a = billingResult;
        this.f4111b = purchasesList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.areEqual(this.f4110a, wVar.f4110a) && Intrinsics.areEqual(this.f4111b, wVar.f4111b);
    }

    public final int hashCode() {
        return this.f4111b.hashCode() + (this.f4110a.hashCode() * 31);
    }

    public final String toString() {
        return "PurchasesResult(billingResult=" + this.f4110a + ", purchasesList=" + this.f4111b + ")";
    }
}
