package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.wt3;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdvi implements zzbqh {
    public final zzbnw a;
    public final zzdvv b;
    public final zzinq c;

    public zzdvi(zzdrb zzdrbVar, zzdqr zzdqrVar, zzdvv zzdvvVar, zzinq zzinqVar) {
        this.a = (zzbnw) zzdrbVar.g.get(zzdqrVar.g());
        this.b = zzdvvVar;
        this.c = zzinqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void a(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.a.C1((zzbnm) this.c.zzb(), str);
        } catch (RemoteException e) {
            String m = wt3.m("Failed to call onCustomClick for asset ", str, new StringBuilder(String.valueOf(str).length() + 40), ".");
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj(m, e);
        }
    }
}
