package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.epx;
import xsna.pmi0;

/* compiled from: CommonSearchStat.kt */
/* loaded from: classes5.dex */
public final class CommonSearchStat$TypeSearchItem implements SchemeStat$TypeAction.b {

    @pmi0("search_action")
    private final CommonSearchStat$TypeSearchAction searchAction;

    @pmi0("search_context")
    private final CommonSearchStat$TypeSearchContextItem searchContext;

    public CommonSearchStat$TypeSearchItem(CommonSearchStat$TypeSearchContextItem commonSearchStat$TypeSearchContextItem, CommonSearchStat$TypeSearchAction commonSearchStat$TypeSearchAction) {
        this.searchContext = commonSearchStat$TypeSearchContextItem;
        this.searchAction = commonSearchStat$TypeSearchAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonSearchStat$TypeSearchItem)) {
            return false;
        }
        CommonSearchStat$TypeSearchItem commonSearchStat$TypeSearchItem = (CommonSearchStat$TypeSearchItem) obj;
        return epx.f(this.searchContext, commonSearchStat$TypeSearchItem.searchContext) && epx.f(this.searchAction, commonSearchStat$TypeSearchItem.searchAction);
    }

    public final int hashCode() {
        return this.searchAction.hashCode() + (this.searchContext.hashCode() * 31);
    }

    public final String toString() {
        return "TypeSearchItem(searchContext=" + this.searchContext + ", searchAction=" + this.searchAction + ')';
    }
}
