package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: MarketBadgeDto.kt */
/* loaded from: classes15.dex */
public final class MarketBadgeDto implements Parcelable {
    public static final Parcelable.Creator<MarketBadgeDto> CREATOR = new a();

    @pmi0("bkg_color")
    private final int bkgColor;

    @pmi0("bkg_color_dark")
    private final int bkgColorDark;

    @pmi0("integration_image")
    private final List<BaseImageDto> integrationImage;

    @pmi0("subtype")
    private final MarketBadgeSubtypeDto subtype;

    @pmi0("text")
    private final String text;

    @pmi0("text_color")
    private final int textColor;

    @pmi0("text_color_dark")
    private final int textColorDark;

    @pmi0("tooltip_footer")
    private final String tooltipFooter;

    @pmi0("tooltip_header")
    private final String tooltipHeader;

    @pmi0("tooltip_text")
    private final String tooltipText;

    @pmi0("type")
    private final MarketBadgeTypeDto type;

    /* compiled from: MarketBadgeDto.kt */
    public static final class a implements Parcelable.Creator<MarketBadgeDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketBadgeDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            MarketBadgeTypeDto createFromParcel = parcel.readInt() == 0 ? null : MarketBadgeTypeDto.CREATOR.createFromParcel(parcel);
            MarketBadgeSubtypeDto createFromParcel2 = parcel.readInt() == 0 ? null : MarketBadgeSubtypeDto.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            ArrayList arrayList = null;
            String readString4 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt5 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt5);
                int i = 0;
                while (i != readInt5) {
                    i = en.a(BaseImageDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MarketBadgeDto(readString, readInt, readInt2, readInt3, readInt4, createFromParcel, createFromParcel2, readString2, readString3, readString4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketBadgeDto[] newArray(int i) {
            return new MarketBadgeDto[i];
        }
    }

    public MarketBadgeDto(String str, int i, int i2, int i3, int i4, MarketBadgeTypeDto marketBadgeTypeDto, MarketBadgeSubtypeDto marketBadgeSubtypeDto, String str2, String str3, String str4, List<BaseImageDto> list) {
        this.text = str;
        this.bkgColor = i;
        this.bkgColorDark = i2;
        this.textColor = i3;
        this.textColorDark = i4;
        this.type = marketBadgeTypeDto;
        this.subtype = marketBadgeSubtypeDto;
        this.tooltipHeader = str2;
        this.tooltipText = str3;
        this.tooltipFooter = str4;
        this.integrationImage = list;
    }

    public final int d() {
        return this.bkgColor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.bkgColorDark;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketBadgeDto)) {
            return false;
        }
        MarketBadgeDto marketBadgeDto = (MarketBadgeDto) obj;
        return epx.f(this.text, marketBadgeDto.text) && this.bkgColor == marketBadgeDto.bkgColor && this.bkgColorDark == marketBadgeDto.bkgColorDark && this.textColor == marketBadgeDto.textColor && this.textColorDark == marketBadgeDto.textColorDark && this.type == marketBadgeDto.type && this.subtype == marketBadgeDto.subtype && epx.f(this.tooltipHeader, marketBadgeDto.tooltipHeader) && epx.f(this.tooltipText, marketBadgeDto.tooltipText) && epx.f(this.tooltipFooter, marketBadgeDto.tooltipFooter) && epx.f(this.integrationImage, marketBadgeDto.integrationImage);
    }

    public final List<BaseImageDto> f() {
        return this.integrationImage;
    }

    public final String g() {
        return this.text;
    }

    public final int hashCode() {
        int a2 = shy.a(this.textColorDark, shy.a(this.textColor, shy.a(this.bkgColorDark, shy.a(this.bkgColor, this.text.hashCode() * 31, 31), 31), 31), 31);
        MarketBadgeTypeDto marketBadgeTypeDto = this.type;
        int hashCode = (a2 + (marketBadgeTypeDto == null ? 0 : marketBadgeTypeDto.hashCode())) * 31;
        MarketBadgeSubtypeDto marketBadgeSubtypeDto = this.subtype;
        int hashCode2 = (hashCode + (marketBadgeSubtypeDto == null ? 0 : marketBadgeSubtypeDto.hashCode())) * 31;
        String str = this.tooltipHeader;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tooltipText;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tooltipFooter;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<BaseImageDto> list = this.integrationImage;
        return hashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final int i() {
        return this.textColor;
    }

    public final int j() {
        return this.textColorDark;
    }

    public final MarketBadgeTypeDto k() {
        return this.type;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketBadgeDto(text=");
        sb.append(this.text);
        sb.append(", bkgColor=");
        sb.append(this.bkgColor);
        sb.append(", bkgColorDark=");
        sb.append(this.bkgColorDark);
        sb.append(", textColor=");
        sb.append(this.textColor);
        sb.append(", textColorDark=");
        sb.append(this.textColorDark);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", subtype=");
        sb.append(this.subtype);
        sb.append(", tooltipHeader=");
        sb.append(this.tooltipHeader);
        sb.append(", tooltipText=");
        sb.append(this.tooltipText);
        sb.append(", tooltipFooter=");
        sb.append(this.tooltipFooter);
        sb.append(", integrationImage=");
        return ms9.a(')', sb, this.integrationImage);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeInt(this.bkgColor);
        parcel.writeInt(this.bkgColorDark);
        parcel.writeInt(this.textColor);
        parcel.writeInt(this.textColorDark);
        MarketBadgeTypeDto marketBadgeTypeDto = this.type;
        if (marketBadgeTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketBadgeTypeDto.writeToParcel(parcel, i);
        }
        MarketBadgeSubtypeDto marketBadgeSubtypeDto = this.subtype;
        if (marketBadgeSubtypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketBadgeSubtypeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.tooltipHeader);
        parcel.writeString(this.tooltipText);
        parcel.writeString(this.tooltipFooter);
        List<BaseImageDto> list = this.integrationImage;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((BaseImageDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketBadgeDto(String str, int i, int i2, int i3, int i4, MarketBadgeTypeDto marketBadgeTypeDto, MarketBadgeSubtypeDto marketBadgeSubtypeDto, String str2, String str3, String str4, List list, int i5, zcl zclVar) {
        this(str, i, i2, i3, i4, (i5 & 32) != 0 ? null : marketBadgeTypeDto, (i5 & 64) != 0 ? null : marketBadgeSubtypeDto, (i5 & 128) != 0 ? null : str2, (i5 & 256) != 0 ? null : str3, (i5 & 512) != 0 ? null : str4, (i5 & 1024) != 0 ? null : list);
    }
}
