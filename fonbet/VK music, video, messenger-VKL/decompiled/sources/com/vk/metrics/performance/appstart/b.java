package com.vk.metrics.performance.appstart;

import com.vk.log.L;
import com.vk.metrics.performance.appstart.a;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.aw90;
import xsna.jw90;
import xsna.rl3;

/* compiled from: AppStartDurationLogger.kt */
/* loaded from: classes.dex */
public final class b implements a.InterfaceC1278a {
    public final ArrayList<aw90> a;

    public b(ArrayList<aw90> arrayList) {
        this.a = arrayList;
    }

    @Override // com.vk.metrics.performance.appstart.a.InterfaceC1278a
    public final void a() {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((aw90) it.next()).a();
        }
    }

    @Override // com.vk.metrics.performance.appstart.a.InterfaceC1278a
    public final void b(jw90 jw90Var) {
        Iterator<aw90> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        Long[] lArr = {jw90Var.a, jw90Var.s, jw90Var.c, jw90Var.b, jw90Var.d};
        for (int i = 0; i < 5; i++) {
            if (lArr[i] == null) {
                return;
            }
        }
        ArrayList arrayList = (ArrayList) rl3.I(lArr);
        long longValue = ((Number) arrayList.get(0)).longValue();
        long longValue2 = ((Number) arrayList.get(1)).longValue();
        long longValue3 = ((Number) arrayList.get(2)).longValue() - longValue;
        long j = longValue2 - longValue;
        long longValue4 = ((Number) arrayList.get(3)).longValue() - longValue;
        long longValue5 = ((Number) arrayList.get(4)).longValue() - longValue;
        long longValue6 = jw90Var.m.longValue() - longValue;
        Long l = jw90Var.n;
        Long valueOf = l != null ? Long.valueOf(l.longValue() - longValue) : null;
        L.p("AppStartDurationLogger", "\n\n===== Application start ======");
        L.p("AppStartDurationLogger", "\tcontent providers:\t " + longValue3 + " ms");
        L.p("AppStartDurationLogger", "\ttoggles init:\t " + j + " ms");
        L.p("AppStartDurationLogger", "\tapplication onCreate:\t " + longValue4 + " ms");
        L.p("AppStartDurationLogger", "\tactivity onCreate:\t " + longValue5 + " ms");
        if (valueOf != null) {
            L.p("AppStartDurationLogger", "\tapp first frame:\t " + valueOf + " ms");
        }
        L.p("AppStartDurationLogger", "-----------------------------------");
        L.p("AppStartDurationLogger", "\t\tCold start:\t " + longValue6 + " ms");
        L.p("AppStartDurationLogger", "==============================\n\n\n");
    }

    @Override // com.vk.metrics.performance.appstart.a.InterfaceC1278a
    public final void c() {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((aw90) it.next()).b();
        }
    }

    @Override // com.vk.metrics.performance.appstart.a.InterfaceC1278a
    public final void d() {
    }
}
