package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzatw;
import com.google.android.gms.internal.ads.zzaub;
import defpackage.fc6;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzbg implements zzatw {
    public final /* synthetic */ String a;
    public final /* synthetic */ zzbi b;

    public zzbg(zzbl zzblVar, String str, zzbi zzbiVar) {
        this.a = str;
        this.b = zzbiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final void zza(zzaub zzaubVar) {
        String obj = zzaubVar.toString();
        String str = this.a;
        String o = fc6.o(new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(obj).length()), "Failed to load URL: ", str, "\n", obj);
        int i = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(o);
        this.b.zza(null);
    }
}
