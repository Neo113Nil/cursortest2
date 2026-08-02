package com.vk.catalog2.feature.music.dto.ui;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.serialize.Serializer;
import com.vk.dto.podcast.Podcast;
import java.util.Objects;
import xsna.dfp0;
import xsna.epx;
import xsna.ho8;
import xsna.qjg;

/* compiled from: UIBlockPodcastItem.kt */
/* loaded from: classes16.dex */
public final class UIBlockPodcastItem extends UIBlock implements dfp0 {
    public static final Serializer.c<UIBlockPodcastItem> CREATOR = new a();
    public final Podcast y;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockPodcastItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockPodcastItem a(Serializer serializer) {
            return new UIBlockPodcastItem(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockPodcastItem[i];
        }
    }

    public UIBlockPodcastItem(com.vk.catalog2.common.dto.api.ui.a aVar, Podcast podcast) {
        super(aVar);
        this.y = podcast;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return String.valueOf(this.y.b);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof UIBlockPodcastItem) && UIBlock.a.b(this, (UIBlock) obj)) {
            return epx.f(this.y, ((UIBlockPodcastItem) obj).y);
        }
        return false;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y);
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.y.m;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append('<');
        return ho8.a(sb, this.y.d, '>');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        return new UIBlockPodcastItem(Ab(), Podcast.a(this.y, false, 8191));
    }

    public UIBlockPodcastItem(Serializer serializer) {
        super(serializer);
        this.y = (Podcast) serializer.G(Podcast.class.getClassLoader());
    }
}
