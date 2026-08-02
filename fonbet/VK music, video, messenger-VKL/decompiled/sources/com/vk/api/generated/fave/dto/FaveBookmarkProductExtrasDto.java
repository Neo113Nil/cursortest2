package com.vk.api.generated.fave.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.market.dto.MarketCustomButtonFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: FaveBookmarkProductExtrasDto.kt */
/* loaded from: classes14.dex */
public final class FaveBookmarkProductExtrasDto implements Parcelable {
    public static final Parcelable.Creator<FaveBookmarkProductExtrasDto> CREATOR = new a();

    @pmi0("buttons")
    private final List<MarketCustomButtonFullDto> buttons;

    /* compiled from: FaveBookmarkProductExtrasDto.kt */
    public static final class a implements Parcelable.Creator<FaveBookmarkProductExtrasDto> {
        @Override // android.os.Parcelable.Creator
        public final FaveBookmarkProductExtrasDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(FaveBookmarkProductExtrasDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new FaveBookmarkProductExtrasDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final FaveBookmarkProductExtrasDto[] newArray(int i) {
            return new FaveBookmarkProductExtrasDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FaveBookmarkProductExtrasDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FaveBookmarkProductExtrasDto) && epx.f(this.buttons, ((FaveBookmarkProductExtrasDto) obj).buttons);
    }

    public final int hashCode() {
        List<MarketCustomButtonFullDto> list = this.buttons;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("FaveBookmarkProductExtrasDto(buttons="), this.buttons);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<MarketCustomButtonFullDto> list = this.buttons;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public FaveBookmarkProductExtrasDto(List<MarketCustomButtonFullDto> list) {
        this.buttons = list;
    }

    public /* synthetic */ FaveBookmarkProductExtrasDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
