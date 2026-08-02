package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.pixel;

import Sc.s;
import Wc.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.ads.data.pixel.PixelApiRepository;
import ru.ozon.app.android.ads.data.pixel.presentation.Pixel;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.pixel.PixelAnalyticsViewModel$trackPixel$1", f = "PixelAnalyticsViewModel.kt", l = {22}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PixelAnalyticsViewModel$trackPixel$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Pixel $pixel;
    int label;
    final /* synthetic */ PixelAnalyticsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PixelAnalyticsViewModel$trackPixel$1(PixelAnalyticsViewModel pixelAnalyticsViewModel, Pixel pixel, d<? super PixelAnalyticsViewModel$trackPixel$1> dVar) {
        super(2, dVar);
        this.this$0 = pixelAnalyticsViewModel;
        this.$pixel = pixel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PixelAnalyticsViewModel$trackPixel$1(this.this$0, this.$pixel, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        PixelApiRepository pixelApiRepository;
        Set set;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                pixelApiRepository = this.this$0.pixelApiRepository;
                String url = this.$pixel.getUrl();
                this.label = 1;
                if (pixelApiRepository.track(url, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            set = this.this$0.trackedOneTimeEventsSet;
            set.add(new Integer(this.$pixel.hashCode()));
        } catch (Throwable th2) {
            Lm0.a.f17149a.e(th2);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PixelAnalyticsViewModel$trackPixel$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
