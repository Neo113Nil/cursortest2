package com.orkestapay.orkestapay.client.model;

import Zh.InterfaceC1901b;
import Zh.n;
import bi.f;
import ci.d;
import di.F0;
import di.U0;
import di.Y;
import di.Z0;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bB[\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019JT\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0019J\u0010\u0010#\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010)\u0012\u0004\b.\u0010,\u001a\u0004\b-\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b/\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b2\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b3\u0010\u0019¨\u00066"}, d2 = {"Lcom/orkestapay/orkestapay/client/model/PaymentOption;", "", "", "promotionId", "promotionName", "type", "", "installments", "issuerId", "issuerName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Ldi/U0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "write$Self", "(Lcom/orkestapay/orkestapay/client/model/PaymentOption;Lci/d;Lbi/f;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Integer;", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/orkestapay/orkestapay/client/model/PaymentOption;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPromotionId", "getPromotionId$annotations", "()V", "getPromotionName", "getPromotionName$annotations", "getType", "Ljava/lang/Integer;", "getInstallments", "getIssuerId", "getIssuerName", "Companion", "$serializer", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentOption {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer installments;

    @Nullable
    private final String issuerId;

    @Nullable
    private final String issuerName;

    @NotNull
    private final String promotionId;

    @NotNull
    private final String promotionName;

    @Nullable
    private final String type;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/orkestapay/orkestapay/client/model/PaymentOption$Companion;", "", "<init>", "()V", "LZh/b;", "Lcom/orkestapay/orkestapay/client/model/PaymentOption;", "serializer", "()LZh/b;", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return PaymentOption$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ PaymentOption(int i10, String str, String str2, String str3, Integer num, String str4, String str5, U0 u02) {
        if (3 != (i10 & 3)) {
            F0.a(i10, 3, PaymentOption$$serializer.INSTANCE.getDescriptor());
        }
        this.promotionId = str;
        this.promotionName = str2;
        if ((i10 & 4) == 0) {
            this.type = null;
        } else {
            this.type = str3;
        }
        if ((i10 & 8) == 0) {
            this.installments = null;
        } else {
            this.installments = num;
        }
        if ((i10 & 16) == 0) {
            this.issuerId = null;
        } else {
            this.issuerId = str4;
        }
        if ((i10 & 32) == 0) {
            this.issuerName = null;
        } else {
            this.issuerName = str5;
        }
    }

    public static /* synthetic */ PaymentOption copy$default(PaymentOption paymentOption, String str, String str2, String str3, Integer num, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = paymentOption.promotionId;
        }
        if ((i10 & 2) != 0) {
            str2 = paymentOption.promotionName;
        }
        if ((i10 & 4) != 0) {
            str3 = paymentOption.type;
        }
        if ((i10 & 8) != 0) {
            num = paymentOption.installments;
        }
        if ((i10 & 16) != 0) {
            str4 = paymentOption.issuerId;
        }
        if ((i10 & 32) != 0) {
            str5 = paymentOption.issuerName;
        }
        String str6 = str4;
        String str7 = str5;
        return paymentOption.copy(str, str2, str3, num, str6, str7);
    }

    public static /* synthetic */ void getPromotionId$annotations() {
    }

    public static /* synthetic */ void getPromotionName$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(PaymentOption self, d output, f serialDesc) {
        output.G(serialDesc, 0, self.promotionId);
        output.G(serialDesc, 1, self.promotionName);
        if (output.m(serialDesc, 2) || self.type != null) {
            output.C(serialDesc, 2, Z0.f45341a, self.type);
        }
        if (output.m(serialDesc, 3) || self.installments != null) {
            output.C(serialDesc, 3, Y.f45337a, self.installments);
        }
        if (output.m(serialDesc, 4) || self.issuerId != null) {
            output.C(serialDesc, 4, Z0.f45341a, self.issuerId);
        }
        if (!output.m(serialDesc, 5) && self.issuerName == null) {
            return;
        }
        output.C(serialDesc, 5, Z0.f45341a, self.issuerName);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPromotionId() {
        return this.promotionId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPromotionName() {
        return this.promotionName;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getInstallments() {
        return this.installments;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getIssuerId() {
        return this.issuerId;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getIssuerName() {
        return this.issuerName;
    }

    @NotNull
    public final PaymentOption copy(@NotNull String promotionId, @NotNull String promotionName, @Nullable String type, @Nullable Integer installments, @Nullable String issuerId, @Nullable String issuerName) {
        Intrinsics.checkNotNullParameter(promotionId, "promotionId");
        Intrinsics.checkNotNullParameter(promotionName, "promotionName");
        return new PaymentOption(promotionId, promotionName, type, installments, issuerId, issuerName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentOption)) {
            return false;
        }
        PaymentOption paymentOption = (PaymentOption) other;
        return Intrinsics.areEqual(this.promotionId, paymentOption.promotionId) && Intrinsics.areEqual(this.promotionName, paymentOption.promotionName) && Intrinsics.areEqual(this.type, paymentOption.type) && Intrinsics.areEqual(this.installments, paymentOption.installments) && Intrinsics.areEqual(this.issuerId, paymentOption.issuerId) && Intrinsics.areEqual(this.issuerName, paymentOption.issuerName);
    }

    @Nullable
    public final Integer getInstallments() {
        return this.installments;
    }

    @Nullable
    public final String getIssuerId() {
        return this.issuerId;
    }

    @Nullable
    public final String getIssuerName() {
        return this.issuerName;
    }

    @NotNull
    public final String getPromotionId() {
        return this.promotionId;
    }

    @NotNull
    public final String getPromotionName() {
        return this.promotionName;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((this.promotionId.hashCode() * 31) + this.promotionName.hashCode()) * 31;
        String str = this.type;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.installments;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.issuerId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.issuerName;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PaymentOption(promotionId=" + this.promotionId + ", promotionName=" + this.promotionName + ", type=" + this.type + ", installments=" + this.installments + ", issuerId=" + this.issuerId + ", issuerName=" + this.issuerName + ')';
    }

    public PaymentOption(@NotNull String promotionId, @NotNull String promotionName, @Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(promotionId, "promotionId");
        Intrinsics.checkNotNullParameter(promotionName, "promotionName");
        this.promotionId = promotionId;
        this.promotionName = promotionName;
        this.type = str;
        this.installments = num;
        this.issuerId = str2;
        this.issuerName = str3;
    }

    public /* synthetic */ PaymentOption(String str, String str2, String str3, Integer num, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : num, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5);
    }
}
