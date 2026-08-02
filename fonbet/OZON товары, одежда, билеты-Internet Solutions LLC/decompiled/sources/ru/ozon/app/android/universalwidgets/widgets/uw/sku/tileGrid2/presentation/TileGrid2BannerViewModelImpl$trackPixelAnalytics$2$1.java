package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation;

import Sc.s;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.ads.data.pixel.presentation.Pixel;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.data.PixelAnalyticsKey;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BannerViewModelImpl$trackPixelAnalytics$2$1", f = "TileGrid2BannerViewModel.kt", l = {158, 159}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TileGrid2BannerViewModelImpl$trackPixelAnalytics$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ long $delayMs;
    final /* synthetic */ PixelAnalyticsKey $key;
    final /* synthetic */ Pixel $pixel;
    int label;
    final /* synthetic */ TileGrid2BannerViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid2BannerViewModelImpl$trackPixelAnalytics$2$1(long j11, TileGrid2BannerViewModelImpl tileGrid2BannerViewModelImpl, Pixel pixel, PixelAnalyticsKey pixelAnalyticsKey, d<? super TileGrid2BannerViewModelImpl$trackPixelAnalytics$2$1> dVar) {
        super(2, dVar);
        this.$delayMs = j11;
        this.this$0 = tileGrid2BannerViewModelImpl;
        this.$pixel = pixel;
        this.$key = pixelAnalyticsKey;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TileGrid2BannerViewModelImpl$trackPixelAnalytics$2$1(this.$delayMs, this.this$0, this.$pixel, this.$key, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r7 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        if (xe.Y.b(r4, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object safeTrackPixel;
        Set set;
        Map map;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            long j11 = this.$delayMs;
            this.label = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                set = this.this$0.oneTimePixelEventsSet;
                set.add(this.$key);
                map = this.this$0.pixelAnalyticsJobMap;
                map.remove(this.$key);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        TileGrid2BannerViewModelImpl tileGrid2BannerViewModelImpl = this.this$0;
        Pixel pixel = this.$pixel;
        this.label = 2;
        safeTrackPixel = tileGrid2BannerViewModelImpl.safeTrackPixel(pixel, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TileGrid2BannerViewModelImpl$trackPixelAnalytics$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
