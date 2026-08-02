package com.google.android.gms.internal.ads;

import defpackage.mno;
import defpackage.nno;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhox {
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;

    public zzhox(zzhpa zzhpaVar) {
        this.a = new HashMap(zzhpaVar.a);
        this.b = new HashMap(zzhpaVar.b);
        this.c = new HashMap(zzhpaVar.c);
        this.d = new HashMap(zzhpaVar.d);
    }

    public final void a(zzhna zzhnaVar) {
        nno nnoVar = new nno(zzhnaVar.a, zzhos.class);
        HashMap hashMap = this.a;
        if (!hashMap.containsKey(nnoVar)) {
            hashMap.put(nnoVar, zzhnaVar);
            return;
        }
        zzhna zzhnaVar2 = (zzhna) hashMap.get(nnoVar);
        if (!zzhnaVar2.equals(zzhnaVar) || !zzhnaVar.equals(zzhnaVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(nnoVar.toString()));
        }
    }

    public final void b(zzhmx zzhmxVar) {
        zzhmxVar.getClass();
        mno mnoVar = new mno(zzhos.class, zzhmxVar.a);
        HashMap hashMap = this.b;
        if (!hashMap.containsKey(mnoVar)) {
            hashMap.put(mnoVar, zzhmxVar);
            return;
        }
        zzhmx zzhmxVar2 = (zzhmx) hashMap.get(mnoVar);
        if (!zzhmxVar2.equals(zzhmxVar) || !zzhmxVar.equals(zzhmxVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(mnoVar.toString()));
        }
    }

    public final void c(zzhod zzhodVar) {
        nno nnoVar = new nno(zzhodVar.a, zzhot.class);
        HashMap hashMap = this.c;
        if (!hashMap.containsKey(nnoVar)) {
            hashMap.put(nnoVar, zzhodVar);
            return;
        }
        zzhod zzhodVar2 = (zzhod) hashMap.get(nnoVar);
        if (!zzhodVar2.equals(zzhodVar) || !zzhodVar.equals(zzhodVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(nnoVar.toString()));
        }
    }

    public final void d(zzhoa zzhoaVar) {
        zzhoaVar.getClass();
        mno mnoVar = new mno(zzhot.class, zzhoaVar.a);
        HashMap hashMap = this.d;
        if (!hashMap.containsKey(mnoVar)) {
            hashMap.put(mnoVar, zzhoaVar);
            return;
        }
        zzhoa zzhoaVar2 = (zzhoa) hashMap.get(mnoVar);
        if (!zzhoaVar2.equals(zzhoaVar) || !zzhoaVar.equals(zzhoaVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(mnoVar.toString()));
        }
    }

    public zzhox() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
    }
}
