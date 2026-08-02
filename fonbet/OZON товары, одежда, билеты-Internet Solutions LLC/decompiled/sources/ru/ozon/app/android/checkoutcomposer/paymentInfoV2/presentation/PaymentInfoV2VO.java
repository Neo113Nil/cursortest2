package ru.ozon.app.android.checkoutcomposer.paymentInfoV2.presentation;

import Bl.C2639a;
import F3.G;
import G.g;
import Kk.C3532b;
import T7.E;
import WZ.t;
import Xc.a;
import Xc.b;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.checkoutgeo.checkout.views.checkoutCellList.CheckoutCellListDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002-.BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b)\u0010(R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "titleButton", "", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$Payment;", "payments", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$DynamicElementVO;", "elements", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Ljava/util/List;Ljava/util/List;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getTitleButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "Ljava/util/List;", "getPayments", "()Ljava/util/List;", "getElements", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Payment", "DynamicElementVO", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PaymentInfoV2VO implements c {

    @NotNull
    private final List<DynamicElementVO> elements;
    private final long id;
    private final List<Payment> payments;
    private final TextAtom title;
    private final ButtonV3Atom.SmallButton titleButton;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$DynamicElementVO;", "", "<init>", "()V", "Separator", "Atom", "VerticalSpacer", "CellWithSubtitleCheckboxRadio", "CellWithSubtitleToggle", "CheckoutCellList", "Button", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$DynamicElementVO$Atom;", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$DynamicElementVO$Button;", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$DynamicElementVO$CellWithSubtitleCheckboxRadio;", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$DynamicElementVO$CellWithSubtitleToggle;", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$DynamicElementVO$CheckoutCellList;", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$DynamicElementVO$Separator;", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$DynamicElementVO$VerticalSpacer;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class DynamicElementVO {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$DynamicElementVO$Atom;", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$DynamicElementVO;", "Lru/ozon/uni/atoms/data/AtomDTO;", "atom", "<init>", "(Lru/ozon/uni/atoms/data/AtomDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/AtomDTO;", "getAtom", "()Lru/ozon/uni/atoms/data/AtomDTO;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Atom extends DynamicElementVO {
            public static final int $stable = AtomDTO.$stable;

            @NotNull
            private final AtomDTO atom;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Atom(@NotNull AtomDTO atom) {
                super(null);
                Intrinsics.checkNotNullParameter(atom, "atom");
                this.atom = atom;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Atom) && Intrinsics.d(this.atom, ((Atom) other).atom);
            }

            @NotNull
            public final AtomDTO getAtom() {
                return this.atom;
            }

            public int hashCode() {
                return this.atom.hashCode();
            }

            @NotNull
            public String toString() {
                return "Atom(atom=" + this.atom + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$DynamicElementVO$Button;", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$DynamicElementVO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Button extends DynamicElementVO {

            @NotNull
            private final ButtonV3DTO button;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Button(@NotNull ButtonV3DTO button) {
                super(null);
                Intrinsics.checkNotNullParameter(button, "button");
                this.button = button;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Button) && Intrinsics.d(this.button, ((Button) other).button);
            }

            @NotNull
            public final ButtonV3DTO getButton() {
                return this.button;
            }

            public int hashCode() {
                return this.button.hashCode();
            }

            @NotNull
            public String toString() {
                return G.b(this.button, "Button(button=", ")");
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$DynamicElementVO$CellWithSubtitleCheckboxRadio;", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$DynamicElementVO;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;", "atom", "<init>", "(Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;", "getAtom", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CellWithSubtitleCheckboxRadio extends DynamicElementVO {

            @NotNull
            private final CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio atom;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CellWithSubtitleCheckboxRadio(@NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio atom) {
                super(null);
                Intrinsics.checkNotNullParameter(atom, "atom");
                this.atom = atom;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CellWithSubtitleCheckboxRadio) && Intrinsics.d(this.atom, ((CellWithSubtitleCheckboxRadio) other).atom);
            }

            @NotNull
            public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio getAtom() {
                return this.atom;
            }

            public int hashCode() {
                return this.atom.hashCode();
            }

            @NotNull
            public String toString() {
                return "CellWithSubtitleCheckboxRadio(atom=" + this.atom + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$DynamicElementVO$CheckoutCellList;", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$DynamicElementVO;", "Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;", "checkoutCellList", "<init>", "(Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;", "getCheckoutCellList", "()Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CheckoutCellList extends DynamicElementVO {

            @NotNull
            private final CheckoutCellListDTO checkoutCellList;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CheckoutCellList(@NotNull CheckoutCellListDTO checkoutCellList) {
                super(null);
                Intrinsics.checkNotNullParameter(checkoutCellList, "checkoutCellList");
                this.checkoutCellList = checkoutCellList;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CheckoutCellList) && Intrinsics.d(this.checkoutCellList, ((CheckoutCellList) other).checkoutCellList);
            }

            @NotNull
            public final CheckoutCellListDTO getCheckoutCellList() {
                return this.checkoutCellList;
            }

            public int hashCode() {
                return this.checkoutCellList.hashCode();
            }

            @NotNull
            public String toString() {
                return "CheckoutCellList(checkoutCellList=" + this.checkoutCellList + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$DynamicElementVO$Separator;", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$DynamicElementVO;", "<init>", "()V", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Separator extends DynamicElementVO {

            @NotNull
            public static final Separator INSTANCE = new Separator();

            private Separator() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$DynamicElementVO$VerticalSpacer;", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$DynamicElementVO;", "", "spacing", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getSpacing", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class VerticalSpacer extends DynamicElementVO {
            private final int spacing;

            public VerticalSpacer(int i11) {
                super(null);
                this.spacing = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof VerticalSpacer) && this.spacing == ((VerticalSpacer) other).spacing;
            }

            public final int getSpacing() {
                return this.spacing;
            }

            public int hashCode() {
                return Integer.hashCode(this.spacing);
            }

            @NotNull
            public String toString() {
                return E.a(this.spacing, "VerticalSpacer(spacing=", ")");
            }
        }

        public /* synthetic */ DynamicElementVO(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$DynamicElementVO$CellWithSubtitleToggle;", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$DynamicElementVO;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;", "atom", "", "uuid", "<init>", "(Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;", "getAtom", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;", "Ljava/lang/String;", "getUuid", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CellWithSubtitleToggle extends DynamicElementVO {

            @NotNull
            private final CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle atom;

            @NotNull
            private final String uuid;

            public /* synthetic */ CellWithSubtitleToggle(CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle cellWithSubtitleToggle, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(cellWithSubtitleToggle, (i11 & 2) != 0 ? UUID.randomUUID().toString() : str);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CellWithSubtitleToggle)) {
                    return false;
                }
                CellWithSubtitleToggle cellWithSubtitleToggle = (CellWithSubtitleToggle) other;
                return Intrinsics.d(this.atom, cellWithSubtitleToggle.atom) && Intrinsics.d(this.uuid, cellWithSubtitleToggle.uuid);
            }

            @NotNull
            public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle getAtom() {
                return this.atom;
            }

            public int hashCode() {
                return this.uuid.hashCode() + (this.atom.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "CellWithSubtitleToggle(atom=" + this.atom + ", uuid=" + this.uuid + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CellWithSubtitleToggle(@NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle atom, @NotNull String uuid) {
                super(null);
                Intrinsics.checkNotNullParameter(atom, "atom");
                Intrinsics.checkNotNullParameter(uuid, "uuid");
                this.atom = atom;
                this.uuid = uuid;
            }
        }

        private DynamicElementVO() {
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001:\u00010Bg\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b!\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\"\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b#\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b\u000e\u0010+R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b/\u0010\u0015¨\u00061"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$Payment;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "icon", "iconRight", "background", "backgroundColor", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$Payment$StyleType;", "type", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "isSelected", "Lru/ozon/uni/atoms/data/badge/Badge;", "promoteLabel", "automatizationDescription", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$Payment$StyleType;Lru/ozon/uni/atoms/af/AtomAction;ZLru/ozon/uni/atoms/data/badge/Badge;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/lang/String;", "getIcon", "getIconRight", "getBackground", "getBackgroundColor", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$Payment$StyleType;", "getType", "()Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$Payment$StyleType;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Z", "()Z", "Lru/ozon/uni/atoms/data/badge/Badge;", "getPromoteLabel", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getAutomatizationDescription", "StyleType", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Payment {
        public static final int $stable = (Badge.$stable | AtomAction.$stable) | TextAtom.$stable;
        private final AtomAction action;
        private final String automatizationDescription;
        private final String background;
        private final String backgroundColor;
        private final String icon;
        private final String iconRight;
        private final boolean isSelected;
        private final Badge promoteLabel;
        private final TextAtom title;

        @NotNull
        private final StyleType type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$Payment$StyleType;", "", "<init>", "(Ljava/lang/String;I)V", "STYLE_TYPE_DEFAULT", "STYLE_TYPE_CARD", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class StyleType {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ StyleType[] $VALUES;
            public static final StyleType STYLE_TYPE_DEFAULT = new StyleType("STYLE_TYPE_DEFAULT", 0);
            public static final StyleType STYLE_TYPE_CARD = new StyleType("STYLE_TYPE_CARD", 1);

            private static final /* synthetic */ StyleType[] $values() {
                return new StyleType[]{STYLE_TYPE_DEFAULT, STYLE_TYPE_CARD};
            }

            static {
                StyleType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private StyleType(String str, int i11) {
            }

            public static StyleType valueOf(String str) {
                return (StyleType) Enum.valueOf(StyleType.class, str);
            }

            public static StyleType[] values() {
                return (StyleType[]) $VALUES.clone();
            }
        }

        public Payment(TextAtom textAtom, String str, String str2, String str3, String str4, @NotNull StyleType type, AtomAction atomAction, boolean z11, Badge badge, String str5) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.title = textAtom;
            this.icon = str;
            this.iconRight = str2;
            this.background = str3;
            this.backgroundColor = str4;
            this.type = type;
            this.action = atomAction;
            this.isSelected = z11;
            this.promoteLabel = badge;
            this.automatizationDescription = str5;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payment)) {
                return false;
            }
            Payment payment = (Payment) other;
            return Intrinsics.d(this.title, payment.title) && Intrinsics.d(this.icon, payment.icon) && Intrinsics.d(this.iconRight, payment.iconRight) && Intrinsics.d(this.background, payment.background) && Intrinsics.d(this.backgroundColor, payment.backgroundColor) && this.type == payment.type && Intrinsics.d(this.action, payment.action) && this.isSelected == payment.isSelected && Intrinsics.d(this.promoteLabel, payment.promoteLabel) && Intrinsics.d(this.automatizationDescription, payment.automatizationDescription);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final String getAutomatizationDescription() {
            return this.automatizationDescription;
        }

        public final String getBackground() {
            return this.background;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getIcon() {
            return this.icon;
        }

        public final String getIconRight() {
            return this.iconRight;
        }

        public final Badge getPromoteLabel() {
            return this.promoteLabel;
        }

        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        public final StyleType getType() {
            return this.type;
        }

        public int hashCode() {
            TextAtom textAtom = this.title;
            int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
            String str = this.icon;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.iconRight;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.background;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.backgroundColor;
            int hashCode5 = (this.type.hashCode() + ((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
            AtomAction atomAction = this.action;
            int a11 = C3532b.a((hashCode5 + (atomAction == null ? 0 : atomAction.hashCode())) * 31, 31, this.isSelected);
            Badge badge = this.promoteLabel;
            int hashCode6 = (a11 + (badge == null ? 0 : badge.hashCode())) * 31;
            String str5 = this.automatizationDescription;
            return hashCode6 + (str5 != null ? str5.hashCode() : 0);
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.title;
            String str = this.icon;
            String str2 = this.iconRight;
            String str3 = this.background;
            String str4 = this.backgroundColor;
            StyleType styleType = this.type;
            AtomAction atomAction = this.action;
            boolean z11 = this.isSelected;
            Badge badge = this.promoteLabel;
            String str5 = this.automatizationDescription;
            StringBuilder d11 = Bl.b.d("Payment(title=", ", icon=", str, ", iconRight=", textAtom);
            Nh.a.h(d11, str2, ", background=", str3, ", backgroundColor=");
            d11.append(str4);
            d11.append(", type=");
            d11.append(styleType);
            d11.append(", action=");
            d11.append(atomAction);
            d11.append(", isSelected=");
            d11.append(z11);
            d11.append(", promoteLabel=");
            d11.append(badge);
            d11.append(", automatizationDescription=");
            d11.append(str5);
            d11.append(")");
            return d11.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentInfoV2VO(long j11, TextAtom textAtom, ButtonV3Atom.SmallButton smallButton, List<Payment> list, @NotNull List<? extends DynamicElementVO> elements, t tVar) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.id = j11;
        this.title = textAtom;
        this.titleButton = smallButton;
        this.payments = list;
        this.elements = elements;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentInfoV2VO)) {
            return false;
        }
        PaymentInfoV2VO paymentInfoV2VO = (PaymentInfoV2VO) other;
        return this.id == paymentInfoV2VO.id && Intrinsics.d(this.title, paymentInfoV2VO.title) && Intrinsics.d(this.titleButton, paymentInfoV2VO.titleButton) && Intrinsics.d(this.payments, paymentInfoV2VO.payments) && Intrinsics.d(this.elements, paymentInfoV2VO.elements) && Intrinsics.d(this.tokenizedEvent, paymentInfoV2VO.tokenizedEvent);
    }

    @NotNull
    public final List<DynamicElementVO> getElements() {
        return this.elements;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final List<Payment> getPayments() {
        return this.payments;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public final ButtonV3Atom.SmallButton getTitleButton() {
        return this.titleButton;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextAtom textAtom = this.title;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        ButtonV3Atom.SmallButton smallButton = this.titleButton;
        int hashCode3 = (hashCode2 + (smallButton == null ? 0 : smallButton.hashCode())) * 31;
        List<Payment> list = this.payments;
        int b11 = g.b((hashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31, this.elements);
        t tVar = this.tokenizedEvent;
        return b11 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        ButtonV3Atom.SmallButton smallButton = this.titleButton;
        List<Payment> list = this.payments;
        List<DynamicElementVO> list2 = this.elements;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2639a.c("PaymentInfoV2VO(id=", j11, ", title=", textAtom);
        c11.append(", titleButton=");
        c11.append(smallButton);
        c11.append(", payments=");
        c11.append(list);
        Ak.b.h(c11, ", elements=", list2, ", tokenizedEvent=", tVar);
        c11.append(")");
        return c11.toString();
    }
}
