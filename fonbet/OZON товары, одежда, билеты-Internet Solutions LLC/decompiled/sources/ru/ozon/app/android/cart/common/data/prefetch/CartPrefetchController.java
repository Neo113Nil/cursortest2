package ru.ozon.app.android.cart.common.data.prefetch;

import Xc.a;
import Xc.b;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u0010J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/cart/common/data/prefetch/CartPrefetchController;", "", "Lru/ozon/app/android/cart/common/data/prefetch/CartPrefetchController$ClearCacheReason;", "reason", "", "clearCache", "(Lru/ozon/app/android/cart/common/data/prefetch/CartPrefetchController$ClearCacheReason;)V", "prefetchOnAppStart", "()V", "", "requestId", ImagesContract.URL, "", "statusCode", "tracePageLoad", "(Ljava/lang/String;Ljava/lang/String;I)V", "ClearCacheReason", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CartPrefetchController {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cart/common/data/prefetch/CartPrefetchController$ClearCacheReason;", "", "<init>", "(Ljava/lang/String;I)V", "CART_PREFETCH", "CART_BEFORE_START_PREFETCH", "CANCEL_ORDER", "CANCEL_ORDER_HANDLER_V3", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ClearCacheReason {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ClearCacheReason[] $VALUES;
        public static final ClearCacheReason CART_PREFETCH = new ClearCacheReason("CART_PREFETCH", 0);
        public static final ClearCacheReason CART_BEFORE_START_PREFETCH = new ClearCacheReason("CART_BEFORE_START_PREFETCH", 1);
        public static final ClearCacheReason CANCEL_ORDER = new ClearCacheReason("CANCEL_ORDER", 2);
        public static final ClearCacheReason CANCEL_ORDER_HANDLER_V3 = new ClearCacheReason("CANCEL_ORDER_HANDLER_V3", 3);

        private static final /* synthetic */ ClearCacheReason[] $values() {
            return new ClearCacheReason[]{CART_PREFETCH, CART_BEFORE_START_PREFETCH, CANCEL_ORDER, CANCEL_ORDER_HANDLER_V3};
        }

        static {
            ClearCacheReason[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ClearCacheReason(String str, int i11) {
        }

        public static ClearCacheReason valueOf(String str) {
            return (ClearCacheReason) Enum.valueOf(ClearCacheReason.class, str);
        }

        public static ClearCacheReason[] values() {
            return (ClearCacheReason[]) $VALUES.clone();
        }
    }

    void clearCache(@NotNull ClearCacheReason reason);

    void prefetchOnAppStart();

    void tracePageLoad(String requestId, @NotNull String url, int statusCode);
}
