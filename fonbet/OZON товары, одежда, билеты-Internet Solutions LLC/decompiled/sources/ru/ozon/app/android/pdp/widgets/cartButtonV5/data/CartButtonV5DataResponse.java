package ru.ozon.app.android.pdp.widgets.cartButtonV5.data;

import Lc.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0017B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DataResponse;", "", "firstButton", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DataResponse$ButtonText;", "secondButton", "isTextToSubtitle", "", "<init>", "(Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DataResponse$ButtonText;Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DataResponse$ButtonText;Z)V", "getFirstButton", "()Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DataResponse$ButtonText;", "getSecondButton", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "ButtonText", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CartButtonV5DataResponse {
    public static final int $stable = 0;
    private final ButtonText firstButton;
    private final boolean isTextToSubtitle;
    private final ButtonText secondButton;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DataResponse$ButtonText;", "", "toCartText", "Lru/ozon/uni/atoms/data/text/TextDTO;", "inCartText", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getToCartText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getInCartText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonText {
        public static final int $stable = 0;
        private final TextDTO inCartText;
        private final TextDTO toCartText;

        public ButtonText(TextDTO textDTO, TextDTO textDTO2) {
            this.toCartText = textDTO;
            this.inCartText = textDTO2;
        }

        public static /* synthetic */ ButtonText copy$default(ButtonText buttonText, TextDTO textDTO, TextDTO textDTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = buttonText.toCartText;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = buttonText.inCartText;
            }
            return buttonText.copy(textDTO, textDTO2);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getToCartText() {
            return this.toCartText;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getInCartText() {
            return this.inCartText;
        }

        @NotNull
        public final ButtonText copy(TextDTO toCartText, TextDTO inCartText) {
            return new ButtonText(toCartText, inCartText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonText)) {
                return false;
            }
            ButtonText buttonText = (ButtonText) other;
            return Intrinsics.d(this.toCartText, buttonText.toCartText) && Intrinsics.d(this.inCartText, buttonText.inCartText);
        }

        public final TextDTO getInCartText() {
            return this.inCartText;
        }

        public final TextDTO getToCartText() {
            return this.toCartText;
        }

        public int hashCode() {
            TextDTO textDTO = this.toCartText;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            TextDTO textDTO2 = this.inCartText;
            return hashCode + (textDTO2 != null ? textDTO2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return a.b("ButtonText(toCartText=", this.toCartText, ", inCartText=", this.inCartText, ")");
        }
    }

    public CartButtonV5DataResponse(ButtonText buttonText, ButtonText buttonText2, boolean z11) {
        this.firstButton = buttonText;
        this.secondButton = buttonText2;
        this.isTextToSubtitle = z11;
    }

    public static /* synthetic */ CartButtonV5DataResponse copy$default(CartButtonV5DataResponse cartButtonV5DataResponse, ButtonText buttonText, ButtonText buttonText2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            buttonText = cartButtonV5DataResponse.firstButton;
        }
        if ((i11 & 2) != 0) {
            buttonText2 = cartButtonV5DataResponse.secondButton;
        }
        if ((i11 & 4) != 0) {
            z11 = cartButtonV5DataResponse.isTextToSubtitle;
        }
        return cartButtonV5DataResponse.copy(buttonText, buttonText2, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final ButtonText getFirstButton() {
        return this.firstButton;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonText getSecondButton() {
        return this.secondButton;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsTextToSubtitle() {
        return this.isTextToSubtitle;
    }

    @NotNull
    public final CartButtonV5DataResponse copy(ButtonText firstButton, ButtonText secondButton, boolean isTextToSubtitle) {
        return new CartButtonV5DataResponse(firstButton, secondButton, isTextToSubtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartButtonV5DataResponse)) {
            return false;
        }
        CartButtonV5DataResponse cartButtonV5DataResponse = (CartButtonV5DataResponse) other;
        return Intrinsics.d(this.firstButton, cartButtonV5DataResponse.firstButton) && Intrinsics.d(this.secondButton, cartButtonV5DataResponse.secondButton) && this.isTextToSubtitle == cartButtonV5DataResponse.isTextToSubtitle;
    }

    public final ButtonText getFirstButton() {
        return this.firstButton;
    }

    public final ButtonText getSecondButton() {
        return this.secondButton;
    }

    public int hashCode() {
        ButtonText buttonText = this.firstButton;
        int hashCode = (buttonText == null ? 0 : buttonText.hashCode()) * 31;
        ButtonText buttonText2 = this.secondButton;
        return Boolean.hashCode(this.isTextToSubtitle) + ((hashCode + (buttonText2 != null ? buttonText2.hashCode() : 0)) * 31);
    }

    public final boolean isTextToSubtitle() {
        return this.isTextToSubtitle;
    }

    @NotNull
    public String toString() {
        ButtonText buttonText = this.firstButton;
        ButtonText buttonText2 = this.secondButton;
        boolean z11 = this.isTextToSubtitle;
        StringBuilder sb2 = new StringBuilder("CartButtonV5DataResponse(firstButton=");
        sb2.append(buttonText);
        sb2.append(", secondButton=");
        sb2.append(buttonText2);
        sb2.append(", isTextToSubtitle=");
        return Pk0.a.a(")", sb2, z11);
    }

    public /* synthetic */ CartButtonV5DataResponse(ButtonText buttonText, ButtonText buttonText2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(buttonText, buttonText2, (i11 & 4) != 0 ? false : z11);
    }
}
