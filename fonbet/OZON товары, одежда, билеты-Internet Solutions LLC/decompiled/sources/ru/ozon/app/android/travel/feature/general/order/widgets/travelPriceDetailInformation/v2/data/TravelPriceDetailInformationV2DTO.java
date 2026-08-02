package ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.data;

import B0.C2454a;
import B90.C2619v;
import Fm.C3051a;
import G.g;
import HY.a;
import J0.C3349u1;
import Tl.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0001\u0018\u00002\u00020\u0001:\u0003012B\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001f\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "priceRows", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO$PriceRowDTO;", "total", "rowUnderTotal", "bonusTotal", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO$BonusPriceRowDTO;", DynamicElementDTO.LARGE_BUTTON, "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "paymentButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonLarge;", "agreement", "stickyInformation", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO$StickyInformationDTO;", "shouldHideMainButton", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO$PriceRowDTO;Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO$PriceRowDTO;Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO$BonusPriceRowDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonLarge;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO$StickyInformationDTO;ZLjava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getPriceRows", "()Ljava/util/List;", "getTotal", "()Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO$PriceRowDTO;", "getRowUnderTotal", "getBonusTotal", "()Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO$BonusPriceRowDTO;", "getLargeButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getPaymentButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonLarge;", "getAgreement", "getStickyInformation", "()Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO$StickyInformationDTO;", "getShouldHideMainButton", "()Z", "getTrackingInfo", "()Ljava/util/Map;", "PriceRowDTO", "BonusPriceRowDTO", "StickyInformationDTO", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPriceDetailInformationV2DTO {
    public static final int $stable = 8;
    private final TextAtom agreement;
    private final BonusPriceRowDTO bonusTotal;

    @NotNull
    private final ButtonV3Atom.LargeButton largeButton;
    private final ButtonV3Atom.PaymentButtonLarge paymentButton;

    @NotNull
    private final List<PriceRowDTO> priceRows;
    private final PriceRowDTO rowUnderTotal;
    private final boolean shouldHideMainButton;
    private final StickyInformationDTO stickyInformation;
    private final TextAtom subtitle;

    @NotNull
    private final TextAtom title;

    @NotNull
    private final PriceRowDTO total;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003JY\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO$BonusPriceRowDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "bonusPrice", "bonusPriceBackgroundColor", "", "price", "Lru/ozon/uni/atoms/data/price/Price;", "bonusDetailsIconButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "bonusDetailsTitle", "priceDetailsIconButton", "priceDetailsTitle", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getBonusPrice", "getBonusPriceBackgroundColor", "()Ljava/lang/String;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "getBonusDetailsIconButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getBonusDetailsTitle", "getPriceDetailsIconButton", "getPriceDetailsTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BonusPriceRowDTO {
        public static final int $stable;

        @NotNull
        private final ButtonV3Atom.SmallIconButton bonusDetailsIconButton;

        @NotNull
        private final TextAtom bonusDetailsTitle;

        @NotNull
        private final TextAtom bonusPrice;

        @NotNull
        private final String bonusPriceBackgroundColor;

        @NotNull
        private final Price price;

        @NotNull
        private final ButtonV3Atom.SmallIconButton priceDetailsIconButton;

        @NotNull
        private final TextAtom priceDetailsTitle;

        @NotNull
        private final TextAtom title;

        static {
            int i11 = TextAtom.$stable;
            int i12 = ButtonV3Atom.SmallIconButton.$stable;
            $stable = i11 | i12 | i11 | i12 | i11 | Price.$stable | i11;
        }

        public BonusPriceRowDTO(@NotNull TextAtom title, @NotNull TextAtom bonusPrice, @NotNull String bonusPriceBackgroundColor, @NotNull Price price, @NotNull ButtonV3Atom.SmallIconButton bonusDetailsIconButton, @NotNull TextAtom bonusDetailsTitle, @NotNull ButtonV3Atom.SmallIconButton priceDetailsIconButton, @NotNull TextAtom priceDetailsTitle) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(bonusPrice, "bonusPrice");
            Intrinsics.checkNotNullParameter(bonusPriceBackgroundColor, "bonusPriceBackgroundColor");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(bonusDetailsIconButton, "bonusDetailsIconButton");
            Intrinsics.checkNotNullParameter(bonusDetailsTitle, "bonusDetailsTitle");
            Intrinsics.checkNotNullParameter(priceDetailsIconButton, "priceDetailsIconButton");
            Intrinsics.checkNotNullParameter(priceDetailsTitle, "priceDetailsTitle");
            this.title = title;
            this.bonusPrice = bonusPrice;
            this.bonusPriceBackgroundColor = bonusPriceBackgroundColor;
            this.price = price;
            this.bonusDetailsIconButton = bonusDetailsIconButton;
            this.bonusDetailsTitle = bonusDetailsTitle;
            this.priceDetailsIconButton = priceDetailsIconButton;
            this.priceDetailsTitle = priceDetailsTitle;
        }

        public static /* synthetic */ BonusPriceRowDTO copy$default(BonusPriceRowDTO bonusPriceRowDTO, TextAtom textAtom, TextAtom textAtom2, String str, Price price, ButtonV3Atom.SmallIconButton smallIconButton, TextAtom textAtom3, ButtonV3Atom.SmallIconButton smallIconButton2, TextAtom textAtom4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = bonusPriceRowDTO.title;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = bonusPriceRowDTO.bonusPrice;
            }
            if ((i11 & 4) != 0) {
                str = bonusPriceRowDTO.bonusPriceBackgroundColor;
            }
            if ((i11 & 8) != 0) {
                price = bonusPriceRowDTO.price;
            }
            if ((i11 & 16) != 0) {
                smallIconButton = bonusPriceRowDTO.bonusDetailsIconButton;
            }
            if ((i11 & 32) != 0) {
                textAtom3 = bonusPriceRowDTO.bonusDetailsTitle;
            }
            if ((i11 & 64) != 0) {
                smallIconButton2 = bonusPriceRowDTO.priceDetailsIconButton;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                textAtom4 = bonusPriceRowDTO.priceDetailsTitle;
            }
            ButtonV3Atom.SmallIconButton smallIconButton3 = smallIconButton2;
            TextAtom textAtom5 = textAtom4;
            ButtonV3Atom.SmallIconButton smallIconButton4 = smallIconButton;
            TextAtom textAtom6 = textAtom3;
            return bonusPriceRowDTO.copy(textAtom, textAtom2, str, price, smallIconButton4, textAtom6, smallIconButton3, textAtom5);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getBonusPrice() {
            return this.bonusPrice;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getBonusPriceBackgroundColor() {
            return this.bonusPriceBackgroundColor;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Price getPrice() {
            return this.price;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final ButtonV3Atom.SmallIconButton getBonusDetailsIconButton() {
            return this.bonusDetailsIconButton;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final TextAtom getBonusDetailsTitle() {
            return this.bonusDetailsTitle;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final ButtonV3Atom.SmallIconButton getPriceDetailsIconButton() {
            return this.priceDetailsIconButton;
        }

        @NotNull
        /* renamed from: component8, reason: from getter */
        public final TextAtom getPriceDetailsTitle() {
            return this.priceDetailsTitle;
        }

        @NotNull
        public final BonusPriceRowDTO copy(@NotNull TextAtom title, @NotNull TextAtom bonusPrice, @NotNull String bonusPriceBackgroundColor, @NotNull Price price, @NotNull ButtonV3Atom.SmallIconButton bonusDetailsIconButton, @NotNull TextAtom bonusDetailsTitle, @NotNull ButtonV3Atom.SmallIconButton priceDetailsIconButton, @NotNull TextAtom priceDetailsTitle) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(bonusPrice, "bonusPrice");
            Intrinsics.checkNotNullParameter(bonusPriceBackgroundColor, "bonusPriceBackgroundColor");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(bonusDetailsIconButton, "bonusDetailsIconButton");
            Intrinsics.checkNotNullParameter(bonusDetailsTitle, "bonusDetailsTitle");
            Intrinsics.checkNotNullParameter(priceDetailsIconButton, "priceDetailsIconButton");
            Intrinsics.checkNotNullParameter(priceDetailsTitle, "priceDetailsTitle");
            return new BonusPriceRowDTO(title, bonusPrice, bonusPriceBackgroundColor, price, bonusDetailsIconButton, bonusDetailsTitle, priceDetailsIconButton, priceDetailsTitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BonusPriceRowDTO)) {
                return false;
            }
            BonusPriceRowDTO bonusPriceRowDTO = (BonusPriceRowDTO) other;
            return Intrinsics.d(this.title, bonusPriceRowDTO.title) && Intrinsics.d(this.bonusPrice, bonusPriceRowDTO.bonusPrice) && Intrinsics.d(this.bonusPriceBackgroundColor, bonusPriceRowDTO.bonusPriceBackgroundColor) && Intrinsics.d(this.price, bonusPriceRowDTO.price) && Intrinsics.d(this.bonusDetailsIconButton, bonusPriceRowDTO.bonusDetailsIconButton) && Intrinsics.d(this.bonusDetailsTitle, bonusPriceRowDTO.bonusDetailsTitle) && Intrinsics.d(this.priceDetailsIconButton, bonusPriceRowDTO.priceDetailsIconButton) && Intrinsics.d(this.priceDetailsTitle, bonusPriceRowDTO.priceDetailsTitle);
        }

        @NotNull
        public final ButtonV3Atom.SmallIconButton getBonusDetailsIconButton() {
            return this.bonusDetailsIconButton;
        }

        @NotNull
        public final TextAtom getBonusDetailsTitle() {
            return this.bonusDetailsTitle;
        }

        @NotNull
        public final TextAtom getBonusPrice() {
            return this.bonusPrice;
        }

        @NotNull
        public final String getBonusPriceBackgroundColor() {
            return this.bonusPriceBackgroundColor;
        }

        @NotNull
        public final Price getPrice() {
            return this.price;
        }

        @NotNull
        public final ButtonV3Atom.SmallIconButton getPriceDetailsIconButton() {
            return this.priceDetailsIconButton;
        }

        @NotNull
        public final TextAtom getPriceDetailsTitle() {
            return this.priceDetailsTitle;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.priceDetailsTitle.hashCode() + C3349u1.d(this.priceDetailsIconButton, C2619v.b(C3349u1.d(this.bonusDetailsIconButton, C3051a.a(this.price, g.a(C2619v.b(this.title.hashCode() * 31, 31, this.bonusPrice), 31, this.bonusPriceBackgroundColor), 31), 31), 31, this.bonusDetailsTitle), 31);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.bonusPrice;
            String str = this.bonusPriceBackgroundColor;
            Price price = this.price;
            ButtonV3Atom.SmallIconButton smallIconButton = this.bonusDetailsIconButton;
            TextAtom textAtom3 = this.bonusDetailsTitle;
            ButtonV3Atom.SmallIconButton smallIconButton2 = this.priceDetailsIconButton;
            TextAtom textAtom4 = this.priceDetailsTitle;
            StringBuilder a11 = a.a("BonusPriceRowDTO(title=", textAtom, ", bonusPrice=", textAtom2, ", bonusPriceBackgroundColor=");
            a11.append(str);
            a11.append(", price=");
            a11.append(price);
            a11.append(", bonusDetailsIconButton=");
            a11.append(smallIconButton);
            a11.append(", bonusDetailsTitle=");
            a11.append(textAtom3);
            a11.append(", priceDetailsIconButton=");
            a11.append(smallIconButton2);
            a11.append(", priceDetailsTitle=");
            a11.append(textAtom4);
            a11.append(")");
            return a11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO$StickyInformationDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "actionButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "paymentButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonLarge;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonLarge;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getActionButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getPaymentButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonLarge;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StickyInformationDTO {
        public static final int $stable;

        @NotNull
        private final ButtonV3Atom.LargeButton actionButton;
        private final ButtonV3Atom.PaymentButtonLarge paymentButton;
        private final TextAtom subtitle;

        @NotNull
        private final TextAtom title;

        static {
            int i11 = ButtonV3Atom.PaymentButtonLarge.$stable | ButtonV3Atom.LargeButton.$stable;
            int i12 = TextAtom.$stable;
            $stable = i11 | i12 | i12;
        }

        public StickyInformationDTO(@NotNull TextAtom title, TextAtom textAtom, @NotNull ButtonV3Atom.LargeButton actionButton, ButtonV3Atom.PaymentButtonLarge paymentButtonLarge) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(actionButton, "actionButton");
            this.title = title;
            this.subtitle = textAtom;
            this.actionButton = actionButton;
            this.paymentButton = paymentButtonLarge;
        }

        public static /* synthetic */ StickyInformationDTO copy$default(StickyInformationDTO stickyInformationDTO, TextAtom textAtom, TextAtom textAtom2, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.PaymentButtonLarge paymentButtonLarge, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = stickyInformationDTO.title;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = stickyInformationDTO.subtitle;
            }
            if ((i11 & 4) != 0) {
                largeButton = stickyInformationDTO.actionButton;
            }
            if ((i11 & 8) != 0) {
                paymentButtonLarge = stickyInformationDTO.paymentButton;
            }
            return stickyInformationDTO.copy(textAtom, textAtom2, largeButton, paymentButtonLarge);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final ButtonV3Atom.LargeButton getActionButton() {
            return this.actionButton;
        }

        /* renamed from: component4, reason: from getter */
        public final ButtonV3Atom.PaymentButtonLarge getPaymentButton() {
            return this.paymentButton;
        }

        @NotNull
        public final StickyInformationDTO copy(@NotNull TextAtom title, TextAtom subtitle, @NotNull ButtonV3Atom.LargeButton actionButton, ButtonV3Atom.PaymentButtonLarge paymentButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(actionButton, "actionButton");
            return new StickyInformationDTO(title, subtitle, actionButton, paymentButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StickyInformationDTO)) {
                return false;
            }
            StickyInformationDTO stickyInformationDTO = (StickyInformationDTO) other;
            return Intrinsics.d(this.title, stickyInformationDTO.title) && Intrinsics.d(this.subtitle, stickyInformationDTO.subtitle) && Intrinsics.d(this.actionButton, stickyInformationDTO.actionButton) && Intrinsics.d(this.paymentButton, stickyInformationDTO.paymentButton);
        }

        @NotNull
        public final ButtonV3Atom.LargeButton getActionButton() {
            return this.actionButton;
        }

        public final ButtonV3Atom.PaymentButtonLarge getPaymentButton() {
            return this.paymentButton;
        }

        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            TextAtom textAtom = this.subtitle;
            int a11 = b.a(this.actionButton, (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31);
            ButtonV3Atom.PaymentButtonLarge paymentButtonLarge = this.paymentButton;
            return a11 + (paymentButtonLarge != null ? paymentButtonLarge.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.subtitle;
            ButtonV3Atom.LargeButton largeButton = this.actionButton;
            ButtonV3Atom.PaymentButtonLarge paymentButtonLarge = this.paymentButton;
            StringBuilder a11 = a.a("StickyInformationDTO(title=", textAtom, ", subtitle=", textAtom2, ", actionButton=");
            a11.append(largeButton);
            a11.append(", paymentButton=");
            a11.append(paymentButtonLarge);
            a11.append(")");
            return a11.toString();
        }
    }

    public TravelPriceDetailInformationV2DTO(@NotNull TextAtom title, TextAtom textAtom, @NotNull List<PriceRowDTO> priceRows, @NotNull PriceRowDTO total, PriceRowDTO priceRowDTO, BonusPriceRowDTO bonusPriceRowDTO, @NotNull ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.PaymentButtonLarge paymentButtonLarge, TextAtom textAtom2, StickyInformationDTO stickyInformationDTO, boolean z11, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(priceRows, "priceRows");
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(largeButton, "largeButton");
        this.title = title;
        this.subtitle = textAtom;
        this.priceRows = priceRows;
        this.total = total;
        this.rowUnderTotal = priceRowDTO;
        this.bonusTotal = bonusPriceRowDTO;
        this.largeButton = largeButton;
        this.paymentButton = paymentButtonLarge;
        this.agreement = textAtom2;
        this.stickyInformation = stickyInformationDTO;
        this.shouldHideMainButton = z11;
        this.trackingInfo = map;
    }

    public final TextAtom getAgreement() {
        return this.agreement;
    }

    public final BonusPriceRowDTO getBonusTotal() {
        return this.bonusTotal;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getLargeButton() {
        return this.largeButton;
    }

    public final ButtonV3Atom.PaymentButtonLarge getPaymentButton() {
        return this.paymentButton;
    }

    @NotNull
    public final List<PriceRowDTO> getPriceRows() {
        return this.priceRows;
    }

    public final PriceRowDTO getRowUnderTotal() {
        return this.rowUnderTotal;
    }

    public final boolean getShouldHideMainButton() {
        return this.shouldHideMainButton;
    }

    public final StickyInformationDTO getStickyInformation() {
        return this.stickyInformation;
    }

    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    public final PriceRowDTO getTotal() {
        return this.total;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003JY\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\nHÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO$PriceRowDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "rightText", "smallIconButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "smallIconGap", "", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "milesIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;ILru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getRightText", "getSmallIconButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getSmallIconGap", "()I", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getMilesIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceRowDTO {
        public static final int $stable;
        private final ButtonV3Atom.SmallBorderlessButton button;
        private final CommonControlSettings common;
        private final IconDTO milesIcon;
        private final TextAtom rightText;
        private final ButtonV3Atom.SmallIconButton smallIconButton;
        private final int smallIconGap;

        @NotNull
        private final TextAtom title;

        static {
            int i11 = IconDTO.$stable | ButtonV3Atom.SmallBorderlessButton.$stable | ButtonV3Atom.SmallIconButton.$stable;
            int i12 = TextAtom.$stable;
            $stable = i11 | i12 | i12;
        }

        public PriceRowDTO(@NotNull TextAtom title, TextAtom textAtom, ButtonV3Atom.SmallIconButton smallIconButton, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, int i11, CommonControlSettings commonControlSettings, IconDTO iconDTO) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.rightText = textAtom;
            this.smallIconButton = smallIconButton;
            this.button = smallBorderlessButton;
            this.smallIconGap = i11;
            this.common = commonControlSettings;
            this.milesIcon = iconDTO;
        }

        public static /* synthetic */ PriceRowDTO copy$default(PriceRowDTO priceRowDTO, TextAtom textAtom, TextAtom textAtom2, ButtonV3Atom.SmallIconButton smallIconButton, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, int i11, CommonControlSettings commonControlSettings, IconDTO iconDTO, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                textAtom = priceRowDTO.title;
            }
            if ((i12 & 2) != 0) {
                textAtom2 = priceRowDTO.rightText;
            }
            if ((i12 & 4) != 0) {
                smallIconButton = priceRowDTO.smallIconButton;
            }
            if ((i12 & 8) != 0) {
                smallBorderlessButton = priceRowDTO.button;
            }
            if ((i12 & 16) != 0) {
                i11 = priceRowDTO.smallIconGap;
            }
            if ((i12 & 32) != 0) {
                commonControlSettings = priceRowDTO.common;
            }
            if ((i12 & 64) != 0) {
                iconDTO = priceRowDTO.milesIcon;
            }
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            IconDTO iconDTO2 = iconDTO;
            int i13 = i11;
            ButtonV3Atom.SmallIconButton smallIconButton2 = smallIconButton;
            return priceRowDTO.copy(textAtom, textAtom2, smallIconButton2, smallBorderlessButton, i13, commonControlSettings2, iconDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextAtom getRightText() {
            return this.rightText;
        }

        /* renamed from: component3, reason: from getter */
        public final ButtonV3Atom.SmallIconButton getSmallIconButton() {
            return this.smallIconButton;
        }

        /* renamed from: component4, reason: from getter */
        public final ButtonV3Atom.SmallBorderlessButton getButton() {
            return this.button;
        }

        /* renamed from: component5, reason: from getter */
        public final int getSmallIconGap() {
            return this.smallIconGap;
        }

        /* renamed from: component6, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        /* renamed from: component7, reason: from getter */
        public final IconDTO getMilesIcon() {
            return this.milesIcon;
        }

        @NotNull
        public final PriceRowDTO copy(@NotNull TextAtom title, TextAtom rightText, ButtonV3Atom.SmallIconButton smallIconButton, ButtonV3Atom.SmallBorderlessButton button, int smallIconGap, CommonControlSettings common, IconDTO milesIcon) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new PriceRowDTO(title, rightText, smallIconButton, button, smallIconGap, common, milesIcon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceRowDTO)) {
                return false;
            }
            PriceRowDTO priceRowDTO = (PriceRowDTO) other;
            return Intrinsics.d(this.title, priceRowDTO.title) && Intrinsics.d(this.rightText, priceRowDTO.rightText) && Intrinsics.d(this.smallIconButton, priceRowDTO.smallIconButton) && Intrinsics.d(this.button, priceRowDTO.button) && this.smallIconGap == priceRowDTO.smallIconGap && Intrinsics.d(this.common, priceRowDTO.common) && Intrinsics.d(this.milesIcon, priceRowDTO.milesIcon);
        }

        public final ButtonV3Atom.SmallBorderlessButton getButton() {
            return this.button;
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        public final IconDTO getMilesIcon() {
            return this.milesIcon;
        }

        public final TextAtom getRightText() {
            return this.rightText;
        }

        public final ButtonV3Atom.SmallIconButton getSmallIconButton() {
            return this.smallIconButton;
        }

        public final int getSmallIconGap() {
            return this.smallIconGap;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            TextAtom textAtom = this.rightText;
            int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            ButtonV3Atom.SmallIconButton smallIconButton = this.smallIconButton;
            int hashCode3 = (hashCode2 + (smallIconButton == null ? 0 : smallIconButton.hashCode())) * 31;
            ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.button;
            int a11 = C2454a.a(this.smallIconGap, (hashCode3 + (smallBorderlessButton == null ? 0 : smallBorderlessButton.hashCode())) * 31, 31);
            CommonControlSettings commonControlSettings = this.common;
            int hashCode4 = (a11 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
            IconDTO iconDTO = this.milesIcon;
            return hashCode4 + (iconDTO != null ? iconDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.rightText;
            ButtonV3Atom.SmallIconButton smallIconButton = this.smallIconButton;
            ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.button;
            int i11 = this.smallIconGap;
            CommonControlSettings commonControlSettings = this.common;
            IconDTO iconDTO = this.milesIcon;
            StringBuilder a11 = a.a("PriceRowDTO(title=", textAtom, ", rightText=", textAtom2, ", smallIconButton=");
            a11.append(smallIconButton);
            a11.append(", button=");
            a11.append(smallBorderlessButton);
            a11.append(", smallIconGap=");
            a11.append(i11);
            a11.append(", common=");
            a11.append(commonControlSettings);
            a11.append(", milesIcon=");
            a11.append(iconDTO);
            a11.append(")");
            return a11.toString();
        }

        public /* synthetic */ PriceRowDTO(TextAtom textAtom, TextAtom textAtom2, ButtonV3Atom.SmallIconButton smallIconButton, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, int i11, CommonControlSettings commonControlSettings, IconDTO iconDTO, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(textAtom, textAtom2, smallIconButton, smallBorderlessButton, (i12 & 16) != 0 ? 8 : i11, commonControlSettings, iconDTO);
        }
    }

    public /* synthetic */ TravelPriceDetailInformationV2DTO(TextAtom textAtom, TextAtom textAtom2, List list, PriceRowDTO priceRowDTO, PriceRowDTO priceRowDTO2, BonusPriceRowDTO bonusPriceRowDTO, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.PaymentButtonLarge paymentButtonLarge, TextAtom textAtom3, StickyInformationDTO stickyInformationDTO, boolean z11, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAtom, textAtom2, list, priceRowDTO, priceRowDTO2, bonusPriceRowDTO, largeButton, paymentButtonLarge, textAtom3, stickyInformationDTO, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? false : z11, map);
    }
}
