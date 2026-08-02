package com.google.android.gms.internal.ads;

import android.os.Bundle;
import defpackage.vlo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzejz implements zzdfd, zzdds {
    public static final Object c = new Object();
    public static int d;
    public final com.google.android.gms.ads.internal.util.zzg a;
    public final zzekj b;

    public zzejz(zzekj zzekjVar, com.google.android.gms.ads.internal.util.zzj zzjVar) {
        this.b = zzekjVar;
        this.a = zzjVar;
    }

    public final void a(boolean z) {
        int i;
        int intValue;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.n7)).booleanValue() && !this.a.zzx()) {
            Object obj = c;
            synchronized (obj) {
                i = d;
                intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.o7)).intValue();
            }
            if (i < intValue) {
                zzekj zzekjVar = this.b;
                zzfpp a = zzekjVar.d.a(new Bundle());
                a.addListener(new vlo(0, a, new q(zzekjVar, z)), zzcgj.h);
                synchronized (obj) {
                    d++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void i0(com.google.android.gms.ads.internal.client.zze zzeVar) {
        a(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzg() {
        a(true);
    }
}
