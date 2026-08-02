package com.vk.newsfeed.presentation.model.actions;

import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import xsna.ck70;
import xsna.epx;

/* compiled from: NewsfeedExternalAction.kt */
/* loaded from: classes4.dex */
public final class a implements NewsfeedExternalAction.c {
    public final NewsEntry a;

    public a(NewsEntry newsEntry) {
        this.a = newsEntry;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ck70.a(new StringBuilder("LastRecommendItemClosed(entry="), this.a, ')');
    }
}
