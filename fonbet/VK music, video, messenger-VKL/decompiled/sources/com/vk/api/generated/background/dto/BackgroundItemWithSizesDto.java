package com.vk.api.generated.background.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BackgroundItemWithSizesDto.kt */
/* loaded from: classes14.dex */
public final class BackgroundItemWithSizesDto implements Parcelable {
    public static final Parcelable.Creator<BackgroundItemWithSizesDto> CREATOR = new a();

    @pmi0("items")
    private final List<BackgroundItemSizedDto> items;

    @pmi0("name")
    private final String name;

    /* compiled from: BackgroundItemWithSizesDto.kt */
    public static final class a implements Parcelable.Creator<BackgroundItemWithSizesDto> {
        @Override // android.os.Parcelable.Creator
        public final BackgroundItemWithSizesDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(BackgroundItemSizedDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new BackgroundItemWithSizesDto(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BackgroundItemWithSizesDto[] newArray(int i) {
            return new BackgroundItemWithSizesDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BackgroundItemWithSizesDto() {
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
        if (!(obj instanceof BackgroundItemWithSizesDto)) {
            return false;
        }
        BackgroundItemWithSizesDto backgroundItemWithSizesDto = (BackgroundItemWithSizesDto) obj;
        return epx.f(this.items, backgroundItemWithSizesDto.items) && epx.f(this.name, backgroundItemWithSizesDto.name);
    }

    public final int hashCode() {
        List<BackgroundItemSizedDto> list = this.items;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.name;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackgroundItemWithSizesDto(items=");
        sb.append(this.items);
        sb.append(", name=");
        return ho8.a(sb, this.name, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<BackgroundItemSizedDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((BackgroundItemSizedDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.name);
    }

    public BackgroundItemWithSizesDto(List<BackgroundItemSizedDto> list, String str) {
        this.items = list;
        this.name = str;
    }

    public /* synthetic */ BackgroundItemWithSizesDto(List list, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str);
    }
}
