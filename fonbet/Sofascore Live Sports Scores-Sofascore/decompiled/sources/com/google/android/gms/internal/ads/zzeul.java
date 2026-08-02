package com.google.android.gms.internal.ads;

import defpackage.fjn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeul {
    public final zzeux a;
    public final String b;
    public zzddi c;

    public zzeul(zzeux zzeuxVar, String str) {
        this.a = zzeuxVar;
        this.b = str;
    }

    public final synchronized void a(com.google.android.gms.ads.internal.client.zzm zzmVar, int i) {
        this.c = null;
        zzeur zzeurVar = new zzeur(i);
        fjn fjnVar = new fjn(this);
        this.a.a(zzmVar, this.b, zzeurVar, fjnVar);
    }
}
