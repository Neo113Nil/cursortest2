package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.zzbq;
import defpackage.qfn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class a implements Runnable {
    public final /* synthetic */ zzbq a;
    public final /* synthetic */ qfn b;

    public a(qfn qfnVar, zzbq zzbqVar) {
        this.a = zzbqVar;
        this.b = qfnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WearableListenerService S1 = this.b.S1("onChannelEvent");
        if (S1 == null) {
            return;
        }
        zzbq zzbqVar = this.a;
        zzbqVar.Y0(S1);
        zzbqVar.Y0(S1.h);
    }
}
