package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.api.generated.apps.dto.AppsAppMinDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: UsersProfileButtonActionDto.kt */
/* loaded from: classes15.dex */
public final class UsersProfileButtonActionDto implements Parcelable {
    public static final Parcelable.Creator<UsersProfileButtonActionDto> CREATOR = new a();

    /* renamed from: app, reason: collision with root package name */
    @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    private final AppsAppMinDto f84app;

    @pmi0("type")
    private final String type;

    @pmi0("url")
    private final String url;

    /* compiled from: UsersProfileButtonActionDto.kt */
    public static final class a implements Parcelable.Creator<UsersProfileButtonActionDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersProfileButtonActionDto createFromParcel(Parcel parcel) {
            return new UsersProfileButtonActionDto(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AppsAppMinDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final UsersProfileButtonActionDto[] newArray(int i) {
            return new UsersProfileButtonActionDto[i];
        }
    }

    public UsersProfileButtonActionDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersProfileButtonActionDto)) {
            return false;
        }
        UsersProfileButtonActionDto usersProfileButtonActionDto = (UsersProfileButtonActionDto) obj;
        return epx.f(this.type, usersProfileButtonActionDto.type) && epx.f(this.url, usersProfileButtonActionDto.url) && epx.f(this.f84app, usersProfileButtonActionDto.f84app);
    }

    public final int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AppsAppMinDto appsAppMinDto = this.f84app;
        return hashCode2 + (appsAppMinDto != null ? appsAppMinDto.hashCode() : 0);
    }

    public final String toString() {
        return "UsersProfileButtonActionDto(type=" + this.type + ", url=" + this.url + ", app=" + this.f84app + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.url);
        AppsAppMinDto appsAppMinDto = this.f84app;
        if (appsAppMinDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAppMinDto.writeToParcel(parcel, i);
        }
    }

    public UsersProfileButtonActionDto(String str, String str2, AppsAppMinDto appsAppMinDto) {
        this.type = str;
        this.url = str2;
        this.f84app = appsAppMinDto;
    }

    public /* synthetic */ UsersProfileButtonActionDto(String str, String str2, AppsAppMinDto appsAppMinDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : appsAppMinDto);
    }
}
