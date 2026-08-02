package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BasePropertyExistsDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoStopStreamingResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoStopStreamingResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoStopStreamingResponseDto> CREATOR = new a();

    @pmi0("balance")
    private final Integer balance;

    @pmi0("can_create_story")
    private final BasePropertyExistsDto canCreateStory;

    @pmi0("friends_viewers")
    private final List<UsersUserFullDto> friendsViewers;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("unique_viewers")
    private final Integer uniqueViewers;

    @pmi0("url")
    private final String url;

    /* compiled from: VideoStopStreamingResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoStopStreamingResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoStopStreamingResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(VideoStopStreamingResponseDto.class, parcel, arrayList, i, 1);
                }
            }
            BasePropertyExistsDto basePropertyExistsDto = (BasePropertyExistsDto) parcel.readParcelable(VideoStopStreamingResponseDto.class.getClassLoader());
            int i2 = 0;
            ArrayList arrayList4 = arrayList;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(VideoStopStreamingResponseDto.class, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                while (i2 != readInt3) {
                    i2 = bo.b(VideoStopStreamingResponseDto.class, parcel, arrayList3, i2, 1);
                }
            }
            return new VideoStopStreamingResponseDto(valueOf, valueOf2, arrayList4, basePropertyExistsDto, readString, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoStopStreamingResponseDto[] newArray(int i) {
            return new VideoStopStreamingResponseDto[i];
        }
    }

    public VideoStopStreamingResponseDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final List<UsersUserFullDto> d() {
        return this.friendsViewers;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.uniqueViewers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoStopStreamingResponseDto)) {
            return false;
        }
        VideoStopStreamingResponseDto videoStopStreamingResponseDto = (VideoStopStreamingResponseDto) obj;
        return epx.f(this.balance, videoStopStreamingResponseDto.balance) && epx.f(this.uniqueViewers, videoStopStreamingResponseDto.uniqueViewers) && epx.f(this.friendsViewers, videoStopStreamingResponseDto.friendsViewers) && this.canCreateStory == videoStopStreamingResponseDto.canCreateStory && epx.f(this.url, videoStopStreamingResponseDto.url) && epx.f(this.profiles, videoStopStreamingResponseDto.profiles) && epx.f(this.groups, videoStopStreamingResponseDto.groups);
    }

    public final int hashCode() {
        Integer num = this.balance;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.uniqueViewers;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<UsersUserFullDto> list = this.friendsViewers;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        BasePropertyExistsDto basePropertyExistsDto = this.canCreateStory;
        int hashCode4 = (hashCode3 + (basePropertyExistsDto == null ? 0 : basePropertyExistsDto.hashCode())) * 31;
        String str = this.url;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        List<UsersUserFullDto> list2 = this.profiles;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<GroupsGroupFullDto> list3 = this.groups;
        return hashCode6 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoStopStreamingResponseDto(balance=");
        sb.append(this.balance);
        sb.append(", uniqueViewers=");
        sb.append(this.uniqueViewers);
        sb.append(", friendsViewers=");
        sb.append(this.friendsViewers);
        sb.append(", canCreateStory=");
        sb.append(this.canCreateStory);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        return ms9.a(')', sb, this.groups);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.balance;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.uniqueViewers;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        List<UsersUserFullDto> list = this.friendsViewers;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeParcelable(this.canCreateStory, i);
        parcel.writeString(this.url);
        List<UsersUserFullDto> list2 = this.profiles;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        List<GroupsGroupFullDto> list3 = this.groups;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f3 = dn.f(parcel, list3, 1);
        while (f3.hasNext()) {
            parcel.writeParcelable((Parcelable) f3.next(), i);
        }
    }

    public VideoStopStreamingResponseDto(Integer num, Integer num2, List<UsersUserFullDto> list, BasePropertyExistsDto basePropertyExistsDto, String str, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3) {
        this.balance = num;
        this.uniqueViewers = num2;
        this.friendsViewers = list;
        this.canCreateStory = basePropertyExistsDto;
        this.url = str;
        this.profiles = list2;
        this.groups = list3;
    }

    public /* synthetic */ VideoStopStreamingResponseDto(Integer num, Integer num2, List list, BasePropertyExistsDto basePropertyExistsDto, String str, List list2, List list3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : basePropertyExistsDto, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : list3);
    }
}
