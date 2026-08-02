package com.vk.dto.podcast;

import com.vk.core.serialize.Serializer;
import com.vk.dto.music.LegalNotice;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.dto.newsfeed.Owner;
import java.util.List;
import xsna.epx;
import xsna.qoy;
import xsna.shy;

/* compiled from: PodcastInfo.kt */
/* loaded from: classes18.dex */
public final class PodcastInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<PodcastInfo> CREATOR = new a();
    public final String b;
    public final String c;
    public final MusicTrack d;
    public final List<Owner> e;
    public final String f;
    public final String g;
    public final Thumb h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final int n;
    public final LegalNotice o;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PodcastInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PodcastInfo a(Serializer serializer) {
            return new PodcastInfo(serializer.H(), serializer.H(), (MusicTrack) serializer.G(MusicTrack.class.getClassLoader()), serializer.j(Owner.CREATOR), serializer.H(), serializer.H(), (Thumb) serializer.G(Thumb.class.getClassLoader()), serializer.m(), serializer.m(), serializer.m(), serializer.m(), serializer.m(), serializer.u(), (LegalNotice) serializer.G(LegalNotice.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PodcastInfo[i];
        }
    }

    public PodcastInfo(String str, String str2, MusicTrack musicTrack, List<Owner> list, String str3, String str4, Thumb thumb, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, LegalNotice legalNotice) {
        this.b = str;
        this.c = str2;
        this.d = musicTrack;
        this.e = list;
        this.f = str3;
        this.g = str4;
        this.h = thumb;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = i;
        this.o = legalNotice;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.i0(this.d);
        serializer.o0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.i0(this.h);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
        serializer.L(this.k ? (byte) 1 : (byte) 0);
        serializer.L(this.l ? (byte) 1 : (byte) 0);
        serializer.L(this.m ? (byte) 1 : (byte) 0);
        serializer.S(this.n);
        serializer.i0(this.o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PodcastInfo)) {
            return false;
        }
        PodcastInfo podcastInfo = (PodcastInfo) obj;
        return epx.f(this.b, podcastInfo.b) && epx.f(this.c, podcastInfo.c) && epx.f(this.d, podcastInfo.d) && epx.f(this.e, podcastInfo.e) && epx.f(this.f, podcastInfo.f) && epx.f(this.g, podcastInfo.g) && epx.f(this.h, podcastInfo.h) && this.i == podcastInfo.i && this.j == podcastInfo.j && this.k == podcastInfo.k && this.l == podcastInfo.l && this.m == podcastInfo.m && this.n == podcastInfo.n && epx.f(this.o, podcastInfo.o);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        MusicTrack musicTrack = this.d;
        int hashCode3 = (hashCode2 + (musicTrack == null ? 0 : musicTrack.hashCode())) * 31;
        List<Owner> list = this.e;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Thumb thumb = this.h;
        int a2 = shy.a(this.n, qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((hashCode6 + (thumb == null ? 0 : thumb.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31);
        LegalNotice legalNotice = this.o;
        return a2 + (legalNotice != null ? legalNotice.hashCode() : 0);
    }

    public final String toString() {
        return "PodcastInfo(name=" + this.b + ", category=" + this.c + ", trailer=" + this.d + ", friends=" + this.e + ", friendsText=" + this.f + ", description=" + this.g + ", cover=" + this.h + ", showCatalogHint=" + this.i + ", canSubscribe=" + this.j + ", canSubscribePodcasts=" + this.k + ", isSubscribedPodcasts=" + this.l + ", isPodcastNotificationsEnabled=" + this.m + ", podcastId=" + this.n + ", legalNotice=" + this.o + ')';
    }
}
