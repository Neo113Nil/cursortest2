package com.vk.newsfeed.posting.impl.domain.model;

import com.vk.newsfeed.posting.impl.domain.model.e;
import xsna.vu5;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public final class n implements e.f {
    public final long b;

    public n(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.b == ((n) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return vu5.a(')', this.b, new StringBuilder("SaveCreationTime(elapsedTime="));
    }
}
