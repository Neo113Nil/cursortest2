package com.android.billingclient.api;

import android.text.TextUtils;
import j$.lang.Iterable$EL;
import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f4017a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f4018b;

    /* renamed from: c, reason: collision with root package name */
    public m3.f f4019c;

    public final i a() {
        Object obj;
        ArrayList arrayList = this.f4018b;
        boolean z5 = true;
        boolean z7 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        ArrayList arrayList2 = this.f4017a;
        boolean z10 = (arrayList2 == null || arrayList2.isEmpty()) ? false : true;
        if (!z7 && !z10) {
            throw new IllegalArgumentException("Details of the products must be provided.");
        }
        if (z7 && z10) {
            throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
        }
        if (!z7) {
            Iterable$EL.forEach(this.f4017a, new q0());
        } else {
            if (this.f4018b.contains(null)) {
                throw new IllegalArgumentException("SKU cannot be null.");
            }
            if (this.f4018b.size() > 1) {
                SkuDetails skuDetails = (SkuDetails) this.f4018b.get(0);
                String g10 = skuDetails.g();
                ArrayList arrayList3 = this.f4018b;
                int size = arrayList3.size();
                for (int i5 = 0; i5 < size; i5++) {
                    SkuDetails skuDetails2 = (SkuDetails) arrayList3.get(i5);
                    if (!g10.equals("play_pass_subs") && !skuDetails2.g().equals("play_pass_subs") && !g10.equals(skuDetails2.g())) {
                        throw new IllegalArgumentException("SKUs should have the same type.");
                    }
                }
                String optString = skuDetails.f3964b.optString("packageName");
                ArrayList arrayList4 = this.f4018b;
                int size2 = arrayList4.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    SkuDetails skuDetails3 = (SkuDetails) arrayList4.get(i10);
                    if (!g10.equals("play_pass_subs") && !skuDetails3.g().equals("play_pass_subs") && !optString.equals(skuDetails3.f3964b.optString("packageName"))) {
                        throw new IllegalArgumentException("All SKUs must have the same package name.");
                    }
                }
            }
        }
        i iVar = new i();
        iVar.f4027a = (z7 && !((SkuDetails) this.f4018b.get(0)).f3964b.optString("packageName").isEmpty()) || (z10 && !((h) this.f4017a.get(0)).f4022a.f4068b.optString("packageName").isEmpty());
        this.f4019c.getClass();
        if (TextUtils.isEmpty(null) && TextUtils.isEmpty(null)) {
            z5 = false;
        }
        boolean isEmpty = TextUtils.isEmpty(null);
        if (z5 && !isEmpty) {
            throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        }
        iVar.f4028b = new y8.d();
        ArrayList arrayList5 = this.f4018b;
        iVar.f4030d = arrayList5 != null ? new ArrayList(arrayList5) : new ArrayList();
        ArrayList arrayList6 = this.f4017a;
        if (arrayList6 != null) {
            obj = com.google.android.gms.internal.play_billing.d0.j(arrayList6);
        } else {
            com.google.android.gms.internal.play_billing.a0 a0Var = com.google.android.gms.internal.play_billing.d0.f5420b;
            obj = com.google.android.gms.internal.play_billing.s0.f5567e;
        }
        iVar.f4029c = obj;
        return iVar;
    }
}
