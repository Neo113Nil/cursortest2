package com.vk.api.generated.market.dto;

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
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketDeliveryFiltersDto.kt */
/* loaded from: classes15.dex */
public final class MarketDeliveryFiltersDto implements Parcelable {
    public static final Parcelable.Creator<MarketDeliveryFiltersDto> CREATOR = new a();

    @pmi0("field")
    private final String field;

    @pmi0("list")
    private final List<MarketDeliveryFiltersListDto> list;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketDeliveryFiltersDto.kt */
    public static final class a implements Parcelable.Creator<MarketDeliveryFiltersDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketDeliveryFiltersDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MarketDeliveryFiltersListDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MarketDeliveryFiltersDto(readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketDeliveryFiltersDto[] newArray(int i) {
            return new MarketDeliveryFiltersDto[i];
        }
    }

    public MarketDeliveryFiltersDto(String str, String str2, List<MarketDeliveryFiltersListDto> list) {
        this.field = str;
        this.title = str2;
        this.list = list;
    }

    public final String d() {
        return this.field;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<MarketDeliveryFiltersListDto> e() {
        return this.list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketDeliveryFiltersDto)) {
            return false;
        }
        MarketDeliveryFiltersDto marketDeliveryFiltersDto = (MarketDeliveryFiltersDto) obj;
        return epx.f(this.field, marketDeliveryFiltersDto.field) && epx.f(this.title, marketDeliveryFiltersDto.title) && epx.f(this.list, marketDeliveryFiltersDto.list);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.field.hashCode() * 31, 31, this.title);
        List<MarketDeliveryFiltersListDto> list = this.list;
        return a2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketDeliveryFiltersDto(field=");
        sb.append(this.field);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", list=");
        return ms9.a(')', sb, this.list);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.field);
        parcel.writeString(this.title);
        List<MarketDeliveryFiltersListDto> list = this.list;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((MarketDeliveryFiltersListDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketDeliveryFiltersDto(String str, String str2, List list, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : list);
    }
}
