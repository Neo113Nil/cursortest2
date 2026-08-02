package com.vk.api.generated.store.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StoreStockItemDiscountDto.kt */
/* loaded from: classes15.dex */
public final class StoreStockItemDiscountDto implements Parcelable {
    public static final Parcelable.Creator<StoreStockItemDiscountDto> CREATOR = new a();

    @pmi0("icon")
    private final List<BaseImageDto> icon;

    @pmi0("name")
    private final String name;

    @pmi0("status")
    private final String status;

    /* compiled from: StoreStockItemDiscountDto.kt */
    public static final class a implements Parcelable.Creator<StoreStockItemDiscountDto> {
        @Override // android.os.Parcelable.Creator
        public final StoreStockItemDiscountDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(StoreStockItemDiscountDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new StoreStockItemDiscountDto(readString, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoreStockItemDiscountDto[] newArray(int i) {
            return new StoreStockItemDiscountDto[i];
        }
    }

    public StoreStockItemDiscountDto(String str, List<BaseImageDto> list, String str2) {
        this.name = str;
        this.icon = list;
        this.status = str2;
    }

    public final List<BaseImageDto> d() {
        return this.icon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreStockItemDiscountDto)) {
            return false;
        }
        StoreStockItemDiscountDto storeStockItemDiscountDto = (StoreStockItemDiscountDto) obj;
        return epx.f(this.name, storeStockItemDiscountDto.name) && epx.f(this.icon, storeStockItemDiscountDto.icon) && epx.f(this.status, storeStockItemDiscountDto.status);
    }

    public final String f() {
        return this.status;
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        List<BaseImageDto> list = this.icon;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.status;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoreStockItemDiscountDto(name=");
        sb.append(this.name);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", status=");
        return ho8.a(sb, this.status, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        List<BaseImageDto> list = this.icon;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.status);
    }

    public /* synthetic */ StoreStockItemDiscountDto(String str, List list, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2);
    }
}
