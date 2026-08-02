package ru.ozon.app.android.pdp.widgets.delivery.async;

import A00.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncCartButtonDeliveryUpdateKey;", "LA00/a$J$a;", "Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncCartButtonDeliveryUpdateKey$ButtonText;", "firstButton", "secondButton", "<init>", "(Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncCartButtonDeliveryUpdateKey$ButtonText;Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncCartButtonDeliveryUpdateKey$ButtonText;)V", "Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncCartButtonDeliveryUpdateKey$ButtonText;", "getFirstButton", "()Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncCartButtonDeliveryUpdateKey$ButtonText;", "getSecondButton", "ButtonText", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AsyncCartButtonDeliveryUpdateKey implements a.J.InterfaceC0007a {
    private final ButtonText firstButton;
    private final ButtonText secondButton;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncCartButtonDeliveryUpdateKey$ButtonText;", "", "inCart", "", "toCart", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getInCart", "()Ljava/lang/String;", "getToCart", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class ButtonText {
        private final String inCart;
        private final String toCart;

        public ButtonText(String str, String str2) {
            this.inCart = str;
            this.toCart = str2;
        }

        public final String getInCart() {
            return this.inCart;
        }

        public final String getToCart() {
            return this.toCart;
        }
    }

    public AsyncCartButtonDeliveryUpdateKey(ButtonText buttonText, ButtonText buttonText2) {
        this.firstButton = buttonText;
        this.secondButton = buttonText2;
    }

    public final ButtonText getFirstButton() {
        return this.firstButton;
    }

    public final ButtonText getSecondButton() {
        return this.secondButton;
    }
}
