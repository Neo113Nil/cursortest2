package com.vk.newsfeed.posting.impl.domain.model;

import com.vk.newsfeed.posting.impl.domain.model.e;
import xsna.epx;
import xsna.iq;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public final class p implements e.f {
    public final Long b;
    public final Long c;

    public p(Long l, Long l2) {
        this.b = l;
        this.c = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return epx.f(this.b, pVar.b) && epx.f(this.c, pVar.c);
    }

    public final int hashCode() {
        Long l = this.b;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.c;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SaveStartTime(startScreenTime=");
        sb.append(this.b);
        sb.append(", startScreenElapsedTime=");
        return iq.b(sb, this.c, ')');
    }
}
