package com.vk.newsfeed.api.data;

import android.util.ArrayMap;
import androidx.annotation.Nullable;
import com.vk.dto.common.data.VKFromList;
import com.vk.dto.reactions.ReactionSet;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;
import xsna.jtf0;

/* loaded from: classes3.dex */
public class NewsfeedGetResponse extends VKFromList<NewsEntry> {
    public long createdAt;
    public boolean isFromCache;
    public boolean isPullToRefresh;

    @Nullable
    public Boolean isSmartNews;

    @Nullable
    public List<NewsfeedList> lists;

    @Nullable
    public ArrayMap<String, ReactionSet> reactionSets;

    @Nullable
    public jtf0 reloadListMethod;
    public int reqListId;
    public long requestedAt;

    @Nullable
    public String sessionIdNextFrom;

    @Nullable
    public String startFrom;

    public NewsfeedGetResponse(String str) {
        super(str);
        this.lists = null;
        this.createdAt = System.currentTimeMillis();
        this.isPullToRefresh = false;
    }

    public final boolean j() {
        return Boolean.TRUE.equals(this.isSmartNews);
    }
}
