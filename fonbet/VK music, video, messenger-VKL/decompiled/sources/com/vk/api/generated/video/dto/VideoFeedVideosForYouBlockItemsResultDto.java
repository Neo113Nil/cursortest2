package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bh10;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: VideoFeedVideosForYouBlockItemsResultDto.kt */
/* loaded from: classes15.dex */
public final class VideoFeedVideosForYouBlockItemsResultDto implements Parcelable {
    public static final Parcelable.Creator<VideoFeedVideosForYouBlockItemsResultDto> CREATOR = new a();

    @pmi0("button")
    private final BaseLinkButtonDto button;

    @pmi0("date")
    private final int date;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<VideoVideoFullDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("source_id")
    private final UserId sourceId;

    @pmi0("title")
    private final String title;

    /* compiled from: VideoFeedVideosForYouBlockItemsResultDto.kt */
    public static final class a implements Parcelable.Creator<VideoFeedVideosForYouBlockItemsResultDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoFeedVideosForYouBlockItemsResultDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = bo.b(VideoFeedVideosForYouBlockItemsResultDto.class, parcel, arrayList2, i2, 1);
            }
            UserId userId = (UserId) parcel.readParcelable(VideoFeedVideosForYouBlockItemsResultDto.class.getClassLoader());
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(VideoFeedVideosForYouBlockItemsResultDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList3 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = bo.b(VideoFeedVideosForYouBlockItemsResultDto.class, parcel, arrayList3, i, 1);
                }
            }
            return new VideoFeedVideosForYouBlockItemsResultDto(arrayList2, userId, readInt2, arrayList, arrayList3, parcel.readString(), (BaseLinkButtonDto) parcel.readParcelable(VideoFeedVideosForYouBlockItemsResultDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoFeedVideosForYouBlockItemsResultDto[] newArray(int i) {
            return new VideoFeedVideosForYouBlockItemsResultDto[i];
        }
    }

    public VideoFeedVideosForYouBlockItemsResultDto(List<VideoVideoFullDto> list, UserId userId, int i, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, String str, BaseLinkButtonDto baseLinkButtonDto) {
        this.items = list;
        this.sourceId = userId;
        this.date = i;
        this.profiles = list2;
        this.groups = list3;
        this.title = str;
        this.button = baseLinkButtonDto;
    }

    public final int d() {
        return this.date;
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
        if (!(obj instanceof VideoFeedVideosForYouBlockItemsResultDto)) {
            return false;
        }
        VideoFeedVideosForYouBlockItemsResultDto videoFeedVideosForYouBlockItemsResultDto = (VideoFeedVideosForYouBlockItemsResultDto) obj;
        return epx.f(this.items, videoFeedVideosForYouBlockItemsResultDto.items) && epx.f(this.sourceId, videoFeedVideosForYouBlockItemsResultDto.sourceId) && this.date == videoFeedVideosForYouBlockItemsResultDto.date && epx.f(this.profiles, videoFeedVideosForYouBlockItemsResultDto.profiles) && epx.f(this.groups, videoFeedVideosForYouBlockItemsResultDto.groups) && epx.f(this.title, videoFeedVideosForYouBlockItemsResultDto.title) && epx.f(this.button, videoFeedVideosForYouBlockItemsResultDto.button);
    }

    public final List<VideoVideoFullDto> f() {
        return this.items;
    }

    public final List<UsersUserFullDto> g() {
        return this.profiles;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = shy.a(this.date, bh10.a(this.items.hashCode() * 31, 31, this.sourceId.b), 31);
        List<UsersUserFullDto> list = this.profiles;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.title;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        BaseLinkButtonDto baseLinkButtonDto = this.button;
        return hashCode3 + (baseLinkButtonDto != null ? baseLinkButtonDto.hashCode() : 0);
    }

    public final UserId i() {
        return this.sourceId;
    }

    public final String toString() {
        return "VideoFeedVideosForYouBlockItemsResultDto(items=" + this.items + ", sourceId=" + this.sourceId + ", date=" + this.date + ", profiles=" + this.profiles + ", groups=" + this.groups + ", title=" + this.title + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeParcelable(this.sourceId, i);
        parcel.writeInt(this.date);
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
        parcel.writeString(this.title);
        parcel.writeParcelable(this.button, i);
    }

    public /* synthetic */ VideoFeedVideosForYouBlockItemsResultDto(List list, UserId userId, int i, List list2, List list3, String str, BaseLinkButtonDto baseLinkButtonDto, int i2, zcl zclVar) {
        this(list, userId, i, (i2 & 8) != 0 ? null : list2, (i2 & 16) != 0 ? null : list3, (i2 & 32) != 0 ? null : str, (i2 & 64) != 0 ? null : baseLinkButtonDto);
    }
}
