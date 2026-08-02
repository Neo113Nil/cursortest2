package com.google.android.gms.internal.pal;

import defpackage.a70;
import defpackage.azo;
import defpackage.jwo;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zznn {
    static {
        zzpq[] zzpqVarArr = {new jwo(zzjy.class)};
        HashMap hashMap = new HashMap();
        for (int i = 0; i <= 0; i++) {
            zzpq zzpqVar = zzpqVarArr[i];
            boolean containsKey = hashMap.containsKey(zzpqVar.a);
            Class cls = zzpqVar.a;
            if (containsKey) {
                a70.p("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(cls.getCanonicalName())));
                return;
            }
            hashMap.put(cls, zzpqVar);
        }
        Class cls2 = zzpqVarArr[0].a;
        Collections.unmodifiableMap(hashMap);
        new zznk();
        int i2 = zzwx.a;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        zzlf.c(new zznp());
        zzlf.c(new zzns());
        zzli.a();
        if (zznb.a()) {
            return;
        }
        zzlf.a(new zznk(), new azo(zzuf.class, new jwo(zzjy.class)));
        zzlf.a(new zzoi(), new zzok());
    }
}
