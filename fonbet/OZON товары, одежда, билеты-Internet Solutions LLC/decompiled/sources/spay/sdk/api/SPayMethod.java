package spay.sdk.api;

import B0.A0;
import Sc.InterfaceC3999a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lspay/sdk/api/SPayMethod;", "", "BindingPayment", "Default", "WithBankInvoiceId", "WithBinding", "WithBonuses", "WithPartPay", "WithPhoneNumber", "WithoutRefresh", "Lspay/sdk/api/SPayMethod$BindingPayment;", "Lspay/sdk/api/SPayMethod$Default;", "Lspay/sdk/api/SPayMethod$WithBankInvoiceId;", "Lspay/sdk/api/SPayMethod$WithBinding;", "Lspay/sdk/api/SPayMethod$WithBonuses;", "Lspay/sdk/api/SPayMethod$WithPartPay;", "Lspay/sdk/api/SPayMethod$WithPhoneNumber;", "Lspay/sdk/api/SPayMethod$WithoutRefresh;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SPayMethod {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lspay/sdk/api/SPayMethod$BindingPayment;", "Lspay/sdk/api/SPayMethod;", "bindingId", "", "(Ljava/lang/String;)V", "getBindingId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class BindingPayment implements SPayMethod {

        @NotNull
        private final String bindingId;

        public BindingPayment(@NotNull String bindingId) {
            Intrinsics.checkNotNullParameter(bindingId, "bindingId");
            this.bindingId = bindingId;
        }

        public static /* synthetic */ BindingPayment copy$default(BindingPayment bindingPayment, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bindingPayment.bindingId;
            }
            return bindingPayment.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getBindingId() {
            return this.bindingId;
        }

        @NotNull
        public final BindingPayment copy(@NotNull String bindingId) {
            Intrinsics.checkNotNullParameter(bindingId, "bindingId");
            return new BindingPayment(bindingId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BindingPayment) && Intrinsics.d(this.bindingId, ((BindingPayment) other).bindingId);
        }

        @NotNull
        public final String getBindingId() {
            return this.bindingId;
        }

        public int hashCode() {
            return this.bindingId.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("BindingPayment(bindingId=", this.bindingId, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/api/SPayMethod$Default;", "Lspay/sdk/api/SPayMethod;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Default implements SPayMethod {

        @NotNull
        public static final Default INSTANCE = new Default();

        private Default() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/api/SPayMethod$WithBankInvoiceId;", "Lspay/sdk/api/SPayMethod;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class WithBankInvoiceId implements SPayMethod {

        @NotNull
        public static final WithBankInvoiceId INSTANCE = new WithBankInvoiceId();

        private WithBankInvoiceId() {
        }
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lspay/sdk/api/SPayMethod$WithBinding;", "Lspay/sdk/api/SPayMethod;", "bindingId", "", "(Ljava/lang/String;)V", "getBindingId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class WithBinding implements SPayMethod {

        @NotNull
        private final String bindingId;

        public WithBinding(@NotNull String bindingId) {
            Intrinsics.checkNotNullParameter(bindingId, "bindingId");
            this.bindingId = bindingId;
        }

        public static /* synthetic */ WithBinding copy$default(WithBinding withBinding, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = withBinding.bindingId;
            }
            return withBinding.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getBindingId() {
            return this.bindingId;
        }

        @NotNull
        public final WithBinding copy(@NotNull String bindingId) {
            Intrinsics.checkNotNullParameter(bindingId, "bindingId");
            return new WithBinding(bindingId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WithBinding) && Intrinsics.d(this.bindingId, ((WithBinding) other).bindingId);
        }

        @NotNull
        public final String getBindingId() {
            return this.bindingId;
        }

        public int hashCode() {
            return this.bindingId.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("WithBinding(bindingId=", this.bindingId, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/api/SPayMethod$WithBonuses;", "Lspay/sdk/api/SPayMethod;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class WithBonuses implements SPayMethod {

        @NotNull
        public static final WithBonuses INSTANCE = new WithBonuses();

        private WithBonuses() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/api/SPayMethod$WithPartPay;", "Lspay/sdk/api/SPayMethod;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class WithPartPay implements SPayMethod {

        @NotNull
        public static final WithPartPay INSTANCE = new WithPartPay();

        private WithPartPay() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lspay/sdk/api/SPayMethod$WithPhoneNumber;", "Lspay/sdk/api/SPayMethod;", "paymentTool", "Lspay/sdk/api/SPaymentTool;", "(Lspay/sdk/api/SPaymentTool;)V", "getPaymentTool", "()Lspay/sdk/api/SPaymentTool;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class WithPhoneNumber implements SPayMethod {

        @NotNull
        private final SPaymentTool paymentTool;

        /* JADX WARN: Multi-variable type inference failed */
        public WithPhoneNumber() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ WithPhoneNumber copy$default(WithPhoneNumber withPhoneNumber, SPaymentTool sPaymentTool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                sPaymentTool = withPhoneNumber.paymentTool;
            }
            return withPhoneNumber.copy(sPaymentTool);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final SPaymentTool getPaymentTool() {
            return this.paymentTool;
        }

        @NotNull
        public final WithPhoneNumber copy(@NotNull SPaymentTool paymentTool) {
            Intrinsics.checkNotNullParameter(paymentTool, "paymentTool");
            return new WithPhoneNumber(paymentTool);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WithPhoneNumber) && this.paymentTool == ((WithPhoneNumber) other).paymentTool;
        }

        @NotNull
        public final SPaymentTool getPaymentTool() {
            return this.paymentTool;
        }

        public int hashCode() {
            return this.paymentTool.hashCode();
        }

        @NotNull
        public String toString() {
            return "WithPhoneNumber(paymentTool=" + this.paymentTool + ")";
        }

        public WithPhoneNumber(@NotNull SPaymentTool paymentTool) {
            Intrinsics.checkNotNullParameter(paymentTool, "paymentTool");
            this.paymentTool = paymentTool;
        }

        public /* synthetic */ WithPhoneNumber(SPaymentTool sPaymentTool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? SPaymentTool.CARDS : sPaymentTool);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lspay/sdk/api/SPayMethod$WithoutRefresh;", "Lspay/sdk/api/SPayMethod;", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class WithoutRefresh implements SPayMethod {

        @NotNull
        public static final WithoutRefresh INSTANCE = new WithoutRefresh();

        private WithoutRefresh() {
        }
    }
}
