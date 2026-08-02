package com.vk.newsfeed.impl.requests;

import com.vk.dto.common.data.VKFromList;
import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: WallWithCounters.kt */
/* loaded from: classes4.dex */
public final class WallWithCounters extends VKFromList<NewsEntry> {
    public static final WallWithCounters b = new WallWithCounters("");
    private final int draftsCount;
    private final String nextFrom;
    private final int postponedCount;
    private final int suggestedCount;
    private final int total;

    public /* synthetic */ WallWithCounters(String str) {
        this(str, 0, 0, 0, 0);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof NewsEntry) {
            return super.contains((NewsEntry) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof NewsEntry) {
            return super.indexOf((NewsEntry) obj);
        }
        return -1;
    }

    public final int j() {
        return this.draftsCount;
    }

    public final int k() {
        return this.postponedCount;
    }

    public final int l() {
        return this.suggestedCount;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof NewsEntry) {
            return super.lastIndexOf((NewsEntry) obj);
        }
        return -1;
    }

    public final int m() {
        return this.total;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof NewsEntry) {
            return super.remove((NewsEntry) obj);
        }
        return false;
    }

    @Override // com.vk.dto.common.data.VKFromList
    public final String s1() {
        return this.nextFrom;
    }

    public WallWithCounters(String str, int i, int i2, int i3, int i4) {
        super(str);
        this.nextFrom = str;
        this.postponedCount = i;
        this.suggestedCount = i2;
        this.draftsCount = i3;
        this.total = i4;
    }
}
