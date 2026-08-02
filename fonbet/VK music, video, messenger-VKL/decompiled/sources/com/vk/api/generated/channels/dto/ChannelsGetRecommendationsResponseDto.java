package com.vk.api.generated.channels.dto;

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
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ChannelsGetRecommendationsResponseDto.kt */
/* loaded from: classes14.dex */
public final class ChannelsGetRecommendationsResponseDto implements Parcelable {
    public static final Parcelable.Creator<ChannelsGetRecommendationsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<ChannelsRecommendationsResponseItemDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("recommendations_version")
    private final Integer recommendationsVersion;

    @pmi0("track_codes")
    private final List<String> trackCodes;

    /* compiled from: ChannelsGetRecommendationsResponseDto.kt */
    public static final class a implements Parcelable.Creator<ChannelsGetRecommendationsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsGetRecommendationsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = en.a(ChannelsRecommendationsResponseItemDto.CREATOR, parcel, arrayList3, i2, 1);
            }
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(ChannelsGetRecommendationsResponseDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = bo.b(ChannelsGetRecommendationsResponseDto.class, parcel, arrayList4, i, 1);
                }
                arrayList2 = arrayList4;
            }
            return new ChannelsGetRecommendationsResponseDto(readInt, arrayList3, valueOf, arrayList, arrayList2, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsGetRecommendationsResponseDto[] newArray(int i) {
            return new ChannelsGetRecommendationsResponseDto[i];
        }
    }

    public ChannelsGetRecommendationsResponseDto(int i, List<ChannelsRecommendationsResponseItemDto> list, Integer num, List<GroupsGroupFullDto> list2, List<UsersUserFullDto> list3, List<String> list4) {
        this.count = i;
        this.items = list;
        this.recommendationsVersion = num;
        this.groups = list2;
        this.profiles = list3;
        this.trackCodes = list4;
    }

    public final List<GroupsGroupFullDto> d() {
        return this.groups;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<ChannelsRecommendationsResponseItemDto> e() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsGetRecommendationsResponseDto)) {
            return false;
        }
        ChannelsGetRecommendationsResponseDto channelsGetRecommendationsResponseDto = (ChannelsGetRecommendationsResponseDto) obj;
        return this.count == channelsGetRecommendationsResponseDto.count && epx.f(this.items, channelsGetRecommendationsResponseDto.items) && epx.f(this.recommendationsVersion, channelsGetRecommendationsResponseDto.recommendationsVersion) && epx.f(this.groups, channelsGetRecommendationsResponseDto.groups) && epx.f(this.profiles, channelsGetRecommendationsResponseDto.profiles) && epx.f(this.trackCodes, channelsGetRecommendationsResponseDto.trackCodes);
    }

    public final List<String> f() {
        return this.trackCodes;
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        Integer num = this.recommendationsVersion;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        List<GroupsGroupFullDto> list = this.groups;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<UsersUserFullDto> list2 = this.profiles;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.trackCodes;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsGetRecommendationsResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", recommendationsVersion=");
        sb.append(this.recommendationsVersion);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", trackCodes=");
        return ms9.a(')', sb, this.trackCodes);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((ChannelsRecommendationsResponseItemDto) a2.next()).writeToParcel(parcel, i);
        }
        Integer num = this.recommendationsVersion;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
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
        parcel.writeStringList(this.trackCodes);
    }

    public /* synthetic */ ChannelsGetRecommendationsResponseDto(int i, List list, Integer num, List list2, List list3, List list4, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : list2, (i2 & 16) != 0 ? null : list3, (i2 & 32) != 0 ? null : list4);
    }
}
