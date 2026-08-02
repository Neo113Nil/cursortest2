package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.classifieds.dto.ClassifiedsYoulaItemExtendedDto;
import com.vk.api.generated.youla.dto.YoulaCategoriesWithCountersDto;
import com.vk.dto.hints.HintCategories;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: GroupsTabContentClassifiedsDto.kt */
/* loaded from: classes14.dex */
public final class GroupsTabContentClassifiedsDto implements Parcelable {
    public static final Parcelable.Creator<GroupsTabContentClassifiedsDto> CREATOR = new a();

    @pmi0("add_product_url")
    private final String addProductUrl;

    @pmi0("can_add")
    private final boolean canAdd;

    @pmi0(HintCategories.PARAM_NAME)
    private final List<YoulaCategoriesWithCountersDto> categories;

    @pmi0("count")
    private final Integer count;

    @pmi0("items")
    private final List<ClassifiedsYoulaItemExtendedDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    /* compiled from: GroupsTabContentClassifiedsDto.kt */
    public static final class a implements Parcelable.Creator<GroupsTabContentClassifiedsDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsTabContentClassifiedsDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (true) {
                if (i == readInt) {
                    break;
                }
                i = en.a(ClassifiedsYoulaItemExtendedDto.CREATOR, parcel, arrayList, i, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = en.a(YoulaCategoriesWithCountersDto.CREATOR, parcel, arrayList2, i2, 1);
            }
            return new GroupsTabContentClassifiedsDto(arrayList, arrayList2, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsTabContentClassifiedsDto[] newArray(int i) {
            return new GroupsTabContentClassifiedsDto[i];
        }
    }

    public GroupsTabContentClassifiedsDto(List<ClassifiedsYoulaItemExtendedDto> list, List<YoulaCategoriesWithCountersDto> list2, boolean z, String str, Integer num, String str2) {
        this.items = list;
        this.categories = list2;
        this.canAdd = z;
        this.addProductUrl = str;
        this.count = num;
        this.nextFrom = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsTabContentClassifiedsDto)) {
            return false;
        }
        GroupsTabContentClassifiedsDto groupsTabContentClassifiedsDto = (GroupsTabContentClassifiedsDto) obj;
        return epx.f(this.items, groupsTabContentClassifiedsDto.items) && epx.f(this.categories, groupsTabContentClassifiedsDto.categories) && this.canAdd == groupsTabContentClassifiedsDto.canAdd && epx.f(this.addProductUrl, groupsTabContentClassifiedsDto.addProductUrl) && epx.f(this.count, groupsTabContentClassifiedsDto.count) && epx.f(this.nextFrom, groupsTabContentClassifiedsDto.nextFrom);
    }

    public final int hashCode() {
        int b = qoy.b(fw3.a(this.items.hashCode() * 31, 31, this.categories), 31, this.canAdd);
        String str = this.addProductUrl;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.count;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.nextFrom;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsTabContentClassifiedsDto(items=");
        sb.append(this.items);
        sb.append(", categories=");
        sb.append(this.categories);
        sb.append(", canAdd=");
        sb.append(this.canAdd);
        sb.append(", addProductUrl=");
        sb.append(this.addProductUrl);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.nextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((ClassifiedsYoulaItemExtendedDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.categories);
        while (a3.hasNext()) {
            ((YoulaCategoriesWithCountersDto) a3.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.canAdd ? 1 : 0);
        parcel.writeString(this.addProductUrl);
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.nextFrom);
    }

    public /* synthetic */ GroupsTabContentClassifiedsDto(List list, List list2, boolean z, String str, Integer num, String str2, int i, zcl zclVar) {
        this(list, list2, z, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str2);
    }
}
