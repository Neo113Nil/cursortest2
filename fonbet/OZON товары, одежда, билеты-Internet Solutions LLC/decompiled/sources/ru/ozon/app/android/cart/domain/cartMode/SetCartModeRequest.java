package ru.ozon.app.android.cart.domain.cartMode;

import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cart/domain/cartMode/SetCartModeRequest;", "", "cartMode", "Lru/ozon/app/android/cart/domain/cartMode/SetCartModeRequest$CartMode;", "<init>", "(Lru/ozon/app/android/cart/domain/cartMode/SetCartModeRequest$CartMode;)V", "getCartMode", "()Lru/ozon/app/android/cart/domain/cartMode/SetCartModeRequest$CartMode;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "CartMode", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SetCartModeRequest {

    @NotNull
    private final CartMode cartMode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/cart/domain/cartMode/SetCartModeRequest$CartMode;", "", "<init>", "(Ljava/lang/String;I)V", "SERVICE_DEFINED_MODE", "SELECT_MODE", "VIEW_MODE", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CartMode {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ CartMode[] $VALUES;
        public static final CartMode SERVICE_DEFINED_MODE = new CartMode("SERVICE_DEFINED_MODE", 0);
        public static final CartMode SELECT_MODE = new CartMode("SELECT_MODE", 1);
        public static final CartMode VIEW_MODE = new CartMode("VIEW_MODE", 2);

        private static final /* synthetic */ CartMode[] $values() {
            return new CartMode[]{SERVICE_DEFINED_MODE, SELECT_MODE, VIEW_MODE};
        }

        static {
            CartMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private CartMode(String str, int i11) {
        }

        public static CartMode valueOf(String str) {
            return (CartMode) Enum.valueOf(CartMode.class, str);
        }

        public static CartMode[] values() {
            return (CartMode[]) $VALUES.clone();
        }
    }

    public SetCartModeRequest(@NotNull CartMode cartMode) {
        Intrinsics.checkNotNullParameter(cartMode, "cartMode");
        this.cartMode = cartMode;
    }

    public static /* synthetic */ SetCartModeRequest copy$default(SetCartModeRequest setCartModeRequest, CartMode cartMode, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cartMode = setCartModeRequest.cartMode;
        }
        return setCartModeRequest.copy(cartMode);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CartMode getCartMode() {
        return this.cartMode;
    }

    @NotNull
    public final SetCartModeRequest copy(@NotNull CartMode cartMode) {
        Intrinsics.checkNotNullParameter(cartMode, "cartMode");
        return new SetCartModeRequest(cartMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SetCartModeRequest) && this.cartMode == ((SetCartModeRequest) other).cartMode;
    }

    @NotNull
    public final CartMode getCartMode() {
        return this.cartMode;
    }

    public int hashCode() {
        return this.cartMode.hashCode();
    }

    @NotNull
    public String toString() {
        return "SetCartModeRequest(cartMode=" + this.cartMode + ")";
    }
}
