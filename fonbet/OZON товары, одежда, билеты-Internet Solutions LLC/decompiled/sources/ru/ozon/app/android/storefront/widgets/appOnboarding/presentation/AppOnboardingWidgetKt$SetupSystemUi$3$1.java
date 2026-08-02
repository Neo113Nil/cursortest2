package ru.ozon.app.android.storefront.widgets.appOnboarding.presentation;

import O6.b;
import S0.InterfaceC3978p0;
import S0.M;
import S0.N;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS0/N;", "LS0/M;", "invoke", "(LS0/N;)LS0/M;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class AppOnboardingWidgetKt$SetupSystemUi$3$1 extends AbstractC7737t implements Function1<N, M> {
    final /* synthetic */ InterfaceC3978p0<Boolean> $isNotDisposed;
    final /* synthetic */ long $originalNavigationBarColor;
    final /* synthetic */ b $systemUiController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppOnboardingWidgetKt$SetupSystemUi$3$1(b bVar, long j11, InterfaceC3978p0<Boolean> interfaceC3978p0) {
        super(1);
        this.$systemUiController = bVar;
        this.$originalNavigationBarColor = j11;
        this.$isNotDisposed = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final M invoke(N DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final b bVar = this.$systemUiController;
        final long j11 = this.$originalNavigationBarColor;
        final InterfaceC3978p0<Boolean> interfaceC3978p0 = this.$isNotDisposed;
        return new M() { // from class: ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingWidgetKt$SetupSystemUi$3$1$invoke$$inlined$onDispose$1
            @Override // S0.M
            public void dispose() {
                b.a(b.this, j11);
                interfaceC3978p0.setValue(Boolean.FALSE);
            }
        };
    }
}
