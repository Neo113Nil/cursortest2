package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation;

import Sc.s;
import WZ.t;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2BannerVO;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BannerViewModelImpl$trackImpressionAnalytics$1", f = "TileGrid2BannerViewModel.kt", l = {136}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TileGrid2BannerViewModelImpl$trackImpressionAnalytics$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function2<t, WZ.e, Unit> $trackComposerAnalytics;
    final /* synthetic */ TileGrid2BannerVO $vo;
    int label;
    final /* synthetic */ TileGrid2BannerViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TileGrid2BannerViewModelImpl$trackImpressionAnalytics$1(TileGrid2BannerVO tileGrid2BannerVO, TileGrid2BannerViewModelImpl tileGrid2BannerViewModelImpl, Function2<? super t, ? super WZ.e, Unit> function2, d<? super TileGrid2BannerViewModelImpl$trackImpressionAnalytics$1> dVar) {
        super(2, dVar);
        this.$vo = tileGrid2BannerVO;
        this.this$0 = tileGrid2BannerViewModelImpl;
        this.$trackComposerAnalytics = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TileGrid2BannerViewModelImpl$trackImpressionAnalytics$1(this.$vo, this.this$0, this.$trackComposerAnalytics, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Map map;
        Set set;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            this.label = 1;
            if (Y.b(1000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        t impressionTokenizedEvent = this.$vo.getImpressionTokenizedEvent();
        if (impressionTokenizedEvent != null) {
            Function2<t, WZ.e, Unit> function2 = this.$trackComposerAnalytics;
            TileGrid2BannerViewModelImpl tileGrid2BannerViewModelImpl = this.this$0;
            TileGrid2BannerVO tileGrid2BannerVO = this.$vo;
            function2.invoke(impressionTokenizedEvent, null);
            set = tileGrid2BannerViewModelImpl.oneTimeImpressionEventsSet;
            set.add(new Long(tileGrid2BannerVO.getId()));
        }
        map = this.this$0.impressionAnalyticsJobMap;
        map.remove(new Long(this.$vo.getId()));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TileGrid2BannerViewModelImpl$trackImpressionAnalytics$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
