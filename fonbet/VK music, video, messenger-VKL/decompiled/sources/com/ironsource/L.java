package com.ironsource;

import com.ironsource.C4519r0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.c5g;
import xsna.g5g;
import xsna.j5g;

/* loaded from: classes13.dex */
public final class L {
    private final int a;
    private final List<J> b = new CopyOnWriteArrayList();

    public L(int i) {
        this.a = i;
    }

    private final boolean b() {
        return this.a == 0;
    }

    private final boolean c() {
        return this.a != -1;
    }

    public final void a(J j) {
        if (b()) {
            return;
        }
        if (a()) {
            g5g.H(this.b);
        }
        if (j == null) {
            j = new J(C4519r0.a.NotPartOfWaterfall);
        }
        this.b.add(j);
    }

    public final String d() {
        List<J> list = this.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((J) it.next()).b().ordinal()));
        }
        return j5g.g0(arrayList, StringUtils.COMMA, null, null, 0, null, 62);
    }

    private final boolean a() {
        return c() && this.b.size() >= this.a;
    }
}
