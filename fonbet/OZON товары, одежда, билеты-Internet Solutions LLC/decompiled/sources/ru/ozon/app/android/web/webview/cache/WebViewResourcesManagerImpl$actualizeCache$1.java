package ru.ozon.app.android.web.webview.cache;

import Lm0.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.web.webview.cache.models.CacheState;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/web/webview/cache/models/CacheState;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/web/webview/cache/models/CacheState;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class WebViewResourcesManagerImpl$actualizeCache$1 extends AbstractC7737t implements Function1<CacheState, Boolean> {
    final /* synthetic */ WebViewResourcesManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebViewResourcesManagerImpl$actualizeCache$1(WebViewResourcesManagerImpl webViewResourcesManagerImpl) {
        super(1);
        this.this$0 = webViewResourcesManagerImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(CacheState it) {
        String localCacheVersion;
        Intrinsics.checkNotNullParameter(it, "it");
        localCacheVersion = this.this$0.getLocalCacheVersion();
        boolean d11 = Intrinsics.d(localCacheVersion, it.getVersion());
        Boolean valueOf = Boolean.valueOf(!d11);
        if (d11) {
            a.b bVar = Lm0.a.f17149a;
            bVar.b("WebViewCache");
            bVar.d("Cache is already actual", new Object[0]);
        }
        return valueOf;
    }
}
