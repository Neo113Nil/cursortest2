package ru.ozon.app.android.checkoutcomposer.sbp.common;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class OnBankActionListener$showRestriction$1 extends C7735q implements Function0<Unit> {
    OnBankActionListener$showRestriction$1(Object obj) {
        super(0, obj, OnBankActionListener.class, "trackRestrictionView", "trackRestrictionView()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((OnBankActionListener) this.receiver).trackRestrictionView();
    }
}
