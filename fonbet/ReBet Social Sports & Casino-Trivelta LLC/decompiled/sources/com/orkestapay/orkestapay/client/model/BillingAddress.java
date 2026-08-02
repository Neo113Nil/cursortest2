package com.orkestapay.orkestapay.client.model;

import Zh.InterfaceC1901b;
import Zh.n;
import bi.f;
import ci.d;
import com.appsflyer.AdRevenueScheme;
import di.F0;
import di.U0;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGBq\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010B\u0093\u0001\b\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J(\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019HÇ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001fJ\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001fJ\u008a\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u001fJ\u0010\u0010.\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00104\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010\u001fR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00104\u0012\u0004\b9\u00107\u001a\u0004\b8\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b:\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b<\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b=\u0010\u001fR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00104\u0012\u0004\b?\u00107\u001a\u0004\b>\u0010\u001fR\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00104\u0012\u0004\bA\u00107\u001a\u0004\b@\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\bB\u0010\u001fR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\bC\u0010\u001fR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\bD\u0010\u001fR \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00104\u0012\u0004\bF\u00107\u001a\u0004\bE\u0010\u001f¨\u0006I"}, d2 = {"Lcom/orkestapay/orkestapay/client/model/BillingAddress;", "", "", "firstName", "lastName", "email", "Lcom/orkestapay/orkestapay/client/model/Phone;", "phone", "type", "line1", "line2", "city", "state", AdRevenueScheme.COUNTRY, "zipCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/orkestapay/orkestapay/client/model/Phone;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Ldi/U0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/orkestapay/orkestapay/client/model/Phone;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "write$Self", "(Lcom/orkestapay/orkestapay/client/model/BillingAddress;Lci/d;Lbi/f;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/orkestapay/orkestapay/client/model/Phone;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/orkestapay/orkestapay/client/model/Phone;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/orkestapay/orkestapay/client/model/BillingAddress;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFirstName", "getFirstName$annotations", "()V", "getLastName", "getLastName$annotations", "getEmail", "Lcom/orkestapay/orkestapay/client/model/Phone;", "getPhone", "getType", "getLine1", "getLine1$annotations", "getLine2", "getLine2$annotations", "getCity", "getState", "getCountry", "getZipCode", "getZipCode$annotations", "Companion", "$serializer", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BillingAddress {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String city;

    @NotNull
    private final String country;

    @Nullable
    private final String email;

    @Nullable
    private final String firstName;

    @Nullable
    private final String lastName;

    @NotNull
    private final String line1;

    @Nullable
    private final String line2;

    @Nullable
    private final Phone phone;

    @NotNull
    private final String state;

    @Nullable
    private final String type;

    @NotNull
    private final String zipCode;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/orkestapay/orkestapay/client/model/BillingAddress$Companion;", "", "<init>", "()V", "LZh/b;", "Lcom/orkestapay/orkestapay/client/model/BillingAddress;", "serializer", "()LZh/b;", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return BillingAddress$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ BillingAddress(int i10, String str, String str2, String str3, Phone phone, String str4, String str5, String str6, String str7, String str8, String str9, String str10, U0 u02) {
        if (1965 != (i10 & 1965)) {
            F0.a(i10, 1965, BillingAddress$$serializer.INSTANCE.getDescriptor());
        }
        this.firstName = str;
        if ((i10 & 2) == 0) {
            this.lastName = null;
        } else {
            this.lastName = str2;
        }
        this.email = str3;
        this.phone = phone;
        if ((i10 & 16) == 0) {
            this.type = null;
        } else {
            this.type = str4;
        }
        this.line1 = str5;
        if ((i10 & 64) == 0) {
            this.line2 = null;
        } else {
            this.line2 = str6;
        }
        this.city = str7;
        this.state = str8;
        this.country = str9;
        this.zipCode = str10;
    }

    public static /* synthetic */ BillingAddress copy$default(BillingAddress billingAddress, String str, String str2, String str3, Phone phone, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = billingAddress.firstName;
        }
        if ((i10 & 2) != 0) {
            str2 = billingAddress.lastName;
        }
        if ((i10 & 4) != 0) {
            str3 = billingAddress.email;
        }
        if ((i10 & 8) != 0) {
            phone = billingAddress.phone;
        }
        if ((i10 & 16) != 0) {
            str4 = billingAddress.type;
        }
        if ((i10 & 32) != 0) {
            str5 = billingAddress.line1;
        }
        if ((i10 & 64) != 0) {
            str6 = billingAddress.line2;
        }
        if ((i10 & 128) != 0) {
            str7 = billingAddress.city;
        }
        if ((i10 & 256) != 0) {
            str8 = billingAddress.state;
        }
        if ((i10 & 512) != 0) {
            str9 = billingAddress.country;
        }
        if ((i10 & 1024) != 0) {
            str10 = billingAddress.zipCode;
        }
        String str11 = str9;
        String str12 = str10;
        String str13 = str7;
        String str14 = str8;
        String str15 = str5;
        String str16 = str6;
        String str17 = str4;
        String str18 = str3;
        return billingAddress.copy(str, str2, str18, phone, str17, str15, str16, str13, str14, str11, str12);
    }

    public static /* synthetic */ void getFirstName$annotations() {
    }

    public static /* synthetic */ void getLastName$annotations() {
    }

    public static /* synthetic */ void getLine1$annotations() {
    }

    public static /* synthetic */ void getLine2$annotations() {
    }

    public static /* synthetic */ void getZipCode$annotations() {
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(BillingAddress self, d output, f serialDesc) {
        Z0 z02 = Z0.f45341a;
        output.C(serialDesc, 0, z02, self.firstName);
        if (output.m(serialDesc, 1) || self.lastName != null) {
            output.C(serialDesc, 1, z02, self.lastName);
        }
        output.C(serialDesc, 2, z02, self.email);
        output.C(serialDesc, 3, Phone$$serializer.INSTANCE, self.phone);
        if (output.m(serialDesc, 4) || self.type != null) {
            output.C(serialDesc, 4, z02, self.type);
        }
        output.G(serialDesc, 5, self.line1);
        if (output.m(serialDesc, 6) || self.line2 != null) {
            output.C(serialDesc, 6, z02, self.line2);
        }
        output.G(serialDesc, 7, self.city);
        output.G(serialDesc, 8, self.state);
        output.G(serialDesc, 9, self.country);
        output.G(serialDesc, 10, self.zipCode);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final String getZipCode() {
        return this.zipCode;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Phone getPhone() {
        return this.phone;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getLine1() {
        return this.line1;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getLine2() {
        return this.line2;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getState() {
        return this.state;
    }

    @NotNull
    public final BillingAddress copy(@Nullable String firstName, @Nullable String lastName, @Nullable String email, @Nullable Phone phone, @Nullable String type, @NotNull String line1, @Nullable String line2, @NotNull String city, @NotNull String state, @NotNull String country, @NotNull String zipCode) {
        Intrinsics.checkNotNullParameter(line1, "line1");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(zipCode, "zipCode");
        return new BillingAddress(firstName, lastName, email, phone, type, line1, line2, city, state, country, zipCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BillingAddress)) {
            return false;
        }
        BillingAddress billingAddress = (BillingAddress) other;
        return Intrinsics.areEqual(this.firstName, billingAddress.firstName) && Intrinsics.areEqual(this.lastName, billingAddress.lastName) && Intrinsics.areEqual(this.email, billingAddress.email) && Intrinsics.areEqual(this.phone, billingAddress.phone) && Intrinsics.areEqual(this.type, billingAddress.type) && Intrinsics.areEqual(this.line1, billingAddress.line1) && Intrinsics.areEqual(this.line2, billingAddress.line2) && Intrinsics.areEqual(this.city, billingAddress.city) && Intrinsics.areEqual(this.state, billingAddress.state) && Intrinsics.areEqual(this.country, billingAddress.country) && Intrinsics.areEqual(this.zipCode, billingAddress.zipCode);
    }

    @NotNull
    public final String getCity() {
        return this.city;
    }

    @NotNull
    public final String getCountry() {
        return this.country;
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

    @NotNull
    public final String getLine1() {
        return this.line1;
    }

    @Nullable
    public final String getLine2() {
        return this.line2;
    }

    @Nullable
    public final Phone getPhone() {
        return this.phone;
    }

    @NotNull
    public final String getState() {
        return this.state;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getZipCode() {
        return this.zipCode;
    }

    public int hashCode() {
        String str = this.firstName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lastName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.email;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Phone phone = this.phone;
        int hashCode4 = (hashCode3 + (phone == null ? 0 : phone.hashCode())) * 31;
        String str4 = this.type;
        int hashCode5 = (((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.line1.hashCode()) * 31;
        String str5 = this.line2;
        return ((((((((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.city.hashCode()) * 31) + this.state.hashCode()) * 31) + this.country.hashCode()) * 31) + this.zipCode.hashCode();
    }

    @NotNull
    public String toString() {
        return "BillingAddress(firstName=" + this.firstName + ", lastName=" + this.lastName + ", email=" + this.email + ", phone=" + this.phone + ", type=" + this.type + ", line1=" + this.line1 + ", line2=" + this.line2 + ", city=" + this.city + ", state=" + this.state + ", country=" + this.country + ", zipCode=" + this.zipCode + ')';
    }

    public BillingAddress(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Phone phone, @Nullable String str4, @NotNull String line1, @Nullable String str5, @NotNull String city, @NotNull String state, @NotNull String country, @NotNull String zipCode) {
        Intrinsics.checkNotNullParameter(line1, "line1");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(zipCode, "zipCode");
        this.firstName = str;
        this.lastName = str2;
        this.email = str3;
        this.phone = phone;
        this.type = str4;
        this.line1 = line1;
        this.line2 = str5;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ BillingAddress(String str, String str2, String str3, Phone phone, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, phone, str4, str5, r9, r10, r11, r12, r13);
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        str2 = (i10 & 2) != 0 ? null : str2;
        str4 = (i10 & 16) != 0 ? null : str4;
        if ((i10 & 64) != 0) {
            str11 = str10;
            str12 = str9;
            str13 = str8;
            str14 = str7;
            str15 = null;
        } else {
            str11 = str10;
            str12 = str9;
            str13 = str8;
            str14 = str7;
            str15 = str6;
        }
    }
}
