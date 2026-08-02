package com.vk.sdk.api.market.dto;

import com.mbridge.msdk.MBridgeConstans;
import com.vk.movika.sdk.base.model.history.b;
import java.util.List;
import xsna.epx;
import xsna.kh10;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketMarketCategoryTreeDto.kt */
/* loaded from: classes5.dex */
public final class MarketMarketCategoryTreeDto {

    @pmi0("children")
    private final List<MarketMarketCategoryTreeDto> children;

    @pmi0("icon_name")
    private final String iconName;

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    @pmi0("url")
    private final String url;

    @pmi0(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)
    private final MarketMarketCategoryTreeViewDto view;

    public MarketMarketCategoryTreeDto(int i, String str, String str2, List<MarketMarketCategoryTreeDto> list, MarketMarketCategoryTreeViewDto marketMarketCategoryTreeViewDto, String str3) {
        this.id = i;
        this.name = str;
        this.iconName = str2;
        this.children = list;
        this.view = marketMarketCategoryTreeViewDto;
        this.url = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketMarketCategoryTreeDto)) {
            return false;
        }
        MarketMarketCategoryTreeDto marketMarketCategoryTreeDto = (MarketMarketCategoryTreeDto) obj;
        return this.id == marketMarketCategoryTreeDto.id && epx.f(this.name, marketMarketCategoryTreeDto.name) && epx.f(this.iconName, marketMarketCategoryTreeDto.iconName) && epx.f(this.children, marketMarketCategoryTreeDto.children) && epx.f(this.view, marketMarketCategoryTreeDto.view) && epx.f(this.url, marketMarketCategoryTreeDto.url);
    }

    public final int hashCode() {
        int a = urd0.a(Integer.hashCode(this.id) * 31, 31, this.name);
        String str = this.iconName;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        List<MarketMarketCategoryTreeDto> list = this.children;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        MarketMarketCategoryTreeViewDto marketMarketCategoryTreeViewDto = this.view;
        int hashCode3 = (hashCode2 + (marketMarketCategoryTreeViewDto == null ? 0 : marketMarketCategoryTreeViewDto.hashCode())) * 31;
        String str2 = this.url;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.id;
        String str = this.name;
        String str2 = this.iconName;
        List<MarketMarketCategoryTreeDto> list = this.children;
        MarketMarketCategoryTreeViewDto marketMarketCategoryTreeViewDto = this.view;
        String str3 = this.url;
        StringBuilder a = kh10.a(i, "MarketMarketCategoryTreeDto(id=", ", name=", str, ", iconName=");
        b.c(str2, ", children=", ", view=", a, list);
        a.append(marketMarketCategoryTreeViewDto);
        a.append(", url=");
        a.append(str3);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ MarketMarketCategoryTreeDto(int i, String str, String str2, List list, MarketMarketCategoryTreeViewDto marketMarketCategoryTreeViewDto, String str3, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : list, (i2 & 16) != 0 ? null : marketMarketCategoryTreeViewDto, (i2 & 32) != 0 ? null : str3);
    }
}
