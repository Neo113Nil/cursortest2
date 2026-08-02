package com.vk.stat.scheme;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClassifiedsPublishProductClickItem {

    @pmi0("url")
    private final String url;

    public SchemeStat$TypeClassifiedsPublishProductClickItem(String str) {
        this.url = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SchemeStat$TypeClassifiedsPublishProductClickItem) && epx.f(this.url, ((SchemeStat$TypeClassifiedsPublishProductClickItem) obj).url);
    }

    public final int hashCode() {
        return this.url.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("TypeClassifiedsPublishProductClickItem(url="), this.url, ')');
    }
}
