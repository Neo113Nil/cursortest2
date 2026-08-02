package com.google.android.gms.internal.consent_sdk;

import defpackage.a70;
import defpackage.e2f;
import defpackage.g5p;
import defpackage.haf;
import defpackage.k5p;
import defpackage.l3p;
import defpackage.muo;
import defpackage.v2p;
import defpackage.x2p;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class e implements g5p {
    public final zzrq a;
    public final haf b;
    public final boolean c;

    public e(haf hafVar, zzrq zzrqVar) {
        e2f e2fVar = v2p.a;
        this.b = hafVar;
        this.c = zzrqVar instanceof zzqk;
        this.a = zzrqVar;
    }

    @Override // defpackage.g5p
    public final boolean b(Object obj) {
        return ((zzqk) obj).zzb.h();
    }

    @Override // defpackage.g5p
    public final void c(Object obj) {
        this.b.getClass();
        zzsq zzsqVar = ((zzqm) obj).zzc;
        if (zzsqVar.d) {
            zzsqVar.d = false;
        }
        e2f e2fVar = v2p.a;
        ((zzqk) obj).zzb.e();
    }

    @Override // defpackage.g5p
    public final int d(zzqm zzqmVar) {
        zzqmVar.zzc.getClass();
        if (this.c) {
            return ((zzqk) zzqmVar).zzb.a.hashCode() + 26870523;
        }
        return 506991;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.g5p
    public final void e(Object obj, muo muoVar) {
        zzpv zzpvVar = (zzpv) muoVar.b;
        Iterator d = ((zzqk) obj).zzb.d();
        while (d.hasNext()) {
            Map.Entry entry = (Map.Entry) d.next();
            zzqe zzqeVar = (zzqe) entry.getKey();
            if (zzqeVar.zzc() != zzta.i || zzqeVar.zze() || zzqeVar.zzd()) {
                a70.r("Found invalid MessageSet item.");
                return;
            }
            if (entry instanceof l3p) {
                int zza = zzqeVar.zza();
                zzpm b = ((zzqz) ((l3p) entry).a.getValue()).b();
                if (b != 0) {
                    zzpvVar.s(zza, b);
                } else {
                    zzpvVar.r(zza, (zzrq) b);
                }
            } else {
                int zza2 = zzqeVar.zza();
                Object value = entry.getValue();
                if (value instanceof zzpm) {
                    zzpvVar.s(zza2, (zzpm) value);
                } else {
                    zzpvVar.r(zza2, (zzrq) value);
                }
            }
        }
        ((zzqm) obj).zzc.getClass();
    }

    @Override // defpackage.g5p
    public final int f(zzqm zzqmVar) {
        zzsq zzsqVar = zzqmVar.zzc;
        int i = zzsqVar.c;
        if (i == -1) {
            zzsqVar.c = 0;
            i = 0;
        }
        if (!this.c) {
            return i;
        }
        k5p k5pVar = ((zzqk) zzqmVar).zzb.a;
        int i2 = k5pVar.b;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += x2p.j(k5pVar.d(i4));
        }
        Iterator it = k5pVar.a().iterator();
        while (it.hasNext()) {
            i3 += x2p.j((Map.Entry) it.next());
        }
        return i + i3;
    }

    @Override // defpackage.g5p
    public final boolean g(zzqm zzqmVar, zzqm zzqmVar2) {
        if (!zzqmVar.zzc.equals(zzqmVar2.zzc)) {
            return false;
        }
        if (this.c) {
            return ((zzqk) zzqmVar).zzb.equals(((zzqk) zzqmVar2).zzb);
        }
        return true;
    }

    @Override // defpackage.g5p
    public final void h(Object obj, Object obj2) {
        f.p(obj, obj2);
        if (this.c) {
            e2f e2fVar = v2p.a;
            if (((zzqk) obj2).zzb.a.isEmpty()) {
                return;
            }
            throw null;
        }
    }

    @Override // defpackage.g5p
    public final Object zzc() {
        zzrq zzrqVar = this.a;
        if (zzrqVar instanceof zzqm) {
            return (zzqm) ((zzqm) zzrqVar).f(4);
        }
        zzqj zzu = zzrqVar.zzu();
        boolean e = zzu.b.e();
        zzqm zzqmVar = zzu.b;
        if (!e) {
            return zzqmVar;
        }
        zzqmVar.k();
        return zzu.b;
    }
}
