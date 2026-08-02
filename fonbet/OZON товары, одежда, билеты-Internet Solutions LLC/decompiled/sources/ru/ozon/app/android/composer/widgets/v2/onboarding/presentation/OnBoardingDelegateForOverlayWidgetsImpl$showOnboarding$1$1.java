package ru.ozon.app.android.composer.widgets.v2.onboarding.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class OnBoardingDelegateForOverlayWidgetsImpl$showOnboarding$1$1 extends C7735q implements Function1<Boolean, Unit> {
    OnBoardingDelegateForOverlayWidgetsImpl$showOnboarding$1$1(Object obj) {
        super(1, obj, OnBoardingDelegateForOverlayWidgetsImpl.class, "onShownOnboarding", "onShownOnboarding(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        ((OnBoardingDelegateForOverlayWidgetsImpl) this.receiver).onShownOnboarding(z11);
    }
}
