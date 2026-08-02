package ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation;

import B0.C2454a;
import B90.C2619v;
import Fm.C3051a;
import HY.a;
import J0.C3349u1;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002:\u000256B\u007f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u000e\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b'\u0010&R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010.\u001a\u0004\b\u0012\u0010/R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b0\u0010\u001fR\u0017\u0010\u0014\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0014\u0010.\u001a\u0004\b1\u0010/R\u001f\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u00102\u001a\u0004\b3\u00104¨\u00067"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2VO$PriceRowVO;", "priceRows", "total", "rowUnderTotal", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom;", "button", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2VO$BonusPriceRowVO;", "bonusTotal", "", "isBonusPriceVisible", "agreement", "shouldHideMainButton", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2VO$PriceRowVO;Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2VO$PriceRowVO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom;Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2VO$BonusPriceRowVO;ZLru/ozon/uni/atoms/data/texts/TextAtom;ZLWZ/t;)V", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "Ljava/util/List;", "getPriceRows", "()Ljava/util/List;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2VO$PriceRowVO;", "getTotal", "()Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2VO$PriceRowVO;", "getRowUnderTotal", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2VO$BonusPriceRowVO;", "getBonusTotal", "()Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2VO$BonusPriceRowVO;", "Z", "()Z", "getAgreement", "getShouldHideMainButton", "LWZ/t;", "getViewEvent", "()LWZ/t;", "PriceRowVO", "BonusPriceRowVO", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPriceDetailInformationV2VO implements c {
    private final TextAtom agreement;
    private final BonusPriceRowVO bonusTotal;
    private final ButtonV3Atom button;
    private final long id;
    private final boolean isBonusPriceVisible;

    @NotNull
    private final List<PriceRowVO> priceRows;
    private final PriceRowVO rowUnderTotal;
    private final boolean shouldHideMainButton;
    private final TextAtom subtitle;

    @NotNull
    private final TextAtom title;

    @NotNull
    private final PriceRowVO total;
    private final t viewEvent;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b&\u0010\u001bR\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b'\u0010%R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b(\u0010\u001b¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2VO$BonusPriceRowVO;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "bonusPrice", "", "bonusPriceBackgroundColor", "Lru/ozon/uni/atoms/data/price/Price;", "price", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "bonusDetailsIconButton", "bonusDetailsTitle", "priceDetailsIconButton", "priceDetailsTitle", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getBonusPrice", "Ljava/lang/Integer;", "getBonusPriceBackgroundColor", "()Ljava/lang/Integer;", "Lru/ozon/uni/atoms/data/price/Price;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getBonusDetailsIconButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getBonusDetailsTitle", "getPriceDetailsIconButton", "getPriceDetailsTitle", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BonusPriceRowVO {
        public static final int $stable;

        @NotNull
        private final ButtonV3Atom.SmallIconButton bonusDetailsIconButton;

        @NotNull
        private final TextAtom bonusDetailsTitle;

        @NotNull
        private final TextAtom bonusPrice;
        private final Integer bonusPriceBackgroundColor;

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

        public BonusPriceRowVO(@NotNull TextAtom title, @NotNull TextAtom bonusPrice, Integer num, @NotNull Price price, @NotNull ButtonV3Atom.SmallIconButton bonusDetailsIconButton, @NotNull TextAtom bonusDetailsTitle, @NotNull ButtonV3Atom.SmallIconButton priceDetailsIconButton, @NotNull TextAtom priceDetailsTitle) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(bonusPrice, "bonusPrice");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(bonusDetailsIconButton, "bonusDetailsIconButton");
            Intrinsics.checkNotNullParameter(bonusDetailsTitle, "bonusDetailsTitle");
            Intrinsics.checkNotNullParameter(priceDetailsIconButton, "priceDetailsIconButton");
            Intrinsics.checkNotNullParameter(priceDetailsTitle, "priceDetailsTitle");
            this.title = title;
            this.bonusPrice = bonusPrice;
            this.bonusPriceBackgroundColor = num;
            this.price = price;
            this.bonusDetailsIconButton = bonusDetailsIconButton;
            this.bonusDetailsTitle = bonusDetailsTitle;
            this.priceDetailsIconButton = priceDetailsIconButton;
            this.priceDetailsTitle = priceDetailsTitle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BonusPriceRowVO)) {
                return false;
            }
            BonusPriceRowVO bonusPriceRowVO = (BonusPriceRowVO) other;
            return Intrinsics.d(this.title, bonusPriceRowVO.title) && Intrinsics.d(this.bonusPrice, bonusPriceRowVO.bonusPrice) && Intrinsics.d(this.bonusPriceBackgroundColor, bonusPriceRowVO.bonusPriceBackgroundColor) && Intrinsics.d(this.price, bonusPriceRowVO.price) && Intrinsics.d(this.bonusDetailsIconButton, bonusPriceRowVO.bonusDetailsIconButton) && Intrinsics.d(this.bonusDetailsTitle, bonusPriceRowVO.bonusDetailsTitle) && Intrinsics.d(this.priceDetailsIconButton, bonusPriceRowVO.priceDetailsIconButton) && Intrinsics.d(this.priceDetailsTitle, bonusPriceRowVO.priceDetailsTitle);
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

        public final Integer getBonusPriceBackgroundColor() {
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
            int b11 = C2619v.b(this.title.hashCode() * 31, 31, this.bonusPrice);
            Integer num = this.bonusPriceBackgroundColor;
            return this.priceDetailsTitle.hashCode() + C3349u1.d(this.priceDetailsIconButton, C2619v.b(C3349u1.d(this.bonusDetailsIconButton, C3051a.a(this.price, (b11 + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31, this.bonusDetailsTitle), 31);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.bonusPrice;
            Integer num = this.bonusPriceBackgroundColor;
            Price price = this.price;
            ButtonV3Atom.SmallIconButton smallIconButton = this.bonusDetailsIconButton;
            TextAtom textAtom3 = this.bonusDetailsTitle;
            ButtonV3Atom.SmallIconButton smallIconButton2 = this.priceDetailsIconButton;
            TextAtom textAtom4 = this.priceDetailsTitle;
            StringBuilder a11 = a.a("BonusPriceRowVO(title=", textAtom, ", bonusPrice=", textAtom2, ", bonusPriceBackgroundColor=");
            a11.append(num);
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

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b'\u0010\u0016R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2VO$PriceRowVO;", "", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "rightText", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "smallIconButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "button", "smallIconGap", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "milesIcon", "<init>", "(ILru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;ILru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getRightText", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getSmallIconButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getSmallIconGap", "Lru/ozon/uni/atoms/af/AtomAction;", "getAtomAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getMilesIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceRowVO {
        public static final int $stable;
        private final AtomAction atomAction;
        private final ButtonV3Atom.SmallBorderlessButton button;
        private final int id;
        private final IconDTO milesIcon;
        private final TextAtom rightText;
        private final ButtonV3Atom.SmallIconButton smallIconButton;
        private final int smallIconGap;

        @NotNull
        private final TextAtom title;

        static {
            int i11 = IconDTO.$stable | AtomAction.$stable | ButtonV3Atom.SmallBorderlessButton.$stable | ButtonV3Atom.SmallIconButton.$stable;
            int i12 = TextAtom.$stable;
            $stable = i11 | i12 | i12;
        }

        public PriceRowVO(int i11, @NotNull TextAtom title, TextAtom textAtom, ButtonV3Atom.SmallIconButton smallIconButton, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, int i12, AtomAction atomAction, IconDTO iconDTO) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.id = i11;
            this.title = title;
            this.rightText = textAtom;
            this.smallIconButton = smallIconButton;
            this.button = smallBorderlessButton;
            this.smallIconGap = i12;
            this.atomAction = atomAction;
            this.milesIcon = iconDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceRowVO)) {
                return false;
            }
            PriceRowVO priceRowVO = (PriceRowVO) other;
            return this.id == priceRowVO.id && Intrinsics.d(this.title, priceRowVO.title) && Intrinsics.d(this.rightText, priceRowVO.rightText) && Intrinsics.d(this.smallIconButton, priceRowVO.smallIconButton) && Intrinsics.d(this.button, priceRowVO.button) && this.smallIconGap == priceRowVO.smallIconGap && Intrinsics.d(this.atomAction, priceRowVO.atomAction) && Intrinsics.d(this.milesIcon, priceRowVO.milesIcon);
        }

        public final AtomAction getAtomAction() {
            return this.atomAction;
        }

        public final ButtonV3Atom.SmallBorderlessButton getButton() {
            return this.button;
        }

        public final int getId() {
            return this.id;
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
            int b11 = C2619v.b(Integer.hashCode(this.id) * 31, 31, this.title);
            TextAtom textAtom = this.rightText;
            int hashCode = (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            ButtonV3Atom.SmallIconButton smallIconButton = this.smallIconButton;
            int hashCode2 = (hashCode + (smallIconButton == null ? 0 : smallIconButton.hashCode())) * 31;
            ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.button;
            int a11 = C2454a.a(this.smallIconGap, (hashCode2 + (smallBorderlessButton == null ? 0 : smallBorderlessButton.hashCode())) * 31, 31);
            AtomAction atomAction = this.atomAction;
            int hashCode3 = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            IconDTO iconDTO = this.milesIcon;
            return hashCode3 + (iconDTO != null ? iconDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "PriceRowVO(id=" + this.id + ", title=" + this.title + ", rightText=" + this.rightText + ", smallIconButton=" + this.smallIconButton + ", button=" + this.button + ", smallIconGap=" + this.smallIconGap + ", atomAction=" + this.atomAction + ", milesIcon=" + this.milesIcon + ")";
        }
    }

    public TravelPriceDetailInformationV2VO(long j11, @NotNull TextAtom title, TextAtom textAtom, @NotNull List<PriceRowVO> priceRows, @NotNull PriceRowVO total, PriceRowVO priceRowVO, ButtonV3Atom buttonV3Atom, BonusPriceRowVO bonusPriceRowVO, boolean z11, TextAtom textAtom2, boolean z12, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(priceRows, "priceRows");
        Intrinsics.checkNotNullParameter(total, "total");
        this.id = j11;
        this.title = title;
        this.subtitle = textAtom;
        this.priceRows = priceRows;
        this.total = total;
        this.rowUnderTotal = priceRowVO;
        this.button = buttonV3Atom;
        this.bonusTotal = bonusPriceRowVO;
        this.isBonusPriceVisible = z11;
        this.agreement = textAtom2;
        this.shouldHideMainButton = z12;
        this.viewEvent = tVar;
    }

    public final TextAtom getAgreement() {
        return this.agreement;
    }

    public final BonusPriceRowVO getBonusTotal() {
        return this.bonusTotal;
    }

    public final ButtonV3Atom getButton() {
        return this.button;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<PriceRowVO> getPriceRows() {
        return this.priceRows;
    }

    public final PriceRowVO getRowUnderTotal() {
        return this.rowUnderTotal;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    public final PriceRowVO getTotal() {
        return this.total;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    /* renamed from: isBonusPriceVisible, reason: from getter */
    public final boolean getIsBonusPriceVisible() {
        return this.isBonusPriceVisible;
    }
}
