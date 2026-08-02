package com.orkestapay.orkestapay.client.model.googlepay;

import Zh.InterfaceC1901b;
import Zh.n;
import bi.f;
import ci.d;
import com.orkestapay.orkestapay.client.enums.PaymentMethodType;
import di.F0;
import di.J;
import di.U0;
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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBQ\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJF\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0019R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010+\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u0019R \u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0006\u00100\u0012\u0004\b2\u0010/\u001a\u0004\b1\u0010\u001cR \u0010\u0007\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0007\u00100\u0012\u0004\b4\u0010/\u001a\u0004\b3\u0010\u001cR \u0010\t\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\t\u00105\u0012\u0004\b7\u0010/\u001a\u0004\b6\u0010\u001f¨\u0006:"}, d2 = {"Lcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodGooglePayDetails;", "Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayPaymentData;", "Lcom/orkestapay/orkestapay/client/enums/PaymentMethodType;", "type", "walletType", "", "apiVersionMinor", "apiVersion", "Lcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodDataGooglePay;", "paymentMethodData", "<init>", "(Lcom/orkestapay/orkestapay/client/enums/PaymentMethodType;Lcom/orkestapay/orkestapay/client/enums/PaymentMethodType;IILcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodDataGooglePay;)V", "seen1", "Ldi/U0;", "serializationConstructorMarker", "(ILcom/orkestapay/orkestapay/client/enums/PaymentMethodType;Lcom/orkestapay/orkestapay/client/enums/PaymentMethodType;IILcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodDataGooglePay;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "write$Self", "(Lcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodGooglePayDetails;Lci/d;Lbi/f;)V", "component1", "()Lcom/orkestapay/orkestapay/client/enums/PaymentMethodType;", "component2", "component3", "()I", "component4", "component5", "()Lcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodDataGooglePay;", "copy", "(Lcom/orkestapay/orkestapay/client/enums/PaymentMethodType;Lcom/orkestapay/orkestapay/client/enums/PaymentMethodType;IILcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodDataGooglePay;)Lcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodGooglePayDetails;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/orkestapay/orkestapay/client/enums/PaymentMethodType;", "getType", "getWalletType", "getWalletType$annotations", "()V", "I", "getApiVersionMinor", "getApiVersionMinor$annotations", "getApiVersion", "getApiVersion$annotations", "Lcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodDataGooglePay;", "getPaymentMethodData", "getPaymentMethodData$annotations", "Companion", "$serializer", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentMethodGooglePayDetails extends GooglePayPaymentData {
    private final int apiVersion;
    private final int apiVersionMinor;

    @NotNull
    private final PaymentMethodDataGooglePay paymentMethodData;

    @Nullable
    private final PaymentMethodType type;

    @Nullable
    private final PaymentMethodType walletType;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    private static final InterfaceC1901b[] $childSerializers = {J.a("com.orkestapay.orkestapay.client.enums.PaymentMethodType", PaymentMethodType.values()), J.a("com.orkestapay.orkestapay.client.enums.PaymentMethodType", PaymentMethodType.values()), null, null, null};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodGooglePayDetails$Companion;", "", "<init>", "()V", "LZh/b;", "Lcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodGooglePayDetails;", "serializer", "()LZh/b;", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return PaymentMethodGooglePayDetails$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ PaymentMethodGooglePayDetails(int i10, PaymentMethodType paymentMethodType, PaymentMethodType paymentMethodType2, int i11, int i12, PaymentMethodDataGooglePay paymentMethodDataGooglePay, U0 u02) {
        super(i10, u02);
        if (28 != (i10 & 28)) {
            F0.a(i10, 28, PaymentMethodGooglePayDetails$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.type = null;
        } else {
            this.type = paymentMethodType;
        }
        if ((i10 & 2) == 0) {
            this.walletType = null;
        } else {
            this.walletType = paymentMethodType2;
        }
        this.apiVersionMinor = i11;
        this.apiVersion = i12;
        this.paymentMethodData = paymentMethodDataGooglePay;
    }

    public static /* synthetic */ PaymentMethodGooglePayDetails copy$default(PaymentMethodGooglePayDetails paymentMethodGooglePayDetails, PaymentMethodType paymentMethodType, PaymentMethodType paymentMethodType2, int i10, int i11, PaymentMethodDataGooglePay paymentMethodDataGooglePay, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            paymentMethodType = paymentMethodGooglePayDetails.type;
        }
        if ((i12 & 2) != 0) {
            paymentMethodType2 = paymentMethodGooglePayDetails.walletType;
        }
        if ((i12 & 4) != 0) {
            i10 = paymentMethodGooglePayDetails.apiVersionMinor;
        }
        if ((i12 & 8) != 0) {
            i11 = paymentMethodGooglePayDetails.apiVersion;
        }
        if ((i12 & 16) != 0) {
            paymentMethodDataGooglePay = paymentMethodGooglePayDetails.paymentMethodData;
        }
        PaymentMethodDataGooglePay paymentMethodDataGooglePay2 = paymentMethodDataGooglePay;
        int i13 = i10;
        return paymentMethodGooglePayDetails.copy(paymentMethodType, paymentMethodType2, i13, i11, paymentMethodDataGooglePay2);
    }

    public static /* synthetic */ void getApiVersion$annotations() {
    }

    public static /* synthetic */ void getApiVersionMinor$annotations() {
    }

    public static /* synthetic */ void getPaymentMethodData$annotations() {
    }

    public static /* synthetic */ void getWalletType$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(PaymentMethodGooglePayDetails self, d output, f serialDesc) {
        GooglePayPaymentData.write$Self(self, output, serialDesc);
        InterfaceC1901b[] interfaceC1901bArr = $childSerializers;
        if (output.m(serialDesc, 0) || self.type != null) {
            output.C(serialDesc, 0, interfaceC1901bArr[0], self.type);
        }
        if (output.m(serialDesc, 1) || self.walletType != null) {
            output.C(serialDesc, 1, interfaceC1901bArr[1], self.walletType);
        }
        output.f(serialDesc, 2, self.getApiVersionMinor());
        output.f(serialDesc, 3, self.getApiVersion());
        output.B(serialDesc, 4, PaymentMethodDataGooglePay$$serializer.INSTANCE, self.getPaymentMethodData());
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final PaymentMethodType getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final PaymentMethodType getWalletType() {
        return this.walletType;
    }

    /* renamed from: component3, reason: from getter */
    public final int getApiVersionMinor() {
        return this.apiVersionMinor;
    }

    /* renamed from: component4, reason: from getter */
    public final int getApiVersion() {
        return this.apiVersion;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final PaymentMethodDataGooglePay getPaymentMethodData() {
        return this.paymentMethodData;
    }

    @NotNull
    public final PaymentMethodGooglePayDetails copy(@Nullable PaymentMethodType type, @Nullable PaymentMethodType walletType, int apiVersionMinor, int apiVersion, @NotNull PaymentMethodDataGooglePay paymentMethodData) {
        Intrinsics.checkNotNullParameter(paymentMethodData, "paymentMethodData");
        return new PaymentMethodGooglePayDetails(type, walletType, apiVersionMinor, apiVersion, paymentMethodData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodGooglePayDetails)) {
            return false;
        }
        PaymentMethodGooglePayDetails paymentMethodGooglePayDetails = (PaymentMethodGooglePayDetails) other;
        return this.type == paymentMethodGooglePayDetails.type && this.walletType == paymentMethodGooglePayDetails.walletType && this.apiVersionMinor == paymentMethodGooglePayDetails.apiVersionMinor && this.apiVersion == paymentMethodGooglePayDetails.apiVersion && Intrinsics.areEqual(this.paymentMethodData, paymentMethodGooglePayDetails.paymentMethodData);
    }

    @Override // com.orkestapay.orkestapay.client.model.googlepay.GooglePayPaymentData
    public int getApiVersion() {
        return this.apiVersion;
    }

    @Override // com.orkestapay.orkestapay.client.model.googlepay.GooglePayPaymentData
    public int getApiVersionMinor() {
        return this.apiVersionMinor;
    }

    @Override // com.orkestapay.orkestapay.client.model.googlepay.GooglePayPaymentData
    @NotNull
    public PaymentMethodDataGooglePay getPaymentMethodData() {
        return this.paymentMethodData;
    }

    @Nullable
    public final PaymentMethodType getType() {
        return this.type;
    }

    @Nullable
    public final PaymentMethodType getWalletType() {
        return this.walletType;
    }

    public int hashCode() {
        PaymentMethodType paymentMethodType = this.type;
        int hashCode = (paymentMethodType == null ? 0 : paymentMethodType.hashCode()) * 31;
        PaymentMethodType paymentMethodType2 = this.walletType;
        return ((((((hashCode + (paymentMethodType2 != null ? paymentMethodType2.hashCode() : 0)) * 31) + Integer.hashCode(this.apiVersionMinor)) * 31) + Integer.hashCode(this.apiVersion)) * 31) + this.paymentMethodData.hashCode();
    }

    @NotNull
    public String toString() {
        return "PaymentMethodGooglePayDetails(type=" + this.type + ", walletType=" + this.walletType + ", apiVersionMinor=" + this.apiVersionMinor + ", apiVersion=" + this.apiVersion + ", paymentMethodData=" + this.paymentMethodData + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ PaymentMethodGooglePayDetails(PaymentMethodType paymentMethodType, PaymentMethodType paymentMethodType2, int i10, int i11, PaymentMethodDataGooglePay paymentMethodDataGooglePay, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentMethodType, r4, r5, r6, r7);
        PaymentMethodDataGooglePay paymentMethodDataGooglePay2;
        int i13;
        int i14;
        PaymentMethodType paymentMethodType3;
        paymentMethodType = (i12 & 1) != 0 ? null : paymentMethodType;
        if ((i12 & 2) != 0) {
            paymentMethodDataGooglePay2 = paymentMethodDataGooglePay;
            i13 = i11;
            i14 = i10;
            paymentMethodType3 = null;
        } else {
            paymentMethodDataGooglePay2 = paymentMethodDataGooglePay;
            i13 = i11;
            i14 = i10;
            paymentMethodType3 = paymentMethodType2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodGooglePayDetails(@Nullable PaymentMethodType paymentMethodType, @Nullable PaymentMethodType paymentMethodType2, int i10, int i11, @NotNull PaymentMethodDataGooglePay paymentMethodData) {
        super(null);
        Intrinsics.checkNotNullParameter(paymentMethodData, "paymentMethodData");
        this.type = paymentMethodType;
        this.walletType = paymentMethodType2;
        this.apiVersionMinor = i10;
        this.apiVersion = i11;
        this.paymentMethodData = paymentMethodData;
    }
}
