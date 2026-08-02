package ru.ozon.app.android.storefront.widgets.placementSlider.presentation.singleBanner;

import S0.InterfaceC3978p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.composer.compose.widget.scrollable.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/h;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/h;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class PromoPlacementSingleWidgetKt$PromoPlacementSingleWidget$3$1 extends AbstractC7737t implements Function1<h, Unit> {
    final /* synthetic */ InterfaceC3978p0<Boolean> $isWidgetVisible$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromoPlacementSingleWidgetKt$PromoPlacementSingleWidget$3$1(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        super(1);
        this.$isWidgetVisible$delegate = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(h hVar) {
        invoke2(hVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(h onVisibleAreaChanged) {
        Intrinsics.checkNotNullParameter(onVisibleAreaChanged, "$this$onVisibleAreaChanged");
        PromoPlacementSingleWidgetKt.PromoPlacementSingleWidget$lambda$2(this.$isWidgetVisible$delegate, onVisibleAreaChanged.a(false) >= 0.5f);
    }
}
