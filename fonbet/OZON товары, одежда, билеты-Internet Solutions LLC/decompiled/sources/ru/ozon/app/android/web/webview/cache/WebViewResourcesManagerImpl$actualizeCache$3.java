package ru.ozon.app.android.web.webview.cache;

import Bc.d;
import Ej.b;
import Lm0.a;
import io.reactivex.C;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.web.webview.cache.models.BothCacheStates;
import ru.ozon.app.android.web.webview.cache.service.LocalStateActualizer;
import ru.ozon.app.android.web.webview.cache.service.ResourcesDiffer;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/web/webview/cache/models/BothCacheStates;", "Lkotlin/jvm/internal/EnhancedNullability;", "bothSates", "Lio/reactivex/C;", "Lru/ozon/app/android/web/webview/cache/service/LocalStateActualizer$ActualizingResult;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/web/webview/cache/models/BothCacheStates;)Lio/reactivex/C;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class WebViewResourcesManagerImpl$actualizeCache$3 extends AbstractC7737t implements Function1<BothCacheStates, C<? extends LocalStateActualizer.ActualizingResult>> {
    final /* synthetic */ int $batchSize;
    final /* synthetic */ int $parallelism;
    final /* synthetic */ WebViewResourcesManagerImpl this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "actualizingResult", "Lru/ozon/app/android/web/webview/cache/service/LocalStateActualizer$ActualizingResult;", "kotlin.jvm.PlatformType", "invoke-r9BgDN0", "(Lru/ozon/app/android/web/webview/cache/service/LocalStateActualizer$ActualizingResult;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.web.webview.cache.WebViewResourcesManagerImpl$actualizeCache$3$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<LocalStateActualizer.ActualizingResult, Unit> {
        final /* synthetic */ BothCacheStates $bothSates;
        final /* synthetic */ WebViewResourcesManagerImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(WebViewResourcesManagerImpl webViewResourcesManagerImpl, BothCacheStates bothCacheStates) {
            super(1);
            this.this$0 = webViewResourcesManagerImpl;
            this.$bothSates = bothCacheStates;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LocalStateActualizer.ActualizingResult actualizingResult) {
            m1576invoker9BgDN0(actualizingResult);
            return Unit.f71690a;
        }

        /* renamed from: invoke-r9BgDN0, reason: not valid java name */
        public final void m1576invoker9BgDN0(LocalStateActualizer.ActualizingResult actualizingResult) {
            a.b bVar = Lm0.a.f17149a;
            bVar.b("WebViewCache");
            bVar.d(b.a(actualizingResult.getErrorCount(), "Resources wasn't loaded: "), new Object[0]);
            if (actualizingResult.getErrorCount() == 0) {
                this.this$0.saveLocalCacheVersion(this.$bothSates.getRemoteCacheState().getVersion());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebViewResourcesManagerImpl$actualizeCache$3(WebViewResourcesManagerImpl webViewResourcesManagerImpl, int i11, int i12) {
        super(1);
        this.this$0 = webViewResourcesManagerImpl;
        this.$batchSize = i11;
        this.$parallelism = i12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C<? extends LocalStateActualizer.ActualizingResult> invoke(BothCacheStates bothSates) {
        LocalStateActualizer localStateActualizer;
        ResourcesDiffer resourcesDiffer;
        Intrinsics.checkNotNullParameter(bothSates, "bothSates");
        localStateActualizer = this.this$0.localStateActualizer;
        int i11 = this.$batchSize;
        int i12 = this.$parallelism;
        resourcesDiffer = this.this$0.resourcesDiffer;
        y<LocalStateActualizer.ActualizingResult> actualizeLocalState = localStateActualizer.actualizeLocalState(i11, i12, resourcesDiffer.getDiff(bothSates));
        a aVar = new a(new AnonymousClass1(this.this$0, bothSates));
        actualizeLocalState.getClass();
        return new d(actualizeLocalState, aVar);
    }
}
