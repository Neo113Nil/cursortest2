package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.bh10;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;

/* compiled from: CommonSearchStat.kt */
/* loaded from: classes5.dex */
public final class CommonSearchStat$TypeLocalSearchItem implements SchemeStat$TypeAction.b {

    @pmi0("block_name")
    private final CommonSearchStat$TypeSearchLocalBlockItem blockName;

    @pmi0("block_position")
    private final int blockPosition;

    @pmi0("query_duration")
    private final long queryDuration;

    @pmi0("query_text")
    private final String queryText;

    @pmi0("search_query_uuid")
    private final String searchQueryUuid;

    @pmi0("service")
    private final CommonSearchStat$TypeSearchLocalServiceItem service;

    @pmi0("total_results")
    private final int totalResults;

    public CommonSearchStat$TypeLocalSearchItem(String str, String str2, long j, int i, CommonSearchStat$TypeSearchLocalServiceItem commonSearchStat$TypeSearchLocalServiceItem, CommonSearchStat$TypeSearchLocalBlockItem commonSearchStat$TypeSearchLocalBlockItem, int i2) {
        this.queryText = str;
        this.searchQueryUuid = str2;
        this.queryDuration = j;
        this.totalResults = i;
        this.service = commonSearchStat$TypeSearchLocalServiceItem;
        this.blockName = commonSearchStat$TypeSearchLocalBlockItem;
        this.blockPosition = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonSearchStat$TypeLocalSearchItem)) {
            return false;
        }
        CommonSearchStat$TypeLocalSearchItem commonSearchStat$TypeLocalSearchItem = (CommonSearchStat$TypeLocalSearchItem) obj;
        return epx.f(this.queryText, commonSearchStat$TypeLocalSearchItem.queryText) && epx.f(this.searchQueryUuid, commonSearchStat$TypeLocalSearchItem.searchQueryUuid) && this.queryDuration == commonSearchStat$TypeLocalSearchItem.queryDuration && this.totalResults == commonSearchStat$TypeLocalSearchItem.totalResults && this.service == commonSearchStat$TypeLocalSearchItem.service && this.blockName == commonSearchStat$TypeLocalSearchItem.blockName && this.blockPosition == commonSearchStat$TypeLocalSearchItem.blockPosition;
    }

    public final int hashCode() {
        return Integer.hashCode(this.blockPosition) + ((this.blockName.hashCode() + ((this.service.hashCode() + shy.a(this.totalResults, bh10.a(urd0.a(this.queryText.hashCode() * 31, 31, this.searchQueryUuid), 31, this.queryDuration), 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeLocalSearchItem(queryText=");
        sb.append(this.queryText);
        sb.append(", searchQueryUuid=");
        sb.append(this.searchQueryUuid);
        sb.append(", queryDuration=");
        sb.append(this.queryDuration);
        sb.append(", totalResults=");
        sb.append(this.totalResults);
        sb.append(", service=");
        sb.append(this.service);
        sb.append(", blockName=");
        sb.append(this.blockName);
        sb.append(", blockPosition=");
        return vu5.b(sb, this.blockPosition, ')');
    }
}
