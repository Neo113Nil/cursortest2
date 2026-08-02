package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.b;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.uxpolls.dto.UxpollsPollDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoGetSimilarResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetSimilarResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetSimilarResponseDto> CREATOR = new a();

    @pmi0(b.JSON_KEY_ADS)
    private final VideoDiscoverAdsDto ads;

    @pmi0("banner")
    private final VideoDiscoverBannerDto banner;

    @pmi0("count")
    private final int count;

    @pmi0("current_video")
    private final VideoVideoFullDto currentVideo;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<VideoItemsInSimilarDto> items;

    @pmi0("payload")
    private final String payload;

    @pmi0("polls")
    private final List<UxpollsPollDto> polls;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("tabs")
    private final List<VideoRelatedTabDto> tabs;

    /* compiled from: VideoGetSimilarResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetSimilarResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetSimilarResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = en.a(VideoItemsInSimilarDto.CREATOR, parcel, arrayList4, i2, 1);
            }
            ArrayList arrayList5 = null;
            VideoDiscoverAdsDto createFromParcel = parcel.readInt() == 0 ? null : VideoDiscoverAdsDto.CREATOR.createFromParcel(parcel);
            VideoDiscoverBannerDto createFromParcel2 = parcel.readInt() == 0 ? null : VideoDiscoverBannerDto.CREATOR.createFromParcel(parcel);
            VideoVideoFullDto videoVideoFullDto = (VideoVideoFullDto) parcel.readParcelable(VideoGetSimilarResponseDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(VideoGetSimilarResponseDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList2 = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = bo.b(VideoGetSimilarResponseDto.class, parcel, arrayList2, i4, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList3 = new ArrayList(readInt5);
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = bo.b(VideoGetSimilarResponseDto.class, parcel, arrayList3, i5, 1);
                }
            }
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt6 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt6);
                while (i != readInt6) {
                    i = en.a(VideoRelatedTabDto.CREATOR, parcel, arrayList6, i, 1);
                }
                arrayList5 = arrayList6;
            }
            return new VideoGetSimilarResponseDto(readInt, arrayList4, createFromParcel, createFromParcel2, videoVideoFullDto, arrayList, arrayList2, arrayList3, readString, arrayList5);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetSimilarResponseDto[] newArray(int i) {
            return new VideoGetSimilarResponseDto[i];
        }
    }

    public VideoGetSimilarResponseDto(int i, List<VideoItemsInSimilarDto> list, VideoDiscoverAdsDto videoDiscoverAdsDto, VideoDiscoverBannerDto videoDiscoverBannerDto, VideoVideoFullDto videoVideoFullDto, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, List<UxpollsPollDto> list4, String str, List<VideoRelatedTabDto> list5) {
        this.count = i;
        this.items = list;
        this.ads = videoDiscoverAdsDto;
        this.banner = videoDiscoverBannerDto;
        this.currentVideo = videoVideoFullDto;
        this.profiles = list2;
        this.groups = list3;
        this.polls = list4;
        this.payload = str;
        this.tabs = list5;
    }

    public final VideoDiscoverAdsDto d() {
        return this.ads;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<GroupsGroupFullDto> e() {
        return this.groups;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoGetSimilarResponseDto)) {
            return false;
        }
        VideoGetSimilarResponseDto videoGetSimilarResponseDto = (VideoGetSimilarResponseDto) obj;
        return this.count == videoGetSimilarResponseDto.count && epx.f(this.items, videoGetSimilarResponseDto.items) && epx.f(this.ads, videoGetSimilarResponseDto.ads) && epx.f(this.banner, videoGetSimilarResponseDto.banner) && epx.f(this.currentVideo, videoGetSimilarResponseDto.currentVideo) && epx.f(this.profiles, videoGetSimilarResponseDto.profiles) && epx.f(this.groups, videoGetSimilarResponseDto.groups) && epx.f(this.polls, videoGetSimilarResponseDto.polls) && epx.f(this.payload, videoGetSimilarResponseDto.payload) && epx.f(this.tabs, videoGetSimilarResponseDto.tabs);
    }

    public final List<VideoItemsInSimilarDto> f() {
        return this.items;
    }

    public final String g() {
        return this.payload;
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        VideoDiscoverAdsDto videoDiscoverAdsDto = this.ads;
        int hashCode = (a2 + (videoDiscoverAdsDto == null ? 0 : videoDiscoverAdsDto.hashCode())) * 31;
        VideoDiscoverBannerDto videoDiscoverBannerDto = this.banner;
        int hashCode2 = (hashCode + (videoDiscoverBannerDto == null ? 0 : videoDiscoverBannerDto.hashCode())) * 31;
        VideoVideoFullDto videoVideoFullDto = this.currentVideo;
        int hashCode3 = (hashCode2 + (videoVideoFullDto == null ? 0 : videoVideoFullDto.hashCode())) * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<UxpollsPollDto> list3 = this.polls;
        int hashCode6 = (hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str = this.payload;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        List<VideoRelatedTabDto> list4 = this.tabs;
        return hashCode7 + (list4 != null ? list4.hashCode() : 0);
    }

    public final List<UxpollsPollDto> i() {
        return this.polls;
    }

    public final List<UsersUserFullDto> j() {
        return this.profiles;
    }

    public final List<VideoRelatedTabDto> k() {
        return this.tabs;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoGetSimilarResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", ads=");
        sb.append(this.ads);
        sb.append(", banner=");
        sb.append(this.banner);
        sb.append(", currentVideo=");
        sb.append(this.currentVideo);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", polls=");
        sb.append(this.polls);
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append(", tabs=");
        return ms9.a(')', sb, this.tabs);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((VideoItemsInSimilarDto) a2.next()).writeToParcel(parcel, i);
        }
        VideoDiscoverAdsDto videoDiscoverAdsDto = this.ads;
        if (videoDiscoverAdsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoDiscoverAdsDto.writeToParcel(parcel, i);
        }
        VideoDiscoverBannerDto videoDiscoverBannerDto = this.banner;
        if (videoDiscoverBannerDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoDiscoverBannerDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.currentVideo, i);
        List<UsersUserFullDto> list = this.profiles;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<GroupsGroupFullDto> list2 = this.groups;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        List<UxpollsPollDto> list3 = this.polls;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        parcel.writeString(this.payload);
        List<VideoRelatedTabDto> list4 = this.tabs;
        if (list4 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f4 = dn.f(parcel, list4, 1);
        while (f4.hasNext()) {
            ((VideoRelatedTabDto) f4.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VideoGetSimilarResponseDto(int i, List list, VideoDiscoverAdsDto videoDiscoverAdsDto, VideoDiscoverBannerDto videoDiscoverBannerDto, VideoVideoFullDto videoVideoFullDto, List list2, List list3, List list4, String str, List list5, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : videoDiscoverAdsDto, (i2 & 8) != 0 ? null : videoDiscoverBannerDto, (i2 & 16) != 0 ? null : videoVideoFullDto, (i2 & 32) != 0 ? null : list2, (i2 & 64) != 0 ? null : list3, (i2 & 128) != 0 ? null : list4, (i2 & 256) != 0 ? null : str, (i2 & 512) != 0 ? null : list5);
    }
}
