package com.ironsource;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xsna.epx;
import xsna.j5g;
import xsna.wq;

/* loaded from: classes13.dex */
public final class Pg {
    private final List<B> a;

    /* JADX WARN: Multi-variable type inference failed */
    public Pg(List<? extends B> list) {
        this.a = list;
    }

    public final List<B> a() {
        return this.a;
    }

    public final List<B> b() {
        return this.a;
    }

    public final int c() {
        return this.a.size();
    }

    public final String d() {
        ArrayList arrayList = new ArrayList();
        for (B b : this.a) {
            arrayList.add(a(b.h(), b.r()));
        }
        return j5g.g0(arrayList, StringUtils.COMMA, null, null, 0, null, 62);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Pg) && epx.f(this.a, ((Pg) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return wq.c("WaterfallInstances(instances=", ")", this.a);
    }

    public final Pg a(List<? extends B> list) {
        return new Pg(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Pg a(Pg pg, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = pg.a;
        }
        return pg.a(list);
    }

    private final String a(C4504q2 c4504q2, int i) {
        return String.format("%s%s", Arrays.copyOf(new Object[]{Integer.valueOf(i), c4504q2.c()}, 2));
    }
}
