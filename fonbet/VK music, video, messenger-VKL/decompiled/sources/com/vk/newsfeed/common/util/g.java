package com.vk.newsfeed.common.util;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.badges.Badgeable;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.newsfeed.entries.discover.VideoDiscoverGridItem;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.discover.DiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.PostActions;
import com.vk.newsfeed.common.util.a;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.aa60;
import xsna.bpn0;
import xsna.c6z;
import xsna.di60;
import xsna.e43;
import xsna.egd;
import xsna.fkq0;
import xsna.fsx0;
import xsna.gmq;
import xsna.grj0;
import xsna.hd60;
import xsna.krv0;
import xsna.l490;
import xsna.myc0;
import xsna.o25;
import xsna.p960;
import xsna.qr;
import xsna.rv60;
import xsna.tni;
import xsna.ubw;
import xsna.w8i;
import xsna.y960;
import xsna.z960;

/* compiled from: NewsEntryActionsMenuBuilder.kt */
/* loaded from: classes4.dex */
public class g implements w8i, a {
    public final NewsEntry b;
    public final NewsEntry c;
    public int d;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public z960 t;
    public View u;
    public boolean e = true;
    public boolean f = true;
    public boolean g = true;
    public boolean h = true;
    public boolean i = true;
    public boolean j = true;
    public boolean k = true;
    public boolean l = true;
    public boolean m = true;
    public final boolean s = true ^ BuildInfo.r();
    public final p960 v = new p960(new bpn0(new ubw(this, 14)));

    public g(NewsEntry newsEntry, NewsEntry newsEntry2) {
        this.b = newsEntry;
        this.c = newsEntry2;
    }

    public static boolean d(NewsEntry newsEntry) {
        Post post = newsEntry instanceof Post ? (Post) newsEntry : null;
        boolean z = false;
        if (post != null && post.hc() && post.J()) {
            z = true;
        }
        return !z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:324:0x03ce, code lost:
    
        if (r7.Tb() == true) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x016c, code lost:
    
        if (r4.b9() == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x017e, code lost:
    
        if (r3.Fa() != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0146, code lost:
    
        if ((r6 instanceof xsna.c6z) != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0149, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x014f, code lost:
    
        r3 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x014d, code lost:
    
        if ((r6 instanceof xsna.c6z) != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0165, code lost:
    
        if (xsna.fdi.t(r10) == true) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ec  */
    @Override // com.vk.newsfeed.common.util.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final VkContextMenu a(Context context, a.AbstractC1374a abstractC1374a) {
        e.c cVar;
        VideoFile videoFile;
        boolean z;
        boolean z2;
        boolean z3;
        List<EntryAttachment> N7;
        Badgeable badgeable;
        Post post;
        boolean a;
        String str;
        String e;
        String b;
        int i;
        int h;
        Flags flags;
        Flags flags2;
        Owner s;
        Owner s2;
        Owner owner;
        boolean J;
        aa60 aa60Var = new aa60();
        aa60Var.e = this.t;
        if (abstractC1374a instanceof a.AbstractC1374a.b) {
            View view = ((a.AbstractC1374a.b) abstractC1374a).a;
            int l = krv0.l(R.attr.vk_ui_icon_accent);
            view.getContext();
            e.b bVar = new e.b(view, null, null, l, 6);
            bVar.w = R.layout.ds_internal_context_menu_item;
            cVar = bVar;
        } else {
            if (!(abstractC1374a instanceof a.AbstractC1374a.C1375a)) {
                throw new NoWhenBranchMatchedException();
            }
            a.AbstractC1374a.C1375a c1375a = (a.AbstractC1374a.C1375a) abstractC1374a;
            View view2 = c1375a.a;
            Rect rect = c1375a.b;
            int l2 = krv0.l(R.attr.vk_ui_icon_accent);
            view2.getContext();
            cVar = new e.c(null, rect, view2, l2, 1);
        }
        cVar.l = aa60Var;
        cVar.m = this.d;
        VkContextMenu a2 = cVar.a();
        aa60Var.f = new WeakReference<>(a2);
        boolean z4 = this.o;
        p960 p960Var = this.v;
        NewsEntry newsEntry = this.b;
        NewsEntry newsEntry2 = this.c;
        if (z4) {
            if (newsEntry2 instanceof DiscoverMediaBlock) {
                p960Var.getClass();
                DiscoverGridItem Eb = ((DiscoverMediaBlock) newsEntry2).Eb(newsEntry);
                if (Eb instanceof VideoDiscoverGridItem) {
                    VideoFile videoFile2 = ((VideoDiscoverGridItem) Eb).j.k;
                    if (videoFile2 != null) {
                        J = videoFile2.O9();
                    } else {
                        if (newsEntry instanceof c6z) {
                            J = ((grj0) newsEntry).J();
                        }
                        J = false;
                    }
                    if (!J) {
                        aa60Var.K0(PostActions.ACTION_LIKE.h(), R.string.news_entry_menu_item_like);
                    }
                } else {
                    if (newsEntry instanceof c6z) {
                        J = ((grj0) newsEntry).J();
                        if (!J) {
                        }
                    }
                    J = false;
                    if (!J) {
                    }
                }
            } else {
                p960Var.getClass();
                if (newsEntry instanceof c6z) {
                    J = ((grj0) newsEntry).J();
                    if (!J) {
                    }
                }
                J = false;
                if (!J) {
                }
            }
        }
        if (this.p) {
            aa60Var.K0(PostActions.ACTION_OPEN_PROFILE.h(), R.string.news_entry_menu_item_show_profile);
        }
        if (this.k) {
            boolean z5 = (BuildInfo.s() && (newsEntry instanceof Post)) ? !((Post) newsEntry).b9() : false;
            boolean s3 = BuildInfo.s();
            if (newsEntry instanceof Post) {
                Post post2 = (Post) newsEntry;
                owner = post2.q;
                if (owner == null) {
                    owner = post2.o;
                }
            } else {
                owner = newsEntry instanceof Videos ? ((Videos) newsEntry).m : null;
            }
            if (z5 && owner != null && owner.o && s3 && !o25.a().a(owner.b)) {
                aa60Var.K0(PostActions.ACTION_WRITE_OWNER.h(), fkq0.d(owner.b) ? R.string.newsfeed_write_post_owner : R.string.newsfeed_write_post_group);
            }
        }
        p960Var.getClass();
        if (newsEntry2 instanceof DiscoverMediaBlock) {
            DiscoverGridItem Eb2 = ((DiscoverMediaBlock) newsEntry2).Eb(newsEntry);
            if (Eb2 instanceof VideoDiscoverGridItem) {
                videoFile = ((VideoDiscoverGridItem) Eb2).j.k;
            }
        }
        if (videoFile instanceof Photos) {
            Photos photos = (Photos) videoFile;
            if (photos.r == 1) {
                Attachment R1 = photos.R1();
                if (R1 != null) {
                }
            }
        }
        if (videoFile instanceof VideoFile) {
            VideoFile videoFile3 = videoFile;
            if (!egd.b(videoFile3)) {
            }
            z = true;
            if (this.q && !z) {
                aa60Var.K0(PostActions.ACTION_SHARE.h(), R.string.news_entry_menu_item_share);
            }
            z2 = newsEntry instanceof Post;
            if (!z2) {
                c(newsEntry, aa60Var);
                Post post3 = (Post) newsEntry;
                if (post3.l.zb(PlaybackStateCompat.ACTION_SET_REPEAT_MODE)) {
                    if (post3.l.zb(PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED)) {
                        aa60Var.K0(PostActions.ACTION_PUSH_UNSUBSCRIBE.h(), R.string.unsubscribe_from_posts);
                    } else {
                        aa60Var.K0(PostActions.ACTION_PUSH_SUBSCRIBE.h(), R.string.subscribe_to_posts);
                    }
                }
            } else if (newsEntry instanceof PromoPost) {
                c(((PromoPost) newsEntry).n, aa60Var);
            } else if (newsEntry instanceof Videos) {
                c(newsEntry, aa60Var);
            }
            if (this.r) {
                if (z2 ? ((Post) newsEntry).l.zb(8589934592L) : newsEntry instanceof PromoPost ? ((PromoPost) newsEntry).n.l.zb(8589934592L) : true) {
                    if (!((newsEntry2 instanceof Digest) && newsEntry2 != newsEntry)) {
                        if ((((!(newsEntry instanceof l490) || (s2 = ((l490) newsEntry).s()) == null) ? null : s2.b) == null ? true : !o25.a().a(r4)) && d(newsEntry)) {
                            aa60Var.K0(PostActions.ACTION_IGNORE.h(), R.string.hide_not_interesting);
                        }
                    }
                }
            }
            if (this.n) {
                if ((z2 ? ((Post) newsEntry).l.zb(8589934592L) : newsEntry instanceof PromoPost ? ((PromoPost) newsEntry).n.l.zb(8589934592L) : true) && newsEntry.d) {
                    if (!((newsEntry2 instanceof Digest) && newsEntry2 != newsEntry)) {
                        if ((((!(newsEntry instanceof l490) || (s = ((l490) newsEntry).s()) == null) ? null : s.b) == null ? true : !o25.a().a(r4)) && d(newsEntry)) {
                            aa60Var.K0(PostActions.ACTION_UNIGNORE.h(), R.string.news_entry_menu_item_unignore);
                        }
                    }
                }
            }
            if (this.g) {
                Post post4 = z2 ? (Post) newsEntry : null;
                if (post4 != null && (flags2 = post4.l) != null && flags2.zb(16L)) {
                    aa60Var.K0(PostActions.ACTION_DOUBT_CATEGORY.h(), R.string.newsfeed_incorrect_category);
                }
            }
            if (z2) {
                Post post5 = (Post) newsEntry;
                if (this.m && rv60.a(post5) && !post5.l.zb(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM)) {
                    aa60Var.K0(PostActions.ACTION_EDIT.h(), R.string.edit);
                }
                Flags flags3 = post5.l;
                if (flags3.zb(2147483648L) && o25.a().a(post5.m)) {
                    aa60Var.K0(PostActions.ACTION_EDIT_BEST_FRIENDS.h(), R.string.newsfeed_edit_best_friends);
                }
                if (flags3.zb(PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH)) {
                    aa60Var.K0(PostActions.ACTION_TOGGLE_PINNED.h(), flags3.zb(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) ? R.string.post_unfix : R.string.post_fix);
                }
                if (flags3.zb(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH)) {
                    int h2 = PostActions.ACTION_PUBLISH_POSTPONED.h();
                    Context context2 = e43.a;
                    if (context2 == null) {
                        context2 = null;
                    }
                    aa60Var.z0(0, new y960(h2, context2.getText(R.string.publish_now)));
                } else if (post5.Lb() || flags3.zb(16777216L)) {
                    aa60Var.K0(PostActions.ACTION_TOGGLE_COMMENTS.h(), !post5.Lb() ? R.string.post_open_comments : R.string.post_close_comments);
                }
                if (flags3.zb(1073741824L)) {
                    aa60Var.K0(PostActions.ACTION_PUBLISH_FREE_COPY.h(), R.string.donut_publish_free_copy);
                }
                if (post5.D != null) {
                    aa60Var.K0(PostActions.ACTION_OPEN_ORIGINAL_POST.h(), R.string.show_original_post);
                }
            }
            if (this.l) {
                int zb = newsEntry.zb();
                if (zb != 11 && zb != 20) {
                    if (zb == 0) {
                        Post post6 = newsEntry instanceof Post ? (Post) newsEntry : null;
                        if (post6 != null) {
                        }
                    }
                    z3 = true;
                    if (zb != 0) {
                        if (z3) {
                            fsx0 fsx0Var = newsEntry instanceof fsx0 ? (fsx0) newsEntry : null;
                            if (fsx0Var != null && (N7 = fsx0Var.N7()) != null && N7.size() == 1) {
                                z3 = true;
                            }
                        }
                    }
                    if (z3) {
                        aa60Var.K0(PostActions.ACTION_COPY_LINK.h(), R.string.copy_link);
                    }
                    badgeable = !(newsEntry instanceof Badgeable) ? (Badgeable) newsEntry : null;
                    if ((badgeable == null ? badgeable.ca() : null) != null && this.i) {
                        aa60Var.K0(PostActions.ACTION_SEND_BADGE.h(), R.string.newsfeed_post_send_donut);
                    }
                    post = !z2 ? (Post) newsEntry : null;
                    if (post != null && (flags = post.l) != null && flags.zb(536870912L) && this.s) {
                        aa60Var.K0(PostActions.ACTION_SHOW_STATS.h(), R.string.news_entry_menu_item_post_stat);
                    }
                    if (this.f) {
                        if (newsEntry instanceof ShitAttachment) {
                            h = PostActions.ACTION_HIDE_AD.h();
                        } else if (newsEntry instanceof Html5Entry) {
                            h = PostActions.ACTION_HIDE_AD_HTML.h();
                        } else if (newsEntry instanceof PromoPost) {
                            h = PostActions.ACTION_HIDE_AD_PROMO_POST.h();
                        }
                        aa60Var.K0(h, R.string.hide);
                    }
                    if (this.e && tni.e(newsEntry, false)) {
                        aa60Var.K0(PostActions.ACTION_REPORT.h(), R.string.report_content);
                    }
                    if (z2) {
                        Post post7 = (Post) newsEntry;
                        if (qr.f(post7.m) && post7.l.zb(268435456L)) {
                            if (post7.ec()) {
                                aa60Var.K0(PostActions.ACTION_REMOVE_FROM_ARCHIVE.h(), R.string.remove_post_from_archive);
                            } else {
                                aa60Var.K0(PostActions.ACTION_ADD_TO_ARCHIVE.h(), R.string.add_post_to_archive);
                            }
                        }
                    }
                    if (this.j) {
                        if (z2) {
                            Post post8 = (Post) newsEntry;
                            if (!post8.l.zb(549755813888L)) {
                                a = (post8.l.zb(64L) || o25.a().a(post8.m)) ? true : o25.a().a(post8.o.b);
                                if (a) {
                                    if (z2) {
                                        Post post9 = (Post) newsEntry;
                                        boolean zb2 = post9.l.zb(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH);
                                        boolean zb3 = post9.l.zb(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                                        i = R.string.remove_post;
                                        if ((zb2 || zb3) && !o25.a().a(post9.p) && !o25.a().a(post9.m)) {
                                            i = R.string.decline_post;
                                        }
                                    } else {
                                        i = R.string.delete;
                                    }
                                    aa60Var.K0(PostActions.ACTION_REMOVE.h(), i);
                                }
                                str = !(newsEntry instanceof ShitAttachment) ? ((ShitAttachment) newsEntry).P : newsEntry instanceof PromoPost ? ((PromoPost) newsEntry).r : null;
                                if (str != null && str.length() != 0) {
                                    aa60Var.x0(new y960(PostActions.ACTION_SHOW_AD_DEBUG_INFO.h(), "Ads Debug"));
                                }
                                e = di60.e(newsEntry);
                                if (!(e != null || e.length() == 0)) {
                                    aa60Var.K0(PostActions.ACTION_SHOW_ADVERTISER_INFO.h(), R.string.show_advertiser_info);
                                }
                                b = di60.b(newsEntry);
                                if (b != null && b.length() != 0) {
                                    int h3 = PostActions.ACTION_COPY_AD_MARKER.h();
                                    Context context3 = e43.a;
                                    aa60Var.x0(new y960(h3, (context3 == null ? context3 : null).getString(R.string.ad_marker_template, di60.b(newsEntry))));
                                }
                                if (myc0.f(di60.t(newsEntry))) {
                                    aa60Var.K0(PostActions.ACTION_OPEN_RECOMMENDATION_URL.h(), R.string.ads_recommendations_info);
                                }
                                if (myc0.f(di60.d(newsEntry))) {
                                    aa60Var.K0(PostActions.ACTION_COPY_ADS_URL.h(), R.string.ads_copy_url);
                                }
                                return a2;
                            }
                        } else if (newsEntry instanceof l490) {
                            Owner s4 = ((l490) newsEntry).s();
                            UserId userId = s4 != null ? s4.b : null;
                            if (userId != null) {
                                a = o25.a().a(userId);
                                if (a) {
                                }
                                if (!(newsEntry instanceof ShitAttachment)) {
                                }
                                if (str != null) {
                                    aa60Var.x0(new y960(PostActions.ACTION_SHOW_AD_DEBUG_INFO.h(), "Ads Debug"));
                                }
                                e = di60.e(newsEntry);
                                if (!(e != null || e.length() == 0)) {
                                }
                                b = di60.b(newsEntry);
                                if (b != null) {
                                    int h32 = PostActions.ACTION_COPY_AD_MARKER.h();
                                    Context context32 = e43.a;
                                    aa60Var.x0(new y960(h32, (context32 == null ? context32 : null).getString(R.string.ad_marker_template, di60.b(newsEntry))));
                                }
                                if (myc0.f(di60.t(newsEntry))) {
                                }
                                if (myc0.f(di60.d(newsEntry))) {
                                }
                                return a2;
                            }
                        }
                    }
                    a = false;
                    if (a) {
                    }
                    if (!(newsEntry instanceof ShitAttachment)) {
                    }
                    if (str != null) {
                    }
                    e = di60.e(newsEntry);
                    if (!(e != null || e.length() == 0)) {
                    }
                    b = di60.b(newsEntry);
                    if (b != null) {
                    }
                    if (myc0.f(di60.t(newsEntry))) {
                    }
                    if (myc0.f(di60.d(newsEntry))) {
                    }
                    return a2;
                }
                z3 = false;
                if (zb != 0) {
                }
                if (z3) {
                }
                if (!(newsEntry instanceof Badgeable)) {
                }
                if ((badgeable == null ? badgeable.ca() : null) != null) {
                    aa60Var.K0(PostActions.ACTION_SEND_BADGE.h(), R.string.newsfeed_post_send_donut);
                }
                if (!z2) {
                }
                if (post != null) {
                    aa60Var.K0(PostActions.ACTION_SHOW_STATS.h(), R.string.news_entry_menu_item_post_stat);
                }
                if (this.f) {
                }
                if (this.e) {
                    aa60Var.K0(PostActions.ACTION_REPORT.h(), R.string.report_content);
                }
                if (z2) {
                }
                if (this.j) {
                }
                a = false;
                if (a) {
                }
                if (!(newsEntry instanceof ShitAttachment)) {
                }
                if (str != null) {
                }
                e = di60.e(newsEntry);
                if (!(e != null || e.length() == 0)) {
                }
                b = di60.b(newsEntry);
                if (b != null) {
                }
                if (myc0.f(di60.t(newsEntry))) {
                }
                if (myc0.f(di60.d(newsEntry))) {
                }
                return a2;
            }
            z3 = false;
            if (z3) {
            }
            if (!(newsEntry instanceof Badgeable)) {
            }
            if ((badgeable == null ? badgeable.ca() : null) != null) {
            }
            if (!z2) {
            }
            if (post != null) {
            }
            if (this.f) {
            }
            if (this.e) {
            }
            if (z2) {
            }
            if (this.j) {
            }
            a = false;
            if (a) {
            }
            if (!(newsEntry instanceof ShitAttachment)) {
            }
            if (str != null) {
            }
            e = di60.e(newsEntry);
            if (!(e != null || e.length() == 0)) {
            }
            b = di60.b(newsEntry);
            if (b != null) {
            }
            if (myc0.f(di60.t(newsEntry))) {
            }
            if (myc0.f(di60.d(newsEntry))) {
            }
            return a2;
        }
        z = false;
        if (this.q) {
            aa60Var.K0(PostActions.ACTION_SHARE.h(), R.string.news_entry_menu_item_share);
        }
        z2 = newsEntry instanceof Post;
        if (!z2) {
        }
        if (this.r) {
        }
        if (this.n) {
        }
        if (this.g) {
        }
        if (z2) {
        }
        if (this.l) {
        }
        z3 = false;
        if (z3) {
        }
        if (!(newsEntry instanceof Badgeable)) {
        }
        if ((badgeable == null ? badgeable.ca() : null) != null) {
        }
        if (!z2) {
        }
        if (post != null) {
        }
        if (this.f) {
        }
        if (this.e) {
        }
        if (z2) {
        }
        if (this.j) {
        }
        a = false;
        if (a) {
        }
        if (!(newsEntry instanceof ShitAttachment)) {
        }
        if (str != null) {
        }
        e = di60.e(newsEntry);
        if (!(e != null || e.length() == 0)) {
        }
        b = di60.b(newsEntry);
        if (b != null) {
        }
        if (myc0.f(di60.t(newsEntry))) {
        }
        if (myc0.f(di60.d(newsEntry))) {
        }
        return a2;
    }

    @Override // com.vk.newsfeed.common.util.a
    public final a b(z960 z960Var) {
        this.t = z960Var;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r0 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(NewsEntry newsEntry, aa60 aa60Var) {
        Object obj;
        if (newsEntry instanceof Post) {
            boolean Mb = ((Post) newsEntry).Mb();
            obj = newsEntry;
        } else {
            if (newsEntry instanceof Videos) {
                Videos videos = (Videos) newsEntry;
                VideoAttachment Nb = videos.Nb();
                if (videos.Ea()) {
                    obj = Nb;
                }
            }
            obj = null;
        }
        if (this.h && hd60.a().D() && obj != null) {
            aa60Var.K0(PostActions.ACTION_TOGGLE_FAVE.h(), ((gmq) obj).X() ? R.string.fave_remove_title : R.string.fave_add_title);
        }
    }
}
