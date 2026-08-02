package ru.ozon.app.android.bank.widgets.installmentPayment.presentation;

import B90.C2619v;
import Bl.C2639a;
import C.o0;
import G.g;
import HY.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002:;B\u0083\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b)\u0010(R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010,R\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b0\u0010(R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b1\u0010(R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b2\u0010,R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u00103\u001a\u0004\b6\u00105R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u00107\u001a\u0004\b8\u00109¨\u0006<"}, d2 = {"Lru/ozon/app/android/bank/widgets/installmentPayment/presentation/InstallmentPaymentVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subTitle", "", "Lru/ozon/app/android/bank/widgets/installmentPayment/presentation/InstallmentPaymentVO$PaymentVO;", "payments", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "titleGrace", "subTitleGrace", "paymentsGrace", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;", "paymentsSwitch", "paymentsGraceSwitch", "Lru/ozon/app/android/bank/widgets/installmentPayment/presentation/InstallmentPaymentVO$IconTitleVO;", "iconTitle", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;LWZ/t;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;Lru/ozon/app/android/bank/widgets/installmentPayment/presentation/InstallmentPaymentVO$IconTitleVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubTitle", "Ljava/util/List;", "getPayments", "()Ljava/util/List;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "getTitleGrace", "getSubTitleGrace", "getPaymentsGrace", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;", "getPaymentsSwitch", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;", "getPaymentsGraceSwitch", "Lru/ozon/app/android/bank/widgets/installmentPayment/presentation/InstallmentPaymentVO$IconTitleVO;", "getIconTitle", "()Lru/ozon/app/android/bank/widgets/installmentPayment/presentation/InstallmentPaymentVO$IconTitleVO;", "IconTitleVO", "PaymentVO", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class InstallmentPaymentVO implements c {
    private final IconTitleVO iconTitle;
    private final long id;

    @NotNull
    private final List<PaymentVO> payments;
    private final List<PaymentVO> paymentsGrace;
    private final ButtonV3Atom.SmallBorderlessButtonWithIcon paymentsGraceSwitch;
    private final ButtonV3Atom.SmallBorderlessButtonWithIcon paymentsSwitch;
    private final TextAtom subTitle;
    private final TextAtom subTitleGrace;
    private final TextAtom title;
    private final TextAtom titleGrace;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/bank/widgets/installmentPayment/presentation/InstallmentPaymentVO$IconTitleVO;", "", "", "icon", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IconTitleVO {
        private final AtomAction action;

        @NotNull
        private final String icon;

        public IconTitleVO(@NotNull String icon, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.icon = icon;
            this.action = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IconTitleVO)) {
                return false;
            }
            IconTitleVO iconTitleVO = (IconTitleVO) other;
            return Intrinsics.d(this.icon, iconTitleVO.icon) && Intrinsics.d(this.action, iconTitleVO.action);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        public int hashCode() {
            int hashCode = this.icon.hashCode() * 31;
            AtomAction atomAction = this.action;
            return hashCode + (atomAction == null ? 0 : atomAction.hashCode());
        }

        @NotNull
        public String toString() {
            return "IconTitleVO(icon=" + this.icon + ", action=" + this.action + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/bank/widgets/installmentPayment/presentation/InstallmentPaymentVO$PaymentVO;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "amount", "date", "", "backgroundColor", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getAmount", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDate", "Ljava/lang/String;", "getBackgroundColor", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaymentVO {

        @NotNull
        private final TextAtom amount;
        private final String backgroundColor;

        @NotNull
        private final TextAtom date;

        public PaymentVO(@NotNull TextAtom amount, @NotNull TextAtom date, String str) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(date, "date");
            this.amount = amount;
            this.date = date;
            this.backgroundColor = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentVO)) {
                return false;
            }
            PaymentVO paymentVO = (PaymentVO) other;
            return Intrinsics.d(this.amount, paymentVO.amount) && Intrinsics.d(this.date, paymentVO.date) && Intrinsics.d(this.backgroundColor, paymentVO.backgroundColor);
        }

        @NotNull
        public final TextAtom getAmount() {
            return this.amount;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final TextAtom getDate() {
            return this.date;
        }

        public int hashCode() {
            int b11 = C2619v.b(this.amount.hashCode() * 31, 31, this.date);
            String str = this.backgroundColor;
            return b11 + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.amount;
            TextAtom textAtom2 = this.date;
            return o0.c(a.a("PaymentVO(amount=", textAtom, ", date=", textAtom2, ", backgroundColor="), this.backgroundColor, ")");
        }
    }

    public InstallmentPaymentVO(long j11, TextAtom textAtom, TextAtom textAtom2, @NotNull List<PaymentVO> payments, t tVar, TextAtom textAtom3, TextAtom textAtom4, List<PaymentVO> list, ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon, ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon2, IconTitleVO iconTitleVO) {
        Intrinsics.checkNotNullParameter(payments, "payments");
        this.id = j11;
        this.title = textAtom;
        this.subTitle = textAtom2;
        this.payments = payments;
        this.tokenizedEvent = tVar;
        this.titleGrace = textAtom3;
        this.subTitleGrace = textAtom4;
        this.paymentsGrace = list;
        this.paymentsSwitch = smallBorderlessButtonWithIcon;
        this.paymentsGraceSwitch = smallBorderlessButtonWithIcon2;
        this.iconTitle = iconTitleVO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallmentPaymentVO)) {
            return false;
        }
        InstallmentPaymentVO installmentPaymentVO = (InstallmentPaymentVO) other;
        return this.id == installmentPaymentVO.id && Intrinsics.d(this.title, installmentPaymentVO.title) && Intrinsics.d(this.subTitle, installmentPaymentVO.subTitle) && Intrinsics.d(this.payments, installmentPaymentVO.payments) && Intrinsics.d(this.tokenizedEvent, installmentPaymentVO.tokenizedEvent) && Intrinsics.d(this.titleGrace, installmentPaymentVO.titleGrace) && Intrinsics.d(this.subTitleGrace, installmentPaymentVO.subTitleGrace) && Intrinsics.d(this.paymentsGrace, installmentPaymentVO.paymentsGrace) && Intrinsics.d(this.paymentsSwitch, installmentPaymentVO.paymentsSwitch) && Intrinsics.d(this.paymentsGraceSwitch, installmentPaymentVO.paymentsGraceSwitch) && Intrinsics.d(this.iconTitle, installmentPaymentVO.iconTitle);
    }

    public final IconTitleVO getIconTitle() {
        return this.iconTitle;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<PaymentVO> getPayments() {
        return this.payments;
    }

    public final List<PaymentVO> getPaymentsGrace() {
        return this.paymentsGrace;
    }

    public final ButtonV3Atom.SmallBorderlessButtonWithIcon getPaymentsGraceSwitch() {
        return this.paymentsGraceSwitch;
    }

    public final ButtonV3Atom.SmallBorderlessButtonWithIcon getPaymentsSwitch() {
        return this.paymentsSwitch;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextAtom getSubTitle() {
        return this.subTitle;
    }

    public final TextAtom getSubTitleGrace() {
        return this.subTitleGrace;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public final TextAtom getTitleGrace() {
        return this.titleGrace;
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
        TextAtom textAtom2 = this.subTitle;
        int b11 = g.b((hashCode2 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31, 31, this.payments);
        t tVar = this.tokenizedEvent;
        int hashCode3 = (b11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        TextAtom textAtom3 = this.titleGrace;
        int hashCode4 = (hashCode3 + (textAtom3 == null ? 0 : textAtom3.hashCode())) * 31;
        TextAtom textAtom4 = this.subTitleGrace;
        int hashCode5 = (hashCode4 + (textAtom4 == null ? 0 : textAtom4.hashCode())) * 31;
        List<PaymentVO> list = this.paymentsGrace;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon = this.paymentsSwitch;
        int hashCode7 = (hashCode6 + (smallBorderlessButtonWithIcon == null ? 0 : smallBorderlessButtonWithIcon.hashCode())) * 31;
        ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon2 = this.paymentsGraceSwitch;
        int hashCode8 = (hashCode7 + (smallBorderlessButtonWithIcon2 == null ? 0 : smallBorderlessButtonWithIcon2.hashCode())) * 31;
        IconTitleVO iconTitleVO = this.iconTitle;
        return hashCode8 + (iconTitleVO != null ? iconTitleVO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subTitle;
        List<PaymentVO> list = this.payments;
        t tVar = this.tokenizedEvent;
        TextAtom textAtom3 = this.titleGrace;
        TextAtom textAtom4 = this.subTitleGrace;
        List<PaymentVO> list2 = this.paymentsGrace;
        ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon = this.paymentsSwitch;
        ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon2 = this.paymentsGraceSwitch;
        IconTitleVO iconTitleVO = this.iconTitle;
        StringBuilder c11 = C2639a.c("InstallmentPaymentVO(id=", j11, ", title=", textAtom);
        c11.append(", subTitle=");
        c11.append(textAtom2);
        c11.append(", payments=");
        c11.append(list);
        c11.append(", tokenizedEvent=");
        c11.append(tVar);
        c11.append(", titleGrace=");
        c11.append(textAtom3);
        c11.append(", subTitleGrace=");
        c11.append(textAtom4);
        c11.append(", paymentsGrace=");
        c11.append(list2);
        c11.append(", paymentsSwitch=");
        c11.append(smallBorderlessButtonWithIcon);
        c11.append(", paymentsGraceSwitch=");
        c11.append(smallBorderlessButtonWithIcon2);
        c11.append(", iconTitle=");
        c11.append(iconTitleVO);
        c11.append(")");
        return c11.toString();
    }
}
