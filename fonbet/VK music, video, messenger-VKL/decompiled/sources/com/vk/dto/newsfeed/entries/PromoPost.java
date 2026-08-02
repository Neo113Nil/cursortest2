package com.vk.dto.newsfeed.entries;

import com.vk.api.generated.ads.dto.AdsItemBlockAdStatPixelDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.ads.PixelStats;
import com.vk.dto.badges.Badgeable;
import com.vk.dto.badges.BadgesSet;
import com.vk.dto.common.AdsChoices;
import com.vk.dto.common.Attachment;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.profile.CatchUpBanner;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.reactions.ReactionSet;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.music.stats.AdsPixel;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vk.statistic.DeprecatedStatisticPlayheadReachedUrl;
import com.vk.statistic.DeprecatedStatisticUrl;
import com.vkontakte.android.attachments.AdHideReason;
import com.vkontakte.android.attachments.AdSource;
import com.vkontakte.android.attachments.DisclaimerData;
import com.vkontakte.android.attachments.PrettyCardAttachment;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.bqt;
import xsna.c6z;
import xsna.dqa0;
import xsna.e0c0;
import xsna.epx;
import xsna.fsx0;
import xsna.l490;
import xsna.o2f0;
import xsna.tsx0;
import xsna.wee0;
import xsna.wsx0;
import xsna.zcl;

/* compiled from: PromoPost.kt */
/* loaded from: classes18.dex */
public final class PromoPost extends NewsEntry implements DeprecatedStatisticInterface, c6z, o2f0, l490, fsx0, b.h, dqa0, Badgeable, wsx0, wee0, tsx0 {
    public static final Serializer.c<PromoPost> CREATOR = new a();
    public final DisclaimerData A;
    public final PixelStatsDelegate B;
    public final String C;
    public final String D;
    public final AdsChoices E;
    public final DisclaimerContent F;
    public final String G;
    public final e0c0 H;
    public final AdsAudioPixelsContainer I;
    public final int i;
    public final int j;
    public final String k;
    public final String l;
    public final int m;
    public final Post n;
    public final EntryHeader o;
    public final String p;
    public final String q;
    public final String r;
    public final CatchUpBanner s;
    public DeprecatedStatisticUrl t;
    public final NewsEntry.TrackData u;
    public final DeprecatedStatisticInterface.a v;
    public final String w;
    public final String x;
    public final ArrayList<AdHideReason> y;
    public final AdSource z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PromoPost> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PromoPost a(Serializer serializer) {
            int u = serializer.u();
            int u2 = serializer.u();
            String H = serializer.H();
            String H2 = serializer.H();
            int u3 = serializer.u();
            Post post = (Post) serializer.G(Post.class.getClassLoader());
            EntryHeader entryHeader = (EntryHeader) serializer.G(EntryHeader.class.getClassLoader());
            String H3 = serializer.H();
            String H4 = serializer.H();
            String H5 = serializer.H();
            CatchUpBanner catchUpBanner = (CatchUpBanner) serializer.G(CatchUpBanner.class.getClassLoader());
            DeprecatedStatisticUrl deprecatedStatisticUrl = (DeprecatedStatisticUrl) serializer.G(DeprecatedStatisticUrl.class.getClassLoader());
            NewsEntry.TrackData trackData = (NewsEntry.TrackData) serializer.G(NewsEntry.TrackData.class.getClassLoader());
            DeprecatedStatisticInterface.a aVar = new DeprecatedStatisticInterface.a();
            aVar.d(serializer);
            String H6 = serializer.H();
            String H7 = serializer.H();
            ArrayList j = serializer.j(AdHideReason.CREATOR);
            AdSource.a aVar2 = AdSource.Companion;
            String H8 = serializer.H();
            aVar2.getClass();
            AdSource a = AdSource.a.a(H8);
            DisclaimerData disclaimerData = (DisclaimerData) serializer.G(DisclaimerData.class.getClassLoader());
            Serializer.StreamParcelable G = serializer.G(PixelStatsDelegate.class.getClassLoader());
            if (G == null) {
                throw new IllegalArgumentException("Can't get value!");
            }
            PixelStatsDelegate pixelStatsDelegate = (PixelStatsDelegate) G;
            String H9 = serializer.H();
            String H10 = serializer.H();
            DisclaimerContent disclaimerContent = (DisclaimerContent) serializer.C();
            if (disclaimerContent == null) {
                disclaimerContent = DisclaimerContent.UNSUPPORTED;
            }
            return new PromoPost(u, u2, H, H2, u3, post, entryHeader, H3, H4, H5, catchUpBanner, deprecatedStatisticUrl, trackData, aVar, H6, H7, j, a, disclaimerData, pixelStatsDelegate, H9, H10, (AdsChoices) serializer.G(AdsChoices.class.getClassLoader()), disclaimerContent, serializer.H(), null, 33554432, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PromoPost[i];
        }
    }

    public /* synthetic */ PromoPost(int i, int i2, String str, String str2, int i3, Post post, EntryHeader entryHeader, String str3, String str4, String str5, CatchUpBanner catchUpBanner, DeprecatedStatisticUrl deprecatedStatisticUrl, NewsEntry.TrackData trackData, DeprecatedStatisticInterface.a aVar, String str6, String str7, ArrayList arrayList, AdSource adSource, DisclaimerData disclaimerData, PixelStatsDelegate pixelStatsDelegate, String str8, String str9, AdsChoices adsChoices, DisclaimerContent disclaimerContent, String str10, e0c0 e0c0Var, int i4, zcl zclVar) {
        this(i, i2, str, str2, i3, post, entryHeader, str3, str4, str5, catchUpBanner, (i4 & 2048) != 0 ? null : deprecatedStatisticUrl, trackData, (i4 & 8192) != 0 ? new DeprecatedStatisticInterface.a() : aVar, str6, str7, arrayList, adSource, (262144 & i4) != 0 ? null : disclaimerData, (524288 & i4) != 0 ? new PixelStatsDelegate() : pixelStatsDelegate, (1048576 & i4) != 0 ? null : str8, (2097152 & i4) != 0 ? null : str9, adsChoices, (8388608 & i4) != 0 ? DisclaimerContent.UNSUPPORTED : disclaimerContent, (16777216 & i4) != 0 ? null : str10, (i4 & 33554432) != 0 ? null : e0c0Var);
    }

    public static PromoPost Eb(PromoPost promoPost, Post post) {
        int i = promoPost.i;
        int i2 = promoPost.j;
        String str = promoPost.k;
        String str2 = promoPost.l;
        int i3 = promoPost.m;
        EntryHeader entryHeader = promoPost.o;
        String str3 = promoPost.p;
        String str4 = promoPost.q;
        String str5 = promoPost.r;
        CatchUpBanner catchUpBanner = promoPost.s;
        DeprecatedStatisticUrl deprecatedStatisticUrl = promoPost.t;
        NewsEntry.TrackData trackData = promoPost.u;
        DeprecatedStatisticInterface.a aVar = promoPost.v;
        String str6 = promoPost.w;
        String str7 = promoPost.x;
        ArrayList<AdHideReason> arrayList = promoPost.y;
        AdSource adSource = promoPost.z;
        DisclaimerData disclaimerData = promoPost.A;
        PixelStatsDelegate pixelStatsDelegate = promoPost.B;
        String str8 = promoPost.C;
        String str9 = promoPost.D;
        AdsChoices adsChoices = promoPost.E;
        DisclaimerContent disclaimerContent = promoPost.F;
        String str10 = promoPost.G;
        e0c0 e0c0Var = promoPost.H;
        promoPost.getClass();
        return new PromoPost(i, i2, str, str2, i3, post, entryHeader, str3, str4, str5, catchUpBanner, deprecatedStatisticUrl, trackData, aVar, str6, str7, arrayList, adSource, disclaimerData, pixelStatsDelegate, str8, str9, adsChoices, disclaimerContent, str10, e0c0Var);
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Ab() {
        return this.n.Ab();
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Bb() {
        return this.n.Bb();
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final NewsEntry.TrackData Cb() {
        return this.u;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Db() {
        return com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS;
    }

    @Override // xsna.c6z
    public final int E1() {
        return this.n.E.e;
    }

    @Override // xsna.dqa0
    public final void F7(PixelStats pixelStats) {
        this.B.F7(pixelStats);
    }

    public final Attachment Fb(bqt bqtVar) {
        Object obj;
        ArrayList<EntryAttachment> arrayList = this.n.z;
        if (arrayList != null) {
            Iterator<T> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Boolean.valueOf(((EntryAttachment) obj).b instanceof PrettyCardAttachment).booleanValue()) {
                    break;
                }
            }
            EntryAttachment entryAttachment = (EntryAttachment) obj;
            if (entryAttachment != null) {
                return entryAttachment.b;
            }
        }
        return null;
    }

    @Override // xsna.wee0
    public final Owner G() {
        return this.n.o;
    }

    public final String Gb() {
        StringBuilder sb = new StringBuilder();
        Post post = this.n;
        sb.append(post.m);
        sb.append('_');
        sb.append(post.n);
        return sb.toString();
    }

    public final CatchUpBanner Hb() {
        return this.s;
    }

    public final String Ib() {
        return this.l;
    }

    @Override // xsna.grj0
    public final boolean J() {
        return this.n.J();
    }

    public final Post Jb() {
        return this.n;
    }

    @Override // xsna.o2f0
    public final ItemReactions K() {
        return this.n.W;
    }

    @Override // xsna.tsx0
    public final DisclaimerData N3() {
        return this.A;
    }

    @Override // xsna.fsx0
    public final List<EntryAttachment> N7() {
        return this.n.z;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.i);
        serializer.S(this.j);
        serializer.j0(this.k);
        serializer.j0(this.l);
        serializer.S(this.m);
        serializer.i0(this.n);
        serializer.i0(this.o);
        serializer.j0(this.p);
        serializer.j0(this.q);
        serializer.j0(this.r);
        serializer.i0(this.s);
        serializer.i0(this.t);
        serializer.i0(this.u);
        this.v.e(serializer);
        serializer.j0(this.w);
        serializer.j0(this.x);
        serializer.o0(this.y);
        AdSource adSource = this.z;
        serializer.j0(adSource != null ? adSource.h() : null);
        serializer.i0(this.A);
        serializer.i0(this.B);
        serializer.j0(this.C);
        serializer.j0(this.D);
        serializer.g0(this.F);
        serializer.i0(this.E);
        serializer.j0(this.G);
    }

    @Override // com.vk.statistic.DeprecatedStatisticInterface
    public final List<DeprecatedStatisticUrl> R6(String str) {
        return this.v.b(str);
    }

    @Override // com.vkontakte.android.data.b.h
    public final DeprecatedStatisticUrl T6() {
        return this.t;
    }

    @Override // xsna.grj0
    public final int T9() {
        return this.n.E.b;
    }

    @Override // xsna.c6z
    public final void U8(int i) {
        this.n.E.c = i;
    }

    @Override // xsna.c6z
    public final void W2() {
        this.n.W2();
    }

    @Override // com.vk.statistic.DeprecatedStatisticInterface
    public final int Wa() {
        return this.v.hashCode();
    }

    @Override // com.vk.statistic.DeprecatedStatisticInterface
    public final int Y7(String str) {
        return this.v.c(str);
    }

    @Override // xsna.o2f0
    public final void b4(ItemReactions itemReactions) {
        this.n.W = itemReactions;
    }

    @Override // xsna.dqa0
    public final int b6(AdsItemBlockAdStatPixelDto.TypeDto typeDto) {
        return this.B.b6(typeDto);
    }

    @Override // xsna.c6z
    public final boolean b9() {
        return this.n.b9();
    }

    @Override // com.vk.dto.badges.Badgeable
    public final String ca() {
        return this.n.e0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoPost)) {
            return false;
        }
        return epx.f(this.n, ((PromoPost) obj).n);
    }

    @Override // xsna.grj0
    public final void f(int i) {
        this.n.E.b = i;
    }

    @Override // xsna.grj0
    public final void f0(boolean z) {
        this.n.f0(z);
    }

    @Override // xsna.c6z
    public final int fa() {
        return this.n.E.d;
    }

    @Override // xsna.tsx0
    public final DisclaimerContent getContentType() {
        return this.F;
    }

    @Override // xsna.wsx0
    public final EntryHeader getHeader() {
        EntryHeader entryHeader = this.o;
        return entryHeader == null ? this.n.y : entryHeader;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.statistic.DeprecatedStatisticInterface
    public final void h(DeprecatedStatisticUrl deprecatedStatisticUrl) {
        Serializer.StreamParcelableAdapter streamParcelableAdapter;
        Serializer.StreamParcelableAdapter reached;
        this.v.a(deprecatedStatisticUrl);
        String str = deprecatedStatisticUrl.f;
        String str2 = deprecatedStatisticUrl.c;
        String str3 = deprecatedStatisticUrl.b;
        if (epx.f(str3, "playback_started")) {
            streamParcelableAdapter = new AdsPixel.Started(str, str3, str2);
        } else if (epx.f(str3, "playback_completed")) {
            streamParcelableAdapter = new AdsPixel.Completed(str, str3, str2);
        } else if (epx.f(str3, "playback_paused")) {
            streamParcelableAdapter = new AdsPixel.Secondary.Paused(str, str3, str2);
        } else if (epx.f(str3, "playback_resumed")) {
            streamParcelableAdapter = new AdsPixel.Secondary.Resumed(str, str3, str2);
        } else if (epx.f(str3, "error")) {
            streamParcelableAdapter = new AdsPixel.Secondary.Error(str, str3, str2);
        } else {
            boolean z = deprecatedStatisticUrl instanceof DeprecatedStatisticPlayheadReachedUrl;
            if (z) {
                DeprecatedStatisticPlayheadReachedUrl deprecatedStatisticPlayheadReachedUrl = (DeprecatedStatisticPlayheadReachedUrl) deprecatedStatisticUrl;
                if (deprecatedStatisticPlayheadReachedUrl.m) {
                    reached = new AdsPixel.Reached(str, str3, deprecatedStatisticPlayheadReachedUrl.c, deprecatedStatisticPlayheadReachedUrl.l, deprecatedStatisticPlayheadReachedUrl.m);
                    streamParcelableAdapter = reached;
                }
            }
            if (z) {
                DeprecatedStatisticPlayheadReachedUrl deprecatedStatisticPlayheadReachedUrl2 = (DeprecatedStatisticPlayheadReachedUrl) deprecatedStatisticUrl;
                reached = new AdsPixel.Reached(str, str3, deprecatedStatisticPlayheadReachedUrl2.c, TimeUnit.SECONDS.toMillis(deprecatedStatisticPlayheadReachedUrl2.l), deprecatedStatisticPlayheadReachedUrl2.m);
                streamParcelableAdapter = reached;
            } else {
                streamParcelableAdapter = null;
            }
        }
        if (streamParcelableAdapter != null) {
            AdsAudioPixelsContainer adsAudioPixelsContainer = this.I;
            adsAudioPixelsContainer.getClass();
            if (streamParcelableAdapter instanceof AdsPixel.Completed) {
                adsAudioPixelsContainer.d.add(streamParcelableAdapter);
                return;
            }
            if (streamParcelableAdapter instanceof AdsPixel.Started) {
                adsAudioPixelsContainer.c.add(streamParcelableAdapter);
                return;
            }
            if (!(streamParcelableAdapter instanceof AdsPixel.Reached)) {
                if (!(streamParcelableAdapter instanceof AdsPixel.Secondary)) {
                    throw new NoWhenBranchMatchedException();
                }
                adsAudioPixelsContainer.g.add(streamParcelableAdapter);
            } else if (((AdsPixel.Reached) streamParcelableAdapter).g) {
                adsAudioPixelsContainer.f.add(streamParcelableAdapter);
            } else {
                adsAudioPixelsContainer.e.add(streamParcelableAdapter);
            }
        }
    }

    public final int hashCode() {
        return this.n.hashCode();
    }

    @Override // xsna.o2f0
    public final void hb(ReactionSet reactionSet) {
        this.n.V = reactionSet;
    }

    @Override // xsna.c6z
    public final int i7() {
        return this.n.E.c;
    }

    @Override // xsna.c6z
    public final boolean l0() {
        return this.n.l0();
    }

    @Override // xsna.c6z
    public final boolean qa() {
        return this.n.qa();
    }

    @Override // xsna.c6z
    public final String r() {
        return this.n.L.b;
    }

    @Override // xsna.c6z
    public final void r0(boolean z) {
        this.n.r0(z);
    }

    @Override // xsna.l490
    public final Owner s() {
        return this.n.o;
    }

    @Override // xsna.o2f0
    public final ReactionSet s4() {
        return this.n.V;
    }

    @Override // xsna.c6z
    public final void sb(int i) {
        this.n.E.d = i;
    }

    public final String toString() {
        return "PromoPost(adsId1=" + this.i + ", adsId2=" + this.j + ", title=" + this.k + ", data=" + this.l + ", timeToLive=" + this.m + ", post=" + this.n + ", adsHeader=" + this.o + ", ageRestriction=" + this.p + ", disclaimer=" + this.q + ", debug=" + this.r + ", catchUpBanner=" + this.s + ", dataImpression=" + this.t + ", trackData=" + this.u + ", statistics=" + this.v + ", advertiserInfoUrl=" + this.w + ", adMarker=" + this.x + ", hideReasons=" + this.y + ", adSource=" + this.z + ", disclaimerData=" + this.A + ", pixelStatsDelegate=" + this.B + ", recommendationInfoUrl=" + this.C + ", adsUrl=" + this.D + ", adsChoices=" + this.E + ", contentType=" + this.F + ", adsTrackCode=" + this.G + ", postAdsInfo=" + this.H + ')';
    }

    @Override // com.vk.dto.badges.Badgeable
    public final BadgesSet u0() {
        return this.n.X;
    }

    @Override // xsna.dqa0
    public final List<PixelStats> u6(AdsItemBlockAdStatPixelDto.TypeDto typeDto) {
        return this.B.u6(typeDto);
    }

    @Override // xsna.c6z
    public final void v6(int i) {
        this.n.E.e = i;
    }

    @Override // xsna.c6z
    public final int w0() {
        return this.n.E.d;
    }

    @Override // xsna.c6z
    public final boolean x1() {
        return this.n.x1();
    }

    @Override // com.vk.statistic.DeprecatedStatisticInterface
    public final void x4(String str) {
        this.v.a.remove(str);
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return 12;
    }

    public PromoPost(int i, int i2, String str, String str2, int i3, Post post, EntryHeader entryHeader, String str3, String str4, String str5, CatchUpBanner catchUpBanner, DeprecatedStatisticUrl deprecatedStatisticUrl, NewsEntry.TrackData trackData, DeprecatedStatisticInterface.a aVar, String str6, String str7, ArrayList<AdHideReason> arrayList, AdSource adSource, DisclaimerData disclaimerData, PixelStatsDelegate pixelStatsDelegate, String str8, String str9, AdsChoices adsChoices, DisclaimerContent disclaimerContent, String str10, e0c0 e0c0Var) {
        super(trackData);
        this.i = i;
        this.j = i2;
        this.k = str;
        this.l = str2;
        this.m = i3;
        this.n = post;
        this.o = entryHeader;
        this.p = str3;
        this.q = str4;
        this.r = str5;
        this.s = catchUpBanner;
        this.t = deprecatedStatisticUrl;
        this.u = trackData;
        this.v = aVar;
        this.w = str6;
        this.x = str7;
        this.y = arrayList;
        this.z = adSource;
        this.A = disclaimerData;
        this.B = pixelStatsDelegate;
        this.C = str8;
        this.D = str9;
        this.E = adsChoices;
        this.F = disclaimerContent;
        this.G = str10;
        this.H = e0c0Var;
        this.I = new AdsAudioPixelsContainer(null, 1, null);
    }
}
