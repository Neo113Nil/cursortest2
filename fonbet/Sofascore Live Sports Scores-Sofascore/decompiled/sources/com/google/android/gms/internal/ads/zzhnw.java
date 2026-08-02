package com.google.android.gms.internal.ads;

import defpackage.bno;
import defpackage.hbo;
import defpackage.mno;
import defpackage.nno;
import defpackage.w9f;
import defpackage.wt3;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhnw {
    public static final zzhnw b;
    public final AtomicReference a = new AtomicReference(new zzhpa(new zzhox()));

    static {
        try {
            zzhnw zzhnwVar = new zzhnw();
            zzhnwVar.a(new bno(zzhne.class, w9f.n));
            b = zzhnwVar;
        } catch (Exception e) {
            hbo.j(e);
        }
    }

    public final synchronized void a(zzhna zzhnaVar) {
        AtomicReference atomicReference = this.a;
        zzhox zzhoxVar = new zzhox((zzhpa) atomicReference.get());
        zzhoxVar.a(zzhnaVar);
        atomicReference.set(new zzhpa(zzhoxVar));
    }

    public final synchronized void b(zzhmx zzhmxVar) {
        AtomicReference atomicReference = this.a;
        zzhox zzhoxVar = new zzhox((zzhpa) atomicReference.get());
        zzhoxVar.b(zzhmxVar);
        atomicReference.set(new zzhpa(zzhoxVar));
    }

    public final synchronized void c(zzhod zzhodVar) {
        AtomicReference atomicReference = this.a;
        zzhox zzhoxVar = new zzhox((zzhpa) atomicReference.get());
        zzhoxVar.c(zzhodVar);
        atomicReference.set(new zzhpa(zzhoxVar));
    }

    public final synchronized void d(zzhoa zzhoaVar) {
        AtomicReference atomicReference = this.a;
        zzhox zzhoxVar = new zzhox((zzhpa) atomicReference.get());
        zzhoxVar.d(zzhoaVar);
        atomicReference.set(new zzhpa(zzhoxVar));
    }

    public final zzhes e(zzhos zzhosVar, zzhfr zzhfrVar) {
        zzhpa zzhpaVar = (zzhpa) this.a.get();
        zzhpaVar.getClass();
        mno mnoVar = new mno(zzhos.class, zzhosVar.b);
        HashMap hashMap = zzhpaVar.b;
        if (hashMap.containsKey(mnoVar)) {
            return ((zzhmx) hashMap.get(mnoVar)).a(zzhosVar, zzhfrVar);
        }
        String mnoVar2 = mnoVar.toString();
        throw new GeneralSecurityException(wt3.m("No Key Parser for requested key type ", mnoVar2, new StringBuilder(mnoVar2.length() + 47), " available"));
    }

    public final zzhow f(zzhes zzhesVar, zzhfr zzhfrVar) {
        zzhpa zzhpaVar = (zzhpa) this.a.get();
        zzhpaVar.getClass();
        nno nnoVar = new nno(zzhesVar.getClass(), zzhos.class);
        HashMap hashMap = zzhpaVar.a;
        if (hashMap.containsKey(nnoVar)) {
            return ((zzhna) hashMap.get(nnoVar)).a(zzhesVar, zzhfrVar);
        }
        String nnoVar2 = nnoVar.toString();
        throw new GeneralSecurityException(wt3.m("No Key serializer for ", nnoVar2, new StringBuilder(nnoVar2.length() + 32), " available"));
    }

    public final zzhfj g(zzhot zzhotVar) {
        zzhpa zzhpaVar = (zzhpa) this.a.get();
        zzhpaVar.getClass();
        mno mnoVar = new mno(zzhot.class, zzhotVar.a);
        HashMap hashMap = zzhpaVar.d;
        if (hashMap.containsKey(mnoVar)) {
            return ((zzhoa) hashMap.get(mnoVar)).a(zzhotVar);
        }
        String mnoVar2 = mnoVar.toString();
        throw new GeneralSecurityException(wt3.m("No Parameters Parser for requested key type ", mnoVar2, new StringBuilder(mnoVar2.length() + 54), " available"));
    }

    public final zzhow h(zzhfj zzhfjVar) {
        zzhpa zzhpaVar = (zzhpa) this.a.get();
        zzhpaVar.getClass();
        nno nnoVar = new nno(zzhfjVar.getClass(), zzhot.class);
        HashMap hashMap = zzhpaVar.c;
        if (hashMap.containsKey(nnoVar)) {
            return ((zzhod) hashMap.get(nnoVar)).a(zzhfjVar);
        }
        String nnoVar2 = nnoVar.toString();
        throw new GeneralSecurityException(wt3.m("No Key Format serializer for ", nnoVar2, new StringBuilder(nnoVar2.length() + 39), " available"));
    }
}
