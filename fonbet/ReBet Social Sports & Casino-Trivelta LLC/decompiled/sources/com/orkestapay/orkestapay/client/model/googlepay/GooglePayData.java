package com.orkestapay.orkestapay.client.model.googlepay;

import com.appsflyer.AppsFlyerProperties;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\rJ8\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0006\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayData;", "Ljava/io/Serializable;", "amount", "", AppsFlyerProperties.CURRENCY_CODE, "countryCode", "isSandbox", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAmount", "()Ljava/lang/String;", "getCountryCode", "getCurrencyCode", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/orkestapay/orkestapay/client/model/googlepay/GooglePayData;", "equals", "other", "", "hashCode", "", "toString", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GooglePayData implements Serializable {

    @NotNull
    private final String amount;

    @NotNull
    private final String countryCode;

    @NotNull
    private final String currencyCode;

    @Nullable
    private final Boolean isSandbox;

    public GooglePayData(@NotNull String amount, @NotNull String currencyCode, @NotNull String countryCode, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.amount = amount;
        this.currencyCode = currencyCode;
        this.countryCode = countryCode;
        this.isSandbox = bool;
    }

    public static /* synthetic */ GooglePayData copy$default(GooglePayData googlePayData, String str, String str2, String str3, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = googlePayData.amount;
        }
        if ((i10 & 2) != 0) {
            str2 = googlePayData.currencyCode;
        }
        if ((i10 & 4) != 0) {
            str3 = googlePayData.countryCode;
        }
        if ((i10 & 8) != 0) {
            bool = googlePayData.isSandbox;
        }
        return googlePayData.copy(str, str2, str3, bool);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Boolean getIsSandbox() {
        return this.isSandbox;
    }

    @NotNull
    public final GooglePayData copy(@NotNull String amount, @NotNull String currencyCode, @NotNull String countryCode, @Nullable Boolean isSandbox) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return new GooglePayData(amount, currencyCode, countryCode, isSandbox);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GooglePayData)) {
            return false;
        }
        GooglePayData googlePayData = (GooglePayData) other;
        return Intrinsics.areEqual(this.amount, googlePayData.amount) && Intrinsics.areEqual(this.currencyCode, googlePayData.currencyCode) && Intrinsics.areEqual(this.countryCode, googlePayData.countryCode) && Intrinsics.areEqual(this.isSandbox, googlePayData.isSandbox);
    }

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public int hashCode() {
        int hashCode = ((((this.amount.hashCode() * 31) + this.currencyCode.hashCode()) * 31) + this.countryCode.hashCode()) * 31;
        Boolean bool = this.isSandbox;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    @Nullable
    public final Boolean isSandbox() {
        return this.isSandbox;
    }

    @NotNull
    public String toString() {
        return "GooglePayData(amount=" + this.amount + ", currencyCode=" + this.currencyCode + ", countryCode=" + this.countryCode + ", isSandbox=" + this.isSandbox + ')';
    }

    public /* synthetic */ GooglePayData(String str, String str2, String str3, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i10 & 8) != 0 ? Boolean.TRUE : bool);
    }
}
