package ru.ozon.android.messenger.framework.presentation.ai;

import S0.InterfaceC3978p0;
import android.view.ViewTreeObserver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class r extends AbstractC7737t implements Function1<S0.N, S0.M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9413c f89671b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Z1.d f89672c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Z1.h> f89673d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Z1.h> f89674e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(InterfaceC3978p0 interfaceC3978p0, InterfaceC3978p0 interfaceC3978p02, Z1.d dVar, C9413c c9413c) {
        super(1);
        this.f89671b = c9413c;
        this.f89672c = dVar;
        this.f89673d = interfaceC3978p0;
        this.f89674e = interfaceC3978p02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, ru.ozon.android.messenger.framework.presentation.ai.p] */
    @Override // kotlin.jvm.functions.Function1
    public final S0.M invoke(S0.N n11) {
        S0.N DisposableEffect = n11;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final C9413c c9413c = this.f89671b;
        final Z1.d dVar = this.f89672c;
        final InterfaceC3978p0<Z1.h> interfaceC3978p0 = this.f89673d;
        final InterfaceC3978p0<Z1.h> interfaceC3978p02 = this.f89674e;
        ?? r52 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.android.messenger.framework.presentation.ai.p
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C9413c c9413c2 = c9413c;
                int measuredHeight = C9413c.y(c9413c2).headerContainerLl.getMeasuredHeight();
                Z1.d dVar2 = dVar;
                interfaceC3978p0.setValue(Z1.h.a(dVar2.B(measuredHeight)));
                interfaceC3978p02.setValue(Z1.h.a(dVar2.B(C9413c.y(c9413c2).bottomContainerLl.getMeasuredHeight())));
            }
        };
        C9413c.y(c9413c).getConstraintLayout().getViewTreeObserver().addOnGlobalLayoutListener(r52);
        return new C9441q(c9413c, r52);
    }
}
