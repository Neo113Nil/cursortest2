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
import xsna.nr;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketItemLabelDto.kt */
/* loaded from: classes15.dex */
public final class MarketItemLabelDto implements Parcelable {
    public static final Parcelable.Creator<MarketItemLabelDto> CREATOR = new a();

    @pmi0("action")
    private final MarketItemLabelActionDto action;

    @pmi0("counter_value")
    private final Integer counterValue;

    @pmi0("icon")
    private final List<BaseImageDto> icon;

    @pmi0("subtype")
    private final MarketItemLabelSubtypeDto subtype;

    @pmi0("subtype_name")
    private final MarketItemLabelSubtypeNamesDto subtypeName;

    @pmi0("text")
    private final String text;

    @pmi0("tooltip")
    private final String tooltip;

    @pmi0("type")
    private final MarketItemLabelTypeDto type;

    /* compiled from: MarketItemLabelDto.kt */
    public static final class a implements Parcelable.Creator<MarketItemLabelDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketItemLabelDto createFromParcel(Parcel parcel) {
            MarketItemLabelTypeDto createFromParcel = MarketItemLabelTypeDto.CREATOR.createFromParcel(parcel);
            MarketItemLabelSubtypeDto createFromParcel2 = MarketItemLabelSubtypeDto.CREATOR.createFromParcel(parcel);
            MarketItemLabelSubtypeNamesDto createFromParcel3 = MarketItemLabelSubtypeNamesDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(MarketItemLabelDto.class, parcel, arrayList, i, 1);
                }
            }
            return new MarketItemLabelDto(createFromParcel, createFromParcel2, createFromParcel3, readString, valueOf, arrayList, parcel.readString(), (MarketItemLabelActionDto) parcel.readParcelable(MarketItemLabelDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketItemLabelDto[] newArray(int i) {
            return new MarketItemLabelDto[i];
        }
    }

    public MarketItemLabelDto(MarketItemLabelTypeDto marketItemLabelTypeDto, MarketItemLabelSubtypeDto marketItemLabelSubtypeDto, MarketItemLabelSubtypeNamesDto marketItemLabelSubtypeNamesDto, String str, Integer num, List<BaseImageDto> list, String str2, MarketItemLabelActionDto marketItemLabelActionDto) {
        this.type = marketItemLabelTypeDto;
        this.subtype = marketItemLabelSubtypeDto;
        this.subtypeName = marketItemLabelSubtypeNamesDto;
        this.text = str;
        this.counterValue = num;
        this.icon = list;
        this.tooltip = str2;
        this.action = marketItemLabelActionDto;
    }

    public final MarketItemLabelActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.counterValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketItemLabelDto)) {
            return false;
        }
        MarketItemLabelDto marketItemLabelDto = (MarketItemLabelDto) obj;
        return this.type == marketItemLabelDto.type && this.subtype == marketItemLabelDto.subtype && this.subtypeName == marketItemLabelDto.subtypeName && epx.f(this.text, marketItemLabelDto.text) && epx.f(this.counterValue, marketItemLabelDto.counterValue) && epx.f(this.icon, marketItemLabelDto.icon) && epx.f(this.tooltip, marketItemLabelDto.tooltip) && epx.f(this.action, marketItemLabelDto.action);
    }

    public final List<BaseImageDto> f() {
        return this.icon;
    }

    public final MarketItemLabelSubtypeDto g() {
        return this.subtype;
    }

    public final int hashCode() {
        int a2 = urd0.a((this.subtypeName.hashCode() + ((this.subtype.hashCode() + (this.type.hashCode() * 31)) * 31)) * 31, 31, this.text);
        Integer num = this.counterValue;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        List<BaseImageDto> list = this.icon;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.tooltip;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        MarketItemLabelActionDto marketItemLabelActionDto = this.action;
        return hashCode3 + (marketItemLabelActionDto != null ? marketItemLabelActionDto.hashCode() : 0);
    }

    public final MarketItemLabelSubtypeNamesDto i() {
        return this.subtypeName;
    }

    public final String j() {
        return this.text;
    }

    public final String k() {
        return this.tooltip;
    }

    public final MarketItemLabelTypeDto l() {
        return this.type;
    }

    public final String toString() {
        return "MarketItemLabelDto(type=" + this.type + ", subtype=" + this.subtype + ", subtypeName=" + this.subtypeName + ", text=" + this.text + ", counterValue=" + this.counterValue + ", icon=" + this.icon + ", tooltip=" + this.tooltip + ", action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        this.subtype.writeToParcel(parcel, i);
        this.subtypeName.writeToParcel(parcel, i);
        parcel.writeString(this.text);
        Integer num = this.counterValue;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<BaseImageDto> list = this.icon;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.tooltip);
        parcel.writeParcelable(this.action, i);
    }

    public /* synthetic */ MarketItemLabelDto(MarketItemLabelTypeDto marketItemLabelTypeDto, MarketItemLabelSubtypeDto marketItemLabelSubtypeDto, MarketItemLabelSubtypeNamesDto marketItemLabelSubtypeNamesDto, String str, Integer num, List list, String str2, MarketItemLabelActionDto marketItemLabelActionDto, int i, zcl zclVar) {
        this(marketItemLabelTypeDto, marketItemLabelSubtypeDto, marketItemLabelSubtypeNamesDto, str, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : marketItemLabelActionDto);
    }
}
