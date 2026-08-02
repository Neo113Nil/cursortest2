package com.vk.api.generated.money.dto;

import android.os.Parcel;
import android.os.Parcelable;
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
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MoneyGetDebtorListResponseDto.kt */
/* loaded from: classes15.dex */
public final class MoneyGetDebtorListResponseDto implements Parcelable {
    public static final Parcelable.Creator<MoneyGetDebtorListResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<MoneyDebtorDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: MoneyGetDebtorListResponseDto.kt */
    public static final class a implements Parcelable.Creator<MoneyGetDebtorListResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MoneyGetDebtorListResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = en.a(MoneyDebtorDto.CREATOR, parcel, arrayList2, i2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = bo.b(MoneyGetDebtorListResponseDto.class, parcel, arrayList3, i, 1);
                }
                arrayList = arrayList3;
            }
            return new MoneyGetDebtorListResponseDto(readInt, arrayList2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MoneyGetDebtorListResponseDto[] newArray(int i) {
            return new MoneyGetDebtorListResponseDto[i];
        }
    }

    public MoneyGetDebtorListResponseDto(int i, List<MoneyDebtorDto> list, List<UsersUserFullDto> list2) {
        this.count = i;
        this.items = list;
        this.profiles = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyGetDebtorListResponseDto)) {
            return false;
        }
        MoneyGetDebtorListResponseDto moneyGetDebtorListResponseDto = (MoneyGetDebtorListResponseDto) obj;
        return this.count == moneyGetDebtorListResponseDto.count && epx.f(this.items, moneyGetDebtorListResponseDto.items) && epx.f(this.profiles, moneyGetDebtorListResponseDto.profiles);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        List<UsersUserFullDto> list = this.profiles;
        return a2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneyGetDebtorListResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", profiles=");
        return ms9.a(')', sb, this.profiles);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((MoneyDebtorDto) a2.next()).writeToParcel(parcel, i);
        }
        List<UsersUserFullDto> list = this.profiles;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ MoneyGetDebtorListResponseDto(int i, List list, List list2, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2);
    }
}
