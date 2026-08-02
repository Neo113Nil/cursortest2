package com.ironsource;

import com.ironsource.F0;
import com.ironsource.mediationsdk.IronSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.zcl;

/* renamed from: com.ironsource.z5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4668z5 implements E0 {
    private final IronSource.a a;
    private final F0 b;
    private final List<E0> c;
    private final X8 d;
    private final C4674zb e;
    private final C4446mg f;
    private final T1 g;
    private final O h;
    private final C4518qg i;
    private final Tc j;

    public C4668z5(IronSource.a aVar, F0.b bVar, List<? extends E0> list, AbstractC4415l3 abstractC4415l3) {
        this.a = aVar;
        F0 f0 = new F0(aVar, bVar, this, abstractC4415l3);
        this.b = f0;
        this.c = new ArrayList(list);
        this.d = f0.e;
        this.e = f0.f;
        this.f = f0.g;
        this.g = f0.h;
        this.h = f0.i;
        this.i = f0.j;
        this.j = f0.k;
    }

    public final O a() {
        return this.h;
    }

    public final T1 b() {
        return this.g;
    }

    public final List<E0> c() {
        return this.c;
    }

    public final X8 d() {
        return this.d;
    }

    public final C4674zb e() {
        return this.e;
    }

    public final Tc f() {
        return this.j;
    }

    public final C4446mg g() {
        return this.f;
    }

    public final C4518qg h() {
        return this.i;
    }

    @Override // com.ironsource.E0
    public Map<String, Object> a(C0 c0) {
        HashMap hashMap = new HashMap();
        Iterator<E0> it = this.c.iterator();
        while (it.hasNext()) {
            hashMap.putAll(it.next().a(c0));
        }
        return hashMap;
    }

    public final void a(E0 e0) {
        this.c.add(e0);
    }

    public final void a(boolean z) {
        if (z) {
            this.e.a(true);
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.a == IronSource.a.BANNER) {
                this.e.d();
            } else {
                this.e.a(false);
            }
        }
    }

    public C4668z5(IronSource.a aVar, F0.b bVar, List list, AbstractC4415l3 abstractC4415l3, int i, zcl zclVar) {
        this(aVar, bVar, (i & 4) != 0 ? EmptyList.b : list, (i & 8) != 0 ? null : abstractC4415l3);
    }
}
