package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketMarketCategoryTreeDto.kt */
/* loaded from: classes15.dex */
public final class MarketMarketCategoryTreeDto implements Parcelable {
    public static final Parcelable.Creator<MarketMarketCategoryTreeDto> CREATOR = new a();

    @pmi0("children")
    private final List<MarketMarketCategoryTreeDto> children;

    @pmi0("icon")
    private final List<BaseImageDto> icon;

    @pmi0("icon_name")
    private final String iconName;

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    @pmi0("page_description")
    private final String pageDescription;

    @pmi0("page_title")
    private final String pageTitle;

    @pmi0("seo_name")
    private final String seoName;

    @pmi0("url")
    private final String url;

    @pmi0(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)
    private final MarketMarketCategoryTreeViewDto view;

    /* compiled from: MarketMarketCategoryTreeDto.kt */
    public static final class a implements Parcelable.Creator<MarketMarketCategoryTreeDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketMarketCategoryTreeDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = bo.b(MarketMarketCategoryTreeDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = en.a(MarketMarketCategoryTreeDto.CREATOR, parcel, arrayList3, i, 1);
                }
                arrayList2 = arrayList3;
            }
            return new MarketMarketCategoryTreeDto(readInt, readString, readString2, arrayList, arrayList2, parcel.readInt() != 0 ? MarketMarketCategoryTreeViewDto.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketMarketCategoryTreeDto[] newArray(int i) {
            return new MarketMarketCategoryTreeDto[i];
        }
    }

    public MarketMarketCategoryTreeDto(int i, String str, String str2, List<BaseImageDto> list, List<MarketMarketCategoryTreeDto> list2, MarketMarketCategoryTreeViewDto marketMarketCategoryTreeViewDto, String str3, String str4, String str5, String str6) {
        this.id = i;
        this.name = str;
        this.iconName = str2;
        this.icon = list;
        this.children = list2;
        this.view = marketMarketCategoryTreeViewDto;
        this.url = str3;
        this.seoName = str4;
        this.pageTitle = str5;
        this.pageDescription = str6;
    }

    public final List<MarketMarketCategoryTreeDto> d() {
        return this.children;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<BaseImageDto> e() {
        return this.icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketMarketCategoryTreeDto)) {
            return false;
        }
        MarketMarketCategoryTreeDto marketMarketCategoryTreeDto = (MarketMarketCategoryTreeDto) obj;
        return this.id == marketMarketCategoryTreeDto.id && epx.f(this.name, marketMarketCategoryTreeDto.name) && epx.f(this.iconName, marketMarketCategoryTreeDto.iconName) && epx.f(this.icon, marketMarketCategoryTreeDto.icon) && epx.f(this.children, marketMarketCategoryTreeDto.children) && epx.f(this.view, marketMarketCategoryTreeDto.view) && epx.f(this.url, marketMarketCategoryTreeDto.url) && epx.f(this.seoName, marketMarketCategoryTreeDto.seoName) && epx.f(this.pageTitle, marketMarketCategoryTreeDto.pageTitle) && epx.f(this.pageDescription, marketMarketCategoryTreeDto.pageDescription);
    }

    public final String f() {
        return this.name;
    }

    public final MarketMarketCategoryTreeViewDto g() {
        return this.view;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.id) * 31, 31, this.name);
        String str = this.iconName;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        List<BaseImageDto> list = this.icon;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<MarketMarketCategoryTreeDto> list2 = this.children;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        MarketMarketCategoryTreeViewDto marketMarketCategoryTreeViewDto = this.view;
        int hashCode4 = (hashCode3 + (marketMarketCategoryTreeViewDto == null ? 0 : marketMarketCategoryTreeViewDto.hashCode())) * 31;
        String str2 = this.url;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.seoName;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.pageTitle;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.pageDescription;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketMarketCategoryTreeDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", iconName=");
        sb.append(this.iconName);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", children=");
        sb.append(this.children);
        sb.append(", view=");
        sb.append(this.view);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", seoName=");
        sb.append(this.seoName);
        sb.append(", pageTitle=");
        sb.append(this.pageTitle);
        sb.append(", pageDescription=");
        return ho8.a(sb, this.pageDescription, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.iconName);
        List<BaseImageDto> list = this.icon;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<MarketMarketCategoryTreeDto> list2 = this.children;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((MarketMarketCategoryTreeDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        MarketMarketCategoryTreeViewDto marketMarketCategoryTreeViewDto = this.view;
        if (marketMarketCategoryTreeViewDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketMarketCategoryTreeViewDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.url);
        parcel.writeString(this.seoName);
        parcel.writeString(this.pageTitle);
        parcel.writeString(this.pageDescription);
    }

    public /* synthetic */ MarketMarketCategoryTreeDto(int i, String str, String str2, List list, List list2, MarketMarketCategoryTreeViewDto marketMarketCategoryTreeViewDto, String str3, String str4, String str5, String str6, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : list, (i2 & 16) != 0 ? null : list2, (i2 & 32) != 0 ? null : marketMarketCategoryTreeViewDto, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : str4, (i2 & 256) != 0 ? null : str5, (i2 & 512) != 0 ? null : str6);
    }
}
