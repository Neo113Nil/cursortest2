package com.vk.api.generated.money.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MoneyGetTransferMethodsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MoneyGetTransferMethodsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MoneyGetTransferMethodsResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<MoneyTransferMethodDto> items;

    /* compiled from: MoneyGetTransferMethodsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MoneyGetTransferMethodsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MoneyGetTransferMethodsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MoneyTransferMethodDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MoneyGetTransferMethodsResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MoneyGetTransferMethodsResponseDto[] newArray(int i) {
            return new MoneyGetTransferMethodsResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MoneyGetTransferMethodsResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final List<MoneyTransferMethodDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MoneyGetTransferMethodsResponseDto) && epx.f(this.items, ((MoneyGetTransferMethodsResponseDto) obj).items);
    }

    public final int hashCode() {
        List<MoneyTransferMethodDto> list = this.items;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("MoneyGetTransferMethodsResponseDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<MoneyTransferMethodDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((MoneyTransferMethodDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public MoneyGetTransferMethodsResponseDto(List<MoneyTransferMethodDto> list) {
        this.items = list;
    }

    public /* synthetic */ MoneyGetTransferMethodsResponseDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
