package com.vk.catalog2.feature.music.dto.ui;

import com.vk.catalog2.common.dto.api.music.CatalogAudioContentCard;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.a;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.podcast.Podcast;
import java.util.Objects;
import xsna.epx;
import xsna.qjg;
import xsna.zcl;

/* compiled from: UIBlockAudioContentCard.kt */
/* loaded from: classes16.dex */
public abstract class UIBlockAudioContentCard extends UIBlock {
    public UIBlockAudioContentCard(Serializer serializer, zcl zclVar) {
        super(serializer);
    }

    public abstract UIBlockActionOpenUrl Pb();

    public abstract CatalogAudioContentCard Qb();

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return qjg.a(this) + "(type=" + Qb().b + " id=" + Qb().c + " ownerId=" + Qb().d;
    }

    public UIBlockAudioContentCard(a aVar, zcl zclVar) {
        super(aVar);
    }

    /* compiled from: UIBlockAudioContentCard.kt */
    public static final class AudioBookCard extends UIBlockAudioContentCard {
        public static final Serializer.c<AudioBookCard> CREATOR = new a();
        public final AudioBook A;
        public final CatalogAudioContentCard y;
        public final UIBlockActionOpenUrl z;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<AudioBookCard> {
            @Override // com.vk.core.serialize.Serializer.c
            public final AudioBookCard a(Serializer serializer) {
                return new AudioBookCard(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AudioBookCard[i];
            }
        }

        public AudioBookCard(CatalogAudioContentCard catalogAudioContentCard, UIBlockActionOpenUrl uIBlockActionOpenUrl, AudioBook audioBook, com.vk.catalog2.common.dto.api.ui.a aVar) {
            super(aVar, (zcl) null);
            this.y = catalogAudioContentCard;
            this.z = uIBlockActionOpenUrl;
            this.A = audioBook;
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final String Fb() {
            return this.y.Ab();
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            super.O7(serializer);
            serializer.i0(this.y);
            serializer.i0(this.z);
            serializer.i0(this.A);
        }

        @Override // com.vk.catalog2.feature.music.dto.ui.UIBlockAudioContentCard
        public final UIBlockActionOpenUrl Pb() {
            return this.z;
        }

        @Override // com.vk.catalog2.feature.music.dto.ui.UIBlockAudioContentCard
        public final CatalogAudioContentCard Qb() {
            return this.y;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof AudioBookCard) || !UIBlock.a.b(this, (UIBlock) obj)) {
                return false;
            }
            AudioBookCard audioBookCard = (AudioBookCard) obj;
            return epx.f(this.y, audioBookCard.y) && epx.f(this.z, audioBookCard.z) && epx.f(this.A, audioBookCard.A);
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final int hashCode() {
            return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.z, this.A);
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final UIBlock zb() {
            CatalogAudioContentCard zb = CatalogAudioContentCard.zb(this.y);
            UIBlockActionOpenUrl uIBlockActionOpenUrl = this.z;
            return new AudioBookCard(zb, uIBlockActionOpenUrl != null ? uIBlockActionOpenUrl.zb() : null, AudioBook.zb(this.A, null, false, 4194303), Ab());
        }

        public AudioBookCard(Serializer serializer) {
            super(serializer, (zcl) null);
            CatalogAudioContentCard catalogAudioContentCard = (CatalogAudioContentCard) serializer.G(CatalogAudioContentCard.class.getClassLoader());
            this.y = catalogAudioContentCard == null ? CatalogAudioContentCard.j : catalogAudioContentCard;
            this.z = (UIBlockActionOpenUrl) serializer.G(UIBlockActionOpenUrl.class.getClassLoader());
            AudioBook audioBook = (AudioBook) serializer.G(AudioBook.class.getClassLoader());
            if (audioBook == null) {
                Serializer.c<AudioBook> cVar = AudioBook.CREATOR;
                audioBook = AudioBook.y;
            }
            this.A = audioBook;
        }
    }

    /* compiled from: UIBlockAudioContentCard.kt */
    public static final class PodcastCard extends UIBlockAudioContentCard {
        public static final Serializer.c<PodcastCard> CREATOR = new a();
        public final Podcast A;
        public final CatalogAudioContentCard y;
        public final UIBlockActionOpenUrl z;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<PodcastCard> {
            @Override // com.vk.core.serialize.Serializer.c
            public final PodcastCard a(Serializer serializer) {
                return new PodcastCard(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PodcastCard[i];
            }
        }

        public PodcastCard(CatalogAudioContentCard catalogAudioContentCard, UIBlockActionOpenUrl uIBlockActionOpenUrl, Podcast podcast, com.vk.catalog2.common.dto.api.ui.a aVar) {
            super(aVar, (zcl) null);
            this.y = catalogAudioContentCard;
            this.z = uIBlockActionOpenUrl;
            this.A = podcast;
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final String Fb() {
            return this.y.Ab();
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            super.O7(serializer);
            serializer.i0(this.y);
            serializer.i0(this.z);
            serializer.i0(this.A);
        }

        @Override // com.vk.catalog2.feature.music.dto.ui.UIBlockAudioContentCard
        public final UIBlockActionOpenUrl Pb() {
            return this.z;
        }

        @Override // com.vk.catalog2.feature.music.dto.ui.UIBlockAudioContentCard
        public final CatalogAudioContentCard Qb() {
            return this.y;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof PodcastCard) || !UIBlock.a.b(this, (UIBlock) obj)) {
                return false;
            }
            PodcastCard podcastCard = (PodcastCard) obj;
            return epx.f(this.y, podcastCard.y) && epx.f(this.z, podcastCard.z) && epx.f(this.A, podcastCard.A);
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final int hashCode() {
            return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.z, this.A);
        }

        @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
        public final UIBlock zb() {
            CatalogAudioContentCard zb = CatalogAudioContentCard.zb(this.y);
            UIBlockActionOpenUrl uIBlockActionOpenUrl = this.z;
            return new PodcastCard(zb, uIBlockActionOpenUrl != null ? uIBlockActionOpenUrl.zb() : null, Podcast.a(this.A, false, 8191), Ab());
        }

        public PodcastCard(Serializer serializer) {
            super(serializer, (zcl) null);
            CatalogAudioContentCard catalogAudioContentCard = (CatalogAudioContentCard) serializer.G(CatalogAudioContentCard.class.getClassLoader());
            this.y = catalogAudioContentCard == null ? CatalogAudioContentCard.j : catalogAudioContentCard;
            this.z = (UIBlockActionOpenUrl) serializer.G(UIBlockActionOpenUrl.class.getClassLoader());
            Podcast podcast = (Podcast) serializer.G(Podcast.class.getClassLoader());
            this.A = podcast == null ? Podcast.p : podcast;
        }
    }
}
