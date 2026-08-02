package ru.ozon.app.android.cart.emptyCart.core.v2.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.emptyCart.core.v2.data.EmptyCartV2Config;
import ru.ozon.app.android.cart.emptyCart.core.v2.presentation.EmptyCartV2ViewMapper;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/cart/emptyCart/core/v2/di/EmptyCartV2Module;", "", "<init>", "()V", "provideEmptyCartV2", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/cart/emptyCart/core/v2/data/EmptyCartV2Config;", "viewMapper", "Lru/ozon/app/android/cart/emptyCart/core/v2/presentation/EmptyCartV2ViewMapper;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EmptyCartV2Module {
    @NotNull
    public final Set<Widget2> provideEmptyCartV2(@NotNull EmptyCartV2Config config, @NotNull EmptyCartV2ViewMapper viewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        return e0.a(new Widget2("cart", "emptyCart", config, new ViewMapper2[]{viewMapper}));
    }
}
