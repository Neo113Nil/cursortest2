package ru.ozon.app.android.fresh.chat.widgets.floatCartButton.di;

import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.fresh.chat.widgets.floatCartButton.presentation.FloatCartButtonViewModel;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/floatCartButton/di/FloatCartButtonViewModelFactory;", "Landroidx/lifecycle/z0$b;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;)V", "Landroidx/lifecycle/w0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/w0;", "Lru/ozon/app/android/cart/common/domain/CartService;", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FloatCartButtonViewModelFactory implements z0.b {

    @NotNull
    private final CartService cartService;

    public FloatCartButtonViewModelFactory(@NotNull CartService cartService) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        this.cartService = cartService;
    }

    @Override // androidx.lifecycle.z0.b
    @NotNull
    public <T extends w0> T create(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return new FloatCartButtonViewModel(this.cartService);
    }
}
