package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoGetMusicMixResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetMusicMixResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetMusicMixResponseDto> CREATOR = new a();

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("payload")
    private final String payload;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("videos")
    private final List<VideoVideoFullDto> videos;

    /* compiled from: VideoGetMusicMixResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetMusicMixResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetMusicMixResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = bo.b(VideoGetMusicMixResponseDto.class, parcel, arrayList2, i2, 1);
            }
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(VideoGetMusicMixResponseDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = bo.b(VideoGetMusicMixResponseDto.class, parcel, arrayList3, i, 1);
                }
            }
            return new VideoGetMusicMixResponseDto(arrayList2, arrayList, arrayList3, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetMusicMixResponseDto[] newArray(int i) {
            return new VideoGetMusicMixResponseDto[i];
        }
    }

    public VideoGetMusicMixResponseDto(List<VideoVideoFullDto> list, List<GroupsGroupFullDto> list2, List<UsersUserFullDto> list3, String str) {
        this.videos = list;
        this.groups = list2;
        this.profiles = list3;
        this.payload = str;
    }

    public final List<GroupsGroupFullDto> d() {
        return this.groups;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.payload;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoGetMusicMixResponseDto)) {
            return false;
        }
        VideoGetMusicMixResponseDto videoGetMusicMixResponseDto = (VideoGetMusicMixResponseDto) obj;
        return epx.f(this.videos, videoGetMusicMixResponseDto.videos) && epx.f(this.groups, videoGetMusicMixResponseDto.groups) && epx.f(this.profiles, videoGetMusicMixResponseDto.profiles) && epx.f(this.payload, videoGetMusicMixResponseDto.payload);
    }

    public final List<UsersUserFullDto> f() {
        return this.profiles;
    }

    public final List<VideoVideoFullDto> g() {
        return this.videos;
    }

    public final int hashCode() {
        int hashCode = this.videos.hashCode() * 31;
        List<GroupsGroupFullDto> list = this.groups;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<UsersUserFullDto> list2 = this.profiles;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.payload;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoGetMusicMixResponseDto(videos=");
        sb.append(this.videos);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", payload=");
        return ho8.a(sb, this.payload, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.videos);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        List<GroupsGroupFullDto> list = this.groups;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<UsersUserFullDto> list2 = this.profiles;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        parcel.writeString(this.payload);
    }

    public /* synthetic */ VideoGetMusicMixResponseDto(List list, List list2, List list3, String str, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : str);
    }
}
