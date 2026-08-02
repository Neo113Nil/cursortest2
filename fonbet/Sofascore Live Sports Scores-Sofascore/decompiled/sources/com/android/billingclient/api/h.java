package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzjs;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class h extends com.google.android.gms.internal.play_billing.zzaj {
    public final c a;
    public final Boolean b;
    public final int c;
    public final /* synthetic */ a d;

    public /* synthetic */ h(a aVar, c cVar, Boolean bool, int i) {
        this.d = aVar;
        this.a = cVar;
        this.b = bool;
        this.c = i;
    }

    public final void Z1(c cVar, BillingResult billingResult, zzjs zzjsVar, boolean z, String str, int i) {
        this.d.K(0);
        cVar.d(billingResult, zzjsVar, str, z, i);
        cVar.g(billingResult);
    }
}
