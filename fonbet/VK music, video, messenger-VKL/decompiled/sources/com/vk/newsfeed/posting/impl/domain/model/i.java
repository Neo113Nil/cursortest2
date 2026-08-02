package com.vk.newsfeed.posting.impl.domain.model;

import android.location.Location;
import com.vk.newsfeed.posting.impl.domain.model.e;
import xsna.epx;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public final class i implements e.a {
    public final Location b;

    public i(Location location) {
        this.b = location;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SaveLastKnownGeo(location=" + this.b + ')';
    }
}
