package ru.ozon.app.android.composer.network.cache.interceptor.cacheError;

import Ib.a;
import We.B;
import We.C4862d;
import We.G;
import We.InterfaceC4865g;
import We.L;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.l;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.cache.ClearCacheReason;
import ru.ozon.app.android.composer.network.cache.ComposerCacheCleaner;
import ru.ozon.app.android.composer.network.cache.cacheGroup.CacheGroup;
import ru.ozon.app.android.composer.network.cache.interceptor.adaptUrl.UrlChangesKt;
import ru.ozon.app.android.composer.network.cache.util.AdaptedUrl;
import ru.ozon.app.android.composer.network.cache.util.Url;
import ru.ozon.app.android.composer.network.util.RequestsKt;
import ru.ozon.app.android.composer.network.util.ResponsesKt;
import ru.ozon.app.android.logger.BxLogger;
import xe.C10720e0;
import xe.C10727i;
import xe.J;
import xe.M;
import xe.N;
import xe.X0;
import xe.g1;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001:\u0003\u000b\f\rJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CheckCacheStrategy;", "", "LWe/L;", "response", "LWe/B$a;", "chain", "Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CatchErrorsStrategy;", "catchErrorsStrategy", "", "execute", "(LWe/L;LWe/B$a;Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CatchErrorsStrategy;)V", "Disabled", "WriteToCacheErrorException", "Enabled", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CheckCacheStrategy {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CheckCacheStrategy$Disabled;", "Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CheckCacheStrategy;", "<init>", "()V", "LWe/L;", "response", "LWe/B$a;", "chain", "Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CatchErrorsStrategy;", "catchErrorsStrategy", "", "execute", "(LWe/L;LWe/B$a;Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CatchErrorsStrategy;)V", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Disabled implements CheckCacheStrategy {

        @NotNull
        public static final Disabled INSTANCE = new Disabled();

        private Disabled() {
        }

        @Override // ru.ozon.app.android.composer.network.cache.interceptor.cacheError.CheckCacheStrategy
        public void execute(@NotNull L response, @NotNull B.a chain, @NotNull CatchErrorsStrategy catchErrorsStrategy) {
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(chain, "chain");
            Intrinsics.checkNotNullParameter(catchErrorsStrategy, "catchErrorsStrategy");
        }
    }

    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001@BE\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\rJE\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010!\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0012H\u0002¢\u0006\u0004\b!\u0010\"J\u001b\u0010$\u001a\u00020\u0004*\u00020\b2\u0006\u0010#\u001a\u00020\u001dH\u0002¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010#\u001a\u00020\u001dH\u0002¢\u0006\u0004\b'\u0010(J'\u0010+\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u00105R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00106R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00106R\u001a\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\f\n\u0004\b8\u00109\u0012\u0004\b:\u0010;R\u001c\u0010?\u001a\n <*\u0004\u0018\u00010\b0\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CheckCacheStrategy$Enabled;", "Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CheckCacheStrategy;", "", "checkCacheDelayMillis", "", "logCanceledRequest", "logManualRemoveFromCache", "LIb/a;", "LWe/d;", "cacheLazy", "Lru/ozon/app/android/composer/network/cache/ComposerCacheCleaner;", "cacheCleanerLazy", "<init>", "(JZLjava/lang/Boolean;LIb/a;LIb/a;)V", "LWe/L;", "response", "LWe/g;", "call", "", "prevCacheWriteAbortCount", "prevCacheWriteSuccessCount", "", "", "caughtErrors", "Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CatchErrorsStrategy;", "catchErrorsStrategy", "", "checkResponseInCache", "(LWe/L;LWe/g;IILjava/util/List;Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CatchErrorsStrategy;)V", "", "key", "prev", "cur", "logWriteCount", "(Ljava/lang/String;II)V", "adaptedUrl", "isContains", "(LWe/d;Ljava/lang/String;)Z", "Lru/ozon/app/android/composer/network/cache/ClearCacheReason;", "removeFromClearHistory", "(Ljava/lang/String;)Lru/ozon/app/android/composer/network/cache/ClearCacheReason;", "LWe/B$a;", "chain", "execute", "(LWe/L;LWe/B$a;Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CatchErrorsStrategy;)V", "J", "getCheckCacheDelayMillis", "()J", "Z", "getLogCanceledRequest", "()Z", "Ljava/lang/Boolean;", "getLogManualRemoveFromCache", "()Ljava/lang/Boolean;", "LIb/a;", "Lxe/M;", "scope", "Lxe/M;", "getScope$annotations", "()V", "kotlin.jvm.PlatformType", "getCache", "()LWe/d;", "cache", "Factory", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Enabled implements CheckCacheStrategy {

        @NotNull
        private final a<ComposerCacheCleaner> cacheCleanerLazy;

        @NotNull
        private final a<C4862d> cacheLazy;
        private final long checkCacheDelayMillis;
        private final boolean logCanceledRequest;
        private final Boolean logManualRemoveFromCache;

        @NotNull
        private final M scope;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J'\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CheckCacheStrategy$Enabled$Factory;", "", "create", "Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CheckCacheStrategy$Enabled;", "checkCacheDelayMillis", "", "logCanceledRequest", "", "logManualRemoveFromCache", "(JZLjava/lang/Boolean;)Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CheckCacheStrategy$Enabled;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public interface Factory {
            @NotNull
            Enabled create(long checkCacheDelayMillis, boolean logCanceledRequest, Boolean logManualRemoveFromCache);
        }

        public Enabled(long j11, boolean z11, Boolean bool, @NotNull a<C4862d> cacheLazy, @NotNull a<ComposerCacheCleaner> cacheCleanerLazy) {
            Intrinsics.checkNotNullParameter(cacheLazy, "cacheLazy");
            Intrinsics.checkNotNullParameter(cacheCleanerLazy, "cacheCleanerLazy");
            this.checkCacheDelayMillis = j11;
            this.logCanceledRequest = z11;
            this.logManualRemoveFromCache = bool;
            this.cacheLazy = cacheLazy;
            this.cacheCleanerLazy = cacheCleanerLazy;
            g gVar = g.f71771a;
            g1 context = C10720e0.b();
            gVar.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            this.scope = N.a(context.plus(new CheckCacheStrategy$Enabled$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0)).plus(X0.b()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkResponseInCache(L response, InterfaceC4865g call, int prevCacheWriteAbortCount, int prevCacheWriteSuccessCount, List<? extends Throwable> caughtErrors, CatchErrorsStrategy catchErrorsStrategy) {
            String str;
            G L11 = response.L();
            String a11 = L11.j().toString();
            C4862d cache = getCache();
            Intrinsics.checkNotNullExpressionValue(cache, "<get-cache>(...)");
            if (isContains(cache, a11)) {
                catchErrorsStrategy.removeErrors(caughtErrors);
                return;
            }
            boolean isCanceled = call.isCanceled();
            if (!isCanceled || this.logCanceledRequest) {
                ClearCacheReason removeFromClearHistory = removeFromClearHistory(a11);
                if (removeFromClearHistory == null || !Intrinsics.d(this.logManualRemoveFromCache, Boolean.FALSE)) {
                    String str2 = this.checkCacheDelayMillis + " ms";
                    CacheGroup cacheGroup = RequestsKt.cacheGroup(L11);
                    String valueOf = String.valueOf(cacheGroup != null ? cacheGroup.getClass().getName() : null);
                    BxLogger bxLogger = BxLogger.INSTANCE;
                    catchErrorsStrategy.logErrors(bxLogger, caughtErrors);
                    bxLogger.setTag("check-cache-delay", str2);
                    bxLogger.setTag("request-canceled", String.valueOf(isCanceled));
                    bxLogger.setTag("cache-group", valueOf);
                    if (removeFromClearHistory == null || (str = removeFromClearHistory.name()) == null) {
                        str = "removed automatically";
                    }
                    bxLogger.setTag("clear-cache-reason", str);
                    bxLogger.setTag("max-age", String.valueOf(response.d().c()));
                    logWriteCount("cache-write-abort-count", prevCacheWriteAbortCount, getCache().t());
                    logWriteCount("cache-write-success-count", prevCacheWriteSuccessCount, getCache().v());
                    bxLogger.putKey("adapted request url", a11);
                    String originalUrl = UrlChangesKt.originalUrl(L11);
                    bxLogger.putKey("original request url", originalUrl == null ? "null" : Url.m668toStringimpl(originalUrl));
                    bxLogger.putKey("log manual remove from cache", this.logManualRemoveFromCache);
                    bxLogger.putKey("log canceled requests", Boolean.valueOf(this.logCanceledRequest));
                    bxLogger.logException(WriteToCacheErrorException.INSTANCE);
                }
            }
        }

        private final C4862d getCache() {
            return this.cacheLazy.get();
        }

        private final boolean isContains(C4862d c4862d, String str) {
            String i02 = h.i0(str, "://");
            Iterator it = l.b(c4862d.s()).iterator();
            while (it.hasNext()) {
                if (h.A((String) it.next(), i02, false)) {
                    return true;
                }
            }
            return false;
        }

        private final void logWriteCount(String key, int prev, int cur) {
            String str = prev == cur ? "not changed" : prev < cur ? "increased" : "decreased";
            BxLogger bxLogger = BxLogger.INSTANCE;
            bxLogger.setTag(key, str);
            bxLogger.putKey(key, "previous value: " + prev + " | current value: " + cur);
        }

        private final ClearCacheReason removeFromClearHistory(String adaptedUrl) {
            return this.cacheCleanerLazy.get().mo630removeFromClearHistorys7RZ03s(AdaptedUrl.m651constructorimpl(adaptedUrl));
        }

        @Override // ru.ozon.app.android.composer.network.cache.interceptor.cacheError.CheckCacheStrategy
        public void execute(@NotNull L response, @NotNull B.a chain, @NotNull CatchErrorsStrategy catchErrorsStrategy) {
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(chain, "chain");
            Intrinsics.checkNotNullParameter(catchErrorsStrategy, "catchErrorsStrategy");
            if (response.j() == null && ResponsesKt.hasCacheControl(response)) {
                List<Throwable> errors = catchErrorsStrategy.getErrors();
                int t2 = getCache().t();
                int v11 = getCache().v();
                C10727i.c(this.scope, null, null, new CheckCacheStrategy$Enabled$execute$1(this, response, chain.call(), t2, v11, errors, catchErrorsStrategy, null), 3);
            }
        }

        public final long getCheckCacheDelayMillis() {
            return this.checkCacheDelayMillis;
        }

        public final boolean getLogCanceledRequest() {
            return this.logCanceledRequest;
        }

        public final Boolean getLogManualRemoveFromCache() {
            return this.logManualRemoveFromCache;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/composer/network/cache/interceptor/cacheError/CheckCacheStrategy$WriteToCacheErrorException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    private static final class WriteToCacheErrorException extends RuntimeException {

        @NotNull
        public static final WriteToCacheErrorException INSTANCE = new WriteToCacheErrorException();

        private WriteToCacheErrorException() {
            super("Response has Cache-Control header but not written to OkHttp Cache");
        }
    }

    void execute(@NotNull L response, @NotNull B.a chain, @NotNull CatchErrorsStrategy catchErrorsStrategy);
}
