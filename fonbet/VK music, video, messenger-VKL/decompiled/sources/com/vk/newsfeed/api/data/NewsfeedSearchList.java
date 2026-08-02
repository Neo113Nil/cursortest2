package com.vk.newsfeed.api.data;

import androidx.annotation.Nullable;
import com.vk.dto.common.data.VKFromList;
import com.vk.dto.stories.model.GetStoriesResponse;

/* loaded from: classes3.dex */
public class NewsfeedSearchList<T> extends VKFromList<T> {
    public final String query;

    @Nullable
    public final GetStoriesResponse stories;
    public final String suggestedQuery;

    public NewsfeedSearchList(String str, String str2, String str3) {
        super(str);
        this.query = str2;
        this.suggestedQuery = str3;
        this.stories = null;
    }
}
