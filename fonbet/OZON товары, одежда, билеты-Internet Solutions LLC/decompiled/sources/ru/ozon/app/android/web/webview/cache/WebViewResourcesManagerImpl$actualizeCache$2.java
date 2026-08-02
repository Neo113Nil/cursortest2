package ru.ozon.app.android.web.webview.cache;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.web.webview.cache.models.BothCacheStates;
import ru.ozon.app.android.web.webview.cache.models.CacheState;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class WebViewResourcesManagerImpl$actualizeCache$2 extends C7735q implements Function1<CacheState, BothCacheStates> {
    WebViewResourcesManagerImpl$actualizeCache$2(Object obj) {
        super(1, obj, WebViewResourcesManagerImpl.class, "mergeLocalAndRemoteStates", "mergeLocalAndRemoteStates(Lru/ozon/app/android/web/webview/cache/models/CacheState;)Lru/ozon/app/android/web/webview/cache/models/BothCacheStates;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final BothCacheStates invoke(CacheState p02) {
        BothCacheStates mergeLocalAndRemoteStates;
        Intrinsics.checkNotNullParameter(p02, "p0");
        mergeLocalAndRemoteStates = ((WebViewResourcesManagerImpl) this.receiver).mergeLocalAndRemoteStates(p02);
        return mergeLocalAndRemoteStates;
    }
}
