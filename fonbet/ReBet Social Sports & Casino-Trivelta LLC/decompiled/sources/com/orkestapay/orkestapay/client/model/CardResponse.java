package com.orkestapay.orkestapay.client.model;

import Zh.InterfaceC1901b;
import Zh.n;
import bi.f;
import ci.d;
import com.orkestapay.orkestapay.client.enums.CardType;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b-\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FEBQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB\u0081\u0001\b\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J(\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018HÇ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ\u0010\u0010'\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b'\u0010(Jl\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001eJ\u0010\u0010,\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00101\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b6\u0010\u001eR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00107\u0012\u0004\b9\u00105\u001a\u0004\b8\u0010\"R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00101\u0012\u0004\b;\u00105\u001a\u0004\b:\u0010\u001eR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00101\u0012\u0004\b=\u00105\u001a\u0004\b<\u0010\u001eR \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00101\u0012\u0004\b?\u00105\u001a\u0004\b>\u0010\u001eR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00101\u0012\u0004\bA\u00105\u001a\u0004\b@\u0010\u001eR \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010B\u0012\u0004\bD\u00105\u001a\u0004\bC\u0010(¨\u0006G"}, d2 = {"Lcom/orkestapay/orkestapay/client/model/CardResponse;", "", "", "bin", "lastFour", "brand", "Lcom/orkestapay/orkestapay/client/enums/CardType;", "cardType", "expirationMonth", "expirationYear", "holderName", "holderLastName", "", "oneTimeUse", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/orkestapay/orkestapay/client/enums/CardType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen1", "Ldi/U0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/orkestapay/orkestapay/client/enums/CardType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLdi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "write$Self", "(Lcom/orkestapay/orkestapay/client/model/CardResponse;Lci/d;Lbi/f;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/orkestapay/orkestapay/client/enums/CardType;", "component5", "component6", "component7", "component8", "component9", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/orkestapay/orkestapay/client/enums/CardType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/orkestapay/orkestapay/client/model/CardResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBin", "getLastFour", "getLastFour$annotations", "()V", "getBrand", "Lcom/orkestapay/orkestapay/client/enums/CardType;", "getCardType", "getCardType$annotations", "getExpirationMonth", "getExpirationMonth$annotations", "getExpirationYear", "getExpirationYear$annotations", "getHolderName", "getHolderName$annotations", "getHolderLastName", "getHolderLastName$annotations", "Z", "getOneTimeUse", "getOneTimeUse$annotations", "Companion", "$serializer", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardResponse {

    @NotNull
    private final String bin;

    @NotNull
    private final String brand;

    @NotNull
    private final CardType cardType;

    @NotNull
    private final String expirationMonth;

    @NotNull
    private final String expirationYear;

    @Nullable
    private final String holderLastName;

    @NotNull
    private final String holderName;

    @NotNull
    private final String lastFour;
    private final boolean oneTimeUse;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    private static final InterfaceC1901b[] $childSerializers = {null, null, null, J.a("com.orkestapay.orkestapay.client.enums.CardType", CardType.values()), null, null, null, null, null};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/orkestapay/orkestapay/client/model/CardResponse$Companion;", "", "<init>", "()V", "LZh/b;", "Lcom/orkestapay/orkestapay/client/model/CardResponse;", "serializer", "()LZh/b;", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return CardResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ CardResponse(int i10, String str, String str2, String str3, CardType cardType, String str4, String str5, String str6, String str7, boolean z10, U0 u02) {
        if (511 != (i10 & 511)) {
            F0.a(i10, 511, CardResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.bin = str;
        this.lastFour = str2;
        this.brand = str3;
        this.cardType = cardType;
        this.expirationMonth = str4;
        this.expirationYear = str5;
        this.holderName = str6;
        this.holderLastName = str7;
        this.oneTimeUse = z10;
    }

    public static /* synthetic */ CardResponse copy$default(CardResponse cardResponse, String str, String str2, String str3, CardType cardType, String str4, String str5, String str6, String str7, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cardResponse.bin;
        }
        if ((i10 & 2) != 0) {
            str2 = cardResponse.lastFour;
        }
        if ((i10 & 4) != 0) {
            str3 = cardResponse.brand;
        }
        if ((i10 & 8) != 0) {
            cardType = cardResponse.cardType;
        }
        if ((i10 & 16) != 0) {
            str4 = cardResponse.expirationMonth;
        }
        if ((i10 & 32) != 0) {
            str5 = cardResponse.expirationYear;
        }
        if ((i10 & 64) != 0) {
            str6 = cardResponse.holderName;
        }
        if ((i10 & 128) != 0) {
            str7 = cardResponse.holderLastName;
        }
        if ((i10 & 256) != 0) {
            z10 = cardResponse.oneTimeUse;
        }
        String str8 = str7;
        boolean z11 = z10;
        String str9 = str5;
        String str10 = str6;
        String str11 = str4;
        String str12 = str3;
        return cardResponse.copy(str, str2, str12, cardType, str11, str9, str10, str8, z11);
    }

    public static /* synthetic */ void getCardType$annotations() {
    }

    public static /* synthetic */ void getExpirationMonth$annotations() {
    }

    public static /* synthetic */ void getExpirationYear$annotations() {
    }

    public static /* synthetic */ void getHolderLastName$annotations() {
    }

    public static /* synthetic */ void getHolderName$annotations() {
    }

    public static /* synthetic */ void getLastFour$annotations() {
    }

    public static /* synthetic */ void getOneTimeUse$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(CardResponse self, d output, f serialDesc) {
        InterfaceC1901b[] interfaceC1901bArr = $childSerializers;
        output.G(serialDesc, 0, self.bin);
        output.G(serialDesc, 1, self.lastFour);
        output.G(serialDesc, 2, self.brand);
        output.B(serialDesc, 3, interfaceC1901bArr[3], self.cardType);
        output.G(serialDesc, 4, self.expirationMonth);
        output.G(serialDesc, 5, self.expirationYear);
        output.G(serialDesc, 6, self.holderName);
        output.C(serialDesc, 7, Z0.f45341a, self.holderLastName);
        output.F(serialDesc, 8, self.oneTimeUse);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBin() {
        return this.bin;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getLastFour() {
        return this.lastFour;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final CardType getCardType() {
        return this.cardType;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getExpirationMonth() {
        return this.expirationMonth;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getExpirationYear() {
        return this.expirationYear;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getHolderName() {
        return this.holderName;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getHolderLastName() {
        return this.holderLastName;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getOneTimeUse() {
        return this.oneTimeUse;
    }

    @NotNull
    public final CardResponse copy(@NotNull String bin, @NotNull String lastFour, @NotNull String brand, @NotNull CardType cardType, @NotNull String expirationMonth, @NotNull String expirationYear, @NotNull String holderName, @Nullable String holderLastName, boolean oneTimeUse) {
        Intrinsics.checkNotNullParameter(bin, "bin");
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        Intrinsics.checkNotNullParameter(expirationMonth, "expirationMonth");
        Intrinsics.checkNotNullParameter(expirationYear, "expirationYear");
        Intrinsics.checkNotNullParameter(holderName, "holderName");
        return new CardResponse(bin, lastFour, brand, cardType, expirationMonth, expirationYear, holderName, holderLastName, oneTimeUse);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardResponse)) {
            return false;
        }
        CardResponse cardResponse = (CardResponse) other;
        return Intrinsics.areEqual(this.bin, cardResponse.bin) && Intrinsics.areEqual(this.lastFour, cardResponse.lastFour) && Intrinsics.areEqual(this.brand, cardResponse.brand) && this.cardType == cardResponse.cardType && Intrinsics.areEqual(this.expirationMonth, cardResponse.expirationMonth) && Intrinsics.areEqual(this.expirationYear, cardResponse.expirationYear) && Intrinsics.areEqual(this.holderName, cardResponse.holderName) && Intrinsics.areEqual(this.holderLastName, cardResponse.holderLastName) && this.oneTimeUse == cardResponse.oneTimeUse;
    }

    @NotNull
    public final String getBin() {
        return this.bin;
    }

    @NotNull
    public final String getBrand() {
        return this.brand;
    }

    @NotNull
    public final CardType getCardType() {
        return this.cardType;
    }

    @NotNull
    public final String getExpirationMonth() {
        return this.expirationMonth;
    }

    @NotNull
    public final String getExpirationYear() {
        return this.expirationYear;
    }

    @Nullable
    public final String getHolderLastName() {
        return this.holderLastName;
    }

    @NotNull
    public final String getHolderName() {
        return this.holderName;
    }

    @NotNull
    public final String getLastFour() {
        return this.lastFour;
    }

    public final boolean getOneTimeUse() {
        return this.oneTimeUse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((this.bin.hashCode() * 31) + this.lastFour.hashCode()) * 31) + this.brand.hashCode()) * 31) + this.cardType.hashCode()) * 31) + this.expirationMonth.hashCode()) * 31) + this.expirationYear.hashCode()) * 31) + this.holderName.hashCode()) * 31;
        String str = this.holderLastName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z10 = this.oneTimeUse;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode2 + i10;
    }

    @NotNull
    public String toString() {
        return "CardResponse(bin=" + this.bin + ", lastFour=" + this.lastFour + ", brand=" + this.brand + ", cardType=" + this.cardType + ", expirationMonth=" + this.expirationMonth + ", expirationYear=" + this.expirationYear + ", holderName=" + this.holderName + ", holderLastName=" + this.holderLastName + ", oneTimeUse=" + this.oneTimeUse + ')';
    }

    public CardResponse(@NotNull String bin, @NotNull String lastFour, @NotNull String brand, @NotNull CardType cardType, @NotNull String expirationMonth, @NotNull String expirationYear, @NotNull String holderName, @Nullable String str, boolean z10) {
        Intrinsics.checkNotNullParameter(bin, "bin");
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        Intrinsics.checkNotNullParameter(expirationMonth, "expirationMonth");
        Intrinsics.checkNotNullParameter(expirationYear, "expirationYear");
        Intrinsics.checkNotNullParameter(holderName, "holderName");
        this.bin = bin;
        this.lastFour = lastFour;
        this.brand = brand;
        this.cardType = cardType;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.holderName = holderName;
        this.holderLastName = str;
        this.oneTimeUse = z10;
    }
}
