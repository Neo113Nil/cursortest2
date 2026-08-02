package com.vk.newsfeed.posting.impl.domain.model;

import com.vk.newsfeed.posting.impl.domain.model.e;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPlaceDto;
import java.util.List;
import xsna.epx;
import xsna.shy;
import xsna.vu5;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public final class g implements e.a {
    public final List<PostingPlaceDto> b;
    public final int c;

    public g(List list, int i) {
        this.b = list;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return epx.f(this.b, gVar.b) && this.c == gVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(5, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadedPlaces(places=");
        sb.append(this.b);
        sb.append(", offset=5, total=");
        return vu5.b(sb, this.c, ')');
    }
}
