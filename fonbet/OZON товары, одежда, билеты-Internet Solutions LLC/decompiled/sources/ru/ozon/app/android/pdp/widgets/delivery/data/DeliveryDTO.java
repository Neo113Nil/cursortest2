package ru.ozon.app.android.pdp.widgets.delivery.data;

import B90.C2619v;
import G.g;
import Ih.a;
import N3.C3660k;
import T7.P;
import Ul.C4070a;
import V.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.cell.BadgeTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u0005:;<=>B\u0089\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010\tHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\"J\u0017\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0017\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010HÆ\u0003J¢\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u00104J\u0013\u00105\u001a\u00020\u000e2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010#\u001a\u0004\b\r\u0010\"R\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001f\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%¨\u0006?"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "annotation", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "sections", "", "moreInfoButton", "cartButtonTexts", "Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO$CartButtonTexts;", "isHidden", "", "dateTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "tabGroupId", "trackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO$CartButtonTexts;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getAnnotation", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getSections", "()Ljava/util/List;", "getMoreInfoButton", "getCartButtonTexts", "()Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO$CartButtonTexts;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDateTrackingInfo", "()Ljava/util/Map;", "getTabGroupId", "()Ljava/lang/String;", "getTrackingInfo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO$CartButtonTexts;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;)Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO;", "equals", "other", "hashCode", "", "toString", "DeliveryVariant", "PickupButton", "PickupBadge", "CartButtonTexts", "ButtonText", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DeliveryDTO {
    public static final int $stable = 8;
    private final DisclaimerAtom annotation;
    private final ButtonV3Atom.SmallBorderlessButton button;
    private final CartButtonTexts cartButtonTexts;
    private final Map<String, TokenizedTrackingInfo> dateTrackingInfo;
    private final Boolean isHidden;
    private final ButtonV3Atom.SmallBorderlessButton moreInfoButton;

    @NotNull
    private final List<Object> sections;
    private final String tabGroupId;
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO$ButtonText;", "", "toCart", "", "inCart", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getToCart", "()Ljava/lang/String;", "getInCart", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonText {
        public static final int $stable = 0;
        private final String inCart;
        private final String toCart;

        public ButtonText(String str, String str2) {
            this.toCart = str;
            this.inCart = str2;
        }

        public static /* synthetic */ ButtonText copy$default(ButtonText buttonText, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = buttonText.toCart;
            }
            if ((i11 & 2) != 0) {
                str2 = buttonText.inCart;
            }
            return buttonText.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getToCart() {
            return this.toCart;
        }

        /* renamed from: component2, reason: from getter */
        public final String getInCart() {
            return this.inCart;
        }

        @NotNull
        public final ButtonText copy(String toCart, String inCart) {
            return new ButtonText(toCart, inCart);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonText)) {
                return false;
            }
            ButtonText buttonText = (ButtonText) other;
            return Intrinsics.d(this.toCart, buttonText.toCart) && Intrinsics.d(this.inCart, buttonText.inCart);
        }

        public final String getInCart() {
            return this.inCart;
        }

        public final String getToCart() {
            return this.toCart;
        }

        public int hashCode() {
            String str = this.toCart;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.inCart;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return e.a("ButtonText(toCart=", this.toCart, ", inCart=", this.inCart, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO$CartButtonTexts;", "", "firstButton", "Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO$ButtonText;", "secondButton", "<init>", "(Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO$ButtonText;Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO$ButtonText;)V", "getFirstButton", "()Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO$ButtonText;", "getSecondButton", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CartButtonTexts {
        public static final int $stable = 0;
        private final ButtonText firstButton;
        private final ButtonText secondButton;

        public CartButtonTexts(ButtonText buttonText, ButtonText buttonText2) {
            this.firstButton = buttonText;
            this.secondButton = buttonText2;
        }

        public static /* synthetic */ CartButtonTexts copy$default(CartButtonTexts cartButtonTexts, ButtonText buttonText, ButtonText buttonText2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                buttonText = cartButtonTexts.firstButton;
            }
            if ((i11 & 2) != 0) {
                buttonText2 = cartButtonTexts.secondButton;
            }
            return cartButtonTexts.copy(buttonText, buttonText2);
        }

        /* renamed from: component1, reason: from getter */
        public final ButtonText getFirstButton() {
            return this.firstButton;
        }

        /* renamed from: component2, reason: from getter */
        public final ButtonText getSecondButton() {
            return this.secondButton;
        }

        @NotNull
        public final CartButtonTexts copy(ButtonText firstButton, ButtonText secondButton) {
            return new CartButtonTexts(firstButton, secondButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CartButtonTexts)) {
                return false;
            }
            CartButtonTexts cartButtonTexts = (CartButtonTexts) other;
            return Intrinsics.d(this.firstButton, cartButtonTexts.firstButton) && Intrinsics.d(this.secondButton, cartButtonTexts.secondButton);
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
            return hashCode + (buttonText2 != null ? buttonText2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "CartButtonTexts(firstButton=" + this.firstButton + ", secondButton=" + this.secondButton + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JU\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO$DeliveryVariant;", "", "icon", "", "iconTintColor", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "cells", "", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Ljava/util/Map;)V", "getIcon", "()Ljava/lang/String;", "getIconTintColor", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getCells", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DeliveryVariant {
        public static final int $stable = 8;

        @NotNull
        private final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> cells;
        private final String icon;
        private final String iconTintColor;
        private final TextAtom title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public DeliveryVariant(String str, String str2, TextAtom textAtom, @NotNull List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> cells, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(cells, "cells");
            this.icon = str;
            this.iconTintColor = str2;
            this.title = textAtom;
            this.cells = cells;
            this.trackingInfo = map;
        }

        public static /* synthetic */ DeliveryVariant copy$default(DeliveryVariant deliveryVariant, String str, String str2, TextAtom textAtom, List list, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = deliveryVariant.icon;
            }
            if ((i11 & 2) != 0) {
                str2 = deliveryVariant.iconTintColor;
            }
            if ((i11 & 4) != 0) {
                textAtom = deliveryVariant.title;
            }
            if ((i11 & 8) != 0) {
                list = deliveryVariant.cells;
            }
            if ((i11 & 16) != 0) {
                map = deliveryVariant.trackingInfo;
            }
            Map map2 = map;
            TextAtom textAtom2 = textAtom;
            return deliveryVariant.copy(str, str2, textAtom2, list, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final String getIconTintColor() {
            return this.iconTintColor;
        }

        /* renamed from: component3, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> component4() {
            return this.cells;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final DeliveryVariant copy(String icon, String iconTintColor, TextAtom title, @NotNull List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> cells, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(cells, "cells");
            return new DeliveryVariant(icon, iconTintColor, title, cells, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeliveryVariant)) {
                return false;
            }
            DeliveryVariant deliveryVariant = (DeliveryVariant) other;
            return Intrinsics.d(this.icon, deliveryVariant.icon) && Intrinsics.d(this.iconTintColor, deliveryVariant.iconTintColor) && Intrinsics.d(this.title, deliveryVariant.title) && Intrinsics.d(this.cells, deliveryVariant.cells) && Intrinsics.d(this.trackingInfo, deliveryVariant.trackingInfo);
        }

        @NotNull
        public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> getCells() {
            return this.cells;
        }

        public final String getIcon() {
            return this.icon;
        }

        public final String getIconTintColor() {
            return this.iconTintColor;
        }

        public final TextAtom getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            String str = this.icon;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.iconTintColor;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            TextAtom textAtom = this.title;
            int b11 = g.b((hashCode2 + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31, this.cells);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return b11 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.icon;
            String str2 = this.iconTintColor;
            TextAtom textAtom = this.title;
            List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> list = this.cells;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = C3660k.d("DeliveryVariant(icon=", str, ", iconTintColor=", str2, ", title=");
            d11.append(textAtom);
            d11.append(", cells=");
            d11.append(list);
            d11.append(", trackingInfo=");
            return P.f(d11, map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO$PickupBadge;", "", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "backgroundColor", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;)V", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PickupBadge {
        public static final int $stable = TextAtom.$stable;

        @NotNull
        private final String backgroundColor;

        @NotNull
        private final TextAtom text;

        public PickupBadge(@NotNull TextAtom text, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.text = text;
            this.backgroundColor = backgroundColor;
        }

        public static /* synthetic */ PickupBadge copy$default(PickupBadge pickupBadge, TextAtom textAtom, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = pickupBadge.text;
            }
            if ((i11 & 2) != 0) {
                str = pickupBadge.backgroundColor;
            }
            return pickupBadge.copy(textAtom, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final PickupBadge copy(@NotNull TextAtom text, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            return new PickupBadge(text, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PickupBadge)) {
                return false;
            }
            PickupBadge pickupBadge = (PickupBadge) other;
            return Intrinsics.d(this.text, pickupBadge.text) && Intrinsics.d(this.backgroundColor, pickupBadge.backgroundColor);
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final TextAtom getText() {
            return this.text;
        }

        public int hashCode() {
            return this.backgroundColor.hashCode() + (this.text.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "PickupBadge(text=" + this.text + ", backgroundColor=" + this.backgroundColor + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003Ji\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006."}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO$PickupButton;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "pickupBadge", "Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO$PickupBadge;", "icon", "", "iconTintColor", "backgroundColor", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO$PickupBadge;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getPickupBadge", "()Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO$PickupBadge;", "getIcon", "()Ljava/lang/String;", "getIconTintColor", "getBackgroundColor", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PickupButton {
        public static final int $stable = 8;

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final String backgroundColor;

        @NotNull
        private final String icon;

        @NotNull
        private final String iconTintColor;
        private final PickupBadge pickupBadge;

        @NotNull
        private final TextAtom subtitle;

        @NotNull
        private final TextAtom title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public PickupButton(@NotNull TextAtom title, @NotNull TextAtom subtitle, PickupBadge pickupBadge, @NotNull String icon, @NotNull String iconTintColor, @NotNull String backgroundColor, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(iconTintColor, "iconTintColor");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(action, "action");
            this.title = title;
            this.subtitle = subtitle;
            this.pickupBadge = pickupBadge;
            this.icon = icon;
            this.iconTintColor = iconTintColor;
            this.backgroundColor = backgroundColor;
            this.action = action;
            this.trackingInfo = map;
        }

        public static /* synthetic */ PickupButton copy$default(PickupButton pickupButton, TextAtom textAtom, TextAtom textAtom2, PickupBadge pickupBadge, String str, String str2, String str3, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = pickupButton.title;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = pickupButton.subtitle;
            }
            if ((i11 & 4) != 0) {
                pickupBadge = pickupButton.pickupBadge;
            }
            if ((i11 & 8) != 0) {
                str = pickupButton.icon;
            }
            if ((i11 & 16) != 0) {
                str2 = pickupButton.iconTintColor;
            }
            if ((i11 & 32) != 0) {
                str3 = pickupButton.backgroundColor;
            }
            if ((i11 & 64) != 0) {
                atomActionDTO = pickupButton.action;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                map = pickupButton.trackingInfo;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            String str4 = str2;
            String str5 = str3;
            return pickupButton.copy(textAtom, textAtom2, pickupBadge, str, str4, str5, atomActionDTO2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final PickupBadge getPickupBadge() {
            return this.pickupBadge;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getIconTintColor() {
            return this.iconTintColor;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component8() {
            return this.trackingInfo;
        }

        @NotNull
        public final PickupButton copy(@NotNull TextAtom title, @NotNull TextAtom subtitle, PickupBadge pickupBadge, @NotNull String icon, @NotNull String iconTintColor, @NotNull String backgroundColor, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(iconTintColor, "iconTintColor");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(action, "action");
            return new PickupButton(title, subtitle, pickupBadge, icon, iconTintColor, backgroundColor, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PickupButton)) {
                return false;
            }
            PickupButton pickupButton = (PickupButton) other;
            return Intrinsics.d(this.title, pickupButton.title) && Intrinsics.d(this.subtitle, pickupButton.subtitle) && Intrinsics.d(this.pickupBadge, pickupButton.pickupBadge) && Intrinsics.d(this.icon, pickupButton.icon) && Intrinsics.d(this.iconTintColor, pickupButton.iconTintColor) && Intrinsics.d(this.backgroundColor, pickupButton.backgroundColor) && Intrinsics.d(this.action, pickupButton.action) && Intrinsics.d(this.trackingInfo, pickupButton.trackingInfo);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        public final String getIconTintColor() {
            return this.iconTintColor;
        }

        public final PickupBadge getPickupBadge() {
            return this.pickupBadge;
        }

        @NotNull
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int b11 = C2619v.b(this.title.hashCode() * 31, 31, this.subtitle);
            PickupBadge pickupBadge = this.pickupBadge;
            int b12 = a.b(this.action, g.a(g.a(g.a((b11 + (pickupBadge == null ? 0 : pickupBadge.hashCode())) * 31, 31, this.icon), 31, this.iconTintColor), 31, this.backgroundColor), 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return b12 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.subtitle;
            PickupBadge pickupBadge = this.pickupBadge;
            String str = this.icon;
            String str2 = this.iconTintColor;
            String str3 = this.backgroundColor;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder a11 = HY.a.a("PickupButton(title=", textAtom, ", subtitle=", textAtom2, ", pickupBadge=");
            a11.append(pickupBadge);
            a11.append(", icon=");
            a11.append(str);
            a11.append(", iconTintColor=");
            Nh.a.h(a11, str2, ", backgroundColor=", str3, ", action=");
            return D40.a.d(a11, atomActionDTO, ", trackingInfo=", map, ")");
        }
    }

    public DeliveryDTO(TextAtom textAtom, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, DisclaimerAtom disclaimerAtom, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "cell", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon.class), @ProtoOneOfSignature(name = "deliveryVariant", type = DeliveryVariant.class), @ProtoOneOfSignature(name = "pickupButton", type = PickupButton.class), @ProtoOneOfSignature(name = "badgeCell", type = BadgeTitleSubtitleCellDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> sections, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton2, CartButtonTexts cartButtonTexts, Boolean bool, Map<String, TokenizedTrackingInfo> map, String str, Map<String, TokenizedTrackingInfo> map2) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.title = textAtom;
        this.button = smallBorderlessButton;
        this.annotation = disclaimerAtom;
        this.sections = sections;
        this.moreInfoButton = smallBorderlessButton2;
        this.cartButtonTexts = cartButtonTexts;
        this.isHidden = bool;
        this.dateTrackingInfo = map;
        this.tabGroupId = str;
        this.trackingInfo = map2;
    }

    public static /* synthetic */ DeliveryDTO copy$default(DeliveryDTO deliveryDTO, TextAtom textAtom, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, DisclaimerAtom disclaimerAtom, List list, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton2, CartButtonTexts cartButtonTexts, Boolean bool, Map map, String str, Map map2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = deliveryDTO.title;
        }
        if ((i11 & 2) != 0) {
            smallBorderlessButton = deliveryDTO.button;
        }
        if ((i11 & 4) != 0) {
            disclaimerAtom = deliveryDTO.annotation;
        }
        if ((i11 & 8) != 0) {
            list = deliveryDTO.sections;
        }
        if ((i11 & 16) != 0) {
            smallBorderlessButton2 = deliveryDTO.moreInfoButton;
        }
        if ((i11 & 32) != 0) {
            cartButtonTexts = deliveryDTO.cartButtonTexts;
        }
        if ((i11 & 64) != 0) {
            bool = deliveryDTO.isHidden;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = deliveryDTO.dateTrackingInfo;
        }
        if ((i11 & 256) != 0) {
            str = deliveryDTO.tabGroupId;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            map2 = deliveryDTO.trackingInfo;
        }
        String str2 = str;
        Map map3 = map2;
        Boolean bool2 = bool;
        Map map4 = map;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton3 = smallBorderlessButton2;
        CartButtonTexts cartButtonTexts2 = cartButtonTexts;
        return deliveryDTO.copy(textAtom, smallBorderlessButton, disclaimerAtom, list, smallBorderlessButton3, cartButtonTexts2, bool2, map4, str2, map3);
    }

    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> component10() {
        return this.trackingInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonV3Atom.SmallBorderlessButton getButton() {
        return this.button;
    }

    /* renamed from: component3, reason: from getter */
    public final DisclaimerAtom getAnnotation() {
        return this.annotation;
    }

    @NotNull
    public final List<Object> component4() {
        return this.sections;
    }

    /* renamed from: component5, reason: from getter */
    public final ButtonV3Atom.SmallBorderlessButton getMoreInfoButton() {
        return this.moreInfoButton;
    }

    /* renamed from: component6, reason: from getter */
    public final CartButtonTexts getCartButtonTexts() {
        return this.cartButtonTexts;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getIsHidden() {
        return this.isHidden;
    }

    public final Map<String, TokenizedTrackingInfo> component8() {
        return this.dateTrackingInfo;
    }

    /* renamed from: component9, reason: from getter */
    public final String getTabGroupId() {
        return this.tabGroupId;
    }

    @NotNull
    public final DeliveryDTO copy(TextAtom title, ButtonV3Atom.SmallBorderlessButton button, DisclaimerAtom annotation, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "cell", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon.class), @ProtoOneOfSignature(name = "deliveryVariant", type = DeliveryVariant.class), @ProtoOneOfSignature(name = "pickupButton", type = PickupButton.class), @ProtoOneOfSignature(name = "badgeCell", type = BadgeTitleSubtitleCellDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> sections, ButtonV3Atom.SmallBorderlessButton moreInfoButton, CartButtonTexts cartButtonTexts, Boolean isHidden, Map<String, TokenizedTrackingInfo> dateTrackingInfo, String tabGroupId, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        return new DeliveryDTO(title, button, annotation, sections, moreInfoButton, cartButtonTexts, isHidden, dateTrackingInfo, tabGroupId, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryDTO)) {
            return false;
        }
        DeliveryDTO deliveryDTO = (DeliveryDTO) other;
        return Intrinsics.d(this.title, deliveryDTO.title) && Intrinsics.d(this.button, deliveryDTO.button) && Intrinsics.d(this.annotation, deliveryDTO.annotation) && Intrinsics.d(this.sections, deliveryDTO.sections) && Intrinsics.d(this.moreInfoButton, deliveryDTO.moreInfoButton) && Intrinsics.d(this.cartButtonTexts, deliveryDTO.cartButtonTexts) && Intrinsics.d(this.isHidden, deliveryDTO.isHidden) && Intrinsics.d(this.dateTrackingInfo, deliveryDTO.dateTrackingInfo) && Intrinsics.d(this.tabGroupId, deliveryDTO.tabGroupId) && Intrinsics.d(this.trackingInfo, deliveryDTO.trackingInfo);
    }

    public final DisclaimerAtom getAnnotation() {
        return this.annotation;
    }

    public final ButtonV3Atom.SmallBorderlessButton getButton() {
        return this.button;
    }

    public final CartButtonTexts getCartButtonTexts() {
        return this.cartButtonTexts;
    }

    public final Map<String, TokenizedTrackingInfo> getDateTrackingInfo() {
        return this.dateTrackingInfo;
    }

    public final ButtonV3Atom.SmallBorderlessButton getMoreInfoButton() {
        return this.moreInfoButton;
    }

    @NotNull
    public final List<Object> getSections() {
        return this.sections;
    }

    public final String getTabGroupId() {
        return this.tabGroupId;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        TextAtom textAtom = this.title;
        int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.button;
        int hashCode2 = (hashCode + (smallBorderlessButton == null ? 0 : smallBorderlessButton.hashCode())) * 31;
        DisclaimerAtom disclaimerAtom = this.annotation;
        int b11 = g.b((hashCode2 + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31, 31, this.sections);
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton2 = this.moreInfoButton;
        int hashCode3 = (b11 + (smallBorderlessButton2 == null ? 0 : smallBorderlessButton2.hashCode())) * 31;
        CartButtonTexts cartButtonTexts = this.cartButtonTexts;
        int hashCode4 = (hashCode3 + (cartButtonTexts == null ? 0 : cartButtonTexts.hashCode())) * 31;
        Boolean bool = this.isHidden;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.dateTrackingInfo;
        int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.tabGroupId;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
        return hashCode7 + (map2 != null ? map2.hashCode() : 0);
    }

    public final Boolean isHidden() {
        return this.isHidden;
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.button;
        DisclaimerAtom disclaimerAtom = this.annotation;
        List<Object> list = this.sections;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton2 = this.moreInfoButton;
        CartButtonTexts cartButtonTexts = this.cartButtonTexts;
        Boolean bool = this.isHidden;
        Map<String, TokenizedTrackingInfo> map = this.dateTrackingInfo;
        String str = this.tabGroupId;
        Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("DeliveryDTO(title=");
        sb2.append(textAtom);
        sb2.append(", button=");
        sb2.append(smallBorderlessButton);
        sb2.append(", annotation=");
        sb2.append(disclaimerAtom);
        sb2.append(", sections=");
        sb2.append(list);
        sb2.append(", moreInfoButton=");
        sb2.append(smallBorderlessButton2);
        sb2.append(", cartButtonTexts=");
        sb2.append(cartButtonTexts);
        sb2.append(", isHidden=");
        sb2.append(bool);
        sb2.append(", dateTrackingInfo=");
        sb2.append(map);
        sb2.append(", tabGroupId=");
        return C4070a.a(sb2, str, ", trackingInfo=", map2, ")");
    }
}
