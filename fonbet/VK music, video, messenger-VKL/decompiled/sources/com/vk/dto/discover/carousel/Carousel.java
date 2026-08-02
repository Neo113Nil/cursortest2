package com.vk.dto.discover.carousel;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.LinkButton;
import com.vk.dto.discover.carousel.CarouselItem;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;
import xsna.epx;
import xsna.iux0;

/* compiled from: Carousel.kt */
/* loaded from: classes18.dex */
public abstract class Carousel<T extends CarouselItem> extends NewsEntry implements iux0 {
    public LinkButton i;
    public final String j;
    public final String k;
    public final String l;
    public final int m;
    public final String n;

    public Carousel(LinkButton linkButton, String str, String str2, String str3, int i, String str4) {
        super(new NewsEntry.TrackData(str3, 0, 0L, false, false, null, null, 0, 254, null));
        this.i = linkButton;
        this.j = str;
        this.k = str2;
        this.l = str3;
        this.m = i;
        this.n = str4;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Db() {
        return this.n;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public void O7(Serializer serializer) {
        serializer.i0(this.i);
        serializer.j0(this.j);
        serializer.j0(getTitle());
        serializer.j0(this.l);
        serializer.S(this.m);
        serializer.j0(this.n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        Carousel carousel = (Carousel) obj;
        return epx.f(carousel.j, this.j) && epx.f(carousel.l, this.l) && carousel.m == this.m;
    }

    public abstract List<T> getItems();

    @Override // xsna.iux0, xsna.kru
    public String getTitle() {
        return this.k;
    }

    public final int hashCode() {
        return Objects.hash(this.j, this.l, Integer.valueOf(this.m));
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return this.m;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Carousel(JSONObject jSONObject, int i, String str) {
        this(r0 != null ? new LinkButton(r0) : null, jSONObject.optString("objects_type"), jSONObject.optString("title"), jSONObject.optString("track_code"), i, str);
        JSONObject optJSONObject = jSONObject.optJSONObject("button");
    }

    public Carousel(Serializer serializer) {
        this((LinkButton) serializer.G(LinkButton.class.getClassLoader()), serializer.H(), serializer.H(), serializer.H(), serializer.u(), serializer.H());
    }
}
