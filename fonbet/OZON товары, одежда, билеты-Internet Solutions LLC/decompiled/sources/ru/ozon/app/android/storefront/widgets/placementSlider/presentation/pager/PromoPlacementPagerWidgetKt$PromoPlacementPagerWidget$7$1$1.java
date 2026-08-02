package ru.ozon.app.android.storefront.widgets.placementSlider.presentation.pager;

import S0.InterfaceC3978p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PromoPlacementPagerWidgetKt$PromoPlacementPagerWidget$7$1$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ InterfaceC3978p0<Boolean> $isTouchInProgress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromoPlacementPagerWidgetKt$PromoPlacementPagerWidget$7$1$1(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        super(1);
        this.$isTouchInProgress = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        this.$isTouchInProgress.setValue(Boolean.valueOf(z11));
    }
}
