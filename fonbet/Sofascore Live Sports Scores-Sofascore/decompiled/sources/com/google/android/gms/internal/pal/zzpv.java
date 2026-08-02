package com.google.android.gms.internal.pal;

import defpackage.h2p;
import defpackage.i2p;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzpv {
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;

    public zzpv(zzqb zzqbVar) {
        this.a = new HashMap(zzqbVar.a);
        this.b = new HashMap(zzqbVar.b);
        this.c = new HashMap(zzqbVar.c);
        this.d = new HashMap(zzqbVar.d);
    }

    public final void a(zzou zzouVar) {
        zzouVar.getClass();
        h2p h2pVar = new h2p(zzps.class, zzouVar.a);
        HashMap hashMap = this.b;
        if (!hashMap.containsKey(h2pVar)) {
            hashMap.put(h2pVar, zzouVar);
            return;
        }
        zzou zzouVar2 = (zzou) hashMap.get(h2pVar);
        if (!zzouVar2.equals(zzouVar) || !zzouVar.equals(zzouVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(h2pVar.toString()));
        }
    }

    public final void b(zzox zzoxVar) {
        zzoxVar.getClass();
        i2p i2pVar = new i2p(zzqe.class, zzps.class);
        HashMap hashMap = this.a;
        if (!hashMap.containsKey(i2pVar)) {
            hashMap.put(i2pVar, zzoxVar);
            return;
        }
        zzox zzoxVar2 = (zzox) hashMap.get(i2pVar);
        if (!zzoxVar2.equals(zzoxVar) || !zzoxVar.equals(zzoxVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(i2pVar.toString()));
        }
    }

    public final void c(zzpm zzpmVar) {
        zzpmVar.getClass();
        h2p h2pVar = new h2p(zzpt.class, zzpmVar.a);
        HashMap hashMap = this.d;
        if (!hashMap.containsKey(h2pVar)) {
            hashMap.put(h2pVar, zzpmVar);
            return;
        }
        zzpm zzpmVar2 = (zzpm) hashMap.get(h2pVar);
        if (!zzpmVar2.equals(zzpmVar) || !zzpmVar.equals(zzpmVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(h2pVar.toString()));
        }
    }

    public final void d(zzpp zzppVar) {
        zzppVar.getClass();
        i2p i2pVar = new i2p(zzqj.class, zzpt.class);
        HashMap hashMap = this.c;
        if (!hashMap.containsKey(i2pVar)) {
            hashMap.put(i2pVar, zzppVar);
            return;
        }
        zzpp zzppVar2 = (zzpp) hashMap.get(i2pVar);
        if (!zzppVar2.equals(zzppVar) || !zzppVar.equals(zzppVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(i2pVar.toString()));
        }
    }

    public zzpv() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
    }
}
