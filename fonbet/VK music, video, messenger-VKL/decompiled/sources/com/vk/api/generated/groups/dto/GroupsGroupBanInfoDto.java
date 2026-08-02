package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsGroupBanInfoDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGroupBanInfoDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGroupBanInfoDto> CREATOR = new a();

    @pmi0("comment")
    private final String comment;

    @pmi0("end_date")
    private final Integer endDate;

    @pmi0("geo_blocks")
    private final List<GroupsGroupBanInfoGeoBlockDto> geoBlocks;

    @pmi0("reason")
    private final GroupsBanInfoReasonDto reason;

    /* compiled from: GroupsGroupBanInfoDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGroupBanInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGroupBanInfoDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            GroupsBanInfoReasonDto createFromParcel = parcel.readInt() == 0 ? null : GroupsBanInfoReasonDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(GroupsGroupBanInfoGeoBlockDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new GroupsGroupBanInfoDto(readString, valueOf, createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGroupBanInfoDto[] newArray(int i) {
            return new GroupsGroupBanInfoDto[i];
        }
    }

    public GroupsGroupBanInfoDto() {
        this(null, null, null, null, 15, null);
    }

    public final String d() {
        return this.comment;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.endDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGroupBanInfoDto)) {
            return false;
        }
        GroupsGroupBanInfoDto groupsGroupBanInfoDto = (GroupsGroupBanInfoDto) obj;
        return epx.f(this.comment, groupsGroupBanInfoDto.comment) && epx.f(this.endDate, groupsGroupBanInfoDto.endDate) && this.reason == groupsGroupBanInfoDto.reason && epx.f(this.geoBlocks, groupsGroupBanInfoDto.geoBlocks);
    }

    public final GroupsBanInfoReasonDto f() {
        return this.reason;
    }

    public final int hashCode() {
        String str = this.comment;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.endDate;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        GroupsBanInfoReasonDto groupsBanInfoReasonDto = this.reason;
        int hashCode3 = (hashCode2 + (groupsBanInfoReasonDto == null ? 0 : groupsBanInfoReasonDto.hashCode())) * 31;
        List<GroupsGroupBanInfoGeoBlockDto> list = this.geoBlocks;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGroupBanInfoDto(comment=");
        sb.append(this.comment);
        sb.append(", endDate=");
        sb.append(this.endDate);
        sb.append(", reason=");
        sb.append(this.reason);
        sb.append(", geoBlocks=");
        return ms9.a(')', sb, this.geoBlocks);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.comment);
        Integer num = this.endDate;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        GroupsBanInfoReasonDto groupsBanInfoReasonDto = this.reason;
        if (groupsBanInfoReasonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsBanInfoReasonDto.writeToParcel(parcel, i);
        }
        List<GroupsGroupBanInfoGeoBlockDto> list = this.geoBlocks;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((GroupsGroupBanInfoGeoBlockDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public GroupsGroupBanInfoDto(String str, Integer num, GroupsBanInfoReasonDto groupsBanInfoReasonDto, List<GroupsGroupBanInfoGeoBlockDto> list) {
        this.comment = str;
        this.endDate = num;
        this.reason = groupsBanInfoReasonDto;
        this.geoBlocks = list;
    }

    public /* synthetic */ GroupsGroupBanInfoDto(String str, Integer num, GroupsBanInfoReasonDto groupsBanInfoReasonDto, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : groupsBanInfoReasonDto, (i & 8) != 0 ? null : list);
    }
}
