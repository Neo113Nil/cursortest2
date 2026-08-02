package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.f8n;
import defpackage.igf;
import defpackage.kep;
import defpackage.l8n;
import defpackage.mep;
import defpackage.v8n;
import defpackage.xto;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzyy extends zzwp {
    public final zzhr i;
    public final xto j;
    public final int l;
    public boolean o;
    public boolean p;
    public boolean q;
    public zziq r;
    public zzak s;
    public final igf k = zzus.H7;
    public boolean m = true;
    public long n = C.TIME_UNSET;

    public /* synthetic */ zzyy(zzak zzakVar, zzhr zzhrVar, xto xtoVar, zzabz zzabzVar, int i) {
        this.s = zzakVar;
        this.i = zzhrVar;
        this.j = xtoVar;
        this.l = i;
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final synchronized zzak b() {
        return this.s;
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void c(zzxm zzxmVar) {
        kep kepVar = (kep) zzxmVar;
        if (kepVar.v) {
            for (zzzf zzzfVar : kepVar.s) {
                zzzfVar.o();
                if (zzzfVar.g != null) {
                    zzzfVar.g = null;
                    zzzfVar.f = null;
                }
            }
        }
        zzaci zzaciVar = kepVar.j;
        f8n f8nVar = zzaciVar.b;
        if (f8nVar != null) {
            f8nVar.a(true);
        }
        v8n v8nVar = zzaciVar.a;
        v8nVar.execute(new l8n(kepVar, 0));
        ((ExecutorService) v8nVar.a).shutdown();
        kepVar.o.removeCallbacksAndMessages(null);
        kepVar.p = null;
        kepVar.N = true;
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final synchronized void g(zzak zzakVar) {
        this.s = zzakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final zzxm k(zzxo zzxoVar, zzabp zzabpVar, long j) {
        zzhs zza = this.i.zza();
        zziq zziqVar = this.r;
        if (zziqVar != null) {
            zza.c(zziqVar);
        }
        zzag zzagVar = b().b;
        zzagVar.getClass();
        Uri uri = zzagVar.a;
        this.g.getClass();
        return new kep(uri, zza, new zzws((zzagn) this.j.b), this.k, new zzun(this.d.b, zzxoVar), new zzxy(this.c.b, zzxoVar), this, zzabpVar, this.l, zzfm.u(C.TIME_UNSET));
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final void o(zziq zziqVar) {
        this.r = zziqVar;
        Looper.myLooper().getClass();
        this.g.getClass();
        t();
    }

    public final void s(long j, zzahk zzahkVar, boolean z) {
        if (this.q && zzahkVar.zzj()) {
            return;
        }
        this.q = !zzahkVar.zzj();
        if (j == C.TIME_UNSET) {
            j = this.n;
        }
        boolean zzb = zzahkVar.zzb();
        if (!this.m && this.n == j && this.o == zzb && this.p == z) {
            return;
        }
        this.n = j;
        this.o = zzb;
        this.p = z;
        this.m = false;
        t();
    }

    public final void t() {
        long j = this.n;
        boolean z = this.o;
        boolean z2 = this.p;
        zzak b = b();
        zzbf zzzkVar = new zzzk(j, j, z, b, z2 ? b.c : null);
        if (this.m) {
            zzzkVar = new mep(zzzkVar);
        }
        r(zzzkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final void q() {
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zzu() {
    }
}
