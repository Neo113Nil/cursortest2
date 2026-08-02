package com.vk.libvideo.bottomsheet.about.delegate;

import android.net.Uri;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.Good;
import com.vk.dto.common.OrdAdInfo;
import com.vk.dto.common.TitleAction;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.hints.Hint;
import com.vk.dto.music.Thumb;
import com.vk.dto.video.Doc2DocItem;
import com.vk.video.polls.entrypoint.model.UxPollEntryPoint;
import com.vkontakte.android.R;
import defpackage.q0;
import java.util.List;
import xsna.asp;
import xsna.atp;
import xsna.bh10;
import xsna.cw50;
import xsna.dq;
import xsna.eao;
import xsna.epx;
import xsna.fw3;
import xsna.fxc0;
import xsna.gzs;
import xsna.hfz;
import xsna.ho8;
import xsna.izs;
import xsna.l31;
import xsna.lq;
import xsna.ms9;
import xsna.noj0;
import xsna.pyn;
import xsna.qoy;
import xsna.s3q0;
import xsna.sf3;
import xsna.shy;
import xsna.tn;
import xsna.u11;
import xsna.urd0;
import xsna.vu5;
import xsna.zrp;
import xsna.zu50;

/* compiled from: AboutVideoItem.kt */
/* loaded from: classes2.dex */
public abstract class AboutVideoItem implements hfz {

    /* compiled from: AboutVideoItem.kt */
    public static final class SimilarVideoRedesign extends AboutVideoItem {
        public final noj0 b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final Source f;
        public final boolean g;
        public final Style h;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AboutVideoItem.kt */
        public static final class Source {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Source[] $VALUES;
            public static final Source GROUP_PLAYLIST;
            public static final Source MUSIC_MIX_VIDEOS;
            public static final Source OFFLINE_VIDEOS;
            public static final Source SIMILAR_MUSIC;
            public static final Source SIMILAR_VIDEOS;
            public static final Source USER_PLAYLIST;

            static {
                Source source = new Source("SIMILAR_VIDEOS", 0);
                SIMILAR_VIDEOS = source;
                Source source2 = new Source("SIMILAR_MUSIC", 1);
                SIMILAR_MUSIC = source2;
                Source source3 = new Source("USER_PLAYLIST", 2);
                USER_PLAYLIST = source3;
                Source source4 = new Source("GROUP_PLAYLIST", 3);
                GROUP_PLAYLIST = source4;
                Source source5 = new Source("OFFLINE_VIDEOS", 4);
                OFFLINE_VIDEOS = source5;
                Source source6 = new Source("MUSIC_MIX_VIDEOS", 5);
                MUSIC_MIX_VIDEOS = source6;
                Source[] sourceArr = {source, source2, source3, source4, source5, source6};
                $VALUES = sourceArr;
                $ENTRIES = new asp(sourceArr);
            }

            public Source() {
                throw null;
            }

            public static Source valueOf(String str) {
                return (Source) Enum.valueOf(Source.class, str);
            }

            public static Source[] values() {
                return (Source[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AboutVideoItem.kt */
        public static final class Style {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Style[] $VALUES;
            public static final Style COMPACT;
            public static final Style COMPACT_NO_OWNER;
            public static final Style NORMAL;

            static {
                Style style = new Style("NORMAL", 0);
                NORMAL = style;
                Style style2 = new Style("COMPACT_NO_OWNER", 1);
                COMPACT_NO_OWNER = style2;
                Style style3 = new Style("COMPACT", 2);
                COMPACT = style3;
                Style[] styleArr = {style, style2, style3};
                $VALUES = styleArr;
                $ENTRIES = new asp(styleArr);
            }

            public Style() {
                throw null;
            }

            public static Style valueOf(String str) {
                return (Style) Enum.valueOf(Style.class, str);
            }

            public static Style[] values() {
                return (Style[]) $VALUES.clone();
            }
        }

        public SimilarVideoRedesign(noj0 noj0Var, boolean z, boolean z2, boolean z3, Source source, boolean z4, Style style) {
            this.b = noj0Var;
            this.c = z;
            this.d = z2;
            this.e = z3;
            this.f = source;
            this.g = z4;
            this.h = style;
            AboutVideoViewType.SimilarVideoRedesign.ordinal();
        }

        public static SimilarVideoRedesign a(SimilarVideoRedesign similarVideoRedesign, noj0 noj0Var, boolean z, boolean z2, int i) {
            if ((i & 1) != 0) {
                noj0Var = similarVideoRedesign.b;
            }
            noj0 noj0Var2 = noj0Var;
            if ((i & 2) != 0) {
                z = similarVideoRedesign.c;
            }
            boolean z3 = z;
            boolean z4 = (i & 4) != 0 ? similarVideoRedesign.d : false;
            if ((i & 8) != 0) {
                z2 = similarVideoRedesign.e;
            }
            return new SimilarVideoRedesign(noj0Var2, z3, z4, z2, similarVideoRedesign.f, similarVideoRedesign.g, similarVideoRedesign.h);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SimilarVideoRedesign)) {
                return false;
            }
            SimilarVideoRedesign similarVideoRedesign = (SimilarVideoRedesign) obj;
            return epx.f(this.b, similarVideoRedesign.b) && this.c == similarVideoRedesign.c && this.d == similarVideoRedesign.d && this.e == similarVideoRedesign.e && this.f == similarVideoRedesign.f && this.g == similarVideoRedesign.g && this.h == similarVideoRedesign.h;
        }

        @Override // com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem, xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(this.b.a.o0());
        }

        public final int hashCode() {
            return this.h.hashCode() + qoy.b((this.f.hashCode() + qoy.b(qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g);
        }

        public final String toString() {
            return "SimilarVideoRedesign(value=" + this.b + ", isNotInterested=" + this.c + ", isNotRecommendOwner=" + this.d + ", isRestricted=" + this.e + ", source=" + this.f + ", supportRemoveFromHistory=" + this.g + ", style=" + this.h + ')';
        }
    }

    /* compiled from: AboutVideoItem.kt */
    public static final class a extends AboutVideoItem {
        public final cw50 b;
        public final zu50 c;
        public final Long d;
        public final Integer e;
        public final String f;

        public a(cw50 cw50Var, zu50 zu50Var, Long l, Integer num, String str) {
            this.b = cw50Var;
            this.c = zu50Var;
            this.d = l;
            this.e = num;
            this.f = str;
            AboutVideoViewType.AdBlock.ordinal();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f);
        }

        public final int hashCode() {
            int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
            Long l = this.d;
            int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
            Integer num = this.e;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f;
            return hashCode3 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AdBlock(banner=");
            sb.append(this.b);
            sb.append(", nativeAd=");
            sb.append(this.c);
            sb.append(", videoOwnerId=");
            sb.append(this.d);
            sb.append(", videoId=");
            sb.append(this.e);
            sb.append(", vsid=");
            return ho8.a(sb, this.f, ')');
        }
    }

    /* compiled from: AboutVideoItem.kt */
    public static final class a0 extends AboutVideoItem {
        public final String b;
        public final String c;

        public a0(String str, String str2) {
            this.b = str;
            this.c = str2;
            AboutVideoViewType.AdTrapBlock.ordinal();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a0)) {
                return false;
            }
            a0 a0Var = (a0) obj;
            return epx.f(this.b, a0Var.b) && epx.f(this.c, a0Var.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TrapBanner(bannerText=");
            sb.append(this.b);
            sb.append(", activationUrl=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: AboutVideoItem.kt */
    public static final class b extends AboutVideoItem {
        public final VideoFile b;

        public b(VideoFile videoFile) {
            this.b = videoFile;
            AboutVideoViewType.AdRedirectButton.ordinal();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return lq.a(new StringBuilder("AdRedirectButton(videoFile="), this.b, ')');
        }
    }

    /* compiled from: AboutVideoItem.kt */
    public static final class b0 extends AboutVideoItem {
        public final UxPollEntryPoint b;

        public b0(UxPollEntryPoint uxPollEntryPoint) {
            this.b = uxPollEntryPoint;
            AboutVideoViewType.UxPollEntryPoint.ordinal();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b0) && epx.f(this.b, ((b0) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UxPoll(entryPoint=" + this.b + ')';
        }
    }

    /* compiled from: AboutVideoItem.kt */
    public static abstract class c extends AboutVideoItem {

        /* compiled from: AboutVideoItem.kt */
        public static final class a extends c {
            public final l31 b;

            public a(l31 l31Var) {
                this.b = l31Var;
            }

            public final l31 a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "AdBanner(state=" + this.b + ')';
            }
        }

        /* compiled from: AboutVideoItem.kt */
        public static final class b extends c {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 318445101;
            }

            public final String toString() {
                return "Empty";
            }
        }

        public c() {
            AboutVideoViewType.AdWebBlock.ordinal();
        }
    }

    /* compiled from: AboutVideoItem.kt */
    public static final class c0 extends AboutVideoItem {
        public final a b;
        public final b c;
        public final b d;

        /* compiled from: AboutVideoItem.kt */
        public static final class a {
            public final b a;
            public final boolean b;

            public a(b bVar, boolean z) {
                this.a = bVar;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && this.b == aVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Likes(statistic=");
                sb.append(this.a);
                sb.append(", isLiked=");
                return q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: AboutVideoItem.kt */
        public static abstract class b {

            /* compiled from: AboutVideoItem.kt */
            public static final class a extends b {
                public static final a a = new a();
            }

            /* compiled from: AboutVideoItem.kt */
            /* renamed from: com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem$c0$b$b, reason: collision with other inner class name */
            public static final class C1213b extends b {
                public final int a;

                public C1213b(int i) {
                    this.a = i;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1213b) && this.a == ((C1213b) obj).a;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.a);
                }

                public final String toString() {
                    return vu5.b(new StringBuilder("Enabled(count="), this.a, ')');
                }
            }
        }

        public c0(a aVar, b bVar, b bVar2) {
            this.b = aVar;
            this.c = bVar;
            this.d = bVar2;
            AboutVideoViewType.Controls.ordinal();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c0)) {
                return false;
            }
            c0 c0Var = (c0) obj;
            return epx.f(this.b, c0Var.b) && epx.f(this.c, c0Var.c) && epx.f(this.d, c0Var.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "VideoControls(likes=" + this.b + ", comments=" + this.c + ", reposts=" + this.d + ')';
        }
    }

    /* compiled from: AboutVideoItem.kt */
    public static final class d extends AboutVideoItem {
        public final CharSequence b;
        public final int c;
        public final b d;
        public final a e;
        public final boolean f;
        public final Uri g;
        public final boolean h;
        public final boolean i;
        public final boolean j;
        public final boolean k;
        public final c l;
        public final InterfaceC1215d m;
        public final boolean n;
        public final boolean o;

        /* compiled from: AboutVideoItem.kt */
        public static final class a {
            public final pyn a;

            public a(pyn pynVar) {
                this.a = pynVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Donut(state=" + this.a + ')';
            }
        }

        /* compiled from: AboutVideoItem.kt */
        public interface b {

            /* compiled from: AboutVideoItem.kt */
            public static final class a implements b {
                public static final a a = new a();
            }

            /* compiled from: AboutVideoItem.kt */
            /* renamed from: com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem$d$b$b, reason: collision with other inner class name */
            public static final class C1214b implements b {
                public static final C1214b a = new C1214b();
            }
        }

        /* compiled from: AboutVideoItem.kt */
        public static final class c {
            public final Boolean a;
            public final Boolean b;

            public c(Boolean bool, Boolean bool2) {
                this.a = bool;
                this.b = bool2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
            }

            public final int hashCode() {
                Boolean bool = this.a;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                Boolean bool2 = this.b;
                return hashCode + (bool2 != null ? bool2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("SubscriptionPromo(enabledAfterPlaying=");
                sb.append(this.a);
                sb.append(", enableAfterLike=");
                return tn.a(sb, this.b, ')');
            }
        }

        /* compiled from: AboutVideoItem.kt */
        /* renamed from: com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem$d$d, reason: collision with other inner class name */
        public interface InterfaceC1215d {

            /* compiled from: AboutVideoItem.kt */
            /* renamed from: com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem$d$d$a */
            public static final class a implements InterfaceC1215d {
                public static final a a = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return -559975538;
                }

                public final String toString() {
                    return "Disabled";
                }
            }

            /* compiled from: AboutVideoItem.kt */
            /* renamed from: com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem$d$d$b */
            public static final class b implements InterfaceC1215d {
                public final String a;
                public final Hint b;

                public b(String str, Hint hint) {
                    this.a = str;
                    this.b = hint;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
                }

                public final int hashCode() {
                    int hashCode = this.a.hashCode() * 31;
                    Hint hint = this.b;
                    return hashCode + (hint == null ? 0 : hint.b.hashCode());
                }

                public final String toString() {
                    return "Enabled(url=" + this.a + ", hint=" + this.b + ')';
                }
            }
        }

        public d(CharSequence charSequence, int i, b bVar, a aVar, boolean z, Uri uri, boolean z2, boolean z3, boolean z4, boolean z5, c cVar, InterfaceC1215d interfaceC1215d, boolean z6, boolean z7) {
            this.b = charSequence;
            this.c = i;
            this.d = bVar;
            this.e = aVar;
            this.f = z;
            this.g = uri;
            this.h = z2;
            this.i = z3;
            this.j = z4;
            this.k = z5;
            this.l = cVar;
            this.m = interfaceC1215d;
            this.n = z6;
            this.o = z7;
            AboutVideoViewType.Author.ordinal();
        }

        public static d a(d dVar, c cVar) {
            return new d(dVar.b, dVar.c, dVar.d, dVar.e, dVar.f, dVar.g, dVar.h, dVar.i, dVar.j, dVar.k, cVar, dVar.m, dVar.n, dVar.o);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && this.c == dVar.c && epx.f(this.d, dVar.d) && epx.f(this.e, dVar.e) && this.f == dVar.f && epx.f(this.g, dVar.g) && this.h == dVar.h && this.i == dVar.i && this.j == dVar.j && this.k == dVar.k && epx.f(this.l, dVar.l) && epx.f(this.m, dVar.m) && this.n == dVar.n && this.o == dVar.o;
        }

        public final int hashCode() {
            CharSequence charSequence = this.b;
            int b2 = qoy.b((this.e.a.hashCode() + ((this.d.hashCode() + shy.a(this.c, (charSequence == null ? 0 : charSequence.hashCode()) * 31, 31)) * 31)) * 31, 31, this.f);
            Uri uri = this.g;
            int b3 = qoy.b(qoy.b(qoy.b(qoy.b((b2 + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k);
            c cVar = this.l;
            return Boolean.hashCode(this.o) + qoy.b((this.m.hashCode() + ((b3 + (cVar != null ? cVar.hashCode() : 0)) * 31)) * 31, 31, this.n);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Author(title=");
            sb.append((Object) this.b);
            sb.append(", subscribersAmount=");
            sb.append(this.c);
            sb.append(", subscription=");
            sb.append(this.d);
            sb.append(", donut=");
            sb.append(this.e);
            sb.append(", isVerified=");
            sb.append(this.f);
            sb.append(", avatarUri=");
            sb.append(this.g);
            sb.append(", isNft=");
            sb.append(this.h);
            sb.append(", isArtist=");
            sb.append(this.i);
            sb.append(", isAuthorHidden=");
            sb.append(this.j);
            sb.append(", hasVideoOwnerId=");
            sb.append(this.k);
            sb.append(", isSubscriptionPromoEnabled=");
            sb.append(this.l);
            sb.append(", videoAnalyticsButtonState=");
            sb.append(this.m);
            sb.append(", isPersonalAccount=");
            sb.append(this.n);
            sb.append(", isLiveNow=");
            return q0.a(sb, this.o, ')');
        }
    }

    /* compiled from: AboutVideoItem.kt */
    public static final class d0 extends AboutVideoItem {
        public final int b;
        public final a c;

        /* compiled from: AboutVideoItem.kt */
        public static final class a {
            public final b a;
            public final boolean b;

            public a(b bVar, boolean z) {
                this.a = bVar;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && this.b == aVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Likes(statistic=");
                sb.append(this.a);
                sb.append(", isLiked=");
                return q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: AboutVideoItem.kt */
        public static abstract class b {

            /* compiled from: AboutVideoItem.kt */
            public static final class a extends b {
                public static final a a = new a();
            }

            /* compiled from: AboutVideoItem.kt */
            /* renamed from: com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem$d0$b$b, reason: collision with other inner class name */
            public static final class C1216b extends b {
                public final int a;

                public C1216b(int i) {
                    this.a = i;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1216b) && this.a == ((C1216b) obj).a;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.a);
                }

                public final String toString() {
                    return vu5.b(new StringBuilder("Enabled(count="), this.a, ')');
                }
            }
        }

        public d0(int i, a aVar) {
            this.b = i;
            this.c = aVar;
            AboutVideoViewType.ViewsLikes.ordinal();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d0)) {
                return false;
            }
            d0 d0Var = (d0) obj;
            return this.b == d0Var.b && epx.f(this.c, d0Var.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            return "ViewsLikes(viewsCount=" + this.b + ", likes=" + this.c + ')';
        }
    }

    /* compiled from: AboutVideoItem.kt */
    public static final class e extends AboutVideoItem {
        public final List<VideoFile> b;
        public final String c;
        public final String d;

        /* JADX WARN: Multi-variable type inference failed */
        public e(List<? extends VideoFile> list, String str, String str2) {
            this.b = list;
            this.c = str;
            this.d = str2;
            AboutVideoViewType.ClipBlock.ordinal();
        }
    }

    /* compiled from: AboutVideoItem.kt */
    public static final class f extends AboutVideoItem {
        public static final f b = new f();

        static {
            AboutVideoViewType.ClipsHeader.ordinal();
        }
    }

    /* compiled from: AboutVideoItem.kt */
    public static final class g extends AboutVideoItem {
        public final b b;
        public final a c;
        public final c d;
        public final eao e;
        public final boolean f;
        public final Boolean g;
        public final int h;
        public final boolean i;
        public final VideoFile j;

        /* compiled from: AboutVideoItem.kt */
        public static final class a {
            public final boolean a;
            public final boolean b;

            public a(boolean z, boolean z2) {
                this.a = z;
                this.b = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AddedInfo(added=");
                sb.append(this.a);
                sb.append(", canAdd=");
                return q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: AboutVideoItem.kt */
        public static final class b {
            public final boolean a;
            public final int b;
            public final boolean c;

            public b(int i, boolean z, boolean z2) {
                this.a = z;
                this.b = i;
                this.c = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + shy.a(this.b, Boolean.hashCode(this.a) * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("LikesInfo(liked=");
                sb.append(this.a);
                sb.append(", likes=");
                sb.append(this.b);
                sb.append(", canLike=");
                return q0.a(sb, this.c, ')');
            }
        }

        /* compiled from: AboutVideoItem.kt */
        public static final class c {
            public final boolean a;
            public final int b;

            public c(boolean z, int i) {
                this.a = z;
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.a == cVar.a && this.b == cVar.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("RepostsInfo(canRepost=");
                sb.append(this.a);
                sb.append(", reposts=");
                return vu5.b(sb, this.b, ')');
            }
        }

        public g(VideoFile videoFile, eao eaoVar) {
            VideoRestriction O = videoFile.O();
            Boolean valueOf = O != null ? Boolean.valueOf(O.f) : null;
            b bVar = new b(videoFile.l1(), videoFile.O9(), videoFile.i0());
            a aVar = new a(videoFile.j0(), videoFile.i9());
            c cVar = new c(videoFile.Fa(), videoFile.W7());
            int c1 = videoFile.c1();
            boolean X = videoFile.X();
            boolean c2 = fxc0.B().c(videoFile);
            this.b = bVar;
            this.c = aVar;
            this.d = cVar;
            this.e = eaoVar;
            this.f = X;
            this.g = valueOf;
            this.h = c1;
            this.i = c2;
            AboutVideoViewType.VideoControlsBar.ordinal();
            this.j = videoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.b, gVar.b) && epx.f(this.c, gVar.c) && epx.f(this.d, gVar.d) && epx.f(this.e, gVar.e) && this.f == gVar.f && epx.f(this.g, gVar.g) && this.h == gVar.h && this.i == gVar.i;
        }

        public final int hashCode() {
            int b2 = qoy.b((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.f);
            Boolean bool = this.g;
            return Boolean.hashCode(this.i) + shy.a(this.h, (b2 + (bool == null ? 0 : bool.hashCode())) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ControlsBar(likesInfo=");
            sb.append(this.b);
            sb.append(", addedInfo=");
            sb.append(this.c);
            sb.append(", repostsInfo=");
            sb.append(this.d);
            sb.append(", downloadStatus=");
            sb.append(this.e);
            sb.append(", isFavorite=");
            sb.append(this.f);
            sb.append(", canPlay=");
            sb.append(this.g);
            sb.append(", comments=");
            sb.append(this.h);
            sb.append(", isRestricted=");
            return q0.a(sb, this.i, ')');
        }
    }

    /* compiled from: AboutVideoItem.kt */
    public static final class h extends AboutVideoItem {
        public final CharSequence b;
        public final int c;
        public final int d;
        public final CharSequence e;
        public final int f;
        public final TitleAction g;
        public final boolean h;
        public final OrdAdInfo i;
        public final boolean j;
        public final Long k;
        public final boolean l;
        public final List<Good> m;
        public final boolean n;

        /* JADX WARN: Multi-variable type inference failed */
        public h(CharSequence charSequence, int i, int i2, CharSequence charSequence2, int i3, TitleAction titleAction, boolean z, OrdAdInfo ordAdInfo, boolean z2, Long l, boolean z3, List<? extends Good> list, boolean z4) {
            this.b = charSequence;
            this.c = i;
            this.d = i2;
            this.e = charSequence2;
            this.f = i3;
            this.g = titleAction;
            this.h = z;
            this.i = ordAdInfo;
            this.j = z2;
            this.k = l;
            this.l = z3;
            this.m = list;
            this.n = z4;
            AboutVideoViewType.Description.ordinal();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return epx.f(this.b, hVar.b) && this.c == hVar.c && this.d == hVar.d && epx.f(this.e, hVar.e) && this.f == hVar.f && epx.f(this.g, hVar.g) && this.h == hVar.h && epx.f(this.i, hVar.i) && this.j == hVar.j && epx.f(this.k, hVar.k) && this.l == hVar.l && epx.f(this.m, hVar.m) && this.n == hVar.n;
        }

        public final int hashCode() {
            int a = shy.a(this.f, u11.c(shy.a(this.d, shy.a(this.c, this.b.hashCode() * 31, 31), 31), 31, this.e), 31);
            TitleAction titleAction = this.g;
            int b = qoy.b((a + (titleAction == null ? 0 : titleAction.hashCode())) * 31, 31, this.h);
            OrdAdInfo ordAdInfo = this.i;
            int b2 = qoy.b((b + (ordAdInfo == null ? 0 : ordAdInfo.hashCode())) * 31, 31, this.j);
            Long l = this.k;
            return Boolean.hashCode(this.n) + fw3.a(qoy.b((b2 + (l != null ? l.hashCode() : 0)) * 31, 31, this.l), 31, this.m);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Description(title=");
            sb.append((Object) this.b);
            sb.append(", uploadedAt=");
            sb.append(this.c);
            sb.append(", viewsCount=");
            sb.append(this.d);
            sb.append(", text=");
            sb.append((Object) this.e);
            sb.append(", duration=");
            sb.append(this.f);
            sb.append(", titleAction=");
            sb.append(this.g);
            sb.append(", isArchivalContent=");
            sb.append(this.h);
            sb.append(", ordInfo=");
            sb.append(this.i);
            sb.append(", isRestricted=");
            sb.append(this.j);
            sb.append(", archivalContentPublishedDate=");
            sb.append(this.k);
            sb.append(", isVkLive=");
            sb.append(this.l);
            sb.append(", goods=");
            sb.append(this.m);
            sb.append(", isLiveUpcoming=");
            return q0.a(sb, this.n, ')');
        }
    }

    /* compiled from: AboutVideoItem.kt */
    public static final class i extends AboutVideoItem {
        public final CharSequence b;
        public final long c;
        public final long d;
        public final int e;
        public final int f;
        public final CharSequence g;
        public final boolean h;
        public final TitleAction i;
        public final OrdAdInfo j;
        public final DonutVideoUiModel k;
        public final boolean l;

        public i(CharSequence charSequence, long j, long j2, int i, int i2, CharSequence charSequence2, boolean z, TitleAction titleAction, OrdAdInfo ordAdInfo, DonutVideoUiModel donutVideoUiModel, boolean z2) {
            this.b = charSequence;
            this.c = j;
            this.d = j2;
            this.e = i;
            this.f = i2;
            this.g = charSequence2;
            this.h = z;
            this.i = titleAction;
            this.j = ordAdInfo;
            this.k = donutVideoUiModel;
            this.l = z2;
            AboutVideoViewType.DescriptionRedesign.ordinal();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return epx.f(this.b, iVar.b) && this.c == iVar.c && this.d == iVar.d && this.e == iVar.e && this.f == iVar.f && epx.f(this.g, iVar.g) && this.h == iVar.h && epx.f(this.i, iVar.i) && epx.f(this.j, iVar.j) && epx.f(this.k, iVar.k) && this.l == iVar.l;
        }

        public final int hashCode() {
            int b = qoy.b(u11.c(shy.a(this.f, shy.a(this.e, bh10.a(bh10.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31), 31), 31, this.g), 31, this.h);
            TitleAction titleAction = this.i;
            int hashCode = (b + (titleAction == null ? 0 : titleAction.hashCode())) * 31;
            OrdAdInfo ordAdInfo = this.j;
            int hashCode2 = (hashCode + (ordAdInfo == null ? 0 : ordAdInfo.hashCode())) * 31;
            DonutVideoUiModel donutVideoUiModel = this.k;
            return Boolean.hashCode(this.l) + ((hashCode2 + (donutVideoUiModel != null ? donutVideoUiModel.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DescriptionRedesign(title=");
            sb.append((Object) this.b);
            sb.append(", dateMilliseconds=");
            sb.append(this.c);
            sb.append(", publishAt=");
            sb.append(this.d);
            sb.append(", viewsCount=");
            sb.append(this.e);
            sb.append(", duration=");
            sb.append(this.f);
            sb.append(", text=");
            sb.append((Object) this.g);
            sb.append(", isRestricted=");
            sb.append(this.h);
            sb.append(", titleAction=");
            sb.append(this.i);
            sb.append(", ordInfo=");
            sb.append(this.j);
            sb.append(", donutVideoUiModel=");
            sb.append(this.k);
            sb.append(", isLiveUpcoming=");
            return q0.a(sb, this.l, ')');
        }
    }

    /* compiled from: AboutVideoItem.kt */
    public static final class j extends AboutVideoItem {
        public final int b = R.string.video_media_license_title;
        public final int c = R.string.video_media_license_sport_text;

        public j() {
            AboutVideoViewType.Disclaimer.ordinal();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.b == jVar.b && this.c == jVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Disclaimer(titleId=");
            sb.append(this.b);
            sb.append(", descriptionId=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: AboutVideoItem.kt */
    public static final class k extends AboutVideoItem {
        public static final k b = new k();

        static {
            AboutVideoViewType.Divider.ordinal();
        }
    }

    /* compiled from: AboutVideoItem.kt */
    public static final class l extends AboutVideoItem {
        public final String b;
        public final String c;
        public final Doc2DocItem.Banner.Action d;
        public final String e;

        public l(String str, String str2, Doc2DocItem.Banner.Action action, String str3) {
            this.b = str;
            this.c = str2;
            this.d = action;
            this.e = str3;
            AboutVideoViewType.Doc2DocBanner.ordinal();
        }
    }

    /* compiled from: AboutVideoItem.kt */
    public static final class m extends AboutVideoItem {
        public final int b;
        public final String c;

        public m(int i, String str) {
            this.b = i;
            this.c = str;
            AboutVideoViewType.EpisodeRedesign.ordinal();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return this.b == mVar.b && epx.f(this.c, mVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EpisodeRedesignVideo(episodesCount=");
            sb.append(this.b);
            sb.append(", nameCurrentEpisode=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: AboutVideoItem.kt */
    public static final class n extends AboutVideoItem {
        public final List<atp> b;

        public n(List<atp> list) {
            this.b = list;
            AboutVideoViewType.Episode.ordinal();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && epx.f(this.b, ((n) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("EpisodeVideo(items="), this.b);
        }
    }

    /* compiled from: AboutVideoItem.kt */
    public static final class o extends AboutVideoItem {
        public final CharSequence b;
        public final int c;

        public o(int i, CharSequence charSequence) {
            this.b = charSequence;
            this.c = i;
            AboutVideoViewType.Info.ordinal();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return epx.f(this.b, oVar.b) && this.c == oVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Info(description=");
            sb.append((Object) this.b);
            sb.append(", duration=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: AboutVideoItem.kt */
    public static final class p extends AboutVideoItem {
        public static final p b = new p();

        static {
            AboutVideoViewType.LikesSkeleton.ordinal();
        }
    }

    /* compiled from: AboutVideoItem.kt */
    public static abstract class q extends AboutVideoItem {

        /* compiled from: AboutVideoItem.kt */
        public static final class a extends q {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -784835929;
            }

            public final String toString() {
                return "Empty";
            }
        }

        /* compiled from: AboutVideoItem.kt */
        public static final class b extends q {
            public final cw50 b;
            public final zu50 c;
            public final izs<zu50, s3q0> d;
            public final gzs<s3q0> e;
            public final boolean f;

            /* JADX WARN: Multi-variable type inference failed */
            public b(cw50 cw50Var, zu50 zu50Var, izs<? super zu50, s3q0> izsVar, gzs<s3q0> gzsVar, boolean z) {
                this.b = cw50Var;
                this.c = zu50Var;
                this.d = izsVar;
                this.e = gzsVar;
                this.f = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && this.f == bVar.f;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f) + sf3.a(dq.c((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d), 31, this.e);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OverlayAdBanner(banner=");
                sb.append(this.b);
                sb.append(", nativeAd=");
                sb.append(this.c);
                sb.append(", closeOverlay=");
                sb.append(this.d);
                sb.append(", trackAdEvent=");
                sb.append(this.e);
                sb.append(", canShowUnderPlayer=");
                return q0.a(sb, this.f, ')');
            }
        }

        public q() {
            AboutVideoViewType.AdOverlayBlock.ordinal();
        }
    }

    /* compiled from: AboutVideoItem.kt */
    public static final class r extends AboutVideoItem {
        public final boolean b;

        public r(boolean z) {
            this.b = z;
            AboutVideoViewType.PromoBanner.ordinal();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.b == ((r) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("PromoBanner(isTablet="), this.b, ')');
        }
    }

    /* compiled from: AboutVideoItem.kt */
    public static final class s extends AboutVideoItem {
        public final int b;
        public final UserId c;
        public final String d;
        public final String e;
        public final String f;
        public final Thumb g;
        public final boolean h;
        public final boolean i;
        public final String j;
        public final String k;
        public final boolean l;

        public s(int i, UserId userId, String str, String str2, String str3, Thumb thumb, boolean z, boolean z2, String str4, String str5, boolean z3) {
            this.b = i;
            this.c = userId;
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.g = thumb;
            this.h = z;
            this.i = z2;
            this.j = str4;
            this.k = str5;
            this.l = z3;
            AboutVideoViewType.RelatedAudio.ordinal();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return this.b == sVar.b && epx.f(this.c, sVar.c) && epx.f(this.d, sVar.d) && epx.f(this.e, sVar.e) && epx.f(this.f, sVar.f) && epx.f(this.g, sVar.g) && this.h == sVar.h && this.i == sVar.i && epx.f(this.j, sVar.j) && epx.f(this.k, sVar.k) && this.l == sVar.l;
        }

        public final int hashCode() {
            int a = urd0.a(bh10.a(Integer.hashCode(this.b) * 31, 31, this.c.b), 31, this.d);
            String str = this.e;
            int b = qoy.b(qoy.b((this.g.hashCode() + urd0.a((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.f)) * 31, 31, this.h), 31, this.i);
            String str2 = this.j;
            int hashCode = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.k;
            return Boolean.hashCode(this.l) + ((hashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelatedAudio(audioId=");
            sb.append(this.b);
            sb.append(", ownerId=");
            sb.append(this.c);
            sb.append(", title=");
            sb.append(this.d);
            sb.append(", subtitle=");
            sb.append(this.e);
            sb.append(", artist=");
            sb.append(this.f);
            sb.append(", thumb=");
            sb.append(this.g);
            sb.append(", isAdded=");
            sb.append(this.h);
            sb.append(", isRestricted=");
            sb.append(this.i);
            sb.append(", trackCode=");
            sb.append(this.j);
            sb.append(", accessKey=");
            sb.append(this.k);
            sb.append(", isLoading=");
            return q0.a(sb, this.l, ')');
        }
    }

    /* compiled from: AboutVideoItem.kt */
    public static final class t extends AboutVideoItem {
        public static final t b = new t();

        static {
            AboutVideoViewType.RelatedAudioSkeleton.ordinal();
        }
    }

    /* compiled from: AboutVideoItem.kt */
    public static final class u extends AboutVideoItem {
        public static final u b = new u();

        static {
            AboutVideoViewType.RelatedAudioTitle.ordinal();
        }
    }

    /* compiled from: AboutVideoItem.kt */
    public static final class v extends AboutVideoItem {
        public final noj0 b;
        public final boolean c;
        public final boolean d;

        public v(noj0 noj0Var, boolean z, boolean z2) {
            this.b = noj0Var;
            this.c = z;
            this.d = z2;
            AboutVideoViewType.SimilarVideo.ordinal();
        }

        public static v a(v vVar, noj0 noj0Var, boolean z, boolean z2, int i) {
            if ((i & 1) != 0) {
                noj0Var = vVar.b;
            }
            if ((i & 2) != 0) {
                z = vVar.c;
            }
            if ((i & 8) != 0) {
                z2 = vVar.d;
            }
            return new v(noj0Var, z, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            return epx.f(this.b, vVar.b) && this.c == vVar.c && this.d == vVar.d;
        }

        @Override // com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem, xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(this.b.a.o0());
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, false);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SimilarVideo(value=");
            sb.append(this.b);
            sb.append(", isNotInterested=");
            sb.append(this.c);
            sb.append(", isNotRecommendOwner=false, isRestricted=");
            return q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: AboutVideoItem.kt */
    public static abstract class w extends AboutVideoItem {

        /* compiled from: AboutVideoItem.kt */
        public static final class a extends w {
            public final String b;

            public a(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("BackendError(group="), this.b, ')');
            }
        }

        /* compiled from: AboutVideoItem.kt */
        public static abstract class b extends w {

            /* compiled from: AboutVideoItem.kt */
            public static final class a extends b {
                public static final a b = new a();
            }

            /* compiled from: AboutVideoItem.kt */
            /* renamed from: com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem$w$b$b, reason: collision with other inner class name */
            public static final class C1217b extends b {
                public final String b;

                public C1217b(String str) {
                    this.b = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1217b) && epx.f(this.b, ((C1217b) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("EmptyRecommendations(group="), this.b, ')');
                }
            }
        }

        /* compiled from: AboutVideoItem.kt */
        public static final class c extends w {
            public static final c b = new c();
        }

        public w() {
            AboutVideoViewType.SimilarVideoError.ordinal();
        }
    }

    /* compiled from: AboutVideoItem.kt */
    public static final class x extends AboutVideoItem {
        public static final x b = new x();

        static {
            AboutVideoViewType.SimilarVideoSkeleton.ordinal();
        }
    }

    /* compiled from: AboutVideoItem.kt */
    public static final class y extends AboutVideoItem {
        public static final y b = new y();

        static {
            AboutVideoViewType.SimilarVideosTitle.ordinal();
        }
    }

    /* compiled from: AboutVideoItem.kt */
    public static final class z extends AboutVideoItem {
        public final String b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;

        public z(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
            this.b = str;
            this.c = z;
            this.d = z2;
            this.e = z3;
            this.f = z4;
            this.g = z5;
            this.h = z6;
            AboutVideoViewType.SimilarVideosTitleRedesign.ordinal();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof z)) {
                return false;
            }
            z zVar = (z) obj;
            return epx.f(this.b, zVar.b) && this.c == zVar.c && this.d == zVar.d && this.e == zVar.e && this.f == zVar.f && this.g == zVar.g && this.h == zVar.h;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.h) + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SimilarVideosTitleRedesign(group=");
            sb.append(this.b);
            sb.append(", isAboutInfoScreen=");
            sb.append(this.c);
            sb.append(", isOfflineFeed=");
            sb.append(this.d);
            sb.append(", isSimilarMusic=");
            sb.append(this.e);
            sb.append(", isMusicMix=");
            sb.append(this.f);
            sb.append(", hideSeparator=");
            sb.append(this.g);
            sb.append(", keepSeparatorSpace=");
            return q0.a(sb, this.h, ')');
        }
    }

    @Override // xsna.hfz
    public Number getItemId() {
        return 0;
    }
}
