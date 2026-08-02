package com.google.android.gms.ads.internal.overlay;

import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzd implements View.OnClickListener {
    public final /* synthetic */ zzm a;

    public zzd(zzm zzmVar) {
        this.a = zzmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzm zzmVar = this.a;
        zzmVar.w = 2;
        zzmVar.a.finish();
    }
}
