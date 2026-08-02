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
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoGetVideoMusicDiscoverResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetVideoMusicDiscoverResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetVideoMusicDiscoverResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("current_video")
    private final VideoVideoFullDto currentVideo;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("payload")
    private final String payload;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("videos")
    private final List<VideoVideoFullDto> videos;

    /* compiled from: VideoGetVideoMusicDiscoverResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetVideoMusicDiscoverResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetVideoMusicDiscoverResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = bo.b(VideoGetVideoMusicDiscoverResponseDto.class, parcel, arrayList3, i2, 1);
            }
            VideoVideoFullDto videoVideoFullDto = (VideoVideoFullDto) parcel.readParcelable(VideoGetVideoMusicDiscoverResponseDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(VideoGetVideoMusicDiscoverResponseDto.class, parcel, arrayList4, i3, 1);
                }
                arrayList = arrayList4;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = bo.b(VideoGetVideoMusicDiscoverResponseDto.class, parcel, arrayList5, i, 1);
                }
                arrayList2 = arrayList5;
            }
            return new VideoGetVideoMusicDiscoverResponseDto(readInt, arrayList3, videoVideoFullDto, arrayList, arrayList2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetVideoMusicDiscoverResponseDto[] newArray(int i) {
            return new VideoGetVideoMusicDiscoverResponseDto[i];
        }
    }

    public VideoGetVideoMusicDiscoverResponseDto(int i, List<VideoVideoFullDto> list, VideoVideoFullDto videoVideoFullDto, List<GroupsGroupFullDto> list2, List<UsersUserFullDto> list3, String str) {
        this.count = i;
        this.videos = list;
        this.currentVideo = videoVideoFullDto;
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
        if (!(obj instanceof VideoGetVideoMusicDiscoverResponseDto)) {
            return false;
        }
        VideoGetVideoMusicDiscoverResponseDto videoGetVideoMusicDiscoverResponseDto = (VideoGetVideoMusicDiscoverResponseDto) obj;
        return this.count == videoGetVideoMusicDiscoverResponseDto.count && epx.f(this.videos, videoGetVideoMusicDiscoverResponseDto.videos) && epx.f(this.currentVideo, videoGetVideoMusicDiscoverResponseDto.currentVideo) && epx.f(this.groups, videoGetVideoMusicDiscoverResponseDto.groups) && epx.f(this.profiles, videoGetVideoMusicDiscoverResponseDto.profiles) && epx.f(this.payload, videoGetVideoMusicDiscoverResponseDto.payload);
    }

    public final List<UsersUserFullDto> f() {
        return this.profiles;
    }

    public final List<VideoVideoFullDto> g() {
        return this.videos;
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.videos);
        VideoVideoFullDto videoVideoFullDto = this.currentVideo;
        int hashCode = (a2 + (videoVideoFullDto == null ? 0 : videoVideoFullDto.hashCode())) * 31;
        List<GroupsGroupFullDto> list = this.groups;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<UsersUserFullDto> list2 = this.profiles;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.payload;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoGetVideoMusicDiscoverResponseDto(count=");
        sb.append(this.count);
        sb.append(", videos=");
        sb.append(this.videos);
        sb.append(", currentVideo=");
        sb.append(this.currentVideo);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", payload=");
        return ho8.a(sb, this.payload, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.videos);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeParcelable(this.currentVideo, i);
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

    public /* synthetic */ VideoGetVideoMusicDiscoverResponseDto(int i, List list, VideoVideoFullDto videoVideoFullDto, List list2, List list3, String str, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : videoVideoFullDto, (i2 & 8) != 0 ? null : list2, (i2 & 16) != 0 ? null : list3, (i2 & 32) != 0 ? null : str);
    }
}
