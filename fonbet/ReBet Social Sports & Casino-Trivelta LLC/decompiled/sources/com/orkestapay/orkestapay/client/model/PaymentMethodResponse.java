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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBQ\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"JF\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001bJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b0\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010 R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00105\u0012\u0004\b7\u0010/\u001a\u0004\b6\u0010\"¨\u0006:"}, d2 = {"Lcom/orkestapay/orkestapay/client/model/PaymentMethodResponse;", "", "", "paymentMethodId", "alias", "Lcom/orkestapay/orkestapay/client/enums/PaymentMethodType;", "type", "Lcom/orkestapay/orkestapay/client/model/CardResponse;", "card", "Lcom/orkestapay/orkestapay/client/model/PaymentOption;", "paymentOption", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/orkestapay/orkestapay/client/enums/PaymentMethodType;Lcom/orkestapay/orkestapay/client/model/CardResponse;Lcom/orkestapay/orkestapay/client/model/PaymentOption;)V", "", "seen1", "Ldi/U0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/orkestapay/orkestapay/client/enums/PaymentMethodType;Lcom/orkestapay/orkestapay/client/model/CardResponse;Lcom/orkestapay/orkestapay/client/model/PaymentOption;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "write$Self", "(Lcom/orkestapay/orkestapay/client/model/PaymentMethodResponse;Lci/d;Lbi/f;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/orkestapay/orkestapay/client/enums/PaymentMethodType;", "component4", "()Lcom/orkestapay/orkestapay/client/model/CardResponse;", "component5", "()Lcom/orkestapay/orkestapay/client/model/PaymentOption;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/orkestapay/orkestapay/client/enums/PaymentMethodType;Lcom/orkestapay/orkestapay/client/model/CardResponse;Lcom/orkestapay/orkestapay/client/model/PaymentOption;)Lcom/orkestapay/orkestapay/client/model/PaymentMethodResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPaymentMethodId", "getPaymentMethodId$annotations", "()V", "getAlias", "Lcom/orkestapay/orkestapay/client/enums/PaymentMethodType;", "getType", "Lcom/orkestapay/orkestapay/client/model/CardResponse;", "getCard", "Lcom/orkestapay/orkestapay/client/model/PaymentOption;", "getPaymentOption", "getPaymentOption$annotations", "Companion", "$serializer", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentMethodResponse {

    @Nullable
    private final String alias;

    @NotNull
    private final CardResponse card;

    @NotNull
    private final String paymentMethodId;

    @Nullable
    private final PaymentOption paymentOption;

    @NotNull
    private final PaymentMethodType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    private static final InterfaceC1901b[] $childSerializers = {null, null, J.a("com.orkestapay.orkestapay.client.enums.PaymentMethodType", PaymentMethodType.values()), null, null};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/orkestapay/orkestapay/client/model/PaymentMethodResponse$Companion;", "", "<init>", "()V", "LZh/b;", "Lcom/orkestapay/orkestapay/client/model/PaymentMethodResponse;", "serializer", "()LZh/b;", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return PaymentMethodResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ PaymentMethodResponse(int i10, String str, String str2, PaymentMethodType paymentMethodType, CardResponse cardResponse, PaymentOption paymentOption, U0 u02) {
        if (13 != (i10 & 13)) {
            F0.a(i10, 13, PaymentMethodResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.paymentMethodId = str;
        if ((i10 & 2) == 0) {
            this.alias = null;
        } else {
            this.alias = str2;
        }
        this.type = paymentMethodType;
        this.card = cardResponse;
        if ((i10 & 16) == 0) {
            this.paymentOption = null;
        } else {
            this.paymentOption = paymentOption;
        }
    }

    public static /* synthetic */ PaymentMethodResponse copy$default(PaymentMethodResponse paymentMethodResponse, String str, String str2, PaymentMethodType paymentMethodType, CardResponse cardResponse, PaymentOption paymentOption, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = paymentMethodResponse.paymentMethodId;
        }
        if ((i10 & 2) != 0) {
            str2 = paymentMethodResponse.alias;
        }
        if ((i10 & 4) != 0) {
            paymentMethodType = paymentMethodResponse.type;
        }
        if ((i10 & 8) != 0) {
            cardResponse = paymentMethodResponse.card;
        }
        if ((i10 & 16) != 0) {
            paymentOption = paymentMethodResponse.paymentOption;
        }
        PaymentOption paymentOption2 = paymentOption;
        PaymentMethodType paymentMethodType2 = paymentMethodType;
        return paymentMethodResponse.copy(str, str2, paymentMethodType2, cardResponse, paymentOption2);
    }

    public static /* synthetic */ void getPaymentMethodId$annotations() {
    }

    public static /* synthetic */ void getPaymentOption$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(PaymentMethodResponse self, d output, f serialDesc) {
        InterfaceC1901b[] interfaceC1901bArr = $childSerializers;
        output.G(serialDesc, 0, self.paymentMethodId);
        if (output.m(serialDesc, 1) || self.alias != null) {
            output.C(serialDesc, 1, Z0.f45341a, self.alias);
        }
        output.B(serialDesc, 2, interfaceC1901bArr[2], self.type);
        output.B(serialDesc, 3, CardResponse$$serializer.INSTANCE, self.card);
        if (!output.m(serialDesc, 4) && self.paymentOption == null) {
            return;
        }
        output.C(serialDesc, 4, PaymentOption$$serializer.INSTANCE, self.paymentOption);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getAlias() {
        return this.alias;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final PaymentMethodType getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final CardResponse getCard() {
        return this.card;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final PaymentOption getPaymentOption() {
        return this.paymentOption;
    }

    @NotNull
    public final PaymentMethodResponse copy(@NotNull String paymentMethodId, @Nullable String alias, @NotNull PaymentMethodType type, @NotNull CardResponse card, @Nullable PaymentOption paymentOption) {
        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(card, "card");
        return new PaymentMethodResponse(paymentMethodId, alias, type, card, paymentOption);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodResponse)) {
            return false;
        }
        PaymentMethodResponse paymentMethodResponse = (PaymentMethodResponse) other;
        return Intrinsics.areEqual(this.paymentMethodId, paymentMethodResponse.paymentMethodId) && Intrinsics.areEqual(this.alias, paymentMethodResponse.alias) && this.type == paymentMethodResponse.type && Intrinsics.areEqual(this.card, paymentMethodResponse.card) && Intrinsics.areEqual(this.paymentOption, paymentMethodResponse.paymentOption);
    }

    @Nullable
    public final String getAlias() {
        return this.alias;
    }

    @NotNull
    public final CardResponse getCard() {
        return this.card;
    }

    @NotNull
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    @Nullable
    public final PaymentOption getPaymentOption() {
        return this.paymentOption;
    }

    @NotNull
    public final PaymentMethodType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.paymentMethodId.hashCode() * 31;
        String str = this.alias;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.type.hashCode()) * 31) + this.card.hashCode()) * 31;
        PaymentOption paymentOption = this.paymentOption;
        return hashCode2 + (paymentOption != null ? paymentOption.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PaymentMethodResponse(paymentMethodId=" + this.paymentMethodId + ", alias=" + this.alias + ", type=" + this.type + ", card=" + this.card + ", paymentOption=" + this.paymentOption + ')';
    }

    public PaymentMethodResponse(@NotNull String paymentMethodId, @Nullable String str, @NotNull PaymentMethodType type, @NotNull CardResponse card, @Nullable PaymentOption paymentOption) {
        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(card, "card");
        this.paymentMethodId = paymentMethodId;
        this.alias = str;
        this.type = type;
        this.card = card;
        this.paymentOption = paymentOption;
    }

    public /* synthetic */ PaymentMethodResponse(String str, String str2, PaymentMethodType paymentMethodType, CardResponse cardResponse, PaymentOption paymentOption, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, paymentMethodType, cardResponse, (i10 & 16) != 0 ? null : paymentOption);
    }
}
