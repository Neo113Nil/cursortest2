package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.BiFunction;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Dn {

    /* renamed from: a, reason: collision with root package name */
    public final Cn f12169a;

    /* renamed from: b, reason: collision with root package name */
    public final BiFunction f12170b;

    /* renamed from: c, reason: collision with root package name */
    public final Cf f12171c;

    public Dn() {
        this(new An(), new C0303la(), C0040b4.l().n());
    }

    public final ArrayList a(Thread thread, Thread thread2) {
        Map map;
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new Bn());
        try {
            map = this.f12169a.c();
        } catch (SecurityException unused) {
            map = null;
        }
        if (map != null) {
            treeMap.putAll(map);
        }
        if (thread2 != null) {
            treeMap.remove(thread2);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread3 = (Thread) entry.getKey();
            if (thread3 != thread && thread3 != thread2) {
                arrayList.add((C0590wn) this.f12170b.apply(thread3, (StackTraceElement[]) entry.getValue()));
            }
        }
        return arrayList;
    }

    public Dn(Cn cn, C0303la c0303la, C0448r6 c0448r6) {
        this.f12169a = cn;
        this.f12170b = c0303la;
        this.f12171c = c0448r6;
    }
}
