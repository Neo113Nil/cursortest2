package com.vk.newsfeed.posting.impl.domain.model;

import com.vk.newsfeed.posting.impl.domain.model.e;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public final class f implements e.a {
    public final PlacesLoadingState b;

    public f(PlacesLoadingState placesLoadingState) {
        this.b = placesLoadingState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.b == ((f) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ChangePlacesLoadingState(loadingState=" + this.b + ')';
    }
}
