package ru.ozon.app.android.video.manager;

import Je.InterfaceC3394a;
import Sc.s;
import Wc.a;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoAsset;
import ru.ozon.app.android.video.player.performance.metricsManager.VideoPerfMetricsManagerHelper;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.video.manager.CacheTransferListener$addUrlToCacheMap$1", f = "CacheTransferListener.kt", l = {84}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class CacheTransferListener$addUrlToCacheMap$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $videoUrl;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ CacheTransferListener this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CacheTransferListener$addUrlToCacheMap$1(CacheTransferListener cacheTransferListener, String str, d<? super CacheTransferListener$addUrlToCacheMap$1> dVar) {
        super(2, dVar);
        this.this$0 = cacheTransferListener;
        this.$videoUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CacheTransferListener$addUrlToCacheMap$1(this.this$0, this.$videoUrl, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        VideoPerfMetricsManagerHelper videoPerfMetricsManagerHelper;
        InterfaceC3394a interfaceC3394a;
        String str;
        InterfaceC3394a interfaceC3394a2;
        CacheTransferListener cacheTransferListener;
        Map map;
        Map map2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (Exception e11) {
            Lm0.a.f17149a.e(Nk.a.b("CacheTransferListener addUrlToCacheMap error: ", e11.getMessage()), new Object[0]);
        }
        try {
            if (i11 == 0) {
                s.b(obj);
                videoPerfMetricsManagerHelper = this.this$0.videoPerfMetricsManagerHelper;
                if (videoPerfMetricsManagerHelper.isUrlActive(this.$videoUrl)) {
                    interfaceC3394a = this.this$0.mutex;
                    str = this.$videoUrl;
                    CacheTransferListener cacheTransferListener2 = this.this$0;
                    this.L$0 = interfaceC3394a;
                    this.L$1 = str;
                    this.L$2 = cacheTransferListener2;
                    this.label = 1;
                    if (interfaceC3394a.a(this) == aVar) {
                        return aVar;
                    }
                    interfaceC3394a2 = interfaceC3394a;
                    cacheTransferListener = cacheTransferListener2;
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cacheTransferListener = (CacheTransferListener) this.L$2;
            str = (String) this.L$1;
            interfaceC3394a2 = (InterfaceC3394a) this.L$0;
            s.b(obj);
            String castToBaseUrl$video_prodGoogleAllVendorsRelease = VideoAsset.INSTANCE.castToBaseUrl$video_prodGoogleAllVendorsRelease(str);
            map = cacheTransferListener.cacheAccessUrlsMap;
            map2 = cacheTransferListener.cacheAccessUrlsMap;
            Set set = (Set) map2.get(castToBaseUrl$video_prodGoogleAllVendorsRelease);
            map.put(castToBaseUrl$video_prodGoogleAllVendorsRelease, set != null ? e0.g(set, str) : e0.h(str));
            Unit unit = Unit.f71690a;
            interfaceC3394a2.c(null);
            return Unit.f71690a;
        } catch (Throwable th2) {
            interfaceC3394a2.c(null);
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CacheTransferListener$addUrlToCacheMap$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
