package spay.sdk.domain.model.response;

import Lf.a;
import N3.C3660k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.api.ErrorCode;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\""}, d2 = {"Lspay/sdk/domain/model/response/UserInfo;", "Landroid/os/Parcelable;", "lastName", "", "firstName", "gender", "", "mobilePhone", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getFirstName", "()Ljava/lang/String;", "getGender", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLastName", "getMobilePhone", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lspay/sdk/domain/model/response/UserInfo;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UserInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UserInfo> CREATOR = new Creator();

    @NotNull
    private final String firstName;
    private final Integer gender;

    @NotNull
    private final String lastName;
    private final String mobilePhone;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UserInfo> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UserInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserInfo(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UserInfo[] newArray(int i11) {
            return new UserInfo[i11];
        }
    }

    public UserInfo() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ UserInfo copy$default(UserInfo userInfo, String str, String str2, Integer num, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = userInfo.lastName;
        }
        if ((i11 & 2) != 0) {
            str2 = userInfo.firstName;
        }
        if ((i11 & 4) != 0) {
            num = userInfo.gender;
        }
        if ((i11 & 8) != 0) {
            str3 = userInfo.mobilePhone;
        }
        return userInfo.copy(str, str2, num, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getGender() {
        return this.gender;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMobilePhone() {
        return this.mobilePhone;
    }

    @NotNull
    public final UserInfo copy(@NotNull String lastName, @NotNull String firstName, Integer gender, String mobilePhone) {
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        return new UserInfo(lastName, firstName, gender, mobilePhone);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserInfo)) {
            return false;
        }
        UserInfo userInfo = (UserInfo) other;
        return Intrinsics.d(this.lastName, userInfo.lastName) && Intrinsics.d(this.firstName, userInfo.firstName) && Intrinsics.d(this.gender, userInfo.gender) && Intrinsics.d(this.mobilePhone, userInfo.mobilePhone);
    }

    @NotNull
    public final String getFirstName() {
        return this.firstName;
    }

    public final Integer getGender() {
        return this.gender;
    }

    @NotNull
    public final String getLastName() {
        return this.lastName;
    }

    public final String getMobilePhone() {
        return this.mobilePhone;
    }

    public int hashCode() {
        int b02 = a.b0(this.lastName.hashCode() * 31, this.firstName);
        Integer num = this.gender;
        int hashCode = (b02 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.mobilePhone;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.lastName;
        String str2 = this.firstName;
        Integer num = this.gender;
        String str3 = this.mobilePhone;
        StringBuilder d11 = C3660k.d("UserInfo(lastName=", str, ", firstName=", str2, ", gender=");
        d11.append(num);
        d11.append(", mobilePhone=");
        d11.append(str3);
        d11.append(")");
        return d11.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.lastName);
        parcel.writeString(this.firstName);
        Integer num = this.gender;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            Nh.a.f(parcel, 1, num);
        }
        parcel.writeString(this.mobilePhone);
    }

    public UserInfo(@NotNull String lastName, @NotNull String firstName, Integer num, String str) {
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = num;
        this.mobilePhone = str;
    }

    public /* synthetic */ UserInfo(String str, String str2, Integer num, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE : str, (i11 & 2) != 0 ? ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE : str2, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : str3);
    }
}
