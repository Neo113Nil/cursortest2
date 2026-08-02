package com.orkestapay.orkestapay.client.model;

import Zh.InterfaceC1901b;
import Zh.n;
import bi.f;
import ci.d;
import com.twilio.voice.EventKeys;
import di.F0;
import di.U0;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B=\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b&\u0010\u0016R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010\u0016¨\u0006+"}, d2 = {"Lcom/orkestapay/orkestapay/client/model/PaymentMethodProperties;", "", "", "merchantId", EventKeys.GATEWAY, "merchantName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Ldi/U0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "write$Self", "(Lcom/orkestapay/orkestapay/client/model/PaymentMethodProperties;Lci/d;Lbi/f;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/orkestapay/orkestapay/client/model/PaymentMethodProperties;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMerchantId", "getMerchantId$annotations", "()V", "getGateway", "getMerchantName", "getMerchantName$annotations", "Companion", "$serializer", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentMethodProperties {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String gateway;

    @NotNull
    private final String merchantId;

    @NotNull
    private final String merchantName;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/orkestapay/orkestapay/client/model/PaymentMethodProperties$Companion;", "", "<init>", "()V", "LZh/b;", "Lcom/orkestapay/orkestapay/client/model/PaymentMethodProperties;", "serializer", "()LZh/b;", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return PaymentMethodProperties$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ PaymentMethodProperties(int i10, String str, String str2, String str3, U0 u02) {
        if (7 != (i10 & 7)) {
            F0.a(i10, 7, PaymentMethodProperties$$serializer.INSTANCE.getDescriptor());
        }
        this.merchantId = str;
        this.gateway = str2;
        this.merchantName = str3;
    }

    public static /* synthetic */ PaymentMethodProperties copy$default(PaymentMethodProperties paymentMethodProperties, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = paymentMethodProperties.merchantId;
        }
        if ((i10 & 2) != 0) {
            str2 = paymentMethodProperties.gateway;
        }
        if ((i10 & 4) != 0) {
            str3 = paymentMethodProperties.merchantName;
        }
        return paymentMethodProperties.copy(str, str2, str3);
    }

    public static /* synthetic */ void getMerchantId$annotations() {
    }

    public static /* synthetic */ void getMerchantName$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(PaymentMethodProperties self, d output, f serialDesc) {
        output.G(serialDesc, 0, self.merchantId);
        output.G(serialDesc, 1, self.gateway);
        output.G(serialDesc, 2, self.merchantName);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getMerchantId() {
        return this.merchantId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getGateway() {
        return this.gateway;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getMerchantName() {
        return this.merchantName;
    }

    @NotNull
    public final PaymentMethodProperties copy(@NotNull String merchantId, @NotNull String gateway, @NotNull String merchantName) {
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        Intrinsics.checkNotNullParameter(gateway, "gateway");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        return new PaymentMethodProperties(merchantId, gateway, merchantName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodProperties)) {
            return false;
        }
        PaymentMethodProperties paymentMethodProperties = (PaymentMethodProperties) other;
        return Intrinsics.areEqual(this.merchantId, paymentMethodProperties.merchantId) && Intrinsics.areEqual(this.gateway, paymentMethodProperties.gateway) && Intrinsics.areEqual(this.merchantName, paymentMethodProperties.merchantName);
    }

    @NotNull
    public final String getGateway() {
        return this.gateway;
    }

    @NotNull
    public final String getMerchantId() {
        return this.merchantId;
    }

    @NotNull
    public final String getMerchantName() {
        return this.merchantName;
    }

    public int hashCode() {
        return (((this.merchantId.hashCode() * 31) + this.gateway.hashCode()) * 31) + this.merchantName.hashCode();
    }

    @NotNull
    public String toString() {
        return "PaymentMethodProperties(merchantId=" + this.merchantId + ", gateway=" + this.gateway + ", merchantName=" + this.merchantName + ')';
    }

    public PaymentMethodProperties(@NotNull String merchantId, @NotNull String gateway, @NotNull String merchantName) {
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        Intrinsics.checkNotNullParameter(gateway, "gateway");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        this.merchantId = merchantId;
        this.gateway = gateway;
        this.merchantName = merchantName;
    }
}
