package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketDeliveryPointPlacemarkDto.kt */
/* loaded from: classes15.dex */
public final class MarketDeliveryPointPlacemarkDto implements Parcelable {
    public static final Parcelable.Creator<MarketDeliveryPointPlacemarkDto> CREATOR = new a();

    @pmi0("color")
    private final String color;

    @pmi0("group_avatars")
    private final List<BaseImageDto> groupAvatars;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketDeliveryPointPlacemarkDto.kt */
    public static final class a implements Parcelable.Creator<MarketDeliveryPointPlacemarkDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketDeliveryPointPlacemarkDto createFromParcel(Parcel parcel) {
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
                    i = bo.b(MarketDeliveryPointPlacemarkDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MarketDeliveryPointPlacemarkDto(readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketDeliveryPointPlacemarkDto[] newArray(int i) {
            return new MarketDeliveryPointPlacemarkDto[i];
        }
    }

    public MarketDeliveryPointPlacemarkDto() {
        this(null, null, null, 7, null);
    }

    public final String d() {
        return this.color;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<BaseImageDto> e() {
        return this.groupAvatars;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketDeliveryPointPlacemarkDto)) {
            return false;
        }
        MarketDeliveryPointPlacemarkDto marketDeliveryPointPlacemarkDto = (MarketDeliveryPointPlacemarkDto) obj;
        return epx.f(this.title, marketDeliveryPointPlacemarkDto.title) && epx.f(this.color, marketDeliveryPointPlacemarkDto.color) && epx.f(this.groupAvatars, marketDeliveryPointPlacemarkDto.groupAvatars);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.color;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BaseImageDto> list = this.groupAvatars;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketDeliveryPointPlacemarkDto(title=");
        sb.append(this.title);
        sb.append(", color=");
        sb.append(this.color);
        sb.append(", groupAvatars=");
        return ms9.a(')', sb, this.groupAvatars);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.color);
        List<BaseImageDto> list = this.groupAvatars;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public MarketDeliveryPointPlacemarkDto(String str, String str2, List<BaseImageDto> list) {
        this.title = str;
        this.color = str2;
        this.groupAvatars = list;
    }

    public /* synthetic */ MarketDeliveryPointPlacemarkDto(String str, String str2, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }
}
