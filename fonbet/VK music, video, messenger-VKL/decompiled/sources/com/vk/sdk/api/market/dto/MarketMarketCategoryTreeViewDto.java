package com.vk.sdk.api.market.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.vp;
import xsna.zcl;

/* compiled from: MarketMarketCategoryTreeViewDto.kt */
/* loaded from: classes5.dex */
public final class MarketMarketCategoryTreeViewDto {

    @pmi0("root_path")
    private final List<String> rootPath;

    @pmi0("selected")
    private final Boolean selected;

    @pmi0("type")
    private final String type;

    public MarketMarketCategoryTreeViewDto() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketMarketCategoryTreeViewDto)) {
            return false;
        }
        MarketMarketCategoryTreeViewDto marketMarketCategoryTreeViewDto = (MarketMarketCategoryTreeViewDto) obj;
        return epx.f(this.type, marketMarketCategoryTreeViewDto.type) && epx.f(this.selected, marketMarketCategoryTreeViewDto.selected) && epx.f(this.rootPath, marketMarketCategoryTreeViewDto.rootPath);
    }

    public final int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.selected;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<String> list = this.rootPath;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.type;
        Boolean bool = this.selected;
        List<String> list = this.rootPath;
        StringBuilder sb = new StringBuilder("MarketMarketCategoryTreeViewDto(type=");
        sb.append(str);
        sb.append(", selected=");
        sb.append(bool);
        sb.append(", rootPath=");
        return vp.b(")", sb, list);
    }

    public MarketMarketCategoryTreeViewDto(String str, Boolean bool, List<String> list) {
        this.type = str;
        this.selected = bool;
        this.rootPath = list;
    }

    public /* synthetic */ MarketMarketCategoryTreeViewDto(String str, Boolean bool, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : list);
    }
}
