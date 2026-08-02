package com.ironsource;

import com.ironsource.F0;
import com.ironsource.mediationsdk.IronSource;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.z5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2772z5 implements E0 {
    private final IronSource.a a;
    private final F0 b;
    private final List<E0> c;
    private final W8 d;
    private final C2760yb e;
    private final C2443gg f;
    private final T1 g;
    private final O h;
    private final C2514kg i;
    private final Sc j;

    public C2772z5(IronSource.a adFormat, F0.b level, List<? extends E0> eventsInterfaces, AbstractC2519l3 abstractC2519l3) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(eventsInterfaces, "eventsInterfaces");
        this.a = adFormat;
        F0 f0 = new F0(adFormat, level, this, abstractC2519l3);
        this.b = f0;
        this.c = CollectionsKt.toMutableList((Collection) eventsInterfaces);
        W8 w8 = f0.e;
        Intrinsics.checkNotNullExpressionValue(w8, "wrapper.init");
        this.d = w8;
        C2760yb c2760yb = f0.f;
        Intrinsics.checkNotNullExpressionValue(c2760yb, "wrapper.load");
        this.e = c2760yb;
        C2443gg c2443gg = f0.g;
        Intrinsics.checkNotNullExpressionValue(c2443gg, "wrapper.token");
        this.f = c2443gg;
        T1 t1 = f0.h;
        Intrinsics.checkNotNullExpressionValue(t1, "wrapper.auction");
        this.g = t1;
        O o = f0.i;
        Intrinsics.checkNotNullExpressionValue(o, "wrapper.adInteraction");
        this.h = o;
        C2514kg c2514kg = f0.j;
        Intrinsics.checkNotNullExpressionValue(c2514kg, "wrapper.troubleshoot");
        this.i = c2514kg;
        Sc sc = f0.k;
        Intrinsics.checkNotNullExpressionValue(sc, "wrapper.operational");
        this.j = sc;
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

    public final W8 d() {
        return this.d;
    }

    public final C2760yb e() {
        return this.e;
    }

    public final Sc f() {
        return this.j;
    }

    public final C2443gg g() {
        return this.f;
    }

    public final C2514kg h() {
        return this.i;
    }

    @Override // com.ironsource.E0
    public Map<String, Object> a(C0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        HashMap hashMap = new HashMap();
        Iterator<E0> it = this.c.iterator();
        while (it.hasNext()) {
            Map<String, Object> a = it.next().a(event);
            Intrinsics.checkNotNullExpressionValue(a, "it.getEventsAdditionalDataMap(event)");
            hashMap.putAll(a);
        }
        return hashMap;
    }

    public /* synthetic */ C2772z5(IronSource.a aVar, F0.b bVar, List list, AbstractC2519l3 abstractC2519l3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, bVar, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : abstractC2519l3);
    }

    public final void a(E0 eventInterface) {
        Intrinsics.checkNotNullParameter(eventInterface, "eventInterface");
        this.c.add(eventInterface);
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
}
