package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AppsDomainResolvedDto.kt */
/* loaded from: classes14.dex */
public final class AppsDomainResolvedDto implements Parcelable {
    public static final Parcelable.Creator<AppsDomainResolvedDto> CREATOR = new a();

    /* renamed from: app, reason: collision with root package name */
    @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    private final AppsAppDto f61app;

    @pmi0("embedded_url")
    private final AppsAppEmbeddedUrlDto embeddedUrl;

    @pmi0("group")
    private final GroupsGroupFullDto group;

    @pmi0("object_id")
    private final int objectId;

    @pmi0("placeholder")
    private final AppsAppPlaceholderDto placeholder;

    @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
    private final UsersUserFullDto profile;

    @pmi0("type")
    private final String type;

    /* compiled from: AppsDomainResolvedDto.kt */
    public static final class a implements Parcelable.Creator<AppsDomainResolvedDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsDomainResolvedDto createFromParcel(Parcel parcel) {
            return new AppsDomainResolvedDto(parcel.readInt(), parcel.readString(), (AppsAppDto) parcel.readParcelable(AppsDomainResolvedDto.class.getClassLoader()), (UsersUserFullDto) parcel.readParcelable(AppsDomainResolvedDto.class.getClassLoader()), (GroupsGroupFullDto) parcel.readParcelable(AppsDomainResolvedDto.class.getClassLoader()), parcel.readInt() == 0 ? null : AppsAppEmbeddedUrlDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AppsAppPlaceholderDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsDomainResolvedDto[] newArray(int i) {
            return new AppsDomainResolvedDto[i];
        }
    }

    public AppsDomainResolvedDto(int i, String str, AppsAppDto appsAppDto, UsersUserFullDto usersUserFullDto, GroupsGroupFullDto groupsGroupFullDto, AppsAppEmbeddedUrlDto appsAppEmbeddedUrlDto, AppsAppPlaceholderDto appsAppPlaceholderDto) {
        this.objectId = i;
        this.type = str;
        this.f61app = appsAppDto;
        this.profile = usersUserFullDto;
        this.group = groupsGroupFullDto;
        this.embeddedUrl = appsAppEmbeddedUrlDto;
        this.placeholder = appsAppPlaceholderDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsDomainResolvedDto)) {
            return false;
        }
        AppsDomainResolvedDto appsDomainResolvedDto = (AppsDomainResolvedDto) obj;
        return this.objectId == appsDomainResolvedDto.objectId && epx.f(this.type, appsDomainResolvedDto.type) && epx.f(this.f61app, appsDomainResolvedDto.f61app) && epx.f(this.profile, appsDomainResolvedDto.profile) && epx.f(this.group, appsDomainResolvedDto.group) && epx.f(this.embeddedUrl, appsDomainResolvedDto.embeddedUrl) && epx.f(this.placeholder, appsDomainResolvedDto.placeholder);
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.objectId) * 31, 31, this.type);
        AppsAppDto appsAppDto = this.f61app;
        int hashCode = (a2 + (appsAppDto == null ? 0 : appsAppDto.hashCode())) * 31;
        UsersUserFullDto usersUserFullDto = this.profile;
        int hashCode2 = (hashCode + (usersUserFullDto == null ? 0 : usersUserFullDto.hashCode())) * 31;
        GroupsGroupFullDto groupsGroupFullDto = this.group;
        int hashCode3 = (hashCode2 + (groupsGroupFullDto == null ? 0 : groupsGroupFullDto.hashCode())) * 31;
        AppsAppEmbeddedUrlDto appsAppEmbeddedUrlDto = this.embeddedUrl;
        int hashCode4 = (hashCode3 + (appsAppEmbeddedUrlDto == null ? 0 : appsAppEmbeddedUrlDto.hashCode())) * 31;
        AppsAppPlaceholderDto appsAppPlaceholderDto = this.placeholder;
        return hashCode4 + (appsAppPlaceholderDto != null ? appsAppPlaceholderDto.hashCode() : 0);
    }

    public final String toString() {
        return "AppsDomainResolvedDto(objectId=" + this.objectId + ", type=" + this.type + ", app=" + this.f61app + ", profile=" + this.profile + ", group=" + this.group + ", embeddedUrl=" + this.embeddedUrl + ", placeholder=" + this.placeholder + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.objectId);
        parcel.writeString(this.type);
        parcel.writeParcelable(this.f61app, i);
        parcel.writeParcelable(this.profile, i);
        parcel.writeParcelable(this.group, i);
        AppsAppEmbeddedUrlDto appsAppEmbeddedUrlDto = this.embeddedUrl;
        if (appsAppEmbeddedUrlDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAppEmbeddedUrlDto.writeToParcel(parcel, i);
        }
        AppsAppPlaceholderDto appsAppPlaceholderDto = this.placeholder;
        if (appsAppPlaceholderDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAppPlaceholderDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AppsDomainResolvedDto(int i, String str, AppsAppDto appsAppDto, UsersUserFullDto usersUserFullDto, GroupsGroupFullDto groupsGroupFullDto, AppsAppEmbeddedUrlDto appsAppEmbeddedUrlDto, AppsAppPlaceholderDto appsAppPlaceholderDto, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : appsAppDto, (i2 & 8) != 0 ? null : usersUserFullDto, (i2 & 16) != 0 ? null : groupsGroupFullDto, (i2 & 32) != 0 ? null : appsAppEmbeddedUrlDto, (i2 & 64) != 0 ? null : appsAppPlaceholderDto);
    }
}
