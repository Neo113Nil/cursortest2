package com.orkestapay.orkestapay.client.model;

import Zh.InterfaceC1901b;
import Zh.n;
import bi.f;
import ci.d;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB]\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÇ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 JL\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b0\u0010\u001aR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b2\u0010-\u001a\u0004\b1\u0010\u001aR \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00103\u0012\u0004\b5\u0010-\u001a\u0004\b4\u0010 ¨\u00068"}, d2 = {"Lcom/orkestapay/orkestapay/client/model/Card;", "", "", "number", "expirationMonth", "expirationYear", "cvv", "holderName", "", "oneTimeUse", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen1", "Ldi/U0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLdi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "write$Self", "(Lcom/orkestapay/orkestapay/client/model/Card;Lci/d;Lbi/f;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/orkestapay/orkestapay/client/model/Card;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNumber", "getExpirationMonth", "getExpirationMonth$annotations", "()V", "getExpirationYear", "getExpirationYear$annotations", "getCvv", "getHolderName", "getHolderName$annotations", "Z", "getOneTimeUse", "getOneTimeUse$annotations", "Companion", "$serializer", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Card {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String cvv;

    @NotNull
    private final String expirationMonth;

    @NotNull
    private final String expirationYear;

    @NotNull
    private final String holderName;

    @NotNull
    private final String number;
    private final boolean oneTimeUse;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/orkestapay/orkestapay/client/model/Card$Companion;", "", "<init>", "()V", "LZh/b;", "Lcom/orkestapay/orkestapay/client/model/Card;", "serializer", "()LZh/b;", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return Card$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Card(int i10, String str, String str2, String str3, String str4, String str5, boolean z10, U0 u02) {
        if (63 != (i10 & 63)) {
            F0.a(i10, 63, Card$$serializer.INSTANCE.getDescriptor());
        }
        this.number = str;
        this.expirationMonth = str2;
        this.expirationYear = str3;
        this.cvv = str4;
        this.holderName = str5;
        this.oneTimeUse = z10;
    }

    public static /* synthetic */ Card copy$default(Card card, String str, String str2, String str3, String str4, String str5, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = card.number;
        }
        if ((i10 & 2) != 0) {
            str2 = card.expirationMonth;
        }
        if ((i10 & 4) != 0) {
            str3 = card.expirationYear;
        }
        if ((i10 & 8) != 0) {
            str4 = card.cvv;
        }
        if ((i10 & 16) != 0) {
            str5 = card.holderName;
        }
        if ((i10 & 32) != 0) {
            z10 = card.oneTimeUse;
        }
        String str6 = str5;
        boolean z11 = z10;
        return card.copy(str, str2, str3, str4, str6, z11);
    }

    public static /* synthetic */ void getExpirationMonth$annotations() {
    }

    public static /* synthetic */ void getExpirationYear$annotations() {
    }

    public static /* synthetic */ void getHolderName$annotations() {
    }

    public static /* synthetic */ void getOneTimeUse$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(Card self, d output, f serialDesc) {
        output.G(serialDesc, 0, self.number);
        output.G(serialDesc, 1, self.expirationMonth);
        output.G(serialDesc, 2, self.expirationYear);
        output.G(serialDesc, 3, self.cvv);
        output.G(serialDesc, 4, self.holderName);
        output.F(serialDesc, 5, self.oneTimeUse);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getExpirationMonth() {
        return this.expirationMonth;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getExpirationYear() {
        return this.expirationYear;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getCvv() {
        return this.cvv;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getHolderName() {
        return this.holderName;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getOneTimeUse() {
        return this.oneTimeUse;
    }

    @NotNull
    public final Card copy(@NotNull String number, @NotNull String expirationMonth, @NotNull String expirationYear, @NotNull String cvv, @NotNull String holderName, boolean oneTimeUse) {
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(expirationMonth, "expirationMonth");
        Intrinsics.checkNotNullParameter(expirationYear, "expirationYear");
        Intrinsics.checkNotNullParameter(cvv, "cvv");
        Intrinsics.checkNotNullParameter(holderName, "holderName");
        return new Card(number, expirationMonth, expirationYear, cvv, holderName, oneTimeUse);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Card)) {
            return false;
        }
        Card card = (Card) other;
        return Intrinsics.areEqual(this.number, card.number) && Intrinsics.areEqual(this.expirationMonth, card.expirationMonth) && Intrinsics.areEqual(this.expirationYear, card.expirationYear) && Intrinsics.areEqual(this.cvv, card.cvv) && Intrinsics.areEqual(this.holderName, card.holderName) && this.oneTimeUse == card.oneTimeUse;
    }

    @NotNull
    public final String getCvv() {
        return this.cvv;
    }

    @NotNull
    public final String getExpirationMonth() {
        return this.expirationMonth;
    }

    @NotNull
    public final String getExpirationYear() {
        return this.expirationYear;
    }

    @NotNull
    public final String getHolderName() {
        return this.holderName;
    }

    @NotNull
    public final String getNumber() {
        return this.number;
    }

    public final boolean getOneTimeUse() {
        return this.oneTimeUse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.number.hashCode() * 31) + this.expirationMonth.hashCode()) * 31) + this.expirationYear.hashCode()) * 31) + this.cvv.hashCode()) * 31) + this.holderName.hashCode()) * 31;
        boolean z10 = this.oneTimeUse;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    @NotNull
    public String toString() {
        return "Card(number=" + this.number + ", expirationMonth=" + this.expirationMonth + ", expirationYear=" + this.expirationYear + ", cvv=" + this.cvv + ", holderName=" + this.holderName + ", oneTimeUse=" + this.oneTimeUse + ')';
    }

    public Card(@NotNull String number, @NotNull String expirationMonth, @NotNull String expirationYear, @NotNull String cvv, @NotNull String holderName, boolean z10) {
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(expirationMonth, "expirationMonth");
        Intrinsics.checkNotNullParameter(expirationYear, "expirationYear");
        Intrinsics.checkNotNullParameter(cvv, "cvv");
        Intrinsics.checkNotNullParameter(holderName, "holderName");
        this.number = number;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.cvv = cvv;
        this.holderName = holderName;
        this.oneTimeUse = z10;
    }
}
