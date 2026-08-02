package ru.ozon.app.android.storefront.widgets.placementSlider.core;

import S0.A1;
import S0.InterfaceC3967k;
import e3.C6285b;
import fd.InterfaceC6511n;
import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.h;
import ru.ozon.app.android.storefront.widgets.placementSlider.presentation.PromoPlacementVO;
import ru.ozon.app.android.storefront.widgets.placementSlider.presentation.pager.PromoPlacementPagerWidgetKt;
import ru.ozon.app.android.storefront.widgets.placementSlider.presentation.pager.PromoPlacementViewModel;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/pager/PromoPlacementViewModel;", "viewModel", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "invoke", "(Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/pager/PromoPlacementViewModel;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* renamed from: ru.ozon.app.android.storefront.widgets.placementSlider.core.ComposableSingletons$PromoPlacementComposeWidgetFactoryKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes2.dex */
final class ComposableSingletons$PromoPlacementComposeWidgetFactoryKt$lambda1$1 extends AbstractC7737t implements InterfaceC6512o<PromoPlacementViewModel, Function1<? super AtomAction, ? extends Unit>, InterfaceC3967k, Integer, Unit> {
    public static final ComposableSingletons$PromoPlacementComposeWidgetFactoryKt$lambda1$1 INSTANCE = new ComposableSingletons$PromoPlacementComposeWidgetFactoryKt$lambda1$1();

    ComposableSingletons$PromoPlacementComposeWidgetFactoryKt$lambda1$1() {
        super(4);
    }

    private static final PromoPlacementVO invoke$lambda$0(A1<PromoPlacementVO> a12) {
        return a12.getValue();
    }

    @Override // fd.InterfaceC6512o
    public /* bridge */ /* synthetic */ Unit invoke(PromoPlacementViewModel promoPlacementViewModel, Function1<? super AtomAction, ? extends Unit> function1, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(promoPlacementViewModel, (Function1<? super AtomAction, Unit>) function1, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(PromoPlacementViewModel viewModel, Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        PromoPlacementVO invoke$lambda$0 = invoke$lambda$0(C6285b.c(viewModel.getState(), interfaceC3967k, 0));
        Integer currentPage = viewModel.getCurrentPage();
        interfaceC3967k.o(1915735573);
        boolean F11 = interfaceC3967k.F(viewModel);
        Object C11 = interfaceC3967k.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new ComposableSingletons$PromoPlacementComposeWidgetFactoryKt$lambda1$1$1$1(viewModel);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        PromoPlacementPagerWidgetKt.PromoPlacementPagerWidget(invoke$lambda$0, currentPage, actionHandler, (InterfaceC6511n) ((h) C11), interfaceC3967k, (i11 << 3) & 896);
    }
}
