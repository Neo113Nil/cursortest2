package com.vk.feed.core.models.news;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.LinkButton;
import com.vk.feed.core.models.Animation;
import com.vk.feed.core.models.news.NewsEntry;
import xsna.epx;

/* compiled from: AnimatedBlockEntry.kt */
/* loaded from: classes18.dex */
public final class AnimatedBlockEntry extends NewsEntry {
    public static final Serializer.c<AnimatedBlockEntry> CREATOR = new a();
    public final String i;
    public final String j;
    public final String k;
    public final Animation l;
    public final String m;
    public final AnimatedBlockEntry$Companion$DecorationType n;
    public final boolean o;
    public final LinkButton p;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AnimatedBlockEntry> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AnimatedBlockEntry a(Serializer serializer) {
            return new AnimatedBlockEntry(serializer.H(), serializer.H(), serializer.H(), (Animation) serializer.G(Animation.class.getClassLoader()), serializer.H(), (AnimatedBlockEntry$Companion$DecorationType) serializer.C(), serializer.m(), (LinkButton) serializer.G(LinkButton.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AnimatedBlockEntry[i];
        }
    }

    public AnimatedBlockEntry(String str, String str2, String str3, Animation animation, String str4, AnimatedBlockEntry$Companion$DecorationType animatedBlockEntry$Companion$DecorationType, boolean z, LinkButton linkButton) {
        super(new NewsEntry.TrackData(str4, 0, 0L, false, false, null, null, 0, 254, null));
        this.i = str;
        this.j = str2;
        this.k = str3;
        this.l = animation;
        this.m = str4;
        this.n = animatedBlockEntry$Companion$DecorationType;
        this.o = z;
        this.p = linkButton;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Db() {
        return "animated_block";
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.j0(this.k);
        serializer.i0(this.l);
        serializer.j0(this.m);
        serializer.g0(this.n);
        serializer.L(this.o ? (byte) 1 : (byte) 0);
        serializer.i0(this.p);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof AnimatedBlockEntry)) {
            return false;
        }
        return epx.f(this.k, ((AnimatedBlockEntry) obj).k);
    }

    public final int hashCode() {
        return this.k.hashCode();
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return 30;
    }
}
