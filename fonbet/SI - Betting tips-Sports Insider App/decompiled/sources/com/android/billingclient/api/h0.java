package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.play_billing.p1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h0 extends com.google.android.gms.internal.play_billing.e {

    /* renamed from: f, reason: collision with root package name */
    public final cc.b f4024f;

    /* renamed from: g, reason: collision with root package name */
    public final s0 f4025g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4026h;

    public h0(cc.b bVar, l1.a aVar, int i5) {
        super("com.android.vending.billing.IInAppBillingGetBillingConfigCallback", 0);
        this.f4024f = bVar;
        this.f4025g = aVar;
        this.f4026h = i5;
    }

    @Override // com.google.android.gms.internal.play_billing.e
    public final boolean U(int i5, Parcel parcel, Parcel parcel2) {
        if (i5 != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) com.google.android.gms.internal.play_billing.f.a(parcel);
        com.google.android.gms.internal.play_billing.f.b(parcel);
        int i10 = this.f4026h;
        s0 s0Var = this.f4025g;
        cc.b bVar = this.f4024f;
        if (bundle == null) {
            k kVar = t0.j;
            ((l1.a) s0Var).P(r0.b(63, 13, kVar), i10);
            bVar.a(kVar);
        } else {
            int a7 = p1.a(bundle, "BillingClient");
            String e7 = p1.e(bundle, "BillingClient");
            j a10 = k.a();
            a10.f4033a = a7;
            a10.f4034b = e7;
            if (a7 != 0) {
                p1.g("BillingClient", "getBillingConfig() failed. Response code: " + a7);
                k a11 = a10.a();
                ((l1.a) s0Var).P(r0.b(23, 13, a11), i10);
                bVar.a(a11);
            } else if (bundle.containsKey("BILLING_CONFIG")) {
                try {
                    String optString = new JSONObject(bundle.getString("BILLING_CONFIG")).optString("countryCode");
                    k p02 = a10.a();
                    eg.r rVar = bVar.f3728b;
                    Intrinsics.checkNotNullParameter(p02, "p0");
                    if (p02.f4037a == 0) {
                        rVar.Q(optString);
                    } else {
                        rVar.Q(null);
                    }
                } catch (JSONException e9) {
                    p1.h("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e9);
                    k kVar2 = t0.j;
                    ((l1.a) s0Var).P(r0.b(65, 13, kVar2), i10);
                    bVar.a(kVar2);
                }
            } else {
                p1.g("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
                a10.f4033a = 6;
                k a12 = a10.a();
                ((l1.a) s0Var).P(r0.b(64, 13, a12), i10);
                bVar.a(a12);
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
