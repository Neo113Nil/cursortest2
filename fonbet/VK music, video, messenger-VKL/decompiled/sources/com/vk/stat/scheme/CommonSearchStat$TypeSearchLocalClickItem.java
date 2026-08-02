package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: CommonSearchStat.kt */
/* loaded from: classes5.dex */
public final class CommonSearchStat$TypeSearchLocalClickItem implements SchemeStat$TypeClick.b {

    @pmi0("action")
    private final CommonSearchStat$TypeSearchClickActionItem action;

    @pmi0("block_name")
    private final CommonSearchStat$TypeSearchLocalBlockItem blockName;

    @pmi0("block_position")
    private final int blockPosition;

    @pmi0("search_query_uuid")
    private final String searchQueryUuid;

    @pmi0("service")
    private final CommonSearchStat$TypeSearchLocalServiceItem service;

    public CommonSearchStat$TypeSearchLocalClickItem(String str, CommonSearchStat$TypeSearchClickActionItem commonSearchStat$TypeSearchClickActionItem, CommonSearchStat$TypeSearchLocalServiceItem commonSearchStat$TypeSearchLocalServiceItem, CommonSearchStat$TypeSearchLocalBlockItem commonSearchStat$TypeSearchLocalBlockItem, int i) {
        this.searchQueryUuid = str;
        this.action = commonSearchStat$TypeSearchClickActionItem;
        this.service = commonSearchStat$TypeSearchLocalServiceItem;
        this.blockName = commonSearchStat$TypeSearchLocalBlockItem;
        this.blockPosition = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonSearchStat$TypeSearchLocalClickItem)) {
            return false;
        }
        CommonSearchStat$TypeSearchLocalClickItem commonSearchStat$TypeSearchLocalClickItem = (CommonSearchStat$TypeSearchLocalClickItem) obj;
        return epx.f(this.searchQueryUuid, commonSearchStat$TypeSearchLocalClickItem.searchQueryUuid) && this.action == commonSearchStat$TypeSearchLocalClickItem.action && this.service == commonSearchStat$TypeSearchLocalClickItem.service && this.blockName == commonSearchStat$TypeSearchLocalClickItem.blockName && this.blockPosition == commonSearchStat$TypeSearchLocalClickItem.blockPosition;
    }

    public final int hashCode() {
        return Integer.hashCode(this.blockPosition) + ((this.blockName.hashCode() + ((this.service.hashCode() + ((this.action.hashCode() + (this.searchQueryUuid.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeSearchLocalClickItem(searchQueryUuid=");
        sb.append(this.searchQueryUuid);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", service=");
        sb.append(this.service);
        sb.append(", blockName=");
        sb.append(this.blockName);
        sb.append(", blockPosition=");
        return vu5.b(sb, this.blockPosition, ')');
    }
}
