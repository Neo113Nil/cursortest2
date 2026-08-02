package com.vk.api.generated.utils.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.apps.dto.AppsAppEmbeddedUrlDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: UtilsDomainResolvedWithDataDto.kt */
/* loaded from: classes15.dex */
public final class UtilsDomainResolvedWithDataDto implements Parcelable {
    public static final Parcelable.Creator<UtilsDomainResolvedWithDataDto> CREATOR = new a();

    /* renamed from: app, reason: collision with root package name */
    @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    private final AppsAppDto f85app;

    @pmi0("embedded_url")
    private final AppsAppEmbeddedUrlDto embeddedUrl;

    @pmi0("group")
    private final GroupsGroupFullDto group;

    @pmi0("group_id")
    private final UserId groupId;

    @pmi0("object_id")
    private final int objectId;

    @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
    private final UsersUserFullDto profile;

    @pmi0("type")
    private final String type;

    /* compiled from: UtilsDomainResolvedWithDataDto.kt */
    public static final class a implements Parcelable.Creator<UtilsDomainResolvedWithDataDto> {
        @Override // android.os.Parcelable.Creator
        public final UtilsDomainResolvedWithDataDto createFromParcel(Parcel parcel) {
            return new UtilsDomainResolvedWithDataDto(parcel.readInt(), parcel.readString(), (UserId) parcel.readParcelable(UtilsDomainResolvedWithDataDto.class.getClassLoader()), (AppsAppDto) parcel.readParcelable(UtilsDomainResolvedWithDataDto.class.getClassLoader()), (UsersUserFullDto) parcel.readParcelable(UtilsDomainResolvedWithDataDto.class.getClassLoader()), (GroupsGroupFullDto) parcel.readParcelable(UtilsDomainResolvedWithDataDto.class.getClassLoader()), (AppsAppEmbeddedUrlDto) parcel.readParcelable(UtilsDomainResolvedWithDataDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final UtilsDomainResolvedWithDataDto[] newArray(int i) {
            return new UtilsDomainResolvedWithDataDto[i];
        }
    }

    public UtilsDomainResolvedWithDataDto(int i, String str, UserId userId, AppsAppDto appsAppDto, UsersUserFullDto usersUserFullDto, GroupsGroupFullDto groupsGroupFullDto, AppsAppEmbeddedUrlDto appsAppEmbeddedUrlDto) {
        this.objectId = i;
        this.type = str;
        this.groupId = userId;
        this.f85app = appsAppDto;
        this.profile = usersUserFullDto;
        this.group = groupsGroupFullDto;
        this.embeddedUrl = appsAppEmbeddedUrlDto;
    }

    public final AppsAppDto d() {
        return this.f85app;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final AppsAppEmbeddedUrlDto e() {
        return this.embeddedUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilsDomainResolvedWithDataDto)) {
            return false;
        }
        UtilsDomainResolvedWithDataDto utilsDomainResolvedWithDataDto = (UtilsDomainResolvedWithDataDto) obj;
        return this.objectId == utilsDomainResolvedWithDataDto.objectId && epx.f(this.type, utilsDomainResolvedWithDataDto.type) && epx.f(this.groupId, utilsDomainResolvedWithDataDto.groupId) && epx.f(this.f85app, utilsDomainResolvedWithDataDto.f85app) && epx.f(this.profile, utilsDomainResolvedWithDataDto.profile) && epx.f(this.group, utilsDomainResolvedWithDataDto.group) && epx.f(this.embeddedUrl, utilsDomainResolvedWithDataDto.embeddedUrl);
    }

    public final GroupsGroupFullDto f() {
        return this.group;
    }

    public final int g() {
        return this.objectId;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.objectId) * 31, 31, this.type);
        UserId userId = this.groupId;
        int hashCode = (a2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        AppsAppDto appsAppDto = this.f85app;
        int hashCode2 = (hashCode + (appsAppDto == null ? 0 : appsAppDto.hashCode())) * 31;
        UsersUserFullDto usersUserFullDto = this.profile;
        int hashCode3 = (hashCode2 + (usersUserFullDto == null ? 0 : usersUserFullDto.hashCode())) * 31;
        GroupsGroupFullDto groupsGroupFullDto = this.group;
        int hashCode4 = (hashCode3 + (groupsGroupFullDto == null ? 0 : groupsGroupFullDto.hashCode())) * 31;
        AppsAppEmbeddedUrlDto appsAppEmbeddedUrlDto = this.embeddedUrl;
        return hashCode4 + (appsAppEmbeddedUrlDto != null ? appsAppEmbeddedUrlDto.hashCode() : 0);
    }

    public final UsersUserFullDto i() {
        return this.profile;
    }

    public final String toString() {
        return "UtilsDomainResolvedWithDataDto(objectId=" + this.objectId + ", type=" + this.type + ", groupId=" + this.groupId + ", app=" + this.f85app + ", profile=" + this.profile + ", group=" + this.group + ", embeddedUrl=" + this.embeddedUrl + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.objectId);
        parcel.writeString(this.type);
        parcel.writeParcelable(this.groupId, i);
        parcel.writeParcelable(this.f85app, i);
        parcel.writeParcelable(this.profile, i);
        parcel.writeParcelable(this.group, i);
        parcel.writeParcelable(this.embeddedUrl, i);
    }

    public /* synthetic */ UtilsDomainResolvedWithDataDto(int i, String str, UserId userId, AppsAppDto appsAppDto, UsersUserFullDto usersUserFullDto, GroupsGroupFullDto groupsGroupFullDto, AppsAppEmbeddedUrlDto appsAppEmbeddedUrlDto, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : userId, (i2 & 8) != 0 ? null : appsAppDto, (i2 & 16) != 0 ? null : usersUserFullDto, (i2 & 32) != 0 ? null : groupsGroupFullDto, (i2 & 64) != 0 ? null : appsAppEmbeddedUrlDto);
    }
}
