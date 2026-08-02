package com.vk.newsfeed.domain.model;

import java.io.Serializable;
import xsna.vu5;

/* compiled from: NewsfeedInitialPost.kt */
/* loaded from: classes4.dex */
public final class NewsfeedInitialPost implements Serializable {
    private final long ownerId;
    private final int postId;

    public NewsfeedInitialPost(long j, int i) {
        this.ownerId = j;
        this.postId = i;
    }

    public final long d() {
        return this.ownerId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedInitialPost)) {
            return false;
        }
        NewsfeedInitialPost newsfeedInitialPost = (NewsfeedInitialPost) obj;
        return this.ownerId == newsfeedInitialPost.ownerId && this.postId == newsfeedInitialPost.postId;
    }

    public final int g() {
        return this.postId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.postId) + (Long.hashCode(this.ownerId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedInitialPost(ownerId=");
        sb.append(this.ownerId);
        sb.append(", postId=");
        return vu5.b(sb, this.postId, ')');
    }
}
