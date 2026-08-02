package com.orkestapay.orkestapay.client.model;

import Zh.InterfaceC1901b;
import Zh.n;
import bi.f;
import ci.d;
import com.appsflyer.AppsFlyerProperties;
import di.C4087f;
import di.F0;
import di.U0;
import di.Y;
import di.Z0;
import java.util.List;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FEBi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fB\u0089\u0001\b\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J(\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017HÇ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b'\u0010&Jz\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001dJ\u0010\u0010+\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010\u001dR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00101\u0012\u0004\b6\u00104\u001a\u0004\b5\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b7\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b9\u0010!R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00101\u0012\u0004\b;\u00104\u001a\u0004\b:\u0010\u001dR\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00101\u0012\u0004\b=\u00104\u001a\u0004\b<\u0010\u001dR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00101\u0012\u0004\b?\u00104\u001a\u0004\b>\u0010\u001dR\"\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010@\u0012\u0004\bB\u00104\u001a\u0004\bA\u0010&R\"\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010@\u0012\u0004\bD\u00104\u001a\u0004\bC\u0010&¨\u0006G"}, d2 = {"Lcom/orkestapay/orkestapay/client/model/PromotionsResponse;", "", "", "promotionId", "promotionName", "type", "", "", "installments", "issuerId", "issuerName", AppsFlyerProperties.CURRENCY_CODE, "minimumAmount", "maximumAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen1", "Ldi/U0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "write$Self", "(Lcom/orkestapay/orkestapay/client/model/PromotionsResponse;Lci/d;Lbi/f;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "component8", "()Ljava/lang/Integer;", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/orkestapay/orkestapay/client/model/PromotionsResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPromotionId", "getPromotionId$annotations", "()V", "getPromotionName", "getPromotionName$annotations", "getType", "Ljava/util/List;", "getInstallments", "getIssuerId", "getIssuerId$annotations", "getIssuerName", "getIssuerName$annotations", "getCurrencyCode", "getCurrencyCode$annotations", "Ljava/lang/Integer;", "getMinimumAmount", "getMinimumAmount$annotations", "getMaximumAmount", "getMaximumAmount$annotations", "Companion", "$serializer", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PromotionsResponse {

    @Nullable
    private final String currencyCode;

    @NotNull
    private final List<Integer> installments;

    @Nullable
    private final String issuerId;

    @Nullable
    private final String issuerName;

    @Nullable
    private final Integer maximumAmount;

    @Nullable
    private final Integer minimumAmount;

    @NotNull
    private final String promotionId;

    @NotNull
    private final String promotionName;

    @NotNull
    private final String type;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    private static final InterfaceC1901b[] $childSerializers = {null, null, null, new C4087f(Y.f45337a), null, null, null, null, null};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/orkestapay/orkestapay/client/model/PromotionsResponse$Companion;", "", "<init>", "()V", "LZh/b;", "Lcom/orkestapay/orkestapay/client/model/PromotionsResponse;", "serializer", "()LZh/b;", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return PromotionsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ PromotionsResponse(int i10, String str, String str2, String str3, List list, String str4, String str5, String str6, Integer num, Integer num2, U0 u02) {
        if (15 != (i10 & 15)) {
            F0.a(i10, 15, PromotionsResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.promotionId = str;
        this.promotionName = str2;
        this.type = str3;
        this.installments = list;
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
        if ((i10 & 64) == 0) {
            this.currencyCode = null;
        } else {
            this.currencyCode = str6;
        }
        if ((i10 & 128) == 0) {
            this.minimumAmount = null;
        } else {
            this.minimumAmount = num;
        }
        if ((i10 & 256) == 0) {
            this.maximumAmount = null;
        } else {
            this.maximumAmount = num2;
        }
    }

    public static /* synthetic */ PromotionsResponse copy$default(PromotionsResponse promotionsResponse, String str, String str2, String str3, List list, String str4, String str5, String str6, Integer num, Integer num2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = promotionsResponse.promotionId;
        }
        if ((i10 & 2) != 0) {
            str2 = promotionsResponse.promotionName;
        }
        if ((i10 & 4) != 0) {
            str3 = promotionsResponse.type;
        }
        if ((i10 & 8) != 0) {
            list = promotionsResponse.installments;
        }
        if ((i10 & 16) != 0) {
            str4 = promotionsResponse.issuerId;
        }
        if ((i10 & 32) != 0) {
            str5 = promotionsResponse.issuerName;
        }
        if ((i10 & 64) != 0) {
            str6 = promotionsResponse.currencyCode;
        }
        if ((i10 & 128) != 0) {
            num = promotionsResponse.minimumAmount;
        }
        if ((i10 & 256) != 0) {
            num2 = promotionsResponse.maximumAmount;
        }
        Integer num3 = num;
        Integer num4 = num2;
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        String str10 = str3;
        return promotionsResponse.copy(str, str2, str10, list, str9, str7, str8, num3, num4);
    }

    public static /* synthetic */ void getCurrencyCode$annotations() {
    }

    public static /* synthetic */ void getIssuerId$annotations() {
    }

    public static /* synthetic */ void getIssuerName$annotations() {
    }

    public static /* synthetic */ void getMaximumAmount$annotations() {
    }

    public static /* synthetic */ void getMinimumAmount$annotations() {
    }

    public static /* synthetic */ void getPromotionId$annotations() {
    }

    public static /* synthetic */ void getPromotionName$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(PromotionsResponse self, d output, f serialDesc) {
        InterfaceC1901b[] interfaceC1901bArr = $childSerializers;
        output.G(serialDesc, 0, self.promotionId);
        output.G(serialDesc, 1, self.promotionName);
        output.G(serialDesc, 2, self.type);
        output.B(serialDesc, 3, interfaceC1901bArr[3], self.installments);
        if (output.m(serialDesc, 4) || self.issuerId != null) {
            output.C(serialDesc, 4, Z0.f45341a, self.issuerId);
        }
        if (output.m(serialDesc, 5) || self.issuerName != null) {
            output.C(serialDesc, 5, Z0.f45341a, self.issuerName);
        }
        if (output.m(serialDesc, 6) || self.currencyCode != null) {
            output.C(serialDesc, 6, Z0.f45341a, self.currencyCode);
        }
        if (output.m(serialDesc, 7) || self.minimumAmount != null) {
            output.C(serialDesc, 7, Y.f45337a, self.minimumAmount);
        }
        if (!output.m(serialDesc, 8) && self.maximumAmount == null) {
            return;
        }
        output.C(serialDesc, 8, Y.f45337a, self.maximumAmount);
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

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final List<Integer> component4() {
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

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getMinimumAmount() {
        return this.minimumAmount;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getMaximumAmount() {
        return this.maximumAmount;
    }

    @NotNull
    public final PromotionsResponse copy(@NotNull String promotionId, @NotNull String promotionName, @NotNull String type, @NotNull List<Integer> installments, @Nullable String issuerId, @Nullable String issuerName, @Nullable String currencyCode, @Nullable Integer minimumAmount, @Nullable Integer maximumAmount) {
        Intrinsics.checkNotNullParameter(promotionId, "promotionId");
        Intrinsics.checkNotNullParameter(promotionName, "promotionName");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(installments, "installments");
        return new PromotionsResponse(promotionId, promotionName, type, installments, issuerId, issuerName, currencyCode, minimumAmount, maximumAmount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromotionsResponse)) {
            return false;
        }
        PromotionsResponse promotionsResponse = (PromotionsResponse) other;
        return Intrinsics.areEqual(this.promotionId, promotionsResponse.promotionId) && Intrinsics.areEqual(this.promotionName, promotionsResponse.promotionName) && Intrinsics.areEqual(this.type, promotionsResponse.type) && Intrinsics.areEqual(this.installments, promotionsResponse.installments) && Intrinsics.areEqual(this.issuerId, promotionsResponse.issuerId) && Intrinsics.areEqual(this.issuerName, promotionsResponse.issuerName) && Intrinsics.areEqual(this.currencyCode, promotionsResponse.currencyCode) && Intrinsics.areEqual(this.minimumAmount, promotionsResponse.minimumAmount) && Intrinsics.areEqual(this.maximumAmount, promotionsResponse.maximumAmount);
    }

    @Nullable
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @NotNull
    public final List<Integer> getInstallments() {
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

    @Nullable
    public final Integer getMaximumAmount() {
        return this.maximumAmount;
    }

    @Nullable
    public final Integer getMinimumAmount() {
        return this.minimumAmount;
    }

    @NotNull
    public final String getPromotionId() {
        return this.promotionId;
    }

    @NotNull
    public final String getPromotionName() {
        return this.promotionName;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((((((this.promotionId.hashCode() * 31) + this.promotionName.hashCode()) * 31) + this.type.hashCode()) * 31) + this.installments.hashCode()) * 31;
        String str = this.issuerId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.issuerName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currencyCode;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.minimumAmount;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maximumAmount;
        return hashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PromotionsResponse(promotionId=" + this.promotionId + ", promotionName=" + this.promotionName + ", type=" + this.type + ", installments=" + this.installments + ", issuerId=" + this.issuerId + ", issuerName=" + this.issuerName + ", currencyCode=" + this.currencyCode + ", minimumAmount=" + this.minimumAmount + ", maximumAmount=" + this.maximumAmount + ')';
    }

    public PromotionsResponse(@NotNull String promotionId, @NotNull String promotionName, @NotNull String type, @NotNull List<Integer> installments, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Integer num2) {
        Intrinsics.checkNotNullParameter(promotionId, "promotionId");
        Intrinsics.checkNotNullParameter(promotionName, "promotionName");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(installments, "installments");
        this.promotionId = promotionId;
        this.promotionName = promotionName;
        this.type = type;
        this.installments = installments;
        this.issuerId = str;
        this.issuerName = str2;
        this.currencyCode = str3;
        this.minimumAmount = num;
        this.maximumAmount = num2;
    }

    public /* synthetic */ PromotionsResponse(String str, String str2, String str3, List list, String str4, String str5, String str6, Integer num, Integer num2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, list, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? null : str6, (i10 & 128) != 0 ? null : num, (i10 & 256) != 0 ? null : num2);
    }
}
