package ru.ozon.app.android.web.webview.cache;

import Lm0.a;
import Ql.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.L;
import ru.ozon.app.android.web.webview.cache.service.LocalStateActualizer;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/web/webview/cache/service/LocalStateActualizer$ActualizingResult;", "kotlin.jvm.PlatformType", "invoke-r9BgDN0", "(Lru/ozon/app/android/web/webview/cache/service/LocalStateActualizer$ActualizingResult;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class WebViewResourcesManagerImpl$actualizeCache$6 extends AbstractC7737t implements Function1<LocalStateActualizer.ActualizingResult, Unit> {
    final /* synthetic */ int $batchSize;
    final /* synthetic */ Function0<Unit> $onFinished;
    final /* synthetic */ int $parallelism;
    final /* synthetic */ L $timer;
    final /* synthetic */ WebViewResourcesManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebViewResourcesManagerImpl$actualizeCache$6(L l11, int i11, int i12, WebViewResourcesManagerImpl webViewResourcesManagerImpl, Function0<Unit> function0) {
        super(1);
        this.$timer = l11;
        this.$batchSize = i11;
        this.$parallelism = i12;
        this.this$0 = webViewResourcesManagerImpl;
        this.$onFinished = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LocalStateActualizer.ActualizingResult actualizingResult) {
        m1577invoker9BgDN0(actualizingResult);
        return Unit.f71690a;
    }

    /* renamed from: invoke-r9BgDN0, reason: not valid java name */
    public final void m1577invoker9BgDN0(LocalStateActualizer.ActualizingResult actualizingResult) {
        long currentTimeMillis = System.currentTimeMillis() - this.$timer.f71786a;
        a.b bVar = Lm0.a.f17149a;
        bVar.b("WebViewCache");
        int i11 = this.$batchSize;
        int i12 = this.$parallelism;
        StringBuilder b11 = c.b(currentTimeMillis, "Cache actualized for ", i11, " BATCH_SIZE: ");
        b11.append(" PARALLELISM: ");
        b11.append(i12);
        bVar.d(b11.toString(), new Object[0]);
        this.this$0.handleActualizeFinish();
        Function0<Unit> function0 = this.$onFinished;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
