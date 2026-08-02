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
import xsna.pm0;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: GroupsTabSettingsDto.kt */
/* loaded from: classes14.dex */
public final class GroupsTabSettingsDto implements Parcelable {
    public static final Parcelable.Creator<GroupsTabSettingsDto> CREATOR = new a();

    @pmi0("additional_type_count")
    private final List<Integer> additionalTypeCount;

    @pmi0("additional_types")
    private final List<GroupsContentTypesDto> additionalTypes;

    @pmi0("can_add")
    private final Boolean canAdd;

    @pmi0("collections")
    private final List<GroupsTabCollectionDto> collections;

    @pmi0("main_type")
    private final GroupsContentTypesDto mainType;

    @pmi0("main_type_count")
    private final Integer mainTypeCount;

    @pmi0("name")
    private final String name;

    @pmi0("show_more")
    private final Boolean showMore;

    @pmi0("special_values")
    private final GroupsTabSpecialValuesDto specialValues;

    @pmi0("tablet_config")
    private final GroupsTabTabletConfigDto tabletConfig;

    /* compiled from: GroupsTabSettingsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsTabSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsTabSettingsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Boolean valueOf;
            Boolean valueOf2;
            String readString = parcel.readString();
            ArrayList arrayList3 = null;
            GroupsContentTypesDto createFromParcel = parcel.readInt() == 0 ? null : GroupsContentTypesDto.CREATOR.createFromParcel(parcel);
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(GroupsContentTypesDto.CREATOR, parcel, arrayList4, i2, 1);
                }
                arrayList = arrayList4;
            }
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = pm0.b(parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            GroupsTabTabletConfigDto createFromParcel2 = parcel.readInt() == 0 ? null : GroupsTabTabletConfigDto.CREATOR.createFromParcel(parcel);
            GroupsTabSpecialValuesDto createFromParcel3 = parcel.readInt() == 0 ? null : GroupsTabSpecialValuesDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = en.a(GroupsTabCollectionDto.CREATOR, parcel, arrayList5, i, 1);
                }
                arrayList3 = arrayList5;
            }
            return new GroupsTabSettingsDto(readString, createFromParcel, arrayList, valueOf3, arrayList2, valueOf, valueOf2, createFromParcel2, createFromParcel3, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsTabSettingsDto[] newArray(int i) {
            return new GroupsTabSettingsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupsTabSettingsDto(String str, GroupsContentTypesDto groupsContentTypesDto, List<? extends GroupsContentTypesDto> list, Integer num, List<Integer> list2, Boolean bool, Boolean bool2, GroupsTabTabletConfigDto groupsTabTabletConfigDto, GroupsTabSpecialValuesDto groupsTabSpecialValuesDto, List<GroupsTabCollectionDto> list3) {
        this.name = str;
        this.mainType = groupsContentTypesDto;
        this.additionalTypes = list;
        this.mainTypeCount = num;
        this.additionalTypeCount = list2;
        this.canAdd = bool;
        this.showMore = bool2;
        this.tabletConfig = groupsTabTabletConfigDto;
        this.specialValues = groupsTabSpecialValuesDto;
        this.collections = list3;
    }

    public final List<GroupsTabCollectionDto> d() {
        return this.collections;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final GroupsContentTypesDto e() {
        return this.mainType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsTabSettingsDto)) {
            return false;
        }
        GroupsTabSettingsDto groupsTabSettingsDto = (GroupsTabSettingsDto) obj;
        return epx.f(this.name, groupsTabSettingsDto.name) && this.mainType == groupsTabSettingsDto.mainType && epx.f(this.additionalTypes, groupsTabSettingsDto.additionalTypes) && epx.f(this.mainTypeCount, groupsTabSettingsDto.mainTypeCount) && epx.f(this.additionalTypeCount, groupsTabSettingsDto.additionalTypeCount) && epx.f(this.canAdd, groupsTabSettingsDto.canAdd) && epx.f(this.showMore, groupsTabSettingsDto.showMore) && epx.f(this.tabletConfig, groupsTabSettingsDto.tabletConfig) && epx.f(this.specialValues, groupsTabSettingsDto.specialValues) && epx.f(this.collections, groupsTabSettingsDto.collections);
    }

    public final GroupsTabSpecialValuesDto f() {
        return this.specialValues;
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        GroupsContentTypesDto groupsContentTypesDto = this.mainType;
        int hashCode2 = (hashCode + (groupsContentTypesDto == null ? 0 : groupsContentTypesDto.hashCode())) * 31;
        List<GroupsContentTypesDto> list = this.additionalTypes;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.mainTypeCount;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List<Integer> list2 = this.additionalTypeCount;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.canAdd;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showMore;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        GroupsTabTabletConfigDto groupsTabTabletConfigDto = this.tabletConfig;
        int hashCode8 = (hashCode7 + (groupsTabTabletConfigDto == null ? 0 : groupsTabTabletConfigDto.hashCode())) * 31;
        GroupsTabSpecialValuesDto groupsTabSpecialValuesDto = this.specialValues;
        int hashCode9 = (hashCode8 + (groupsTabSpecialValuesDto == null ? 0 : groupsTabSpecialValuesDto.hashCode())) * 31;
        List<GroupsTabCollectionDto> list3 = this.collections;
        return hashCode9 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsTabSettingsDto(name=");
        sb.append(this.name);
        sb.append(", mainType=");
        sb.append(this.mainType);
        sb.append(", additionalTypes=");
        sb.append(this.additionalTypes);
        sb.append(", mainTypeCount=");
        sb.append(this.mainTypeCount);
        sb.append(", additionalTypeCount=");
        sb.append(this.additionalTypeCount);
        sb.append(", canAdd=");
        sb.append(this.canAdd);
        sb.append(", showMore=");
        sb.append(this.showMore);
        sb.append(", tabletConfig=");
        sb.append(this.tabletConfig);
        sb.append(", specialValues=");
        sb.append(this.specialValues);
        sb.append(", collections=");
        return ms9.a(')', sb, this.collections);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        GroupsContentTypesDto groupsContentTypesDto = this.mainType;
        if (groupsContentTypesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsContentTypesDto.writeToParcel(parcel, i);
        }
        List<GroupsContentTypesDto> list = this.additionalTypes;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((GroupsContentTypesDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Integer num = this.mainTypeCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<Integer> list2 = this.additionalTypeCount;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeInt(((Number) f2.next()).intValue());
            }
        }
        Boolean bool = this.canAdd;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.showMore;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        GroupsTabTabletConfigDto groupsTabTabletConfigDto = this.tabletConfig;
        if (groupsTabTabletConfigDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTabTabletConfigDto.writeToParcel(parcel, i);
        }
        GroupsTabSpecialValuesDto groupsTabSpecialValuesDto = this.specialValues;
        if (groupsTabSpecialValuesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsTabSpecialValuesDto.writeToParcel(parcel, i);
        }
        List<GroupsTabCollectionDto> list3 = this.collections;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f3 = dn.f(parcel, list3, 1);
        while (f3.hasNext()) {
            ((GroupsTabCollectionDto) f3.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GroupsTabSettingsDto(String str, GroupsContentTypesDto groupsContentTypesDto, List list, Integer num, List list2, Boolean bool, Boolean bool2, GroupsTabTabletConfigDto groupsTabTabletConfigDto, GroupsTabSpecialValuesDto groupsTabSpecialValuesDto, List list3, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : groupsContentTypesDto, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : bool2, (i & 128) != 0 ? null : groupsTabTabletConfigDto, (i & 256) != 0 ? null : groupsTabSpecialValuesDto, (i & 512) != 0 ? null : list3);
    }
}
