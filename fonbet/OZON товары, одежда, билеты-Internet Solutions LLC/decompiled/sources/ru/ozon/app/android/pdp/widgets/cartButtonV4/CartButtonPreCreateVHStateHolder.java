package ru.ozon.app.android.pdp.widgets.cartButtonV4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonPreCreateVHStateHolder;", "", "cache", "", "state", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonPreCreateVHState;", "fetch", "Default", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface CartButtonPreCreateVHStateHolder {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonPreCreateVHStateHolder$Default;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonPreCreateVHStateHolder;", "<init>", "()V", "cachedState", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonPreCreateVHState;", "cache", "", "state", "fetch", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Default implements CartButtonPreCreateVHStateHolder {
        private CartButtonPreCreateVHState cachedState;

        @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonPreCreateVHStateHolder
        public void cache(@NotNull CartButtonPreCreateVHState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.cachedState = state;
        }

        @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonPreCreateVHStateHolder
        /* renamed from: fetch, reason: from getter */
        public CartButtonPreCreateVHState getCachedState() {
            return this.cachedState;
        }
    }

    void cache(@NotNull CartButtonPreCreateVHState state);

    /* renamed from: fetch */
    CartButtonPreCreateVHState getCachedState();
}
