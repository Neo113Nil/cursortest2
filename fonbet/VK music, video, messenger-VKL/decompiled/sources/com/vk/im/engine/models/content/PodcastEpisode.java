package com.vk.im.engine.models.content;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import xsna.bh10;
import xsna.epx;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;

/* compiled from: PodcastEpisode.kt */
/* loaded from: classes2.dex */
public final class PodcastEpisode extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<PodcastEpisode> CREATOR = new a();
    public final int b;
    public final UserId c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public final LinkButton h;
    public final Image i;
    public final boolean j;
    public final MusicTrack.AssistantData k;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PodcastEpisode> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PodcastEpisode a(Serializer serializer) {
            return new PodcastEpisode(serializer.u(), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.H(), serializer.H(), serializer.u(), serializer.H(), (LinkButton) serializer.G(LinkButton.class.getClassLoader()), (Image) serializer.G(Image.class.getClassLoader()), serializer.m(), (MusicTrack.AssistantData) serializer.G(MusicTrack.AssistantData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PodcastEpisode[i];
        }
    }

    public PodcastEpisode(int i, UserId userId, String str, String str2, int i2, String str3, LinkButton linkButton, Image image, boolean z, MusicTrack.AssistantData assistantData) {
        this.b = i;
        this.c = userId;
        this.d = str;
        this.e = str2;
        this.f = i2;
        this.g = str3;
        this.h = linkButton;
        this.i = image;
        this.j = z;
        this.k = assistantData;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.e0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.S(this.f);
        serializer.j0(this.g);
        serializer.i0(this.h);
        serializer.i0(this.i);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
        serializer.i0(this.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PodcastEpisode)) {
            return false;
        }
        PodcastEpisode podcastEpisode = (PodcastEpisode) obj;
        return this.b == podcastEpisode.b && epx.f(this.c, podcastEpisode.c) && epx.f(this.d, podcastEpisode.d) && epx.f(this.e, podcastEpisode.e) && this.f == podcastEpisode.f && epx.f(this.g, podcastEpisode.g) && epx.f(this.h, podcastEpisode.h) && epx.f(this.i, podcastEpisode.i) && this.j == podcastEpisode.j && epx.f(this.k, podcastEpisode.k);
    }

    public final int hashCode() {
        int a2 = urd0.a(bh10.a(Integer.hashCode(this.b) * 31, 31, this.c.b), 31, this.d);
        String str = this.e;
        int a3 = shy.a(this.f, (a2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.g;
        int hashCode = (a3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LinkButton linkButton = this.h;
        int hashCode2 = (hashCode + (linkButton == null ? 0 : linkButton.hashCode())) * 31;
        Image image = this.i;
        int b = qoy.b((hashCode2 + (image == null ? 0 : image.hashCode())) * 31, 31, this.j);
        MusicTrack.AssistantData assistantData = this.k;
        return b + (assistantData != null ? assistantData.hashCode() : 0);
    }

    public final String toString() {
        return "PodcastEpisode(id=" + this.b + ", ownerId=" + this.c + ", artist=" + this.d + ", title=" + this.e + ", contentRestricted=" + this.f + ", restrictionDescription=" + this.g + ", restrictionButton=" + this.h + ", image=" + this.i + ", isDonut=" + this.j + ", assistantData=" + this.k + ')';
    }
}
