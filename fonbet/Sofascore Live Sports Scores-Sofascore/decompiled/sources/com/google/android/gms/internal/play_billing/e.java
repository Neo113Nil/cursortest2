package com.google.android.gms.internal.play_billing;

import defpackage.a70;
import defpackage.apo;
import defpackage.cdo;
import defpackage.d1l;
import defpackage.fjo;
import defpackage.jpe;
import defpackage.qoo;
import defpackage.tg0;
import defpackage.vho;
import defpackage.wt3;
import defpackage.x5n;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class e implements qoo {
    public final zzhr a;
    public final boolean b;

    public e(jpe jpeVar, zzhr zzhrVar) {
        this.b = zzhrVar instanceof zzgm;
        this.a = zzhrVar;
    }

    @Override // defpackage.qoo
    public final void a(Object obj) {
        zzir zzirVar = ((zzgp) obj).zzc;
        if (zzirVar.e) {
            zzirVar.e = false;
        }
        ((zzgm) obj).zzb.e();
    }

    @Override // defpackage.qoo
    public final void b(Object obj, Object obj2) {
        f.o(obj, obj2);
        if (!this.b || ((zzgm) obj2).zzb.a.isEmpty()) {
            return;
        }
        throw null;
    }

    @Override // defpackage.qoo
    public final boolean c(Object obj) {
        return ((zzgm) obj).zzb.h();
    }

    @Override // defpackage.qoo
    public final boolean d(zzgp zzgpVar, zzgp zzgpVar2) {
        if (!zzgpVar.zzc.equals(zzgpVar2.zzc)) {
            return false;
        }
        if (this.b) {
            return ((zzgm) zzgpVar).zzb.equals(((zzgm) zzgpVar2).zzb);
        }
        return true;
    }

    @Override // defpackage.qoo
    public final void e(Object obj, byte[] bArr, int i, int i2, tg0 tg0Var) {
        zzgp zzgpVar = (zzgp) obj;
        if (zzgpVar.zzc == zzir.f) {
            zzgpVar.zzc = zzir.b();
        }
        throw null;
    }

    @Override // defpackage.qoo
    public final int f(zzgp zzgpVar) {
        zzir zzirVar = zzgpVar.zzc;
        int i = zzirVar.d;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < zzirVar.a; i2++) {
                int i3 = zzirVar.b[i2] >>> 3;
                zzfp zzfpVar = (zzfp) zzirVar.c[i2];
                int c = zzfx.c(8);
                int c2 = zzfx.c(i3) + zzfx.c(16);
                int c3 = zzfx.c(24);
                int m = zzfpVar.m();
                i = wt3.B(c + c, c2, x5n.C(m, m, c3), i);
            }
            zzirVar.d = i;
        }
        if (!this.b) {
            return i;
        }
        apo apoVar = ((zzgm) zzgpVar).zzb.a;
        int i4 = apoVar.b;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += cdo.j(apoVar.d(i6));
        }
        Iterator it = apoVar.a().iterator();
        while (it.hasNext()) {
            i5 += cdo.j((Map.Entry) it.next());
        }
        return i + i5;
    }

    @Override // defpackage.qoo
    public final void g(Object obj, d1l d1lVar) {
        zzfp zzfpVar;
        Iterator d = ((zzgm) obj).zzb.d();
        while (d.hasNext()) {
            Map.Entry entry = (Map.Entry) d.next();
            zzgg zzggVar = (zzgg) entry.getKey();
            if (zzggVar.zzc() != zzjh.i || zzggVar.zze() || zzggVar.zzd()) {
                a70.r("Found invalid MessageSet item.");
                return;
            }
            if (entry instanceof vho) {
                int zza = zzggVar.zza();
                fjo fjoVar = (fjo) ((vho) entry).a.getValue();
                if (fjoVar.c != null) {
                    zzfpVar = fjoVar.c;
                } else {
                    synchronized (fjoVar) {
                        try {
                            if (fjoVar.c != null) {
                                zzfpVar = fjoVar.c;
                            } else {
                                fjoVar.c = fjoVar.d.zzj();
                                zzfpVar = fjoVar.c;
                            }
                        } finally {
                        }
                    }
                }
                d1lVar.r(zza, zzfpVar);
            } else {
                d1lVar.r(zzggVar.zza(), entry.getValue());
            }
        }
        zzir zzirVar = ((zzgp) obj).zzc;
        for (int i = 0; i < zzirVar.a; i++) {
            d1lVar.r(zzirVar.b[i] >>> 3, zzirVar.c[i]);
        }
    }

    @Override // defpackage.qoo
    public final int h(zzgp zzgpVar) {
        int hashCode = zzgpVar.zzc.hashCode();
        if (!this.b) {
            return hashCode;
        }
        return ((zzgm) zzgpVar).zzb.a.hashCode() + (hashCode * 53);
    }

    @Override // defpackage.qoo
    public final Object zze() {
        zzhr zzhrVar = this.a;
        if (zzhrVar instanceof zzgp) {
            return (zzgp) ((zzgp) zzhrVar).i(4);
        }
        zzgl zzw = zzhrVar.zzw();
        boolean g = zzw.b.g();
        zzgp zzgpVar = zzw.b;
        if (!g) {
            return zzgpVar;
        }
        zzgpVar.o();
        return zzw.b;
    }
}
