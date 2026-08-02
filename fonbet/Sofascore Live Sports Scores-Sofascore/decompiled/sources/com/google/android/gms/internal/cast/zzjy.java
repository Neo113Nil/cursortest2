package com.google.android.gms.internal.cast;

import com.ironsource.U3;
import defpackage.a70;
import defpackage.dso;
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
public final class zzjy extends zzjn {
    public static final /* synthetic */ int a = 0;

    static {
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(zziq.a, zziv.a, zziw.a)));
        zzjc zzjcVar = new zzjc();
        Iterator it = unmodifiableSet.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            HashMap hashMap = zzjcVar.a;
            HashMap hashMap2 = zzjcVar.b;
            if (!hasNext) {
                new dso();
                HashMap hashMap3 = new HashMap();
                HashMap hashMap4 = new HashMap();
                hashMap3.putAll(hashMap);
                hashMap4.putAll(hashMap2);
                Level level = Level.ALL;
                return;
            }
            zzit zzitVar = (zzit) it.next();
            if (zzitVar == null) {
                yhk.s(U3.i.W.concat(" must not be null"));
                return;
            }
            boolean z = zzitVar.c;
            if (!z) {
                hashMap2.remove(zzitVar);
                hashMap.put(zzitVar, zzjc.c);
            } else if (!z) {
                a70.p("key must be repeating");
                return;
            } else {
                hashMap.remove(zzitVar);
                hashMap2.put(zzitVar, zzjc.d);
            }
        }
    }
}
