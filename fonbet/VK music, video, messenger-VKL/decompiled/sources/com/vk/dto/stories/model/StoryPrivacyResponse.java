package com.vk.dto.stories.model;

import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: StoryPrivacyResponse.kt */
/* loaded from: classes18.dex */
public final class StoryPrivacyResponse {

    @pmi0("bestFriends")
    private final List<UserId> bestFriends;

    @pmi0("excludedFriends")
    private final List<UserId> excludedFriends;

    @pmi0("includedFriends")
    private final List<UserId> includedFriends;

    @pmi0("privacy")
    private final String privacy;

    public StoryPrivacyResponse(String str, List<UserId> list, List<UserId> list2, List<UserId> list3) {
        this.privacy = str;
        this.bestFriends = list;
        this.excludedFriends = list2;
        this.includedFriends = list3;
    }

    public final List<UserId> a() {
        return this.bestFriends;
    }

    public final List<UserId> b() {
        return this.excludedFriends;
    }

    public final List<UserId> c() {
        return this.includedFriends;
    }

    public final String d() {
        return this.privacy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryPrivacyResponse)) {
            return false;
        }
        StoryPrivacyResponse storyPrivacyResponse = (StoryPrivacyResponse) obj;
        return epx.f(this.privacy, storyPrivacyResponse.privacy) && epx.f(this.bestFriends, storyPrivacyResponse.bestFriends) && epx.f(this.excludedFriends, storyPrivacyResponse.excludedFriends) && epx.f(this.includedFriends, storyPrivacyResponse.includedFriends);
    }

    public final int hashCode() {
        String str = this.privacy;
        return this.includedFriends.hashCode() + fw3.a(fw3.a((str == null ? 0 : str.hashCode()) * 31, 31, this.bestFriends), 31, this.excludedFriends);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryPrivacyResponse(privacy=");
        sb.append(this.privacy);
        sb.append(", bestFriends=");
        sb.append(this.bestFriends);
        sb.append(", excludedFriends=");
        sb.append(this.excludedFriends);
        sb.append(", includedFriends=");
        return ms9.a(')', sb, this.includedFriends);
    }
}
