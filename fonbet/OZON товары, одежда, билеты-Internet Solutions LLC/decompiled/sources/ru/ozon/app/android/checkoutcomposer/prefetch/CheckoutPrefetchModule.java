package ru.ozon.app.android.checkoutcomposer.prefetch;

import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.cache.cacheHandler.ComposerCacheHandler;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/prefetch/CheckoutPrefetchModule;", "", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class CheckoutPrefetchModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/prefetch/CheckoutPrefetchModule$Companion;", "", "<init>", "()V", "", "Lru/ozon/app/android/composer/network/cache/cacheHandler/ComposerCacheHandler;", "handlers", "Lru/ozon/app/android/checkoutcomposer/prefetch/CheckoutCacheHandler;", "provideCheckoutCacheHandler", "(Ljava/util/Set;)Lru/ozon/app/android/checkoutcomposer/prefetch/CheckoutCacheHandler;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CheckoutCacheHandler provideCheckoutCacheHandler(@NotNull Set<ComposerCacheHandler> handlers) {
            Intrinsics.checkNotNullParameter(handlers, "handlers");
            ArrayList arrayList = new ArrayList();
            for (Object obj : handlers) {
                if (obj instanceof CheckoutCacheHandler) {
                    arrayList.add(obj);
                }
            }
            return (CheckoutCacheHandler) C7714v.B0(arrayList);
        }

        private Companion() {
        }
    }
}
