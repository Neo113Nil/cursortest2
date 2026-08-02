package ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain;

import Sc.s;
import WZ.t;
import Wc.a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.ads.data.pixel.presentation.Pixel;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.model.AdvBannerV4ItemVO;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.AdvBannerV4PlainViewModel$trackImpressionV4$1", f = "AdvBannerV4PlainViewModel.kt", l = {92}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class AdvBannerV4PlainViewModel$trackImpressionV4$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function2<t, WZ.e, Unit> $trackComposerAnalytics;
    final /* synthetic */ AdvBannerV4ItemVO $vo;
    int label;
    final /* synthetic */ AdvBannerV4PlainViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AdvBannerV4PlainViewModel$trackImpressionV4$1(AdvBannerV4PlainViewModel advBannerV4PlainViewModel, AdvBannerV4ItemVO advBannerV4ItemVO, Function2<? super t, ? super WZ.e, Unit> function2, d<? super AdvBannerV4PlainViewModel$trackImpressionV4$1> dVar) {
        super(2, dVar);
        this.this$0 = advBannerV4PlainViewModel;
        this.$vo = advBannerV4ItemVO;
        this.$trackComposerAnalytics = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AdvBannerV4PlainViewModel$trackImpressionV4$1(this.this$0, this.$vo, this.$trackComposerAnalytics, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        Map map;
        boolean checkIsImpressionTrackNeeded;
        Set set;
        List findPixels;
        a aVar = a.COROUTINE_SUSPENDED;
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
        z11 = this.this$0.canTrackPixels;
        if (z11) {
            checkIsImpressionTrackNeeded = this.this$0.checkIsImpressionTrackNeeded(this.$vo.getId());
            if (checkIsImpressionTrackNeeded) {
                set = this.this$0.trackedOneTimeImpressionEventsSet;
                set.add(new Long(this.$vo.getId()));
                findPixels = this.this$0.findPixels(this.$vo, Pixel.ActionType.IMPRESSION);
                if (findPixels != null) {
                    AdvBannerV4PlainViewModel advBannerV4PlainViewModel = this.this$0;
                    Iterator it = findPixels.iterator();
                    while (it.hasNext()) {
                        advBannerV4PlainViewModel.trackPixel((Pixel) it.next());
                    }
                }
                t impressionTokenizedEvent = this.$vo.getImpressionTokenizedEvent();
                if (impressionTokenizedEvent != null) {
                    this.$trackComposerAnalytics.invoke(impressionTokenizedEvent, null);
                }
            }
        }
        map = this.this$0.trackedImpressionJobMap;
        map.remove(new Long(this.$vo.getId()));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AdvBannerV4PlainViewModel$trackImpressionV4$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
