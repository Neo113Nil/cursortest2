package ru.ozon.app.android.storefront.widgets.placementSlider.presentation.pager;

import Sc.s;
import WZ.l;
import WZ.t;
import Wc.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.storefront.widgets.placementSlider.presentation.BannerVO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storefront.widgets.placementSlider.presentation.pager.PromoPlacementPagerWidgetKt$PromoPlacementPagerWidget$4$1", f = "PromoPlacementPagerWidget.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PromoPlacementPagerWidgetKt$PromoPlacementPagerWidget$4$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ BannerVO $currentItem;
    final /* synthetic */ l $tokenizedAnalytics;
    final /* synthetic */ Set<Long> $viewedBannerIds;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromoPlacementPagerWidgetKt$PromoPlacementPagerWidget$4$1(BannerVO bannerVO, Set<Long> set, l lVar, d<? super PromoPlacementPagerWidgetKt$PromoPlacementPagerWidget$4$1> dVar) {
        super(2, dVar);
        this.$currentItem = bannerVO;
        this.$viewedBannerIds = set;
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PromoPlacementPagerWidgetKt$PromoPlacementPagerWidget$4$1(this.$currentItem, this.$viewedBannerIds, this.$tokenizedAnalytics, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        t tokenizedEvent = this.$currentItem.getTokenizedEvent();
        if (tokenizedEvent != null) {
            Set<Long> set = this.$viewedBannerIds;
            BannerVO bannerVO = this.$currentItem;
            l lVar = this.$tokenizedAnalytics;
            if (!set.contains(new Long(bannerVO.getId()))) {
                set.add(new Long(bannerVO.getId()));
                TokenizedAnalyticsExtensionsKt.processViewEvents$default(lVar, tokenizedEvent, null, 2, null);
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PromoPlacementPagerWidgetKt$PromoPlacementPagerWidget$4$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
