package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdcq implements com.google.android.gms.ads.internal.overlay.zzr {
    public final zzflo b;
    public final zzfld c;
    public final Clock d;
    public final zzeaj e;
    public final ScheduledExecutorService f;
    public final Object a = new Object();
    public final zzfsc g = zzfsd.D();
    public boolean h = false;
    public boolean i = false;

    public zzdcq(zzflo zzfloVar, zzfld zzfldVar, Clock clock, zzeaj zzeajVar, ScheduledExecutorService scheduledExecutorService) {
        this.b = zzfloVar;
        this.c = zzfldVar;
        this.d = clock;
        this.e = zzeajVar;
        this.f = scheduledExecutorService;
    }

    public final void a() {
        synchronized (this.a) {
            try {
                zzeaj zzeajVar = this.e;
                String str = this.b.b.b.b;
                String encodeToString = Base64.encodeToString(((zzfsd) this.g.o()).d(), 1);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Be)).booleanValue()) {
                    zzeai a = zzeajVar.a();
                    a.b("action", "pclma");
                    a.b("pclmd", encodeToString);
                    a.b("gqi", str);
                    a.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(int i) {
        synchronized (this.a) {
            try {
                if (!this.i && this.h) {
                    zzfsc zzfscVar = this.g;
                    zzfqs D = zzfqt.D();
                    D.n();
                    ((zzfqt) D.b).F(i);
                    long a = this.d.a();
                    D.n();
                    ((zzfqt) D.b).E(a);
                    zzfqt zzfqtVar = (zzfqt) D.o();
                    zzfscVar.n();
                    ((zzfsd) zzfscVar.b).E(zzfqtVar);
                    if (i == 10) {
                        a();
                        this.i = true;
                    }
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        b(3);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        b(5);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
        b(4);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        b(7);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
        b(8);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
        b(6);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
        b(9);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
        b(10);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdV() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdW(int i) {
    }
}
