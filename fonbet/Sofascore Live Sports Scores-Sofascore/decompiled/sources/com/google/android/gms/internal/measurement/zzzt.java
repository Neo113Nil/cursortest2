package com.google.android.gms.internal.measurement;

import com.ironsource.U3;
import defpackage.a70;
import defpackage.ifp;
import defpackage.jfp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzzt {
    public static final ifp a = new ifp(1);
    public static final jfp b = new jfp(1);

    public static zzzm a(Set set) {
        zzzm zzzmVar = new zzzm();
        zzzmVar.c = b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzyl zzylVar = (zzyl) it.next();
            zzabr.a(zzylVar, U3.i.W);
            boolean z = zzylVar.c;
            HashMap hashMap = zzzmVar.b;
            HashMap hashMap2 = zzzmVar.a;
            if (!z) {
                hashMap.remove(zzylVar);
                hashMap2.put(zzylVar, zzzm.d);
            } else {
                if (!z) {
                    a70.p("key must be repeating");
                    return null;
                }
                hashMap2.remove(zzylVar);
                hashMap.put(zzylVar, zzzm.e);
            }
        }
        return zzzmVar;
    }
}
