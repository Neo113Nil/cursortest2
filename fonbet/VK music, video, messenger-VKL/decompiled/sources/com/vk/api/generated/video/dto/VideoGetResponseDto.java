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
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: VideoGetResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<VideoVideoFullDto> items;

    @pmi0("max_attached_short_videos")
    private final Integer maxAttachedShortVideos;

    @pmi0("offset_from")
    private final Integer offsetFrom;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: VideoGetResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = bo.b(VideoGetResponseDto.class, parcel, arrayList3, i2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(VideoGetResponseDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList2 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = bo.b(VideoGetResponseDto.class, parcel, arrayList2, i, 1);
                }
            }
            return new VideoGetResponseDto(readInt, arrayList3, arrayList, arrayList2, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetResponseDto[] newArray(int i) {
            return new VideoGetResponseDto[i];
        }
    }

    public VideoGetResponseDto(int i, List<VideoVideoFullDto> list, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, Integer num, Integer num2) {
        this.count = i;
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
        this.maxAttachedShortVideos = num;
        this.offsetFrom = num2;
    }

    public final List<GroupsGroupFullDto> d() {
        return this.groups;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<VideoVideoFullDto> e() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoGetResponseDto)) {
            return false;
        }
        VideoGetResponseDto videoGetResponseDto = (VideoGetResponseDto) obj;
        return this.count == videoGetResponseDto.count && epx.f(this.items, videoGetResponseDto.items) && epx.f(this.profiles, videoGetResponseDto.profiles) && epx.f(this.groups, videoGetResponseDto.groups) && epx.f(this.maxAttachedShortVideos, videoGetResponseDto.maxAttachedShortVideos) && epx.f(this.offsetFrom, videoGetResponseDto.offsetFrom);
    }

    public final Integer f() {
        return this.maxAttachedShortVideos;
    }

    public final List<UsersUserFullDto> g() {
        return this.profiles;
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        List<UsersUserFullDto> list = this.profiles;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.maxAttachedShortVideos;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.offsetFrom;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoGetResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", maxAttachedShortVideos=");
        sb.append(this.maxAttachedShortVideos);
        sb.append(", offsetFrom=");
        return uqi.b(sb, this.offsetFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
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
        Integer num = this.maxAttachedShortVideos;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.offsetFrom;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ VideoGetResponseDto(int i, List list, List list2, List list3, Integer num, Integer num2, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : list3, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : num2);
    }
}
