package com.google.android.gms.internal.measurement;

import defpackage.a70;
import defpackage.dan;
import defpackage.ewm;
import defpackage.gan;
import defpackage.odn;
import defpackage.pff;
import defpackage.rbn;
import defpackage.rdn;
import defpackage.tg0;
import defpackage.wt3;
import defpackage.x5n;
import defpackage.zz0;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class c implements odn {
    public final zzafc a;
    public final e b;
    public final boolean c;

    public c(e eVar, zzafc zzafcVar) {
        pff pffVar = dan.a;
        this.b = eVar;
        this.c = zzafcVar instanceof zzadr;
        this.a = zzafcVar;
    }

    @Override // defpackage.odn
    public final void a(Object obj, Object obj2) {
        d.b(obj, obj2);
        if (this.c) {
            pff pffVar = dan.a;
            if (((zzadr) obj2).zzb.a.isEmpty()) {
                return;
            }
            throw null;
        }
    }

    @Override // defpackage.odn
    public final boolean b(Object obj) {
        return ((zzadr) obj).zzb.d();
    }

    @Override // defpackage.odn
    public final void c(Object obj) {
        this.b.getClass();
        zzaga zzagaVar = ((zzadu) obj).zzc;
        if (zzagaVar.e) {
            zzagaVar.e = false;
        }
        pff pffVar = dan.a;
        ((zzadr) obj).zzb.a();
    }

    @Override // defpackage.odn
    public final void d(Object obj, ewm ewmVar) {
        Iterator b = ((zzadr) obj).zzb.b();
        while (b.hasNext()) {
            Map.Entry entry = (Map.Entry) b.next();
            zzadj zzadjVar = (zzadj) entry.getKey();
            if (zzadjVar.zzc() != zzagn.i || zzadjVar.zzd() || zzadjVar.zze()) {
                a70.r("Found invalid MessageSet item.");
                return;
            } else if (entry instanceof rbn) {
                ewmVar.h(zzadjVar.zza(), ((zzael) ((rbn) entry).a.getValue()).b());
            } else {
                ewmVar.h(zzadjVar.zza(), entry.getValue());
            }
        }
        zzaga zzagaVar = ((zzadu) obj).zzc;
        for (int i = 0; i < zzagaVar.a; i++) {
            ewmVar.h(zzagaVar.b[i] >>> 3, zzagaVar.c[i]);
        }
    }

    @Override // defpackage.odn
    public final void e(Object obj, byte[] bArr, int i, int i2, tg0 tg0Var) {
        zzadu zzaduVar = (zzadu) obj;
        if (zzaduVar.zzc == zzaga.f) {
            zzaduVar.zzc = zzaga.a();
        }
        throw null;
    }

    @Override // defpackage.odn
    public final void f(Object obj, zz0 zz0Var, zzadf zzadfVar) {
        this.b.getClass();
        e.a(obj);
        throw null;
    }

    @Override // defpackage.odn
    public final int g(zzadu zzaduVar) {
        int hashCode = zzaduVar.zzc.hashCode();
        if (!this.c) {
            return hashCode;
        }
        return ((zzadr) zzaduVar).zzb.a.hashCode() + (hashCode * 53);
    }

    @Override // defpackage.odn
    public final int h(zzadu zzaduVar) {
        zzaga zzagaVar = zzaduVar.zzc;
        int i = zzagaVar.d;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < zzagaVar.a; i2++) {
                int i3 = zzagaVar.b[i2] >>> 3;
                zzacr zzacrVar = (zzacr) zzagaVar.c[i2];
                int b = zzada.b(8);
                int b2 = zzada.b(i3) + zzada.b(16);
                int b3 = zzada.b(24);
                int d = zzacrVar.d();
                i = wt3.B(b + b, b2, x5n.c(d, d, b3), i);
            }
            zzagaVar.d = i;
        }
        if (!this.c) {
            return i;
        }
        rdn rdnVar = ((zzadr) zzaduVar).zzb.a;
        int i4 = rdnVar.b;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += gan.j(rdnVar.a(i6));
        }
        Iterator it = rdnVar.c().iterator();
        while (it.hasNext()) {
            i5 += gan.j((Map.Entry) it.next());
        }
        return i + i5;
    }

    @Override // defpackage.odn
    public final boolean i(zzadu zzaduVar, zzadu zzaduVar2) {
        if (!zzaduVar.zzc.equals(zzaduVar2.zzc)) {
            return false;
        }
        if (this.c) {
            return ((zzadr) zzaduVar).zzb.equals(((zzadr) zzaduVar2).zzb);
        }
        return true;
    }

    @Override // defpackage.odn
    public final Object zza() {
        zzafc zzafcVar = this.a;
        return zzafcVar instanceof zzadu ? ((zzadu) zzafcVar).n() : zzafcVar.b().a0();
    }
}
