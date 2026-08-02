package com.zoho.livechat.android.models;

import com.zoho.livechat.android.utils.LiveChatUtil;
import java.util.Hashtable;

@Deprecated
/* loaded from: classes4.dex */
public class SalesIQArticleCategory {
    private final String categoryId;
    private final String categoryName;
    private int count;
    private int order;

    @Deprecated
    public SalesIQArticleCategory(Hashtable hashtable) {
        this.categoryId = LiveChatUtil.getString(hashtable.get("categoryid"));
        this.count = LiveChatUtil.getInteger(hashtable.get("count")).intValue();
        this.categoryName = LiveChatUtil.getString(hashtable.get("categoryname"));
        this.order = LiveChatUtil.getInteger(hashtable.get("categoryorder")).intValue();
    }

    @Deprecated
    public String getCategoryId() {
        return this.categoryId;
    }

    @Deprecated
    public String getCategoryName() {
        return this.categoryName;
    }

    @Deprecated
    public int getCount() {
        return this.count;
    }

    @Deprecated
    public int getOrder() {
        return this.order;
    }
}
