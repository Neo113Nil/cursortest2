package com.google.common.primitives;

import Bl0.k0;
import N3.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes9.dex */
public final class f implements L {
    public static int a(long j11) {
        k0.c(j11, "out of range: %s", (j11 >> 32) == 0);
        return (int) j11;
    }

    public static CopyOnWriteArrayList b(CopyOnWriteArrayList copyOnWriteArrayList) {
        ArrayList arrayList = new ArrayList();
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((io.sentry.internal.eventprocessor.a) it.next()).getClass();
                arrayList.add(null);
            }
        }
        return new CopyOnWriteArrayList(arrayList);
    }
}
