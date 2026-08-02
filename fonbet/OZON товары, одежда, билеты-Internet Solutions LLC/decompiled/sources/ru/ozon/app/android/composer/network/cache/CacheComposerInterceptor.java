package ru.ozon.app.android.composer.network.cache;

import A00.a;
import L00.g;
import L00.i;
import QZ.g;
import i10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.cache.util.PageUrl;
import ru.ozon.app.android.composer.network.util.ComposerRequestsKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/composer/network/cache/CacheComposerInterceptor;", "LQZ/g;", "Lru/ozon/app/android/composer/network/cache/ComposerCacheService;", "composerCacheService", "<init>", "(Lru/ozon/app/android/composer/network/cache/ComposerCacheService;)V", "Li10/h;", "composerState", "LA00/a;", "event", "", "clearCache", "(Li10/h;LA00/a;)V", "state", "trigger", "interceptState", "(Li10/h;LA00/a;)Li10/h;", "LL00/g;", "request", "LL00/i;", "extras", "interceptRequest", "(Li10/h;LL00/g;LL00/i;)LL00/g;", "Lru/ozon/app/android/composer/network/cache/ComposerCacheService;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CacheComposerInterceptor implements g {

    @NotNull
    private final ComposerCacheService composerCacheService;

    public CacheComposerInterceptor(@NotNull ComposerCacheService composerCacheService) {
        Intrinsics.checkNotNullParameter(composerCacheService, "composerCacheService");
        this.composerCacheService = composerCacheService;
    }

    private final void clearCache(h composerState, a event) {
        ClearCacheReason clearCacheReason;
        String j11 = composerState.j();
        if (j11 == null) {
            return;
        }
        if (event instanceof a.u.b) {
            clearCacheReason = ClearCacheReason.REFRESHED;
        } else if (!(event instanceof a.u.c)) {
            return;
        } else {
            clearCacheReason = ClearCacheReason.SWIPED_TO_REFRESH;
        }
        this.composerCacheService.mo631clearForFyG2aqw(PageUrl.INSTANCE.m662fromDeeplinkLLe0goI(j11), clearCacheReason);
    }

    @Override // QZ.g
    @NotNull
    public L00.g interceptRequest(@NotNull h state, @NotNull L00.g request, @NotNull i extras) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(extras, "extras");
        a aVar = (a) extras.b();
        if (aVar == null || !(aVar instanceof a.u.b) || !(((a.u.b) aVar).g() instanceof ForceNetworkRefreshParameters)) {
            return request;
        }
        request.getClass();
        return ComposerRequestsKt.forceNetwork(new g.a(request)).a();
    }

    @Override // QZ.g
    @NotNull
    public h interceptState(@NotNull h state, @NotNull a trigger) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        clearCache(state, trigger);
        return state;
    }

    @Override // QZ.g
    @NotNull
    public h onInit(@NotNull h state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return state;
    }
}
