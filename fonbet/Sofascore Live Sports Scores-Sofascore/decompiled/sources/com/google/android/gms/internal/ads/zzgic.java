package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgic implements zzinw {
    public final zzinx a;

    public zzgic(zzinx zzinxVar) {
        this.a = zzinxVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        DisplayMetrics displayMetrics = ((Context) this.a.a).getResources().getDisplayMetrics();
        zzioe.a(displayMetrics);
        return displayMetrics;
    }
}
