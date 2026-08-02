package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.anf;
import defpackage.bgf;
import defpackage.bm2;
import defpackage.cwo;
import defpackage.dff;
import defpackage.e2f;
import defpackage.fff;
import defpackage.gmo;
import defpackage.gvo;
import defpackage.haf;
import defpackage.igf;
import defpackage.jle;
import defpackage.jpe;
import defpackage.kif;
import defpackage.mxn;
import defpackage.n2f;
import defpackage.njo;
import defpackage.omf;
import defpackage.ox9;
import defpackage.pff;
import defpackage.u8f;
import defpackage.v9f;
import defpackage.w9f;
import defpackage.wje;
import defpackage.wkf;
import defpackage.x3f;
import defpackage.yhk;
import defpackage.zid;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzpv implements zznq {
    public final zzdp a;
    public final zzbd b;
    public final zzbe c;
    public final ox9 d;
    public final SparseArray e;
    public zzeg f;
    public zzno g;
    public zzea h;
    public boolean i;

    public zzpv(zzdp zzdpVar) {
        zzdpVar.getClass();
        this.a = zzdpVar;
        String str = zzfm.a;
        Looper myLooper = Looper.myLooper();
        this.f = new zzeg((myLooper == null ? Looper.getMainLooper() : myLooper).getThread());
        zzbd zzbdVar = new zzbd();
        this.b = zzbdVar;
        this.c = new zzbe();
        this.d = new ox9(zzbdVar);
        this.e = new SparseArray();
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void a(zzbv zzbvVar) {
        zznr r = r();
        n(r, 25, new mxn(20, r, zzbvVar));
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void b(int i, zzxo zzxoVar, zzxk zzxkVar) {
        zznr s = s(i, zzxoVar);
        n(s, 1004, new gvo(6, s, zzxkVar));
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void c(int i, zzba zzbaVar, zzba zzbaVar2) {
        if (i == 1) {
            this.i = false;
            i = 1;
        }
        zzno zznoVar = this.g;
        zznoVar.getClass();
        ox9 ox9Var = this.d;
        ox9Var.e = ox9.x(zznoVar, (zzgxm) ox9Var.c, (zzxo) ox9Var.f, (zzbd) ox9Var.b);
        zznr o = o();
        n(o, 11, new zid(o, i, zzbaVar, zzbaVar2));
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void d() {
        n(o(), IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK, new bgf(25));
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void e(int i, zzxo zzxoVar, zzxf zzxfVar, zzxk zzxkVar, int i2) {
        n(s(i, zzxoVar), 1000, new kif(25));
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void f(s sVar, zzxo zzxoVar) {
        zzno zznoVar = this.g;
        zznoVar.getClass();
        zzgxm x = zzgxm.x(sVar);
        ox9 ox9Var = this.d;
        ox9Var.c = x;
        if (!sVar.isEmpty()) {
            ox9Var.f = (zzxo) sVar.get(0);
            zzxoVar.getClass();
            ox9Var.g = zzxoVar;
        }
        if (((zzxo) ox9Var.e) == null) {
            ox9Var.e = ox9.x(zznoVar, (zzgxm) ox9Var.c, (zzxo) ox9Var.f, (zzbd) ox9Var.b);
        }
        ox9Var.v(zznoVar.zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void g(int i, zzxo zzxoVar, zzxf zzxfVar, zzxk zzxkVar, IOException iOException, boolean z) {
        zznr s = s(i, zzxoVar);
        n(s, 1003, new mxn(s, zzxfVar, zzxkVar, iOException, z));
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void h(int i) {
        zznr o = o();
        n(o, 4, new zid(o, i));
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void i(zzau zzauVar) {
        zzxo zzxoVar;
        n((!(zzauVar instanceof zzjn) || (zzxoVar = ((zzjn) zzauVar).h) == null) ? o() : q(zzxoVar), 10, new dff(26));
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void j(zzau zzauVar) {
        zzxo zzxoVar;
        zznr o = (!(zzauVar instanceof zzjn) || (zzxoVar = ((zzjn) zzauVar).h) == null) ? o() : q(zzxoVar);
        n(o, 10, new gmo(o, zzauVar));
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void k(int i, zzxo zzxoVar, zzxf zzxfVar, zzxk zzxkVar) {
        n(s(i, zzxoVar), 1001, new wkf(25));
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void l(int i, zzxo zzxoVar, zzxf zzxfVar, zzxk zzxkVar) {
        n(s(i, zzxoVar), 1002, new omf(25));
    }

    @Override // com.google.android.gms.internal.ads.zzabt
    public final void m(int i, long j, long j2) {
        Object next;
        Object obj;
        zzxo zzxoVar;
        ox9 ox9Var = this.d;
        if (((zzgxm) ox9Var.c).isEmpty()) {
            zzxoVar = null;
        } else {
            List list = (zzgxm) ox9Var.c;
            if (list != null) {
                if (list.isEmpty()) {
                    yhk.d();
                    return;
                }
                obj = list.get(list.size() - 1);
            } else if (list instanceof SortedSet) {
                obj = ((SortedSet) list).last();
            } else {
                Iterator it = list.iterator();
                do {
                    next = it.next();
                } while (it.hasNext());
                obj = next;
            }
            zzxoVar = (zzxo) obj;
        }
        zznr q = q(zzxoVar);
        n(q, 1006, new bm2(q, i, j, j2));
    }

    public final void n(zznr zznrVar, int i, zzeb zzebVar) {
        this.e.put(i, zznrVar);
        zzeg zzegVar = this.f;
        zzegVar.c(i, zzebVar);
        zzegVar.d();
    }

    public final zznr o() {
        return q((zzxo) this.d.e);
    }

    public final zznr p(zzbf zzbfVar, int i, zzxo zzxoVar) {
        zzxo zzxoVar2 = true == zzbfVar.g() ? null : zzxoVar;
        long zzb = this.a.zzb();
        boolean z = zzbfVar.equals(this.g.zzq()) && i == this.g.zzs();
        long j = 0;
        if (zzxoVar2 == null || !zzxoVar2.b()) {
            if (z) {
                zzno zznoVar = this.g;
                zznoVar.c.b();
                cwo cwoVar = zznoVar.b;
                cwoVar.o();
                j = cwoVar.f(cwoVar.V);
            } else if (!zzbfVar.g()) {
                zzbfVar.b(i, this.c, 0L).getClass();
                j = zzfm.t(0L);
            }
        } else if (z && this.g.g() == zzxoVar2.b && this.g.h() == zzxoVar2.c) {
            j = this.g.d();
        }
        zzxo zzxoVar3 = (zzxo) this.d.e;
        zzbf zzq = this.g.zzq();
        int zzs = this.g.zzs();
        long d = this.g.d();
        zzno zznoVar2 = this.g;
        zznoVar2.c.b();
        return new zznr(zzb, zzbfVar, i, zzxoVar2, j, zzq, zzs, zzxoVar3, d, zznoVar2.b.u());
    }

    public final zznr q(zzxo zzxoVar) {
        this.g.getClass();
        zzbf zzbfVar = zzxoVar == null ? null : (zzbf) ((njo) this.d.d).get(zzxoVar);
        if (zzxoVar != null && zzbfVar != null) {
            return p(zzbfVar, zzbfVar.o(zzxoVar.a, this.b).c, zzxoVar);
        }
        int zzs = this.g.zzs();
        zzbf zzq = this.g.zzq();
        if (zzs >= zzq.a()) {
            zzq = zzbf.a;
        }
        return p(zzq, zzs, null);
    }

    public final zznr r() {
        return q((zzxo) this.d.g);
    }

    public final zznr s(int i, zzxo zzxoVar) {
        zzno zznoVar = this.g;
        zznoVar.getClass();
        if (zzxoVar != null) {
            return ((zzbf) ((njo) this.d.d).get(zzxoVar)) != null ? q(zzxoVar) : p(zzbf.a, i, zzxoVar);
        }
        zzbf zzq = zznoVar.zzq();
        if (i >= zzq.a()) {
            zzq = zzbf.a;
        }
        return p(zzq, i, null);
    }

    public final void t(zzno zznoVar, Looper looper) {
        boolean z = true;
        if (this.g != null && !((zzgxm) this.d.c).isEmpty()) {
            z = false;
        }
        zzguk.f(z);
        this.g = zznoVar;
        zzdp zzdpVar = this.a;
        this.h = zzdpVar.a(looper, null);
        zzeg zzegVar = this.f;
        gvo gvoVar = new gvo(8, this, zznoVar);
        this.f = new zzeg(zzegVar.d, looper, looper.getThread(), zzdpVar, gvoVar, zzegVar.i);
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzB() {
        n(r(), IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, new anf(25));
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzb() {
        zzno zznoVar = this.g;
        zznoVar.getClass();
        ox9 ox9Var = this.d;
        ox9Var.e = ox9.x(zznoVar, (zzgxm) ox9Var.c, (zzxo) ox9Var.f, (zzbd) ox9Var.b);
        ox9Var.v(zznoVar.zzq());
        n(o(), 0, new wje(26));
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzc() {
        n(o(), 1, new jle(26));
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzd() {
        n(o(), 2, new jpe(26));
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zze() {
        n(o(), 14, new pff((byte) 0, 26));
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzf() {
        n(o(), 3, new e2f(26));
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzg() {
        n(o(), 13, new n2f(26));
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzh() {
        n(o(), -1, new x3f(26));
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzj() {
        n(o(), 5, new u8f(26));
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzk() {
        n(o(), 6, new w9f(26));
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzl() {
        n(o(), 7, new haf(26));
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzp() {
        n(o(), 12, new fff(26));
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzq() {
        n(r(), 21, new kif(26));
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzr() {
        n(r(), 22, new v9f(25));
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzs() {
        n(r(), 23, new igf(26));
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzu() {
        n(r(), 24, new igf(25));
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zza() {
    }
}
