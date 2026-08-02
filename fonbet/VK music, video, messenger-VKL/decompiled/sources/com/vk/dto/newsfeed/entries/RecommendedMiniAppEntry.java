package com.vk.dto.newsfeed.entries;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.actions.Action;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;

/* compiled from: RecommendedMiniAppEntry.kt */
/* loaded from: classes18.dex */
public final class RecommendedMiniAppEntry extends NewsEntry {
    public static final Serializer.c<RecommendedMiniAppEntry> CREATOR = new a();
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final WebApiApplication m;
    public final List<Image> n;
    public final Image o;
    public final String p;
    public final Action q;
    public boolean r;
    public boolean s;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<RecommendedMiniAppEntry> {
        @Override // com.vk.core.serialize.Serializer.c
        public final RecommendedMiniAppEntry a(Serializer serializer) {
            return new RecommendedMiniAppEntry(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RecommendedMiniAppEntry[i];
        }
    }

    public RecommendedMiniAppEntry(String str, String str2, String str3, String str4, WebApiApplication webApiApplication, List<Image> list, Image image, String str5, Action action) {
        super(new NewsEntry.TrackData(str5, 0, 0L, false, false, null, null, 0, 254, null));
        this.i = str;
        this.j = str2;
        this.k = str3;
        this.l = str4;
        this.m = webApiApplication;
        this.n = list;
        this.o = image;
        this.p = str5;
        this.q = action;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Db() {
        return this.i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.j0(this.k);
        serializer.j0(this.l);
        serializer.e0(this.m);
        serializer.W(this.n);
        serializer.i0(this.o);
        serializer.j0(this.p);
        serializer.i0(this.q);
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return 39;
    }

    public RecommendedMiniAppEntry(Serializer serializer) {
        this(serializer.H(), serializer.H(), serializer.H(), serializer.H(), (WebApiApplication) serializer.A(WebApiApplication.class.getClassLoader()), serializer.k(Image.class), (Image) serializer.G(Image.class.getClassLoader()), serializer.H(), (Action) serializer.G(Action.class.getClassLoader()));
    }
}
