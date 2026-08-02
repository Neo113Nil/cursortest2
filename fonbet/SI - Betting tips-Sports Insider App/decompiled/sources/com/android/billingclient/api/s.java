package com.android.billingclient.api;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final k f4078a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4079b;

    public s(k billingResult, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.f4078a = billingResult;
        this.f4079b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.areEqual(this.f4078a, sVar.f4078a) && Intrinsics.areEqual(this.f4079b, sVar.f4079b);
    }

    public final int hashCode() {
        return this.f4079b.hashCode() + (this.f4078a.hashCode() * 31);
    }

    public final String toString() {
        return "ProductDetailsResult(billingResult=" + this.f4078a + ", productDetailsList=" + this.f4079b + ")";
    }
}
