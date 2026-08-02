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
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketRelatedCategoryDto.kt */
/* loaded from: classes15.dex */
public final class MarketRelatedCategoryDto implements Parcelable {
    public static final Parcelable.Creator<MarketRelatedCategoryDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("icons")
    private final List<BaseImageDto> icons;

    @pmi0("name")
    private final String name;

    @pmi0("url")
    private final String url;

    /* compiled from: MarketRelatedCategoryDto.kt */
    public static final class a implements Parcelable.Creator<MarketRelatedCategoryDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketRelatedCategoryDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(MarketRelatedCategoryDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MarketRelatedCategoryDto(readString, readString2, readString3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketRelatedCategoryDto[] newArray(int i) {
            return new MarketRelatedCategoryDto[i];
        }
    }

    public MarketRelatedCategoryDto(String str, String str2, String str3, List<BaseImageDto> list) {
        this.name = str;
        this.description = str2;
        this.url = str3;
        this.icons = list;
    }

    public final List<BaseImageDto> d() {
        return this.icons;
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
        if (!(obj instanceof MarketRelatedCategoryDto)) {
            return false;
        }
        MarketRelatedCategoryDto marketRelatedCategoryDto = (MarketRelatedCategoryDto) obj;
        return epx.f(this.name, marketRelatedCategoryDto.name) && epx.f(this.description, marketRelatedCategoryDto.description) && epx.f(this.url, marketRelatedCategoryDto.url) && epx.f(this.icons, marketRelatedCategoryDto.icons);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.name.hashCode() * 31, 31, this.description), 31, this.url);
        List<BaseImageDto> list = this.icons;
        return a2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketRelatedCategoryDto(name=");
        sb.append(this.name);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", icons=");
        return ms9.a(')', sb, this.icons);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeString(this.url);
        List<BaseImageDto> list = this.icons;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ MarketRelatedCategoryDto(String str, String str2, String str3, List list, int i, zcl zclVar) {
        this(str, str2, str3, (i & 8) != 0 ? null : list);
    }
}
