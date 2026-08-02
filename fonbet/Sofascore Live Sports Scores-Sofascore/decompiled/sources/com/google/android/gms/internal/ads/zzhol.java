package com.google.android.gms.internal.ads;

import defpackage.lno;
import defpackage.yhk;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhol {
    public final HashMap a;
    public final HashMap b;

    public /* synthetic */ zzhol(zzhoo zzhooVar) {
        this.a = new HashMap(zzhooVar.a);
        this.b = new HashMap(zzhooVar.b);
    }

    public final void a(zzhok zzhokVar) {
        if (zzhokVar == null) {
            yhk.s("primitive constructor must be non-null");
            return;
        }
        lno lnoVar = new lno(zzhokVar.a, zzhokVar.b);
        HashMap hashMap = this.a;
        if (!hashMap.containsKey(lnoVar)) {
            hashMap.put(lnoVar, zzhokVar);
            return;
        }
        zzhok zzhokVar2 = (zzhok) hashMap.get(lnoVar);
        if (!zzhokVar2.equals(zzhokVar) || !zzhokVar.equals(zzhokVar2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(lnoVar.toString()));
        }
    }

    private zzhol() {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public /* synthetic */ zzhol(int i) {
        this.a = new HashMap();
        this.b = new HashMap();
    }
}
