package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzfsv;
import com.google.android.gms.internal.ads.zzfsw;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbt extends zzb {
    public final com.google.android.gms.ads.internal.util.client.zzu b;
    public final String c;
    public final com.google.android.gms.ads.internal.util.client.zzv d;

    public zzbt(Context context, String str, String str2, @Nullable zzfsw zzfswVar, @Nullable com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        this.b = new com.google.android.gms.ads.internal.util.client.zzu(context, com.google.android.gms.ads.internal.zzt.zzc().zze(context, str));
        this.c = str2;
        this.d = zzvVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        String str = this.c;
        com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.d;
        com.google.android.gms.ads.internal.util.client.zzu zzuVar = this.b;
        if (zzvVar != null) {
            new zzfsv(zzvVar.zza(), zzuVar, zzcgj.e, null, null).a(str);
        } else {
            zzuVar.zzc(str, null);
        }
    }
}
