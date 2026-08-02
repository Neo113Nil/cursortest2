package com.orkestapay.orkestapay.client.model.googlepay;

import Zh.InterfaceC1901b;
import Zh.n;
import bi.f;
import ci.d;
import di.F0;
import di.U0;
import ei.y;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@n
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBE\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0019R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001e¨\u00063"}, d2 = {"Lcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodDataGooglePay;", "", "", "description", "type", "Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayPaymentMethodDataTokenizationData;", "tokenizationData", "Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayPaymentMethodDataInfo;", "info", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayPaymentMethodDataTokenizationData;Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayPaymentMethodDataInfo;)V", "", "seen1", "Ldi/U0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayPaymentMethodDataTokenizationData;Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayPaymentMethodDataInfo;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "write$Self", "(Lcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodDataGooglePay;Lci/d;Lbi/f;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayPaymentMethodDataTokenizationData;", "component4", "()Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayPaymentMethodDataInfo;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayPaymentMethodDataTokenizationData;Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayPaymentMethodDataInfo;)Lcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodDataGooglePay;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDescription", "getType", "Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayPaymentMethodDataTokenizationData;", "getTokenizationData", "getTokenizationData$annotations", "()V", "Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayPaymentMethodDataInfo;", "getInfo", "Companion", "$serializer", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentMethodDataGooglePay {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String description;

    @NotNull
    private final GooglePayPaymentMethodDataInfo info;

    @NotNull
    private final GooglePayPaymentMethodDataTokenizationData tokenizationData;

    @NotNull
    private final String type;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodDataGooglePay$Companion;", "", "<init>", "()V", "LZh/b;", "Lcom/orkestapay/orkestapay/client/model/googlepay/PaymentMethodDataGooglePay;", "serializer", "()LZh/b;", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return PaymentMethodDataGooglePay$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ PaymentMethodDataGooglePay(int i10, String str, String str2, @y(names = {"tokenizationData"}) GooglePayPaymentMethodDataTokenizationData googlePayPaymentMethodDataTokenizationData, GooglePayPaymentMethodDataInfo googlePayPaymentMethodDataInfo, U0 u02) {
        if (15 != (i10 & 15)) {
            F0.a(i10, 15, PaymentMethodDataGooglePay$$serializer.INSTANCE.getDescriptor());
        }
        this.description = str;
        this.type = str2;
        this.tokenizationData = googlePayPaymentMethodDataTokenizationData;
        this.info = googlePayPaymentMethodDataInfo;
    }

    public static /* synthetic */ PaymentMethodDataGooglePay copy$default(PaymentMethodDataGooglePay paymentMethodDataGooglePay, String str, String str2, GooglePayPaymentMethodDataTokenizationData googlePayPaymentMethodDataTokenizationData, GooglePayPaymentMethodDataInfo googlePayPaymentMethodDataInfo, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = paymentMethodDataGooglePay.description;
        }
        if ((i10 & 2) != 0) {
            str2 = paymentMethodDataGooglePay.type;
        }
        if ((i10 & 4) != 0) {
            googlePayPaymentMethodDataTokenizationData = paymentMethodDataGooglePay.tokenizationData;
        }
        if ((i10 & 8) != 0) {
            googlePayPaymentMethodDataInfo = paymentMethodDataGooglePay.info;
        }
        return paymentMethodDataGooglePay.copy(str, str2, googlePayPaymentMethodDataTokenizationData, googlePayPaymentMethodDataInfo);
    }

    @y(names = {"tokenizationData"})
    public static /* synthetic */ void getTokenizationData$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(PaymentMethodDataGooglePay self, d output, f serialDesc) {
        output.G(serialDesc, 0, self.description);
        output.G(serialDesc, 1, self.type);
        output.B(serialDesc, 2, GooglePayPaymentMethodDataTokenizationData$$serializer.INSTANCE, self.tokenizationData);
        output.B(serialDesc, 3, GooglePayPaymentMethodDataInfo$$serializer.INSTANCE, self.info);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final GooglePayPaymentMethodDataTokenizationData getTokenizationData() {
        return this.tokenizationData;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final GooglePayPaymentMethodDataInfo getInfo() {
        return this.info;
    }

    @NotNull
    public final PaymentMethodDataGooglePay copy(@NotNull String description, @NotNull String type, @NotNull GooglePayPaymentMethodDataTokenizationData tokenizationData, @NotNull GooglePayPaymentMethodDataInfo info) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(tokenizationData, "tokenizationData");
        Intrinsics.checkNotNullParameter(info, "info");
        return new PaymentMethodDataGooglePay(description, type, tokenizationData, info);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodDataGooglePay)) {
            return false;
        }
        PaymentMethodDataGooglePay paymentMethodDataGooglePay = (PaymentMethodDataGooglePay) other;
        return Intrinsics.areEqual(this.description, paymentMethodDataGooglePay.description) && Intrinsics.areEqual(this.type, paymentMethodDataGooglePay.type) && Intrinsics.areEqual(this.tokenizationData, paymentMethodDataGooglePay.tokenizationData) && Intrinsics.areEqual(this.info, paymentMethodDataGooglePay.info);
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final GooglePayPaymentMethodDataInfo getInfo() {
        return this.info;
    }

    @NotNull
    public final GooglePayPaymentMethodDataTokenizationData getTokenizationData() {
        return this.tokenizationData;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.description.hashCode() * 31) + this.type.hashCode()) * 31) + this.tokenizationData.hashCode()) * 31) + this.info.hashCode();
    }

    @NotNull
    public String toString() {
        return "PaymentMethodDataGooglePay(description=" + this.description + ", type=" + this.type + ", tokenizationData=" + this.tokenizationData + ", info=" + this.info + ')';
    }

    public PaymentMethodDataGooglePay(@NotNull String description, @NotNull String type, @NotNull GooglePayPaymentMethodDataTokenizationData tokenizationData, @NotNull GooglePayPaymentMethodDataInfo info) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(tokenizationData, "tokenizationData");
        Intrinsics.checkNotNullParameter(info, "info");
        this.description = description;
        this.type = type;
        this.tokenizationData = tokenizationData;
        this.info = info;
    }
}
