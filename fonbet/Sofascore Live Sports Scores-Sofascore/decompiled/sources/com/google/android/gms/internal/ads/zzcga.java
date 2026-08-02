package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcga implements zzbga {
    public final com.google.android.gms.ads.internal.util.zzj b;
    public final zzcfx d;
    public final Object a = new Object();
    public final HashSet e = new HashSet();
    public final HashSet f = new HashSet();
    public boolean g = false;
    public final zzcfy c = new zzcfy();

    public zzcga(String str, com.google.android.gms.ads.internal.util.zzj zzjVar) {
        this.d = new zzcfx(str, zzjVar);
        this.b = zzjVar;
    }

    public final void a(zzcfp zzcfpVar) {
        synchronized (this.a) {
            this.e.add(zzcfpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zza(boolean z) {
        long a = com.google.android.gms.ads.internal.zzt.zzk().a();
        zzcfx zzcfxVar = this.d;
        com.google.android.gms.ads.internal.util.zzj zzjVar = this.b;
        if (!z) {
            zzjVar.zzl(a);
            zzjVar.zzn(zzcfxVar.d);
            return;
        }
        if (a - zzjVar.zzm() > ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.L1)).longValue()) {
            zzcfxVar.d = -1;
        } else {
            zzcfxVar.d = zzjVar.zzo();
        }
        this.g = true;
    }
}
