package com.orkestapay.orkestapay.client.model.googlepay;

import Zh.InterfaceC1901b;
import Zh.n;
import bi.f;
import ci.d;
import com.orkestapay.orkestapay.client.enums.PaymentMethodType;
import com.orkestapay.orkestapay.client.model.BillingAddress;
import com.orkestapay.orkestapay.client.model.BillingAddress$$serializer;
import di.F0;
import di.J;
import di.U0;
import di.Z0;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@n
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBS\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"JH\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001dR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00102\u0012\u0004\b4\u0010/\u001a\u0004\b3\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b5\u0010\u001fR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00106\u0012\u0004\b8\u0010/\u001a\u0004\b7\u0010\"¨\u0006;"}, d2 = {"Lcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodGooglePay;", "", "Lcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodGooglePayDetails;", "googlePay", "Lcom/orkestapay/orkestapay/client/enums/PaymentMethodType;", "type", "", "customerId", "alias", "Lcom/orkestapay/orkestapay/client/model/BillingAddress;", "billingAddress", "<init>", "(Lcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodGooglePayDetails;Lcom/orkestapay/orkestapay/client/enums/PaymentMethodType;Ljava/lang/String;Ljava/lang/String;Lcom/orkestapay/orkestapay/client/model/BillingAddress;)V", "", "seen1", "Ldi/U0;", "serializationConstructorMarker", "(ILcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodGooglePayDetails;Lcom/orkestapay/orkestapay/client/enums/PaymentMethodType;Ljava/lang/String;Ljava/lang/String;Lcom/orkestapay/orkestapay/client/model/BillingAddress;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "write$Self", "(Lcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodGooglePay;Lci/d;Lbi/f;)V", "component1", "()Lcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodGooglePayDetails;", "component2", "()Lcom/orkestapay/orkestapay/client/enums/PaymentMethodType;", "component3", "()Ljava/lang/String;", "component4", "component5", "()Lcom/orkestapay/orkestapay/client/model/BillingAddress;", "copy", "(Lcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodGooglePayDetails;Lcom/orkestapay/orkestapay/client/enums/PaymentMethodType;Ljava/lang/String;Ljava/lang/String;Lcom/orkestapay/orkestapay/client/model/BillingAddress;)Lcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodGooglePay;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodGooglePayDetails;", "getGooglePay", "getGooglePay$annotations", "()V", "Lcom/orkestapay/orkestapay/client/enums/PaymentMethodType;", "getType", "Ljava/lang/String;", "getCustomerId", "getCustomerId$annotations", "getAlias", "Lcom/orkestapay/orkestapay/client/model/BillingAddress;", "getBillingAddress", "getBillingAddress$annotations", "Companion", "$serializer", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentMethodGooglePay {

    @Nullable
    private final String alias;

    @Nullable
    private final BillingAddress billingAddress;

    @Nullable
    private final String customerId;

    @NotNull
    private final PaymentMethodGooglePayDetails googlePay;

    @NotNull
    private final PaymentMethodType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    private static final InterfaceC1901b[] $childSerializers = {null, J.a("com.orkestapay.orkestapay.client.enums.PaymentMethodType", PaymentMethodType.values()), null, null, null};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodGooglePay$Companion;", "", "<init>", "()V", "LZh/b;", "Lcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodGooglePay;", "serializer", "()LZh/b;", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return PaymentMethodGooglePay$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ PaymentMethodGooglePay(int i10, PaymentMethodGooglePayDetails paymentMethodGooglePayDetails, PaymentMethodType paymentMethodType, String str, String str2, BillingAddress billingAddress, U0 u02) {
        if (3 != (i10 & 3)) {
            F0.a(i10, 3, PaymentMethodGooglePay$$serializer.INSTANCE.getDescriptor());
        }
        this.googlePay = paymentMethodGooglePayDetails;
        this.type = paymentMethodType;
        if ((i10 & 4) == 0) {
            this.customerId = null;
        } else {
            this.customerId = str;
        }
        if ((i10 & 8) == 0) {
            this.alias = null;
        } else {
            this.alias = str2;
        }
        if ((i10 & 16) == 0) {
            this.billingAddress = null;
        } else {
            this.billingAddress = billingAddress;
        }
    }

    public static /* synthetic */ PaymentMethodGooglePay copy$default(PaymentMethodGooglePay paymentMethodGooglePay, PaymentMethodGooglePayDetails paymentMethodGooglePayDetails, PaymentMethodType paymentMethodType, String str, String str2, BillingAddress billingAddress, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            paymentMethodGooglePayDetails = paymentMethodGooglePay.googlePay;
        }
        if ((i10 & 2) != 0) {
            paymentMethodType = paymentMethodGooglePay.type;
        }
        if ((i10 & 4) != 0) {
            str = paymentMethodGooglePay.customerId;
        }
        if ((i10 & 8) != 0) {
            str2 = paymentMethodGooglePay.alias;
        }
        if ((i10 & 16) != 0) {
            billingAddress = paymentMethodGooglePay.billingAddress;
        }
        BillingAddress billingAddress2 = billingAddress;
        String str3 = str;
        return paymentMethodGooglePay.copy(paymentMethodGooglePayDetails, paymentMethodType, str3, str2, billingAddress2);
    }

    public static /* synthetic */ void getBillingAddress$annotations() {
    }

    public static /* synthetic */ void getCustomerId$annotations() {
    }

    public static /* synthetic */ void getGooglePay$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(PaymentMethodGooglePay self, d output, f serialDesc) {
        InterfaceC1901b[] interfaceC1901bArr = $childSerializers;
        output.B(serialDesc, 0, PaymentMethodGooglePayDetails$$serializer.INSTANCE, self.googlePay);
        output.B(serialDesc, 1, interfaceC1901bArr[1], self.type);
        if (output.m(serialDesc, 2) || self.customerId != null) {
            output.C(serialDesc, 2, Z0.f45341a, self.customerId);
        }
        if (output.m(serialDesc, 3) || self.alias != null) {
            output.C(serialDesc, 3, Z0.f45341a, self.alias);
        }
        if (!output.m(serialDesc, 4) && self.billingAddress == null) {
            return;
        }
        output.C(serialDesc, 4, BillingAddress$$serializer.INSTANCE, self.billingAddress);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final PaymentMethodGooglePayDetails getGooglePay() {
        return this.googlePay;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final PaymentMethodType getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getAlias() {
        return this.alias;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final BillingAddress getBillingAddress() {
        return this.billingAddress;
    }

    @NotNull
    public final PaymentMethodGooglePay copy(@NotNull PaymentMethodGooglePayDetails googlePay, @NotNull PaymentMethodType type, @Nullable String customerId, @Nullable String alias, @Nullable BillingAddress billingAddress) {
        Intrinsics.checkNotNullParameter(googlePay, "googlePay");
        Intrinsics.checkNotNullParameter(type, "type");
        return new PaymentMethodGooglePay(googlePay, type, customerId, alias, billingAddress);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodGooglePay)) {
            return false;
        }
        PaymentMethodGooglePay paymentMethodGooglePay = (PaymentMethodGooglePay) other;
        return Intrinsics.areEqual(this.googlePay, paymentMethodGooglePay.googlePay) && this.type == paymentMethodGooglePay.type && Intrinsics.areEqual(this.customerId, paymentMethodGooglePay.customerId) && Intrinsics.areEqual(this.alias, paymentMethodGooglePay.alias) && Intrinsics.areEqual(this.billingAddress, paymentMethodGooglePay.billingAddress);
    }

    @Nullable
    public final String getAlias() {
        return this.alias;
    }

    @Nullable
    public final BillingAddress getBillingAddress() {
        return this.billingAddress;
    }

    @Nullable
    public final String getCustomerId() {
        return this.customerId;
    }

    @NotNull
    public final PaymentMethodGooglePayDetails getGooglePay() {
        return this.googlePay;
    }

    @NotNull
    public final PaymentMethodType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((this.googlePay.hashCode() * 31) + this.type.hashCode()) * 31;
        String str = this.customerId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.alias;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BillingAddress billingAddress = this.billingAddress;
        return hashCode3 + (billingAddress != null ? billingAddress.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PaymentMethodGooglePay(googlePay=" + this.googlePay + ", type=" + this.type + ", customerId=" + this.customerId + ", alias=" + this.alias + ", billingAddress=" + this.billingAddress + ')';
    }

    public PaymentMethodGooglePay(@NotNull PaymentMethodGooglePayDetails googlePay, @NotNull PaymentMethodType type, @Nullable String str, @Nullable String str2, @Nullable BillingAddress billingAddress) {
        Intrinsics.checkNotNullParameter(googlePay, "googlePay");
        Intrinsics.checkNotNullParameter(type, "type");
        this.googlePay = googlePay;
        this.type = type;
        this.customerId = str;
        this.alias = str2;
        this.billingAddress = billingAddress;
    }

    public /* synthetic */ PaymentMethodGooglePay(PaymentMethodGooglePayDetails paymentMethodGooglePayDetails, PaymentMethodType paymentMethodType, String str, String str2, BillingAddress billingAddress, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentMethodGooglePayDetails, paymentMethodType, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : billingAddress);
    }
}
