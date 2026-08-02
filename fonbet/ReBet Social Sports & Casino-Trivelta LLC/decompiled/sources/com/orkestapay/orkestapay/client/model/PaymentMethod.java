package com.orkestapay.orkestapay.client.model;

import Zh.InterfaceC1901b;
import Zh.n;
import bi.f;
import ci.d;
import com.orkestapay.orkestapay.client.enums.PaymentMethodType;
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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB]\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÇ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$JT\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001cJ\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010.\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u001cR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b4\u00102\u001a\u0004\b3\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u0010\"R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00109\u0012\u0004\b;\u00102\u001a\u0004\b:\u0010$¨\u0006>"}, d2 = {"Lcom/orkestapay/orkestapay/client/model/PaymentMethod;", "", "", "alias", "customerId", "deviceSessionId", "Lcom/orkestapay/orkestapay/client/enums/PaymentMethodType;", "type", "Lcom/orkestapay/orkestapay/client/model/Card;", "card", "Lcom/orkestapay/orkestapay/client/model/BillingAddress;", "billingAddress", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/orkestapay/orkestapay/client/enums/PaymentMethodType;Lcom/orkestapay/orkestapay/client/model/Card;Lcom/orkestapay/orkestapay/client/model/BillingAddress;)V", "", "seen1", "Ldi/U0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/orkestapay/orkestapay/client/enums/PaymentMethodType;Lcom/orkestapay/orkestapay/client/model/Card;Lcom/orkestapay/orkestapay/client/model/BillingAddress;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "write$Self", "(Lcom/orkestapay/orkestapay/client/model/PaymentMethod;Lci/d;Lbi/f;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/orkestapay/orkestapay/client/enums/PaymentMethodType;", "component5", "()Lcom/orkestapay/orkestapay/client/model/Card;", "component6", "()Lcom/orkestapay/orkestapay/client/model/BillingAddress;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/orkestapay/orkestapay/client/enums/PaymentMethodType;Lcom/orkestapay/orkestapay/client/model/Card;Lcom/orkestapay/orkestapay/client/model/BillingAddress;)Lcom/orkestapay/orkestapay/client/model/PaymentMethod;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAlias", "getCustomerId", "getCustomerId$annotations", "()V", "getDeviceSessionId", "getDeviceSessionId$annotations", "Lcom/orkestapay/orkestapay/client/enums/PaymentMethodType;", "getType", "Lcom/orkestapay/orkestapay/client/model/Card;", "getCard", "Lcom/orkestapay/orkestapay/client/model/BillingAddress;", "getBillingAddress", "getBillingAddress$annotations", "Companion", "$serializer", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentMethod {

    @Nullable
    private final String alias;

    @Nullable
    private final BillingAddress billingAddress;

    @NotNull
    private final Card card;

    @Nullable
    private final String customerId;

    @Nullable
    private final String deviceSessionId;

    @NotNull
    private final PaymentMethodType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    private static final InterfaceC1901b[] $childSerializers = {null, null, null, J.a("com.orkestapay.orkestapay.client.enums.PaymentMethodType", PaymentMethodType.values()), null, null};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/orkestapay/orkestapay/client/model/PaymentMethod$Companion;", "", "<init>", "()V", "LZh/b;", "Lcom/orkestapay/orkestapay/client/model/PaymentMethod;", "serializer", "()LZh/b;", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return PaymentMethod$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ PaymentMethod(int i10, String str, String str2, String str3, PaymentMethodType paymentMethodType, Card card, BillingAddress billingAddress, U0 u02) {
        if (31 != (i10 & 31)) {
            F0.a(i10, 31, PaymentMethod$$serializer.INSTANCE.getDescriptor());
        }
        this.alias = str;
        this.customerId = str2;
        this.deviceSessionId = str3;
        this.type = paymentMethodType;
        this.card = card;
        if ((i10 & 32) == 0) {
            this.billingAddress = null;
        } else {
            this.billingAddress = billingAddress;
        }
    }

    public static /* synthetic */ PaymentMethod copy$default(PaymentMethod paymentMethod, String str, String str2, String str3, PaymentMethodType paymentMethodType, Card card, BillingAddress billingAddress, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = paymentMethod.alias;
        }
        if ((i10 & 2) != 0) {
            str2 = paymentMethod.customerId;
        }
        if ((i10 & 4) != 0) {
            str3 = paymentMethod.deviceSessionId;
        }
        if ((i10 & 8) != 0) {
            paymentMethodType = paymentMethod.type;
        }
        if ((i10 & 16) != 0) {
            card = paymentMethod.card;
        }
        if ((i10 & 32) != 0) {
            billingAddress = paymentMethod.billingAddress;
        }
        Card card2 = card;
        BillingAddress billingAddress2 = billingAddress;
        return paymentMethod.copy(str, str2, str3, paymentMethodType, card2, billingAddress2);
    }

    public static /* synthetic */ void getBillingAddress$annotations() {
    }

    public static /* synthetic */ void getCustomerId$annotations() {
    }

    public static /* synthetic */ void getDeviceSessionId$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(PaymentMethod self, d output, f serialDesc) {
        InterfaceC1901b[] interfaceC1901bArr = $childSerializers;
        Z0 z02 = Z0.f45341a;
        output.C(serialDesc, 0, z02, self.alias);
        output.C(serialDesc, 1, z02, self.customerId);
        output.C(serialDesc, 2, z02, self.deviceSessionId);
        output.B(serialDesc, 3, interfaceC1901bArr[3], self.type);
        output.B(serialDesc, 4, Card$$serializer.INSTANCE, self.card);
        if (!output.m(serialDesc, 5) && self.billingAddress == null) {
            return;
        }
        output.C(serialDesc, 5, BillingAddress$$serializer.INSTANCE, self.billingAddress);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getAlias() {
        return this.alias;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getDeviceSessionId() {
        return this.deviceSessionId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final PaymentMethodType getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final Card getCard() {
        return this.card;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final BillingAddress getBillingAddress() {
        return this.billingAddress;
    }

    @NotNull
    public final PaymentMethod copy(@Nullable String alias, @Nullable String customerId, @Nullable String deviceSessionId, @NotNull PaymentMethodType type, @NotNull Card card, @Nullable BillingAddress billingAddress) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(card, "card");
        return new PaymentMethod(alias, customerId, deviceSessionId, type, card, billingAddress);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethod)) {
            return false;
        }
        PaymentMethod paymentMethod = (PaymentMethod) other;
        return Intrinsics.areEqual(this.alias, paymentMethod.alias) && Intrinsics.areEqual(this.customerId, paymentMethod.customerId) && Intrinsics.areEqual(this.deviceSessionId, paymentMethod.deviceSessionId) && this.type == paymentMethod.type && Intrinsics.areEqual(this.card, paymentMethod.card) && Intrinsics.areEqual(this.billingAddress, paymentMethod.billingAddress);
    }

    @Nullable
    public final String getAlias() {
        return this.alias;
    }

    @Nullable
    public final BillingAddress getBillingAddress() {
        return this.billingAddress;
    }

    @NotNull
    public final Card getCard() {
        return this.card;
    }

    @Nullable
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    public final String getDeviceSessionId() {
        return this.deviceSessionId;
    }

    @NotNull
    public final PaymentMethodType getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.alias;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.customerId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deviceSessionId;
        int hashCode3 = (((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.type.hashCode()) * 31) + this.card.hashCode()) * 31;
        BillingAddress billingAddress = this.billingAddress;
        return hashCode3 + (billingAddress != null ? billingAddress.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PaymentMethod(alias=" + this.alias + ", customerId=" + this.customerId + ", deviceSessionId=" + this.deviceSessionId + ", type=" + this.type + ", card=" + this.card + ", billingAddress=" + this.billingAddress + ')';
    }

    public PaymentMethod(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull PaymentMethodType type, @NotNull Card card, @Nullable BillingAddress billingAddress) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(card, "card");
        this.alias = str;
        this.customerId = str2;
        this.deviceSessionId = str3;
        this.type = type;
        this.card = card;
        this.billingAddress = billingAddress;
    }

    public /* synthetic */ PaymentMethod(String str, String str2, String str3, PaymentMethodType paymentMethodType, Card card, BillingAddress billingAddress, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, paymentMethodType, card, (i10 & 32) != 0 ? null : billingAddress);
    }
}
