package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AppsAuthorGroupInfoDto.kt */
/* loaded from: classes14.dex */
public final class AppsAuthorGroupInfoDto implements Parcelable {
    public static final Parcelable.Creator<AppsAuthorGroupInfoDto> CREATOR = new a();

    @pmi0("id")
    private final UserId id;

    @pmi0("members_count")
    private final int membersCount;

    @pmi0("name")
    private final String name;

    @pmi0("photo")
    private final AppsAuthorGroupInfoPhotoDto photo;

    @pmi0("url")
    private final String url;

    /* compiled from: AppsAuthorGroupInfoDto.kt */
    public static final class a implements Parcelable.Creator<AppsAuthorGroupInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAuthorGroupInfoDto createFromParcel(Parcel parcel) {
            return new AppsAuthorGroupInfoDto((UserId) parcel.readParcelable(AppsAuthorGroupInfoDto.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : AppsAuthorGroupInfoPhotoDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAuthorGroupInfoDto[] newArray(int i) {
            return new AppsAuthorGroupInfoDto[i];
        }
    }

    public AppsAuthorGroupInfoDto(UserId userId, String str, String str2, int i, AppsAuthorGroupInfoPhotoDto appsAuthorGroupInfoPhotoDto) {
        this.id = userId;
        this.name = str;
        this.url = str2;
        this.membersCount = i;
        this.photo = appsAuthorGroupInfoPhotoDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsAuthorGroupInfoDto)) {
            return false;
        }
        AppsAuthorGroupInfoDto appsAuthorGroupInfoDto = (AppsAuthorGroupInfoDto) obj;
        return epx.f(this.id, appsAuthorGroupInfoDto.id) && epx.f(this.name, appsAuthorGroupInfoDto.name) && epx.f(this.url, appsAuthorGroupInfoDto.url) && this.membersCount == appsAuthorGroupInfoDto.membersCount && epx.f(this.photo, appsAuthorGroupInfoDto.photo);
    }

    public final int hashCode() {
        int a2 = shy.a(this.membersCount, urd0.a(urd0.a(Long.hashCode(this.id.b) * 31, 31, this.name), 31, this.url), 31);
        AppsAuthorGroupInfoPhotoDto appsAuthorGroupInfoPhotoDto = this.photo;
        return a2 + (appsAuthorGroupInfoPhotoDto == null ? 0 : appsAuthorGroupInfoPhotoDto.hashCode());
    }

    public final String toString() {
        return "AppsAuthorGroupInfoDto(id=" + this.id + ", name=" + this.name + ", url=" + this.url + ", membersCount=" + this.membersCount + ", photo=" + this.photo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
        parcel.writeString(this.name);
        parcel.writeString(this.url);
        parcel.writeInt(this.membersCount);
        AppsAuthorGroupInfoPhotoDto appsAuthorGroupInfoPhotoDto = this.photo;
        if (appsAuthorGroupInfoPhotoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAuthorGroupInfoPhotoDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AppsAuthorGroupInfoDto(UserId userId, String str, String str2, int i, AppsAuthorGroupInfoPhotoDto appsAuthorGroupInfoPhotoDto, int i2, zcl zclVar) {
        this(userId, str, str2, i, (i2 & 16) != 0 ? null : appsAuthorGroupInfoPhotoDto);
    }
}
