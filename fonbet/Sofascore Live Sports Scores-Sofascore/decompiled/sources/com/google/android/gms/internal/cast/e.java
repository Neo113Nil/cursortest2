package com.google.android.gms.internal.cast;

import defpackage.a70;
import defpackage.bgp;
import defpackage.eep;
import defpackage.ggp;
import defpackage.mxn;
import defpackage.omf;
import defpackage.rcp;
import defpackage.tcp;
import defpackage.ubf;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class e implements bgp {
    public final zzzi a;
    public final ubf b;
    public final boolean c;

    public e(ubf ubfVar, zzzi zzziVar) {
        omf omfVar = rcp.a;
        this.b = ubfVar;
        this.c = zzziVar instanceof zzyb;
        this.a = zzziVar;
    }

    @Override // defpackage.bgp
    public final void a(Object obj, Object obj2) {
        f.b(obj, obj2);
        if (this.c) {
            omf omfVar = rcp.a;
            if (((zzyb) obj2).zzb.a.isEmpty()) {
                return;
            }
            throw null;
        }
    }

    @Override // defpackage.bgp
    public final boolean b(Object obj) {
        return ((zzyb) obj).zzb.d();
    }

    @Override // defpackage.bgp
    public final boolean c(zzyd zzydVar, zzyd zzydVar2) {
        if (!zzydVar.zzc.equals(zzydVar2.zzc)) {
            return false;
        }
        if (this.c) {
            return ((zzyb) zzydVar).zzb.equals(((zzyb) zzydVar2).zzb);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bgp
    public final void d(Object obj, mxn mxnVar) {
        zzxp zzxpVar = (zzxp) mxnVar.b;
        Iterator b = ((zzyb) obj).zzb.b();
        while (b.hasNext()) {
            Map.Entry entry = (Map.Entry) b.next();
            zzxv zzxvVar = (zzxv) entry.getKey();
            if (zzxvVar.zzc() != zzaao.i || zzxvVar.zzd() || zzxvVar.zze()) {
                a70.r("Found invalid MessageSet item.");
                return;
            }
            if (entry instanceof eep) {
                int zza = zzxvVar.zza();
                zzxk b2 = ((zzys) ((eep) entry).a.getValue()).b();
                if (b2 != 0) {
                    zzxpVar.l(zza, b2);
                } else {
                    zzxpVar.k(zza, (zzzi) b2);
                }
            } else {
                int zza2 = zzxvVar.zza();
                Object value = entry.getValue();
                if (value instanceof zzxk) {
                    zzxpVar.l(zza2, (zzxk) value);
                } else {
                    zzxpVar.k(zza2, (zzzi) value);
                }
            }
        }
        ((zzyd) obj).zzc.getClass();
    }

    @Override // defpackage.bgp
    public final int e(zzyd zzydVar) {
        zzaae zzaaeVar = zzydVar.zzc;
        int i = zzaaeVar.c;
        if (i == -1) {
            zzaaeVar.c = 0;
            i = 0;
        }
        if (!this.c) {
            return i;
        }
        ggp ggpVar = ((zzyb) zzydVar).zzb.a;
        int i2 = ggpVar.b;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += tcp.g(ggpVar.a(i4));
        }
        Iterator it = ggpVar.c().iterator();
        while (it.hasNext()) {
            i3 += tcp.g((Map.Entry) it.next());
        }
        return i + i3;
    }

    @Override // defpackage.bgp
    public final int f(zzyd zzydVar) {
        zzydVar.zzc.getClass();
        if (this.c) {
            return ((zzyb) zzydVar).zzb.a.hashCode() + 26870523;
        }
        return 506991;
    }

    @Override // defpackage.bgp
    public final void g(Object obj) {
        this.b.getClass();
        zzaae zzaaeVar = ((zzyd) obj).zzc;
        if (zzaaeVar.d) {
            zzaaeVar.d = false;
        }
        omf omfVar = rcp.a;
        ((zzyb) obj).zzb.a();
    }

    @Override // defpackage.bgp
    public final Object zza() {
        zzzi zzziVar = this.a;
        if (zzziVar instanceof zzyd) {
            return (zzyd) ((zzyd) zzziVar).i(4, null);
        }
        zzya m = zzziVar.m();
        boolean k = m.b.k();
        zzyd zzydVar = m.b;
        if (!k) {
            return zzydVar;
        }
        zzydVar.c();
        return m.b;
    }
}
