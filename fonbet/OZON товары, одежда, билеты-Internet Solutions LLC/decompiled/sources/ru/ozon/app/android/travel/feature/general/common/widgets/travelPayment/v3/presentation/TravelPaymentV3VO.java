package ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v3.presentation;

import Ak.C2436a;
import An.C2439a;
import B90.C2619v;
import Bl.C2639a;
import D3.h;
import G.g;
import Ve.C4598rp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00018Be\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b-\u0010&R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b.\u0010)R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00105\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/presentation/TravelPaymentV3VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/presentation/TravelPaymentV3VO$PaymentMethodItemVO;", "paymentMethods", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "annotation", "optionsTitle", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;", "paymentOptions", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "confirmButton", "", "selectedCardPosition", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "milesButton", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/util/List;", "getPaymentMethods", "()Ljava/util/List;", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getAnnotation", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getOptionsTitle", "getPaymentOptions", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getConfirmButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Ljava/lang/Integer;", "getSelectedCardPosition", "()Ljava/lang/Integer;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getMilesButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "PaymentMethodItemVO", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelPaymentV3VO implements c {
    private final DisclaimerAtom annotation;
    private final ButtonV3Atom.LargeButton confirmButton;
    private final long id;
    private final ButtonV3Atom.SmallBorderlessButton milesButton;
    private final TextAtom optionsTitle;

    @NotNull
    private final List<PaymentMethodItemVO> paymentMethods;

    @NotNull
    private final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio> paymentOptions;
    private final Integer selectedCardPosition;

    @NotNull
    private final TextAtom title;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/presentation/TravelPaymentV3VO$PaymentMethodItemVO;", "", "<init>", "()V", "id", "", "getId", "()J", "TravelPaymentDefaultVO", "TravelPaymentCardVO", "TravelPaymentImageVO", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/presentation/TravelPaymentV3VO$PaymentMethodItemVO$TravelPaymentCardVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/presentation/TravelPaymentV3VO$PaymentMethodItemVO$TravelPaymentDefaultVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/presentation/TravelPaymentV3VO$PaymentMethodItemVO$TravelPaymentImageVO;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class PaymentMethodItemVO {

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b#\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010\u0012R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010\u0014¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/presentation/TravelPaymentV3VO$PaymentMethodItemVO$TravelPaymentCardVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/presentation/TravelPaymentV3VO$PaymentMethodItemVO;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "iconRight", "", "backgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "backgroundStrokeColor", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/button/Icon;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getIconRight", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "I", "getBackgroundStrokeColor", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TravelPaymentCardVO extends PaymentMethodItemVO {
            public static final int $stable;

            @NotNull
            private final AtomAction action;
            private final String backgroundColor;
            private final int backgroundStrokeColor;
            private final Icon icon;
            private final Icon iconRight;
            private final long id;
            private final TextAtom title;

            static {
                int i11 = AtomAction.$stable;
                int i12 = Icon.$stable;
                $stable = i11 | i12 | i12 | TextAtom.$stable;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TravelPaymentCardVO(long j11, TextAtom textAtom, Icon icon, Icon icon2, String str, @NotNull AtomAction action, int i11) {
                super(null);
                Intrinsics.checkNotNullParameter(action, "action");
                this.id = j11;
                this.title = textAtom;
                this.icon = icon;
                this.iconRight = icon2;
                this.backgroundColor = str;
                this.action = action;
                this.backgroundStrokeColor = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TravelPaymentCardVO)) {
                    return false;
                }
                TravelPaymentCardVO travelPaymentCardVO = (TravelPaymentCardVO) other;
                return this.id == travelPaymentCardVO.id && Intrinsics.d(this.title, travelPaymentCardVO.title) && Intrinsics.d(this.icon, travelPaymentCardVO.icon) && Intrinsics.d(this.iconRight, travelPaymentCardVO.iconRight) && Intrinsics.d(this.backgroundColor, travelPaymentCardVO.backgroundColor) && Intrinsics.d(this.action, travelPaymentCardVO.action) && this.backgroundStrokeColor == travelPaymentCardVO.backgroundStrokeColor;
            }

            @NotNull
            public final AtomAction getAction() {
                return this.action;
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final int getBackgroundStrokeColor() {
                return this.backgroundStrokeColor;
            }

            public final Icon getIcon() {
                return this.icon;
            }

            public final Icon getIconRight() {
                return this.iconRight;
            }

            @Override // ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v3.presentation.TravelPaymentV3VO.PaymentMethodItemVO
            public long getId() {
                return this.id;
            }

            public final TextAtom getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode = Long.hashCode(this.id) * 31;
                TextAtom textAtom = this.title;
                int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
                Icon icon = this.icon;
                int hashCode3 = (hashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
                Icon icon2 = this.iconRight;
                int hashCode4 = (hashCode3 + (icon2 == null ? 0 : icon2.hashCode())) * 31;
                String str = this.backgroundColor;
                return Integer.hashCode(this.backgroundStrokeColor) + C4598rp.a(this.action, (hashCode4 + (str != null ? str.hashCode() : 0)) * 31, 31);
            }

            @NotNull
            public String toString() {
                long j11 = this.id;
                TextAtom textAtom = this.title;
                Icon icon = this.icon;
                Icon icon2 = this.iconRight;
                String str = this.backgroundColor;
                AtomAction atomAction = this.action;
                int i11 = this.backgroundStrokeColor;
                StringBuilder c11 = C2639a.c("TravelPaymentCardVO(id=", j11, ", title=", textAtom);
                c11.append(", icon=");
                c11.append(icon);
                c11.append(", iconRight=");
                c11.append(icon2);
                C2439a.c(", backgroundColor=", str, ", action=", c11, atomAction);
                return h.b(c11, ", backgroundStrokeColor=", i11, ")");
            }
        }

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010\u0013¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/presentation/TravelPaymentV3VO$PaymentMethodItemVO$TravelPaymentDefaultVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/presentation/TravelPaymentV3VO$PaymentMethodItemVO;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "", "backgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "backgroundStrokeColor", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/Icon;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "I", "getBackgroundStrokeColor", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TravelPaymentDefaultVO extends PaymentMethodItemVO {
            public static final int $stable = (AtomAction.$stable | Icon.$stable) | TextAtom.$stable;

            @NotNull
            private final AtomAction action;
            private final String backgroundColor;
            private final int backgroundStrokeColor;
            private final Icon icon;
            private final long id;
            private final TextAtom title;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TravelPaymentDefaultVO(long j11, TextAtom textAtom, Icon icon, String str, @NotNull AtomAction action, int i11) {
                super(null);
                Intrinsics.checkNotNullParameter(action, "action");
                this.id = j11;
                this.title = textAtom;
                this.icon = icon;
                this.backgroundColor = str;
                this.action = action;
                this.backgroundStrokeColor = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TravelPaymentDefaultVO)) {
                    return false;
                }
                TravelPaymentDefaultVO travelPaymentDefaultVO = (TravelPaymentDefaultVO) other;
                return this.id == travelPaymentDefaultVO.id && Intrinsics.d(this.title, travelPaymentDefaultVO.title) && Intrinsics.d(this.icon, travelPaymentDefaultVO.icon) && Intrinsics.d(this.backgroundColor, travelPaymentDefaultVO.backgroundColor) && Intrinsics.d(this.action, travelPaymentDefaultVO.action) && this.backgroundStrokeColor == travelPaymentDefaultVO.backgroundStrokeColor;
            }

            @NotNull
            public final AtomAction getAction() {
                return this.action;
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final int getBackgroundStrokeColor() {
                return this.backgroundStrokeColor;
            }

            public final Icon getIcon() {
                return this.icon;
            }

            @Override // ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v3.presentation.TravelPaymentV3VO.PaymentMethodItemVO
            public long getId() {
                return this.id;
            }

            public final TextAtom getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode = Long.hashCode(this.id) * 31;
                TextAtom textAtom = this.title;
                int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
                Icon icon = this.icon;
                int hashCode3 = (hashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
                String str = this.backgroundColor;
                return Integer.hashCode(this.backgroundStrokeColor) + C4598rp.a(this.action, (hashCode3 + (str != null ? str.hashCode() : 0)) * 31, 31);
            }

            @NotNull
            public String toString() {
                long j11 = this.id;
                TextAtom textAtom = this.title;
                Icon icon = this.icon;
                String str = this.backgroundColor;
                AtomAction atomAction = this.action;
                int i11 = this.backgroundStrokeColor;
                StringBuilder c11 = C2639a.c("TravelPaymentDefaultVO(id=", j11, ", title=", textAtom);
                c11.append(", icon=");
                c11.append(icon);
                c11.append(", backgroundColor=");
                c11.append(str);
                c11.append(", action=");
                c11.append(atomAction);
                c11.append(", backgroundStrokeColor=");
                c11.append(i11);
                c11.append(")");
                return c11.toString();
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/presentation/TravelPaymentV3VO$PaymentMethodItemVO$TravelPaymentImageVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/presentation/TravelPaymentV3VO$PaymentMethodItemVO;", "", "id", "", "backgroundImage", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "backgroundStrokeColor", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getBackgroundImage", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "I", "getBackgroundStrokeColor", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TravelPaymentImageVO extends PaymentMethodItemVO {
            public static final int $stable = AtomAction.$stable;

            @NotNull
            private final AtomAction action;
            private final String backgroundImage;
            private final int backgroundStrokeColor;
            private final long id;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TravelPaymentImageVO(long j11, String str, @NotNull AtomAction action, int i11) {
                super(null);
                Intrinsics.checkNotNullParameter(action, "action");
                this.id = j11;
                this.backgroundImage = str;
                this.action = action;
                this.backgroundStrokeColor = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TravelPaymentImageVO)) {
                    return false;
                }
                TravelPaymentImageVO travelPaymentImageVO = (TravelPaymentImageVO) other;
                return this.id == travelPaymentImageVO.id && Intrinsics.d(this.backgroundImage, travelPaymentImageVO.backgroundImage) && Intrinsics.d(this.action, travelPaymentImageVO.action) && this.backgroundStrokeColor == travelPaymentImageVO.backgroundStrokeColor;
            }

            @NotNull
            public final AtomAction getAction() {
                return this.action;
            }

            public final String getBackgroundImage() {
                return this.backgroundImage;
            }

            public final int getBackgroundStrokeColor() {
                return this.backgroundStrokeColor;
            }

            @Override // ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v3.presentation.TravelPaymentV3VO.PaymentMethodItemVO
            public long getId() {
                return this.id;
            }

            public int hashCode() {
                int hashCode = Long.hashCode(this.id) * 31;
                String str = this.backgroundImage;
                return Integer.hashCode(this.backgroundStrokeColor) + C4598rp.a(this.action, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            }

            @NotNull
            public String toString() {
                long j11 = this.id;
                String str = this.backgroundImage;
                AtomAction atomAction = this.action;
                int i11 = this.backgroundStrokeColor;
                StringBuilder c11 = C2436a.c(j11, "TravelPaymentImageVO(id=", ", backgroundImage=", str);
                c11.append(", action=");
                c11.append(atomAction);
                c11.append(", backgroundStrokeColor=");
                c11.append(i11);
                c11.append(")");
                return c11.toString();
            }
        }

        public /* synthetic */ PaymentMethodItemVO(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract long getId();

        private PaymentMethodItemVO() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TravelPaymentV3VO(long j11, @NotNull TextAtom title, @NotNull List<? extends PaymentMethodItemVO> paymentMethods, DisclaimerAtom disclaimerAtom, TextAtom textAtom, @NotNull List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio> paymentOptions, ButtonV3Atom.LargeButton largeButton, Integer num, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        Intrinsics.checkNotNullParameter(paymentOptions, "paymentOptions");
        this.id = j11;
        this.title = title;
        this.paymentMethods = paymentMethods;
        this.annotation = disclaimerAtom;
        this.optionsTitle = textAtom;
        this.paymentOptions = paymentOptions;
        this.confirmButton = largeButton;
        this.selectedCardPosition = num;
        this.milesButton = smallBorderlessButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelPaymentV3VO)) {
            return false;
        }
        TravelPaymentV3VO travelPaymentV3VO = (TravelPaymentV3VO) other;
        return this.id == travelPaymentV3VO.id && Intrinsics.d(this.title, travelPaymentV3VO.title) && Intrinsics.d(this.paymentMethods, travelPaymentV3VO.paymentMethods) && Intrinsics.d(this.annotation, travelPaymentV3VO.annotation) && Intrinsics.d(this.optionsTitle, travelPaymentV3VO.optionsTitle) && Intrinsics.d(this.paymentOptions, travelPaymentV3VO.paymentOptions) && Intrinsics.d(this.confirmButton, travelPaymentV3VO.confirmButton) && Intrinsics.d(this.selectedCardPosition, travelPaymentV3VO.selectedCardPosition) && Intrinsics.d(this.milesButton, travelPaymentV3VO.milesButton);
    }

    public final DisclaimerAtom getAnnotation() {
        return this.annotation;
    }

    public final ButtonV3Atom.LargeButton getConfirmButton() {
        return this.confirmButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final ButtonV3Atom.SmallBorderlessButton getMilesButton() {
        return this.milesButton;
    }

    public final TextAtom getOptionsTitle() {
        return this.optionsTitle;
    }

    @NotNull
    public final List<PaymentMethodItemVO> getPaymentMethods() {
        return this.paymentMethods;
    }

    @NotNull
    public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio> getPaymentOptions() {
        return this.paymentOptions;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final Integer getSelectedCardPosition() {
        return this.selectedCardPosition;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(C2619v.b(Long.hashCode(this.id) * 31, 31, this.title), 31, this.paymentMethods);
        DisclaimerAtom disclaimerAtom = this.annotation;
        int hashCode = (b11 + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31;
        TextAtom textAtom = this.optionsTitle;
        int b12 = g.b((hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31, this.paymentOptions);
        ButtonV3Atom.LargeButton largeButton = this.confirmButton;
        int hashCode2 = (b12 + (largeButton == null ? 0 : largeButton.hashCode())) * 31;
        Integer num = this.selectedCardPosition;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.milesButton;
        return hashCode3 + (smallBorderlessButton != null ? smallBorderlessButton.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        List<PaymentMethodItemVO> list = this.paymentMethods;
        DisclaimerAtom disclaimerAtom = this.annotation;
        TextAtom textAtom2 = this.optionsTitle;
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio> list2 = this.paymentOptions;
        ButtonV3Atom.LargeButton largeButton = this.confirmButton;
        Integer num = this.selectedCardPosition;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.milesButton;
        StringBuilder c11 = C2639a.c("TravelPaymentV3VO(id=", j11, ", title=", textAtom);
        c11.append(", paymentMethods=");
        c11.append(list);
        c11.append(", annotation=");
        c11.append(disclaimerAtom);
        c11.append(", optionsTitle=");
        c11.append(textAtom2);
        c11.append(", paymentOptions=");
        c11.append(list2);
        c11.append(", confirmButton=");
        c11.append(largeButton);
        c11.append(", selectedCardPosition=");
        c11.append(num);
        c11.append(", milesButton=");
        c11.append(smallBorderlessButton);
        c11.append(")");
        return c11.toString();
    }
}
