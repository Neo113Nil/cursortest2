package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoFeedClipsBlockItemsGroupsFullResultDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoFeedClipsBlockItemsGroupsFullResultDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoFeedClipsBlockItemsGroupsFullResultDto> CREATOR = new a();

    @pmi0("block_info")
    private final ShortVideoFeedClipsBlockItemsBlockInfoDto blockInfo;

    @pmi0("block_title")
    private final String blockTitle;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<VideoVideoFullDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("questionnaires")
    private final List<ShortVideoQuestionnaireDto> questionnaires;

    /* compiled from: ShortVideoFeedClipsBlockItemsGroupsFullResultDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoFeedClipsBlockItemsGroupsFullResultDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoFeedClipsBlockItemsGroupsFullResultDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            int readInt = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = bo.b(ShortVideoFeedClipsBlockItemsGroupsFullResultDto.class, parcel, arrayList4, i2, 1);
            }
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(ShortVideoFeedClipsBlockItemsGroupsFullResultDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = bo.b(ShortVideoFeedClipsBlockItemsGroupsFullResultDto.class, parcel, arrayList2, i4, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList3 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = bo.b(ShortVideoFeedClipsBlockItemsGroupsFullResultDto.class, parcel, arrayList3, i, 1);
                }
            }
            return new ShortVideoFeedClipsBlockItemsGroupsFullResultDto(arrayList4, readString, arrayList, arrayList2, arrayList3, parcel.readString(), parcel.readInt() != 0 ? ShortVideoFeedClipsBlockItemsBlockInfoDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoFeedClipsBlockItemsGroupsFullResultDto[] newArray(int i) {
            return new ShortVideoFeedClipsBlockItemsGroupsFullResultDto[i];
        }
    }

    public ShortVideoFeedClipsBlockItemsGroupsFullResultDto(List<VideoVideoFullDto> list, String str, List<ShortVideoQuestionnaireDto> list2, List<UsersUserFullDto> list3, List<GroupsGroupFullDto> list4, String str2, ShortVideoFeedClipsBlockItemsBlockInfoDto shortVideoFeedClipsBlockItemsBlockInfoDto) {
        this.items = list;
        this.nextFrom = str;
        this.questionnaires = list2;
        this.profiles = list3;
        this.groups = list4;
        this.blockTitle = str2;
        this.blockInfo = shortVideoFeedClipsBlockItemsBlockInfoDto;
    }

    public final String d() {
        return this.blockTitle;
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
        if (!(obj instanceof ShortVideoFeedClipsBlockItemsGroupsFullResultDto)) {
            return false;
        }
        ShortVideoFeedClipsBlockItemsGroupsFullResultDto shortVideoFeedClipsBlockItemsGroupsFullResultDto = (ShortVideoFeedClipsBlockItemsGroupsFullResultDto) obj;
        return epx.f(this.items, shortVideoFeedClipsBlockItemsGroupsFullResultDto.items) && epx.f(this.nextFrom, shortVideoFeedClipsBlockItemsGroupsFullResultDto.nextFrom) && epx.f(this.questionnaires, shortVideoFeedClipsBlockItemsGroupsFullResultDto.questionnaires) && epx.f(this.profiles, shortVideoFeedClipsBlockItemsGroupsFullResultDto.profiles) && epx.f(this.groups, shortVideoFeedClipsBlockItemsGroupsFullResultDto.groups) && epx.f(this.blockTitle, shortVideoFeedClipsBlockItemsGroupsFullResultDto.blockTitle) && epx.f(this.blockInfo, shortVideoFeedClipsBlockItemsGroupsFullResultDto.blockInfo);
    }

    public final List<VideoVideoFullDto> f() {
        return this.items;
    }

    public final String g() {
        return this.nextFrom;
    }

    public final int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        String str = this.nextFrom;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<ShortVideoQuestionnaireDto> list = this.questionnaires;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<UsersUserFullDto> list2 = this.profiles;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<GroupsGroupFullDto> list3 = this.groups;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str2 = this.blockTitle;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ShortVideoFeedClipsBlockItemsBlockInfoDto shortVideoFeedClipsBlockItemsBlockInfoDto = this.blockInfo;
        return hashCode6 + (shortVideoFeedClipsBlockItemsBlockInfoDto != null ? shortVideoFeedClipsBlockItemsBlockInfoDto.hashCode() : 0);
    }

    public final List<UsersUserFullDto> i() {
        return this.profiles;
    }

    public final List<ShortVideoQuestionnaireDto> j() {
        return this.questionnaires;
    }

    public final String toString() {
        return "ShortVideoFeedClipsBlockItemsGroupsFullResultDto(items=" + this.items + ", nextFrom=" + this.nextFrom + ", questionnaires=" + this.questionnaires + ", profiles=" + this.profiles + ", groups=" + this.groups + ", blockTitle=" + this.blockTitle + ", blockInfo=" + this.blockInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.nextFrom);
        List<ShortVideoQuestionnaireDto> list = this.questionnaires;
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
        List<GroupsGroupFullDto> list3 = this.groups;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        parcel.writeString(this.blockTitle);
        ShortVideoFeedClipsBlockItemsBlockInfoDto shortVideoFeedClipsBlockItemsBlockInfoDto = this.blockInfo;
        if (shortVideoFeedClipsBlockItemsBlockInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoFeedClipsBlockItemsBlockInfoDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ShortVideoFeedClipsBlockItemsGroupsFullResultDto(List list, String str, List list2, List list3, List list4, String str2, ShortVideoFeedClipsBlockItemsBlockInfoDto shortVideoFeedClipsBlockItemsBlockInfoDto, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : list4, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : shortVideoFeedClipsBlockItemsBlockInfoDto);
    }
}
