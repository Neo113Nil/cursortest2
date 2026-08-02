package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketServicesSelectDto.kt */
/* loaded from: classes15.dex */
public final class MarketServicesSelectDto implements Parcelable {
    public static final Parcelable.Creator<MarketServicesSelectDto> CREATOR = new a();

    @pmi0("custom_text")
    private final String customText;

    @pmi0("items")
    private final List<MarketServicesSelectItemDto> items;

    @pmi0("selected_item_id")
    private final int selectedItemId;

    /* compiled from: MarketServicesSelectDto.kt */
    public static final class a implements Parcelable.Creator<MarketServicesSelectDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketServicesSelectDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(MarketServicesSelectItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MarketServicesSelectDto(readInt, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketServicesSelectDto[] newArray(int i) {
            return new MarketServicesSelectDto[i];
        }
    }

    public MarketServicesSelectDto(int i, List<MarketServicesSelectItemDto> list, String str) {
        this.selectedItemId = i;
        this.items = list;
        this.customText = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketServicesSelectDto)) {
            return false;
        }
        MarketServicesSelectDto marketServicesSelectDto = (MarketServicesSelectDto) obj;
        return this.selectedItemId == marketServicesSelectDto.selectedItemId && epx.f(this.items, marketServicesSelectDto.items) && epx.f(this.customText, marketServicesSelectDto.customText);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.selectedItemId) * 31, 31, this.items);
        String str = this.customText;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketServicesSelectDto(selectedItemId=");
        sb.append(this.selectedItemId);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", customText=");
        return ho8.a(sb, this.customText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.selectedItemId);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((MarketServicesSelectItemDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.customText);
    }

    public /* synthetic */ MarketServicesSelectDto(int i, List list, String str, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : str);
    }
}
