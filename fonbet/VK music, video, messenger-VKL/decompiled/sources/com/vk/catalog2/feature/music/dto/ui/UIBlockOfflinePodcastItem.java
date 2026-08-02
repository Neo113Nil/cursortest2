package com.vk.catalog2.feature.music.dto.ui;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.serialize.Serializer;
import com.vk.dto.podcast.OfflinePodcast;
import com.vk.dto.podcast.Podcast;
import java.util.Objects;
import xsna.dfp0;
import xsna.epx;
import xsna.ho8;
import xsna.qjg;

/* compiled from: UIBlockOfflinePodcastItem.kt */
/* loaded from: classes16.dex */
public final class UIBlockOfflinePodcastItem extends UIBlock implements dfp0 {
    public static final Serializer.c<UIBlockOfflinePodcastItem> CREATOR = new a();
    public final OfflinePodcast y;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockOfflinePodcastItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockOfflinePodcastItem a(Serializer serializer) {
            return new UIBlockOfflinePodcastItem(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockOfflinePodcastItem[i];
        }
    }

    public UIBlockOfflinePodcastItem(com.vk.catalog2.common.dto.api.ui.a aVar, OfflinePodcast offlinePodcast) {
        super(aVar);
        this.y = offlinePodcast;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return String.valueOf(this.y.b.b);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof UIBlockOfflinePodcastItem) && UIBlock.a.b(this, (UIBlock) obj)) {
            return epx.f(this.y, ((UIBlockOfflinePodcastItem) obj).y);
        }
        return false;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y);
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.y.b.m;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append('<');
        return ho8.a(sb, this.y.b.d, '>');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        com.vk.catalog2.common.dto.api.ui.a Ab = Ab();
        OfflinePodcast offlinePodcast = this.y;
        Podcast podcast = offlinePodcast.b;
        int i = offlinePodcast.c;
        long j = offlinePodcast.d;
        offlinePodcast.getClass();
        return new UIBlockOfflinePodcastItem(Ab, new OfflinePodcast(podcast, i, j));
    }

    public UIBlockOfflinePodcastItem(Serializer serializer) {
        super(serializer);
        this.y = (OfflinePodcast) serializer.G(OfflinePodcast.class.getClassLoader());
    }
}
