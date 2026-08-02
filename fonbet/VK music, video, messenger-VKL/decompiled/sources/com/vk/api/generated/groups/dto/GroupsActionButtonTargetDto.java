package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.uqi;
import xsna.zcl;

/* compiled from: GroupsActionButtonTargetDto.kt */
/* loaded from: classes14.dex */
public final class GroupsActionButtonTargetDto implements Parcelable {
    public static final Parcelable.Creator<GroupsActionButtonTargetDto> CREATOR = new a();

    @pmi0("app_id")
    private final Integer appId;

    @pmi0("default_url")
    private final Integer defaultUrl;

    @pmi0("email")
    private final String email;

    @pmi0("google_store_url")
    private final String googleStoreUrl;

    @pmi0("is_internal")
    private final Boolean isInternal;

    @pmi0("itunes_url")
    private final String itunesUrl;

    @pmi0("phone")
    private final String phone;

    @pmi0("ru_store_url")
    private final String ruStoreUrl;

    @pmi0("url")
    private final String url;

    @pmi0("user_id")
    private final UserId userId;

    /* compiled from: GroupsActionButtonTargetDto.kt */
    public static final class a implements Parcelable.Creator<GroupsActionButtonTargetDto> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final GroupsActionButtonTargetDto createFromParcel(Parcel parcel) {
            Integer valueOf;
            Boolean bool;
            Boolean valueOf2;
            UserId userId;
            Integer valueOf3;
            if (parcel.readInt() == 0) {
                valueOf = null;
                bool = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
                bool = null;
            }
            String readString = parcel.readString();
            Boolean bool2 = bool;
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf2 = bool2;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString4 = parcel.readString();
            Boolean bool3 = valueOf2;
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            UserId userId2 = (UserId) parcel.readParcelable(GroupsActionButtonTargetDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf3 = bool2;
                userId = userId2;
            } else {
                userId = userId2;
                valueOf3 = Integer.valueOf(parcel.readInt());
            }
            return new GroupsActionButtonTargetDto(valueOf, readString, readString2, readString3, bool3, readString4, readString5, readString6, userId, valueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsActionButtonTargetDto[] newArray(int i) {
            return new GroupsActionButtonTargetDto[i];
        }
    }

    public GroupsActionButtonTargetDto() {
        this(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }

    public final Integer d() {
        return this.appId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.email;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsActionButtonTargetDto)) {
            return false;
        }
        GroupsActionButtonTargetDto groupsActionButtonTargetDto = (GroupsActionButtonTargetDto) obj;
        return epx.f(this.appId, groupsActionButtonTargetDto.appId) && epx.f(this.email, groupsActionButtonTargetDto.email) && epx.f(this.googleStoreUrl, groupsActionButtonTargetDto.googleStoreUrl) && epx.f(this.ruStoreUrl, groupsActionButtonTargetDto.ruStoreUrl) && epx.f(this.isInternal, groupsActionButtonTargetDto.isInternal) && epx.f(this.itunesUrl, groupsActionButtonTargetDto.itunesUrl) && epx.f(this.phone, groupsActionButtonTargetDto.phone) && epx.f(this.url, groupsActionButtonTargetDto.url) && epx.f(this.userId, groupsActionButtonTargetDto.userId) && epx.f(this.defaultUrl, groupsActionButtonTargetDto.defaultUrl);
    }

    public final String f() {
        return this.googleStoreUrl;
    }

    public final String g() {
        return this.phone;
    }

    public final String getUrl() {
        return this.url;
    }

    public final UserId getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        Integer num = this.appId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.email;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.googleStoreUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ruStoreUrl;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isInternal;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.itunesUrl;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.phone;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.url;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        UserId userId = this.userId;
        int hashCode9 = (hashCode8 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Integer num2 = this.defaultUrl;
        return hashCode9 + (num2 != null ? num2.hashCode() : 0);
    }

    public final Boolean i() {
        return this.isInternal;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsActionButtonTargetDto(appId=");
        sb.append(this.appId);
        sb.append(", email=");
        sb.append(this.email);
        sb.append(", googleStoreUrl=");
        sb.append(this.googleStoreUrl);
        sb.append(", ruStoreUrl=");
        sb.append(this.ruStoreUrl);
        sb.append(", isInternal=");
        sb.append(this.isInternal);
        sb.append(", itunesUrl=");
        sb.append(this.itunesUrl);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", defaultUrl=");
        return uqi.b(sb, this.defaultUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.appId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.email);
        parcel.writeString(this.googleStoreUrl);
        parcel.writeString(this.ruStoreUrl);
        Boolean bool = this.isInternal;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.itunesUrl);
        parcel.writeString(this.phone);
        parcel.writeString(this.url);
        parcel.writeParcelable(this.userId, i);
        Integer num2 = this.defaultUrl;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public GroupsActionButtonTargetDto(Integer num, String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, UserId userId, Integer num2) {
        this.appId = num;
        this.email = str;
        this.googleStoreUrl = str2;
        this.ruStoreUrl = str3;
        this.isInternal = bool;
        this.itunesUrl = str4;
        this.phone = str5;
        this.url = str6;
        this.userId = userId;
        this.defaultUrl = num2;
    }

    public /* synthetic */ GroupsActionButtonTargetDto(Integer num, String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, UserId userId, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : userId, (i & 512) != 0 ? null : num2);
    }
}
