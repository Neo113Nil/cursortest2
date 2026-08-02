package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k implements ServiceConnection {
    public final /* synthetic */ l a;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.zzba zzayVar;
        com.google.android.gms.internal.play_billing.zzc.h("BillingClientTesting", "Billing Override Service connected.");
        l lVar = this.a;
        int i = com.google.android.gms.internal.play_billing.zzaz.a;
        if (iBinder == null) {
            zzayVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
            zzayVar = queryLocalInterface instanceof com.google.android.gms.internal.play_billing.zzba ? (com.google.android.gms.internal.play_billing.zzba) queryLocalInterface : new com.google.android.gms.internal.play_billing.zzay(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
        }
        lVar.Q = zzayVar;
        lVar.P = 2;
        lVar.Y(26);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = com.google.android.gms.internal.play_billing.zzc.a;
        l lVar = this.a;
        lVar.Q = null;
        lVar.P = 0;
    }
}
