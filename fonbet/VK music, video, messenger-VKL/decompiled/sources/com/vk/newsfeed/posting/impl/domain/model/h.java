package com.vk.newsfeed.posting.impl.domain.model;

import com.vk.newsfeed.posting.impl.domain.model.e;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public final class h implements e.a {
    public final GeoPermissionStatus b;

    public h(GeoPermissionStatus geoPermissionStatus) {
        this.b = geoPermissionStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.b == ((h) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SaveAccessStatus(geoAccessStatus=" + this.b + ')';
    }
}
