package ru.ozon.app.android.storefront.widgets.placementSlider.presentation.singleBanner;

import S0.InterfaceC3978p0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.storefront.widgets.placementSlider.presentation.BannerVO;
import ru.ozon.app.android.storefront.widgets.placementSlider.presentation.pager.PromoPlacementViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storefront.widgets.placementSlider.presentation.singleBanner.PromoPlacementSingleWidgetKt$PromoPlacementSingleWidget$2$1", f = "PromoPlacementSingleWidget.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PromoPlacementSingleWidgetKt$PromoPlacementSingleWidget$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ BannerVO $banner;
    final /* synthetic */ InterfaceC3978p0<Boolean> $isWidgetVisible$delegate;
    final /* synthetic */ PromoPlacementViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PromoPlacementSingleWidgetKt$PromoPlacementSingleWidget$2$1(PromoPlacementViewModel promoPlacementViewModel, BannerVO bannerVO, Function1<? super AtomAction, Unit> function1, InterfaceC3978p0<Boolean> interfaceC3978p0, d<? super PromoPlacementSingleWidgetKt$PromoPlacementSingleWidget$2$1> dVar) {
        super(2, dVar);
        this.$viewModel = promoPlacementViewModel;
        this.$banner = bannerVO;
        this.$actionHandler = function1;
        this.$isWidgetVisible$delegate = interfaceC3978p0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PromoPlacementSingleWidgetKt$PromoPlacementSingleWidget$2$1(this.$viewModel, this.$banner, this.$actionHandler, this.$isWidgetVisible$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean PromoPlacementSingleWidget$lambda$1;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        PromoPlacementViewModel promoPlacementViewModel = this.$viewModel;
        PromoPlacementSingleWidget$lambda$1 = PromoPlacementSingleWidgetKt.PromoPlacementSingleWidget$lambda$1(this.$isWidgetVisible$delegate);
        AtomAction onBannerViewed = promoPlacementViewModel.onBannerViewed(PromoPlacementSingleWidget$lambda$1, this.$banner);
        if (onBannerViewed != null) {
            this.$actionHandler.invoke(onBannerViewed);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PromoPlacementSingleWidgetKt$PromoPlacementSingleWidget$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
