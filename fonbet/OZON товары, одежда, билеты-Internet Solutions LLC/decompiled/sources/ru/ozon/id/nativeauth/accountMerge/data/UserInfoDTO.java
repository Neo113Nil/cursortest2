package ru.ozon.id.nativeauth.accountMerge.data;

import I0.C3173b;
import N3.C3660k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lru/ozon/id/nativeauth/accountMerge/data/UserInfoDTO;", "Landroid/os/Parcelable;", "picture", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "phone", Scopes.EMAIL, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPicture", "()Ljava/lang/String;", "getName", "getPhone", "getEmail", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UserInfoDTO implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UserInfoDTO> CREATOR = new a();
    private final String email;
    private final String name;
    private final String phone;
    private final String picture;

    public static final class a implements Parcelable.Creator<UserInfoDTO> {
        @Override // android.os.Parcelable.Creator
        public final UserInfoDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserInfoDTO(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UserInfoDTO[] newArray(int i11) {
            return new UserInfoDTO[i11];
        }
    }

    public UserInfoDTO(String str, String str2, String str3, String str4) {
        this.picture = str;
        this.name = str2;
        this.phone = str3;
        this.email = str4;
    }

    public static /* synthetic */ UserInfoDTO copy$default(UserInfoDTO userInfoDTO, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = userInfoDTO.picture;
        }
        if ((i11 & 2) != 0) {
            str2 = userInfoDTO.name;
        }
        if ((i11 & 4) != 0) {
            str3 = userInfoDTO.phone;
        }
        if ((i11 & 8) != 0) {
            str4 = userInfoDTO.email;
        }
        return userInfoDTO.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPicture() {
        return this.picture;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    public final UserInfoDTO copy(String picture, String name, String phone, String email) {
        return new UserInfoDTO(picture, name, phone, email);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserInfoDTO)) {
            return false;
        }
        UserInfoDTO userInfoDTO = (UserInfoDTO) other;
        return Intrinsics.d(this.picture, userInfoDTO.picture) && Intrinsics.d(this.name, userInfoDTO.name) && Intrinsics.d(this.phone, userInfoDTO.phone) && Intrinsics.d(this.email, userInfoDTO.email);
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPicture() {
        return this.picture;
    }

    public int hashCode() {
        String str = this.picture;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phone;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.email;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.picture;
        String str2 = this.name;
        return C3173b.c(C3660k.d("UserInfoDTO(picture=", str, ", name=", str2, ", phone="), this.phone, ", email=", this.email, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.picture);
        dest.writeString(this.name);
        dest.writeString(this.phone);
        dest.writeString(this.email);
    }
}
