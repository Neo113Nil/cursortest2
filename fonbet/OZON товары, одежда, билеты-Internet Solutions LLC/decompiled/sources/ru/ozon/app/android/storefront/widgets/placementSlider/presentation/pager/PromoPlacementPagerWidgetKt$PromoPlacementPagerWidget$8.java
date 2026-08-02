package ru.ozon.app.android.storefront.widgets.placementSlider.presentation.pager;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.widgets.placementSlider.presentation.BannerVO;
import ru.ozon.app.android.storefront.widgets.placementSlider.presentation.PromoPlacementVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PromoPlacementPagerWidgetKt$PromoPlacementPagerWidget$8 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ InterfaceC6511n<Integer, Boolean, BannerVO, AtomAction> $onPageChanged;
    final /* synthetic */ Integer $savedPage;
    final /* synthetic */ PromoPlacementVO $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PromoPlacementPagerWidgetKt$PromoPlacementPagerWidget$8(PromoPlacementVO promoPlacementVO, Integer num, Function1<? super AtomAction, Unit> function1, InterfaceC6511n<? super Integer, ? super Boolean, ? super BannerVO, ? extends AtomAction> interfaceC6511n, int i11) {
        super(2);
        this.$state = promoPlacementVO;
        this.$savedPage = num;
        this.$actionHandler = function1;
        this.$onPageChanged = interfaceC6511n;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        PromoPlacementPagerWidgetKt.PromoPlacementPagerWidget(this.$state, this.$savedPage, this.$actionHandler, this.$onPageChanged, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
