package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbil;
import defpackage.mxn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdyz implements zzdgv, zzdfd, zzdds, zzdej, com.google.android.gms.ads.internal.client.zza, zzdjg {
    public final zzbif a;
    public boolean b = false;

    public zzdyz(zzbif zzbifVar, zzfiy zzfiyVar) {
        this.a = zzbifVar;
        zzbifVar.c(2);
        if (zzfiyVar != null) {
            zzbifVar.c(1101);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void D(zzbil.zzb zzbVar) {
        zzbif zzbifVar = this.a;
        synchronized (zzbifVar) {
            if (zzbifVar.c) {
                try {
                    zzbifVar.b.q(zzbVar);
                } catch (NullPointerException e) {
                    com.google.android.gms.ads.internal.zzt.zzh().d("AdMobClearcutLogger.modify", e);
                }
            }
        }
        zzbifVar.c(1102);
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void N(zzflo zzfloVar) {
        this.a.b(new mxn(zzfloVar, 4));
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void b0(boolean z) {
        this.a.c(true != z ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void c0(boolean z) {
        this.a.c(true != z ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void h(zzbil.zzb zzbVar) {
        zzbif zzbifVar = this.a;
        synchronized (zzbifVar) {
            if (zzbifVar.c) {
                try {
                    zzbifVar.b.q(zzbVar);
                } catch (NullPointerException e) {
                    com.google.android.gms.ads.internal.zzt.zzh().d("AdMobClearcutLogger.modify", e);
                }
            }
        }
        zzbifVar.c(1104);
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void i0(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i = zzeVar.zza;
        zzbif zzbifVar = this.a;
        switch (i) {
            case 1:
                zzbifVar.c(101);
                break;
            case 2:
                zzbifVar.c(102);
                break;
            case 3:
                zzbifVar.c(5);
                break;
            case 4:
                zzbifVar.c(103);
                break;
            case 5:
                zzbifVar.c(104);
                break;
            case 6:
                zzbifVar.c(105);
                break;
            case 7:
                zzbifVar.c(106);
                break;
            default:
                zzbifVar.c(4);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final synchronized void j() {
        this.a.c(6);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        boolean z = this.b;
        zzbif zzbifVar = this.a;
        if (z) {
            zzbifVar.c(8);
        } else {
            zzbifVar.c(7);
            this.b = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void t(zzbil.zzb zzbVar) {
        zzbif zzbifVar = this.a;
        synchronized (zzbifVar) {
            if (zzbifVar.c) {
                try {
                    zzbifVar.b.q(zzbVar);
                } catch (NullPointerException e) {
                    com.google.android.gms.ads.internal.zzt.zzh().d("AdMobClearcutLogger.modify", e);
                }
            }
        }
        zzbifVar.c(1103);
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzg() {
        this.a.c(3);
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzo() {
        this.a.c(1109);
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void Z(zzcbv zzcbvVar) {
    }
}
