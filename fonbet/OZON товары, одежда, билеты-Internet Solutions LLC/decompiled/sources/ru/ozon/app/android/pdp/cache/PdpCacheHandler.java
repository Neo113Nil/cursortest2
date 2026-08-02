package ru.ozon.app.android.pdp.cache;

import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.cache.ClearCacheReason;
import ru.ozon.app.android.composer.network.cache.ComposerCacheCleaner;
import ru.ozon.app.android.composer.network.cache.cacheGroup.CacheGroup;
import ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandlerDefaultImpl;
import ru.ozon.app.android.pdp.utils.ProductDeeplinkChecker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/cache/PdpCacheHandler;", "Lru/ozon/app/android/composer/network/cache/cacheHandler/ComposerCacheHandlerDefaultImpl;", "adaptRequestForCachingDelegate", "Lru/ozon/app/android/pdp/cache/PdpAdaptRequestForCachingDelegate;", "cacheCleaner", "Lru/ozon/app/android/composer/network/cache/ComposerCacheCleaner;", "<init>", "(Lru/ozon/app/android/pdp/cache/PdpAdaptRequestForCachingDelegate;Lru/ozon/app/android/composer/network/cache/ComposerCacheCleaner;)V", "getAdaptRequestForCachingDelegate", "()Lru/ozon/app/android/pdp/cache/PdpAdaptRequestForCachingDelegate;", "cacheGroup", "Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "getCacheGroup", "()Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "canHandle", "", ImagesContract.URL, "Lru/ozon/app/android/composer/network/cache/util/Url;", "pageUrl", "Lru/ozon/app/android/composer/network/cache/util/PageUrl;", "canHandle-46iOEHo", "(Ljava/lang/String;Ljava/lang/String;)Z", "shouldClearAllCache", "reason", "Lru/ozon/app/android/composer/network/cache/ClearCacheReason;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PdpCacheHandler extends ComposerCacheHandlerDefaultImpl {

    @NotNull
    private final PdpAdaptRequestForCachingDelegate adaptRequestForCachingDelegate;

    @NotNull
    private final CacheGroup cacheGroup;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClearCacheReason.values().length];
            try {
                iArr[ClearCacheReason.CART_STATE_CHANGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClearCacheReason.FAVORITE_STATE_CHANGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpCacheHandler(@NotNull PdpAdaptRequestForCachingDelegate adaptRequestForCachingDelegate, @NotNull ComposerCacheCleaner cacheCleaner) {
        super(cacheCleaner);
        Intrinsics.checkNotNullParameter(adaptRequestForCachingDelegate, "adaptRequestForCachingDelegate");
        Intrinsics.checkNotNullParameter(cacheCleaner, "cacheCleaner");
        this.adaptRequestForCachingDelegate = adaptRequestForCachingDelegate;
        this.cacheGroup = PdpCacheGroup.INSTANCE;
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandlerDefaultImpl, ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    /* renamed from: canHandle-46iOEHo */
    public boolean mo521canHandle46iOEHo(@NotNull String url, String pageUrl) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (pageUrl == null) {
            return super.mo521canHandle46iOEHo(url, null);
        }
        return ProductDeeplinkChecker.INSTANCE.isProductDeeplink(Uri.parse("ozon://" + h.S(pageUrl, "/")));
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    @NotNull
    public CacheGroup getCacheGroup() {
        return this.cacheGroup;
    }

    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandlerDefaultImpl, ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler
    public boolean shouldClearAllCache(@NotNull ClearCacheReason reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        int i11 = WhenMappings.$EnumSwitchMapping$0[reason.ordinal()];
        return (i11 == 1 || i11 == 2) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandlerDefaultImpl
    @NotNull
    public PdpAdaptRequestForCachingDelegate getAdaptRequestForCachingDelegate() {
        return this.adaptRequestForCachingDelegate;
    }
}
