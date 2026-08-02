package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;
import defpackage.yih;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeof extends zzbvz implements zzdez {
    public zzbwa a;
    public yih b;

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void A4(int i, String str) {
        yih yihVar = this.b;
        if (yihVar != null) {
            synchronized (yihVar) {
                try {
                    if (!yihVar.b) {
                        yihVar.b = true;
                        if (str == null) {
                            str = zzers.c(i, ((zzemt) yihVar.c).a);
                        }
                        yihVar.v(new com.google.android.gms.ads.internal.client.zze(i, str, AdError.UNDEFINED_DOMAIN, null, null));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void D1(zzcct zzcctVar) {
        zzbwa zzbwaVar = this.a;
        if (zzbwaVar != null) {
            zzbwaVar.D1(zzcctVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void F1(String str, String str2) {
        zzbwa zzbwaVar = this.a;
        if (zzbwaVar != null) {
            zzbwaVar.F1(str, str2);
        }
    }

    public final synchronized void F4(zzeru zzeruVar) {
        this.a = zzeruVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void M(zzccx zzccxVar) {
        zzbwa zzbwaVar = this.a;
        if (zzbwaVar != null) {
            zzbwaVar.M(zzccxVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void S(com.google.android.gms.ads.internal.client.zze zzeVar) {
        yih yihVar = this.b;
        if (yihVar != null) {
            synchronized (yihVar) {
                if (!yihVar.b) {
                    yihVar.b = true;
                    yihVar.v(zzeVar);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void T3(zzbnm zzbnmVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdez
    public final synchronized void Z1(yih yihVar) {
        this.b = yihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void f(int i) {
        yih yihVar = this.b;
        if (yihVar != null) {
            yihVar.u(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void j0(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzbwa zzbwaVar = this.a;
        if (zzbwaVar != null) {
            zzbwaVar.j0(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zze() {
        zzbwa zzbwaVar = this.a;
        if (zzbwaVar != null) {
            zzbwaVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzf() {
        zzbwa zzbwaVar = this.a;
        if (zzbwaVar != null) {
            zzbwaVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzh() {
        zzbwa zzbwaVar = this.a;
        if (zzbwaVar != null) {
            zzbwaVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzi() {
        zzbwa zzbwaVar = this.a;
        if (zzbwaVar != null) {
            zzbwaVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzj() {
        try {
            zzbwa zzbwaVar = this.a;
            if (zzbwaVar != null) {
                zzbwaVar.zzj();
            }
            yih yihVar = this.b;
            if (yihVar != null) {
                yihVar.t();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzk() {
        zzbwa zzbwaVar = this.a;
        if (zzbwaVar != null) {
            zzbwaVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzn() {
        zzbwa zzbwaVar = this.a;
        if (zzbwaVar != null) {
            zzbwaVar.zzn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzo() {
        zzbwa zzbwaVar = this.a;
        if (zzbwaVar != null) {
            zzbwaVar.zzo();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzq() {
        zzbwa zzbwaVar = this.a;
        if (zzbwaVar != null) {
            zzbwaVar.zzq();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzs(int i) {
        zzbwa zzbwaVar = this.a;
        if (zzbwaVar != null) {
            zzbwaVar.zzs(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzt() {
        zzbwa zzbwaVar = this.a;
        if (zzbwaVar != null) {
            zzbwaVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzu() {
        zzbwa zzbwaVar = this.a;
        if (zzbwaVar != null) {
            zzbwaVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzv(String str) {
        zzbwa zzbwaVar = this.a;
        if (zzbwaVar != null) {
            zzbwaVar.zzv(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final synchronized void zzz() {
        zzbwa zzbwaVar = this.a;
        if (zzbwaVar != null) {
            zzbwaVar.zzz();
        }
    }
}
