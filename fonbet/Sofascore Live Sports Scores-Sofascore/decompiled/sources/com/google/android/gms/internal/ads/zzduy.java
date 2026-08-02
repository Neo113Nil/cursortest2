package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzduy implements zzinw {
    public final zzinu a;
    public final zzdrj b;

    public zzduy(zzinu zzinuVar, zzdrj zzdrjVar) {
        this.a = zzinuVar;
        this.b = zzdrjVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        View view;
        zzdqm zzdqmVar = (zzdqm) this.a.zzb();
        zzdqr a = this.b.a();
        zzdux zzduxVar = new zzdux();
        synchronized (a) {
            view = a.o;
        }
        zzduxVar.a = view;
        zzduxVar.b = a.r();
        zzduxVar.c = zzdqmVar;
        zzduxVar.d = false;
        zzduxVar.e = false;
        if (a.h() != null) {
            a.h().W(zzduxVar);
        }
        return zzduxVar;
    }
}
