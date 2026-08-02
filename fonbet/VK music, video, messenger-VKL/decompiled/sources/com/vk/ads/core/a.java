package com.vk.ads.core;

import android.graphics.Rect;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import xsna.asu0;
import xsna.jgp;
import xsna.kuc0;
import xsna.mh50;
import xsna.pwc0;
import xsna.u1c0;

/* compiled from: DataPreprocessor.kt */
/* loaded from: classes14.dex */
public final class a {
    public final Set<kuc0<pwc0>> a;
    public final ScheduledExecutorService b;
    public final mh50 c;
    public final ArrayList<u1c0> d;
    public int e;
    public Map<NewsEntry, Integer> f;
    public int g;

    public a(Rect rect, LinkedHashSet linkedHashSet) {
        this.a = linkedHashSet;
        asu0.a.getClass();
        this.b = asu0.v();
        this.c = new mh50(rect);
        this.d = new ArrayList<>();
        this.f = jgp.b;
        this.g = Integer.MAX_VALUE;
    }
}
