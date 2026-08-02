package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdxo implements zzdek {
    public final zzclm a;

    public zzdxo(zzclm zzclmVar) {
        this.a = zzclmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void M(Context context) {
        zzclm zzclmVar = this.a;
        if (zzclmVar != null) {
            zzclmVar.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void c(Context context) {
        zzclm zzclmVar = this.a;
        if (zzclmVar != null) {
            zzclmVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void zza(Context context) {
        zzclm zzclmVar = this.a;
        if (zzclmVar != null) {
            zzclmVar.onPause();
        }
    }
}
