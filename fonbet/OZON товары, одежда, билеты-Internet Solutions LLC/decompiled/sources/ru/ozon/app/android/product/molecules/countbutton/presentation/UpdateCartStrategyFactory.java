package ru.ozon.app.android.product.molecules.countbutton.presentation;

import Sc.o;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.storefront.data.tiles.countbutton.UpdateCartMode;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/product/molecules/countbutton/presentation/UpdateCartStrategyFactory;", "", "cartService", "Lru/ozon/app/android/cart/common/domain/CartService;", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;)V", "cache", "", "Lru/ozon/app/android/storefront/data/tiles/countbutton/UpdateCartMode;", "Lru/ozon/app/android/product/molecules/countbutton/presentation/UpdateCartStrategy;", "getStrategy", "mode", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UpdateCartStrategyFactory {

    @NotNull
    private final Map<UpdateCartMode, UpdateCartStrategy> cache;

    @NotNull
    private final CartService cartService;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UpdateCartMode.values().length];
            try {
                iArr[UpdateCartMode.INCREMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UpdateCartMode.INCREMENT_DECREMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UpdateCartStrategyFactory(@NotNull CartService cartService) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        this.cartService = cartService;
        this.cache = new LinkedHashMap();
    }

    @NotNull
    public final UpdateCartStrategy getStrategy(@NotNull UpdateCartMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Map<UpdateCartMode, UpdateCartStrategy> map = this.cache;
        UpdateCartStrategy updateCartStrategy = map.get(mode);
        if (updateCartStrategy == null) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
            if (i11 == 1) {
                updateCartStrategy = new IncrementStrategy(this.cartService);
            } else {
                if (i11 != 2) {
                    throw new o();
                }
                updateCartStrategy = new IncrementDecrementStrategy(this.cartService);
            }
            map.put(mode, updateCartStrategy);
        }
        return updateCartStrategy;
    }
}
