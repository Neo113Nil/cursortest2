package com.vk.api.generated.money.dto;

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
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MoneyGetTransferListResponseDto.kt */
/* loaded from: classes15.dex */
public final class MoneyGetTransferListResponseDto implements Parcelable {
    public static final Parcelable.Creator<MoneyGetTransferListResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("debtors_count")
    private final Integer debtorsCount;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<MoneyTransferDto> items;

    @pmi0("next_offset")
    private final Integer nextOffset;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: MoneyGetTransferListResponseDto.kt */
    public static final class a implements Parcelable.Creator<MoneyGetTransferListResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MoneyGetTransferListResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = en.a(MoneyTransferDto.CREATOR, parcel, arrayList3, i2, 1);
            }
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(MoneyGetTransferListResponseDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = bo.b(MoneyGetTransferListResponseDto.class, parcel, arrayList4, i, 1);
                }
                arrayList2 = arrayList4;
            }
            return new MoneyGetTransferListResponseDto(readInt, arrayList3, valueOf, arrayList, arrayList2, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MoneyGetTransferListResponseDto[] newArray(int i) {
            return new MoneyGetTransferListResponseDto[i];
        }
    }

    public MoneyGetTransferListResponseDto(int i, List<MoneyTransferDto> list, Integer num, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, Integer num2) {
        this.count = i;
        this.items = list;
        this.nextOffset = num;
        this.profiles = list2;
        this.groups = list3;
        this.debtorsCount = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyGetTransferListResponseDto)) {
            return false;
        }
        MoneyGetTransferListResponseDto moneyGetTransferListResponseDto = (MoneyGetTransferListResponseDto) obj;
        return this.count == moneyGetTransferListResponseDto.count && epx.f(this.items, moneyGetTransferListResponseDto.items) && epx.f(this.nextOffset, moneyGetTransferListResponseDto.nextOffset) && epx.f(this.profiles, moneyGetTransferListResponseDto.profiles) && epx.f(this.groups, moneyGetTransferListResponseDto.groups) && epx.f(this.debtorsCount, moneyGetTransferListResponseDto.debtorsCount);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        Integer num = this.nextOffset;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num2 = this.debtorsCount;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneyGetTransferListResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", nextOffset=");
        sb.append(this.nextOffset);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", debtorsCount=");
        return uqi.b(sb, this.debtorsCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((MoneyTransferDto) a2.next()).writeToParcel(parcel, i);
        }
        Integer num = this.nextOffset;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
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
        Integer num2 = this.debtorsCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ MoneyGetTransferListResponseDto(int i, List list, Integer num, List list2, List list3, Integer num2, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : list2, (i2 & 16) != 0 ? null : list3, (i2 & 32) != 0 ? null : num2);
    }
}
