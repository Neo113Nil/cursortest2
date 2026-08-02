package ru.ozon.app.android.web.webview.cache.service;

import Bc.r;
import Cw.c;
import Mc.a;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.web.webview.cache.models.CacheState;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\f"}, d2 = {"Lru/ozon/app/android/web/webview/cache/service/CacheManifestRepository;", "", "Lru/ozon/app/android/web/webview/cache/service/CacheManifestApi;", "api", "<init>", "(Lru/ozon/app/android/web/webview/cache/service/CacheManifestApi;)V", "Lio/reactivex/y;", "Lru/ozon/app/android/web/webview/cache/models/CacheState;", "loadRemoteCacheState", "()Lio/reactivex/y;", "Lru/ozon/app/android/web/webview/cache/service/CacheManifestApi;", "Companion", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CacheManifestRepository {

    @NotNull
    private final CacheManifestApi api;

    public CacheManifestRepository(@NotNull CacheManifestApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CacheState loadRemoteCacheState$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (CacheState) function1.invoke(p02);
    }

    @NotNull
    public final y<CacheState> loadRemoteCacheState() {
        r rVar = new r(this.api.loadManifest("https://www.ozon.ru/mini-app-manifest").j(a.b()), new c(CacheManifestRepository$loadRemoteCacheState$1.INSTANCE, 1));
        Intrinsics.checkNotNullExpressionValue(rVar, "map(...)");
        return rVar;
    }
}
