package com.vk.newsfeed.common.helpers;

import android.content.Context;
import com.vk.dto.articles.Article;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Good;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.photo.Photo;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.metrics.eventtracking.b;
import com.vk.sharing.api.dto.SharingDataType;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import xsna.a84;
import xsna.ag20;
import xsna.bbj0;
import xsna.c5g;
import xsna.d70;
import xsna.gmq;
import xsna.m1y;
import xsna.msy;
import xsna.rl3;
import xsna.tbj0;
import xsna.tju;
import xsna.w8i;
import xsna.x750;
import xsna.xis;
import xsna.y110;

/* compiled from: NewsEntrySharingDelegate.kt */
/* loaded from: classes4.dex */
public final class a implements w8i {
    public final Context b;
    public String c = null;
    public String d = null;
    public Integer e = null;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;

    public a(Context context) {
        this.b = context;
        ag20 ag20Var = new ag20(this, 10);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, ag20Var);
        this.g = msy.a(lazyThreadSafetyMode, new xis(this, 27));
        this.h = msy.a(lazyThreadSafetyMode, new m1y(this, 15));
        this.i = msy.a(lazyThreadSafetyMode, new x750(this, 3));
        this.j = msy.a(lazyThreadSafetyMode, new tju(this, 11));
        Set y0 = rl3.y0(new MobileOfficialAppsCoreNavStat$EventScreen[]{MobileOfficialAppsCoreNavStat$EventScreen.FEED, MobileOfficialAppsCoreNavStat$EventScreen.FEED_COMMENT, MobileOfficialAppsCoreNavStat$EventScreen.FEED_CUSTOM, MobileOfficialAppsCoreNavStat$EventScreen.FEED_FRIENDS, MobileOfficialAppsCoreNavStat$EventScreen.FEED_PHOTOS, MobileOfficialAppsCoreNavStat$EventScreen.FEED_POST, MobileOfficialAppsCoreNavStat$EventScreen.FEED_POST_SIMILAR_NEWS, MobileOfficialAppsCoreNavStat$EventScreen.FEED_PROMOTED, MobileOfficialAppsCoreNavStat$EventScreen.FEED_RECENT, MobileOfficialAppsCoreNavStat$EventScreen.FEED_TOP});
        ArrayList arrayList = new ArrayList(c5g.u(y0, 10));
        Iterator it = y0.iterator();
        while (it.hasNext()) {
            arrayList.add(t0.a((MobileOfficialAppsCoreNavStat$EventScreen) it.next()));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final d70 a() {
        return (d70) this.h.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final a84 b() {
        return (a84) this.i.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final bbj0 c() {
        return (bbj0) this.g.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    public final void d(Post post) {
        if (!post.lc()) {
            g(post);
            return;
        }
        Attachment Ib = post.Ib();
        MarketAttachment marketAttachment = Ib instanceof MarketAttachment ? (MarketAttachment) Ib : null;
        Good good = marketAttachment != null ? marketAttachment.f : null;
        if (post.z.size() != 1 || good == null) {
            b.a.a(new UnsupportedOperationException("Can't share post as market because it does not satisfy the contract: " + post));
            g(post);
            return;
        }
        String a = ((y110) this.j.getValue()).a(good);
        tbj0 a2 = c().a(this.b);
        a2.j = post;
        a2.c = b().h(good, a);
        a2.d = a().i(good);
        a2.h = Integer.valueOf(SharingDataType.GOOD.ordinal());
        a2.q = this.c;
        a2.g = this.e;
        a2.c();
    }

    public final void e(NewsEntry newsEntry) {
        VideoAttachment videoAttachment;
        if (newsEntry instanceof Post) {
            d((Post) newsEntry);
            return;
        }
        boolean z = newsEntry instanceof PromoPost;
        Context context = this.b;
        if (z) {
            PromoPost promoPost = (PromoPost) newsEntry;
            tbj0 a = c().a(context);
            a.c = b().b(promoPost);
            a.d = a().b(promoPost);
            a.h = Integer.valueOf(SharingDataType.POST.ordinal());
            a.q = this.c;
            a.c();
            return;
        }
        if (newsEntry instanceof Videos) {
            Attachment R1 = ((Videos) newsEntry).R1();
            if (R1 != null && (R1 instanceof VideoAttachment)) {
                f((VideoAttachment) R1);
                return;
            }
            return;
        }
        if (newsEntry instanceof Photos) {
            Attachment R12 = ((Photos) newsEntry).R1();
            if (R12 != null && (R12 instanceof PhotoAttachment)) {
                tbj0 a2 = c().a(context);
                a84 b = b();
                Photo photo = ((PhotoAttachment) R12).l;
                a2.c = b.g(photo, null);
                a2.d = a().e(photo, true);
                a2.q = this.c;
                a2.c();
                return;
            }
            return;
        }
        if (!(newsEntry instanceof FaveEntry)) {
            if (newsEntry instanceof ShitAttachment) {
                ShitAttachment shitAttachment = (ShitAttachment) newsEntry;
                if (shitAttachment.Gb() && (videoAttachment = shitAttachment.I) != null) {
                    f(videoAttachment);
                    return;
                }
                return;
            }
            return;
        }
        FaveEntry faveEntry = (FaveEntry) newsEntry;
        gmq gmqVar = faveEntry.i.f;
        if (gmqVar instanceof ArticleAttachment) {
            ArticleAttachment articleAttachment = (ArticleAttachment) gmqVar;
            tbj0 a3 = c().a(context);
            a3.i = articleAttachment.f;
            a84 b2 = b();
            Article article = articleAttachment.f;
            a3.c = b2.c(article);
            a3.d = a().c(article);
            a3.h = Integer.valueOf(SharingDataType.ARTICLE.ordinal());
            a3.q = this.c;
            a3.c();
            return;
        }
        if (gmqVar instanceof Post) {
            d((Post) gmqVar);
            return;
        }
        if (gmqVar instanceof VideoAttachment) {
            f((VideoAttachment) gmqVar);
            return;
        }
        b.a.a(new UnsupportedOperationException("Unsupported share for fave entry " + faveEntry + " with " + gmqVar));
    }

    public final void f(VideoAttachment videoAttachment) {
        tbj0 a = c().a(this.b);
        a.j = videoAttachment;
        a.c = b().f(videoAttachment.k, null);
        a.d = a().g(videoAttachment.k, true);
        a.q = this.c;
        a.c();
    }

    public final void g(Post post) {
        tbj0 a = c().a(this.b);
        a.j = post;
        a.c = b().d(this.d, post);
        a.d = a().f(post);
        a.h = Integer.valueOf(SharingDataType.POST.ordinal());
        a.e = post;
        a.q = this.c;
        a.g = this.e;
        a.c();
    }
}
