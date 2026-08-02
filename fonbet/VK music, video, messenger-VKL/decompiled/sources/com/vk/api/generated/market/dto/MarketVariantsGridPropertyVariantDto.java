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
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketVariantsGridPropertyVariantDto.kt */
/* loaded from: classes15.dex */
public final class MarketVariantsGridPropertyVariantDto implements Parcelable {
    public static final Parcelable.Creator<MarketVariantsGridPropertyVariantDto> CREATOR = new a();

    @pmi0("image")
    private final List<BaseImageDto> image;

    @pmi0("is_adult")
    private final Boolean isAdult;

    @pmi0("is_disabled")
    private final Boolean isDisabled;

    @pmi0("is_selected")
    private final Boolean isSelected;

    @pmi0("item_id")
    private final Integer itemId;

    @pmi0("name")
    private final String name;

    @pmi0("value")
    private final String value;

    @pmi0("variant_id")
    private final int variantId;

    /* compiled from: MarketVariantsGridPropertyVariantDto.kt */
    public static final class a implements Parcelable.Creator<MarketVariantsGridPropertyVariantDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketVariantsGridPropertyVariantDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            ArrayList arrayList = null;
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString2 = parcel.readString();
            int i = 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = bo.b(MarketVariantsGridPropertyVariantDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MarketVariantsGridPropertyVariantDto(readInt, readString, valueOf4, readString2, valueOf, valueOf2, valueOf3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketVariantsGridPropertyVariantDto[] newArray(int i) {
            return new MarketVariantsGridPropertyVariantDto[i];
        }
    }

    public MarketVariantsGridPropertyVariantDto(int i, String str, Integer num, String str2, Boolean bool, Boolean bool2, Boolean bool3, List<BaseImageDto> list) {
        this.variantId = i;
        this.name = str;
        this.itemId = num;
        this.value = str2;
        this.isSelected = bool;
        this.isDisabled = bool2;
        this.isAdult = bool3;
        this.image = list;
    }

    public final List<BaseImageDto> d() {
        return this.image;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.itemId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketVariantsGridPropertyVariantDto)) {
            return false;
        }
        MarketVariantsGridPropertyVariantDto marketVariantsGridPropertyVariantDto = (MarketVariantsGridPropertyVariantDto) obj;
        return this.variantId == marketVariantsGridPropertyVariantDto.variantId && epx.f(this.name, marketVariantsGridPropertyVariantDto.name) && epx.f(this.itemId, marketVariantsGridPropertyVariantDto.itemId) && epx.f(this.value, marketVariantsGridPropertyVariantDto.value) && epx.f(this.isSelected, marketVariantsGridPropertyVariantDto.isSelected) && epx.f(this.isDisabled, marketVariantsGridPropertyVariantDto.isDisabled) && epx.f(this.isAdult, marketVariantsGridPropertyVariantDto.isAdult) && epx.f(this.image, marketVariantsGridPropertyVariantDto.image);
    }

    public final String f() {
        return this.name;
    }

    public final String g() {
        return this.value;
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.variantId) * 31, 31, this.name);
        Integer num = this.itemId;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.value;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isSelected;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isDisabled;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isAdult;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List<BaseImageDto> list = this.image;
        return hashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final int i() {
        return this.variantId;
    }

    public final Boolean j() {
        return this.isDisabled;
    }

    public final Boolean k() {
        return this.isSelected;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketVariantsGridPropertyVariantDto(variantId=");
        sb.append(this.variantId);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", itemId=");
        sb.append(this.itemId);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", isSelected=");
        sb.append(this.isSelected);
        sb.append(", isDisabled=");
        sb.append(this.isDisabled);
        sb.append(", isAdult=");
        sb.append(this.isAdult);
        sb.append(", image=");
        return ms9.a(')', sb, this.image);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.variantId);
        parcel.writeString(this.name);
        Integer num = this.itemId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.value);
        Boolean bool = this.isSelected;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isDisabled;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.isAdult;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        List<BaseImageDto> list = this.image;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ MarketVariantsGridPropertyVariantDto(int i, String str, Integer num, String str2, Boolean bool, Boolean bool2, Boolean bool3, List list, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : bool2, (i2 & 64) != 0 ? null : bool3, (i2 & 128) != 0 ? null : list);
    }
}
