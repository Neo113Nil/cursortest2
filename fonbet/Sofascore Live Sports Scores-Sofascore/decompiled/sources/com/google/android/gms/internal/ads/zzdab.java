package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbil;
import defpackage.bsn;
import java.util.LinkedList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdab implements zzdfd, com.google.android.gms.ads.internal.client.zza, zzdgv, zzdej, zzddp, zzdjg {
    public final Clock a;
    public final zzcfp b;

    public zzdab(Clock clock, zzcfp zzcfpVar) {
        this.a = clock;
        this.b = zzcfpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void I() {
        zzcfp zzcfpVar = this.b;
        synchronized (zzcfpVar.d) {
            try {
                if (zzcfpVar.k != -1) {
                    LinkedList linkedList = zzcfpVar.c;
                    if (!linkedList.isEmpty()) {
                        bsn bsnVar = (bsn) linkedList.getLast();
                        if (bsnVar.b == -1) {
                            bsnVar.b = bsnVar.c.a.elapsedRealtime();
                            zzcfpVar.b.a(zzcfpVar);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void N(zzflo zzfloVar) {
        Clock clock = this.a;
        zzcfp zzcfpVar = this.b;
        long elapsedRealtime = clock.elapsedRealtime();
        synchronized (zzcfpVar.d) {
            try {
                zzcfpVar.k = elapsedRealtime;
                if (elapsedRealtime != -1) {
                    zzcfpVar.b.a(zzcfpVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void h(zzbil.zzb zzbVar) {
        zzcfp zzcfpVar = this.b;
        synchronized (zzcfpVar.d) {
            zzcga zzcgaVar = zzcfpVar.b;
            synchronized (zzcgaVar.a) {
                zzcgaVar.d.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final void j() {
        zzcfp zzcfpVar = this.b;
        synchronized (zzcfpVar.d) {
            try {
                if (zzcfpVar.k != -1 && zzcfpVar.g == -1) {
                    zzcfpVar.g = zzcfpVar.a.elapsedRealtime();
                    zzcfpVar.b.a(zzcfpVar);
                }
                zzcga zzcgaVar = zzcfpVar.b;
                synchronized (zzcgaVar.a) {
                    zzcfx zzcfxVar = zzcgaVar.d;
                    synchronized (zzcfxVar.f) {
                        zzcfxVar.k++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcfp zzcfpVar = this.b;
        synchronized (zzcfpVar.d) {
            if (zzcfpVar.k != -1) {
                bsn bsnVar = new bsn(zzcfpVar);
                bsnVar.a = bsnVar.c.a.elapsedRealtime();
                zzcfpVar.c.add(bsnVar);
                zzcfpVar.i++;
                zzcga zzcgaVar = zzcfpVar.b;
                synchronized (zzcgaVar.a) {
                    zzcfx zzcfxVar = zzcgaVar.d;
                    synchronized (zzcfxVar.f) {
                        zzcfxVar.j++;
                    }
                }
                zzcgaVar.a(zzcfpVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void t(zzbil.zzb zzbVar) {
        zzcfp zzcfpVar = this.b;
        synchronized (zzcfpVar.d) {
            zzcga zzcgaVar = zzcfpVar.b;
            synchronized (zzcgaVar.a) {
                zzcgaVar.d.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzg() {
        zzcfp zzcfpVar = this.b;
        synchronized (zzcfpVar.d) {
            try {
                if (zzcfpVar.k != -1) {
                    zzcfpVar.h = zzcfpVar.a.elapsedRealtime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void L() {
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void a0() {
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzo() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void D(zzbil.zzb zzbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void Z(zzcbv zzcbvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void b0(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void c0(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void n(zzcce zzcceVar, String str, String str2) {
    }
}
