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
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MarketVariantsGridPropertyDto.kt */
/* loaded from: classes15.dex */
public final class MarketVariantsGridPropertyDto implements Parcelable {
    public static final Parcelable.Creator<MarketVariantsGridPropertyDto> CREATOR = new a();

    @pmi0("is_all_variants_show")
    private final Boolean isAllVariantsShow;

    @pmi0("name")
    private final String name;

    @pmi0("type")
    private final String type;

    @pmi0("variants")
    private final List<MarketVariantsGridPropertyVariantDto> variants;

    /* compiled from: MarketVariantsGridPropertyDto.kt */
    public static final class a implements Parcelable.Creator<MarketVariantsGridPropertyDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketVariantsGridPropertyDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(MarketVariantsGridPropertyVariantDto.CREATOR, parcel, arrayList, i, 1);
            }
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarketVariantsGridPropertyDto(readString, arrayList, readString2, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketVariantsGridPropertyDto[] newArray(int i) {
            return new MarketVariantsGridPropertyDto[i];
        }
    }

    public MarketVariantsGridPropertyDto(String str, List<MarketVariantsGridPropertyVariantDto> list, String str2, Boolean bool) {
        this.name = str;
        this.variants = list;
        this.type = str2;
        this.isAllVariantsShow = bool;
    }

    public final String d() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<MarketVariantsGridPropertyVariantDto> e() {
        return this.variants;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketVariantsGridPropertyDto)) {
            return false;
        }
        MarketVariantsGridPropertyDto marketVariantsGridPropertyDto = (MarketVariantsGridPropertyDto) obj;
        return epx.f(this.name, marketVariantsGridPropertyDto.name) && epx.f(this.variants, marketVariantsGridPropertyDto.variants) && epx.f(this.type, marketVariantsGridPropertyDto.type) && epx.f(this.isAllVariantsShow, marketVariantsGridPropertyDto.isAllVariantsShow);
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int a2 = fw3.a(this.name.hashCode() * 31, 31, this.variants);
        String str = this.type;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isAllVariantsShow;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketVariantsGridPropertyDto(name=");
        sb.append(this.name);
        sb.append(", variants=");
        sb.append(this.variants);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", isAllVariantsShow=");
        return tn.a(sb, this.isAllVariantsShow, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        Iterator a2 = ao.a(parcel, this.variants);
        while (a2.hasNext()) {
            ((MarketVariantsGridPropertyVariantDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.type);
        Boolean bool = this.isAllVariantsShow;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ MarketVariantsGridPropertyDto(String str, List list, String str2, Boolean bool, int i, zcl zclVar) {
        this(str, list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : bool);
    }
}
