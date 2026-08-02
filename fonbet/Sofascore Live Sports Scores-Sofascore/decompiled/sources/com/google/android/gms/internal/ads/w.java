package com.google.android.gms.internal.ads;

import defpackage.a70;
import defpackage.b1l;
import defpackage.ceo;
import defpackage.nqo;
import defpackage.oqo;
import defpackage.tg0;
import defpackage.vpo;
import defpackage.wt3;
import defpackage.ypo;
import defpackage.zpo;
import defpackage.zz0;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class w implements nqo {
    public final zzigw a;
    public final boolean b;

    public w(z zVar, zzigw zzigwVar) {
        this.b = zzigwVar instanceof zzifi;
        this.a = zzigwVar;
    }

    @Override // defpackage.nqo
    public final void a(Object obj, Object obj2) {
        y.d(obj, obj2);
        if (!this.b || ((zzifi) obj2).zza.a.isEmpty()) {
            return;
        }
        throw null;
    }

    @Override // defpackage.nqo
    public final boolean b(Object obj) {
        return ((zzifi) obj).zza.d();
    }

    @Override // defpackage.nqo
    public final void c(Object obj) {
        zziib zziibVar = ((zzifm) obj).zzt;
        if (zziibVar.e) {
            zziibVar.e = false;
        }
        ((zzifi) obj).zza.a();
    }

    @Override // defpackage.nqo
    public final void d(Object obj, byte[] bArr, int i, int i2, tg0 tg0Var) {
        zzifm zzifmVar = (zzifm) obj;
        if (zzifmVar.zzt == zziib.f) {
            zzifmVar.zzt = zziib.a();
        }
        throw null;
    }

    @Override // defpackage.nqo
    public final void e(Object obj, zz0 zz0Var, zziew zziewVar) {
        z.b(obj);
        throw null;
    }

    @Override // defpackage.nqo
    public final void f(Object obj, b1l b1lVar) {
        zziei zzieiVar;
        Iterator b = ((zzifi) obj).zza.b();
        while (b.hasNext()) {
            Map.Entry entry = (Map.Entry) b.next();
            zzifa zzifaVar = (zzifa) entry.getKey();
            if (zzifaVar.zzc() != zziio.i || zzifaVar.zzd() || zzifaVar.zze()) {
                a70.r("Found invalid MessageSet item.");
                return;
            }
            if (entry instanceof ypo) {
                int zza = zzifaVar.zza();
                zpo zpoVar = (zpo) ((ypo) entry).a.getValue();
                if (zpoVar.b != null) {
                    zzieiVar = zpoVar.b;
                } else {
                    synchronized (zpoVar) {
                        try {
                            if (zpoVar.b != null) {
                                zzieiVar = zpoVar.b;
                            } else {
                                zpoVar.b = zpoVar.c.e();
                                zzieiVar = zpoVar.b;
                            }
                        } finally {
                        }
                    }
                }
                b1lVar.n(zza, zzieiVar);
            } else {
                b1lVar.n(zzifaVar.zza(), entry.getValue());
            }
        }
        zziib zziibVar = ((zzifm) obj).zzt;
        for (int i = 0; i < zziibVar.a; i++) {
            b1lVar.n(zziibVar.b[i] >>> 3, zziibVar.c[i]);
        }
    }

    @Override // defpackage.nqo
    public final boolean g(zzifm zzifmVar, zzifm zzifmVar2) {
        if (!zzifmVar.zzt.equals(zzifmVar2.zzt)) {
            return false;
        }
        if (this.b) {
            return ((zzifi) zzifmVar).zza.equals(((zzifi) zzifmVar2).zza);
        }
        return true;
    }

    @Override // defpackage.nqo
    public final int h(zzifm zzifmVar) {
        zziib zziibVar = zzifmVar.zzt;
        int i = zziibVar.d;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < zziibVar.a; i2++) {
                int i3 = zziibVar.b[i2] >>> 3;
                zziei zzieiVar = (zziei) zziibVar.c[i2];
                int b = zzier.b(8);
                int b2 = zzier.b(i3) + zzier.b(16);
                int b3 = zzier.b(24);
                int o = zzieiVar.o();
                i = wt3.B(b + b, b2, ceo.b(o, o, b3), i);
            }
            zziibVar.d = i;
        }
        if (!this.b) {
            return i;
        }
        oqo oqoVar = ((zzifi) zzifmVar).zza.a;
        int i4 = oqoVar.b;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += vpo.j(oqoVar.a(i6));
        }
        Iterator it = oqoVar.c().iterator();
        while (it.hasNext()) {
            i5 += vpo.j((Map.Entry) it.next());
        }
        return i + i5;
    }

    @Override // defpackage.nqo
    public final int i(zzifm zzifmVar) {
        int hashCode = zzifmVar.zzt.hashCode();
        if (!this.b) {
            return hashCode;
        }
        return ((zzifi) zzifmVar).zza.a.hashCode() + (hashCode * 53);
    }

    @Override // defpackage.nqo
    public final Object zza() {
        zzigw zzigwVar = this.a;
        return zzigwVar instanceof zzifm ? ((zzifm) zzigwVar).t() : zzigwVar.i().T();
    }
}
