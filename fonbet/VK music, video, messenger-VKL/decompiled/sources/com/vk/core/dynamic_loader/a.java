package com.vk.core.dynamic_loader;

import android.os.Handler;
import android.os.Looper;
import com.vk.core.dynamic_loader.DynamicException;
import com.vk.core.dynamic_loader.b;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import io.reactivex.rxjava3.subjects.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.random.XorWowRandom;
import xsna.c5g;
import xsna.j41;
import xsna.kpo;
import xsna.uqn0;

/* compiled from: DynamicFakeLibLoader.kt */
/* loaded from: classes.dex */
public final class a {
    public static final LinkedHashSet a = new LinkedHashSet();
    public static final HashMap<DynamicTask, Integer> b = new HashMap<>();
    public static final HashMap<Integer, d<b.AbstractC0762b>> c = new HashMap<>();
    public static final HashMap<DynamicTask, uqn0> d = new HashMap<>();
    public static final AtomicBoolean e = new AtomicBoolean(false);
    public static final Handler f = new Handler(Looper.getMainLooper());

    public static q a(DynamicTask dynamicTask, boolean z) {
        Set<DynamicLib> i = dynamicTask.i();
        ArrayList arrayList = new ArrayList(c5g.u(i, 10));
        Iterator<T> it = i.iterator();
        while (it.hasNext()) {
            arrayList.add(((DynamicLib) it.next()).i());
        }
        if (a.containsAll(arrayList)) {
            return g0.b;
        }
        HashMap<DynamicTask, Integer> hashMap = b;
        Integer num = hashMap.get(dynamicTask);
        HashMap<Integer, d<b.AbstractC0762b>> hashMap2 = c;
        d<b.AbstractC0762b> dVar = hashMap2.get(num);
        if (num != null && dVar != null) {
            return dVar;
        }
        com.vk.core.utils.newtork.b.a.getClass();
        if (!com.vk.core.utils.newtork.b.d()) {
            return q.H(new DynamicException.Storage("Test error", -1));
        }
        d<b.AbstractC0762b> O0 = d.O0(b.AbstractC0762b.e.a);
        int j = new XorWowRandom(42, 0).j();
        hashMap2.put(Integer.valueOf(j), O0);
        hashMap.put(dynamicTask, Integer.valueOf(j));
        uqn0 uqn0Var = new uqn0();
        uqn0Var.b();
        d.put(dynamicTask, uqn0Var);
        q<Long> S = q.S(0L, 100L, 1000L, 100L, TimeUnit.MILLISECONDS);
        j41 j41Var = new j41(new kpo(j, dynamicTask, O0, z), 14);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        S.E(j41Var, lVar, kVar, kVar).subscribe();
        return O0;
    }
}
