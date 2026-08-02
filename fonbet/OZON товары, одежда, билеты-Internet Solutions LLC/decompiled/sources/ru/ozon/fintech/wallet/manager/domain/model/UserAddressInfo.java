package ru.ozon.fintech.wallet.manager.domain.model;

import G.g;
import I0.C3173b;
import N3.C3660k;
import Nh.a;
import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lru/ozon/fintech/wallet/manager/domain/model/UserAddressInfo;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "countryCode", "locality", "phoneNumber", "postCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getAddress", "getCountryCode", "getLocality", "getPhoneNumber", "getPostCode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "manager_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UserAddressInfo {

    @NotNull
    private final String address;

    @NotNull
    private final String countryCode;

    @NotNull
    private final String locality;

    @NotNull
    private final String name;

    @NotNull
    private final String phoneNumber;

    @NotNull
    private final String postCode;

    public UserAddressInfo(@NotNull String name, @NotNull String address, @NotNull String countryCode, @NotNull String locality, @NotNull String phoneNumber, @NotNull String postCode) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(postCode, "postCode");
        this.name = name;
        this.address = address;
        this.countryCode = countryCode;
        this.locality = locality;
        this.phoneNumber = phoneNumber;
        this.postCode = postCode;
    }

    public static /* synthetic */ UserAddressInfo copy$default(UserAddressInfo userAddressInfo, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = userAddressInfo.name;
        }
        if ((i11 & 2) != 0) {
            str2 = userAddressInfo.address;
        }
        if ((i11 & 4) != 0) {
            str3 = userAddressInfo.countryCode;
        }
        if ((i11 & 8) != 0) {
            str4 = userAddressInfo.locality;
        }
        if ((i11 & 16) != 0) {
            str5 = userAddressInfo.phoneNumber;
        }
        if ((i11 & 32) != 0) {
            str6 = userAddressInfo.postCode;
        }
        String str7 = str5;
        String str8 = str6;
        return userAddressInfo.copy(str, str2, str3, str4, str7, str8);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getLocality() {
        return this.locality;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getPostCode() {
        return this.postCode;
    }

    @NotNull
    public final UserAddressInfo copy(@NotNull String name, @NotNull String address, @NotNull String countryCode, @NotNull String locality, @NotNull String phoneNumber, @NotNull String postCode) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(postCode, "postCode");
        return new UserAddressInfo(name, address, countryCode, locality, phoneNumber, postCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserAddressInfo)) {
            return false;
        }
        UserAddressInfo userAddressInfo = (UserAddressInfo) other;
        return Intrinsics.d(this.name, userAddressInfo.name) && Intrinsics.d(this.address, userAddressInfo.address) && Intrinsics.d(this.countryCode, userAddressInfo.countryCode) && Intrinsics.d(this.locality, userAddressInfo.locality) && Intrinsics.d(this.phoneNumber, userAddressInfo.phoneNumber) && Intrinsics.d(this.postCode, userAddressInfo.postCode);
    }

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final String getLocality() {
        return this.locality;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @NotNull
    public final String getPostCode() {
        return this.postCode;
    }

    public int hashCode() {
        return this.postCode.hashCode() + g.a(g.a(g.a(g.a(this.name.hashCode() * 31, 31, this.address), 31, this.countryCode), 31, this.locality), 31, this.phoneNumber);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.address;
        String str3 = this.countryCode;
        String str4 = this.locality;
        String str5 = this.phoneNumber;
        String str6 = this.postCode;
        StringBuilder d11 = C3660k.d("UserAddressInfo(name=", str, ", address=", str2, ", countryCode=");
        a.h(d11, str3, ", locality=", str4, ", phoneNumber=");
        return C3173b.c(d11, str5, ", postCode=", str6, ")");
    }
}
