package com.swmansion.rnscreens.gamma.tabs.container;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final List f41913a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f41914b;

    public static final Unit g(k kVar, boolean z10, boolean z11, b bVar, l observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        observer.b(kVar, z10, z11, bVar);
        return Unit.INSTANCE;
    }

    public static final Unit i(k kVar, String str, l observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        observer.c(kVar, str);
        return Unit.INSTANCE;
    }

    public static final Unit k(k kVar, r rVar, q qVar, l observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        observer.a(kVar, rVar, qVar);
        return Unit.INSTANCE;
    }

    public final boolean d(l observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (this.f41914b || this.f41913a.contains(observer)) {
            return false;
        }
        this.f41913a.add(observer);
        return true;
    }

    public final void e() {
        if (this.f41914b) {
            throw new IllegalStateException("[RNScreens] TabsNavigationStateObserverRegistry.clear during emission");
        }
        this.f41913a.clear();
    }

    public final void f(final k navState, final boolean z10, final boolean z11, final b actionOrigin) {
        Intrinsics.checkNotNullParameter(navState, "navState");
        Intrinsics.checkNotNullParameter(actionOrigin, "actionOrigin");
        l(new Function1() { // from class: com.swmansion.rnscreens.gamma.tabs.container.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit g10;
                g10 = p.g(k.this, z10, z11, actionOrigin, (l) obj);
                return g10;
            }
        });
    }

    public final void h(final k currentNavState, final String preventedScreenKey) {
        Intrinsics.checkNotNullParameter(currentNavState, "currentNavState");
        Intrinsics.checkNotNullParameter(preventedScreenKey, "preventedScreenKey");
        l(new Function1() { // from class: com.swmansion.rnscreens.gamma.tabs.container.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit i10;
                i10 = p.i(k.this, preventedScreenKey, (l) obj);
                return i10;
            }
        });
    }

    public final void j(final k currentNavState, final r rejectedRequest, final q reason) {
        Intrinsics.checkNotNullParameter(currentNavState, "currentNavState");
        Intrinsics.checkNotNullParameter(rejectedRequest, "rejectedRequest");
        Intrinsics.checkNotNullParameter(reason, "reason");
        l(new Function1() { // from class: com.swmansion.rnscreens.gamma.tabs.container.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit k10;
                k10 = p.k(k.this, rejectedRequest, reason, (l) obj);
                return k10;
            }
        });
    }

    public final void l(Function1 function1) {
        if (this.f41914b) {
            throw new IllegalStateException("[RNScreens] Recursive emission on TabsNavigationStateObserverRegistry");
        }
        this.f41914b = true;
        try {
            Iterator it = this.f41913a.iterator();
            while (it.hasNext()) {
                function1.invoke((l) it.next());
            }
        } finally {
            this.f41914b = false;
        }
    }

    public final boolean m(l observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (this.f41914b) {
            return false;
        }
        return this.f41913a.remove(observer);
    }
}
