package com.vk.api.generated.money.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MoneyCardsDto.kt */
/* loaded from: classes15.dex */
public final class MoneyCardsDto implements Parcelable {
    public static final Parcelable.Creator<MoneyCardsDto> CREATOR = new a();

    @pmi0("count")
    private final Integer count;

    @pmi0("items")
    private final List<MoneyCardDto> items;

    /* compiled from: MoneyCardsDto.kt */
    public static final class a implements Parcelable.Creator<MoneyCardsDto> {
        @Override // android.os.Parcelable.Creator
        public final MoneyCardsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MoneyCardDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new MoneyCardsDto(arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MoneyCardsDto[] newArray(int i) {
            return new MoneyCardsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MoneyCardsDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyCardsDto)) {
            return false;
        }
        MoneyCardsDto moneyCardsDto = (MoneyCardsDto) obj;
        return epx.f(this.items, moneyCardsDto.items) && epx.f(this.count, moneyCardsDto.count);
    }

    public final int hashCode() {
        List<MoneyCardDto> list = this.items;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.count;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneyCardsDto(items=");
        sb.append(this.items);
        sb.append(", count=");
        return uqi.b(sb, this.count, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<MoneyCardDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MoneyCardDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public MoneyCardsDto(List<MoneyCardDto> list, Integer num) {
        this.items = list;
        this.count = num;
    }

    public /* synthetic */ MoneyCardsDto(List list, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num);
    }
}
