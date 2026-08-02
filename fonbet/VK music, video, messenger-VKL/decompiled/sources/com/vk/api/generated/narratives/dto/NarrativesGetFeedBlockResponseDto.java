package com.vk.api.generated.narratives.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemRecommendedNarrativesBlockDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NarrativesGetFeedBlockResponseDto.kt */
/* loaded from: classes15.dex */
public final class NarrativesGetFeedBlockResponseDto implements Parcelable {
    public static final Parcelable.Creator<NarrativesGetFeedBlockResponseDto> CREATOR = new a();

    @pmi0("block")
    private final NewsfeedItemRecommendedNarrativesBlockDto block;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("start_from")
    private final String startFrom;

    /* compiled from: NarrativesGetFeedBlockResponseDto.kt */
    public static final class a implements Parcelable.Creator<NarrativesGetFeedBlockResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final NarrativesGetFeedBlockResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2 = null;
            NewsfeedItemRecommendedNarrativesBlockDto createFromParcel = parcel.readInt() == 0 ? null : NewsfeedItemRecommendedNarrativesBlockDto.CREATOR.createFromParcel(parcel);
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(NarrativesGetFeedBlockResponseDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = bo.b(NarrativesGetFeedBlockResponseDto.class, parcel, arrayList3, i, 1);
                }
                arrayList2 = arrayList3;
            }
            return new NarrativesGetFeedBlockResponseDto(createFromParcel, arrayList, arrayList2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NarrativesGetFeedBlockResponseDto[] newArray(int i) {
            return new NarrativesGetFeedBlockResponseDto[i];
        }
    }

    public NarrativesGetFeedBlockResponseDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NarrativesGetFeedBlockResponseDto)) {
            return false;
        }
        NarrativesGetFeedBlockResponseDto narrativesGetFeedBlockResponseDto = (NarrativesGetFeedBlockResponseDto) obj;
        return epx.f(this.block, narrativesGetFeedBlockResponseDto.block) && epx.f(this.profiles, narrativesGetFeedBlockResponseDto.profiles) && epx.f(this.groups, narrativesGetFeedBlockResponseDto.groups) && epx.f(this.startFrom, narrativesGetFeedBlockResponseDto.startFrom);
    }

    public final int hashCode() {
        NewsfeedItemRecommendedNarrativesBlockDto newsfeedItemRecommendedNarrativesBlockDto = this.block;
        int hashCode = (newsfeedItemRecommendedNarrativesBlockDto == null ? 0 : newsfeedItemRecommendedNarrativesBlockDto.hashCode()) * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.startFrom;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NarrativesGetFeedBlockResponseDto(block=");
        sb.append(this.block);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", startFrom=");
        return ho8.a(sb, this.startFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        NewsfeedItemRecommendedNarrativesBlockDto newsfeedItemRecommendedNarrativesBlockDto = this.block;
        if (newsfeedItemRecommendedNarrativesBlockDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedItemRecommendedNarrativesBlockDto.writeToParcel(parcel, i);
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
        parcel.writeString(this.startFrom);
    }

    public NarrativesGetFeedBlockResponseDto(NewsfeedItemRecommendedNarrativesBlockDto newsfeedItemRecommendedNarrativesBlockDto, List<UsersUserFullDto> list, List<GroupsGroupFullDto> list2, String str) {
        this.block = newsfeedItemRecommendedNarrativesBlockDto;
        this.profiles = list;
        this.groups = list2;
        this.startFrom = str;
    }

    public /* synthetic */ NarrativesGetFeedBlockResponseDto(NewsfeedItemRecommendedNarrativesBlockDto newsfeedItemRecommendedNarrativesBlockDto, List list, List list2, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : newsfeedItemRecommendedNarrativesBlockDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : str);
    }
}
