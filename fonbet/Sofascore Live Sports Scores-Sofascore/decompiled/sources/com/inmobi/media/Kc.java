package com.inmobi.media;

import defpackage.ida;
import defpackage.joa;
import defpackage.ph0;
import defpackage.yq5;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Kc {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ExecutorService b = Executors.newSingleThreadExecutor(new M9("MultiEventBus", false));

    public final void a(N2 n2) {
        Function1 function1;
        Set<Map.Entry> entrySet = this.a.entrySet();
        entrySet.getClass();
        for (Map.Entry entry : entrySet) {
            if (((WeakReference) entry.getValue()).get() == null) {
                this.a.remove(entry.getKey());
            }
        }
        Set<Map.Entry> entrySet2 = this.a.entrySet();
        entrySet2.getClass();
        for (Map.Entry entry2 : entrySet2) {
            entry2.getClass();
            Object key = entry2.getKey();
            key.getClass();
            Function1 function12 = (Function1) key;
            Object value = entry2.getValue();
            value.getClass();
            WeakReference weakReference = (WeakReference) value;
            try {
                if (((Boolean) function12.invoke(n2)).booleanValue() && (function1 = (Function1) weakReference.get()) != null) {
                    function1.invoke(n2);
                }
            } catch (Exception e) {
                joa joaVar = AbstractC3286aa.a;
                AbstractC3776t9.a(e);
            }
        }
    }

    public final void b(N2 n2) {
        n2.getClass();
        try {
            this.b.execute(new yq5(17, n2, this));
        } catch (InternalError unused) {
            a(n2);
        }
    }

    public static final boolean a(int[] iArr, N2 n2) {
        n2.getClass();
        return ph0.s(n2.a, iArr);
    }

    public final void a(int[] iArr, Function1 function1) {
        iArr.getClass();
        function1.getClass();
        this.a.put(new ida(iArr, 2), new WeakReference(function1));
    }

    public final void a(Function1 function1) {
        function1.getClass();
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            if (Intrinsics.c(((WeakReference) ((Map.Entry) it.next()).getValue()).get(), function1)) {
                it.remove();
            }
        }
    }

    public static final void a(N2 n2, Kc kc) {
        int i = n2.a;
        kc.a(n2);
    }
}
