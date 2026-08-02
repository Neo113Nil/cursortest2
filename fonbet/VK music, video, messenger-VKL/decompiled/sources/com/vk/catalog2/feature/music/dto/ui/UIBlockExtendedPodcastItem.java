package com.vk.catalog2.feature.music.dto.ui;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.podcast.ExtendedPodcast;
import com.vk.dto.podcast.Podcast;
import java.util.Objects;
import xsna.epx;
import xsna.ho8;
import xsna.qjg;

/* compiled from: UIBlockExtendedPodcastItem.kt */
/* loaded from: classes16.dex */
public final class UIBlockExtendedPodcastItem extends UIBlock {
    public static final Serializer.c<UIBlockExtendedPodcastItem> CREATOR = new a();
    public final ExtendedPodcast y;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockExtendedPodcastItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockExtendedPodcastItem a(Serializer serializer) {
            return new UIBlockExtendedPodcastItem(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockExtendedPodcastItem[i];
        }
    }

    public UIBlockExtendedPodcastItem(com.vk.catalog2.common.dto.api.ui.a aVar, ExtendedPodcast extendedPodcast) {
        super(aVar);
        this.y = extendedPodcast;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        StringBuilder sb = new StringBuilder();
        Podcast podcast = this.y.f;
        sb.append(podcast.c);
        sb.append('_');
        sb.append(podcast.b);
        return sb.toString();
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof UIBlockExtendedPodcastItem) && UIBlock.a.b(this, (UIBlock) obj)) {
            return epx.f(this.y, ((UIBlockExtendedPodcastItem) obj).y);
        }
        return false;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append('<');
        return ho8.a(sb, this.y.b, '>');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        com.vk.catalog2.common.dto.api.ui.a Ab = Ab();
        ExtendedPodcast extendedPodcast = this.y;
        String str = extendedPodcast.b;
        String str2 = extendedPodcast.c;
        Image image = extendedPodcast.d;
        Image image2 = extendedPodcast.e;
        Podcast podcast = extendedPodcast.f;
        extendedPodcast.getClass();
        return new UIBlockExtendedPodcastItem(Ab, new ExtendedPodcast(str, str2, image, image2, podcast));
    }

    public UIBlockExtendedPodcastItem(Serializer serializer) {
        super(serializer);
        this.y = (ExtendedPodcast) serializer.G(ExtendedPodcast.class.getClassLoader());
    }
}
