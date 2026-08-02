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

/* compiled from: MarketItemBannerDto.kt */
/* loaded from: classes15.dex */
public final class MarketItemBannerDto implements Parcelable {
    public static final Parcelable.Creator<MarketItemBannerDto> CREATOR = new a();

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketItemBannerDto.kt */
    public static final class a implements Parcelable.Creator<MarketItemBannerDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketItemBannerDto createFromParcel(Parcel parcel) {
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
                    i = bo.b(MarketItemBannerDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MarketItemBannerDto(readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketItemBannerDto[] newArray(int i) {
            return new MarketItemBannerDto[i];
        }
    }

    public MarketItemBannerDto(String str, String str2, List<BaseImageDto> list) {
        this.title = str;
        this.subtitle = str2;
        this.images = list;
    }

    public final List<BaseImageDto> d() {
        return this.images;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.subtitle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketItemBannerDto)) {
            return false;
        }
        MarketItemBannerDto marketItemBannerDto = (MarketItemBannerDto) obj;
        return epx.f(this.title, marketItemBannerDto.title) && epx.f(this.subtitle, marketItemBannerDto.subtitle) && epx.f(this.images, marketItemBannerDto.images);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<BaseImageDto> list = this.images;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemBannerDto(title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", images=");
        return ms9.a(')', sb, this.images);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        List<BaseImageDto> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ MarketItemBannerDto(String str, String str2, List list, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }
}
