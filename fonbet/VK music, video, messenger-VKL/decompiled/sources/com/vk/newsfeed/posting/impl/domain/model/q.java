package com.vk.newsfeed.posting.impl.domain.model;

import com.vk.newsfeed.posting.impl.domain.model.e;
import xsna.epx;
import xsna.oq;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public final class q implements e.f {
    public final Throwable b;

    public q(Throwable th) {
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && epx.f(this.b, ((q) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return oq.c(new StringBuilder("Failed(throwable="), this.b, ')');
    }
}
