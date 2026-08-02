package com.vk.dto.stories.model;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.stories.entities.PromoData;
import com.vk.dto.stories.model.ideas.StoryIdea;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.zcl;

/* compiled from: IdeasStoriesContainer.kt */
/* loaded from: classes18.dex */
public final class IdeasStoriesContainer extends StoriesContainer {
    public static final Serializer.c<IdeasStoriesContainer> CREATOR = new a();
    public final List<StoryIdea> o;
    public final String p;
    public final String q;
    public final Integer r;
    public final String s;
    public final PromoData t;
    public final boolean u;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<IdeasStoriesContainer> {
        @Override // com.vk.core.serialize.Serializer.c
        public final IdeasStoriesContainer a(Serializer serializer) {
            return new IdeasStoriesContainer(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IdeasStoriesContainer[i];
        }
    }

    public /* synthetic */ IdeasStoriesContainer(List list, Integer num, String str, String str2, String str3, PromoData promoData, boolean z, boolean z2, String str4, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : promoData, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? null : str4);
    }

    @Override // com.vk.dto.stories.model.StoriesContainer
    public final boolean Cb() {
        return this.e;
    }

    @Override // com.vk.dto.stories.model.StoriesContainer
    public final boolean Eb() {
        List<StoryIdea> list = this.o;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((StoryIdea) it.next()).e > System.currentTimeMillis() / 1000) {
                return true;
            }
        }
        return false;
    }

    @Override // com.vk.dto.stories.model.StoriesContainer
    public final String Hb(int i) {
        Image image;
        ImageSize Cb;
        PromoData promoData = this.t;
        if (promoData == null || (image = promoData.c) == null || (Cb = image.Cb(i, true, false)) == null) {
            return null;
        }
        return Cb.d.d;
    }

    @Override // com.vk.dto.stories.model.StoriesContainer
    public final String Ib() {
        String str = this.s;
        return str == null ? zb() : str;
    }

    @Override // com.vk.dto.stories.model.StoriesContainer, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.f0(this.o);
        serializer.V(this.r);
        serializer.m0(this.p);
        serializer.m0(this.q);
        serializer.m0(this.s);
        serializer.i0(this.t);
        serializer.J(Boolean.valueOf(this.u));
    }

    @Override // com.vk.dto.stories.model.StoriesContainer
    public final String Ob() {
        String str = this.f;
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return this.r == null ? "promo_ideas" : super.Ob();
    }

    public IdeasStoriesContainer(Serializer serializer, zcl zclVar) {
        super(serializer);
        this.o = serializer.B(StoryIdea.class.getClassLoader());
        this.r = serializer.v();
        this.p = serializer.I();
        this.q = serializer.I();
        this.s = serializer.I();
        this.t = (PromoData) serializer.G(PromoData.class.getClassLoader());
        Boolean n = serializer.n();
        this.u = n != null ? n.booleanValue() : false;
    }

    public IdeasStoriesContainer(List<StoryIdea> list, Integer num, String str, String str2, String str3, PromoData promoData, boolean z, boolean z2, String str4) {
        super(null, EmptyList.b, str4, z2);
        this.o = list;
        this.r = num;
        this.p = str;
        this.q = str2;
        this.s = str3;
        this.t = promoData;
        this.u = z;
    }
}
