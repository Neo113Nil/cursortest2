package com.vk.api.generated.podcasts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.users.dto.UsersOnlineInfoDto;
import xsna.eok;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: PodcastsBlockFriendDto.kt */
/* loaded from: classes15.dex */
public final class PodcastsBlockFriendDto implements Parcelable {
    public static final Parcelable.Creator<PodcastsBlockFriendDto> CREATOR = new a();

    @pmi0("can_access_closed")
    private final Boolean canAccessClosed;

    @pmi0("first_name")
    private final String firstName;

    @pmi0("id")
    private final Integer id;

    @pmi0("is_closed")
    private final Boolean isClosed;

    @pmi0("last_name")
    private final String lastName;

    @pmi0(eok.ONLINE_EXTRAS_KEY)
    private final Boolean online;

    @pmi0("online_info")
    private final UsersOnlineInfoDto onlineInfo;

    @pmi0("photo_100")
    private final String photo100;

    @pmi0("photo_50")
    private final String photo50;

    @pmi0("photo_base")
    private final String photoBase;

    @pmi0("screen_name")
    private final String screenName;

    @pmi0("sex")
    private final Integer sex;

    /* compiled from: PodcastsBlockFriendDto.kt */
    public static final class a implements Parcelable.Creator<PodcastsBlockFriendDto> {
        @Override // android.os.Parcelable.Creator
        public final PodcastsBlockFriendDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            Integer num = valueOf5;
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            UsersOnlineInfoDto usersOnlineInfoDto = (UsersOnlineInfoDto) parcel.readParcelable(PodcastsBlockFriendDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString5 = parcel.readString();
            Boolean bool = valueOf;
            String readString6 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PodcastsBlockFriendDto(valueOf4, num, readString, readString2, readString3, readString4, usersOnlineInfoDto, bool, readString5, readString6, valueOf2, valueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final PodcastsBlockFriendDto[] newArray(int i) {
            return new PodcastsBlockFriendDto[i];
        }
    }

    public PodcastsBlockFriendDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PodcastsBlockFriendDto)) {
            return false;
        }
        PodcastsBlockFriendDto podcastsBlockFriendDto = (PodcastsBlockFriendDto) obj;
        return epx.f(this.id, podcastsBlockFriendDto.id) && epx.f(this.sex, podcastsBlockFriendDto.sex) && epx.f(this.screenName, podcastsBlockFriendDto.screenName) && epx.f(this.photo50, podcastsBlockFriendDto.photo50) && epx.f(this.photo100, podcastsBlockFriendDto.photo100) && epx.f(this.photoBase, podcastsBlockFriendDto.photoBase) && epx.f(this.onlineInfo, podcastsBlockFriendDto.onlineInfo) && epx.f(this.online, podcastsBlockFriendDto.online) && epx.f(this.firstName, podcastsBlockFriendDto.firstName) && epx.f(this.lastName, podcastsBlockFriendDto.lastName) && epx.f(this.canAccessClosed, podcastsBlockFriendDto.canAccessClosed) && epx.f(this.isClosed, podcastsBlockFriendDto.isClosed);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.sex;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.screenName;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo50;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo100;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photoBase;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        UsersOnlineInfoDto usersOnlineInfoDto = this.onlineInfo;
        int hashCode7 = (hashCode6 + (usersOnlineInfoDto == null ? 0 : usersOnlineInfoDto.hashCode())) * 31;
        Boolean bool = this.online;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.firstName;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.lastName;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool2 = this.canAccessClosed;
        int hashCode11 = (hashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isClosed;
        return hashCode11 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PodcastsBlockFriendDto(id=");
        sb.append(this.id);
        sb.append(", sex=");
        sb.append(this.sex);
        sb.append(", screenName=");
        sb.append(this.screenName);
        sb.append(", photo50=");
        sb.append(this.photo50);
        sb.append(", photo100=");
        sb.append(this.photo100);
        sb.append(", photoBase=");
        sb.append(this.photoBase);
        sb.append(", onlineInfo=");
        sb.append(this.onlineInfo);
        sb.append(", online=");
        sb.append(this.online);
        sb.append(", firstName=");
        sb.append(this.firstName);
        sb.append(", lastName=");
        sb.append(this.lastName);
        sb.append(", canAccessClosed=");
        sb.append(this.canAccessClosed);
        sb.append(", isClosed=");
        return tn.a(sb, this.isClosed, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.sex;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.screenName);
        parcel.writeString(this.photo50);
        parcel.writeString(this.photo100);
        parcel.writeString(this.photoBase);
        parcel.writeParcelable(this.onlineInfo, i);
        Boolean bool = this.online;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        Boolean bool2 = this.canAccessClosed;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.isClosed;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
    }

    public PodcastsBlockFriendDto(Integer num, Integer num2, String str, String str2, String str3, String str4, UsersOnlineInfoDto usersOnlineInfoDto, Boolean bool, String str5, String str6, Boolean bool2, Boolean bool3) {
        this.id = num;
        this.sex = num2;
        this.screenName = str;
        this.photo50 = str2;
        this.photo100 = str3;
        this.photoBase = str4;
        this.onlineInfo = usersOnlineInfoDto;
        this.online = bool;
        this.firstName = str5;
        this.lastName = str6;
        this.canAccessClosed = bool2;
        this.isClosed = bool3;
    }

    public /* synthetic */ PodcastsBlockFriendDto(Integer num, Integer num2, String str, String str2, String str3, String str4, UsersOnlineInfoDto usersOnlineInfoDto, Boolean bool, String str5, String str6, Boolean bool2, Boolean bool3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : usersOnlineInfoDto, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : bool2, (i & 2048) != 0 ? null : bool3);
    }
}
