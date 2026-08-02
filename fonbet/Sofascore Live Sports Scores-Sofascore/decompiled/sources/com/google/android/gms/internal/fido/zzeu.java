package com.google.android.gms.internal.fido;

import com.ironsource.U3;
import defpackage.a70;
import defpackage.n1o;
import defpackage.yhk;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeu extends zzei {
    public static final /* synthetic */ int a = 0;

    static {
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(zzdh.a, zzdm.b)));
        zzdv zzdvVar = new zzdv();
        Iterator it = unmodifiableSet.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            HashMap hashMap = zzdvVar.a;
            HashMap hashMap2 = zzdvVar.b;
            if (!hasNext) {
                new n1o();
                HashMap hashMap3 = new HashMap();
                HashMap hashMap4 = new HashMap();
                hashMap3.putAll(hashMap);
                hashMap4.putAll(hashMap2);
                Level level = Level.ALL;
                return;
            }
            zzdk zzdkVar = (zzdk) it.next();
            if (zzdkVar == null) {
                yhk.s(U3.i.W.concat(" must not be null"));
                return;
            }
            boolean z = zzdkVar.c;
            if (!z) {
                hashMap2.remove(zzdkVar);
                hashMap.put(zzdkVar, zzdv.c);
            } else if (!z) {
                a70.p("key must be repeating");
                return;
            } else {
                hashMap.remove(zzdkVar);
                hashMap2.put(zzdkVar, zzdv.d);
            }
        }
    }
}
