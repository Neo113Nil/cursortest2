package com.vk.newsfeed.common.util;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.PlaybackStateCompat;
import com.ironsource.InterfaceC4413l1;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.ActionLinkSnippet;
import com.vk.dto.actionlinks.SnippetStyle;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.Merchant;
import com.vk.dto.attachments.Product;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Good;
import com.vk.dto.common.GroupsSuggestions;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.actions.Action;
import com.vk.dto.discover.carousel.Carousel;
import com.vk.dto.discover.carousel.apps.AppCarousel;
import com.vk.dto.discover.carousel.products.ProductCarousel;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.Caption;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.newsfeed.activities.Activity;
import com.vk.dto.newsfeed.activities.Comment;
import com.vk.dto.newsfeed.activities.CommentsActivity;
import com.vk.dto.newsfeed.activities.LikesActivity;
import com.vk.dto.newsfeed.entries.ClipsEntry;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.dto.newsfeed.entries.DzenArticlesBlock;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.dto.newsfeed.entries.InterestingStoriesEntry;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.newsfeed.entries.OptionalNativeAdEntry;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.ProfilesRecommendations;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.RecommendedMiniAppEntry;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.photo.Photo;
import com.vk.dto.polls.Poll;
import com.vk.ecomm.fave.api.models.FaveMarketItem;
import com.vk.fave.entities.FaveEntry;
import com.vk.fave.entities.FaveType;
import com.vk.feed.core.models.Animation;
import com.vk.feed.core.models.DebugInfo;
import com.vk.feed.core.models.EntryPoints;
import com.vk.feed.core.models.ads.EasyPromote;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.channels.ChannelsRecommendations;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.core.models.dzen.DzenNews;
import com.vk.feed.core.models.dzen.DzenNewsItem;
import com.vk.feed.core.models.dzen.DzenStory;
import com.vk.feed.core.models.feedback.ButtonsFeedback;
import com.vk.feed.core.models.feedback.Feedback;
import com.vk.feed.core.models.feedback.FeedbackPoll;
import com.vk.feed.core.models.feedback.StarsFeedback;
import com.vk.feed.core.models.info.InfoBlock;
import com.vk.feed.core.models.news.AnimatedBlockEntry;
import com.vk.feed.core.models.news.AnimatedBlockEntry$Companion$DecorationType;
import com.vk.feed.core.models.news.ExpertCard;
import com.vk.feed.core.models.news.LatestNews;
import com.vk.feed.core.models.news.LatestNewsItem;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.PromoButton;
import com.vk.feed.core.models.news.UxPollsEntry;
import com.vk.feed.core.models.news.YandexNativeAdEntry;
import com.vk.log.L;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vk.toggle.Features;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.SmbAdFeatures;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.PodcastAttachment;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.data.PostInteract;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.a2o;
import xsna.a6a0;
import xsna.a6i;
import xsna.a6n0;
import xsna.ad0;
import xsna.alk;
import xsna.atv0;
import xsna.b25;
import xsna.b4o;
import xsna.b6n0;
import xsna.bis;
import xsna.blq0;
import xsna.bp50;
import xsna.bpn0;
import xsna.bwn;
import xsna.bwy;
import xsna.c2c0;
import xsna.c5g;
import xsna.cdi;
import xsna.cf0;
import xsna.cn70;
import xsna.d2c0;
import xsna.d6n0;
import xsna.dd80;
import xsna.dhr0;
import xsna.di60;
import xsna.dio0;
import xsna.drm0;
import xsna.ds50;
import xsna.dwv;
import xsna.e43;
import xsna.e4v;
import xsna.ej90;
import xsna.eks0;
import xsna.epx;
import xsna.ero;
import xsna.f9t;
import xsna.fj90;
import xsna.fm20;
import xsna.fr20;
import xsna.fw00;
import xsna.g1o;
import xsna.g4s0;
import xsna.g5g;
import xsna.g7s0;
import xsna.gbg0;
import xsna.gf7;
import xsna.gjx;
import xsna.gmq;
import xsna.gnq;
import xsna.gto;
import xsna.h170;
import xsna.hd60;
import xsna.hp30;
import xsna.i170;
import xsna.i2c0;
import xsna.i5o;
import xsna.i5y0;
import xsna.id0;
import xsna.iko0;
import xsna.j5g;
import xsna.jbf0;
import xsna.jw30;
import xsna.jzf0;
import xsna.k15;
import xsna.k2c0;
import xsna.k7z;
import xsna.kdf0;
import xsna.kly;
import xsna.l1e0;
import xsna.l4c0;
import xsna.l4r0;
import xsna.lbs;
import xsna.lzf0;
import xsna.m6r0;
import xsna.mg2;
import xsna.msy;
import xsna.myc0;
import xsna.n34;
import xsna.na60;
import xsna.ng2;
import xsna.nm60;
import xsna.nr50;
import xsna.nyj0;
import xsna.o25;
import xsna.o3o;
import xsna.o6;
import xsna.ol60;
import xsna.om60;
import xsna.owu;
import xsna.ozc;
import xsna.ozn;
import xsna.p3s0;
import xsna.p6y;
import xsna.p890;
import xsna.pa2;
import xsna.ph60;
import xsna.pto;
import xsna.qc00;
import xsna.qen;
import xsna.r1o;
import xsna.r74;
import xsna.rl3;
import xsna.rp50;
import xsna.rte0;
import xsna.rv60;
import xsna.s1c0;
import xsna.s1q;
import xsna.s3q0;
import xsna.sgw;
import xsna.skd;
import xsna.sni;
import xsna.sr9;
import xsna.t6g0;
import xsna.tgw;
import xsna.tto;
import xsna.tyj0;
import xsna.u1c0;
import xsna.u5t0;
import xsna.ucf0;
import xsna.uh80;
import xsna.up70;
import xsna.uy9;
import xsna.v1c0;
import xsna.vfe;
import xsna.vo50;
import xsna.vp10;
import xsna.vt30;
import xsna.vt80;
import xsna.w100;
import xsna.w65;
import xsna.w8i;
import xsna.w9;
import xsna.wjd;
import xsna.wjz0;
import xsna.wm60;
import xsna.wto;
import xsna.wvl;
import xsna.x4y0;
import xsna.x850;
import xsna.x9v0;
import xsna.y8g0;
import xsna.ydo0;
import xsna.yiz;
import xsna.yvl;
import xsna.yzn;
import xsna.z1n;
import xsna.z4y0;
import xsna.z5l;
import xsna.ze7;
import xsna.zu50;
import xsna.zxm;

/* compiled from: PostDisplayItemsBuilder.kt */
/* loaded from: classes4.dex */
public final class j implements w8i {
    public final n34 A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final bpn0 b = new bpn0(new fm20(this, 17));
    public final bpn0 c = new bpn0(new hp30(this, 11));
    public final bpn0 d;
    public final Object e;
    public final k15 f;
    public final Object g;
    public final k2c0 h;
    public final owu i;
    public final vfe j;
    public final Object k;
    public final Object l;
    public final i2c0 m;
    public final ydo0 n;
    public final bpn0 o;
    public final bpn0 p;
    public final bpn0 q;
    public final bpn0 r;
    public final bpn0 s;
    public final f9t t;
    public final qen u;
    public final Object v;
    public final w65 w;
    public final bpn0 x;
    public final Object y;
    public final Object z;

    public j() {
        bpn0 bpn0Var = new bpn0(new jw30(this, 14));
        this.d = bpn0Var;
        c2c0 c2c0Var = new c2c0(0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, c2c0Var);
        this.f = new k15();
        this.g = msy.a(lazyThreadSafetyMode, new k7z(this, 23));
        this.h = new k2c0();
        this.i = new owu();
        this.j = new vfe(F());
        this.k = msy.a(lazyThreadSafetyMode, new uh80(1));
        this.l = msy.a(lazyThreadSafetyMode, new w9(27));
        this.m = new i2c0(new ph60((a2o) bpn0Var.getValue()), (a2o) bpn0Var.getValue());
        this.n = new ydo0();
        this.o = new bpn0(new fr20(this, 16));
        this.p = new bpn0(new o6(24));
        this.q = new bpn0(new w100(this, 23));
        this.r = new bpn0(new p6y(this, 23));
        this.s = new bpn0(new nm60(this, 7));
        this.t = new f9t(15);
        this.u = new qen();
        this.v = msy.a(lazyThreadSafetyMode, new vo50(8));
        this.w = new w65(7);
        this.x = new bpn0(new vt30(this, 17));
        this.y = msy.a(lazyThreadSafetyMode, new om60(5));
        this.z = msy.a(lazyThreadSafetyMode, new x850(this, 11));
        this.A = new n34();
        this.B = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.interactor.g(27));
        this.C = msy.a(lazyThreadSafetyMode, new qc00(6));
        this.D = msy.a(lazyThreadSafetyMode, new d2c0(0));
    }

    public static u1c0 A(int i, NewsEntry newsEntry) {
        u1c0 u1c0Var = new u1c0(i, newsEntry);
        u1c0Var.h = (ol60) j5g.a0(Collections.singletonList(new jbf0(i, newsEntry)));
        return u1c0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        if (xsna.drm0.N(r2) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0065, code lost:
    
        if (r2.equals("clips_trend") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x006e, code lost:
    
        if (r2.equals("clips_compilation_view") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0077, code lost:
    
        if (r2.equals("clips_compilation_next") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x007e, code lost:
    
        if (r2.equals("") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0087, code lost:
    
        if (r2.equals("link_community_with_subscribe") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0090, code lost:
    
        if (r2.equals("clips_user_link") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0099, code lost:
    
        if (r2.equals("clips_compilation_first") != false) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(NewsEntry newsEntry, ArrayList arrayList, s1c0 s1c0Var) {
        ActionLink actionLink;
        SnippetStyle snippetStyle;
        SnippetStyle snippetStyle2;
        String str;
        if (s1c0Var.u || s1c0Var.D) {
            ozc ozcVar = null;
            ozcVar = null;
            ozcVar = null;
            r0 = null;
            Integer num = null;
            ozcVar = null;
            ozcVar = null;
            ozcVar = null;
            ozcVar = null;
            ozcVar = null;
            ozcVar = null;
            ozcVar = null;
            ozcVar = null;
            VideoAttachment Nb = newsEntry instanceof Videos ? ((Videos) newsEntry).Nb() : newsEntry instanceof ShitAttachment ? ((ShitAttachment) newsEntry).I : null;
            VideoFile videoFile = Nb != null ? Nb.k : null;
            ClipVideoFile clipVideoFile = videoFile instanceof ClipVideoFile ? (ClipVideoFile) videoFile : null;
            if (clipVideoFile != null && (actionLink = clipVideoFile.Y) != null) {
                ActionLinkSnippet actionLinkSnippet = actionLink.f;
                if (drm0.N(actionLink.e)) {
                    String str2 = actionLinkSnippet != null ? actionLinkSnippet.e : null;
                    if (str2 != null) {
                    }
                }
                String str3 = actionLink.c;
                String str4 = "";
                switch (str3.hashCode()) {
                    case -933240040:
                        break;
                    case -652765742:
                        break;
                    case -591591220:
                        break;
                    case 0:
                        break;
                    case 1217056139:
                        break;
                    case 1217297725:
                        break;
                    case 1378026881:
                        break;
                    default:
                        if (actionLinkSnippet != null && (str = actionLinkSnippet.e) != null) {
                            str4 = str;
                        }
                        String zb = actionLinkSnippet != null ? actionLinkSnippet.zb() : null;
                        Integer num2 = (actionLinkSnippet == null || (snippetStyle2 = actionLinkSnippet.i) == null) ? null : snippetStyle2.b;
                        if (actionLinkSnippet != null && (snippetStyle = actionLinkSnippet.i) != null) {
                            num = snippetStyle.c;
                        }
                        ozcVar = new ozc(str4, zb, actionLink, num2, num, clipVideoFile.r1(), new ozc.a(clipVideoFile.c, clipVideoFile.b.b, clipVideoFile.W));
                        break;
                }
            }
            if (ozcVar != null) {
                u1c0 u1c0Var = new u1c0(Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE, newsEntry);
                u1c0Var.h = ozcVar;
                arrayList.add(u1c0Var);
            }
        }
    }

    public static ArrayList g(j jVar, NewsEntry newsEntry, s1c0 s1c0Var, String str, String str2) {
        lzf0 stub = jzf0.a.a.getSTUB();
        jVar.getClass();
        ArrayList arrayList = new ArrayList();
        jVar.f(newsEntry, s1c0Var, str, str2, arrayList, stub, null);
        return arrayList;
    }

    public static /* synthetic */ void h(j jVar, NewsEntry newsEntry, s1c0 s1c0Var, String str, String str2, ArrayList arrayList, jzf0 jzf0Var, int i) {
        if ((i & 32) != 0) {
            jzf0Var = jzf0.a.a.getSTUB();
        }
        jVar.f(newsEntry, s1c0Var, str, str2, arrayList, jzf0Var, null);
    }

    public static u1c0 i(Post post, NewsEntry newsEntry, LikesActivity likesActivity, boolean z) {
        u1c0 u1c0Var = new u1c0(post, newsEntry, 18);
        u1c0Var.h = (ol60) j5g.Y(new l4c0(z).a(0, new Pair<>(post, likesActivity), null));
        return u1c0Var;
    }

    public static void j(AnimatedBlockEntry animatedBlockEntry, ArrayList arrayList) {
        Drawable drawable;
        Drawable colorDrawable;
        u1c0 u1c0Var = new u1c0(Sdk.SDKError.Reason.AD_WIN_NOTIFICATION_ERROR_VALUE, animatedBlockEntry);
        Animation animation = animatedBlockEntry.l;
        int i = ng2.a.$EnumSwitchMapping$0[animatedBlockEntry.n.ordinal()];
        if (i != 1) {
            if (i == 2) {
                colorDrawable = new ColorDrawable(dhr0.t.c(R.attr.vk_ui_background_content));
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                colorDrawable = dhr0.t.a(R.drawable.bg_newsfeed_card_rounded);
            }
            drawable = colorDrawable;
        } else {
            drawable = null;
        }
        String str = animatedBlockEntry.i;
        boolean z = !(str == null || drm0.N(str));
        String str2 = animatedBlockEntry.j;
        boolean z2 = !(str2 == null || drm0.N(str2));
        LinkButton linkButton = animatedBlockEntry.p;
        String str3 = linkButton != null ? linkButton.b : null;
        boolean z3 = linkButton != null;
        boolean z4 = animatedBlockEntry.o;
        String str4 = animation.b;
        int i2 = animation.e;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        int a = gbg0.a(context.getResources(), animation.c);
        Context context2 = e43.a;
        u1c0Var.h = (ol60) j5g.Y(Collections.singletonList(new mg2(str, z, str2, z2, str3, z3, z4, drawable, str4, a, gbg0.a((context2 != null ? context2 : null).getResources(), animation.d), i2)));
        arrayList.add(u1c0Var);
    }

    public static void p(NewsEntry newsEntry, NewsEntry newsEntry2, ArrayList arrayList) {
        EasyPromote c = na60.c(newsEntry);
        Integer valueOf = c != null ? Integer.valueOf(c.b) : null;
        if (valueOf != null && valueOf.intValue() == 1) {
            arrayList.add(new u1c0(newsEntry, newsEntry2, 56));
            return;
        }
        if ((valueOf != null && valueOf.intValue() == 4) || ((valueOf != null && valueOf.intValue() == 5) || ((valueOf != null && valueOf.intValue() == 6) || ((valueOf != null && valueOf.intValue() == 7) || (valueOf != null && valueOf.intValue() == 3))))) {
            arrayList.add(new u1c0(newsEntry, newsEntry2, 57));
        }
    }

    public static void r(ExpertCard expertCard, ArrayList arrayList) {
        arrayList.add(new u1c0(153, expertCard));
    }

    public static void v(LatestNews latestNews, ArrayList arrayList) {
        ArrayList<LatestNewsItem> arrayList2 = latestNews.k;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        arrayList.add(new u1c0(31, latestNews));
        Iterator<LatestNewsItem> it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(new u1c0(it.next(), latestNews, 30));
        }
        p890 p890Var = new p890(latestNews, latestNews, cn70.b(8));
        p890Var.e = false;
        arrayList.add(p890Var);
    }

    public static void w(NewsEntry newsEntry, NewsEntry newsEntry2, ArrayList arrayList) {
        Feedback feedback = newsEntry.g;
        if (feedback == null || feedback.e) {
            return;
        }
        if (feedback instanceof StarsFeedback) {
            u1c0 u1c0Var = new u1c0(newsEntry, newsEntry2, 263);
            u1c0Var.e = false;
            arrayList.add(u1c0Var);
        } else if (feedback instanceof ButtonsFeedback) {
            u1c0 u1c0Var2 = new u1c0(newsEntry, newsEntry2, 264);
            u1c0Var2.e = false;
            arrayList.add(u1c0Var2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r0.Fb() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0105, code lost:
    
        if (r3 != false) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x011e A[LOOP:1: B:100:0x011e->B:105:0x0130, LOOP_START, PHI: r6
      0x011e: PHI (r6v4 int) = (r6v0 int), (r6v5 int) binds: [B:99:0x011c, B:105:0x0130] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(ArrayList arrayList, int i, int i2, NewsEntry newsEntry, s1c0 s1c0Var, String str, PostInteract postInteract) {
        u1c0 u1c0Var;
        boolean z;
        boolean z2;
        AnimatedBlockEntry$Companion$DecorationType animatedBlockEntry$Companion$DecorationType;
        if ((newsEntry instanceof AnimatedBlockEntry) && ((animatedBlockEntry$Companion$DecorationType = ((AnimatedBlockEntry) newsEntry).n) == AnimatedBlockEntry$Companion$DecorationType.NONE || animatedBlockEntry$Companion$DecorationType == AnimatedBlockEntry$Companion$DecorationType.CARD)) {
            if (newsEntry instanceof DiscoverMediaBlock) {
                DiscoverMediaBlock discoverMediaBlock = (DiscoverMediaBlock) newsEntry;
                if (!discoverMediaBlock.Gb()) {
                }
            }
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    ((u1c0) arrayList.get(i3)).d = 0;
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            if (!s1c0Var.k) {
                int zb = newsEntry.zb();
                boolean z3 = true;
                if (zb != 2 && zb != 13 && zb != 26 && zb != 63 && zb != 64 && zb != 29 && zb != 55 && zb != 30 && zb != 33 && zb != 46 && zb != 32 && zb != 68 && zb != 34 && zb != 37 && zb != 36 && zb != 38 && zb != 44 && zb != 49 && zb != 56 && zb != 57 && zb != 58 && zb != 60 && zb != 39 && zb != 59 && zb != 67 && zb != 69 && zb != 65 && (!((z = newsEntry instanceof Photos)) || (z && ((Photos) newsEntry).q.size() == 1))) {
                    boolean z4 = newsEntry instanceof Post;
                    Post post = z4 ? (Post) newsEntry : null;
                    if (!(post != null ? post.Tb() : false)) {
                        if (z4) {
                            Post post2 = (Post) newsEntry;
                            if (post2.rc() && post2.ic()) {
                                z2 = true;
                                if (!z2) {
                                    z3 = false;
                                }
                            }
                        }
                        z2 = false;
                        if (!z2) {
                        }
                    }
                }
            }
            if (i <= i2) {
                int i4 = i;
                while (true) {
                    ((u1c0) arrayList.get(i4)).e = false;
                    if (i4 == i2) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            G(i, i2, s1c0Var.J, arrayList);
            if (i <= i2) {
                while (true) {
                    u1c0 u1c0Var2 = (u1c0) arrayList.get(i);
                    if (u1c0Var2.l == null) {
                        u1c0Var2.l = str;
                    }
                    u1c0Var2.m = postInteract;
                    u1c0Var2.n = s1c0Var;
                    if (i == i2) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if ((newsEntry instanceof DeprecatedStatisticInterface) || s1c0Var.c || (u1c0Var = (u1c0) j5g.k0(arrayList)) == null) {
                return;
            }
            u1c0Var.o = new sgw(2, newsEntry, u1c0Var);
            return;
        }
        if (i == i2) {
            ((u1c0) arrayList.get(i)).d = 6;
        } else if (i < i2) {
            ((u1c0) arrayList.get(i)).d = 2;
            ((u1c0) arrayList.get(i2)).d = 4;
        }
        if (!s1c0Var.k) {
        }
        if (i <= i2) {
        }
        G(i, i2, s1c0Var.J, arrayList);
        if (i <= i2) {
        }
        if (newsEntry instanceof DeprecatedStatisticInterface) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final gf7 C() {
        return (gf7) this.g.getValue();
    }

    public final z1n D() {
        return (z1n) this.q.getValue();
    }

    public final rp50 E() {
        return (rp50) this.s.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final h170 F() {
        return (h170) this.e.getValue();
    }

    public final void G(int i, int i2, boolean z, List list) {
        int size = list.size() - 1;
        if (i2 > size) {
            i2 = size;
        }
        if (i > i2) {
            return;
        }
        while (true) {
            ((u1c0) list.get(i)).i(this.h.b(i, list, z));
            ((u1c0) list.get(i)).b().bottom = k2c0.a(i, list);
            if (i == i2) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    public final void a(ArrayList arrayList, Carousel carousel) {
        int i = carousel.m;
        f9t f9tVar = this.t;
        if (i == 26) {
            if (!(carousel instanceof AppCarousel)) {
                if (carousel.getItems().isEmpty()) {
                    return;
                }
                k(false, carousel, arrayList);
                f9tVar.getClass();
                arrayList.add(f9t.k(carousel));
                return;
            }
            if (carousel.e && epx.f(carousel.f, bwy.a.a)) {
                k(true, carousel, arrayList);
                arrayList.add(A(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE, carousel));
                return;
            } else {
                k(carousel.e && !epx.f(carousel.f, bwy.b.a), carousel, arrayList);
                f9tVar.getClass();
                arrayList.add(f9t.k(carousel));
                return;
            }
        }
        if (i == 44) {
            ProductCarousel productCarousel = (ProductCarousel) carousel;
            if (!productCarousel.o.isEmpty() || productCarousel.e) {
                arrayList.add(C().a(carousel));
                if (carousel.e && epx.f(carousel.f, bwy.a.a)) {
                    arrayList.add(A(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE, carousel));
                    return;
                } else {
                    arrayList.add(new u1c0(165, carousel));
                    return;
                }
            }
            return;
        }
        if (i == 63) {
            if (!(carousel instanceof AppCarousel)) {
                if (carousel.getItems().isEmpty()) {
                    return;
                }
                k(false, carousel, arrayList);
                f9tVar.getClass();
                arrayList.add(f9t.l(carousel));
                return;
            }
            if (carousel.e && epx.f(carousel.f, bwy.a.a)) {
                k(true, carousel, arrayList);
                arrayList.add(A(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE, carousel));
                return;
            } else {
                k(carousel.e && !epx.f(carousel.f, bwy.b.a), carousel, arrayList);
                f9tVar.getClass();
                arrayList.add(f9t.l(carousel));
                return;
            }
        }
        switch (i) {
            case 36:
                if (!carousel.getItems().isEmpty()) {
                    arrayList.add(C().a(carousel));
                    arrayList.add(new u1c0(142, carousel));
                    arrayList.add(new u1c0(128, carousel));
                    break;
                }
                break;
            case 37:
                arrayList.add(C().a(carousel));
                if (!carousel.e || !epx.f(carousel.f, bwy.a.a)) {
                    arrayList.add(new u1c0(141, carousel));
                    break;
                } else {
                    arrayList.add(A(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE, carousel));
                    break;
                }
                break;
            case 38:
                if (!carousel.getItems().isEmpty()) {
                    arrayList.add(C().a(carousel));
                    arrayList.add(new u1c0(146, carousel));
                    arrayList.add(new u1c0(128, carousel));
                    break;
                }
                break;
            default:
                if (!carousel.getItems().isEmpty()) {
                    arrayList.add(new u1c0(383, carousel));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r1 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        C().getClass();
        r5.add(xsna.gf7.b(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003a, code lost:
    
        if (xsna.epx.f(r4.f, xsna.bwy.c.a) != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(NewsEntry newsEntry, ArrayList arrayList) {
        if (newsEntry instanceof ProfilesRecommendations) {
            ProfilesRecommendations profilesRecommendations = (ProfilesRecommendations) newsEntry;
            boolean z = epx.f(profilesRecommendations.f, bwy.c.a) || (epx.f(profilesRecommendations.f, bwy.d.a) && profilesRecommendations.l.isEmpty());
            if (profilesRecommendations.e) {
            }
            if (epx.f(newsEntry.f, bwy.a.a)) {
                arrayList.add(C().a(newsEntry));
                return;
            }
            C().getClass();
            u1c0 u1c0Var = new u1c0(259, newsEntry);
            u1c0Var.h = (ol60) j5g.a0(Collections.singletonList(new nyj0(newsEntry)));
            arrayList.add(u1c0Var);
            return;
        }
        if (newsEntry.e) {
        }
        if (epx.f(newsEntry.f, bwy.a.a)) {
        }
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void d(Post post, NewsEntry newsEntry, PostInteract postInteract, String str, ArrayList arrayList, s1c0 s1c0Var) {
        PostDonut.Paywall paywall;
        PostDonut.Snippet snippet;
        LinkButton linkButton;
        Action action;
        int i;
        int i2;
        u1c0 a;
        DocumentAttachment documentAttachment;
        String str2;
        PostDonut.Placeholder placeholder;
        LinkButton linkButton2;
        if (post.rc() && post.ic()) {
            u1c0 u1c0Var = new u1c0(1122, post);
            u1c0Var.h = (ol60) j5g.a0(Collections.singletonList(new yvl(post.o.c)));
            arrayList.add(u1c0Var);
            return;
        }
        if (!post.jc() || !post.Tb()) {
            if (post.Ub()) {
                arrayList.add(new u1c0(108, post));
                return;
            } else {
                this.m.q(post, newsEntry, postInteract, str, arrayList, s1c0Var);
                return;
            }
        }
        o3o o3oVar = (o3o) this.z.getValue();
        o3oVar.getClass();
        PostDonut postDonut = post.R;
        PollAttachment pollAttachment = null;
        String str3 = postDonut != null ? postDonut.k : null;
        if (str3 == null || str3.length() == 0) {
            arrayList.add(new u1c0(358, post));
            return;
        }
        a2o a2oVar = o3oVar.a;
        PostDonut postDonut2 = post.R;
        ArrayList<EntryAttachment> arrayList2 = post.z;
        if (postDonut2 == null || (placeholder = postDonut2.c) == null || (linkButton2 = placeholder.c) == null || (action = linkButton2.c) == null) {
            if (postDonut2 == null || (paywall = postDonut2.g) == null || (snippet = paywall.d) == null || (linkButton = snippet.e) == null) {
                return;
            } else {
                action = linkButton.c;
            }
        }
        r1o r1oVar = new r1o(post.m, post.n, action);
        if (arrayList2 == null || !arrayList2.isEmpty()) {
            Iterator<T> it = arrayList2.iterator();
            i = 0;
            while (it.hasNext()) {
                if ((((EntryAttachment) it.next()).b instanceof PhotoAttachment) && (i = i + 1) < 0) {
                    e43.s();
                    throw null;
                }
            }
        } else {
            i = 0;
        }
        if (arrayList2 == null || !arrayList2.isEmpty()) {
            Iterator<T> it2 = arrayList2.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                if ((((EntryAttachment) it2.next()).b instanceof VideoAttachment) && (i2 = i2 + 1) < 0) {
                    e43.s();
                    throw null;
                }
            }
        } else {
            i2 = 0;
        }
        if (i > 1) {
            a = new u1c0(post, newsEntry, 22);
            ol60 ol60Var = (ol60) j5g.a0(new yzn(a2oVar).a(0, new Pair<>(post, r1oVar), null));
            if (ol60Var != null) {
                a.h = ol60Var;
            }
        } else if (i == 1) {
            a = o3oVar.a(post, newsEntry, r1oVar);
        } else if (i2 == 1) {
            a = new u1c0(post, newsEntry, 24);
            ol60 ol60Var2 = (ol60) j5g.a0(new i5o(a2oVar).a(0, new Pair<>(post, r1oVar), null));
            if (ol60Var2 != null) {
                a.h = ol60Var2;
            }
        } else {
            a = o3oVar.a(post, newsEntry, r1oVar);
        }
        arrayList.add(a);
        String str4 = post.s;
        if (myc0.f(str4)) {
            u1c0 u1c0Var2 = new u1c0(post, newsEntry, 25);
            Pair pair = new Pair(str4, r1oVar);
            ol60 ol60Var3 = (ol60) j5g.a0(Collections.singletonList(new b4o((String) pair.d(), (r1o) pair.g())));
            if (ol60Var3 != null) {
                u1c0Var2.h = ol60Var3;
            }
            arrayList.add(u1c0Var2);
        }
        Iterator<T> it3 = arrayList2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                documentAttachment = null;
                break;
            }
            Attachment attachment = ((EntryAttachment) it3.next()).b;
            documentAttachment = attachment instanceof DocumentAttachment ? (DocumentAttachment) attachment : null;
            if (documentAttachment != null) {
                break;
            }
        }
        if (documentAttachment != null) {
            u1c0 u1c0Var3 = new u1c0(post, newsEntry, 27);
            Pair pair2 = new Pair(documentAttachment, r1oVar);
            ol60 ol60Var4 = (ol60) j5g.a0(Collections.singletonList(new ozn(((DocumentAttachment) pair2.d()).f, (r1o) pair2.g())));
            if (ol60Var4 != null) {
                u1c0Var3.h = ol60Var4;
            }
            arrayList.add(u1c0Var3);
        }
        Iterator<T> it4 = arrayList2.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            Attachment attachment2 = ((EntryAttachment) it4.next()).b;
            PollAttachment pollAttachment2 = attachment2 instanceof PollAttachment ? (PollAttachment) attachment2 : null;
            if (pollAttachment2 != null) {
                pollAttachment = pollAttachment2;
                break;
            }
        }
        if (pollAttachment != null) {
            u1c0 u1c0Var4 = new u1c0(post, newsEntry, 26);
            Pair pair3 = new Pair(pollAttachment, r1oVar);
            PollAttachment pollAttachment3 = (PollAttachment) pair3.d();
            r1o r1oVar2 = (r1o) pair3.g();
            Poll poll = pollAttachment3.f;
            ol60 ol60Var5 = (ol60) j5g.a0((poll == null || (str2 = poll.d) == null) ? EmptyList.b : Collections.singletonList(new g1o(str2, r1oVar2)));
            if (ol60Var5 != null) {
                u1c0Var4.h = ol60Var5;
            }
            arrayList.add(u1c0Var4);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void e(ShitAttachment shitAttachment, ArrayList arrayList, s1c0 s1c0Var) {
        ArrayList<ShitAttachment.Card> arrayList2 = shitAttachment.K;
        String str = shitAttachment.A;
        boolean z = arrayList2 == null || arrayList2.isEmpty();
        if (!drm0.N(str) && z) {
            iko0 iko0Var = new iko0(shitAttachment, shitAttachment, 178, true, false, new s1q(3, 0, 52), false, null);
            boolean z2 = s1c0Var.J;
            ej90 ej90Var = shitAttachment.L;
            iko0Var.h = (ol60) j5g.a0(Collections.singletonList(new cf0(str, ej90Var != null ? rte0.h(ej90Var, z2) : null, shitAttachment)));
            arrayList.add(iko0Var);
        }
        boolean z3 = shitAttachment.Hb() || shitAttachment.Gb();
        boolean z4 = ((Boolean) F().l.getValue()).booleanValue() && shitAttachment.Z != null;
        if (drm0.N(shitAttachment.B) || z3 || z4) {
            return;
        }
        arrayList.add(new u1c0(shitAttachment, shitAttachment, 307));
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x0397, code lost:
    
        if (r2.ic() != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x061b, code lost:
    
        if (r4.zb(android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) == true) goto L280;
     */
    /* JADX WARN: Removed duplicated region for block: B:165:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0282 A[LOOP:0: B:19:0x0282->B:26:0x02aa, LOOP_START, PHI: r13
      0x0282: PHI (r13v3 int) = (r13v2 int), (r13v4 int) binds: [B:18:0x0280, B:26:0x02aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02ad A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x026c  */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(NewsEntry newsEntry, s1c0 s1c0Var, String str, String str2, ArrayList arrayList, jzf0 jzf0Var, wm60 wm60Var) {
        String str3;
        Caption caption;
        Caption caption2;
        DebugInfo debugInfo;
        ArrayList arrayList2;
        s1c0 s1c0Var2;
        j jVar;
        PostInteract postInteract;
        PostInteract postInteract2;
        int i;
        DebugInfo debugInfo2;
        boolean z;
        boolean z2;
        ArrayList arrayList3;
        PostInteract postInteract3;
        ArrayList arrayList4;
        s1q s1qVar;
        VideoFile videoFile;
        int i2;
        int h;
        NewsEntry newsEntry2 = newsEntry;
        boolean z3 = s1c0Var.J;
        boolean z4 = true;
        if (newsEntry2.zb() != 22 || !((z = newsEntry2 instanceof FaveEntry))) {
            if (newsEntry2.d) {
                int size = arrayList.size();
                u1c0 u1c0Var = new u1c0(288, newsEntry2);
                u1c0Var.h = (ol60) j5g.a0(new atv0().x(newsEntry2, null));
                arrayList.add(u1c0Var);
                List<ol60> x = new e4v().x(newsEntry2, null);
                ArrayList arrayList5 = new ArrayList(c5g.u(x, 10));
                for (ol60 ol60Var : x) {
                    u1c0 u1c0Var2 = new u1c0(ol60Var.b, newsEntry2);
                    u1c0Var2.h = ol60Var;
                    arrayList5.add(u1c0Var2);
                }
                g5g.y(arrayList5, arrayList);
                if (!(newsEntry2 instanceof UxPollsEntry)) {
                    u1c0 u1c0Var3 = new u1c0(279, newsEntry2);
                    u1c0Var3.h = (ol60) j5g.a0(Collections.singletonList(new dwv(newsEntry2)));
                    arrayList.add(u1c0Var3);
                }
                B(arrayList, size, e43.h(arrayList), newsEntry2, s1c0Var, str2, PostInteract.Ab(str2, newsEntry2));
                return;
            }
            PostInteract Ab = PostInteract.Ab(str2, newsEntry2);
            int size2 = arrayList.size();
            ArrayList arrayList6 = wm60Var != null ? new ArrayList() : arrayList;
            int zb = newsEntry2.zb();
            if (zb != 1 && zb != 2 && zb != 5 && zb != 7 && zb != 9 && zb != 12 && zb != 14 && zb != 17 && zb != 22 && zb != 64) {
                if (zb == 0) {
                    if (newsEntry2 instanceof Post) {
                        Post post = (Post) newsEntry2;
                        if (post.rc()) {
                        }
                    }
                }
                ArrayList arrayList7 = arrayList6;
                n(newsEntry2, s1c0Var, str, str2, arrayList7, Ab, jzf0Var);
                debugInfo = newsEntry2.h;
                if (debugInfo != null && (debugInfo.b.length() != 0 || debugInfo.c.length() != 0)) {
                    u1c0 u1c0Var4 = new u1c0(403, newsEntry2);
                    debugInfo2 = newsEntry2.h;
                    if (debugInfo2 != null) {
                        throw new IllegalArgumentException("This NewsEntry doesn't have a debug info");
                    }
                    u1c0Var4.h = (ol60) j5g.a0(Collections.singletonList(new z5l(debugInfo2.b, debugInfo2.c)));
                    arrayList7.add(u1c0Var4);
                }
                if (s1c0Var.k) {
                    Post R = di60.R(newsEntry);
                    if (di60.p(R)) {
                        x(R, newsEntry, s1c0Var, str2, arrayList7);
                        jVar = this;
                        newsEntry2 = newsEntry;
                        s1c0Var2 = s1c0Var;
                        arrayList2 = arrayList7;
                    } else {
                        arrayList2 = arrayList7;
                        s1c0Var2 = s1c0Var;
                        jVar = this;
                        newsEntry2 = newsEntry;
                        if (di60.M(R)) {
                            if (R != null && R.ic()) {
                                u1c0 u1c0Var5 = new u1c0(1123, newsEntry2);
                                u1c0Var5.h = (ol60) j5g.a0(Collections.singletonList(new wvl(R, R.fc(), R.isReported())));
                                arrayList2.add(u1c0Var5);
                            } else if (R != null && rv60.a(R)) {
                                if (((b25) jVar.b.getValue()).a(R.p)) {
                                    arrayList2.add(new u1c0(10, newsEntry2));
                                } else {
                                    arrayList2.add(new u1c0(1115, newsEntry2));
                                }
                            }
                        } else if (di60.C(R)) {
                            if (R != null) {
                                arrayList2.add(new u1c0(366, newsEntry2));
                            }
                        } else if (R == null && di60.q(newsEntry2)) {
                            vfe vfeVar = jVar.j;
                            vfeVar.getClass();
                            u1c0 u1c0Var6 = new u1c0(1, newsEntry2);
                            u1c0Var6.h = (ol60) j5g.a0(new uy9((h170) vfeVar.b).l(0, new Triple(newsEntry2, newsEntry2, s1c0Var2)));
                            arrayList2.add(u1c0Var6);
                            EasyPromote c = na60.c(newsEntry2);
                            if (c != null && (i = c.b) != 2 && i != 0 && ((Boolean) jVar.D.getValue()).booleanValue()) {
                                p(newsEntry2, newsEntry2, arrayList2);
                            }
                        } else {
                            Post R2 = di60.R(newsEntry2);
                            if (R2 != null && R2.hc()) {
                                arrayList2.add(new p890(newsEntry2, newsEntry2, na60.a(newsEntry2)));
                            }
                        }
                    }
                    if (newsEntry2 instanceof ShitAttachment) {
                        ShitAttachment shitAttachment = (ShitAttachment) newsEntry2;
                        Feedback feedback = shitAttachment.g;
                        if (com.vk.toggle.b.A.a(Features.Type.FEATURE_SMB_ADAPTIVE_AD_NPS) && (feedback instanceof ButtonsFeedback) && !((ButtonsFeedback) feedback).e) {
                            u1c0 u1c0Var7 = new u1c0(shitAttachment, shitAttachment, 264);
                            u1c0Var7.e = false;
                            arrayList2.add(u1c0Var7);
                        }
                    } else if (newsEntry2 instanceof PromoPost) {
                        w(((PromoPost) newsEntry2).n, newsEntry2, arrayList2);
                    } else if (newsEntry2 instanceof FaveEntry) {
                        Object obj = ((FaveEntry) newsEntry2).i.f;
                        if (obj instanceof Post) {
                            w((NewsEntry) obj, newsEntry2, arrayList2);
                        } else {
                            w(newsEntry2, newsEntry2, arrayList2);
                        }
                    } else {
                        w(newsEntry2, newsEntry2, arrayList2);
                    }
                    postInteract = Ab;
                } else {
                    arrayList2 = arrayList7;
                    s1c0Var2 = s1c0Var;
                    jVar = this;
                    Post R3 = di60.R(newsEntry2);
                    boolean M = di60.M(newsEntry2);
                    Post R4 = di60.R(newsEntry2);
                    if (R4 == null || (r4 = R4.l) == null) {
                        postInteract = Ab;
                    } else {
                        postInteract = Ab;
                    }
                    z4 = false;
                    Post R5 = di60.R(newsEntry2);
                    boolean Ub = R5 != null ? R5.Ub() : false;
                    if (!M && !z4 && !Ub) {
                        arrayList2.add(new u1c0(73, newsEntry2));
                    } else if (R3 != null && M) {
                        t6g0 t6g0Var = t6g0.b;
                        if (t6g0.b().g0(R3.m)) {
                            arrayList2.add(new u1c0(1115, newsEntry2));
                        } else {
                            u1c0 u1c0Var8 = new u1c0(10, newsEntry2);
                            u1c0Var8.g = Boolean.TRUE;
                            arrayList2.add(u1c0Var8);
                        }
                    }
                }
                if (wm60Var == null) {
                    PostInteract postInteract4 = postInteract;
                    postInteract2 = postInteract4;
                    arrayList.addAll(wm60Var.c(arrayList2, new i170(newsEntry2, s1c0Var2, str, str2, postInteract4)));
                } else {
                    postInteract2 = postInteract;
                }
                jVar.B(arrayList, size2, e43.h(arrayList), newsEntry, s1c0Var, str2, postInteract2);
                return;
            }
            if (!z3 || !(newsEntry2 instanceof Videos) || !((Videos) newsEntry2).Ea()) {
                Post R6 = di60.R(newsEntry2);
                Caption caption3 = R6 != null ? R6.x : null;
                owu owuVar = this.i;
                if (caption3 != null || ((newsEntry2 instanceof Videos) && ((Videos) newsEntry2).p != null)) {
                    Post R7 = di60.R(newsEntry2);
                    if (R7 == null || (caption2 = R7.x) == null || (str3 = caption2.i) == null) {
                        Videos videos = newsEntry2 instanceof Videos ? (Videos) newsEntry2 : null;
                        str3 = (videos == null || (caption = videos.p) == null) ? null : caption.i;
                    }
                    boolean f = epx.f(str3, "post");
                    i2c0 i2c0Var = this.m;
                    if (!f) {
                        boolean z5 = di60.z(newsEntry2);
                        arrayList6.add(owuVar.b(newsEntry2, newsEntry2, s1c0Var));
                        if (z5) {
                            i2c0Var.getClass();
                            u1c0 u1c0Var9 = new u1c0(356, newsEntry2);
                            u1c0Var9.h = (ol60) j5g.Y(new bis().x(newsEntry2, null));
                            arrayList6.add(u1c0Var9);
                        }
                    } else if (s1c0Var.g) {
                        boolean z6 = di60.z(newsEntry2);
                        arrayList6.add(owuVar.b(newsEntry2, newsEntry2, s1c0Var));
                        if (z6) {
                            i2c0Var.getClass();
                            u1c0 u1c0Var10 = new u1c0(356, newsEntry2);
                            u1c0Var10.h = (ol60) j5g.Y(new bis().x(newsEntry2, null));
                            arrayList6.add(u1c0Var10);
                        }
                    } else {
                        arrayList6.add(owuVar.b(newsEntry2, newsEntry2, s1c0Var));
                    }
                } else {
                    arrayList6.add(owuVar.b(newsEntry2, newsEntry2, s1c0Var));
                }
            }
            ArrayList arrayList72 = arrayList6;
            n(newsEntry2, s1c0Var, str, str2, arrayList72, Ab, jzf0Var);
            debugInfo = newsEntry2.h;
            if (debugInfo != null) {
                u1c0 u1c0Var42 = new u1c0(403, newsEntry2);
                debugInfo2 = newsEntry2.h;
                if (debugInfo2 != null) {
                }
            }
            if (s1c0Var.k) {
            }
            if (wm60Var == null) {
            }
            jVar.B(arrayList, size2, e43.h(arrayList), newsEntry, s1c0Var, str2, postInteract2);
            return;
        }
        e eVar = (e) this.r.getValue();
        k2c0 k2c0Var = eVar.a;
        vfe vfeVar2 = eVar.d;
        PostInteract Ab2 = PostInteract.Ab(str2, newsEntry2);
        int zb2 = newsEntry2.zb();
        if (zb2 != 22 || !z) {
            L.l(tgw.b(zb2, "Unsupported type: ", " for fave list"));
            return;
        }
        int size3 = arrayList.size();
        FaveEntry faveEntry = (FaveEntry) newsEntry2;
        boolean z7 = faveEntry.j;
        gmq gmqVar = faveEntry.i.f;
        gnq.a.getClass();
        FaveType e = gnq.e(gmqVar);
        if (gmqVar instanceof Post) {
            Post post2 = (Post) gmqVar;
            eVar.a(faveEntry, arrayList, s1c0Var);
            z2 = z7;
            eVar.c.q(post2, faveEntry, Ab2, str, arrayList, s1c0Var);
            arrayList3 = arrayList;
            postInteract3 = Ab2;
            vfeVar2.getClass();
            u1c0 u1c0Var11 = new u1c0(post2, faveEntry, 1);
            u1c0Var11.h = (ol60) j5g.a0(new uy9((h170) vfeVar2.b).l(0, new Triple(post2, faveEntry, s1c0Var)));
            arrayList3.add(u1c0Var11);
            e.b(faveEntry, arrayList3);
        } else {
            z2 = z7;
            arrayList3 = arrayList;
            postInteract3 = Ab2;
            if (gmqVar instanceof ArticleAttachment) {
                ArticleAttachment articleAttachment = (ArticleAttachment) gmqVar;
                if (z2) {
                    arrayList3.add(e.c(faveEntry, 378));
                } else {
                    eVar.a(faveEntry, arrayList3, s1c0Var);
                    arrayList4 = arrayList;
                    arrayList4.addAll(eVar.c.o(Collections.singletonList(articleAttachment), faveEntry, faveEntry, str, postInteract3, s1c0Var));
                    arrayList4.add(vfeVar2.m(faveEntry, s1c0Var));
                    e.b(faveEntry, arrayList4);
                }
            } else {
                arrayList4 = arrayList3;
                if (gmqVar instanceof SnippetAttachment) {
                    SnippetAttachment snippetAttachment = (SnippetAttachment) gmqVar;
                    if (z2) {
                        arrayList4.add(e.c(faveEntry, 377));
                    } else {
                        if (snippetAttachment.Hb()) {
                            i2 = 402;
                        } else if (snippetAttachment.Db()) {
                            i2 = 390;
                        } else {
                            Product product = snippetAttachment.r;
                            i2 = (product == null || product.d != Merchant.ALIEXPRESS) ? (snippetAttachment.t || snippetAttachment.G == null) ? 382 : 376 : 384;
                        }
                        arrayList4.add(e.c(faveEntry, i2));
                        e.b(faveEntry, arrayList4);
                    }
                } else if (gmqVar instanceof PodcastAttachment) {
                    eVar.a(faveEntry, arrayList4, s1c0Var);
                    arrayList4.addAll(eVar.c.o(Collections.singletonList((PodcastAttachment) gmqVar), faveEntry, faveEntry, str, postInteract3, s1c0Var));
                    e.b(faveEntry, arrayList4);
                } else if (gmqVar instanceof VideoAttachment) {
                    VideoAttachment videoAttachment = (VideoAttachment) gmqVar;
                    if (z2) {
                        arrayList4.add(e.c(faveEntry, 379));
                    } else {
                        eVar.a(faveEntry, arrayList4, s1c0Var);
                        arrayList4.addAll(eVar.c.o(Collections.singletonList(videoAttachment), faveEntry, faveEntry, str, postInteract3, s1c0Var));
                        eVar.e.getClass();
                        VideoAttachment k = di60.k(faveEntry);
                        String j1 = (k == null || (videoFile = k.k) == null) ? null : videoFile.j1();
                        if (j1 != null && j1.length() != 0) {
                            boolean z8 = s1c0Var.k;
                            boolean z9 = !z8;
                            Object a0 = j5g.a0(new eks0().a(0, new Triple(faveEntry, faveEntry, new v1c0(faveEntry, faveEntry, str, null, null, z9))));
                            dio0 dio0Var = a0 instanceof dio0 ? (dio0) a0 : null;
                            if (dio0Var == null || (s1qVar = dio0Var.r) == null) {
                                s1qVar = new s1q(3, 2, 48);
                            }
                            iko0 iko0Var = new iko0(faveEntry, faveEntry, 2, z9, z8, s1qVar, false, null);
                            if (dio0Var != null) {
                                iko0Var.h = dio0Var;
                            }
                            arrayList4.add(iko0Var);
                        }
                        arrayList4.add(vfeVar2.m(faveEntry, s1c0Var));
                        e.b(faveEntry, arrayList4);
                    }
                } else if (gmqVar instanceof FaveMarketItem) {
                    FaveMarketItem faveMarketItem = (FaveMarketItem) gmqVar;
                    Good good = faveMarketItem.b;
                    if (z2) {
                        u1c0 c2 = e.c(faveEntry, 396);
                        c2.h = (ol60) j5g.a0(eVar.f.b(0, new Pair<>(faveMarketItem, faveEntry), null));
                        arrayList4.add(c2);
                    } else if (good.Cb()) {
                        eVar.a(faveEntry, arrayList4, s1c0Var);
                        arrayList4.add(e.c(faveEntry, 393));
                    } else {
                        int i3 = good.V ? 374 : 373;
                        eVar.a(faveEntry, arrayList4, s1c0Var);
                        arrayList4.add(e.c(faveEntry, i3));
                        e.b(faveEntry, arrayList4);
                    }
                } else if (gmqVar instanceof Narrative) {
                    if (z2) {
                        arrayList4.add(e.c(faveEntry, 381));
                    } else {
                        eVar.a(faveEntry, arrayList4, s1c0Var);
                        arrayList4.add(e.c(faveEntry, 77));
                        e.b(faveEntry, arrayList4);
                    }
                }
            }
            h = e43.h(arrayList4);
            if (z2 || e == FaveType.POST || e == FaveType.PODCAST) {
                if (size3 != h) {
                    ((u1c0) arrayList4.get(size3)).d = 6;
                } else if (size3 < h) {
                    ((u1c0) arrayList4.get(size3)).d = 2;
                    ((u1c0) arrayList4.get(h)).d = 4;
                }
            }
            if (size3 <= h) {
                return;
            }
            while (true) {
                u1c0 u1c0Var12 = (u1c0) arrayList4.get(size3);
                if (u1c0Var12.l == null) {
                    u1c0Var12.l = str2;
                }
                u1c0Var12.m = postInteract3;
                u1c0Var12.n = s1c0Var;
                if (u1c0Var12.j == null) {
                    u1c0Var12.i(k2c0Var.b(size3, arrayList4, z3));
                    u1c0Var12.b().bottom = k2c0.a(size3, arrayList4);
                }
                if (size3 == h) {
                    return;
                } else {
                    size3++;
                }
            }
        }
        arrayList4 = arrayList3;
        h = e43.h(arrayList4);
        if (z2) {
        }
        if (size3 != h) {
        }
        if (size3 <= h) {
        }
    }

    public final void k(boolean z, Carousel carousel, ArrayList arrayList) {
        if (!z) {
            arrayList.add(C().a(carousel));
        } else {
            C().getClass();
            arrayList.add(gf7.b(carousel));
        }
    }

    public final void l(ChannelsRecommendations channelsRecommendations, ArrayList arrayList) {
        c(channelsRecommendations, arrayList);
        if (channelsRecommendations.e && epx.f(channelsRecommendations.f, bwy.a.a)) {
            arrayList.add(A(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE, channelsRecommendations));
            return;
        }
        ((ze7) this.p.getValue()).getClass();
        u1c0 u1c0Var = new u1c0(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, channelsRecommendations);
        u1c0Var.h = (ol60) j5g.a0(Collections.singletonList(new ucf0(channelsRecommendations, channelsRecommendations.e, channelsRecommendations.f, channelsRecommendations.l)));
        arrayList.add(u1c0Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void m(ClipsEntry clipsEntry, ArrayList arrayList) {
        u1c0 u1c0Var;
        String str;
        if (((Boolean) this.B.getValue()).booleanValue() && ((clipsEntry.o || clipsEntry.p) && ((str = clipsEntry.i) == null || str.length() == 0))) {
            C().getClass();
            arrayList.add(gf7.b(clipsEntry));
        } else {
            arrayList.add(C().a(clipsEntry));
        }
        boolean z = clipsEntry.o;
        String str2 = clipsEntry.l;
        n34 n34Var = this.A;
        if (z) {
            n34Var.getClass();
            u1c0Var = new u1c0(291, clipsEntry);
            u1c0Var.h = (ol60) j5g.a0(Collections.singletonList(new wjd(291, clipsEntry, clipsEntry.e, str2)));
        } else if (clipsEntry.p) {
            n34Var.getClass();
            u1c0Var = new u1c0(363, clipsEntry);
            u1c0Var.h = (ol60) j5g.a0(Collections.singletonList(new wjd(363, clipsEntry, clipsEntry.e, str2)));
        } else if (clipsEntry.q) {
            n34Var.getClass();
            u1c0Var = new u1c0(370, clipsEntry);
            u1c0Var.h = (ol60) j5g.a0(Collections.singletonList(new wjd(370, clipsEntry, clipsEntry.e, str2)));
        } else {
            n34Var.getClass();
            u1c0Var = new u1c0(Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, clipsEntry);
            u1c0Var.h = (ol60) j5g.a0(Collections.singletonList(new wjd(Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, clipsEntry, clipsEntry.e, str2)));
        }
        arrayList.add(u1c0Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(11:213|(1:214)|(2:216|(1:218)(3:222|223|221))|225|226|227|228|229|230|223|221) */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x04a0, code lost:
    
        if (r4 != 353) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x04a2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x04da, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x04db, code lost:
    
        r2 = r52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x04dc, code lost:
    
        com.vk.metrics.eventtracking.b.a.a(r0);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:174:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x07b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:429:0x09ed  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0a65  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0abb  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0b06  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0b0c  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0797  */
    /* JADX WARN: Type inference failed for: r0v193, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(NewsEntry newsEntry, s1c0 s1c0Var, String str, String str2, ArrayList<u1c0> arrayList, PostInteract postInteract, jzf0 jzf0Var) {
        int i;
        boolean z;
        boolean z2;
        bp50 bp50Var;
        boolean z3;
        zu50 zu50Var;
        boolean z4;
        Collection<? extends u1c0> collection;
        wjz0 content;
        ArrayList arrayList2;
        u1c0 u1c0Var;
        wjz0 content2;
        u1c0 u1c0Var2;
        u1c0 u1c0Var3;
        List list;
        u1c0 u1c0Var4;
        u1c0 u1c0Var5;
        ol60 ol60Var;
        String str3;
        ArrayList<u1c0> arrayList3;
        s1c0 s1c0Var2;
        u1c0 b;
        u1c0 b2;
        Photos photos;
        ArrayList<EntryAttachment> arrayList4;
        ArrayList<u1c0> arrayList5;
        s1c0 s1c0Var3;
        PhotoAttachment Mb;
        Photo photo;
        PromoPost promoPost;
        ArrayList<u1c0> arrayList6;
        if (newsEntry instanceof UxPollsEntry) {
            UxPollsEntry uxPollsEntry = (UxPollsEntry) newsEntry;
            blq0 blq0Var = l4r0.a;
            if (l4r0.a(uxPollsEntry.i)) {
                u1c0 u1c0Var6 = new u1c0(296, uxPollsEntry);
                u1c0Var6.h = (ol60) j5g.Y(Collections.singletonList(new sr9(o25.b(o25.a()) ? y8g0.e(R.string.ux_polls_sferum_title) : y8g0.e(R.string.ux_polls_title), false, "", "", false, true, false, true, null, uxPollsEntry)));
                arrayList.add(u1c0Var6);
                arrayList.add(new u1c0(Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, uxPollsEntry));
                return;
            }
            return;
        }
        if (newsEntry instanceof Post) {
            Post post = (Post) newsEntry;
            d(post, post, postInteract, str, arrayList, s1c0Var);
            return;
        }
        int i2 = 2;
        if (newsEntry instanceof PromoPost) {
            PromoPost promoPost2 = (PromoPost) newsEntry;
            boolean a = com.vk.toggle.b.A.a(Features.Type.FEATURE_SMB_AD_DISCLAIMER_REDESIGN);
            Post R = di60.R(promoPost2);
            if (R != null) {
                this.m.q(R, promoPost2, postInteract, str, arrayList, s1c0Var);
                promoPost = promoPost2;
                arrayList6 = arrayList;
            } else {
                promoPost = promoPost2;
                arrayList6 = arrayList;
            }
            boolean z5 = promoPost.A != null && a;
            fw00 fw00Var = new fw00(arrayList6, promoPost, this, i2);
            if (myc0.f(promoPost.q)) {
                if (z5 && ((Boolean) fw00Var.invoke()).booleanValue()) {
                    return;
                }
                arrayList6.add(new u1c0(21, promoPost));
                return;
            }
            return;
        }
        boolean z6 = newsEntry instanceof Photos;
        ?? r3 = this.l;
        i2c0 i2c0Var = this.m;
        if (z6) {
            Photos photos2 = (Photos) newsEntry;
            int i3 = photos2.l;
            ArrayList<EntryAttachment> arrayList7 = photos2.q;
            boolean z7 = i3 == 7;
            PhotoAttachment Mb2 = photos2.Mb();
            if (arrayList7.size() <= 1 || !z7 || Mb2 == null) {
                photos = photos2;
                arrayList4 = arrayList7;
                this.m.e(arrayList, photos.q, photos, photos, str, postInteract, s1c0Var);
            } else {
                Mb2.b = true;
                a6a0 a6a0Var = (a6a0) r3.getValue();
                vp10 vp10Var = new vp10(photos2, photos2, Mb2, 50, 0, EmptyList.b, s1c0Var.q);
                photos = photos2;
                a6a0Var.getClass();
                arrayList.add(a6a0.c(vp10Var));
                if (!s1c0Var.k) {
                    vfe vfeVar = this.j;
                    vfeVar.getClass();
                    u1c0 u1c0Var7 = new u1c0(1, photos);
                    u1c0Var7.h = (ol60) j5g.a0(new up70(new pa2((h170) vfeVar.b)).a(0, new Triple(photos, photos, s1c0Var)));
                    arrayList.add(u1c0Var7);
                }
                arrayList4 = arrayList7;
            }
            i2c0Var.getClass();
            if (s1c0Var.b()) {
                Photos photos3 = photos;
                i2c0Var.e(arrayList, photos3.Gb(), photos3, photos3, str, postInteract, s1c0Var);
                arrayList5 = arrayList;
                photos = photos3;
                s1c0Var3 = s1c0Var;
            } else {
                i2c0Var.c(arrayList, photos, photos, str, postInteract, s1c0Var);
                s1c0Var3 = s1c0Var;
                arrayList5 = arrayList;
            }
            boolean z8 = s1c0Var3.k;
            if (z7 && arrayList4.size() > 1 && !z8) {
                arrayList5.add(new u1c0(159, photos));
            }
            if (!z8 || (Mb = photos.Mb()) == null || (photo = Mb.l) == null || photo.z == -9000.0d || photo.A == -9000.0d) {
                return;
            }
            u1c0 r74Var = new r74(33, new GeoAttachment(photo.z, photo.A, "", photo.w, -9000, null, 0), photos, photos);
            r74Var.n = s1c0Var3;
            arrayList5.add(r74Var);
            return;
        }
        s1c0 s1c0Var4 = s1c0Var;
        ol60 ol60Var2 = null;
        if (newsEntry instanceof Videos) {
            Videos videos = (Videos) newsEntry;
            if (postInteract == null || (str3 = postInteract.b) == null) {
                str3 = str;
            }
            String str4 = videos.s;
            boolean f = epx.f(str4, "videos_for_you");
            bpn0 bpn0Var = this.x;
            if (f) {
                u5t0 u5t0Var = (u5t0) bpn0Var.getValue();
                gf7 gf7Var = u5t0Var.a;
                Attachment R1 = videos.R1();
                if (R1 == null) {
                    gf7Var.getClass();
                    arrayList.add(gf7.b(videos));
                    u1c0 u1c0Var8 = new u1c0(Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE, videos);
                    u1c0Var8.h = (ol60) j5g.a0(Collections.singletonList(new d6n0(videos)));
                    arrayList.add(u1c0Var8);
                    return;
                }
                arrayList.add(gf7Var.a(videos));
                if (R1 instanceof VideoAttachment) {
                    b6n0 b6n0Var = u5t0Var.b;
                    VideoAttachment videoAttachment = (VideoAttachment) R1;
                    b6n0Var.getClass();
                    u1c0 r74Var2 = new r74(Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE, videoAttachment, videos, videos);
                    kly klyVar = b6n0Var.a;
                    VideoFile videoFile = videoAttachment.k;
                    r74Var2.h = (ol60) j5g.a0(Collections.singletonList(new a6n0(videos, videos, alk.G(videos, videos, videoAttachment), videoFile, videoFile.getTitle(), ((g7s0) klyVar.b).c(videoFile), Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE)));
                    arrayList.add(r74Var2);
                    return;
                }
                return;
            }
            if (epx.f(str4, "video_postcard")) {
                u5t0 u5t0Var2 = (u5t0) bpn0Var.getValue();
                u5t0Var2.getClass();
                Attachment R12 = videos.R1();
                if (R12 == null) {
                    return;
                }
                arrayList.add(u5t0Var2.a.a(videos));
                u1c0 r74Var3 = new r74(58, R12, videos, videos);
                if (R12 instanceof VideoAttachment) {
                    try {
                        ol60Var2 = (ol60) j5g.a0(Collections.singletonList(new g4s0(videos, videos, alk.G(videos, videos, (VideoAttachment) R12), 58)));
                    } catch (Throwable th) {
                        com.vk.metrics.eventtracking.b.a.a(th);
                    }
                    r74Var3.h = ol60Var2;
                }
                arrayList.add(r74Var3);
                if (videos.w != null) {
                    arrayList.add(new u1c0(182, videos));
                    return;
                }
                return;
            }
            String str5 = str3;
            this.m.e(arrayList, videos.o, videos, videos, str5, postInteract, s1c0Var);
            i2c0Var.getClass();
            if (s1c0Var.b()) {
                i2c0Var.e(arrayList, videos.Gb(), videos, videos, str5, postInteract, s1c0Var);
                arrayList3 = arrayList;
                videos = videos;
                str5 = str5;
                s1c0Var2 = s1c0Var;
            } else {
                i2c0Var.c(arrayList, videos, videos, str5, postInteract, s1c0Var);
                s1c0Var2 = s1c0Var;
                arrayList3 = arrayList;
            }
            if (videos.Ea()) {
                b(videos, arrayList3, s1c0Var2);
            }
            ArrayList<EntryAttachment> arrayList8 = videos.o;
            ydo0 ydo0Var = this.n;
            if (arrayList8 != null && arrayList8.size() == 1 && di60.J(videos) && (b2 = ydo0Var.b(videos, str5, s1c0Var2)) != null) {
                arrayList3.add(b2);
            }
            if (((Boolean) F().q.getValue()).booleanValue() && s1c0Var2.D && di60.L(videos) && !di60.J(videos) && (b = ydo0Var.b(videos, str5, s1c0Var2)) != null) {
                arrayList3.add(b);
                return;
            }
            return;
        }
        boolean z9 = newsEntry instanceof ShitAttachment;
        owu owuVar = this.i;
        if (z9) {
            ShitAttachment shitAttachment = (ShitAttachment) newsEntry;
            ArrayList<ShitAttachment.Card> arrayList9 = shitAttachment.K;
            if (shitAttachment.Y != null) {
                SmbAdFeatures smbAdFeatures = SmbAdFeatures.FEATURE_SMB_LEAD_ADS;
                smbAdFeatures.getClass();
                if (com.vk.toggle.b.A.a(smbAdFeatures)) {
                    arrayList.add(owuVar.b(shitAttachment, shitAttachment, s1c0Var4));
                    arrayList.add(new u1c0(340, shitAttachment));
                    e(shitAttachment, arrayList, s1c0Var4);
                    return;
                }
            }
            if (arrayList9 != null && !arrayList9.isEmpty()) {
                if (arrayList9.isEmpty()) {
                    return;
                }
                if (((ShitAttachment.Card) j5g.Y(arrayList9)).r) {
                    arrayList.add(owuVar.b(shitAttachment, shitAttachment, s1c0Var4));
                    u1c0 u1c0Var9 = new u1c0(8, shitAttachment);
                    u1c0Var9.h = (ol60) j5g.a0(new id0().a(0, new Pair<>(arrayList9, shitAttachment), null));
                    arrayList.add(u1c0Var9);
                    e(shitAttachment, arrayList, s1c0Var4);
                    return;
                }
                arrayList.add(owuVar.b(shitAttachment, shitAttachment, s1c0Var4));
                u1c0 u1c0Var10 = new u1c0(15, shitAttachment);
                u1c0Var10.h = (ol60) j5g.a0(new id0().a(0, new Pair<>(arrayList9, shitAttachment), null));
                arrayList.add(u1c0Var10);
                e(shitAttachment, arrayList, s1c0Var4);
                return;
            }
            arrayList.add(owuVar.b(shitAttachment, shitAttachment, s1c0Var4));
            PhotoAttachment photoAttachment = shitAttachment.H;
            VideoAttachment videoAttachment2 = shitAttachment.I;
            if (photoAttachment != null) {
                a6a0 a6a0Var2 = (a6a0) r3.getValue();
                vp10 vp10Var2 = new vp10(shitAttachment, shitAttachment, photoAttachment, 50, 0, EmptyList.b, s1c0Var4.q);
                a6a0Var2.getClass();
                u1c0Var4 = a6a0.c(vp10Var2);
                u1c0Var5 = null;
            } else if (videoAttachment2 != null) {
                ArrayList arrayList10 = new ArrayList();
                ShitAttachment shitAttachment2 = videoAttachment2.h;
                if (epx.f(shitAttachment2 != null ? shitAttachment2.k : null, "site")) {
                    videoAttachment2.Lb("ad", postInteract, null);
                    arrayList10.add(new r74(71, videoAttachment2, shitAttachment, shitAttachment));
                } else {
                    videoAttachment2.Lb(str, postInteract, null);
                    this.u.getClass();
                    int a2 = qen.a(videoAttachment2, shitAttachment, s1c0Var4, false);
                    r74 r74Var4 = new r74(a2, videoAttachment2, shitAttachment, shitAttachment);
                    this.w.getClass();
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (a2 != 59) {
                        if (a2 == 220) {
                            ol60Var = (ol60) j5g.a0(new cdi().L(0, new Triple(shitAttachment, videoAttachment2, Integer.valueOf(a2))));
                            r74Var4.h = ol60Var;
                            arrayList10.add(i2c0Var.p(r74Var4, s1c0Var4));
                        }
                    }
                    s1c0Var4 = s1c0Var;
                    ol60Var = (ol60) j5g.a0(new dd80(9).j(new p3s0(shitAttachment, shitAttachment, videoAttachment2, a2, s1c0Var)));
                    r74Var4.h = ol60Var;
                    arrayList10.add(i2c0Var.p(r74Var4, s1c0Var4));
                }
                u1c0Var5 = (u1c0) j5g.a0(arrayList10);
                u1c0Var4 = null;
            } else {
                u1c0Var4 = null;
                u1c0Var5 = null;
            }
            ArrayList arrayList11 = new ArrayList();
            ArrayList arrayList12 = new ArrayList();
            ArrayList arrayList13 = new ArrayList();
            if (!shitAttachment.Hb()) {
                com.vk.toggle.data.a a3 = F().a();
                if ((a3 != null ? a3.c : null) != null) {
                    u1c0 u1c0Var11 = new u1c0(Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR_VALUE, shitAttachment);
                    u1c0Var11.h = (ol60) j5g.a0(new skd().x(shitAttachment, null));
                    arrayList11.add(u1c0Var11);
                } else {
                    arrayList11.add(new u1c0(301, shitAttachment));
                }
            } else if (!shitAttachment.Gb()) {
                com.vk.toggle.data.a a4 = F().a();
                if ((a4 != null ? a4.c : null) != null) {
                    u1c0 u1c0Var12 = new u1c0(Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR_VALUE, shitAttachment);
                    u1c0Var12.h = (ol60) j5g.a0(new skd().x(shitAttachment, null));
                    arrayList12.add(u1c0Var12);
                } else {
                    arrayList12.add(new u1c0(14, shitAttachment));
                }
            } else if (shitAttachment.Gb()) {
                b(shitAttachment, arrayList13, s1c0Var4);
            }
            if (u1c0Var4 != null) {
                arrayList.add(u1c0Var4);
            }
            if (u1c0Var5 != null) {
                arrayList.add(u1c0Var5);
            }
            arrayList.addAll(arrayList11);
            arrayList.addAll(arrayList12);
            arrayList.addAll(arrayList13);
            ArrayList arrayList14 = new ArrayList();
            e(shitAttachment, arrayList14, s1c0Var4);
            if (arrayList14.isEmpty()) {
                if (shitAttachment.Gb()) {
                    arrayList.add(new p890(shitAttachment, shitAttachment, cn70.b(4)));
                }
                arrayList.addAll(arrayList14);
                return;
            }
            return;
        }
        if (newsEntry instanceof OptionalNativeAdEntry) {
            OptionalNativeAdEntry optionalNativeAdEntry = (OptionalNativeAdEntry) newsEntry;
            boolean z10 = optionalNativeAdEntry.e;
            x9v0 x9v0Var = optionalNativeAdEntry.m;
            if (z10 && x9v0Var == null) {
                u1c0 u1c0Var13 = new u1c0(360, optionalNativeAdEntry);
                u1c0Var13.h = new tyj0(360, optionalNativeAdEntry);
                arrayList.add(u1c0Var13);
                return;
            }
            if (x9v0Var != null) {
                u1c0 u1c0Var14 = new u1c0(359, optionalNativeAdEntry);
                x9v0 x9v0Var2 = optionalNativeAdEntry.m;
                if (x9v0Var2 == null) {
                    list = EmptyList.b;
                } else {
                    Integer num = optionalNativeAdEntry.k;
                    if (num != null) {
                        int intValue = num.intValue();
                        String e = y8g0.e(R.string.feed_optional_ad_subtitle_prefix);
                        NewsEntry.TrackData trackData = optionalNativeAdEntry.n;
                        list = Collections.singletonList(new vt80(x9v0Var2, e, null, null, optionalNativeAdEntry, new vt80.a(trackData.c, trackData.b, intValue)));
                    } else {
                        list = EmptyList.b;
                    }
                }
                u1c0Var14.h = (ol60) j5g.a0(list);
                arrayList.add(u1c0Var14);
                return;
            }
            return;
        }
        if (newsEntry instanceof YandexNativeAdEntry) {
            YandexNativeAdEntry yandexNativeAdEntry = (YandexNativeAdEntry) newsEntry;
            boolean z11 = yandexNativeAdEntry.e;
            z4y0 z4y0Var = yandexNativeAdEntry.k;
            if (z11 && z4y0Var == null) {
                u1c0 u1c0Var15 = new u1c0(InterfaceC4413l1.a.b.g, yandexNativeAdEntry);
                u1c0Var15.h = new tyj0(InterfaceC4413l1.a.b.g, yandexNativeAdEntry);
                arrayList.add(u1c0Var15);
                return;
            }
            if (z4y0Var != null) {
                boolean z12 = s1c0Var4.k;
                boolean z13 = !z12;
                u1c0 u1c0Var16 = new u1c0(InterfaceC4413l1.a.b.f, yandexNativeAdEntry);
                bwn bwnVar = new bwn();
                x4y0.a aVar = new x4y0.a(yandexNativeAdEntry, yandexNativeAdEntry, s1c0Var4.J, new v1c0(yandexNativeAdEntry, yandexNativeAdEntry, str, null, null, z13));
                FontFamily fontFamily = FontFamily.REGULAR;
                float e2 = cn70.e() * 2.25f;
                float a5 = cn70.a() * 4.0f;
                int b3 = cn70.b(8);
                YandexNativeAdEntry yandexNativeAdEntry2 = aVar.a;
                z4y0 z4y0Var2 = yandexNativeAdEntry2.k;
                String b4 = z4y0Var2 != null ? z4y0Var2.b() : null;
                if (b4 == null) {
                    b4 = "";
                }
                s1q s1qVar = new s1q(3, 0, 52);
                ej90 b5 = ej90.a.b(b4, null, 6);
                boolean z14 = aVar.c;
                boolean E = ad0.E(yandexNativeAdEntry2);
                NewsEntry newsEntry2 = aVar.b;
                Object a0 = j5g.a0(Collections.singletonList(new dio0(yandexNativeAdEntry2, newsEntry2, false, z14, aVar.d, b4, new fj90(rte0.h(b5, z14)), fontFamily, false, 15.0f, s1qVar, true, (int) a5, b3, e2, 1.0f, E, ad0.v(yandexNativeAdEntry2, newsEntry2), ad0.A(yandexNativeAdEntry2, newsEntry2), EmptyList.b, null, "", false)));
                dio0 dio0Var = a0 instanceof dio0 ? (dio0) a0 : null;
                iko0 iko0Var = new iko0(yandexNativeAdEntry, yandexNativeAdEntry, 2, z13, z12, dio0Var != null ? dio0Var.r : null, false);
                iko0Var.h = dio0Var;
                u1c0Var16.h = (ol60) j5g.a0(new i5y0(bwnVar, iko0Var).a(yandexNativeAdEntry));
                arrayList.add(u1c0Var16);
                return;
            }
            return;
        }
        if (!(newsEntry instanceof MyTargetNativeAdEntry)) {
            if (newsEntry instanceof Html5Entry) {
                Html5Entry html5Entry = (Html5Entry) newsEntry;
                arrayList.add(owuVar.b(html5Entry, html5Entry, s1c0Var4));
                arrayList.add(new u1c0(102, html5Entry));
                return;
            }
            if (newsEntry instanceof ProfilesRecommendations) {
                ProfilesRecommendations profilesRecommendations = (ProfilesRecommendations) newsEntry;
                if (!profilesRecommendations.l.isEmpty() || profilesRecommendations.e) {
                    c(profilesRecommendations, arrayList);
                    if (profilesRecommendations.e && epx.f(profilesRecommendations.f, bwy.a.a)) {
                        arrayList.add(A(Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE, profilesRecommendations));
                        return;
                    }
                    l1e0 l1e0Var = (l1e0) this.y.getValue();
                    l1e0Var.getClass();
                    u1c0 u1c0Var17 = new u1c0(13, profilesRecommendations);
                    u1c0Var17.h = (ol60) j5g.a0(l1e0Var.a.a(profilesRecommendations));
                    arrayList.add(u1c0Var17);
                    return;
                }
                return;
            }
            if (newsEntry instanceof Digest) {
                ((zxm) this.o.getValue()).a((Digest) newsEntry, new i170(newsEntry, s1c0Var4, str, str2, postInteract), arrayList, s1c0Var4);
                return;
            }
            boolean z15 = newsEntry instanceof DzenNews;
            ?? r4 = this.k;
            if (z15) {
                DzenNews dzenNews = (DzenNews) newsEntry;
                List<DzenNewsItem> list2 = dzenNews.j;
                if (list2.isEmpty()) {
                    return;
                }
                if (!dzenNews.i.f) {
                    arrayList.add(new u1c0(PsExtractor.VIDEO_STREAM_MASK, dzenNews));
                }
                int i4 = dzenNews.k;
                int size = list2.size();
                if (i4 > size) {
                    i4 = size;
                }
                for (int i5 = 0; i5 < i4; i5++) {
                    if (i5 != 0) {
                        arrayList.add(new p890(dzenNews, dzenNews, cn70.b(4), 17));
                    }
                    ((pto) r4.getValue()).getClass();
                    u1c0 u1c0Var18 = new u1c0(241, dzenNews);
                    u1c0Var18.f = i5;
                    u1c0Var18.h = (ol60) j5g.a0(new tto(i5).a(dzenNews));
                    arrayList.add(u1c0Var18);
                }
                arrayList.add(new p890(dzenNews, dzenNews, cn70.b(4), 17));
                boolean z16 = list2.size() <= i4;
                dzenNews.q = z16;
                if (z16 && dzenNews.n == null) {
                    return;
                }
                arrayList.add(new u1c0(242, dzenNews));
                return;
            }
            if (newsEntry instanceof DzenStory) {
                DzenStory dzenStory = (DzenStory) newsEntry;
                String str6 = dzenStory.i.c;
                if (str6 != null && str6.length() != 0) {
                    arrayList.add(new u1c0(PsExtractor.VIDEO_STREAM_MASK, dzenStory));
                    arrayList.add(new p890(dzenStory, dzenStory, cn70.b(6), 17));
                    if (!s1c0Var4.J) {
                        arrayList.add(new p890(dzenStory, dzenStory, cn70.b(4), atv0.b));
                    }
                }
                List<DzenStory.DzenStoryItem> list3 = dzenStory.j;
                if (list3.isEmpty()) {
                    return;
                }
                int size2 = list3.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    ((pto) r4.getValue()).getClass();
                    u1c0 u1c0Var19 = new u1c0(243, dzenStory);
                    u1c0Var19.f = i6;
                    u1c0Var19.h = (ol60) j5g.a0(new wto(i6).a(new wto.a(dzenStory, s1c0Var4)));
                    arrayList.add(u1c0Var19);
                }
                arrayList.add(new p890(dzenStory, dzenStory, cn70.b(8), 17));
                return;
            }
            if (newsEntry instanceof InfoBlock) {
                arrayList.add(new u1c0(265, (InfoBlock) newsEntry));
                return;
            }
            if (newsEntry instanceof EntryPoints) {
                q((EntryPoints) newsEntry, arrayList);
                return;
            }
            if (newsEntry instanceof LatestNews) {
                v((LatestNews) newsEntry, arrayList);
                return;
            }
            if (newsEntry instanceof Carousel) {
                a(arrayList, (Carousel) newsEntry);
                return;
            }
            if (newsEntry instanceof PromoButton) {
                u1c0 u1c0Var20 = new u1c0(32, (PromoButton) newsEntry);
                u1c0Var20.l = str;
                arrayList.add(u1c0Var20);
                return;
            }
            if (newsEntry instanceof FeedbackPoll) {
                u1c0 u1c0Var21 = new u1c0(100, (FeedbackPoll) newsEntry);
                u1c0Var21.e = false;
                arrayList.add(u1c0Var21);
                return;
            }
            if (newsEntry instanceof AnimatedBlockEntry) {
                j((AnimatedBlockEntry) newsEntry, arrayList);
                return;
            }
            if (newsEntry instanceof ClipsEntry) {
                m((ClipsEntry) newsEntry, arrayList);
                return;
            }
            if (newsEntry instanceof DzenArticlesBlock) {
                o((DzenArticlesBlock) newsEntry, arrayList);
                return;
            }
            if (newsEntry instanceof GroupsSuggestions) {
                s((GroupsSuggestions) newsEntry, arrayList);
                return;
            }
            if (newsEntry instanceof ChannelsRecommendations) {
                l((ChannelsRecommendations) newsEntry, arrayList);
                return;
            }
            if (newsEntry instanceof RecommendedMiniAppEntry) {
                y((RecommendedMiniAppEntry) newsEntry, arrayList);
                return;
            }
            if (newsEntry instanceof ExpertCard) {
                r((ExpertCard) newsEntry, arrayList);
                return;
            } else if (newsEntry instanceof DiscoverMediaBlock) {
                D().a((DiscoverMediaBlock) newsEntry, new i170(newsEntry, s1c0Var4, str, str2, postInteract), jzf0Var, arrayList);
                return;
            } else {
                if (newsEntry instanceof InterestingStoriesEntry) {
                    z((InterestingStoriesEntry) newsEntry, arrayList);
                    return;
                }
                return;
            }
        }
        MyTargetNativeAdEntry myTargetNativeAdEntry = (MyTargetNativeAdEntry) newsEntry;
        String str7 = myTargetNativeAdEntry.o;
        bp50 bp50Var2 = myTargetNativeAdEntry.A;
        zu50 zu50Var2 = myTargetNativeAdEntry.z;
        String str8 = myTargetNativeAdEntry.p;
        gjx gjxVar = myTargetNativeAdEntry.B;
        if (epx.f(str7, "static")) {
            i = 3;
            if (com.vk.toggle.b.A.a(FeedFeatures.ADS_SDK_INTERNAL_NATIVE_AD_STATIC_MULTIPART_HOLDER)) {
                z = true;
                if (epx.f(str7, "video")) {
                    com.vk.toggle.b bVar = com.vk.toggle.b.A;
                    if (bVar.a(FeedFeatures.ADS_SDK_INTERNAL_NATIVE_AD_VIDEO) && bVar.a(FeedFeatures.ADS_SDK_INTERNAL_NATIVE_AD_VIDEO_MULTIPART_HOLDER)) {
                        z2 = true;
                        if (epx.f(str7, "carousel")) {
                            bp50Var = bp50Var2;
                            if (com.vk.toggle.b.A.a(FeedFeatures.ADS_SDK_INTERNAL_NATIVE_AD_CAROUSEL_MULTIPART_HOLDER)) {
                                z3 = true;
                                boolean z17 = z3;
                                if (epx.f(str7, "bls")) {
                                    zu50Var = zu50Var2;
                                } else {
                                    zu50Var = zu50Var2;
                                    if (com.vk.toggle.b.A.a(FeedFeatures.ADS_SDK_INTERNAL_NATIVE_AD_BLS)) {
                                        z4 = true;
                                        if (z && !z2 && !z17 && !z4) {
                                            boolean f2 = epx.f(str7, "static");
                                            boolean z18 = epx.f(str7, "video") && com.vk.toggle.b.A.a(FeedFeatures.ADS_SDK_INTERNAL_NATIVE_AD_VIDEO);
                                            boolean f3 = epx.f(str7, "carousel");
                                            if (!f2 && !z18 && !f3) {
                                                boolean z19 = (epx.f(str8, "mob_sdk") && epx.f(str7, "static")) || (epx.f(str8, "site_sdk") && com.vk.toggle.b.A.a(FeedFeatures.MY_TARGET_NATIVE_AD));
                                                boolean f4 = epx.f(str7, "collage");
                                                com.vk.toggle.b bVar2 = com.vk.toggle.b.A;
                                                boolean z20 = bVar2.a(FeedFeatures.ADS_SDK_CAROUSEL) && epx.f(str7, "carousel");
                                                boolean z21 = bVar2.a(FeedFeatures.ADS_SDK_INTERNAL_NATIVE_AD_VIDEO) && epx.f(str7, "video");
                                                if (z19 || f4 || z20 || z21) {
                                                    if (gjxVar == null && (zu50Var == null || bp50Var == null)) {
                                                        arrayList.add(new u1c0(355, myTargetNativeAdEntry));
                                                        return;
                                                    }
                                                    VideoAttachment videoAttachment3 = myTargetNativeAdEntry.u;
                                                    if (videoAttachment3 != null) {
                                                        videoAttachment3.Lb(str, null, null);
                                                        s3q0 s3q0Var = s3q0.a;
                                                        u1c0Var3 = new r74(367, videoAttachment3, myTargetNativeAdEntry, myTargetNativeAdEntry);
                                                    } else {
                                                        u1c0Var3 = new u1c0(epx.f(str7, "carousel") ? 371 : 354, myTargetNativeAdEntry);
                                                    }
                                                    u1c0Var3.h = (ol60) j5g.a0(new ds50().e(myTargetNativeAdEntry));
                                                    arrayList.add(u1c0Var3);
                                                    return;
                                                }
                                                return;
                                            }
                                            int hashCode = str7.hashCode();
                                            if (hashCode == -892481938) {
                                                if (str7.equals("static")) {
                                                    ds50 ds50Var = E().a;
                                                    if (epx.f(str8, "site_sdk")) {
                                                        boolean a6 = com.vk.toggle.b.A.a(FeedFeatures.MY_TARGET_NATIVE_AD);
                                                        u1c0 u1c0Var22 = (zu50Var == null || bp50Var == null) ? new u1c0(355, myTargetNativeAdEntry) : new u1c0(354, myTargetNativeAdEntry);
                                                        u1c0Var22.h = (ol60) j5g.a0(ds50Var.e(myTargetNativeAdEntry));
                                                        if (a6) {
                                                            u1c0Var = u1c0Var22;
                                                        }
                                                    } else if (epx.f(str8, "mob_sdk") && gjxVar != null) {
                                                        u1c0Var = new u1c0(354, myTargetNativeAdEntry);
                                                        u1c0Var.h = (ol60) j5g.a0(ds50Var.e(myTargetNativeAdEntry));
                                                    }
                                                }
                                                u1c0Var = null;
                                            } else if (hashCode != 2908512) {
                                                if (hashCode == 112202875 && str7.equals("video")) {
                                                    rp50 E2 = E();
                                                    E2.getClass();
                                                    boolean a7 = com.vk.toggle.b.A.a(FeedFeatures.ADS_SDK_INTERNAL_NATIVE_AD_VIDEO);
                                                    VideoAttachment d = E2.d(myTargetNativeAdEntry, str);
                                                    if (gjxVar == null || d == null) {
                                                        u1c0Var2 = null;
                                                    } else {
                                                        MyTargetNativeAdEntry Eb = MyTargetNativeAdEntry.Eb(myTargetNativeAdEntry, null, null, d, false, null, null, null, 2093055);
                                                        u1c0Var2 = new r74(367, d, myTargetNativeAdEntry, myTargetNativeAdEntry);
                                                        Object a02 = j5g.a0(E2.a.e(Eb));
                                                        nr50 nr50Var = a02 instanceof nr50 ? (nr50) a02 : null;
                                                        u1c0Var2.h = nr50Var != null ? new nr50(nr50Var.h, gjxVar, myTargetNativeAdEntry, nr50Var.k, nr50Var.l, nr50Var.m, nr50Var.n, nr50Var.o, nr50Var.p, sni.t(d), lbs.c(nr50Var.r, myTargetNativeAdEntry, null, 0, 6), nr50Var.s, nr50Var.t) : null;
                                                    }
                                                    if (u1c0Var2 != null && a7) {
                                                        u1c0Var = u1c0Var2;
                                                    }
                                                }
                                                u1c0Var = null;
                                            } else {
                                                if (str7.equals("carousel")) {
                                                    rp50 E3 = E();
                                                    E3.getClass();
                                                    ArrayList arrayList15 = (gjxVar == null || (content2 = gjxVar.getContent()) == null) ? null : content2.h;
                                                    if (arrayList15 != null) {
                                                        if (arrayList15.isEmpty()) {
                                                            arrayList15 = null;
                                                        }
                                                        if (arrayList15 != null) {
                                                            u1c0Var = new u1c0(371, myTargetNativeAdEntry);
                                                            u1c0Var.h = (ol60) j5g.a0(E3.a.e(myTargetNativeAdEntry));
                                                        }
                                                    }
                                                }
                                                u1c0Var = null;
                                            }
                                            if (u1c0Var != null) {
                                                arrayList.add(u1c0Var);
                                                return;
                                            }
                                            return;
                                        }
                                        switch (str7.hashCode()) {
                                            case -892481938:
                                                if (str7.equals("static")) {
                                                    rp50 E4 = E();
                                                    h170 F = F();
                                                    E4.getClass();
                                                    if (gjxVar == null) {
                                                        collection = EmptyList.b;
                                                        break;
                                                    } else {
                                                        PhotoAttachment photoAttachment2 = myTargetNativeAdEntry.t;
                                                        if (photoAttachment2 != null) {
                                                            u1c0 c = E4.c(myTargetNativeAdEntry, s1c0Var4);
                                                            new a6a0();
                                                            r74 c2 = a6a0.c(new vp10(myTargetNativeAdEntry, myTargetNativeAdEntry, photoAttachment2, 50, 0, EmptyList.b, s1c0Var4.q));
                                                            u1c0 u1c0Var23 = new u1c0(Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR_VALUE, myTargetNativeAdEntry);
                                                            u1c0Var23.h = (ol60) j5g.a0(E4.f.x(myTargetNativeAdEntry, null));
                                                            collection = rl3.I(new u1c0[]{c, c2, u1c0Var23, E4.a(myTargetNativeAdEntry, s1c0Var4), E4.b(myTargetNativeAdEntry, F)});
                                                            break;
                                                        } else {
                                                            collection = EmptyList.b;
                                                            break;
                                                        }
                                                    }
                                                }
                                                collection = EmptyList.b;
                                                break;
                                            case 97641:
                                                if (str7.equals("bls")) {
                                                    rp50 E5 = E();
                                                    E5.getClass();
                                                    if (gjxVar == null) {
                                                        collection = EmptyList.b;
                                                        break;
                                                    } else if (myTargetNativeAdEntry.v != null) {
                                                        u1c0 c3 = E5.c(myTargetNativeAdEntry, s1c0Var4);
                                                        u1c0 u1c0Var24 = new u1c0(InterfaceC4413l1.a.b.i, myTargetNativeAdEntry);
                                                        u1c0Var24.h = (ol60) j5g.a0(E5.e.a(myTargetNativeAdEntry));
                                                        iko0 a8 = E5.a(myTargetNativeAdEntry, s1c0Var4);
                                                        u1c0[] u1c0VarArr = new u1c0[i];
                                                        u1c0VarArr[0] = c3;
                                                        u1c0VarArr[1] = u1c0Var24;
                                                        u1c0VarArr[2] = a8;
                                                        collection = rl3.I(u1c0VarArr);
                                                        break;
                                                    } else {
                                                        collection = EmptyList.b;
                                                        break;
                                                    }
                                                }
                                                collection = EmptyList.b;
                                                break;
                                            case 2908512:
                                                if (str7.equals("carousel")) {
                                                    rp50 E6 = E();
                                                    h170 F2 = F();
                                                    E6.getClass();
                                                    if (gjxVar != null && (content = gjxVar.getContent()) != null && (arrayList2 = content.h) != null) {
                                                        if ((!arrayList2.isEmpty() ? arrayList2 : null) != null) {
                                                            u1c0 c4 = E6.c(myTargetNativeAdEntry, s1c0Var4);
                                                            u1c0 u1c0Var25 = new u1c0(InterfaceC4413l1.a.b.h, myTargetNativeAdEntry);
                                                            u1c0Var25.h = (ol60) j5g.a0(E6.d.G(myTargetNativeAdEntry));
                                                            collection = rl3.I(new u1c0[]{c4, u1c0Var25, E6.b(myTargetNativeAdEntry, F2)});
                                                            break;
                                                        }
                                                    }
                                                    collection = EmptyList.b;
                                                    break;
                                                }
                                                collection = EmptyList.b;
                                                break;
                                            case 112202875:
                                                if (str7.equals("video")) {
                                                    rp50 E7 = E();
                                                    h170 F3 = F();
                                                    VideoAttachment d2 = E7.d(myTargetNativeAdEntry, str);
                                                    if (d2 != null) {
                                                        u1c0 c5 = E7.c(myTargetNativeAdEntry, s1c0Var4);
                                                        int i7 = d2.C2() ? InterfaceC4413l1.a.b.e : 404;
                                                        r74 r74Var5 = new r74(i7, d2, myTargetNativeAdEntry, myTargetNativeAdEntry);
                                                        r74Var5.h = (ol60) j5g.a0(E7.c.I(0, new Triple(myTargetNativeAdEntry, d2, Integer.valueOf(i7))));
                                                        u1c0 u1c0Var26 = new u1c0(Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR_VALUE, myTargetNativeAdEntry);
                                                        u1c0Var26.h = (ol60) j5g.a0(E7.f.x(myTargetNativeAdEntry, null));
                                                        iko0 a9 = E7.a(myTargetNativeAdEntry, s1c0Var4);
                                                        u1c0 b6 = E7.b(myTargetNativeAdEntry, F3);
                                                        u1c0[] u1c0VarArr2 = new u1c0[5];
                                                        u1c0VarArr2[0] = c5;
                                                        u1c0VarArr2[1] = r74Var5;
                                                        u1c0VarArr2[2] = u1c0Var26;
                                                        u1c0VarArr2[i] = a9;
                                                        u1c0VarArr2[4] = b6;
                                                        collection = rl3.I(u1c0VarArr2);
                                                        break;
                                                    } else {
                                                        collection = EmptyList.b;
                                                        break;
                                                    }
                                                }
                                                collection = EmptyList.b;
                                                break;
                                            default:
                                                collection = EmptyList.b;
                                                break;
                                        }
                                        arrayList.addAll(collection);
                                    }
                                }
                                z4 = false;
                                if (z) {
                                }
                                switch (str7.hashCode()) {
                                    case -892481938:
                                        break;
                                    case 97641:
                                        break;
                                    case 2908512:
                                        break;
                                    case 112202875:
                                        break;
                                }
                                arrayList.addAll(collection);
                            }
                        } else {
                            bp50Var = bp50Var2;
                        }
                        z3 = false;
                        boolean z172 = z3;
                        if (epx.f(str7, "bls")) {
                        }
                        z4 = false;
                        if (z) {
                        }
                        switch (str7.hashCode()) {
                            case -892481938:
                                break;
                            case 97641:
                                break;
                            case 2908512:
                                break;
                            case 112202875:
                                break;
                        }
                        arrayList.addAll(collection);
                    }
                }
                z2 = false;
                if (epx.f(str7, "carousel")) {
                }
                z3 = false;
                boolean z1722 = z3;
                if (epx.f(str7, "bls")) {
                }
                z4 = false;
                if (z) {
                }
                switch (str7.hashCode()) {
                    case -892481938:
                        break;
                    case 97641:
                        break;
                    case 2908512:
                        break;
                    case 112202875:
                        break;
                }
                arrayList.addAll(collection);
            }
        } else {
            i = 3;
        }
        z = false;
        if (epx.f(str7, "video")) {
        }
        z2 = false;
        if (epx.f(str7, "carousel")) {
        }
        z3 = false;
        boolean z17222 = z3;
        if (epx.f(str7, "bls")) {
        }
        z4 = false;
        if (z) {
        }
        switch (str7.hashCode()) {
            case -892481938:
                break;
            case 97641:
                break;
            case 2908512:
                break;
            case 112202875:
                break;
        }
        arrayList.addAll(collection);
    }

    public final void o(DzenArticlesBlock dzenArticlesBlock, ArrayList arrayList) {
        FeedFeatures feedFeatures = FeedFeatures.DZEN_CAROUSEL;
        feedFeatures.getClass();
        if (com.vk.toggle.b.A.a(feedFeatures)) {
            C().getClass();
            u1c0 u1c0Var = new u1c0(ApiInvocationException.ErrorCodes.GROUP_RESTRICTION, dzenArticlesBlock);
            u1c0Var.h = (ol60) j5g.a0(Collections.singletonList(new gto(dzenArticlesBlock.i, dzenArticlesBlock.j)));
            arrayList.add(u1c0Var);
            u1c0 u1c0Var2 = new u1c0(ApiInvocationException.ErrorCodes.UNAUTHORIZED_RESTRICTION, dzenArticlesBlock);
            u1c0Var2.h = new ero(dzenArticlesBlock.k, dzenArticlesBlock.e, dzenArticlesBlock.f, dzenArticlesBlock.l.b);
            arrayList.add(u1c0Var2);
        }
    }

    public final void q(EntryPoints entryPoints, ArrayList arrayList) {
        if (entryPoints.j.isEmpty()) {
            return;
        }
        arrayList.add(C().a(entryPoints));
        arrayList.add(new u1c0(184, entryPoints));
    }

    public final void s(GroupsSuggestions groupsSuggestions, ArrayList arrayList) {
        c(groupsSuggestions, arrayList);
        if (groupsSuggestions.e && epx.f(groupsSuggestions.f, bwy.a.a)) {
            arrayList.add(A(Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE, groupsSuggestions));
            return;
        }
        ((ze7) this.p.getValue()).getClass();
        u1c0 u1c0Var = new u1c0(116, groupsSuggestions);
        u1c0Var.h = (ol60) j5g.a0(Collections.singletonList(new kdf0(groupsSuggestions, groupsSuggestions.i, groupsSuggestions.e, groupsSuggestions.f, groupsSuggestions.n)));
        arrayList.add(u1c0Var);
    }

    public final ArrayList t(Post post, NewsEntry newsEntry, CommentsActivity commentsActivity, String str) {
        List list = commentsActivity.d;
        if (list == null) {
            list = EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size() - 3;
        if (size < 0) {
            size = 0;
        }
        int size2 = list.size();
        while (size < size2) {
            Comment comment = (Comment) list.get(size);
            this.f.getClass();
            Triple triple = new Triple(post, commentsActivity, comment);
            u1c0 u1c0Var = new u1c0(post, newsEntry, 60);
            u1c0Var.h = (ol60) j5g.a0(new yiz().q(size, triple));
            u1c0Var.l = str;
            u1c0Var.f = size;
            arrayList.add(u1c0Var);
            size++;
        }
        return arrayList;
    }

    public final List<u1c0> u(Post post, NewsEntry newsEntry, CommentsActivity commentsActivity, String str, boolean z) {
        Flags flags = post.l;
        if (!hd60.a().a().e(m6r0.u0)) {
            return EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        if (!flags.zb(35184372088832L)) {
            if ((z ? 0L : 1500L) == 0) {
                flags.Ab(35184372088832L, true);
            }
        }
        if (flags.zb(35184372088832L)) {
            arrayList.addAll(t(post, newsEntry, commentsActivity, str));
        }
        if (flags.zb(2L) && flags.zb(4398046511104L)) {
            u1c0 u1c0Var = new u1c0(post, newsEntry, 65);
            u1c0Var.h = (ol60) j5g.a0(Collections.singletonList(new a6i(post.n, post.m, post.L.b, flags.zb(PlaybackStateCompat.ACTION_PREPARE_FROM_URI))));
            arrayList.add(u1c0Var);
        }
        return arrayList;
    }

    public final void x(Post post, NewsEntry newsEntry, s1c0 s1c0Var, String str, ArrayList arrayList) {
        int i;
        Activity activity = post.C;
        boolean z = !epx.f(str, "feed_top") || s1c0Var.G;
        if (activity != null) {
            int i2 = activity.b;
            if (i2 == 3) {
                arrayList.add(new u1c0(post, newsEntry, 89));
            } else if (i2 == 0 && (activity instanceof LikesActivity) && z) {
                arrayList.add(i(post, newsEntry, (LikesActivity) activity, false));
            }
        }
        if (post.oc()) {
            arrayList.add(new u1c0(post, newsEntry, 234));
        } else if (post.l.zb(34359738368L)) {
            arrayList.add(new p890(newsEntry, newsEntry, na60.a(newsEntry)));
        } else {
            vfe vfeVar = this.j;
            vfeVar.getClass();
            u1c0 u1c0Var = new u1c0(post, newsEntry, 1);
            u1c0Var.h = (ol60) j5g.a0(new uy9((h170) vfeVar.b).l(0, new Triple(post, newsEntry, s1c0Var)));
            arrayList.add(u1c0Var);
        }
        boolean z2 = activity != null && activity.b == 0;
        EasyPromote easyPromote = post.I;
        if (easyPromote != null && (i = easyPromote.b) != 2 && i != 0) {
            p(post, newsEntry, arrayList);
            return;
        }
        if (z2) {
            return;
        }
        if (activity != null && activity.b == 1 && z) {
            u1c0 u1c0Var2 = new u1c0(post, newsEntry, 19);
            u1c0Var2.l = str;
            arrayList.add(u1c0Var2);
        } else {
            if (activity != null && activity.b == 2 && z) {
                CommentsActivity commentsActivity = activity instanceof CommentsActivity ? (CommentsActivity) activity : null;
                if (commentsActivity == null) {
                    return;
                }
                arrayList.addAll(u(post, newsEntry, commentsActivity, str, s1c0Var.v || s1c0Var.w));
                return;
            }
            if (activity == null || activity.b != 4) {
                return;
            }
            arrayList.add(new u1c0(post, newsEntry, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
        }
    }

    public final void y(RecommendedMiniAppEntry recommendedMiniAppEntry, ArrayList arrayList) {
        if (!recommendedMiniAppEntry.e) {
            arrayList.add(C().a(recommendedMiniAppEntry));
            arrayList.add(new u1c0(295, recommendedMiniAppEntry));
            return;
        }
        C().getClass();
        u1c0 u1c0Var = new u1c0(259, recommendedMiniAppEntry);
        u1c0Var.h = (ol60) j5g.a0(Collections.singletonList(new nyj0(recommendedMiniAppEntry)));
        arrayList.add(u1c0Var);
        if (epx.f(recommendedMiniAppEntry.f, bwy.a.a)) {
            arrayList.add(new u1c0(362, recommendedMiniAppEntry));
        } else {
            arrayList.add(new u1c0(361, recommendedMiniAppEntry));
        }
    }

    public final void z(InterestingStoriesEntry interestingStoriesEntry, ArrayList arrayList) {
        arrayList.add(C().a(interestingStoriesEntry));
        arrayList.add(new u1c0(Sdk.SDKError.Reason.MRAID_UNRECOGNIZED_COMMAND_VALUE, interestingStoriesEntry));
    }
}
