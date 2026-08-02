package com.vk.newsfeed.common.util;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.media.session.PlaybackStateCompat;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.dto.badges.Badgeable;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Caption;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import com.vk.ecomm.fave.api.models.FaveMarketItem;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.PostActions;
import com.vk.newsfeed.common.util.a;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.ao8;
import xsna.ba60;
import xsna.dhr0;
import xsna.di60;
import xsna.e43;
import xsna.fb60;
import xsna.fkq0;
import xsna.fsx0;
import xsna.gmq;
import xsna.hd60;
import xsna.je40;
import xsna.k9q0;
import xsna.l490;
import xsna.msy;
import xsna.na60;
import xsna.o25;
import xsna.qr;
import xsna.re0;
import xsna.rv60;
import xsna.t6g0;
import xsna.tni;
import xsna.z960;

/* compiled from: NewsEntryActionsMenuRedesignBuilder.kt */
/* loaded from: classes4.dex */
public final class h extends c {
    public final NewsEntry c;
    public final NewsEntry d;
    public boolean l;
    public boolean n;
    public UserId o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final boolean e = true;
    public boolean f = true;
    public final boolean g = true;
    public final boolean h = true;
    public final boolean i = true;
    public final boolean j = true;
    public boolean k = true;
    public final boolean m = true ^ BuildInfo.r();
    public final Object w = msy.a(LazyThreadSafetyMode.NONE, new re0(27));

    public h(NewsEntry newsEntry, NewsEntry newsEntry2) {
        this.c = newsEntry;
        this.d = newsEntry2;
    }

    public static void f(ba60 ba60Var, NewsEntry newsEntry) {
        String b = di60.b(newsEntry);
        if (b == null || b.length() == 0) {
            return;
        }
        int h = PostActions.ACTION_COPY_AD_MARKER.h();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        ba60.N0(ba60Var, h, context.getString(R.string.ad_marker_template, di60.b(newsEntry)), R.drawable.vk_icon_info_circle_outline_24);
    }

    public static void k(ba60 ba60Var, gmq gmqVar) {
        boolean X = gmqVar.X();
        ba60.L0(ba60Var, PostActions.ACTION_TOGGLE_FAVE.h(), X ? R.string.fave_remove_title : R.string.menu_item_fave_add_title, X ? R.drawable.vk_icon_bookmark_slash_outline_24 : R.drawable.vk_icon_bookmark_outline_24, 0, 24);
    }

    public static void q(ba60 ba60Var, NewsEntry newsEntry) {
        String e = di60.e(newsEntry);
        if (e == null || e.length() == 0) {
            return;
        }
        ba60.L0(ba60Var, PostActions.ACTION_SHOW_ADVERTISER_INFO.h(), R.string.show_advertiser_info, R.drawable.vk_icon_link_circle_24, 0, 24);
    }

    public static boolean s(NewsEntry newsEntry) {
        t6g0 t6g0Var = t6g0.b;
        return t6g0.b().g0(k9q0.o(newsEntry)) || t6g0.b().m(k9q0.o(newsEntry));
    }

    public static boolean t(NewsEntry newsEntry) {
        return o25.a().a(k9q0.o(newsEntry)) || s(newsEntry);
    }

    public static boolean v(NewsEntry newsEntry) {
        NewsfeedCoowners newsfeedCoowners;
        Post R = di60.R(newsEntry);
        if ((R == null || (newsfeedCoowners = R.f0) == null) ? false : newsfeedCoowners.b) {
            Post R2 = di60.R(newsEntry);
            if ((R2 == null || rv60.g(R2)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    public static boolean w(NewsEntry newsEntry) {
        NewsfeedCoowners newsfeedCoowners;
        Post R = di60.R(newsEntry);
        if ((R == null || (newsfeedCoowners = R.f0) == null) ? false : newsfeedCoowners.c) {
            Post R2 = di60.R(newsEntry);
            if ((R2 == null || rv60.g(R2)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    public static boolean x(NewsEntry newsEntry) {
        NewsfeedCoowners newsfeedCoowners;
        Post R = di60.R(newsEntry);
        if ((R == null || (newsfeedCoowners = R.f0) == null) ? false : !newsfeedCoowners.f.isEmpty()) {
            Post R2 = di60.R(newsEntry);
            if ((R2 == null || rv60.g(R2)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    @Override // com.vk.newsfeed.common.util.c, com.vk.newsfeed.common.util.a
    public final a b(z960 z960Var) {
        this.b = z960Var;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:212:0x03e7, code lost:
    
        if (((r0 == null || (r0 = r0.k) == null) ? false : r0.i9()) != false) goto L218;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.common.util.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(ba60 ba60Var) {
        Caption caption;
        String str;
        boolean z = false;
        NewsEntry newsEntry = this.c;
        if (newsEntry != null) {
            if (this.n && !di60.z(newsEntry)) {
                if (newsEntry instanceof Post) {
                    Caption caption2 = ((Post) newsEntry).x;
                    if (caption2 != null) {
                        str = caption2.c;
                        if (str != null) {
                            ba60Var.h = true;
                            if (ba60Var.j) {
                                ba60Var.j = false;
                                ba60Var.x0(new fb60(0, str, true));
                            } else {
                                ba60Var.x0(new fb60(0, str, false));
                            }
                            ba60Var.j = true;
                        }
                    }
                    str = null;
                    if (str != null) {
                    }
                } else {
                    if ((newsEntry instanceof Videos) && (caption = ((Videos) newsEntry).p) != null) {
                        str = caption.c;
                        if (str != null) {
                        }
                    }
                    str = null;
                    if (str != null) {
                    }
                }
            }
            if (newsEntry instanceof Post) {
                Post post = (Post) newsEntry;
                Flags flags = post.l;
                Post R = di60.R(post);
                if ("topic".equals(R != null ? R.t : null)) {
                    g(ba60Var, post);
                    if (fkq0.b(k9q0.o(post)) && s(post)) {
                        ba60Var.j = true;
                    }
                    h(ba60Var, post);
                    return true;
                }
                if (post.lc()) {
                    l(ba60Var, post);
                    return true;
                }
                if (post.oc()) {
                    i(ba60Var, post, R.drawable.vk_icon_write_outline_24);
                    ba60.L0(ba60Var, PostActions.ACTION_PUBLISH_POSTPONED.h(), R.string.publish_now, R.drawable.vk_icon_arrow_up_24, 0, 24);
                    g(ba60Var, post);
                    q(ba60Var, post);
                    f(ba60Var, post);
                    ba60Var.j = true;
                    h(ba60Var, post);
                    return true;
                }
                if (post.rc()) {
                    q(ba60Var, post);
                    f(ba60Var, post);
                    g(ba60Var, post);
                    if (this.r && post.fc()) {
                        ba60.L0(ba60Var, PostActions.ACTION_UNBAN_USER.h(), R.string.menu_item_unban_user, R.drawable.vk_icon_block_outline_24, 0, 24);
                    }
                    ba60Var.j = true;
                    if (this.r && !post.fc()) {
                        ba60.L0(ba60Var, PostActions.ACTION_BAN_USER.h(), R.string.menu_item_ban_user, R.drawable.vk_icon_block_outline_24, dhr0.t.c(R.attr.vk_ui_background_negative), 8);
                    }
                    h(ba60Var, post);
                    o(ba60Var, post);
                    return true;
                }
                if (post.Z1()) {
                    ba60.L0(ba60Var, PostActions.ACTION_PUBLISH_DRAFT.h(), R.string.publish_now, R.drawable.vk_icon_arrow_up_24, 0, 24);
                    i(ba60Var, post, R.drawable.vk_icon_pen_outline_24);
                    g(ba60Var, post);
                    ba60Var.j = true;
                    h(ba60Var, post);
                    return true;
                }
                boolean t = t(post);
                r(ba60Var, post);
                if (t || rv60.h(this.o, post)) {
                    if (this.s) {
                        n(ba60Var, post);
                    } else if (this.k && na60.b(post)) {
                        boolean mc = post.mc();
                        ba60.L0(ba60Var, PostActions.ACTION_TOGGLE_PINNED.h(), mc ? R.string.post_unfix : R.string.post_fix, mc ? R.drawable.vk_icon_pin_slash_outline_24 : R.drawable.vk_icon_pin_outline_24, 0, 24);
                    }
                }
                if (t) {
                    i(ba60Var, post, R.drawable.vk_icon_write_outline_24);
                }
                if (this.q && flags.zb(281474976710656L)) {
                    if (flags.zb(562949953421312L)) {
                        ba60.L0(ba60Var, PostActions.ACTION_REMOVE_FROM_MAIN_TAB.h(), R.string.menu_item_remove_from_main, R.drawable.vk_icon_hide_outline_24, 0, 24);
                    } else {
                        ba60.L0(ba60Var, PostActions.ACTION_ADD_TO_MAIN_TAB.h(), R.string.menu_item_add_to_main, R.drawable.vk_icon_view_outline_24, 0, 24);
                    }
                }
                if (!rv60.h(this.o, post) && !u(post) && !flags.zb(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) && (post.Lb() || flags.zb(16777216L))) {
                    ba60.L0(ba60Var, PostActions.ACTION_TOGGLE_COMMENTS.h(), !post.Lb() ? R.string.menu_item_post_open_comments : R.string.menu_item_post_close_comments, !post.Lb() ? R.drawable.vk_icon_comment_outline_24 : R.drawable.vk_icon_comment_slash_outline_24, 0, 24);
                }
                if (flags.zb(1073741824L)) {
                    ba60.L0(ba60Var, PostActions.ACTION_PUBLISH_FREE_COPY.h(), R.string.donut_publish_free_copy, R.drawable.vk_icon_lock_open_outline_24, 0, 24);
                }
                l(ba60Var, post);
                f(ba60Var, post);
                q(ba60Var, post);
                if (!t && !x(post) && !v(post) && !w(post) && flags.zb(PlaybackStateCompat.ACTION_SET_REPEAT_MODE)) {
                    if (flags.zb(PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED)) {
                        ba60.L0(ba60Var, PostActions.ACTION_PUSH_UNSUBSCRIBE.h(), R.string.menu_item_unsubscribe_from_posts, R.drawable.vk_icon_notification_slash_outline_24, 0, 24);
                    } else {
                        ba60.L0(ba60Var, PostActions.ACTION_PUSH_SUBSCRIBE.h(), R.string.menu_item_subscribe_to_posts, R.drawable.vk_icon_notification_outline_24, 0, 24);
                    }
                }
                if (!post.ec()) {
                    g(ba60Var, post);
                }
                p(ba60Var, post);
                if (post.D != null) {
                    ba60.L0(ba60Var, PostActions.ACTION_OPEN_ORIGINAL_POST.h(), R.string.show_original_post, R.drawable.vk_icon_newsfeed_outline_24, 0, 24);
                }
                if (this.t && na60.g(post)) {
                    ba60.L0(ba60Var, PostActions.ACTION_ADS_EASY_PROMOTE.h(), R.string.ads_easy_promote_button, R.drawable.vk_icon_advertising_outline_24, 0, 24);
                }
                ba60Var.j = true;
                if (!rv60.h(this.o, post) && !u(post) && qr.f(post.m) && flags.zb(268435456L)) {
                    if (post.ec()) {
                        ba60.L0(ba60Var, PostActions.ACTION_REMOVE_FROM_ARCHIVE.h(), R.string.menu_item_remove_post_from_archive, R.drawable.vk_icon_unarchive_outline_24, 0, 24);
                    } else {
                        ba60.L0(ba60Var, PostActions.ACTION_ADD_TO_ARCHIVE.h(), R.string.menu_item_add_post_to_archive, R.drawable.vk_icon_archive_outline_24, 0, 24);
                    }
                }
                if (rv60.h(this.o, post) && this.p) {
                    ba60.L0(ba60Var, PostActions.ACTION_REMOVE.h(), R.string.menu_item_decline_coownership, R.drawable.vk_icon_delete_outline_24, dhr0.t.c(R.attr.vk_ui_background_negative), 8);
                } else {
                    h(ba60Var, post);
                }
                ba60Var.j = true;
                m(ba60Var, post);
                if (!s(post)) {
                    o(ba60Var, post);
                    return true;
                }
            } else {
                if (newsEntry instanceof Photos) {
                    g(ba60Var, newsEntry);
                    o(ba60Var, newsEntry);
                    h(ba60Var, newsEntry);
                    return true;
                }
                if (newsEntry instanceof Videos) {
                    Videos videos = (Videos) newsEntry;
                    ComFeatures comFeatures = ComFeatures.COM_MAIN_CARDS_ACTION;
                    comFeatures.getClass();
                    com.vk.toggle.b bVar = com.vk.toggle.b.A;
                    if (bVar.a(comFeatures)) {
                        r(ba60Var, videos);
                        i(ba60Var, videos, R.drawable.vk_icon_write_outline_24);
                    }
                    if (this.s && this.q && (videos.Qb() || (((Boolean) this.w.getValue()).booleanValue() && !di60.J(videos) && di60.L(videos)))) {
                        n(ba60Var, videos);
                    }
                    if (this.q && videos.Lb() && videos.Qb()) {
                        ba60.L0(ba60Var, PostActions.ACTION_REMOVE_FROM_MAIN_TAB.h(), R.string.menu_item_remove_from_main, R.drawable.vk_icon_hide_outline_24, 0, 24);
                    }
                    if (bVar.a(comFeatures)) {
                        if (t(videos)) {
                            if (!videos.Ea() || !this.u) {
                                VideoAttachment Nb = videos.Nb();
                            }
                            z = true;
                            if (z) {
                                ba60.L0(ba60Var, PostActions.ACTION_ADD_TO_PLAYLIST.h(), R.string.video_add_to_playlist, R.drawable.vk_icon_list_add_outline_24, 0, 24);
                            }
                        }
                        if (t(videos) && videos.Ea() && this.v) {
                            ba60.L0(ba60Var, PostActions.ACTION_EDIT_PLAYLIST.h(), R.string.clips_edit_playlist, R.drawable.vk_icon_list_add_outline_24, 0, 24);
                        }
                    }
                    l(ba60Var, videos);
                    g(ba60Var, videos);
                    if (this.s && this.t && na60.g(videos)) {
                        ba60.L0(ba60Var, PostActions.ACTION_ADS_EASY_PROMOTE.h(), R.string.ads_easy_promote_button, R.drawable.vk_icon_advertising_outline_24, 0, 24);
                    }
                    p(ba60Var, videos);
                    ba60Var.j = true;
                    if (bVar.a(comFeatures)) {
                        h(ba60Var, videos);
                    }
                    m(ba60Var, videos);
                    if (!bVar.a(comFeatures)) {
                        o(ba60Var, videos);
                        return true;
                    }
                    if (!s(videos)) {
                        o(ba60Var, videos);
                        return true;
                    }
                } else if (newsEntry instanceof FaveEntry) {
                    gmq gmqVar = ((FaveEntry) newsEntry).i.f;
                    if (!(gmqVar instanceof FaveMarketItem) || !((FaveMarketItem) gmqVar).b.Cb()) {
                        ba60.L0(ba60Var, PostActions.ACTION_CUSTOMIZE_TAGS.h(), R.string.menu_item_customize_tags, R.drawable.vk_icon_tag_outline_28, 0, 24);
                    }
                    if ((gmqVar != 0 ? gmqVar : null) != null) {
                        k(ba60Var, gmqVar);
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.vk.newsfeed.common.util.c
    public final VkContextMenu d(Context context, a.AbstractC1374a abstractC1374a) {
        NewsEntry newsEntry;
        com.vk.metrics.eventtracking.b.a.a(new Exception("Not implemented type of news entry. Fallback to default actions menu"));
        if (this.b == null || (newsEntry = this.c) == null) {
            return null;
        }
        g gVar = new g(newsEntry, this.d);
        gVar.t = this.b;
        return gVar.a(context, abstractC1374a);
    }

    @Override // com.vk.newsfeed.common.util.c
    /* renamed from: e */
    public final c b(je40 je40Var) {
        this.b = je40Var;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(ba60 ba60Var, NewsEntry newsEntry) {
        List<EntryAttachment> N7;
        boolean z = false;
        if (this.i) {
            int zb = newsEntry.zb();
            boolean z2 = (zb == 11 || zb == 20) ? false : true;
            if (zb == 0) {
                if (z2) {
                    Post post = newsEntry instanceof Post ? (Post) newsEntry : null;
                    if (post != null && (!post.Tb() || post.jc())) {
                        z2 = true;
                    }
                }
                z2 = false;
            }
            if (zb == 0) {
                z = z2;
            } else if (z2) {
                fsx0 fsx0Var = newsEntry instanceof fsx0 ? (fsx0) newsEntry : null;
                if (fsx0Var != null && (N7 = fsx0Var.N7()) != null && N7.size() == 1) {
                    z = true;
                }
            }
        }
        if (z) {
            ba60.L0(ba60Var, PostActions.ACTION_COPY_LINK.h(), R.string.copy_link, R.drawable.vk_icon_copy_outline_24, 0, 24);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (xsna.t6g0.b().m(r0) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(ba60 ba60Var, NewsEntry newsEntry) {
        boolean z = false;
        if (this.h) {
            Parcelable parcelable = this.c;
            if (parcelable instanceof Post) {
                Post post = (Post) parcelable;
                if (!post.l.zb(549755813888L)) {
                    if (!post.l.zb(64L) && !o25.a().a(post.m)) {
                        z = o25.a().a(post.o.b);
                    }
                    z = true;
                }
            } else if (parcelable instanceof l490) {
                Owner s = ((l490) parcelable).s();
                UserId userId = s != null ? s.b : null;
                if (userId != null) {
                    if (!o25.a().a(userId)) {
                        t6g0 t6g0Var = t6g0.b;
                    }
                    z = true;
                }
            }
        }
        if (!z || u(newsEntry)) {
            return;
        }
        ba60.L0(ba60Var, PostActions.ACTION_REMOVE.h(), R.string.menu_item_remove_post, R.drawable.vk_icon_delete_outline_24, dhr0.t.c(R.attr.vk_ui_background_negative), 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        if (r8.l.zb(android.support.v4.media.session.PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004d, code lost:
    
        if (((r8 == null || (r8 = r8.k) == null) ? false : r8.t0()) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(ba60 ba60Var, NewsEntry newsEntry, int i) {
        boolean z = true;
        if (newsEntry instanceof Post) {
            if ((!rv60.h(this.o, newsEntry) || !this.p) && !u(newsEntry) && this.j) {
                Post post = (Post) newsEntry;
                if (rv60.a(post)) {
                }
            }
            z = false;
        } else {
            if ((newsEntry instanceof Videos) && t(newsEntry)) {
                VideoAttachment Nb = ((Videos) newsEntry).Nb();
            }
            z = false;
        }
        if (z) {
            ba60.L0(ba60Var, PostActions.ACTION_EDIT.h(), R.string.edit, i, 0, 24);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x004f, code lost:
    
        if ((r0 != null ? r0.g : null) == null) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.vk.feed.core.models.news.NewsEntry] */
    /* JADX WARN: Type inference failed for: r8v11, types: [com.vk.dto.fave.MarketFavable] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(ba60 ba60Var, NewsEntry newsEntry) {
        Good good;
        if (newsEntry instanceof Post) {
            Post post = (Post) newsEntry;
            if (post.lc()) {
                Attachment Ib = post.Ib();
                MarketAttachment marketAttachment = Ib instanceof MarketAttachment ? (MarketAttachment) Ib : null;
                if (marketAttachment != null && (good = marketAttachment.f) != null) {
                    newsEntry = ao8.s(good);
                }
                newsEntry = 0;
            } else {
                boolean hc = post.hc();
                Flags flags = post.l;
                if (!hc && !flags.zb(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) && !flags.zb(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM)) {
                    PostDonut postDonut = post.R;
                    if ((postDonut != null ? postDonut.c : null) == null) {
                    }
                }
                newsEntry = 0;
            }
        } else {
            if (newsEntry instanceof Videos) {
                Videos videos = (Videos) newsEntry;
                VideoAttachment Nb = videos.Nb();
                if (videos.Ea()) {
                    newsEntry = Nb;
                }
            }
            newsEntry = 0;
        }
        if (this.f && hd60.a().D() && newsEntry != 0) {
            k(ba60Var, (gmq) newsEntry);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(ba60 ba60Var, NewsEntry newsEntry) {
        Owner s;
        if (v(newsEntry)) {
            return;
        }
        if (rv60.h(this.o, newsEntry) && this.p) {
            return;
        }
        boolean z = false;
        if (this.l) {
            boolean z2 = newsEntry instanceof Post;
            if (z2 ? ((Post) newsEntry).l.zb(8589934592L) : newsEntry instanceof PromoPost ? ((PromoPost) newsEntry).n.l.zb(8589934592L) : true) {
                NewsEntry newsEntry2 = this.d;
                if (!((newsEntry2 instanceof Digest) && newsEntry2 != this.c)) {
                    if (((!(newsEntry instanceof l490) || (s = ((l490) newsEntry).s()) == null) ? null : s.b) == null ? true : !o25.a().a(r2)) {
                        Post post = z2 ? (Post) newsEntry : null;
                        if (!(post != null && post.hc() && post.J())) {
                            if (!(fkq0.b(k9q0.o(newsEntry)) && s(newsEntry))) {
                                z = true;
                            }
                        }
                    }
                }
            }
        }
        if (z) {
            ba60.L0(ba60Var, PostActions.ACTION_IGNORE.h(), R.string.menu_item_hide_not_interesting, R.drawable.vk_icon_unblock_outline_24, 0, 24);
        }
    }

    public final void n(ba60 ba60Var, NewsEntry newsEntry) {
        if (this.k && na60.e(newsEntry)) {
            boolean f = na60.f(newsEntry);
            ba60.L0(ba60Var, PostActions.ACTION_TOGGLE_PINNED_ON_MAIN_TAB.h(), f ? R.string.post_unfix : R.string.post_fix, f ? R.drawable.vk_icon_pin_slash_outline_24 : R.drawable.vk_icon_pin_outline_24, 0, 24);
        }
    }

    public final void o(ba60 ba60Var, NewsEntry newsEntry) {
        if (!v(newsEntry) || u(newsEntry)) {
            if (!(rv60.h(this.o, newsEntry) && this.p) && this.e && tni.e(newsEntry, u(newsEntry))) {
                ba60.L0(ba60Var, PostActions.ACTION_REPORT.h(), R.string.report_content, R.drawable.vk_icon_report_outline_24, dhr0.t.c(R.attr.vk_ui_background_negative), 8);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(ba60 ba60Var, NewsEntry newsEntry) {
        if (x(newsEntry) || v(newsEntry) || w(newsEntry)) {
            return;
        }
        Badgeable badgeable = newsEntry instanceof Badgeable ? (Badgeable) newsEntry : null;
        if ((badgeable != null ? badgeable.ca() : null) == null || !this.g) {
            return;
        }
        ba60.L0(ba60Var, PostActions.ACTION_SEND_BADGE.h(), R.string.newsfeed_post_send_donut, R.drawable.vk_icon_donut_outline_24, 0, 24);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (xsna.o25.a().a(xsna.k9q0.o(r11)) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        if (xsna.t6g0.b().g0(xsna.k9q0.o(r11)) != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(ba60 ba60Var, NewsEntry newsEntry) {
        Flags flags;
        boolean z = newsEntry instanceof Post;
        boolean z2 = false;
        int i = R.string.menu_item_news_post_stat;
        if (z) {
            Post post = newsEntry != null ? (Post) newsEntry : null;
            if (post == null || (flags = post.l) == null || !flags.zb(536870912L)) {
                ComFeatures comFeatures = ComFeatures.COM_POST_STATISTICS;
                comFeatures.getClass();
                if (com.vk.toggle.b.A.a(comFeatures)) {
                }
            }
            if (this.m) {
                z2 = true;
            }
        } else if (newsEntry instanceof Videos) {
            if (!o25.a().a(k9q0.o(newsEntry))) {
                t6g0 t6g0Var = t6g0.b;
            }
            if (((Videos) newsEntry).Ea()) {
                ComFeatures comFeatures2 = ComFeatures.COM_MAIN_CARDS_ACTION;
                comFeatures2.getClass();
                if (com.vk.toggle.b.A.a(comFeatures2)) {
                    z2 = true;
                }
            }
            if (z2) {
                i = R.string.clips_show_statistic;
            }
        }
        int i2 = i;
        if (z2) {
            ba60.L0(ba60Var, PostActions.ACTION_SHOW_STATS.h(), i2, R.drawable.vk_icon_statistics_outline_24, 0, 24);
            ba60Var.j = true;
        }
    }

    public final boolean u(NewsEntry newsEntry) {
        NewsfeedCoowners newsfeedCoowners;
        if (!v(newsEntry) || !this.p) {
            return false;
        }
        Post R = di60.R(newsEntry);
        return ((R == null || (newsfeedCoowners = R.f0) == null) ? null : newsfeedCoowners.d) != null;
    }
}
