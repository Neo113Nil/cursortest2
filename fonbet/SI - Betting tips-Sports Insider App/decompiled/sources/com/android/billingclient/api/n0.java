package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.play_billing.p1;
import com.google.android.gms.internal.play_billing.s4;
import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4054a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4055b;

    public /* synthetic */ n0(int i5, Object obj) {
        this.f4054a = i5;
        this.f4055b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.i gVar;
        switch (this.f4054a) {
            case 0:
                p1.f("BillingClientTesting", "Billing Override Service connected.");
                o0 o0Var = (o0) this.f4055b;
                int i5 = com.google.android.gms.internal.play_billing.h.f5461f;
                if (iBinder == null) {
                    gVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    gVar = queryLocalInterface instanceof com.google.android.gms.internal.play_billing.i ? (com.google.android.gms.internal.play_billing.i) queryLocalInterface : new com.google.android.gms.internal.play_billing.g(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 1);
                }
                o0Var.I = gVar;
                ((o0) this.f4055b).H = 2;
                o0 o0Var2 = (o0) this.f4055b;
                s4 d10 = r0.d(26);
                Objects.requireNonNull(d10, "ApiSuccess should not be null");
                o0Var2.f3987g.Q(d10);
                break;
            case 1:
                d8.c cVar = (d8.c) this.f4055b;
                cVar.f8281b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                cVar.a().post(new d8.a(this, iBinder));
                break;
            default:
                y7.n nVar = (y7.n) this.f4055b;
                nVar.f25708b.g("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                nVar.a().post(new y7.m(this, iBinder));
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i5 = 1;
        int i10 = 0;
        switch (this.f4054a) {
            case 0:
                p1.g("BillingClientTesting", "Billing Override Service disconnected.");
                ((o0) this.f4055b).I = null;
                ((o0) this.f4055b).H = 0;
                break;
            case 1:
                d8.c cVar = (d8.c) this.f4055b;
                cVar.f8281b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                cVar.a().post(new d8.b(i10, this));
                break;
            default:
                y7.n nVar = (y7.n) this.f4055b;
                nVar.f25708b.g("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                nVar.a().post(new y7.l(i5, this));
                break;
        }
    }
}
