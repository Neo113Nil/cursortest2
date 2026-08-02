package ru.ozon.app.android.storefront.domain.onboarding.presentation.dialog;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class OnboardingDialog$onViewCreated$1 extends C7735q implements Function1<Boolean, Unit> {
    OnboardingDialog$onViewCreated$1(Object obj) {
        super(1, obj, OnboardingDialog.class, "bind", "bind(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        ((OnboardingDialog) this.receiver).bind(z11);
    }
}
