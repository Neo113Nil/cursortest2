package ru.ozon.app.android.bank.widgets.installmentPaymentScheduleV2.presentation;

import C.o0;
import D3.g;
import Kk.C3532b;
import Ns.b;
import TY.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001.BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b#\u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b'\u0010\"R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u001f\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/bank/widgets/installmentPaymentScheduleV2/presentation/InstallmentPaymentScheduleVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "Lru/ozon/app/android/bank/widgets/installmentPaymentScheduleV2/presentation/InstallmentPaymentScheduleVO$PaymentVO;", "payments", "description", "", "showPaymentsAnimation", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;ZLWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Ljava/util/List;", "getPayments", "()Ljava/util/List;", "getDescription", "Z", "getShowPaymentsAnimation", "()Z", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "PaymentVO", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class InstallmentPaymentScheduleVO implements c {
    private final TextDTO description;
    private final long id;

    @NotNull
    private final List<PaymentVO> payments;
    private final boolean showPaymentsAnimation;
    private final TextDTO subtitle;
    private final TextDTO title;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/bank/widgets/installmentPaymentScheduleV2/presentation/InstallmentPaymentScheduleVO$PaymentVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "amount", "date", "", "backgroundColor", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getAmount", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDate", "Ljava/lang/String;", "getBackgroundColor", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaymentVO {

        @NotNull
        private final TextDTO amount;
        private final String backgroundColor;

        @NotNull
        private final TextDTO date;

        public PaymentVO(@NotNull TextDTO amount, @NotNull TextDTO date, String str) {
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
        public final TextDTO getAmount() {
            return this.amount;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final TextDTO getDate() {
            return this.date;
        }

        public int hashCode() {
            int a11 = b.a(this.date, this.amount.hashCode() * 31, 31);
            String str = this.backgroundColor;
            return a11 + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.amount;
            TextDTO textDTO2 = this.date;
            return o0.c(g.g("PaymentVO(amount=", textDTO, ", date=", textDTO2, ", backgroundColor="), this.backgroundColor, ")");
        }
    }

    public InstallmentPaymentScheduleVO(long j11, TextDTO textDTO, TextDTO textDTO2, @NotNull List<PaymentVO> payments, TextDTO textDTO3, boolean z11, t tVar) {
        Intrinsics.checkNotNullParameter(payments, "payments");
        this.id = j11;
        this.title = textDTO;
        this.subtitle = textDTO2;
        this.payments = payments;
        this.description = textDTO3;
        this.showPaymentsAnimation = z11;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallmentPaymentScheduleVO)) {
            return false;
        }
        InstallmentPaymentScheduleVO installmentPaymentScheduleVO = (InstallmentPaymentScheduleVO) other;
        return this.id == installmentPaymentScheduleVO.id && Intrinsics.d(this.title, installmentPaymentScheduleVO.title) && Intrinsics.d(this.subtitle, installmentPaymentScheduleVO.subtitle) && Intrinsics.d(this.payments, installmentPaymentScheduleVO.payments) && Intrinsics.d(this.description, installmentPaymentScheduleVO.description) && this.showPaymentsAnimation == installmentPaymentScheduleVO.showPaymentsAnimation && Intrinsics.d(this.tokenizedEvent, installmentPaymentScheduleVO.tokenizedEvent);
    }

    public final TextDTO getDescription() {
        return this.description;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<PaymentVO> getPayments() {
        return this.payments;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final boolean getShowPaymentsAnimation() {
        return this.showPaymentsAnimation;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final TextDTO getTitle() {
        return this.title;
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
        TextDTO textDTO = this.title;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.subtitle;
        int b11 = G.g.b((hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31, 31, this.payments);
        TextDTO textDTO3 = this.description;
        int a11 = C3532b.a((b11 + (textDTO3 == null ? 0 : textDTO3.hashCode())) * 31, 31, this.showPaymentsAnimation);
        t tVar = this.tokenizedEvent;
        return a11 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        List<PaymentVO> list = this.payments;
        TextDTO textDTO3 = this.description;
        boolean z11 = this.showPaymentsAnimation;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = a.b("InstallmentPaymentScheduleVO(id=", j11, ", title=", textDTO);
        b11.append(", subtitle=");
        b11.append(textDTO2);
        b11.append(", payments=");
        b11.append(list);
        b11.append(", description=");
        b11.append(textDTO3);
        b11.append(", showPaymentsAnimation=");
        b11.append(z11);
        return Lh.a.b(b11, ", tokenizedEvent=", tVar, ")");
    }
}
