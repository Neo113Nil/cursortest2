package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbil;
import defpackage.hsn;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdzj implements zzinw {
    public final zzffs a;
    public final zziof b;
    public final zzioa c;

    public zzdzj(zzffs zzffsVar, zzcok zzcokVar, zzioa zzioaVar) {
        this.a = zzffsVar;
        this.b = zzcokVar;
        this.c = zzioaVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Set set;
        String str = this.a.a.a.h;
        zzioe.a(str);
        Context a = ((zzcok) this.b).a();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        Map zzb = this.c.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.k6)).booleanValue()) {
            zzbif zzbifVar = new zzbif(new zzbik(a));
            synchronized (zzbifVar) {
                if (zzbifVar.c) {
                    try {
                        zzbil.zzt.zza zzaVar = zzbifVar.b;
                        zzaVar.n();
                        ((zzbil.zzt) zzaVar.b).G(str);
                    } catch (NullPointerException e) {
                        com.google.android.gms.ads.internal.zzt.zzh().d("AdMobClearcutLogger.modify", e);
                    }
                }
            }
            set = Collections.singleton(new zzdlo(new zzdzm(zzbifVar, zzb), hsnVar));
        } else {
            set = Collections.EMPTY_SET;
        }
        zzioe.a(set);
        return set;
    }
}
