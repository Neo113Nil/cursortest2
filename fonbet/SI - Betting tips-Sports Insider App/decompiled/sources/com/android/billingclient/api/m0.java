package com.android.billingclient.api;

import android.os.Parcel;
import com.google.android.gms.internal.play_billing.r5;
import com.google.android.gms.internal.play_billing.s5;
import com.google.android.gms.internal.play_billing.t5;
import com.google.android.gms.internal.play_billing.u5;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m0 extends com.google.android.gms.internal.play_billing.e {

    /* renamed from: f, reason: collision with root package name */
    public final s5 f4047f;

    public m0(s5 s5Var) {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback", 0);
        this.f4047f = s5Var;
    }

    @Override // com.google.android.gms.internal.play_billing.e
    public final boolean U(int i5, Parcel parcel, Parcel parcel2) {
        if (i5 != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        com.google.android.gms.internal.play_billing.f.b(parcel);
        Integer valueOf = Integer.valueOf(readInt);
        s5 s5Var = this.f4047f;
        s5Var.f5586d = true;
        u5 u5Var = s5Var.f5584b;
        if (u5Var != null) {
            t5 t5Var = u5Var.f5601b;
            t5Var.getClass();
            if (r5.f5561f.w(t5Var, null, valueOf)) {
                r5.d(t5Var);
                s5Var.f5583a = null;
                s5Var.f5584b = null;
                s5Var.f5585c = null;
            }
        }
        return true;
    }
}
