package ru.ozon.app.android.video.player.performance.metricsManager;

import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricAction;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManagerImpl$runPostDelayedMapCheck$job$1", f = "VideoPerfMetricsManager.kt", l = {242}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class VideoPerfMetricsManagerImpl$runPostDelayedMapCheck$job$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $baseUrl;
    final /* synthetic */ VideoAsset $videoAsset;
    int label;
    final /* synthetic */ VideoPerfMetricsManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoPerfMetricsManagerImpl$runPostDelayedMapCheck$job$1(VideoPerfMetricsManagerImpl videoPerfMetricsManagerImpl, VideoAsset videoAsset, String str, d<? super VideoPerfMetricsManagerImpl$runPostDelayedMapCheck$job$1> dVar) {
        super(2, dVar);
        this.this$0 = videoPerfMetricsManagerImpl;
        this.$videoAsset = videoAsset;
        this.$baseUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new VideoPerfMetricsManagerImpl$runPostDelayedMapCheck$job$1(this.this$0, this.$videoAsset, this.$baseUrl, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Map map;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                this.label = 1;
                if (Y.b(2000L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            this.this$0.handleMetricActionByUrl(this.$videoAsset, VideoPerfMetricAction.SendAwaitMetricsManually.INSTANCE);
            map = this.this$0.awaitMetricsCheckJobMap;
            map.remove(this.$baseUrl);
        } catch (Exception e11) {
            Lm0.a.f17149a.e(Nk.a.b("VideoPerfMetricsManager runPostDelayedMapCheck error: ", e11.getMessage()), new Object[0]);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((VideoPerfMetricsManagerImpl$runPostDelayedMapCheck$job$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
