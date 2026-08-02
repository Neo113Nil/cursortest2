package ru.ozon.app.android.web.webview.cache.service;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.web.webview.cache.models.CacheState;
import ru.ozon.app.android.web.webview.cache.models.LoadManifestResponse;
import ru.ozon.app.android.web.webview.cache.models.ManifestMapperKt;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/web/webview/cache/models/CacheState;", "kotlin.jvm.PlatformType", "it", "Lru/ozon/app/android/web/webview/cache/models/LoadManifestResponse;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/web/webview/cache/models/LoadManifestResponse;)Lru/ozon/app/android/web/webview/cache/models/CacheState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CacheManifestRepository$loadRemoteCacheState$1 extends AbstractC7737t implements Function1<LoadManifestResponse, CacheState> {
    public static final CacheManifestRepository$loadRemoteCacheState$1 INSTANCE = new CacheManifestRepository$loadRemoteCacheState$1();

    CacheManifestRepository$loadRemoteCacheState$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CacheState invoke(LoadManifestResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ManifestMapperKt.toVO(it);
    }
}
