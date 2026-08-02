package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pm0;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketCustomButtonListingDto.kt */
/* loaded from: classes15.dex */
public final class MarketCustomButtonListingDto implements Parcelable {
    public static final Parcelable.Creator<MarketCustomButtonListingDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("market_types")
    private final List<Integer> marketTypes;

    @pmi0("name")
    private final String name;

    /* compiled from: MarketCustomButtonListingDto.kt */
    public static final class a implements Parcelable.Creator<MarketCustomButtonListingDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCustomButtonListingDto createFromParcel(Parcel parcel) {
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
                    i = pm0.b(parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MarketCustomButtonListingDto(readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCustomButtonListingDto[] newArray(int i) {
            return new MarketCustomButtonListingDto[i];
        }
    }

    public MarketCustomButtonListingDto(String str, String str2, List<Integer> list) {
        this.id = str;
        this.name = str2;
        this.marketTypes = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCustomButtonListingDto)) {
            return false;
        }
        MarketCustomButtonListingDto marketCustomButtonListingDto = (MarketCustomButtonListingDto) obj;
        return epx.f(this.id, marketCustomButtonListingDto.id) && epx.f(this.name, marketCustomButtonListingDto.name) && epx.f(this.marketTypes, marketCustomButtonListingDto.marketTypes);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.id.hashCode() * 31, 31, this.name);
        List<Integer> list = this.marketTypes;
        return a2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCustomButtonListingDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", marketTypes=");
        return ms9.a(')', sb, this.marketTypes);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        List<Integer> list = this.marketTypes;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeInt(((Number) f.next()).intValue());
        }
    }

    public /* synthetic */ MarketCustomButtonListingDto(String str, String str2, List list, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : list);
    }
}
