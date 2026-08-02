package ru.ozon.app.android.common;

import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.cache.cacheGroup.CacheGroup;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJE\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/common/SearchUrlPrefetchService;", "", "", "deeplink", "Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "cacheGroup", "", "useCache", "", "prefetch", "(Ljava/lang/String;Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;Z)V", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function1;", "navigateAction", "Lkotlin/Function0;", "loadingAction", "navigateWhenRequestPrefetched", "(Ljava/lang/String;Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "prefetch_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SearchUrlPrefetchService {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void navigateWhenRequestPrefetched$default(SearchUrlPrefetchService searchUrlPrefetchService, String str, J j11, Function1 function1, Function0 function0, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateWhenRequestPrefetched");
            }
            if ((i11 & 8) != 0) {
                function0 = null;
            }
            searchUrlPrefetchService.navigateWhenRequestPrefetched(str, j11, function1, function0);
        }

        public static /* synthetic */ void prefetch$default(SearchUrlPrefetchService searchUrlPrefetchService, String str, CacheGroup cacheGroup, boolean z11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prefetch");
            }
            if ((i11 & 4) != 0) {
                z11 = true;
            }
            searchUrlPrefetchService.prefetch(str, cacheGroup, z11);
        }
    }

    void navigateWhenRequestPrefetched(@NotNull String deeplink, @NotNull J lifecycleOwner, @NotNull Function1<? super String, Unit> navigateAction, Function0<Unit> loadingAction);

    void prefetch(@NotNull String deeplink, @NotNull CacheGroup cacheGroup, boolean useCache);
}
