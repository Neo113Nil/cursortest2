package com.orkestapay.orkestapay.client.model.clicktopay;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0012Jz\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\n\u0010\u0012R\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\f\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006)"}, d2 = {"Lcom/orkestapay/orkestapay/client/model/clicktopay/ClickToPay;", "Ljava/io/Serializable;", "email", "", "firstName", "lastName", "phoneCountryCode", "phoneNumber", "totalAmount", "currency", "isCscRequired", "", "isSandbox", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getCurrency", "()Ljava/lang/String;", "getEmail", "getFirstName", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLastName", "getPhoneCountryCode", "getPhoneNumber", "getTotalAmount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/orkestapay/orkestapay/client/model/clicktopay/ClickToPay;", "equals", "other", "", "hashCode", "", "toString", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ClickToPay implements Serializable {

    @Nullable
    private final String currency;

    @Nullable
    private final String email;

    @Nullable
    private final String firstName;

    @Nullable
    private final Boolean isCscRequired;

    @Nullable
    private final Boolean isSandbox;

    @Nullable
    private final String lastName;

    @Nullable
    private final String phoneCountryCode;

    @Nullable
    private final String phoneNumber;

    @Nullable
    private final String totalAmount;

    public ClickToPay() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ ClickToPay copy$default(ClickToPay clickToPay, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = clickToPay.email;
        }
        if ((i10 & 2) != 0) {
            str2 = clickToPay.firstName;
        }
        if ((i10 & 4) != 0) {
            str3 = clickToPay.lastName;
        }
        if ((i10 & 8) != 0) {
            str4 = clickToPay.phoneCountryCode;
        }
        if ((i10 & 16) != 0) {
            str5 = clickToPay.phoneNumber;
        }
        if ((i10 & 32) != 0) {
            str6 = clickToPay.totalAmount;
        }
        if ((i10 & 64) != 0) {
            str7 = clickToPay.currency;
        }
        if ((i10 & 128) != 0) {
            bool = clickToPay.isCscRequired;
        }
        if ((i10 & 256) != 0) {
            bool2 = clickToPay.isSandbox;
        }
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return clickToPay.copy(str, str2, str11, str4, str10, str8, str9, bool3, bool4);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getTotalAmount() {
        return this.totalAmount;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Boolean getIsCscRequired() {
        return this.isCscRequired;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Boolean getIsSandbox() {
        return this.isSandbox;
    }

    @NotNull
    public final ClickToPay copy(@Nullable String email, @Nullable String firstName, @Nullable String lastName, @Nullable String phoneCountryCode, @Nullable String phoneNumber, @Nullable String totalAmount, @Nullable String currency, @Nullable Boolean isCscRequired, @Nullable Boolean isSandbox) {
        return new ClickToPay(email, firstName, lastName, phoneCountryCode, phoneNumber, totalAmount, currency, isCscRequired, isSandbox);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClickToPay)) {
            return false;
        }
        ClickToPay clickToPay = (ClickToPay) other;
        return Intrinsics.areEqual(this.email, clickToPay.email) && Intrinsics.areEqual(this.firstName, clickToPay.firstName) && Intrinsics.areEqual(this.lastName, clickToPay.lastName) && Intrinsics.areEqual(this.phoneCountryCode, clickToPay.phoneCountryCode) && Intrinsics.areEqual(this.phoneNumber, clickToPay.phoneNumber) && Intrinsics.areEqual(this.totalAmount, clickToPay.totalAmount) && Intrinsics.areEqual(this.currency, clickToPay.currency) && Intrinsics.areEqual(this.isCscRequired, clickToPay.isCscRequired) && Intrinsics.areEqual(this.isSandbox, clickToPay.isSandbox);
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    @Nullable
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Nullable
    public final String getTotalAmount() {
        return this.totalAmount;
    }

    public int hashCode() {
        String str = this.email;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.firstName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.phoneCountryCode;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.phoneNumber;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.totalAmount;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.currency;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.isCscRequired;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isSandbox;
        return hashCode8 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Nullable
    public final Boolean isCscRequired() {
        return this.isCscRequired;
    }

    @Nullable
    public final Boolean isSandbox() {
        return this.isSandbox;
    }

    @NotNull
    public String toString() {
        return "ClickToPay(email=" + this.email + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", phoneCountryCode=" + this.phoneCountryCode + ", phoneNumber=" + this.phoneNumber + ", totalAmount=" + this.totalAmount + ", currency=" + this.currency + ", isCscRequired=" + this.isCscRequired + ", isSandbox=" + this.isSandbox + ')';
    }

    public ClickToPay(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Boolean bool, @Nullable Boolean bool2) {
        this.email = str;
        this.firstName = str2;
        this.lastName = str3;
        this.phoneCountryCode = str4;
        this.phoneNumber = str5;
        this.totalAmount = str6;
        this.currency = str7;
        this.isCscRequired = bool;
        this.isSandbox = bool2;
    }

    public /* synthetic */ ClickToPay(String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? Boolean.TRUE : bool, (i10 & 256) != 0 ? null : bool2);
    }
}
