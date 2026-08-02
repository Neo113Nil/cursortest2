package com.google.android.gms.internal.ads;

import defpackage.lno;
import defpackage.wt3;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhoo {
    public final HashMap a;
    public final HashMap b;

    public /* synthetic */ zzhoo(zzhol zzholVar) {
        this.a = new HashMap(zzholVar.a);
        this.b = new HashMap(zzholVar.b);
    }

    public final Object a(zzhes zzhesVar, Class cls) {
        lno lnoVar = new lno(zzhesVar.getClass(), cls);
        HashMap hashMap = this.a;
        if (hashMap.containsKey(lnoVar)) {
            return ((zzhok) hashMap.get(lnoVar)).a(zzhesVar);
        }
        String lnoVar2 = lnoVar.toString();
        throw new GeneralSecurityException(wt3.m("No PrimitiveConstructor for ", lnoVar2, new StringBuilder(lnoVar2.length() + 102), " available, see https://developers.google.com/tink/faq/registration_errors"));
    }
}
