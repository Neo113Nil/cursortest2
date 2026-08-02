package ru.ozon.app.android.cart.domain.delegate;

import Sc.InterfaceC3999a;
import androidx.lifecycle.AbstractC5434v;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.delegate.CartScreenStateHolder;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0007\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\r\u001a\u00020\f8VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\r\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\f8VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0003\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/cart/domain/delegate/CartScreenStateHolderImpl;", "Lru/ozon/app/android/cart/common/domain/delegate/CartScreenStateHolder;", "<init>", "()V", "Landroidx/lifecycle/v$b;", "state", "", "setState", "(Landroidx/lifecycle/v$b;)V", "", "miniApp", "(Landroidx/lifecycle/v$b;Ljava/lang/String;)V", "", "isOpen", "(Ljava/lang/String;)Z", "currentState", "Landroidx/lifecycle/v$b;", "", "currentStates", "Ljava/util/Map;", "()Z", "isOpen$annotations", "isStarted", "isStarted$annotations", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartScreenStateHolderImpl implements CartScreenStateHolder {

    @NotNull
    private AbstractC5434v.b currentState = AbstractC5434v.b.DESTROYED;

    @NotNull
    private Map<String, AbstractC5434v.b> currentStates = new LinkedHashMap();

    @Override // ru.ozon.app.android.cart.common.domain.delegate.CartScreenStateHolder
    public boolean isOpen() {
        return this.currentState == AbstractC5434v.b.RESUMED;
    }

    @Override // ru.ozon.app.android.cart.common.domain.delegate.CartScreenStateHolder
    public boolean isStarted() {
        return this.currentState.a(AbstractC5434v.b.STARTED);
    }

    @Override // ru.ozon.app.android.cart.common.domain.delegate.CartScreenStateHolder
    @InterfaceC3999a
    public void setState(@NotNull AbstractC5434v.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.currentState = state;
    }

    @Override // ru.ozon.app.android.cart.common.domain.delegate.CartScreenStateHolder
    public boolean isOpen(@NotNull String miniApp) {
        Intrinsics.checkNotNullParameter(miniApp, "miniApp");
        return this.currentStates.getOrDefault(miniApp, AbstractC5434v.b.DESTROYED) == AbstractC5434v.b.RESUMED;
    }

    @Override // ru.ozon.app.android.cart.common.domain.delegate.CartScreenStateHolder
    public void setState(@NotNull AbstractC5434v.b state, @NotNull String miniApp) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(miniApp, "miniApp");
        this.currentStates.put(miniApp, state);
        this.currentState = state;
    }
}
