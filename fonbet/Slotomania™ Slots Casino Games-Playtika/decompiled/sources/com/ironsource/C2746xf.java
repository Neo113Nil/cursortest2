package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.xf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2746xf extends G4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2746xf(AbstractC2731x0 adUnitData, Jg waterfallInstances) {
        super(adUnitData, waterfallInstances);
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
    }

    private final int b(B b) {
        return b.h().l();
    }

    @Override // com.ironsource.H
    protected boolean a(B instance, Jg waterfallInstances) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        return a(waterfallInstances) < b(instance);
    }

    private final int a(Jg jg) {
        Integer num;
        List<B> b = jg.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : b) {
            if (((B) obj).x()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Integer valueOf = Integer.valueOf(b((B) it.next()));
            while (it.hasNext()) {
                Integer valueOf2 = Integer.valueOf(b((B) it.next()));
                if (valueOf.compareTo(valueOf2) > 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }
}
