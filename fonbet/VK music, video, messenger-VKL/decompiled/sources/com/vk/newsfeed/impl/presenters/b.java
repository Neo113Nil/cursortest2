package com.vk.newsfeed.impl.presenters;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.Ad;
import com.vk.api.comments.CommentsOrder;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.likes.LikesGetList;
import com.vk.audience.api.di.AudienceResearchComponent;
import com.vk.audience.api.domain.AudienceResearchSurfaceCode;
import com.vk.common.links.LinksParserData;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.badges.BadgeInfo;
import com.vk.dto.badges.Badgeable;
import com.vk.dto.badges.BadgesSet;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.LikeInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Caption;
import com.vk.dto.newsfeed.CommentsInfo;
import com.vk.dto.newsfeed.Counters;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.NewsfeedData;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.newsfeed.TagConfirmation;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoTag;
import com.vk.dto.user.UserProfile;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.NewsfeedResearchEvent;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.lists.ListDataSet;
import com.vk.log.L;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.newsfeed.api.data.VideoStatistic;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.newsfeed.common.presentation.model.items.CoownershipStatusUiDto;
import com.vk.newsfeed.common.util.j;
import com.vk.newsfeed.common.util.k;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.story.api.di.StoriesComponent;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.PodcastAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.k0;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.functions.l;
import io.reactivex.rxjava3.internal.operators.observable.f0;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import io.reactivex.rxjava3.internal.operators.single.n;
import io.reactivex.rxjava3.internal.operators.single.r;
import io.reactivex.rxjava3.internal.operators.single.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.a040;
import xsna.a2o;
import xsna.ab60;
import xsna.ahn;
import xsna.arb0;
import xsna.asu0;
import xsna.azt;
import xsna.b1z;
import xsna.bbw;
import xsna.bo8;
import xsna.bws;
import xsna.c5g;
import xsna.c6z;
import xsna.c86;
import xsna.c950;
import xsna.c9c0;
import xsna.c9x0;
import xsna.ce60;
import xsna.cf00;
import xsna.cx6;
import xsna.d230;
import xsna.d2f0;
import xsna.d9c0;
import xsna.dh40;
import xsna.di60;
import xsna.dqu;
import xsna.drm0;
import xsna.e1r0;
import xsna.e3m;
import xsna.e7q0;
import xsna.e810;
import xsna.ek40;
import xsna.epx;
import xsna.erm0;
import xsna.es00;
import xsna.ewa;
import xsna.f1s;
import xsna.f540;
import xsna.f5y;
import xsna.fc0;
import xsna.fgj0;
import xsna.fkg;
import xsna.fkq0;
import xsna.fpf0;
import xsna.fv90;
import xsna.fz2;
import xsna.gky;
import xsna.gmq;
import xsna.gns0;
import xsna.gz30;
import xsna.hd60;
import xsna.hfg;
import xsna.his0;
import xsna.hs00;
import xsna.i2c0;
import xsna.iag;
import xsna.icg;
import xsna.iuc0;
import xsna.izs;
import xsna.j2r0;
import xsna.j5g;
import xsna.j630;
import xsna.jsv;
import xsna.juz;
import xsna.k1c0;
import xsna.k7m;
import xsna.k7z;
import xsna.k82;
import xsna.ki10;
import xsna.kl60;
import xsna.l1c0;
import xsna.l490;
import xsna.lfg;
import xsna.lgj0;
import xsna.lh3;
import xsna.m1c0;
import xsna.m3a;
import xsna.m3y;
import xsna.m7m;
import xsna.mfg;
import xsna.msy;
import xsna.mzp0;
import xsna.n3t;
import xsna.na60;
import xsna.nex;
import xsna.nr2;
import xsna.o2f0;
import xsna.o9c0;
import xsna.odg0;
import xsna.ol60;
import xsna.p6s;
import xsna.p7f;
import xsna.p870;
import xsna.p9c0;
import xsna.ph60;
import xsna.pij0;
import xsna.pkt0;
import xsna.pq3;
import xsna.puk;
import xsna.puq0;
import xsna.q1c0;
import xsna.q5w;
import xsna.q9;
import xsna.qa60;
import xsna.qb6;
import xsna.qg60;
import xsna.qr;
import xsna.r74;
import xsna.r9c0;
import xsna.rm0;
import xsna.rpu;
import xsna.rsg0;
import xsna.rv60;
import xsna.rvq;
import xsna.s1c0;
import xsna.s3q0;
import xsna.s520;
import xsna.s620;
import xsna.s6x;
import xsna.sa4;
import xsna.sn;
import xsna.sq;
import xsna.svz;
import xsna.t11;
import xsna.t3v;
import xsna.t6g0;
import xsna.t9c0;
import xsna.u110;
import xsna.u1c0;
import xsna.u1r0;
import xsna.u9c0;
import xsna.uv20;
import xsna.ux00;
import xsna.v1v;
import xsna.w8i;
import xsna.wa5;
import xsna.wfj0;
import xsna.wjs0;
import xsna.wmi0;
import xsna.x150;
import xsna.x550;
import xsna.xa60;
import xsna.xqu;
import xsna.xs6;
import xsna.xxi;
import xsna.y89;
import xsna.yfb;
import xsna.yfg;
import xsna.yw4;
import xsna.zou;

/* compiled from: PostViewPresenter.kt */
/* loaded from: classes4.dex */
public class b implements c9c0, w8i {
    public final int A;
    public int B;
    public int C;
    public UserProfile D;
    public final pij0.a E;
    public final yfg F;
    public final ListDataSet<u1c0> G;
    public lfg H;
    public final gky I;
    public final gz30 J;
    public final azt K;
    public final juz L;
    public final d230 M;
    public final s6x N;
    public final u1r0 O;
    public final j2r0 P;
    public final dqu Q;
    public final i2c0 R;
    public final j S;
    public final k1c0 T;
    public final m3a U;
    public final ek40 V;
    public io.reactivex.rxjava3.disposables.c W;
    public final io.reactivex.rxjava3.disposables.b X;
    public final MusicPlaybackLaunchContext Y;
    public final LinksParserData Z;
    public final Object a0;
    public final FragmentImpl b;
    public final mzp0 c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public boolean k;
    public NewsEntry l;
    public Long m;
    public String n;
    public String o;
    public int p;
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;
    public String u;
    public String v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    /* compiled from: PostViewPresenter.kt */
    public static final class a implements izs {
        public final /* synthetic */ UserId c;

        public a(UserId userId) {
            this.c = userId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.izs
        public final Object invoke(Object obj) {
            b bVar = b.this;
            NewsEntry newsEntry = bVar.l;
            l490 l490Var = newsEntry instanceof l490 ? (l490) newsEntry : null;
            Owner s = l490Var != null ? l490Var.s() : null;
            if (fkq0.b(this.c)) {
                Group group = obj instanceof Group ? (Group) obj : null;
                if (s != null && group != null) {
                    s.e = group.e;
                    s.c = group.d;
                    bVar.N3();
                }
            } else {
                UserProfile userProfile = obj instanceof UserProfile ? (UserProfile) obj : null;
                if (s != null && userProfile != null) {
                    s.u(userProfile.l0());
                    bVar.N3();
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: PostViewPresenter.kt */
    /* renamed from: com.vk.newsfeed.impl.presenters.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C1402b extends FunctionReferenceImpl implements izs<UserId, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(UserId userId) {
            UserId userId2 = userId;
            b bVar = (b) this.receiver;
            Parcelable parcelable = bVar.l;
            l490 l490Var = parcelable instanceof l490 ? (l490) parcelable : null;
            Owner s = l490Var != null ? l490Var.s() : null;
            if (epx.f(userId2, s != null ? s.b : null)) {
                s.q = false;
                bVar.N3();
            }
            return s3q0.a;
        }
    }

    /* compiled from: PostViewPresenter.kt */
    public static final class c implements l {
        public final /* synthetic */ arb0 b;

        public c(arb0 arb0Var) {
            this.b = arb0Var;
        }

        @Override // io.reactivex.rxjava3.functions.l
        public final /* synthetic */ Object apply(Object obj) {
            return this.b.invoke(obj);
        }
    }

    /* compiled from: PostViewPresenter.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(d9c0 d9c0Var, mzp0 mzp0Var) {
        this.b = (FragmentImpl) d9c0Var;
        this.c = mzp0Var;
        c950 c950Var = new c950(this, 17);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d = msy.a(lazyThreadSafetyMode, c950Var);
        this.e = msy.a(lazyThreadSafetyMode, new xs6(20));
        this.f = msy.a(lazyThreadSafetyMode, new a040(this, 21));
        this.g = msy.a(lazyThreadSafetyMode, new f540(this, 13));
        this.h = msy.a(lazyThreadSafetyMode, new x550(this, 15));
        this.i = msy.a(lazyThreadSafetyMode, new b1z(this, 13));
        Lazy a2 = msy.a(lazyThreadSafetyMode, new cf00(this, 17));
        this.j = a2;
        this.n = "";
        this.o = Ad.d;
        this.s = true;
        this.A = 1;
        this.E = new pij0.a(new u110(this, 11));
        this.F = new yfg(new wa5(this, 10));
        this.G = new ListDataSet<>();
        this.I = new gky(18);
        this.J = new gz30(7);
        this.K = new azt(19);
        this.L = new juz(13);
        this.M = new d230(6);
        this.N = new s6x(20);
        this.O = new u1r0();
        this.P = new j2r0();
        this.Q = new dqu();
        this.R = new i2c0(new ph60((a2o) a2.getValue()), (a2o) a2.getValue());
        this.S = new j();
        k1c0 k1c0Var = new k1c0();
        k1c0Var.a = CoownershipStatusUiDto.None;
        k1c0Var.b = EmptyList.b;
        this.T = k1c0Var;
        this.U = new m3a(k1c0Var);
        this.V = new ek40();
        this.X = new io.reactivex.rxjava3.disposables.b();
        this.Y = MusicPlaybackLaunchContext.r.Eb(128);
        this.Z = hd60.a().W0();
        this.a0 = msy.a(lazyThreadSafetyMode, new k7z(this, 26));
        his0.d++;
        if (his0.c == null || !(!r5.h())) {
            his0.c = wjs0.b.a0(asu0.a.d()).subscribe(new e7q0(new puq0(4), 5));
        }
    }

    public static NewsEntry d0(NewsEntry newsEntry) {
        if (newsEntry instanceof Post) {
            Serializer.c<Post> cVar = Post.CREATOR;
            return Post.a.b((Post) newsEntry);
        }
        if (!(newsEntry instanceof PromoPost)) {
            return newsEntry;
        }
        PromoPost promoPost = (PromoPost) newsEntry;
        Serializer.c<Post> cVar2 = Post.CREATOR;
        PromoPost Eb = PromoPost.Eb(promoPost, Post.a.b(promoPost.n));
        Eb.c = newsEntry.c;
        Eb.g = newsEntry.g;
        Eb.h = newsEntry.h;
        return Eb;
    }

    public final void D0(p6s p6sVar) {
        s620 s620Var = new s620(this.K, 1);
        ListDataSet<u1c0> listDataSet = this.G;
        int w = listDataSet.w(s620Var);
        if (w >= 0) {
            new d2f0();
            u1c0 c2 = listDataSet.c(w);
            Parcelable parcelable = c2 != null ? c2.b : null;
            c6z c6zVar = parcelable instanceof c6z ? (c6z) parcelable : null;
            Parcelable parcelable2 = this.l;
            c6z c6zVar2 = parcelable2 instanceof c6z ? (c6z) parcelable2 : null;
            if (epx.f(c6zVar, c6zVar2) && c6zVar != null && c6zVar2 != null) {
                d2f0.d(c6zVar, c6zVar2);
            }
            if (p6sVar != null) {
                listDataSet.e(w, p6sVar);
            } else {
                listDataSet.d(w);
            }
        }
    }

    @Override // xsna.c9c0
    public void D1(List<LikeInfo> list) {
        int i;
        VideoAttachment videoAttachment;
        if (this.w) {
            return;
        }
        NewsEntry newsEntry = this.l;
        s1c0 M0 = i0().M0();
        boolean z = M0.d;
        xxi xxiVar = new xxi(new kl60(10), 1);
        ListDataSet<u1c0> listDataSet = this.G;
        int w = listDataSet.w(xxiVar);
        if (w >= 0) {
            listDataSet.c(w).g = list;
            listDataSet.d(w);
            return;
        }
        if (newsEntry == null || !z) {
            return;
        }
        if ((newsEntry instanceof Videos) && (videoAttachment = (VideoAttachment) j5g.a0(((Videos) newsEntry).Pb())) != null && videoAttachment.C2()) {
            i = 341;
        } else if (list.isEmpty()) {
            return;
        } else {
            i = 73;
        }
        u1c0 u1c0Var = new u1c0(i, newsEntry);
        u1c0Var.g = list;
        u1c0Var.n = M0;
        listDataSet.x(0, u1c0Var);
    }

    @Override // xsna.c9c0
    public final void H3() {
        ki10 ki10Var = new ki10(this.L, 1);
        ListDataSet<u1c0> listDataSet = this.G;
        int w = listDataSet.w(ki10Var);
        if (w >= 0) {
            u1c0 c2 = listDataSet.c(w);
            pij0.a aVar = this.E;
            aVar.a = false;
            c2.g = aVar;
            listDataSet.d(w);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I1(Bundle bundle) {
        Long e;
        if (bundle == null) {
            return;
        }
        mzp0 mzp0Var = this.c;
        if (mzp0Var != null) {
            mzp0Var.a();
        }
        this.p = bundle.getInt("arg_start_comment_id");
        this.q = bundle.getInt("arg_parent_comment_id");
        this.r = bundle.getBoolean("scroll_to_comments");
        this.s = bundle.getBoolean("arg_can_share_on_wall", true);
        this.C = bundle.getInt("tag_id");
        this.n = bundle.getString("referrer", "");
        this.o = bundle.getString("referrer", "");
        this.w = bundle.getBoolean("arg_is_footer_disabled", false);
        this.x = bundle.getBoolean("arg_is_order_info_disabled", false);
        this.y = bundle.getBoolean("show_comments_count", false);
        this.z = bundle.getBoolean("start_from_parent", false);
        int i = bundle.getInt("entry_type");
        if (i != 1) {
            if (i == 2) {
                i0().setTitle(R.string.video);
            } else if (i != 7 && i != 9) {
                i0().setTitle(R.string.wall_view);
            }
            e = bo8.e(bundle, "entry_key");
            if (e == null) {
                long longValue = e.longValue();
                Serializer.c<NewsfeedData> cVar = NewsfeedData.CREATOR;
                this.X.b(new n(NewsfeedData.a.f(longValue), new jsv(new bbw(this, 23), 16)).n(p0(bundle)).subscribe(new n3t(new rm0(25, this, bundle), 17), new ux00(new fv90(this, 10), 14)));
            } else {
                NewsEntry newsEntry = (NewsEntry) bundle.getParcelable("entry");
                NewsEntry d0 = newsEntry != null ? d0(newsEntry) : null;
                if (d0 != null) {
                    h1(bundle, d0);
                } else {
                    f0(bundle);
                }
            }
            this.m = e;
        }
        i0().setTitle(R.string.photo);
        e = bo8.e(bundle, "entry_key");
        if (e == null) {
        }
        this.m = e;
    }

    @Override // xsna.c9c0
    public final void J4(Post post) {
        t2(post);
        ce60.b.getClass();
        p870.f().e(101, d0(this.l));
    }

    public final void N3() {
        puk pukVar = new puk(this.I, 1);
        ListDataSet<u1c0> listDataSet = this.G;
        int w = listDataSet.w(pukVar);
        X3(w);
        listDataSet.d(w);
    }

    @Override // xsna.c9c0
    public final void P3() {
        NewsEntry newsEntry = this.l;
        if (newsEntry == null) {
            return;
        }
        ewa ewaVar = new ewa(this.L, 2);
        ListDataSet<u1c0> listDataSet = this.G;
        if (listDataSet.w(ewaVar) >= 0) {
            H3();
            return;
        }
        u1c0 u1c0Var = new u1c0(newsEntry, newsEntry, 74);
        pij0.a aVar = this.E;
        aVar.a = false;
        u1c0Var.g = aVar;
        u1c0Var.n = i0().M0();
        listDataSet.s(u1c0Var);
    }

    public final void S1(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        f0(bundle);
    }

    @Override // xsna.c9c0
    public final void T5() {
        this.k = true;
    }

    public void V2(Videos videos) {
        VideoAttachment Nb = videos.Nb();
        VideoFile videoFile = Nb != null ? Nb.k : null;
        if (videoFile != null) {
            this.X.b((videoFile.C2() ? rsg0.w0(yfb.x(lgj0.a.c(Collections.singletonList(videoFile.a1()), null))).l(new j630(new rvq(19), 12)) : rsg0.w0(new gns0(videoFile.I0(), videoFile.o0(), videoFile.C1())).l(new lh3(new svz(18), 29))).m(asu0.a.d()).subscribe(new qg60(new k82(20, videoFile, this), 8), new m3y(new d(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 13)));
        }
    }

    @Override // xsna.c9c0
    public final void W3(int i) {
        int g0 = g0() + i;
        Parcelable parcelable = this.l;
        c6z c6zVar = parcelable instanceof c6z ? (c6z) parcelable : null;
        if (c6zVar != null) {
            c6zVar.v6(g0);
        }
        g();
    }

    public final void X3(int i) {
        u1c0 c2 = this.G.c(i);
        if (c2 != null) {
            int i2 = c2.c;
            NewsEntry h = na60.h(c2.a);
            NewsEntry h2 = na60.h(c2.b);
            s1c0 s1c0Var = c2.n;
            if (i2 != 302 || s1c0Var == null) {
                return;
            }
            c2.h = (ol60) j5g.a0(new q5w().a(0, new Triple(h, h2, s1c0Var)));
        }
    }

    public final void Y0(Configuration configuration) {
        puk pukVar = new puk(this.I, 1);
        ListDataSet<u1c0> listDataSet = this.G;
        int w = listDataSet.w(pukVar);
        if (w >= 0) {
            X3(w);
            listDataSet.d(w);
        }
        i0().rd(configuration.orientation == 1);
    }

    @Override // xsna.yrn.a
    public final boolean Z(RecyclerView.e0 e0Var) {
        lfg lfgVar = this.H;
        return (lfgVar != null ? lfgVar.P6() : 0) > 0 && (e0Var.getItemViewType() == 73 || e0Var.getItemViewType() == 341);
    }

    public final void Z3(Intent intent) {
        Post R;
        UserId userId;
        lfg lfgVar;
        String action = intent.getAction();
        if (epx.f(action, zou.a)) {
            UserProfile userProfile = (UserProfile) intent.getParcelableExtra(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
            if (userProfile == null || (lfgVar = this.H) == null) {
                return;
            }
            lfgVar.e8(userProfile.c, true);
            return;
        }
        if (epx.f(action, "com.vkontakte.android.STICKERS_ANIMATION_ENABLED_CHANGED")) {
            i0().c4();
            return;
        }
        if (!epx.f(action, "com.vkontakte.android.ACTION_GROUP_STATUS_CHANGED") && !epx.f(action, "com.vkontakte.android.ACTION_FRIEND_STATUS_CHANGED")) {
            if (!epx.f(action, "com.vkontakte.android.DONUT_SUBSCRIPTION_PAID") || (userId = (UserId) intent.getParcelableExtra("id")) == null) {
                return;
            }
            NewsEntry newsEntry = this.l;
            Post R2 = newsEntry != null ? di60.R(newsEntry) : null;
            boolean cc = R2 != null ? R2.cc(userId) : false;
            lfg lfgVar2 = this.H;
            if (lfgVar2 != null) {
                lfgVar2.u8(userId, cc);
                return;
            }
            return;
        }
        NewsEntry newsEntry2 = this.l;
        if (newsEntry2 == null || (R = di60.R(newsEntry2)) == null) {
            return;
        }
        UserId userId2 = (UserId) intent.getParcelableExtra("id");
        Bundle extras = intent.getExtras();
        Integer valueOf = extras != null ? Integer.valueOf(extras.getInt("status")) : null;
        if (userId2 == null || !epx.f(R.m, userId2) || valueOf == null) {
            return;
        }
        R.J = valueOf.intValue() == 0;
        t2(R);
    }

    @Override // xsna.c9c0
    public final void a1() {
        i0().a1();
    }

    public void b(NewsEntry newsEntry, ArrayList<u1c0> arrayList, s1c0 s1c0Var) {
        u1c0 u1c0Var = new u1c0(Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, newsEntry);
        u1c0Var.n = s1c0Var;
        arrayList.add(u1c0Var);
    }

    public final u1c0 e0(NewsEntry newsEntry, String str, List<CommentsOrder.Item> list, s1c0 s1c0Var, int i) {
        u1c0 u1c0Var = new u1c0(newsEntry, newsEntry, i);
        int g0 = g0();
        yfg yfgVar = this.F;
        yfgVar.a = g0;
        yfgVar.b = this.B;
        yfgVar.c = str;
        yfgVar.d = list;
        u1c0Var.g = yfgVar;
        u1c0Var.n = s1c0Var;
        return u1c0Var;
    }

    @Override // xsna.c9c0
    public final void e7() {
        g();
    }

    public final void f0(Bundle bundle) {
        this.X.b(p0(bundle).subscribe(new f5y(new qb6(24, this, bundle), 17), new nex(new r9c0(this, 0), 14)));
    }

    @Override // xsna.c9c0
    public final void f1(int i) {
        int max = Math.max(0, g0() - i);
        Parcelable parcelable = this.l;
        c6z c6zVar = parcelable instanceof c6z ? (c6z) parcelable : null;
        if (c6zVar != null) {
            c6zVar.v6(max);
        }
        g();
    }

    public final void g() {
        NewsEntry newsEntry = this.l;
        if (newsEntry != null) {
            NewsEntry h = na60.h(newsEntry);
            this.l = h;
            ce60 ce60Var = ce60.b;
            qr.d(ce60Var, 102, h);
            Photos photos = h instanceof Photos ? (Photos) h : null;
            if (photos != null) {
                PhotoAttachment Mb = photos.Mb();
                Photo photo = Mb != null ? Mb.l : null;
                if (photo != null) {
                    ce60Var.getClass();
                    p870.f().e(113, photo);
                }
            }
        }
    }

    public final int g0() {
        Parcelable parcelable = this.l;
        c6z c6zVar = parcelable instanceof c6z ? (c6z) parcelable : null;
        if (c6zVar != null) {
            return c6zVar.E1();
        }
        return 0;
    }

    public final boolean h0() {
        PhotoAttachment Mb;
        Photo photo;
        List<PhotoTag> list;
        NewsEntry newsEntry = this.l;
        Photos photos = newsEntry instanceof Photos ? (Photos) newsEntry : null;
        return (photos == null || (Mb = photos.Mb()) == null || (photo = Mb.l) == null || (list = photo.b) == null || !(list.isEmpty() ^ true)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0417 A[LOOP:0: B:169:0x0411->B:171:0x0417, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x025b  */
    /* JADX WARN: Type inference failed for: r14v22, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h1(Bundle bundle, NewsEntry newsEntry) {
        Owner s;
        boolean z;
        boolean z2;
        List<String> g;
        List<String> list;
        NewsEntry newsEntry2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        String str;
        NewsEntry.TrackData trackData;
        int zb;
        String str2;
        Parcelable parcelable;
        UserId userId;
        int zb2;
        LikesGetList.Type type;
        Badgeable badgeable;
        Videos videos;
        VideoStatistic videoStatistic;
        lfg lfgVar;
        ArrayList<EntryAttachment> arrayList;
        Iterator<T> it;
        Iterator it2;
        VideoAttachment videoAttachment;
        VideoFile videoFile;
        BadgesSet u0;
        boolean z7;
        Parcelable parcelable2;
        BadgeInfo p6;
        BadgeInfo p62;
        boolean z8;
        Post post;
        VideoFile videoFile2;
        EntryAttachment entryAttachment;
        VideoAttachment Nb;
        Flags flags;
        boolean f;
        c9x0.b bVar;
        ?? r14;
        List<NewsfeedResearchEvent> f2;
        List<NewsfeedResearchEvent> list2;
        int i = 0;
        mzp0 mzp0Var = this.c;
        if (mzp0Var != null) {
            mzp0Var.c(false);
        }
        this.l = newsEntry;
        UserId b = t11.b();
        int i2 = 1;
        if (newsEntry instanceof Post) {
            boolean z9 = this.t || ((Post) newsEntry).l.zb(64L);
            this.t = z9;
            this.t = z9 || epx.f(((Post) newsEntry).m, b);
        } else if ((newsEntry instanceof l490) && (s = ((l490) newsEntry).s()) != null) {
            UserId userId2 = s.b;
            boolean z10 = this.t || epx.f(userId2, b) || !fkq0.c(userId2);
            this.t = z10;
            if (!z10) {
                t6g0 t6g0Var = t6g0.b;
                if (!t6g0.b().m(userId2)) {
                    z = false;
                    this.t = z;
                }
            }
            z = true;
            this.t = z;
        }
        int zb3 = newsEntry.zb();
        if (zb3 != 1) {
            if (zb3 == 2) {
                VideoAttachment Nb2 = ((Videos) newsEntry).Nb();
                VideoFile videoFile3 = Nb2 != null ? Nb2.k : null;
                if (videoFile3 != null) {
                    this.u = videoFile3.C1();
                    u0(fkq0.d(videoFile3.getUid()) ? videoFile3.getUid() : videoFile3.I0());
                }
            } else if (zb3 != 7 && zb3 != 9) {
                this.u = bundle.getString("access_key");
            }
            this.v = bundle.getString("track_code", null);
            z2 = newsEntry instanceof Post;
            if (!z2) {
                String str3 = k.a;
                k.p((Post) newsEntry, 0, this.o);
            } else if (newsEntry instanceof PromoPost) {
                String str4 = k.a;
                k.p(((PromoPost) newsEntry).n, 0, this.o);
            }
            g = di60.g(newsEntry);
            list = g;
            if (list != null && !list.isEmpty()) {
                AudienceResearchSurfaceCode a2 = sa4.a(newsEntry, MobileOfficialAppsCoreNavStat$EventScreen.FEED_POST);
                r14 = this.i;
                s sVar = new s(nr2.v(a2, g, ((AudienceResearchComponent) r14.getValue()).Z2()), new u9c0(new e810(this, 18), i));
                asu0.a.getClass();
                i0().a(sVar.q(asu0.i()).subscribe());
                f2 = di60.f(newsEntry);
                list2 = f2;
                if (list2 != null && !list2.isEmpty()) {
                    i0().a(pq3.r(((AudienceResearchComponent) r14.getValue()).b(), f2).q(asu0.i()).subscribe());
                }
            }
            x(newsEntry);
            i0().Il(this.G.t(new c86(this.N, i2)) != null);
            Bundle bundle2 = new Bundle();
            newsEntry2 = this.l;
            if (newsEntry2 != 0) {
                z3 = z2;
            } else {
                Post R = di60.R(newsEntry2);
                if (R == null || (flags = R.l) == null) {
                    z3 = z2;
                } else {
                    z3 = z2;
                    if (flags.zb(PlaybackStateCompat.ACTION_PREPARE_FROM_URI)) {
                        z4 = true;
                        z5 = newsEntry2 instanceof Videos;
                        z6 = (z5 || (Nb = ((Videos) newsEntry2).Nb()) == null || !Nb.C2()) ? false : true;
                        if (z6) {
                            Post R2 = di60.R(newsEntry2);
                            str = (R2 == null || (trackData = R2.L) == null) ? null : trackData.b;
                        } else {
                            str = this.v;
                        }
                        zb = newsEntry2.zb();
                        if (zb != 9) {
                            zb = 1;
                        } else if (z6) {
                            zb = 6;
                        }
                        Parcelable parcelable3 = this.l;
                        c6z c6zVar = !(parcelable3 instanceof c6z) ? (c6z) parcelable3 : null;
                        bundle2.putBoolean("arg_can_comment", c6zVar == null && c6zVar.l0());
                        bundle2.putBoolean("arg_show_only_comments", i0().M0().d);
                        if (z5) {
                            ArrayList<EntryAttachment> arrayList2 = ((Videos) newsEntry2).o;
                            boolean z11 = arrayList2 != null && arrayList2.size() == 1;
                            Attachment attachment = (arrayList2 == null || (entryAttachment = (EntryAttachment) j5g.a0(arrayList2)) == null) ? null : entryAttachment.b;
                            VideoAttachment videoAttachment2 = attachment instanceof VideoAttachment ? (VideoAttachment) attachment : null;
                            boolean z12 = (videoAttachment2 == null || (videoFile2 = videoAttachment2.k) == null || !videoFile2.C5()) ? false : true;
                            if (z11 && z12) {
                                str2 = "comment_in_sport_broadcast";
                                bundle2.putString("arg_on_comment_mytracker_event", str2);
                                bundle2.putBoolean("arg_can_group_comment", z4);
                                Parcelable parcelable4 = this.l;
                                bundle2.putBoolean("arg_can_share_comments", ((parcelable4 instanceof Post) || !((Post) parcelable4).l.zb(512L)) && (parcelable4 instanceof c6z) && ((c6z) parcelable4).b9());
                                bundle2.putBoolean("arg_can_share_comments_link", zb == 6);
                                bundle2.putBoolean("arg_dismiss_on_opening_video", i0().M0().e);
                                bundle2.putInt("id", di60.n(newsEntry2));
                                bundle2.putParcelable("owner_id", q());
                                bundle2.putInt("arg_start_comment_id", this.p);
                                bundle2.putInt("arg_parent_comment_id", this.q);
                                bundle2.putInt("type", zb);
                                parcelable = this.l;
                                if (parcelable instanceof l490) {
                                    Owner s2 = ((l490) parcelable).s();
                                    if (s2 == null || (userId = s2.b) == null) {
                                        userId = UserId.d;
                                    }
                                } else {
                                    userId = UserId.d;
                                }
                                bundle2.putParcelable("uid", userId);
                                zb2 = newsEntry2.zb();
                                if (!(newsEntry2 instanceof Post) && (post = ((Post) newsEntry2).D) != null && post.hc()) {
                                    type = LikesGetList.Type.COMMENT;
                                } else if (zb2 != 0) {
                                    if (zb2 != 1) {
                                        if (zb2 == 2) {
                                            type = LikesGetList.Type.VIDEO;
                                        } else if (zb2 != 7 && zb2 != 9) {
                                            type = zb2 != 12 ? LikesGetList.Type.POST : LikesGetList.Type.POST_ADS;
                                        }
                                    }
                                    type = LikesGetList.Type.PHOTO;
                                } else {
                                    type = LikesGetList.Type.POST;
                                }
                                bundle2.putString("arg_item_likes_type", type.i());
                                bundle2.putString("access_key", this.u);
                                bundle2.putString("ref_source", this.n);
                                bundle2.putString("referrer", this.o);
                                bundle2.putString("track_code", str);
                                bundle2.putBoolean("scroll_to_comments", this.r);
                                bundle2.putBoolean("arg_can_share_on_wall", this.s);
                                bundle2.putBoolean("arg_start_from_parent", this.z);
                                badgeable = newsEntry2 instanceof Badgeable ? (Badgeable) newsEntry2 : null;
                                if (badgeable != null && (u0 = badgeable.u0()) != null) {
                                    bundle2.putInt("arg_badgeable_post_type", u0.d);
                                    if (!u0.h) {
                                        Parcelable parcelable5 = this.l;
                                        if (parcelable5 != null) {
                                            if (parcelable5 instanceof Post) {
                                                BadgeInfo badgeInfo = ((Post) parcelable5).d0;
                                                if (badgeInfo != null) {
                                                    z8 = badgeInfo.b;
                                                    if (!z8) {
                                                        z7 = false;
                                                        bundle2.putBoolean("arg_badgeable_disabled", z7);
                                                        parcelable2 = this.l;
                                                        if (parcelable2 != null) {
                                                            if (parcelable2 instanceof Post) {
                                                                p6 = ((Post) parcelable2).d0;
                                                            } else if (parcelable2 instanceof iag) {
                                                                p6 = ((iag) parcelable2).p6();
                                                            }
                                                            bundle2.putParcelable("arg_badgeable_info", p6);
                                                        }
                                                        p6 = null;
                                                        bundle2.putParcelable("arg_badgeable_info", p6);
                                                    }
                                                }
                                            } else if ((parcelable5 instanceof iag) && (p62 = ((iag) parcelable5).p6()) != null) {
                                                z8 = p62.b;
                                                if (!z8) {
                                                }
                                            }
                                        }
                                        z8 = false;
                                        if (!z8) {
                                        }
                                    }
                                    z7 = true;
                                    bundle2.putBoolean("arg_badgeable_disabled", z7);
                                    parcelable2 = this.l;
                                    if (parcelable2 != null) {
                                    }
                                    p6 = null;
                                    bundle2.putParcelable("arg_badgeable_info", p6);
                                }
                                videos = z5 ? (Videos) newsEntry2 : null;
                                if (videos != null && (arrayList = videos.o) != null) {
                                    ArrayList arrayList3 = new ArrayList(c5g.u(arrayList, 10));
                                    it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        arrayList3.add(((EntryAttachment) it.next()).b);
                                    }
                                    ArrayList arrayList4 = new ArrayList();
                                    it2 = arrayList3.iterator();
                                    while (it2.hasNext()) {
                                        Object next = it2.next();
                                        if (next instanceof VideoAttachment) {
                                            arrayList4.add(next);
                                        }
                                    }
                                    videoAttachment = (VideoAttachment) j5g.a0(arrayList4);
                                    if (videoAttachment != null && (videoFile = videoAttachment.k) != null) {
                                        pkt0.a.getClass();
                                        videoStatistic = pkt0.a(videoFile);
                                        if (videoStatistic != null) {
                                            bundle2.putParcelable("video_statistic", videoStatistic);
                                        }
                                        lfgVar = this.H;
                                        if (lfgVar != null) {
                                            lfgVar.onCreate(bundle2);
                                        }
                                    }
                                }
                                videoStatistic = null;
                                if (videoStatistic != null) {
                                }
                                lfgVar = this.H;
                                if (lfgVar != null) {
                                }
                            }
                        }
                        str2 = null;
                        bundle2.putString("arg_on_comment_mytracker_event", str2);
                        bundle2.putBoolean("arg_can_group_comment", z4);
                        Parcelable parcelable42 = this.l;
                        bundle2.putBoolean("arg_can_share_comments", ((parcelable42 instanceof Post) || !((Post) parcelable42).l.zb(512L)) && (parcelable42 instanceof c6z) && ((c6z) parcelable42).b9());
                        bundle2.putBoolean("arg_can_share_comments_link", zb == 6);
                        bundle2.putBoolean("arg_dismiss_on_opening_video", i0().M0().e);
                        bundle2.putInt("id", di60.n(newsEntry2));
                        bundle2.putParcelable("owner_id", q());
                        bundle2.putInt("arg_start_comment_id", this.p);
                        bundle2.putInt("arg_parent_comment_id", this.q);
                        bundle2.putInt("type", zb);
                        parcelable = this.l;
                        if (parcelable instanceof l490) {
                        }
                        bundle2.putParcelable("uid", userId);
                        zb2 = newsEntry2.zb();
                        if (!(newsEntry2 instanceof Post)) {
                        }
                        if (zb2 != 0) {
                        }
                        bundle2.putString("arg_item_likes_type", type.i());
                        bundle2.putString("access_key", this.u);
                        bundle2.putString("ref_source", this.n);
                        bundle2.putString("referrer", this.o);
                        bundle2.putString("track_code", str);
                        bundle2.putBoolean("scroll_to_comments", this.r);
                        bundle2.putBoolean("arg_can_share_on_wall", this.s);
                        bundle2.putBoolean("arg_start_from_parent", this.z);
                        if (newsEntry2 instanceof Badgeable) {
                        }
                        if (badgeable != null) {
                            bundle2.putInt("arg_badgeable_post_type", u0.d);
                            if (!u0.h) {
                            }
                            z7 = true;
                            bundle2.putBoolean("arg_badgeable_disabled", z7);
                            parcelable2 = this.l;
                            if (parcelable2 != null) {
                            }
                            p6 = null;
                            bundle2.putParcelable("arg_badgeable_info", p6);
                        }
                        if (z5) {
                        }
                        if (videos != null) {
                            ArrayList arrayList32 = new ArrayList(c5g.u(arrayList, 10));
                            it = arrayList.iterator();
                            while (it.hasNext()) {
                            }
                            ArrayList arrayList42 = new ArrayList();
                            it2 = arrayList32.iterator();
                            while (it2.hasNext()) {
                            }
                            videoAttachment = (VideoAttachment) j5g.a0(arrayList42);
                            if (videoAttachment != null) {
                                pkt0.a.getClass();
                                videoStatistic = pkt0.a(videoFile);
                                if (videoStatistic != null) {
                                }
                                lfgVar = this.H;
                                if (lfgVar != null) {
                                }
                            }
                        }
                        videoStatistic = null;
                        if (videoStatistic != null) {
                        }
                        lfgVar = this.H;
                        if (lfgVar != null) {
                        }
                    }
                }
                z4 = false;
                z5 = newsEntry2 instanceof Videos;
                if (z5) {
                }
                if (z6) {
                }
                zb = newsEntry2.zb();
                if (zb != 9) {
                }
                Parcelable parcelable32 = this.l;
                if (!(parcelable32 instanceof c6z)) {
                }
                bundle2.putBoolean("arg_can_comment", c6zVar == null && c6zVar.l0());
                bundle2.putBoolean("arg_show_only_comments", i0().M0().d);
                if (z5) {
                }
                str2 = null;
                bundle2.putString("arg_on_comment_mytracker_event", str2);
                bundle2.putBoolean("arg_can_group_comment", z4);
                Parcelable parcelable422 = this.l;
                bundle2.putBoolean("arg_can_share_comments", ((parcelable422 instanceof Post) || !((Post) parcelable422).l.zb(512L)) && (parcelable422 instanceof c6z) && ((c6z) parcelable422).b9());
                bundle2.putBoolean("arg_can_share_comments_link", zb == 6);
                bundle2.putBoolean("arg_dismiss_on_opening_video", i0().M0().e);
                bundle2.putInt("id", di60.n(newsEntry2));
                bundle2.putParcelable("owner_id", q());
                bundle2.putInt("arg_start_comment_id", this.p);
                bundle2.putInt("arg_parent_comment_id", this.q);
                bundle2.putInt("type", zb);
                parcelable = this.l;
                if (parcelable instanceof l490) {
                }
                bundle2.putParcelable("uid", userId);
                zb2 = newsEntry2.zb();
                if (!(newsEntry2 instanceof Post)) {
                }
                if (zb2 != 0) {
                }
                bundle2.putString("arg_item_likes_type", type.i());
                bundle2.putString("access_key", this.u);
                bundle2.putString("ref_source", this.n);
                bundle2.putString("referrer", this.o);
                bundle2.putString("track_code", str);
                bundle2.putBoolean("scroll_to_comments", this.r);
                bundle2.putBoolean("arg_can_share_on_wall", this.s);
                bundle2.putBoolean("arg_start_from_parent", this.z);
                if (newsEntry2 instanceof Badgeable) {
                }
                if (badgeable != null) {
                }
                if (z5) {
                }
                if (videos != null) {
                }
                videoStatistic = null;
                if (videoStatistic != null) {
                }
                lfgVar = this.H;
                if (lfgVar != null) {
                }
            }
            if (z3) {
                Post post2 = (Post) newsEntry;
                i0().ym(post2.ec());
                t3(post2);
                this.W = ((StoriesComponent) ((k7m) m7m.f(this)).a(fpf0.a(StoriesComponent.class))).Pa().a(new C1402b(1, this, b.class, "markStoriesAsSeenLocal", "markStoriesAsSeenLocal(Lcom/vk/dto/common/id/UserId;)V", 0));
            }
            f = epx.f(bundle.getString("post_action", ""), "edit");
            bVar = c9x0.b.b;
            if ((!f ? bVar : c9x0.c.b).equals(bVar)) {
                bundle.remove("post_action");
                if (z3) {
                    Post post3 = (Post) newsEntry;
                    if (rv60.a(post3) || rv60.b(post3)) {
                        i0().Db(post3, PostingCreationEntryPoint.Other);
                    }
                }
            }
            i0().S2(newsEntry);
        }
        PhotoAttachment Mb = ((Photos) newsEntry).Mb();
        Photo photo = Mb != null ? Mb.l : null;
        if (photo != null) {
            this.u = photo.v;
            if (zb3 != 7) {
                u0(fkq0.d(photo.f) ? photo.f : photo.e);
                List<PhotoTag> parcelableArrayList = bundle.getParcelableArrayList("friends_tags");
                if (parcelableArrayList == null) {
                    parcelableArrayList = photo.b;
                }
                photo.b = parcelableArrayList;
                UserProfile userProfile = (UserProfile) bundle.getParcelable("placer_profile");
                if (userProfile == null) {
                    PhotoTag photoTag = (PhotoTag) j5g.a0(photo.b);
                    userProfile = photoTag != null ? photoTag.m : null;
                }
                this.D = userProfile;
            }
        }
        this.v = bundle.getString("track_code", null);
        z2 = newsEntry instanceof Post;
        if (!z2) {
        }
        g = di60.g(newsEntry);
        list = g;
        if (list != null) {
            AudienceResearchSurfaceCode a22 = sa4.a(newsEntry, MobileOfficialAppsCoreNavStat$EventScreen.FEED_POST);
            r14 = this.i;
            s sVar2 = new s(nr2.v(a22, g, ((AudienceResearchComponent) r14.getValue()).Z2()), new u9c0(new e810(this, 18), i));
            asu0.a.getClass();
            i0().a(sVar2.q(asu0.i()).subscribe());
            f2 = di60.f(newsEntry);
            list2 = f2;
            if (list2 != null) {
                i0().a(pq3.r(((AudienceResearchComponent) r14.getValue()).b(), f2).q(asu0.i()).subscribe());
            }
        }
        x(newsEntry);
        i0().Il(this.G.t(new c86(this.N, i2)) != null);
        Bundle bundle22 = new Bundle();
        newsEntry2 = this.l;
        if (newsEntry2 != 0) {
        }
        if (z3) {
        }
        f = epx.f(bundle.getString("post_action", ""), "edit");
        bVar = c9x0.b.b;
        if ((!f ? bVar : c9x0.c.b).equals(bVar)) {
        }
        i0().S2(newsEntry);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.core.fragments.FragmentImpl, xsna.d9c0] */
    public d9c0 i0() {
        return this.b;
    }

    public final boolean i1(int i) {
        NewsEntry newsEntry;
        Context context = i0().getContext();
        if (context == null || e3m.h(context) == null || (newsEntry = this.l) == null || i != R.id.postviewfragment_options) {
            return false;
        }
        return i0().Yc(newsEntry);
    }

    @Override // xsna.c9c0
    public final void j1() {
        hfg hfgVar = new hfg(this.L, 2);
        ListDataSet<u1c0> listDataSet = this.G;
        int w = listDataSet.w(hfgVar);
        if (w >= 0) {
            listDataSet.A(w);
        }
    }

    @Override // xsna.c9c0
    public final void k1(int i, int i2) {
        Parcelable parcelable = this.l;
        c6z c6zVar = parcelable instanceof c6z ? (c6z) parcelable : null;
        if (c6zVar == null) {
            return;
        }
        this.B = i2;
        c6zVar.v6(i);
    }

    @Override // xsna.c9c0
    public final void m4(CommentsOrder commentsOrder) {
        s2(commentsOrder.b, commentsOrder.c, this.l);
    }

    @Override // xsna.c9c0
    public final CharSequence o6(CharSequence charSequence) {
        Post R;
        Object obj;
        NewsEntry newsEntry = this.l;
        Attachment attachment = null;
        if (newsEntry != null && (R = di60.R(newsEntry)) != null) {
            Iterator<T> it = R.z.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((EntryAttachment) obj).b instanceof PodcastAttachment) {
                    break;
                }
            }
            EntryAttachment entryAttachment = (EntryAttachment) obj;
            if (entryAttachment != null) {
                attachment = entryAttachment.b;
            }
        }
        return attachment instanceof PodcastAttachment ? i0().Hf(charSequence, (PodcastAttachment) attachment, this.Z, this.Y) : charSequence;
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        io.reactivex.rxjava3.disposables.c cVar;
        this.V.a();
        int i = his0.d - 1;
        his0.d = i;
        if (i == 0 && (cVar = his0.c) != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.W;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.X.dispose();
    }

    @Override // xsna.cc6
    public final void onPause() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onResume() {
        throw null;
    }

    public final x<NewsEntry> p0(Bundle bundle) {
        String str;
        f0 w0;
        x<List<Post>> l;
        String string = bundle.getString("entry_content_id");
        String string2 = bundle.getString("access_key");
        String a2 = (string2 == null || drm0.N(string2)) ? string : v1v.a('_', string, string2);
        if (a2 == null || drm0.N(a2)) {
            i0().S8();
            return x.i(new IllegalStateException("contentId is null or blank"));
        }
        int i = 0;
        boolean z = bundle.getBoolean("load_as_videos", false);
        boolean z2 = bundle.getBoolean("load_as_short_videos", false);
        int i2 = 4;
        if (z || z2) {
            if (string == null) {
                return sn.b("contentId is null or blank");
            }
            if (z2) {
                List singletonList = Collections.singletonList(string);
                List<String> list = wfj0.b;
                if ((58 & 4) != 0) {
                    list = null;
                }
                w0 = rsg0.w0(yfb.y(lgj0.a.c(singletonList, list), new y89(fgj0.a, 9)));
            } else {
                int H = drm0.H(string);
                while (true) {
                    if (-1 >= H) {
                        str = "";
                        break;
                    }
                    if (string.charAt(H) == '_') {
                        str = string.substring(0, H + 1);
                        break;
                    }
                    H--;
                }
                String w02 = erm0.w0(1, str);
                w0 = rsg0.w0(new gns0(new UserId(Long.parseLong(w02)), Integer.parseInt(erm0.v0(w02.length() + 1, string)), string2));
            }
            l = w0.l(new sq(20));
        } else if (bundle.getBoolean("load_as_photos", false)) {
            l = rsg0.w0(new yw4(a2, 1)).l(new t9c0(i, new t3v(13)));
        } else {
            iuc0 iuc0Var = iuc0.b;
            l = iuc0.g0().m(Collections.singletonList(a2));
        }
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        return new r(new n(l.q(asu0.r()), new x150(new uv20(this, 24), i2)).m(asu0.i()), new q9(new com.vk.newsfeed.impl.presenters.a(this), 27)).m(asu0Var.d());
    }

    @Override // xsna.c9c0
    public final boolean p2() {
        return this.G.w(new mfg(this.M, 1)) >= 0;
    }

    public void p3(int i, boolean z) {
        if (i >= 0 && (g0() > 1 || (z && g0() > 0))) {
            this.G.d(i);
        } else {
            yfg yfgVar = this.F;
            s2(yfgVar.c, yfgVar.d, this.l);
        }
    }

    public final UserId q() {
        VideoFile videoFile;
        UserId I0;
        Photo photo;
        UserId userId;
        NewsEntry newsEntry = this.l;
        if (newsEntry instanceof Post) {
            return ((Post) newsEntry).m;
        }
        if (newsEntry instanceof PromoPost) {
            return ((PromoPost) newsEntry).n.m;
        }
        if (newsEntry instanceof Photos) {
            PhotoAttachment Mb = ((Photos) newsEntry).Mb();
            return (Mb == null || (photo = Mb.l) == null || (userId = photo.e) == null) ? UserId.d : userId;
        }
        if (!(newsEntry instanceof Videos)) {
            return UserId.d;
        }
        VideoAttachment Nb = ((Videos) newsEntry).Nb();
        return (Nb == null || (videoFile = Nb.k) == null || (I0 = videoFile.I0()) == null) ? UserId.d : I0;
    }

    @Override // xsna.c9c0
    public final void q6() {
        p7f p7fVar = new p7f(this.L, 1);
        ListDataSet<u1c0> listDataSet = this.G;
        int w = listDataSet.w(p7fVar);
        if (w >= 0) {
            u1c0 c2 = listDataSet.c(w);
            pij0.a aVar = this.E;
            aVar.a = false;
            c2.g = aVar;
            listDataSet.d(w);
        }
        i0().pa();
    }

    public final void r1(UiTrackingScreen uiTrackingScreen) {
        NewsEntry newsEntry = this.l;
        if (newsEntry == null) {
            return;
        }
        String str = this.v;
        if (str == null) {
            str = newsEntry.Cb().b;
        }
        String str2 = str;
        if (newsEntry instanceof Post) {
            uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.POST, Long.valueOf(r0.n), Long.valueOf(((Post) newsEntry).m.b), null, str2, null, 40, null);
            return;
        }
        if (newsEntry instanceof Photos) {
            Attachment R1 = ((Photos) newsEntry).R1();
            if (R1 instanceof PhotoAttachment) {
                uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.PHOTO, Long.valueOf(r0.f), Long.valueOf(((PhotoAttachment) R1).g.b), null, str2, null, 40, null);
                return;
            }
            return;
        }
        if (newsEntry instanceof Videos) {
            Attachment R12 = ((Videos) newsEntry).R1();
            if (R12 instanceof VideoAttachment) {
                uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(r0.k.o0()), Long.valueOf(((VideoAttachment) R12).k.I0().b), null, str2, null, 40, null);
                return;
            }
            return;
        }
        if (newsEntry instanceof PromoPost) {
            uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.POST, Long.valueOf(r0.n), Long.valueOf(((PromoPost) newsEntry).n.m.b), null, str2, null, 40, null);
        }
    }

    public void s2(String str, List<CommentsOrder.Item> list, NewsEntry newsEntry) {
        if (this.x || newsEntry == null) {
            return;
        }
        boolean z = i0().M0().d;
        final d230 d230Var = this.M;
        Predicate<? super u1c0> predicate = new Predicate() { // from class: xsna.s9c0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((Boolean) d230Var.invoke(obj)).booleanValue();
            }
        };
        ListDataSet<u1c0> listDataSet = this.G;
        int w = listDataSet.w(predicate);
        if (w < 0) {
            if (g0() > 1 || (z && g0() > 0)) {
                if (!z) {
                    listDataSet.s(e0(newsEntry, str, list, i0().M0(), 93));
                    return;
                }
                s1c0 M0 = i0().M0();
                if (this.B <= 1 || list.isEmpty()) {
                    return;
                }
                listDataSet.s(e0(newsEntry, str, list, M0, Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE));
                return;
            }
            return;
        }
        if (g0() <= 1 && (!z || g0() <= 0)) {
            listDataSet.A(w);
            return;
        }
        yfg yfgVar = this.F;
        if (!z) {
            u1c0 c2 = listDataSet.c(w);
            if (c2 != null) {
                yfgVar.a = g0();
                yfgVar.b = this.B;
                yfgVar.c = str;
                yfgVar.d = list;
                c2.g = yfgVar;
            }
            listDataSet.d(w);
            return;
        }
        if (this.B <= 1 || list.isEmpty()) {
            listDataSet.A(w);
            return;
        }
        u1c0 c3 = listDataSet.c(w);
        if (c3 != null) {
            yfgVar.a = g0();
            yfgVar.b = this.B;
            yfgVar.c = str;
            yfgVar.d = list;
            c3.g = yfgVar;
        }
        listDataSet.d(w);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (xsna.epx.f(r4 != null ? r4.b : null, "fake_news") != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t2(NewsEntry newsEntry) {
        if ((newsEntry instanceof Post) && epx.f(this.l, newsEntry)) {
            Post post = (Post) this.l;
            if (newsEntry != post) {
                Post post2 = (Post) newsEntry;
                String str = post2.s;
                Counters counters = post2.E;
                post.s = str;
                Counters counters2 = post.E;
                Caption caption = post.x;
                if (!epx.f(caption != null ? caption.b : null, "fake_news")) {
                    Caption caption2 = post2.x;
                }
                post.x = post2.x;
                post.P = post2.P;
                ArrayList<EntryAttachment> arrayList = post.z;
                arrayList.clear();
                arrayList.addAll(post2.z);
                counters2.b = counters.b;
                counters2.e = counters.e;
                post.y = post2.y;
                post.V = post2.V;
                post.W = post2.W;
                post.f0(post2.J());
                counters2.c = counters.c;
                counters2.d = counters.d;
                post.l.Ab(1L, post2.b9());
                post.r0(post2.l0());
                post.R = post2.R;
                CommentsInfo commentsInfo = post.B;
                if (commentsInfo != null) {
                    CommentsInfo commentsInfo2 = post2.B;
                    commentsInfo.b = commentsInfo2 != null ? commentsInfo2.b : null;
                }
                lfg lfgVar = this.H;
                if (lfgVar != null) {
                    lfgVar.k8(post2.l0());
                }
                post.o.q = post2.o.q;
                post.vc(post2);
                post.D = post2.D;
                post.X = post2.X;
                post.f0 = post2.f0;
                post.c = newsEntry.c;
                post.g = newsEntry.g;
                post.h = newsEntry.h;
                Serializer.c<NewsfeedData> cVar = NewsfeedData.CREATOR;
                i0().E3(NewsfeedData.a.d(post));
            }
            i0().ym(post.ec());
            i0().invalidateOptionsMenu();
            t3((Post) newsEntry);
            lfg lfgVar2 = this.H;
            if (lfgVar2 == null || !lfgVar2.w) {
                i0().k0();
            } else {
                i0().y2();
            }
            x(post);
            i0().Il(this.G.t(new o9c0(this.N, 0)) == null);
        }
    }

    public final void t3(Post post) {
        PostDonut postDonut;
        CommentsInfo commentsInfo = post.B;
        PostDonut.Placeholder placeholder = (commentsInfo == null || (postDonut = commentsInfo.b) == null) ? null : postDonut.c;
        if (placeholder == null) {
            i0().o0();
            i0().f6(true);
        } else {
            i0().Cd(q(), placeholder.b, placeholder.c);
            i0().V0();
            i0().f6(false);
        }
    }

    public final void u0(UserId userId) {
        m1 y0;
        if (fkq0.b(userId)) {
            ComFeatures comFeatures = ComFeatures.COM_GROUPS_GETBYID_CODEGEN;
            comFeatures.getClass();
            if (com.vk.toggle.b.A.a(comFeatures)) {
                List singletonList = Collections.singletonList(fkq0.a(userId));
                List<GroupsFieldsDto> list = fkg.a;
                if ((4 & 2) != 0) {
                    list = null;
                }
                fz2 y = yfb.y(xqu.a.a(null, singletonList, list), new bws(12));
                ahn.D(y);
                y0 = rsg0.y0(y, null, null, 3);
            } else {
                y0 = rsg0.y0(new rpu(fkq0.e(userId)), null, null, 3);
            }
        } else {
            y0 = rsg0.y0(new e1r0(userId), null, null, 3);
        }
        i0().a(y0.subscribe(new dh40(new a(userId), 11), new s520(new f1s(20), 9)));
    }

    @Override // xsna.c9c0
    public final void u3(q1c0 q1c0Var) {
        Parcelable parcelable = this.l;
        c6z c6zVar = parcelable instanceof c6z ? (c6z) parcelable : null;
        if (c6zVar == null) {
            return;
        }
        c6zVar.f(q1c0Var.a);
        c6zVar.U8(q1c0Var.b);
        int i = q1c0Var.c;
        if (i > 0) {
            c6zVar.sb(i);
        }
        Parcelable parcelable2 = this.l;
        o2f0 o2f0Var = parcelable2 instanceof o2f0 ? (o2f0) parcelable2 : null;
        if (o2f0Var != null) {
            o2f0Var.hb(q1c0Var.e);
        }
        if (o2f0Var != null) {
            o2f0Var.b4(q1c0Var.f);
        }
        c6zVar.f0(q1c0Var.d);
    }

    public final int u4() {
        return this.G.d.size();
    }

    public void x(NewsEntry newsEntry) {
        int i;
        PhotoAttachment Mb;
        Photo photo;
        u1c0 u1c0Var;
        Photos photos;
        PhotoAttachment Mb2;
        s1c0 M0 = i0().M0();
        ArrayList<u1c0> arrayList = new ArrayList<>();
        if (M0.d) {
            b(newsEntry, arrayList, M0);
        }
        r74 r74Var = null;
        if ((newsEntry instanceof Photos) && (Mb2 = (photos = (Photos) newsEntry).Mb()) != null) {
            List<PhotoTag> list = Mb2.l.b;
            if (this.C != 0) {
                if (!photos.q.isEmpty()) {
                    u1c0 u1c0Var2 = new u1c0(16, photos);
                    u1c0Var2.g = new TagConfirmation(Mb2, this.D, this.C);
                    u1c0Var2.n = i0().M0();
                    arrayList.add(u1c0Var2);
                }
            } else if (!list.isEmpty()) {
                PhotoTag photoTag = (PhotoTag) j5g.a0(list);
                if (list.size() == 1) {
                    if (qr.f(photoTag != null ? photoTag.c : null)) {
                        u1c0 u1c0Var3 = new u1c0(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, photos);
                        u1c0Var3.g = photoTag;
                        u1c0Var3.n = i0().M0();
                        arrayList.add(u1c0Var3);
                    }
                }
                List<PhotoTag> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (!((PhotoTag) it.next()).l) {
                            u1c0 u1c0Var4 = new u1c0(145, photos);
                            u1c0Var4.n = i0().M0();
                            arrayList.add(u1c0Var4);
                            break;
                        }
                    }
                }
            }
        }
        if (!M0.d) {
            if (newsEntry instanceof Post) {
                Post post = (Post) newsEntry;
                if (!post.Z1()) {
                    if (post.f0 != null && (!r7.g.isEmpty())) {
                        NewsfeedCoowners newsfeedCoowners = post.f0;
                        List<NewsfeedCoowners.CoownerRequest> list3 = newsfeedCoowners != null ? newsfeedCoowners.g : null;
                        CoownershipStatusUiDto coownershipStatusUiDto = CoownershipStatusUiDto.None;
                        k1c0 k1c0Var = this.T;
                        if (list3 != null && k1c0Var.a == coownershipStatusUiDto) {
                            k1c0Var.b = list3;
                        }
                        k1c0Var.a = coownershipStatusUiDto;
                    }
                    k1c0 k1c0Var2 = (k1c0) this.U.b;
                    ol60 ol60Var = (ol60) j5g.a0(new l1c0(k1c0Var2.a, k1c0Var2.b).c(post));
                    if (ol60Var != null) {
                        u1c0Var = new u1c0(350, post);
                        u1c0Var.h = ol60Var;
                    } else {
                        u1c0Var = null;
                    }
                    if (u1c0Var != null) {
                        arrayList.add(u1c0Var);
                    }
                }
            }
            j jVar = this.S;
            String str = this.o;
            arrayList.addAll(j.g(jVar, newsEntry, M0, str, str));
        }
        NewsEntry newsEntry2 = this.l;
        if ((newsEntry2 instanceof Photos) && (Mb = ((Photos) newsEntry2).Mb()) != null && (photo = Mb.l) != null && photo.z != -9000.0d && photo.A != -9000.0d) {
            r74Var = new r74(33, new GeoAttachment(photo.z, photo.A, "", photo.w, -9000, null, 0), newsEntry2, newsEntry2);
            r74Var.n = i0().M0();
        }
        if (r74Var != null) {
            ListIterator<u1c0> listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i = -1;
                    break;
                } else if (((Boolean) this.K.invoke(listIterator.previous())).booleanValue()) {
                    i = listIterator.nextIndex();
                    break;
                }
            }
            if (i < 0) {
                i = arrayList.size() - 1;
            }
            arrayList.add(i, r74Var);
        }
        cx6 cx6Var = new cx6(this.M, 1);
        ListDataSet<u1c0> listDataSet = this.G;
        u1c0 t = listDataSet.t(cx6Var);
        if (t != null) {
            arrayList.add(t);
        }
        listDataSet.setItems(arrayList);
        i0().R1();
    }

    @Override // xsna.bd70
    public final void x0(int i, int i2, Object obj) {
        NewsEntry newsEntry;
        Post R;
        Object obj2;
        Photo photo;
        NewsEntry newsEntry2;
        boolean z = obj instanceof Attachment;
        ListDataSet<u1c0> listDataSet = this.G;
        if (z) {
            Attachment attachment = (Attachment) obj;
            if (i == 120) {
                NewsEntry newsEntry3 = this.l;
                Post R2 = newsEntry3 != null ? di60.R(newsEntry3) : null;
                Post post = R2 != null ? R2.D : null;
                if (R2 != null) {
                    int Jb = R2.Jb(attachment);
                    if (Jb >= 0) {
                        ((EntryAttachment) R2.Gb().get(Jb)).b = attachment;
                    }
                    listDataSet.u(new fc0(attachment, this, R2));
                }
                if (post != null) {
                    int Jb2 = post.Jb(attachment);
                    if (Jb2 >= 0) {
                        ((EntryAttachment) post.Gb().get(Jb2)).b = attachment;
                    }
                    listDataSet.u(new fc0(attachment, this, post));
                    return;
                }
                return;
            }
            if (i != 121) {
                return;
            }
            NewsEntry newsEntry4 = this.l;
            Post R3 = newsEntry4 != null ? di60.R(newsEntry4) : null;
            Post post2 = R3 != null ? R3.D : null;
            if (R3 != null) {
                R3.Kb(attachment);
                ListDataSet.ArrayListImpl<u1c0> arrayListImpl = listDataSet.d;
                for (int i3 = 0; i3 < arrayListImpl.size(); i3++) {
                    u1c0 u1c0Var = arrayListImpl.get(i3);
                    if ((u1c0Var instanceof r74) && epx.f(((r74) u1c0Var).q, attachment)) {
                        listDataSet.A(i3);
                    }
                    s3q0 s3q0Var = s3q0.a;
                }
            }
            if (post2 != null) {
                post2.Kb(attachment);
                ListDataSet.ArrayListImpl<u1c0> arrayListImpl2 = listDataSet.d;
                while (r4 < arrayListImpl2.size()) {
                    u1c0 u1c0Var2 = arrayListImpl2.get(r4);
                    if ((u1c0Var2 instanceof r74) && epx.f(((r74) u1c0Var2).q, attachment)) {
                        listDataSet.A(r4);
                    }
                    s3q0 s3q0Var2 = s3q0.a;
                    r4++;
                }
                return;
            }
            return;
        }
        if (obj instanceof FaveEntry) {
            gmq gmqVar = ((FaveEntry) obj).i.f;
            if (i == 117 && (gmqVar instanceof Post) && epx.f(this.l, gmqVar)) {
                Post post3 = (Post) gmqVar;
                NewsEntry newsEntry5 = this.l;
                if (newsEntry5 instanceof Post) {
                    ((Post) newsEntry5).s0(post3.X());
                    i0().invalidateOptionsMenu();
                    return;
                }
                return;
            }
            return;
        }
        if (obj instanceof NewsEntry) {
            NewsEntry newsEntry6 = (NewsEntry) obj;
            if (epx.f(this.l, newsEntry6)) {
                this.l = d0(newsEntry6);
                if (i == 104) {
                    i0().invalidateOptionsMenu();
                    return;
                }
                if (i != 134) {
                    if (i == 124 || i == 125) {
                        if (newsEntry6 instanceof Post) {
                            i0().ym(((Post) newsEntry6).ec());
                        }
                        i0().invalidateOptionsMenu();
                        D0(null);
                        return;
                    }
                    int i4 = 1;
                    switch (i) {
                        case 100:
                            i0().finish();
                            break;
                        case 101:
                            break;
                        case 102:
                            D0(i2 == 100 ? new p6s() : null);
                            int g0 = g0();
                            yfg yfgVar = this.F;
                            yfgVar.a = g0;
                            yfgVar.b = this.B;
                            if (this.y) {
                                i0().hk(g0());
                            }
                            NewsEntry newsEntry7 = this.l;
                            Videos videos = newsEntry7 instanceof Videos ? (Videos) newsEntry7 : null;
                            if (videos != null) {
                                V2(videos);
                            }
                            p3(listDataSet.w(new icg(this.M, i4)), i0().M0().d);
                            break;
                        default:
                            k1c0 k1c0Var = this.T;
                            final s6x s6xVar = this.N;
                            switch (i) {
                                case 149:
                                case 150:
                                    int w = listDataSet.w(new Predicate() { // from class: xsna.q9c0
                                        @Override // java.util.function.Predicate
                                        public final boolean test(Object obj3) {
                                            return ((Boolean) s6xVar.invoke(obj3)).booleanValue();
                                        }
                                    });
                                    u1c0 c2 = listDataSet.c(w);
                                    ol60 ol60Var = c2.h;
                                    m1c0 m1c0Var = ol60Var instanceof m1c0 ? (m1c0) ol60Var : null;
                                    if (m1c0Var != null) {
                                        Post post4 = m1c0Var.h;
                                        NewsfeedCoowners newsfeedCoowners = post4.f0;
                                        r4 = (newsfeedCoowners != null ? newsfeedCoowners.g.size() : 0) >= 2 ? 1 : 0;
                                        CoownershipStatusUiDto coownershipStatusUiDto = (i == 149 && r4 == 0) ? CoownershipStatusUiDto.Approved : (i == 150 && r4 == 0) ? CoownershipStatusUiDto.Rejected : CoownershipStatusUiDto.None;
                                        c2.h = new m1c0(m1c0Var.h, m1c0Var.i, m1c0Var.j, m1c0Var.k, m1c0Var.l, m1c0Var.m, m1c0Var.n, m1c0Var.o, coownershipStatusUiDto, m1c0Var.q);
                                        NewsfeedCoowners newsfeedCoowners2 = post4.f0;
                                        List<NewsfeedCoowners.CoownerRequest> list = newsfeedCoowners2 != null ? newsfeedCoowners2.g : null;
                                        if (list != null && k1c0Var.a == CoownershipStatusUiDto.None) {
                                            k1c0Var.b = list;
                                        }
                                        k1c0Var.a = coownershipStatusUiDto;
                                    }
                                    listDataSet.d(w);
                                    break;
                                case 151:
                                    int w2 = listDataSet.w(new qa60(s6xVar, 1));
                                    listDataSet.A(w2);
                                    listDataSet.p(w2);
                                    k1c0Var.a = CoownershipStatusUiDto.Closed;
                                    break;
                            }
                    }
                    return;
                }
                t2(newsEntry6);
                return;
            }
            return;
        }
        if (!(obj instanceof Photo)) {
            if (obj instanceof Boolean) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (i != 140 || (newsEntry = this.l) == null) {
                    return;
                }
                i0().a(new ab60().b(Collections.singletonList(newsEntry), listDataSet, booleanValue));
                return;
            }
            if (obj instanceof xa60) {
                xa60 xa60Var = (xa60) obj;
                NewsEntry newsEntry8 = this.l;
                if (newsEntry8 == null) {
                    return;
                }
                i0().a(new ab60().a(Collections.singletonList(newsEntry8), listDataSet, xa60Var));
                return;
            }
            return;
        }
        Photo photo2 = (Photo) obj;
        if (i != 113) {
            if (i != 130) {
                if (i == 131 && (newsEntry2 = this.l) != null) {
                    odg0 odg0Var = odg0.a;
                    List singletonList = Collections.singletonList(newsEntry2);
                    hs00 hs00Var = new hs00(photo2, 21);
                    odg0Var.getClass();
                    i0().a(odg0.n(singletonList, listDataSet, hs00Var));
                    return;
                }
                return;
            }
            NewsEntry newsEntry9 = this.l;
            if (newsEntry9 == null) {
                return;
            }
            odg0 odg0Var2 = odg0.a;
            List singletonList2 = Collections.singletonList(newsEntry9);
            es00 es00Var = new es00(photo2, 25);
            odg0Var2.getClass();
            i0().a(odg0.n(singletonList2, listDataSet, es00Var));
            return;
        }
        NewsEntry newsEntry10 = this.l;
        if (!(newsEntry10 instanceof Photos)) {
            if (newsEntry10 == null || (R = di60.R(newsEntry10)) == null) {
                return;
            }
            Iterator<T> it = R.z.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (((EntryAttachment) obj2).b instanceof PhotoAttachment) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            EntryAttachment entryAttachment = (EntryAttachment) obj2;
            Attachment attachment2 = entryAttachment != null ? entryAttachment.b : null;
            PhotoAttachment photoAttachment = attachment2 instanceof PhotoAttachment ? (PhotoAttachment) attachment2 : null;
            if (photoAttachment == null || (photo = photoAttachment.l) == null || photo.c != photo2.c || photo2.C != R.n) {
                return;
            }
            R.wc(photo2);
            D0(null);
            return;
        }
        Photos photos = (Photos) newsEntry10;
        Attachment R1 = photos.R1();
        if (R1 instanceof PhotoAttachment) {
            Photo photo3 = ((PhotoAttachment) R1).l;
            if (epx.f(photo2.e, photo3.e) && photo2.c == photo3.c) {
                photos.Nb(photo2);
                Post R4 = di60.R(photos);
                if (R4 != null) {
                    R4.wc(photo2);
                }
                D0(null);
                int w3 = listDataSet.w(new p9c0(this.J, 0));
                if (w3 >= 0) {
                    List<PhotoTag> list2 = photo2.b;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (!((PhotoTag) it2.next()).l) {
                                return;
                            }
                        }
                    }
                    listDataSet.A(w3);
                }
            }
        }
    }

    public final void z() {
        Long l = this.m;
        if (l != null) {
            Serializer.c<NewsfeedData> cVar = NewsfeedData.CREATOR;
            wmi0.a.c(k0.a(l.longValue(), "newsfeed_cache_post_to_open:"));
        }
    }

    @Override // xsna.c9c0
    public void e4(String str) {
    }
}
