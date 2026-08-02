package com.android.billingclient.api;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final k f4041a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4042b;

    public l(k billingResult, String str) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.f4041a = billingResult;
        this.f4042b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.areEqual(this.f4041a, lVar.f4041a) && Intrinsics.areEqual(this.f4042b, lVar.f4042b);
    }

    public final int hashCode() {
        int hashCode = this.f4041a.hashCode() * 31;
        String str = this.f4042b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConsumeResult(billingResult=");
        sb2.append(this.f4041a);
        sb2.append(", purchaseToken=");
        return d9.e.l(sb2, this.f4042b, ")");
    }
}
