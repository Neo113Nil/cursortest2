package com.ironsource;

import com.ironsource.E0;
import com.ironsource.mediationsdk.IronSource;
import defpackage.km5;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.x5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4391x5 implements D0 {

    @NotNull
    private final IronSource.a a;

    @NotNull
    private final E0 b;

    @NotNull
    private final List<D0> c;

    @NotNull
    private final X8 d;

    @NotNull
    private final C4397xb e;

    @NotNull
    private final C4151jg f;

    @NotNull
    private final R1 g;

    @NotNull
    private final O h;

    @NotNull
    private final C4223ng i;

    @NotNull
    private final Sc j;

    public C4391x5(@NotNull IronSource.a aVar, @NotNull E0.b bVar, @NotNull List<? extends D0> list, @Nullable AbstractC4121i3 abstractC4121i3) {
        aVar.getClass();
        bVar.getClass();
        list.getClass();
        this.a = aVar;
        E0 e0 = new E0(aVar, bVar, this, abstractC4121i3);
        this.b = e0;
        this.c = new ArrayList(list);
        X8 x8 = e0.e;
        x8.getClass();
        this.d = x8;
        C4397xb c4397xb = e0.f;
        c4397xb.getClass();
        this.e = c4397xb;
        C4151jg c4151jg = e0.g;
        c4151jg.getClass();
        this.f = c4151jg;
        R1 r1 = e0.h;
        r1.getClass();
        this.g = r1;
        O o = e0.i;
        o.getClass();
        this.h = o;
        C4223ng c4223ng = e0.j;
        c4223ng.getClass();
        this.i = c4223ng;
        Sc sc = e0.k;
        sc.getClass();
        this.j = sc;
    }

    @Override // com.ironsource.D0
    @NotNull
    public Map<String, Object> a(@NotNull B0 b0) {
        b0.getClass();
        HashMap hashMap = new HashMap();
        Iterator<D0> it = this.c.iterator();
        while (it.hasNext()) {
            Map<String, Object> a = it.next().a(b0);
            a.getClass();
            hashMap.putAll(a);
        }
        return hashMap;
    }

    @NotNull
    public final R1 b() {
        return this.g;
    }

    @NotNull
    public final List<D0> c() {
        return this.c;
    }

    @NotNull
    public final X8 d() {
        return this.d;
    }

    @NotNull
    public final C4397xb e() {
        return this.e;
    }

    @NotNull
    public final Sc f() {
        return this.j;
    }

    @NotNull
    public final C4151jg g() {
        return this.f;
    }

    @NotNull
    public final C4223ng h() {
        return this.i;
    }

    @NotNull
    public final O a() {
        return this.h;
    }

    public final void a(@NotNull D0 d0) {
        d0.getClass();
        this.c.add(d0);
    }

    public final void a(boolean z) {
        if (z) {
            this.e.a(true);
            return;
        }
        if (z) {
            zzl.b();
            return;
        }
        IronSource.a aVar = this.a;
        IronSource.a aVar2 = IronSource.a.BANNER;
        C4397xb c4397xb = this.e;
        if (aVar == aVar2) {
            c4397xb.d();
        } else {
            c4397xb.a(false);
        }
    }

    public C4391x5(IronSource.a aVar, E0.b bVar, List list, AbstractC4121i3 abstractC4121i3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, bVar, (i & 4) != 0 ? km5.a : list, (i & 8) != 0 ? null : abstractC4121i3);
    }
}
