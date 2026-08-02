package com.vk.dto.newsfeed.entries;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.VideoFile;
import com.vk.dto.shortvideo.Clips;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.List;
import xsna.epx;
import xsna.iux0;
import xsna.j5g;

/* compiled from: ClipsEntry.kt */
/* loaded from: classes18.dex */
public final class ClipsEntry extends NewsEntry implements iux0 {
    public static final Serializer.c<ClipsEntry> CREATOR = new a();
    public final String i;
    public final Clips j;
    public final LinkButton k;
    public final String l;
    public final String m;
    public VideoAttachment n;
    public final boolean o;
    public final boolean p;
    public final boolean q;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClipsEntry> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClipsEntry a(Serializer serializer) {
            return new ClipsEntry(serializer.H(), (Clips) serializer.G(Clips.class.getClassLoader()), (LinkButton) serializer.G(LinkButton.class.getClassLoader()), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClipsEntry[i];
        }
    }

    public ClipsEntry(String str, Clips clips, LinkButton linkButton, String str2, String str3) {
        super(new NewsEntry.TrackData(str2, 0, 0L, false, false, null, null, 0, 254, null));
        this.i = str;
        this.j = clips;
        this.k = linkButton;
        this.l = str2;
        this.m = str3;
        this.o = epx.f(str3, "clips_retention");
        this.p = epx.f(str3, "clips_ozon");
        this.q = epx.f(str3, "clips_shops");
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Ab() {
        return "clips";
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Bb() {
        return "clips";
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Db() {
        return this.m;
    }

    public final VideoAttachment Eb() {
        VideoFile videoFile;
        List<ClipVideoFile> list;
        Clips clips = this.j;
        ClipVideoFile clipVideoFile = (clips == null || (list = clips.b) == null) ? null : (ClipVideoFile) j5g.a0(list);
        String r1 = clipVideoFile != null ? clipVideoFile.r1() : null;
        VideoAttachment videoAttachment = this.n;
        if (!epx.f(r1, (videoAttachment == null || (videoFile = videoAttachment.k) == null) ? null : videoFile.r1())) {
            this.n = clipVideoFile != null ? new VideoAttachment(clipVideoFile) : null;
        }
        return this.n;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.i);
        serializer.i0(this.j);
        serializer.i0(this.k);
        serializer.j0(this.l);
        serializer.j0(this.m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ClipsEntry.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ClipsEntry clipsEntry = (ClipsEntry) obj;
        clipsEntry.getClass();
        return epx.f(this.m, clipsEntry.m);
    }

    @Override // xsna.iux0, xsna.kru
    public final String getTitle() {
        return this.i;
    }

    public final int hashCode() {
        return Integer.hashCode(33) + (this.m.hashCode() * 31);
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return 33;
    }
}
