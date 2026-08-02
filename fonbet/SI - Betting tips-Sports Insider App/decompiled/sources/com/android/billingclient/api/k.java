package com.android.billingclient.api;

import androidx.appcompat.widget.c1;
import com.google.android.gms.internal.play_billing.p1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public int f4037a;

    /* renamed from: b, reason: collision with root package name */
    public String f4038b;

    public static j a() {
        j jVar = new j();
        jVar.f4034b = "";
        return jVar;
    }

    public final String toString() {
        int i5 = this.f4037a;
        int i10 = p1.f5547a;
        com.google.android.gms.internal.play_billing.x0 x0Var = com.google.android.gms.internal.play_billing.n0.f5518c;
        Integer valueOf = Integer.valueOf(i5);
        return c1.o("Response Code: ", (!x0Var.containsKey(valueOf) ? com.google.android.gms.internal.play_billing.n0.RESPONSE_CODE_UNSPECIFIED : (com.google.android.gms.internal.play_billing.n0) x0Var.get(valueOf)).toString(), ", Debug Message: ", this.f4038b);
    }
}
