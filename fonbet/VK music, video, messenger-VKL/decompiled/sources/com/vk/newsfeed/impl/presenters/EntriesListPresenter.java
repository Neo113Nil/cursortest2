package com.vk.newsfeed.impl.presenters;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Good;
import com.vk.dto.common.GroupsSuggestions;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupSuggestion;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.activities.Activity;
import com.vk.dto.newsfeed.activities.Comment;
import com.vk.dto.newsfeed.activities.CommentsActivity;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.dto.newsfeed.entries.DigestItem;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.TagsSuggestions;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import com.vk.dto.photo.Photo;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.fave.api.models.FaveMarketItem;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.NewsfeedResearchEvent;
import com.vk.feed.core.models.ads.EasyPromote;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.core.models.dzen.DzenNews;
import com.vk.feed.core.models.dzen.DzenNewsItem;
import com.vk.feed.core.models.dzen.DzenStory;
import com.vk.feed.core.models.feedback.Feedback;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.header.SourcePhoto;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.lists.ListDataSet;
import com.vk.metrics.trackers.my.event.SingleEvent;
import com.vk.movika.sdk.base.ui.v;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.common.recycler.holders.clips.SingleClipV2Holder;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeFeedItem;
import com.vk.story.api.di.StoriesComponent;
import com.vk.toggle.features.MoneyFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.attachments.NarrativeAttachment;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.attachments.VideoSnippetAttachment;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.q1;
import io.reactivex.rxjava3.internal.operators.observable.s0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference0Impl;
import org.chromium.base.version_info.VersionConstants;
import org.json.JSONObject;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.a160;
import xsna.a2o;
import xsna.a6i;
import xsna.a7;
import xsna.a76;
import xsna.ab60;
import xsna.akh;
import xsna.anj;
import xsna.asu0;
import xsna.awq;
import xsna.b520;
import xsna.bd70;
import xsna.bin0;
import xsna.bjk;
import xsna.bo8;
import xsna.bp50;
import xsna.bpn0;
import xsna.bqp;
import xsna.brp;
import xsna.bu60;
import xsna.bwy;
import xsna.c6z;
import xsna.cd4;
import xsna.ce60;
import xsna.cfl;
import xsna.cn70;
import xsna.cp0;
import xsna.cuz;
import xsna.d2f0;
import xsna.d37;
import xsna.d6f0;
import xsna.da;
import xsna.db4;
import xsna.de4;
import xsna.di60;
import xsna.dqp;
import xsna.drp;
import xsna.dwg;
import xsna.e43;
import xsna.e7q0;
import xsna.e9l;
import xsna.ed;
import xsna.ee4;
import xsna.ek40;
import xsna.enj;
import xsna.epx;
import xsna.fb80;
import xsna.fgh;
import xsna.fkq0;
import xsna.fpf0;
import xsna.fqp;
import xsna.frp;
import xsna.fsx0;
import xsna.fwv;
import xsna.fy00;
import xsna.g0t;
import xsna.g5g;
import xsna.gbh;
import xsna.gmq;
import xsna.gn7;
import xsna.grj0;
import xsna.h3p0;
import xsna.hd60;
import xsna.hfr;
import xsna.his0;
import xsna.hrp;
import xsna.hzp0;
import xsna.i2c0;
import xsna.i50;
import xsna.i590;
import xsna.i5g;
import xsna.ia4;
import xsna.iag;
import xsna.igh;
import xsna.iuc0;
import xsna.izs;
import xsna.j5g;
import xsna.j6e;
import xsna.jc60;
import xsna.jpf;
import xsna.jt50;
import xsna.jy5;
import xsna.jzf0;
import xsna.k15;
import xsna.k7m;
import xsna.k8q0;
import xsna.kbe;
import xsna.kog;
import xsna.l490;
import xsna.lb60;
import xsna.lbs;
import xsna.lrk;
import xsna.lsi;
import xsna.lzf0;
import xsna.m1k;
import xsna.m2j;
import xsna.m6r0;
import xsna.m7m;
import xsna.md8;
import xsna.msy;
import xsna.mt;
import xsna.n3i;
import xsna.n6f;
import xsna.nr2;
import xsna.nx3;
import xsna.o25;
import xsna.o2f0;
import xsna.o8s0;
import xsna.oac;
import xsna.oce;
import xsna.odm;
import xsna.oj;
import xsna.ol60;
import xsna.ov2;
import xsna.ozf;
import xsna.p6s;
import xsna.p870;
import xsna.p890;
import xsna.pf4;
import xsna.ph60;
import xsna.pq3;
import xsna.pto;
import xsna.puq0;
import xsna.pv2;
import xsna.pw4;
import xsna.qpj;
import xsna.qzg;
import xsna.r2n;
import xsna.r5g0;
import xsna.r74;
import xsna.r9k;
import xsna.rli0;
import xsna.rop;
import xsna.rrl;
import xsna.rx3;
import xsna.s0d0;
import xsna.s1c0;
import xsna.s3q0;
import xsna.sa4;
import xsna.sk4;
import xsna.sni;
import xsna.t3h;
import xsna.t9e;
import xsna.tcn;
import xsna.thc;
import xsna.tto;
import xsna.u0q;
import xsna.u1c0;
import xsna.u6k;
import xsna.udo;
import xsna.ufk;
import xsna.va60;
import xsna.vkb;
import xsna.vqp;
import xsna.w0g0;
import xsna.w8i;
import xsna.wee0;
import xsna.wjs0;
import xsna.wsx0;
import xsna.wzf;
import xsna.wzs;
import xsna.x3l;
import xsna.xa60;
import xsna.xqp;
import xsna.xyg;
import xsna.xyh;
import xsna.xzb0;
import xsna.xzs;
import xsna.y24;
import xsna.y50;
import xsna.y64;
import xsna.y8g0;
import xsna.yce;
import xsna.yg5;
import xsna.yqp;
import xsna.ysg0;
import xsna.yzw;
import xsna.zeg;
import xsna.zof;
import xsna.zou;
import xsna.zqh;
import xsna.zqp;

/* compiled from: EntriesListPresenter.kt */
/* loaded from: classes4.dex */
public abstract class EntriesListPresenter implements dqp, w8i {
    public final com.vk.newsfeed.common.util.j A;
    public final i2c0 B;
    public final d6f0 C;
    public final o8s0 D;
    public final k15 E;
    public final bd70<NewsEntry> F;
    public final bd70<NewsfeedExternalAction> G;
    public final bd70<Attachment> H;
    public final bd70<UserId> I;
    public final bd70<UserId> J;
    public final bd70<u0q> K;
    public final bd70<JSONObject> L;
    public final bd70<Photo> M;
    public final bd70<zeg> N;
    public final bd70<lb60> O;
    public final bd70<Pair<NewsEntry, NewsEntry>> P;
    public final bd70<NewsEntry> Q;
    public final bd70<Boolean> R;
    public final bd70<xa60> S;
    public final bd70<List<Class<? extends NewsEntry>>> T;
    public final bd70<Bundle> U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final EntriesListPresenter$receiver$1 a0;
    public final fqp b;
    public UUID b0;
    public final com.vk.lists.b<u1c0> c;
    public final bpn0 c0;
    public final ArrayList<NewsEntry> d;
    public final HashSet<NewsEntry> e;
    public final HashSet<NewsEntry> f;
    public com.vk.lists.c g;
    public final SparseArray<yg5> h;
    public final SparseArray<String> i;
    public final SparseArray<String> j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final va60 n;
    public io.reactivex.rxjava3.disposables.c o;
    public final HashSet<UserId> p;
    public final ek40 q;
    public final Object r;
    public final Object s;
    public final Object t;
    public final bqp u;
    public final d2f0 v;
    public final int w;
    public final Object x;
    public final bpn0 y;
    public final Object z;

    /* compiled from: EntriesListPresenter.kt */
    public final class a implements bd70<NewsfeedExternalAction> {
        public a() {
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, NewsfeedExternalAction newsfeedExternalAction) {
            NewsfeedExternalAction newsfeedExternalAction2 = newsfeedExternalAction;
            if ((newsfeedExternalAction2 instanceof NewsfeedExternalAction.c.w) && i == 152) {
                EntriesListPresenter.this.O((NewsfeedExternalAction.c.w) newsfeedExternalAction2);
            }
        }
    }

    /* compiled from: EntriesListPresenter.kt */
    public final class b implements bd70<Attachment> {
        public b() {
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, Attachment attachment) {
            Attachment attachment2 = attachment;
            EntriesListPresenter entriesListPresenter = EntriesListPresenter.this;
            if (i == 120) {
                if (attachment2 instanceof VideoSnippetAttachment) {
                    VideoSnippetAttachment videoSnippetAttachment = (VideoSnippetAttachment) attachment2;
                    attachment2 = videoSnippetAttachment.Pb(videoSnippetAttachment.k);
                } else if (attachment2 instanceof VideoAttachment) {
                    attachment2 = new VideoAttachment(((VideoAttachment) attachment2).k);
                }
                entriesListPresenter.y(attachment2);
                return;
            }
            if (i != 121) {
                return;
            }
            com.vk.lists.b<u1c0> bVar = entriesListPresenter.c;
            for (NewsEntry newsEntry : rli0.A(rli0.j(new i5g(entriesListPresenter.d), new frp(0, attachment2)))) {
                PromoPost promoPost = newsEntry instanceof PromoPost ? (PromoPost) newsEntry : null;
                Post post = promoPost != null ? promoPost.n : null;
                Post post2 = newsEntry instanceof Post ? (Post) newsEntry : null;
                Post post3 = post2 != null ? post2.D : null;
                boolean z = post != null && post.Kb(attachment2) >= 0;
                if (post2 != null) {
                    z = post2.Kb(attachment2) >= 0 || z;
                }
                if (post3 != null) {
                    z = post3.Kb(attachment2) >= 0 || z;
                }
                if (z) {
                    ListDataSet.ArrayListImpl<u1c0> arrayListImpl = bVar.d;
                    for (int i3 = 0; i3 < arrayListImpl.size(); i3++) {
                        u1c0 u1c0Var = arrayListImpl.get(i3);
                        if ((u1c0Var instanceof r74) && epx.f(((r74) u1c0Var).q, attachment2)) {
                            bVar.A(i3);
                        }
                        s3q0 s3q0Var = s3q0.a;
                    }
                }
                Videos videos = newsEntry instanceof Videos ? (Videos) newsEntry : null;
                if (videos != null) {
                    ArrayList<EntryAttachment> arrayList = videos.o;
                    EntryAttachment entryAttachment = new EntryAttachment(attachment2, null, null, null, 14, null);
                    if (arrayList != null) {
                        arrayList.remove(entryAttachment);
                    }
                    if (arrayList == null || !arrayList.isEmpty()) {
                        ListDataSet.ArrayListImpl<u1c0> arrayListImpl2 = bVar.d;
                        for (int i4 = 0; i4 < arrayListImpl2.size(); i4++) {
                            u1c0 u1c0Var2 = arrayListImpl2.get(i4);
                            if (epx.f(u1c0Var2.b, videos)) {
                                bVar.F(i4, u1c0Var2);
                            }
                            s3q0 s3q0Var2 = s3q0.a;
                        }
                    } else {
                        entriesListPresenter.V(videos);
                    }
                }
            }
        }
    }

    /* compiled from: EntriesListPresenter.kt */
    public final class c implements bd70<zeg> {
        public c() {
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, zeg zegVar) {
            ArrayList<Comment> arrayList;
            ArrayList<Comment> arrayList2;
            zeg zegVar2 = zegVar;
            EntriesListPresenter entriesListPresenter = EntriesListPresenter.this;
            ArrayList<NewsEntry> arrayList3 = entriesListPresenter.d;
            iag iagVar = zegVar2.a;
            NewsComment newsComment = iagVar instanceof NewsComment ? (NewsComment) iagVar : null;
            if (newsComment == null) {
                return;
            }
            UserId userId = zegVar2.b;
            int i3 = zegVar2.c;
            int i4 = 0;
            if (newsComment.u) {
                Post u = EntriesListPresenter.u(userId, i3, arrayList3);
                if (u == null) {
                    return;
                }
                Activity activity = u.C;
                if (!(activity instanceof CommentsActivity) || (arrayList2 = ((CommentsActivity) activity).d) == null || arrayList2.isEmpty()) {
                    return;
                }
                int size = arrayList2.size();
                while (true) {
                    if (i4 >= size) {
                        break;
                    }
                    Comment comment = (Comment) j5g.b0(i4, arrayList2);
                    if (comment != null && newsComment.i == comment.b) {
                        arrayList2.remove(i4);
                        break;
                    }
                    i4++;
                }
                entriesListPresenter.J(u);
                return;
            }
            Post u2 = EntriesListPresenter.u(userId, i3, arrayList3);
            if (u2 == null) {
                return;
            }
            Activity activity2 = u2.C;
            if ((activity2 instanceof CommentsActivity) && (arrayList = ((CommentsActivity) activity2).d) != null) {
                int size2 = arrayList.size();
                while (true) {
                    if (i4 >= size2) {
                        break;
                    }
                    Comment comment2 = (Comment) j5g.b0(i4, arrayList);
                    if (comment2 != null && newsComment.i == comment2.b) {
                        if (!epx.f(comment2.g, newsComment.b)) {
                            comment2.g = newsComment.b;
                            comment2.u = newsComment.I.a();
                            comment2.v = newsComment.Z;
                        }
                        comment2.i = newsComment.q;
                        comment2.h = newsComment.p;
                        List<Attachment> list = comment2.j;
                        if (list != null) {
                            list.clear();
                            list.addAll(newsComment.J);
                        } else {
                            comment2.j = new ArrayList(newsComment.J);
                        }
                        comment2.k = newsComment.K;
                    } else {
                        i4++;
                    }
                }
                entriesListPresenter.J(u2);
            }
        }
    }

    /* compiled from: EntriesListPresenter.kt */
    public final class d implements bd70<Bundle> {
        public d() {
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, Bundle bundle) {
            Long e;
            Bundle bundle2 = bundle;
            if (epx.f(bundle2 != null ? bundle2.getString("type") : null, "wall") && (e = bo8.e(bundle2, "item_id")) != null) {
                int longValue = (int) e.longValue();
                EntriesListPresenter entriesListPresenter = EntriesListPresenter.this;
                ArrayList<NewsEntry> arrayList = entriesListPresenter.d;
                if (arrayList == null) {
                    Iterator<NewsEntry> it = arrayList.iterator();
                    while (it.hasNext()) {
                        NewsEntry next = it.next();
                        if (next instanceof Post) {
                            Post post = (Post) next;
                            if (post.n == longValue && !post.isReported()) {
                                post.l.Ab(140737488355328L, true);
                                entriesListPresenter.H(next, null);
                                return;
                            }
                        }
                    }
                    return;
                }
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    NewsEntry newsEntry = arrayList.get(i3);
                    if (newsEntry instanceof Post) {
                        Post post2 = (Post) newsEntry;
                        if (post2.n == longValue && !post2.isReported()) {
                            post2.l.Ab(140737488355328L, true);
                            entriesListPresenter.H(newsEntry, null);
                            return;
                        }
                    }
                }
            }
        }
    }

    /* compiled from: EntriesListPresenter.kt */
    public final class e implements bd70<JSONObject> {
        public e() {
        }

        /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.bd70
        public final void x0(int i, int i2, JSONObject jSONObject) {
            NewsEntry newsEntry;
            u1c0 u1c0Var;
            JSONObject jSONObject2 = jSONObject;
            String optString = jSONObject2.optString("post_id");
            Serializer.c<EasyPromote> cVar = EasyPromote.CREATOR;
            EasyPromote a = EasyPromote.a.a(jSONObject2);
            EntriesListPresenter entriesListPresenter = EntriesListPresenter.this;
            Iterator<NewsEntry> it = entriesListPresenter.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    newsEntry = null;
                    break;
                } else {
                    newsEntry = it.next();
                    if (epx.f(newsEntry.Bb(), optString)) {
                        break;
                    }
                }
            }
            NewsEntry newsEntry2 = newsEntry;
            if (newsEntry2 instanceof Post) {
                ((Post) newsEntry2).I = a;
            } else if (!(newsEntry2 instanceof Videos) || !((Boolean) entriesListPresenter.Y.getValue()).booleanValue()) {
                return;
            } else {
                ((Videos) newsEntry2).z = a;
            }
            int i3 = a.b;
            if (i3 == 1) {
                u1c0Var = new u1c0(56, newsEntry2);
            } else if (i3 != 3 && i3 != 4 && i3 != 5 && i3 != 6 && i3 != 7) {
                return;
            } else {
                u1c0Var = new u1c0(57, newsEntry2);
            }
            entriesListPresenter.c.E(new igh(newsEntry2, 11), new dwg(u1c0Var, 12));
        }
    }

    /* compiled from: EntriesListPresenter.kt */
    public final class f implements bd70<Pair<? extends NewsEntry, ? extends NewsEntry>> {
        public f() {
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, Pair<? extends NewsEntry, ? extends NewsEntry> pair) {
            Pair<? extends NewsEntry, ? extends NewsEntry> pair2 = pair;
            EntriesListPresenter.this.F(pair2.d(), pair2.g());
        }
    }

    /* compiled from: EntriesListPresenter.kt */
    public final class g implements bd70<List<? extends Class<? extends NewsEntry>>> {
        public g() {
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, List<? extends Class<? extends NewsEntry>> list) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Class cls = (Class) it.next();
                EntriesListPresenter entriesListPresenter = EntriesListPresenter.this;
                g5g.D(entriesListPresenter.d, true, new rop(cls, 1));
                com.vk.lists.b<u1c0> bVar = entriesListPresenter.c;
                fgh fghVar = new fgh(cls, 10);
                bVar.b();
                g5g.D(bVar.d, true, fghVar);
                bVar.a();
                entriesListPresenter.Y();
            }
        }
    }

    /* compiled from: EntriesListPresenter.kt */
    public final class h implements bd70<NewsEntry> {
        public h() {
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, NewsEntry newsEntry) {
            NewsEntry newsEntry2 = newsEntry;
            boolean f = epx.f(newsEntry2.Db(), "videos_for_you");
            EntriesListPresenter entriesListPresenter = EntriesListPresenter.this;
            if (!f) {
                entriesListPresenter.E(newsEntry2);
                return;
            }
            g5g.D(entriesListPresenter.d, true, new tcn(newsEntry2, 4));
            com.vk.lists.b<u1c0> bVar = entriesListPresenter.c;
            n6f n6fVar = new n6f(newsEntry2, 20);
            bVar.b();
            g5g.D(bVar.d, true, n6fVar);
            bVar.a();
            entriesListPresenter.Y();
        }
    }

    /* compiled from: EntriesListPresenter.kt */
    public final class i implements bd70<xa60> {
        public i() {
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, xa60 xa60Var) {
            ab60 ab60Var = new ab60();
            EntriesListPresenter entriesListPresenter = EntriesListPresenter.this;
            entriesListPresenter.b.a(ab60Var.a(entriesListPresenter.d, entriesListPresenter.c, xa60Var));
        }
    }

    /* compiled from: EntriesListPresenter.kt */
    public final class j implements bd70<Boolean> {
        public j() {
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            ab60 ab60Var = new ab60();
            EntriesListPresenter entriesListPresenter = EntriesListPresenter.this;
            entriesListPresenter.b.a(ab60Var.b(entriesListPresenter.d, entriesListPresenter.c, booleanValue));
        }
    }

    /* compiled from: EntriesListPresenter.kt */
    public final class k implements bd70<UserId> {
        public k() {
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, UserId userId) {
            UserId userId2 = userId;
            ArrayList<NewsEntry> arrayList = EntriesListPresenter.this.d;
            ArrayList arrayList2 = new ArrayList();
            Iterator<NewsEntry> it = arrayList.iterator();
            while (it.hasNext()) {
                NewsEntry next = it.next();
                NewsEntry newsEntry = next;
                if (newsEntry instanceof Post) {
                    Post post = (Post) newsEntry;
                    if (epx.f(post.m, userId2) && post.Tb()) {
                        arrayList2.add(next);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            iuc0 iuc0Var = iuc0.b;
            iuc0.k0(arrayList2);
        }
    }

    /* compiled from: EntriesListPresenter.kt */
    public final class l implements bd70<Photo> {
        public l() {
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, Photo photo) {
            Photo photo2 = photo;
            EntriesListPresenter entriesListPresenter = EntriesListPresenter.this;
            if (i == 113) {
                Object obj = i2 == 100 ? k8q0.a.a : k8q0.b.a;
                if (photo2.C == 0 || !photo2.n) {
                    return;
                }
                entriesListPresenter.b.a(new s0(new thc(1, entriesListPresenter, photo2)).a0(io.reactivex.rxjava3.schedulers.a.a()).r0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new ov2(new jy5(entriesListPresenter, obj, photo2, 3), 17), new pv2(new d37(14), 14)));
                return;
            }
            if (i == 130) {
                entriesListPresenter.L(photo2);
            } else {
                if (i != 131) {
                    return;
                }
                entriesListPresenter.M(photo2);
            }
        }
    }

    /* compiled from: EntriesListPresenter.kt */
    public final class m implements bd70<lb60> {
        public m() {
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, lb60 lb60Var) {
            TagsSuggestions tagsSuggestions = lb60Var.a;
            EntriesListPresenter entriesListPresenter = EntriesListPresenter.this;
            Iterator<NewsEntry> it = entriesListPresenter.d.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                } else if (epx.f(it.next(), tagsSuggestions)) {
                    break;
                } else {
                    i3++;
                }
            }
            if (i3 == -1) {
                return;
            }
            entriesListPresenter.W(entriesListPresenter.c.w(new kog(new j6e(tagsSuggestions, 21), 1)));
        }
    }

    /* compiled from: EntriesListPresenter.kt */
    public final class n implements bd70<NewsEntry> {
        public n() {
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, NewsEntry newsEntry) {
            EntriesListPresenter.this.R(i, i2, newsEntry);
        }
    }

    /* compiled from: EntriesListPresenter.kt */
    public final class o implements bd70<u0q> {
        public o() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.bd70
        public final void x0(int i, int i2, u0q u0qVar) {
            NewsEntry newsEntry;
            u0q u0qVar2 = u0qVar;
            UserId userId = u0qVar2.b;
            int i3 = u0qVar2.a;
            ItemReactions itemReactions = u0qVar2.e;
            EntriesListPresenter entriesListPresenter = EntriesListPresenter.this;
            Iterator<NewsEntry> it = entriesListPresenter.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    newsEntry = null;
                    break;
                }
                newsEntry = it.next();
                NewsEntry newsEntry2 = newsEntry;
                if (newsEntry2 instanceof Post) {
                    Post post = (Post) newsEntry2;
                    if (post.n == i3 && epx.f(post.m, userId)) {
                        break;
                    }
                }
                if (newsEntry2 instanceof PromoPost) {
                    Post post2 = ((PromoPost) newsEntry2).n;
                    if (post2.n == i3 && epx.f(post2.m, userId)) {
                        break;
                    }
                }
            }
            NewsEntry newsEntry3 = newsEntry;
            if (newsEntry3 != 0) {
                if ((newsEntry3 instanceof o2f0) && itemReactions != null) {
                    entriesListPresenter.v.getClass();
                    d2f0.c((o2f0) newsEntry3, itemReactions);
                }
                if (newsEntry3 instanceof c6z) {
                    grj0 grj0Var = (grj0) newsEntry3;
                    grj0Var.f(u0qVar2.c);
                    c6z c6zVar = (c6z) newsEntry3;
                    c6zVar.U8(u0qVar2.d);
                    if (u0qVar2.f) {
                        grj0Var.f0(true);
                    }
                    if (u0qVar2.g) {
                        c6zVar.W2();
                    }
                }
                s3q0 s3q0Var = s3q0.a;
                entriesListPresenter.H(newsEntry3, null);
            }
        }
    }

    /* compiled from: EntriesListPresenter.kt */
    public static final /* synthetic */ class p extends FunctionReferenceImpl implements izs<UserId, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(UserId userId) {
            UserId userId2 = userId;
            EntriesListPresenter entriesListPresenter = (EntriesListPresenter) this.receiver;
            entriesListPresenter.p.add(userId2);
            ArrayList<NewsEntry> arrayList = entriesListPresenter.d;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    NewsEntry newsEntry = arrayList.get(i);
                    if (EntriesListPresenter.x(userId2, newsEntry)) {
                        entriesListPresenter.H(newsEntry, null);
                    }
                }
            } else {
                Iterator<NewsEntry> it = arrayList.iterator();
                while (it.hasNext()) {
                    NewsEntry next = it.next();
                    if (EntriesListPresenter.x(userId2, next)) {
                        entriesListPresenter.H(next, null);
                    }
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: EntriesListPresenter.kt */
    public static final /* synthetic */ class q extends PropertyReference0Impl {
        @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
        public final Object get() {
            return ((EntriesListPresenter) this.receiver).getRef();
        }
    }

    /* compiled from: EntriesListPresenter.kt */
    public static final /* synthetic */ class r extends PropertyReference0Impl {
        @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
        public final Object get() {
            return ((EntriesListPresenter) this.receiver).a();
        }
    }

    /* compiled from: EntriesListPresenter.kt */
    public static final /* synthetic */ class s extends FunctionReferenceImpl implements izs<NewsEntry, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(NewsEntry newsEntry) {
            NewsEntry newsEntry2 = newsEntry;
            EntriesListPresenter entriesListPresenter = (EntriesListPresenter) this.receiver;
            entriesListPresenter.getClass();
            newsEntry2.e = true;
            bwy.d dVar = bwy.d.a;
            newsEntry2.f = dVar;
            com.vk.lists.b<u1c0> bVar = entriesListPresenter.c;
            final oce oceVar = new oce(newsEntry2, 21);
            u1c0 t = bVar.t(new Predicate() { // from class: xsna.crp
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((Boolean) oce.this.invoke(obj)).booleanValue();
                }
            });
            if (t != null) {
                NewsEntry newsEntry3 = t.b;
                newsEntry3.e = true;
                newsEntry3.f = dVar;
                entriesListPresenter.G0(t);
            }
            return s3q0.a;
        }
    }

    /* compiled from: EntriesListPresenter.kt */
    public static final class t extends RecyclerView.i {
        public t() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b() {
            EntriesListPresenter.this.b.Ke();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void g(int i, int i2) {
            EntriesListPresenter.this.b.Ke();
        }
    }

    /* compiled from: EntriesListPresenter.kt */
    public static final class u implements bin0, g0t {
        public final /* synthetic */ PropertyReference0Impl b;

        public u(PropertyReference0Impl propertyReference0Impl) {
            this.b = propertyReference0Impl;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof bin0) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.bin0
        public final Object get() {
            return this.b.get();
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return this.b;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: Type inference failed for: r7v12, types: [com.vk.newsfeed.impl.presenters.EntriesListPresenter$receiver$1] */
    public EntriesListPresenter(fqp fqpVar) {
        this.b = fqpVar;
        com.vk.lists.b<u1c0> bVar = new com.vk.lists.b<>(null);
        this.c = bVar;
        this.d = new ArrayList<>();
        this.e = new HashSet<>();
        this.f = new HashSet<>();
        this.h = new SparseArray<>();
        this.i = new SparseArray<>();
        this.j = new SparseArray<>();
        kbe kbeVar = new kbe(this, 19);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy a2 = msy.a(lazyThreadSafetyMode, kbeVar);
        this.k = a2;
        this.l = msy.a(lazyThreadSafetyMode, new gbh(this, 13));
        this.m = msy.a(lazyThreadSafetyMode, new sk4(10));
        this.n = new va60((zof) a2.getValue());
        this.p = new HashSet<>();
        this.q = new ek40();
        this.r = msy.a(lazyThreadSafetyMode, new odm(this, 5));
        this.s = msy.a(lazyThreadSafetyMode, new akh(this, 13));
        Lazy a3 = msy.a(lazyThreadSafetyMode, new xyh(this, 9));
        this.t = a3;
        this.u = new bqp(this, bVar);
        this.v = new d2f0();
        this.w = 25;
        this.x = msy.a(lazyThreadSafetyMode, new v(14));
        this.y = new bpn0(new cfl(this, 7));
        this.z = msy.a(lazyThreadSafetyMode, new ufk(this, 4));
        this.A = new com.vk.newsfeed.common.util.j();
        this.B = new i2c0(new ph60((a2o) a3.getValue()), (a2o) a3.getValue());
        this.C = new d6f0();
        this.D = new o8s0();
        this.E = new k15();
        this.F = fqpVar.F8(new n());
        this.G = fqpVar.F8(new a());
        this.H = fqpVar.F8(new b());
        this.I = fqpVar.F8(new i590(new wzf(this, 17)));
        this.J = fqpVar.F8(new k());
        this.K = fqpVar.F8(new o());
        this.L = fqpVar.F8(new e());
        this.M = fqpVar.F8(new l());
        this.N = fqpVar.F8(new c());
        this.O = fqpVar.F8(new m());
        this.P = fqpVar.F8(new f());
        this.Q = fqpVar.F8(new h());
        this.R = fqpVar.F8(new j());
        this.S = fqpVar.F8(new i());
        this.T = fqpVar.F8(new g());
        this.U = fqpVar.F8(new d());
        this.V = msy.a(lazyThreadSafetyMode, new jpf(this, 16));
        this.W = msy.a(lazyThreadSafetyMode, new m2j(this, 8));
        this.X = msy.a(lazyThreadSafetyMode, new de4(15));
        this.Y = msy.a(lazyThreadSafetyMode, new ee4(11));
        this.Z = msy.a(lazyThreadSafetyMode, new qzg(this, 13));
        this.a0 = new BroadcastReceiver() { // from class: com.vk.newsfeed.impl.presenters.EntriesListPresenter$receiver$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                Object obj;
                NewsfeedCoowners.CoownerStatus coownerStatus;
                Object obj2;
                NewsfeedCoowners.CoownerStatus coownerStatus2;
                Object obj3;
                Object obj4;
                UserProfile userProfile;
                NewsEntry newsEntry;
                NewsEntry newsEntry2;
                b520 b520Var;
                ArrayList<b520> arrayList;
                b520 b520Var2;
                UserId userId;
                Bundle extras;
                Image image;
                Owner s2;
                String str;
                Owner s3;
                String str2;
                EntriesListPresenter entriesListPresenter = EntriesListPresenter.this;
                ?? r3 = entriesListPresenter.z;
                ArrayList<NewsEntry> arrayList2 = entriesListPresenter.d;
                s3q0 s3q0Var = null;
                String action = intent != null ? intent.getAction() : null;
                int i2 = 0;
                if (!epx.f(action, "com.vkontakte.android.ACTION_GROUP_STATUS_CHANGED") && !epx.f(action, "com.vkontakte.android.ACTION_FRIEND_STATUS_CHANGED")) {
                    if (epx.f(action, "com.vkontakte.android.USER_PHOTO_CHANGED")) {
                        Bundle extras2 = intent.getExtras();
                        if (extras2 == null || (userId = (UserId) extras2.getParcelable("id")) == null || (extras = intent.getExtras()) == null || (image = (Image) extras.getParcelable("image")) == null || !userId.equals(o25.a().c())) {
                            return;
                        }
                        int a4 = y8g0.a(R.dimen.newsfeed_post_avatar_size);
                        if (arrayList2 == null) {
                            Iterator<NewsEntry> it = arrayList2.iterator();
                            while (it.hasNext()) {
                                NewsEntry next = it.next();
                                if ((next instanceof l490) && (s2 = ((l490) next).s()) != null && epx.f(s2.b, userId)) {
                                    s2.g = image;
                                    ImageSize Cb = image.Cb(a4, true, false);
                                    if (Cb == null || (str = Cb.d.d) == null) {
                                        str = "";
                                    }
                                    s2.e = str;
                                    entriesListPresenter.H(next, null);
                                }
                            }
                            return;
                        }
                        int size = arrayList2.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            NewsEntry newsEntry3 = arrayList2.get(i3);
                            if ((newsEntry3 instanceof l490) && (s3 = ((l490) newsEntry3).s()) != null && epx.f(s3.b, userId)) {
                                s3.g = image;
                                ImageSize Cb2 = image.Cb(a4, true, false);
                                if (Cb2 == null || (str2 = Cb2.d.d) == null) {
                                    str2 = "";
                                }
                                s3.e = str2;
                                entriesListPresenter.H(newsEntry3, null);
                            }
                        }
                        return;
                    }
                    if (!epx.f(action, "com.vkontakte.android.AD_REPORTED")) {
                        if (!epx.f(action, zou.a) || intent == null || (userProfile = (UserProfile) intent.getParcelableExtra(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)) == null) {
                            return;
                        }
                        if (arrayList2 == null) {
                            Iterator<NewsEntry> it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                NewsEntry next2 = it2.next();
                                if (next2 instanceof Post) {
                                    Post post = (Post) next2;
                                    if (epx.f(post.o.b, userProfile.c)) {
                                        post.uc(true);
                                        entriesListPresenter.H(next2, null);
                                    }
                                }
                            }
                            return;
                        }
                        int size2 = arrayList2.size();
                        while (i2 < size2) {
                            NewsEntry newsEntry4 = arrayList2.get(i2);
                            if (newsEntry4 instanceof Post) {
                                Post post2 = (Post) newsEntry4;
                                if (epx.f(post2.o.b, userProfile.c)) {
                                    post2.uc(true);
                                    entriesListPresenter.H(newsEntry4, null);
                                }
                            }
                            i2++;
                        }
                        return;
                    }
                    Bundle extras3 = intent.getExtras();
                    String string = extras3 != null ? extras3.getString("adchoice_option_text") : null;
                    MoneyFeatures moneyFeatures = MoneyFeatures.FEATURE_MONEY_AD_CHOICES_ENTRY_HASH;
                    moneyFeatures.getClass();
                    if (com.vk.toggle.b.A.a(moneyFeatures)) {
                        Bundle extras4 = intent.getExtras();
                        newsEntry = ((r5g0) r3.getValue()).c(extras4 != null ? Integer.valueOf(extras4.getInt("ad_entry_hash")) : null);
                    } else {
                        Bundle extras5 = intent.getExtras();
                        newsEntry = extras5 != null ? (NewsEntry) extras5.getParcelable("ad_entry") : null;
                    }
                    if (newsEntry != null) {
                        ((r5g0) r3.getValue()).clear();
                    }
                    if (newsEntry != null && di60.v(newsEntry)) {
                        entriesListPresenter.D(newsEntry, false);
                        return;
                    }
                    Iterator<NewsEntry> it3 = arrayList2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            newsEntry2 = it3.next();
                            if (epx.f(newsEntry2, newsEntry)) {
                                break;
                            }
                        } else {
                            newsEntry2 = null;
                            break;
                        }
                    }
                    MyTargetNativeAdEntry myTargetNativeAdEntry = newsEntry2 instanceof MyTargetNativeAdEntry ? (MyTargetNativeAdEntry) newsEntry2 : null;
                    if (myTargetNativeAdEntry == null) {
                        return;
                    }
                    bp50 bp50Var = myTargetNativeAdEntry.A;
                    if (string == null) {
                        entriesListPresenter.D(myTargetNativeAdEntry, false);
                        return;
                    }
                    if (bp50Var == null || (arrayList = bp50Var.c) == null) {
                        b520Var = null;
                    } else {
                        Iterator<b520> it4 = arrayList.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                b520Var2 = null;
                                break;
                            }
                            b520Var2 = it4.next();
                            b520 b520Var3 = b520Var2;
                            if (epx.f(b520Var3.a, string) && epx.f(b520Var3.b, "complain")) {
                                break;
                            }
                        }
                        b520Var = b520Var2;
                    }
                    if (b520Var != null) {
                        if (bp50Var != null) {
                            bp50Var.d(b520Var);
                            s3q0Var = s3q0.a;
                        }
                        if (s3q0Var != null) {
                            return;
                        }
                    }
                    entriesListPresenter.D(myTargetNativeAdEntry, false);
                    return;
                }
                UserId userId2 = (UserId) intent.getParcelableExtra("id");
                if (userId2 == null) {
                    return;
                }
                Bundle extras6 = intent.getExtras();
                Integer valueOf = extras6 != null ? Integer.valueOf(extras6.getInt("status")) : null;
                if (valueOf != null) {
                    if (arrayList2 == null) {
                        Iterator<NewsEntry> it5 = arrayList2.iterator();
                        while (it5.hasNext()) {
                            NewsEntry next3 = it5.next();
                            if (next3 instanceof Post) {
                                boolean z = valueOf.intValue() == 1 || valueOf.intValue() == 3;
                                if (epx.f(sni.l(next3), userId2)) {
                                    Post post3 = (Post) next3;
                                    post3.J = valueOf.intValue() == 0;
                                    Owner owner = post3.o;
                                    owner.p(valueOf.intValue() == 3);
                                    owner.g(4, z);
                                    NewsfeedCoowners newsfeedCoowners = post3.f0;
                                    if (newsfeedCoowners != null) {
                                        Iterator<T> it6 = newsfeedCoowners.f.iterator();
                                        while (true) {
                                            if (it6.hasNext()) {
                                                obj = it6.next();
                                                if (epx.f(((NewsfeedCoowners.CoownerStatus) obj).b.b, userId2)) {
                                                    break;
                                                }
                                            } else {
                                                obj = null;
                                                break;
                                            }
                                        }
                                        NewsfeedCoowners.CoownerStatus coownerStatus3 = (NewsfeedCoowners.CoownerStatus) obj;
                                        if (coownerStatus3 != null) {
                                            coownerStatus3.e = z;
                                        }
                                    }
                                    entriesListPresenter.H(next3, null);
                                } else {
                                    NewsfeedCoowners newsfeedCoowners2 = ((Post) next3).f0;
                                    if (newsfeedCoowners2 != null) {
                                        Iterator<T> it7 = newsfeedCoowners2.f.iterator();
                                        while (true) {
                                            if (it7.hasNext()) {
                                                obj2 = it7.next();
                                                if (epx.f(((NewsfeedCoowners.CoownerStatus) obj2).b.b, userId2)) {
                                                    break;
                                                }
                                            } else {
                                                obj2 = null;
                                                break;
                                            }
                                        }
                                        coownerStatus = (NewsfeedCoowners.CoownerStatus) obj2;
                                    } else {
                                        coownerStatus = null;
                                    }
                                    if (coownerStatus != null) {
                                        coownerStatus.b.g(4, z);
                                    }
                                    if (coownerStatus != null) {
                                        coownerStatus.e = z;
                                    }
                                }
                            } else if (next3 instanceof Videos) {
                                if (epx.f(sni.l(next3), userId2)) {
                                    Videos videos = (Videos) next3;
                                    videos.x = valueOf.intValue() == 0;
                                    Owner owner2 = videos.m;
                                    if (owner2 != null) {
                                        owner2.p(valueOf.intValue() == 3);
                                    }
                                    entriesListPresenter.H(next3, null);
                                }
                            } else if (next3 instanceof ShitAttachment) {
                                ShitAttachment shitAttachment = (ShitAttachment) next3;
                                if (shitAttachment.Gb()) {
                                    VideoAttachment videoAttachment = shitAttachment.I;
                                    if (epx.f(videoAttachment != null ? videoAttachment.k.I0() : null, userId2)) {
                                        shitAttachment.g0 = valueOf.intValue() == 0;
                                        entriesListPresenter.H(next3, null);
                                    }
                                }
                            } else if (next3 instanceof GroupsSuggestions) {
                                Iterator<GroupSuggestion> it8 = ((GroupsSuggestions) next3).l.iterator();
                                while (true) {
                                    if (it8.hasNext()) {
                                        Group group = it8.next().b;
                                        if (epx.f(group.c, fkq0.e(userId2))) {
                                            group.C = valueOf.intValue();
                                            break;
                                        }
                                    }
                                }
                            } else if (next3 instanceof Digest) {
                                Iterator<DigestItem> it9 = ((Digest) next3).m.iterator();
                                while (it9.hasNext()) {
                                    Post post4 = it9.next().g;
                                    if (epx.f(post4.m, userId2)) {
                                        post4.J = valueOf.intValue() == 0;
                                        entriesListPresenter.H(post4, null);
                                    }
                                }
                            }
                        }
                        return;
                    }
                    int size3 = arrayList2.size();
                    int i4 = 0;
                    while (i4 < size3) {
                        NewsEntry newsEntry5 = arrayList2.get(i4);
                        if (newsEntry5 instanceof Post) {
                            boolean z2 = (valueOf.intValue() == 1 || valueOf.intValue() == 3) ? 1 : i2;
                            if (epx.f(sni.l(newsEntry5), userId2)) {
                                Post post5 = (Post) newsEntry5;
                                post5.J = valueOf.intValue() == 0 ? 1 : i2;
                                Owner owner3 = post5.o;
                                owner3.p(valueOf.intValue() == 3);
                                owner3.g(4, z2);
                                NewsfeedCoowners newsfeedCoowners3 = post5.f0;
                                if (newsfeedCoowners3 != null) {
                                    Iterator<T> it10 = newsfeedCoowners3.f.iterator();
                                    while (true) {
                                        if (it10.hasNext()) {
                                            obj4 = it10.next();
                                            if (epx.f(((NewsfeedCoowners.CoownerStatus) obj4).b.b, userId2)) {
                                                break;
                                            }
                                        } else {
                                            obj4 = null;
                                            break;
                                        }
                                    }
                                    NewsfeedCoowners.CoownerStatus coownerStatus4 = (NewsfeedCoowners.CoownerStatus) obj4;
                                    if (coownerStatus4 != null) {
                                        coownerStatus4.e = z2;
                                    }
                                }
                                entriesListPresenter.H(newsEntry5, null);
                            } else {
                                NewsfeedCoowners newsfeedCoowners4 = ((Post) newsEntry5).f0;
                                if (newsfeedCoowners4 != null) {
                                    Iterator<T> it11 = newsfeedCoowners4.f.iterator();
                                    while (true) {
                                        if (it11.hasNext()) {
                                            obj3 = it11.next();
                                            if (epx.f(((NewsfeedCoowners.CoownerStatus) obj3).b.b, userId2)) {
                                                break;
                                            }
                                        } else {
                                            obj3 = null;
                                            break;
                                        }
                                    }
                                    coownerStatus2 = (NewsfeedCoowners.CoownerStatus) obj3;
                                } else {
                                    coownerStatus2 = null;
                                }
                                if (coownerStatus2 != null) {
                                    coownerStatus2.b.g(4, z2);
                                }
                                if (coownerStatus2 != null) {
                                    coownerStatus2.e = z2;
                                }
                            }
                        } else if (newsEntry5 instanceof Videos) {
                            if (epx.f(sni.l(newsEntry5), userId2)) {
                                Videos videos2 = (Videos) newsEntry5;
                                videos2.x = valueOf.intValue() == 0;
                                Owner owner4 = videos2.m;
                                if (owner4 != null) {
                                    owner4.p(valueOf.intValue() == 3);
                                }
                                entriesListPresenter.H(newsEntry5, null);
                            }
                        } else if (newsEntry5 instanceof ShitAttachment) {
                            ShitAttachment shitAttachment2 = (ShitAttachment) newsEntry5;
                            if (shitAttachment2.Gb()) {
                                VideoAttachment videoAttachment2 = shitAttachment2.I;
                                if (epx.f(videoAttachment2 != null ? videoAttachment2.k.I0() : null, userId2)) {
                                    shitAttachment2.g0 = valueOf.intValue() == 0;
                                    entriesListPresenter.H(newsEntry5, null);
                                }
                            }
                        } else if (newsEntry5 instanceof GroupsSuggestions) {
                            Iterator<GroupSuggestion> it12 = ((GroupsSuggestions) newsEntry5).l.iterator();
                            while (true) {
                                if (it12.hasNext()) {
                                    Group group2 = it12.next().b;
                                    if (epx.f(group2.c, fkq0.e(userId2))) {
                                        group2.C = valueOf.intValue();
                                        break;
                                    }
                                }
                            }
                        } else if (newsEntry5 instanceof Digest) {
                            Iterator<DigestItem> it13 = ((Digest) newsEntry5).m.iterator();
                            while (it13.hasNext()) {
                                Post post6 = it13.next().g;
                                if (epx.f(post6.m, userId2)) {
                                    post6.J = valueOf.intValue() == 0;
                                    entriesListPresenter.H(post6, null);
                                }
                            }
                        }
                        i4++;
                        i2 = 0;
                    }
                }
            }
        };
        t tVar = new t();
        this.c0 = new bpn0(new ozf(this, 24));
        ArrayList<RecyclerView.i> arrayList = bVar.c;
        if (!arrayList.contains(tVar)) {
            arrayList.add(tVar);
        }
        his0.d++;
        if (his0.c == null || !(!r7.h())) {
            his0.c = wjs0.b.a0(asu0.a.d()).subscribe(new e7q0(new puq0(4), 5));
        }
    }

    public static boolean X(fsx0 fsx0Var, Attachment attachment) {
        int T2 = fsx0Var.T2(attachment);
        if (T2 < 0 || fsx0Var.l9(T2) == null) {
            return false;
        }
        fsx0Var.V5(T2, attachment);
        return true;
    }

    public static void b0(ListDataSet listDataSet, NewsEntry newsEntry, int i2, wzs wzsVar) {
        listDataSet.G(null, new vqp(i2, newsEntry), new a7(newsEntry, i2, wzsVar, 2));
    }

    public static Post u(UserId userId, int i2, List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            NewsEntry newsEntry = (NewsEntry) obj;
            Post post = newsEntry instanceof Post ? (Post) newsEntry : null;
            if (epx.f(post != null ? post.m : null, userId) && ((Post) newsEntry).n == i2) {
                break;
            }
        }
        if (obj instanceof Post) {
            return (Post) obj;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean x(UserId userId, NewsEntry newsEntry) {
        boolean z;
        SourcePhoto sourcePhoto;
        Owner d2;
        SourcePhoto sourcePhoto2;
        Owner d3;
        UserId userId2 = null;
        if (newsEntry instanceof wee0) {
            wee0 wee0Var = (wee0) newsEntry;
            Owner G = wee0Var.G();
            if (epx.f(G != null ? G.b : null, userId)) {
                Owner G2 = wee0Var.G();
                if (G2 != null) {
                    G2.q = false;
                }
                z = true;
                if (newsEntry instanceof wsx0) {
                    wsx0 wsx0Var = (wsx0) newsEntry;
                    EntryHeader header = wsx0Var.getHeader();
                    if (header != null && (sourcePhoto2 = header.b) != null && (d3 = sourcePhoto2.d()) != null) {
                        userId2 = d3.b;
                    }
                    if (epx.f(userId2, userId)) {
                        EntryHeader header2 = wsx0Var.getHeader();
                        if (header2 != null && (sourcePhoto = header2.b) != null && (d2 = sourcePhoto.d()) != null) {
                            d2.q = false;
                        }
                        return true;
                    }
                }
                return z;
            }
        }
        z = false;
        if (newsEntry instanceof wsx0) {
        }
        return z;
    }

    public void A(NewsEntry newsEntry) {
        if (r(newsEntry)) {
            U(Collections.singletonList(newsEntry), true);
        }
    }

    @Override // xsna.dqp
    public void A0(FragmentImpl fragmentImpl) {
        if (w()) {
            this.b.o1();
        }
    }

    public void B(NewsEntry newsEntry) {
        V(newsEntry);
    }

    @Override // xsna.dqp
    public final yg5 B0(int i2) {
        return this.h.get(i2);
    }

    @Override // xsna.dqp
    public final boolean C0(NewsEntry newsEntry) {
        u1c0 c2;
        boolean e2 = hd60.a().a().e(m6r0.u0);
        if ((newsEntry instanceof Post) && e2) {
            Post post = (Post) newsEntry;
            Flags flags = post.l;
            if ((post.C instanceof CommentsActivity) && post.l0()) {
                HashSet<NewsEntry> hashSet = this.e;
                if (!hashSet.contains(newsEntry) && !flags.zb(4398046511104L)) {
                    com.vk.lists.b<u1c0> bVar = this.c;
                    int size = bVar.d.size();
                    int i2 = -1;
                    for (int i3 = 0; i3 < size; i3++) {
                        if (!epx.f(bVar.c(i3).b, newsEntry)) {
                            if (i2 != -1) {
                                break;
                            }
                        } else {
                            i2 = i3;
                        }
                    }
                    if (i2 != -1 && (c2 = bVar.c(i2)) != null) {
                        u1c0 u1c0Var = new u1c0(65, post);
                        u1c0Var.h = (ol60) j5g.a0(Collections.singletonList(new a6i(post.n, post.m, post.L.b, flags.zb(PlaybackStateCompat.ACTION_PREPARE_FROM_URI))));
                        ArrayList a2 = e43.a(u1c0Var);
                        c2.b().bottom = 0;
                        Iterator it = a2.iterator();
                        while (it.hasNext()) {
                            ((u1c0) it.next()).k = c2.k;
                        }
                        u1c0 u1c0Var2 = (u1c0) j5g.k0(a2);
                        if (u1c0Var2 != null) {
                            u1c0Var2.d = 4;
                        }
                        c2.d = 1;
                        hashSet.add(post);
                        flags.Ab(4398046511104L, true);
                        fqp fqpVar = this.b;
                        fqpVar.g6();
                        int i4 = i2 + 1;
                        bVar.y(i4, a2);
                        this.A.G(i2, a2.size() + i4, fqpVar.M0().J, bVar.d);
                        H(post, null);
                        fqpVar.Aa(new y24(0, this, EntriesListPresenter.class, "updateList", "updateList()V", 0, 2));
                        int i5 = c2.k;
                        String valueOf = String.valueOf(System.currentTimeMillis());
                        new yzw();
                        yzw.b(post, i5, valueOf, valueOf);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void D(NewsEntry newsEntry, boolean z) {
        this.u.b(newsEntry, z);
    }

    /* JADX WARN: Type inference failed for: r9v61, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.dqp
    public void D0(Bundle bundle) {
        com.vk.lists.c cVar = this.g;
        fqp fqpVar = this.b;
        if (cVar == null) {
            this.g = z();
        } else {
            fqpVar.u1(cVar);
        }
        ce60.b.getClass();
        p870 f2 = p870.f();
        bd70<NewsEntry> bd70Var = this.F;
        f2.b(101, bd70Var);
        p870.f().b(100, bd70Var);
        p870.f().b(152, this.G);
        p870.f().b(138, bd70Var);
        p870.f().b(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, bd70Var);
        p870.f().b(125, bd70Var);
        p870.f().b(102, bd70Var);
        p870.f().a(102, 100, bd70Var);
        p870.f().b(141, bd70Var);
        p870.f().b(105, bd70Var);
        p870.f().b(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, bd70Var);
        p870.f().b(103, this.I);
        p870.f().b(ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, this.K);
        p870.f().b(111, this.L);
        p870.f().b(112, bd70Var);
        p870.f().b(Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, bd70Var);
        p870 f3 = p870.f();
        bd70<Photo> bd70Var2 = this.M;
        f3.b(113, bd70Var2);
        p870.f().a(113, 100, bd70Var2);
        p870.f().b(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, bd70Var);
        p870.f().b(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, bd70Var);
        p870 f4 = p870.f();
        bd70<Attachment> bd70Var3 = this.H;
        f4.b(120, bd70Var3);
        p870.f().b(Sdk.SDKError.Reason.TPAT_ERROR_VALUE, bd70Var3);
        p870.f().b(116, this.N);
        p870.f().b(128, bd70Var);
        p870.f().b(129, bd70Var);
        p870.f().b(130, bd70Var2);
        p870.f().b(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, bd70Var2);
        p870.f().b(Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, this.O);
        p870.f().b(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, bd70Var);
        p870.f().b(134, bd70Var);
        p870.f().b(135, this.P);
        p870.f().b(139, bd70Var);
        p870.f().b(VersionConstants.PRODUCT_MAJOR_VERSION, this.R);
        p870.f().b(147, this.S);
        p870.f().b(143, this.J);
        p870.f().b(144, bd70Var);
        p870.f().b(145, this.T);
        p870.f().b(146, this.Q);
        p870.f().b(148, bd70Var);
        p870.f().b(153, bd70Var);
        p870.f().b(154, bd70Var);
        p870.f().b(158, bd70Var);
        p870.f().b(155, bd70Var);
        p870.f().b(156, bd70Var);
        p870.f().b(9, this.U);
        this.o = ((StoriesComponent) ((k7m) m7m.f(this)).a(fpf0.a(StoriesComponent.class))).Pa().a(new p(1, this, EntriesListPresenter.class, "markStoriesAsSeenLocal", "markStoriesAsSeenLocal(Lcom/vk/dto/common/id/UserId;)V", 0));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.vkontakte.android.ACTION_GROUP_STATUS_CHANGED");
        intentFilter.addAction("com.vkontakte.android.ACTION_FRIEND_STATUS_CHANGED");
        intentFilter.addAction("com.vkontakte.android.USER_PHOTO_CHANGED");
        intentFilter.addAction("com.vkontakte.android.AD_REPORTED");
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        EntriesListPresenter$receiver$1 entriesListPresenter$receiver$1 = this.a0;
        anj.d(context, entriesListPresenter$receiver$1, intentFilter, null, 4);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction(zou.a);
        Context context2 = e43.a;
        cuz.a(context2 != null ? context2 : null).b(entriesListPresenter$receiver$1, intentFilter2);
        io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
        q1 q1Var = new q1(20);
        fVar.getClass();
        fqpVar.a(new i0(fVar, q1Var).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new cp0(this, 24), new da(new pw4(com.vk.metrics.eventtracking.b.a, 4), 26)));
        fqpVar.a(((fy00) this.V.getValue()).a().subscribe(new y50(new t9e(this, 18), 23)));
    }

    public void E(NewsEntry newsEntry) {
        F(newsEntry, newsEntry);
    }

    @Override // xsna.dqp
    public final String E0(int i2) {
        return this.i.get(i2);
    }

    public final void F(NewsEntry newsEntry, NewsEntry newsEntry2) {
        NewsEntry newsEntry3 = newsEntry2;
        if (newsEntry3 instanceof Post) {
            Post post = (Post) newsEntry3;
            post.l.Ab(4398046511104L, this.e.contains(newsEntry));
            post.l.Ab(35184372088832L, this.f.contains(newsEntry));
        }
        bqp bqpVar = this.u;
        com.vk.lists.b bVar = bqpVar.b;
        Iterator it = bVar.d.iterator();
        int i2 = 0;
        w0g0 w0g0Var = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (it.hasNext()) {
            NewsEntry newsEntry4 = ((u1c0) it.next()).b;
            if (!(newsEntry instanceof DiscoverMediaBlock) && (newsEntry4 instanceof DiscoverMediaBlock)) {
                DiscoverMediaBlock discoverMediaBlock = (DiscoverMediaBlock) newsEntry4;
                int a2 = bqp.a(discoverMediaBlock, newsEntry);
                if (a2 >= 0) {
                    discoverMediaBlock.j.get(a2).c.d = newsEntry.d;
                    i3++;
                    w0g0Var = new w0g0(newsEntry);
                    i5 = i4;
                }
            } else if (!newsEntry4.equals(newsEntry)) {
                if (i5 != -1) {
                    break;
                }
            } else {
                if (i5 == -1) {
                    i5 = i4;
                }
                i3++;
            }
            i4++;
        }
        boolean z = newsEntry3 instanceof DiscoverMediaBlock;
        if (z && (newsEntry instanceof DiscoverMediaBlock)) {
            DiscoverMediaBlock discoverMediaBlock2 = (DiscoverMediaBlock) newsEntry;
            if (discoverMediaBlock2.j.isEmpty() && z && newsEntry != null) {
                DiscoverMediaBlock discoverMediaBlock3 = new DiscoverMediaBlock(discoverMediaBlock2.i, ((DiscoverMediaBlock) newsEntry3).j, discoverMediaBlock2.k, discoverMediaBlock2.l, discoverMediaBlock2.m, discoverMediaBlock2.n, discoverMediaBlock2.o, discoverMediaBlock2.p);
                discoverMediaBlock3.f = newsEntry.f;
                discoverMediaBlock3.e = newsEntry.e;
                discoverMediaBlock3.d = newsEntry.d;
                discoverMediaBlock3.c = newsEntry.c;
                discoverMediaBlock3.g = newsEntry.g;
                discoverMediaBlock3.h = newsEntry.h;
                newsEntry3 = discoverMediaBlock3;
            }
        }
        NewsEntry newsEntry5 = newsEntry3;
        EntriesListPresenter entriesListPresenter = bqpVar.a;
        if (i5 >= 0) {
            if (w0g0Var != null) {
                bqpVar.b.G(w0g0Var, new t3h(bqpVar, newsEntry), new oj(bqpVar));
            } else {
                bVar.B(i5, i3);
                int max = Math.max(i5, 0);
                entriesListPresenter.getRef();
                entriesListPresenter.a();
                ArrayList arrayList = new ArrayList();
                com.vk.newsfeed.common.util.j.h(entriesListPresenter.A, newsEntry5, entriesListPresenter.b.M0(), entriesListPresenter.getRef(), entriesListPresenter.a(), arrayList, jzf0.a.a.getSTUB(), 64);
                entriesListPresenter.c.y(max, arrayList);
                ArrayList<NewsEntry> arrayList2 = entriesListPresenter.d;
                Iterator<NewsEntry> it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (it2.next().equals(newsEntry)) {
                        arrayList2.set(i2, newsEntry5);
                        break;
                    }
                    i2++;
                }
            }
            entriesListPresenter.Y();
        }
    }

    @Override // xsna.dqp
    public final void F0(Context context, NewsfeedExternalAction newsfeedExternalAction) {
        ((xzb0) this.c0.getValue()).e(context, newsfeedExternalAction);
    }

    @Override // xsna.dqp
    public final void G0(u1c0 u1c0Var) {
        va60 va60Var = this.n;
        HashMap<NewsEntry, io.reactivex.rxjava3.disposables.c> hashMap = va60Var.b;
        io.reactivex.rxjava3.disposables.c cVar = null;
        NewsEntry newsEntry = u1c0Var.g() ? u1c0Var.b : null;
        if (newsEntry != null) {
            if (hashMap.containsKey(newsEntry)) {
                io.reactivex.rxjava3.disposables.c cVar2 = hashMap.get(newsEntry);
                if (cVar2 == null || cVar2.h()) {
                    hashMap.remove(newsEntry);
                } else {
                    cVar = cVar2;
                }
            }
            io.reactivex.rxjava3.core.q f0 = u1c0Var.p.f0(u1c0Var);
            if (f0 != null) {
                cVar = va60Var.b(newsEntry, f0);
            }
        }
        if (cVar != null) {
            this.b.a(cVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
    
        if (r9.Gb() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0230, code lost:
    
        if (r6.Gb() != false) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void H(NewsEntry newsEntry, Integer num) {
        ShitAttachment shitAttachment;
        ShitAttachment shitAttachment2;
        VideoFile videoFile;
        boolean z = newsEntry instanceof TagsSuggestions;
        com.vk.lists.b<u1c0> bVar = this.c;
        if (z) {
            bVar.H(new pf4(202, newsEntry), new rrl(newsEntry, 202, 1));
            return;
        }
        ArrayList<NewsEntry> arrayList = this.d;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            Object obj = null;
            Object obj2 = null;
            if (i2 >= size) {
                break;
            }
            NewsEntry newsEntry2 = arrayList.get(i2);
            boolean f2 = epx.f(newsEntry2, newsEntry);
            d2f0 d2f0Var = this.v;
            if (f2 || ((newsEntry2 instanceof PromoPost) && epx.f(((PromoPost) newsEntry2).n, newsEntry))) {
                if ((newsEntry instanceof c6z) && (newsEntry2 instanceof c6z)) {
                    d2f0Var.getClass();
                    d2f0.d((c6z) newsEntry2, (c6z) newsEntry);
                } else {
                    arrayList.set(i2, newsEntry);
                }
            } else if (newsEntry2 instanceof Digest) {
                Iterator it = ((Digest) newsEntry2).q.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (epx.f((Post) next, newsEntry)) {
                        obj2 = next;
                        break;
                    }
                }
                Post post = (Post) obj2;
                if (post != null && (newsEntry instanceof c6z)) {
                    d2f0Var.getClass();
                    d2f0.d(post, (c6z) newsEntry);
                }
            } else if (newsEntry instanceof Videos) {
                if (newsEntry2 instanceof ShitAttachment) {
                    shitAttachment2 = (ShitAttachment) newsEntry2;
                }
                shitAttachment2 = null;
                if (shitAttachment2 != null) {
                    Iterator<T> it2 = ((Videos) newsEntry).Pb().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        VideoAttachment videoAttachment = (VideoAttachment) next2;
                        VideoAttachment videoAttachment2 = shitAttachment2.I;
                        if (epx.f((videoAttachment2 == null || (videoFile = videoAttachment2.k) == null) ? null : videoFile.a1(), videoAttachment.k.a1())) {
                            obj = next2;
                            break;
                        }
                    }
                    VideoAttachment videoAttachment3 = (VideoAttachment) obj;
                    if (videoAttachment3 != null) {
                        Serializer.c<ShitAttachment> cVar = ShitAttachment.CREATOR;
                        arrayList.set(i2, new ShitAttachment(shitAttachment2.i, shitAttachment2.j, shitAttachment2.k, shitAttachment2.l, shitAttachment2.m, shitAttachment2.n, shitAttachment2.o, shitAttachment2.p, shitAttachment2.q, shitAttachment2.r, shitAttachment2.s, shitAttachment2.t, shitAttachment2.u, shitAttachment2.v, shitAttachment2.w, shitAttachment2.x, shitAttachment2.y, shitAttachment2.z, shitAttachment2.A, shitAttachment2.B, shitAttachment2.C, shitAttachment2.D, shitAttachment2.E, shitAttachment2.F, shitAttachment2.G, shitAttachment2.H, videoAttachment3, shitAttachment2.J, shitAttachment2.K, shitAttachment2.L, shitAttachment2.M, shitAttachment2.N, shitAttachment2.O, shitAttachment2.P, shitAttachment2.Q, shitAttachment2.R, shitAttachment2.S, shitAttachment2.T, shitAttachment2.U, shitAttachment2.V, shitAttachment2.W, shitAttachment2.X, shitAttachment2.Y, shitAttachment2.Z, shitAttachment2.a0, shitAttachment2.b0, shitAttachment2.c0, shitAttachment2.d0, shitAttachment2.e0, shitAttachment2.f0, shitAttachment2.g0, shitAttachment2.h0, shitAttachment2.i0, shitAttachment2.j0, shitAttachment2.k0));
                    }
                }
            }
            i2++;
        }
        p6s p6sVar = (num != null && num.intValue() == 100) ? new p6s() : null;
        int i3 = 6;
        b0(bVar, newsEntry, 302, new cd4(this, i3));
        bVar.G(p6sVar, new vqp(1, newsEntry), new a7(newsEntry, 1, new oac(this, 4), 2));
        bVar.G(SingleClipV2Holder.BindConfig.HEADER, new udo(newsEntry, 5), new bjk(newsEntry, i3));
        b0(bVar, newsEntry, 396, new md8((byte) 0, 5));
        if (newsEntry instanceof Videos) {
            s3q0 s3q0Var = s3q0.a;
            ListDataSet.ArrayListImpl<u1c0> arrayListImpl = bVar.d;
            for (int i4 = 0; i4 < arrayListImpl.size(); i4++) {
                u1c0 u1c0Var = arrayListImpl.get(i4);
                if (u1c0Var.c == 1) {
                    NewsEntry newsEntry3 = u1c0Var.b;
                    if (newsEntry3 instanceof ShitAttachment) {
                        shitAttachment = (ShitAttachment) newsEntry3;
                    }
                    shitAttachment = null;
                    if (epx.f(shitAttachment != null ? shitAttachment.I : null, j5g.a0(((Videos) newsEntry).Pb()))) {
                        bVar.i(i4, s3q0Var);
                        u1c0 u1c0Var2 = arrayListImpl.get(i4);
                        arrayListImpl.set(i4, lbs.b(u1c0Var2, u1c0Var2.a, u1c0Var2.b, 1));
                        bVar.e(i4, s3q0Var);
                    }
                }
            }
        }
        b0(bVar, newsEntry, 1123, new a76((byte) 0, 3));
    }

    public final void I(NewsEntry newsEntry) {
        ArrayList<Comment> arrayList;
        Comment comment;
        Post post = newsEntry instanceof Post ? (Post) newsEntry : null;
        if (post == null) {
            return;
        }
        Activity activity = post.C;
        if (!(activity instanceof CommentsActivity) || (arrayList = ((CommentsActivity) activity).d) == null || (comment = (Comment) j5g.k0(arrayList)) == null) {
            return;
        }
        com.vk.lists.b<u1c0> bVar = this.c;
        ListDataSet.ArrayListImpl<u1c0> arrayListImpl = bVar.d;
        ListDataSet.ArrayListImpl<u1c0> arrayListImpl2 = bVar.d;
        Iterator<u1c0> it = arrayListImpl.iterator();
        int i2 = 0;
        int i3 = 0;
        int i4 = -1;
        int i5 = -1;
        while (it.hasNext()) {
            u1c0 next = it.next();
            int i6 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            u1c0 u1c0Var = next;
            if (epx.f(u1c0Var.b, newsEntry)) {
                int i7 = u1c0Var.c;
                if (i7 == 60) {
                    if (i5 != -1) {
                        i2 = i5;
                    }
                    i3++;
                    i5 = i2;
                } else if (i7 == 65) {
                    i4 = i2;
                }
            }
            i2 = i6;
        }
        if (i4 != -1) {
            fqp fqpVar = this.b;
            fqpVar.g6();
            int max = Math.max(0, arrayList.size() - 1);
            this.E.getClass();
            u1c0 n2 = k15.n(max, post, comment);
            n2.f = max;
            if (i5 != -1 && i3 > 0) {
                bVar.l(i5, i3);
            }
            bVar.x(i4, n2);
            boolean z = fqpVar.M0().J;
            com.vk.newsfeed.common.util.j jVar = this.A;
            jVar.G(i4, i4 + 1, z, arrayListImpl2);
            if (i5 != -1 && i3 >= 3) {
                bVar.B(i5, i3 - 2);
                jVar.G(i5, i5, fqpVar.M0().J, arrayListImpl2);
            }
            H(newsEntry, null);
            fqpVar.Aa(new yce(this, 18));
        }
    }

    public final void J(NewsEntry newsEntry) {
        Post post = newsEntry instanceof Post ? (Post) newsEntry : null;
        if (post == null) {
            return;
        }
        Activity activity = post.C;
        if (activity instanceof CommentsActivity) {
            ArrayList<Comment> arrayList = ((CommentsActivity) activity).d;
            com.vk.lists.b<u1c0> bVar = this.c;
            ListDataSet.ArrayListImpl<u1c0> arrayListImpl = bVar.d;
            List list = bVar.d;
            Iterator it = arrayListImpl.iterator();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = -1;
            while (it.hasNext()) {
                u1c0 u1c0Var = (u1c0) it.next();
                if (!epx.f(u1c0Var.b, newsEntry) || u1c0Var.c != 60) {
                    if (i5 != -1) {
                        break;
                    }
                } else {
                    if (i5 == -1) {
                        i5 = i4;
                    }
                    i3++;
                }
                i4++;
            }
            if (i5 != -1) {
                bVar.B(i5, i3);
                fqp fqpVar = this.b;
                boolean z = fqpVar.M0().J;
                com.vk.newsfeed.common.util.j jVar = this.A;
                jVar.G(i5, i5 + 1, z, list);
                if (arrayList != null && !arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int max = Math.max(0, size - 3);
                    ArrayList arrayList2 = new ArrayList(size);
                    for (Object obj : arrayList.subList(max, size)) {
                        int i6 = i2 + 1;
                        if (i2 < 0) {
                            e43.t();
                            throw null;
                        }
                        int i7 = i2 + max;
                        this.E.getClass();
                        u1c0 n2 = k15.n(i7, post, (Comment) obj);
                        n2.l = a();
                        n2.f = i7;
                        arrayList2.add(n2);
                        i2 = i6;
                    }
                    bVar.y(i5, arrayList2);
                    jVar.G(i5, arrayList2.size() + i5 + 1, fqpVar.M0().J, list);
                }
                H(newsEntry, null);
                Y();
            }
        }
    }

    public final void K(int i2, long j2) {
        NewsEntry newsEntry;
        Iterator<NewsEntry> it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                newsEntry = null;
                break;
            }
            newsEntry = it.next();
            NewsEntry newsEntry2 = newsEntry;
            if (newsEntry2 instanceof FaveEntry) {
                gmq gmqVar = ((FaveEntry) newsEntry2).i.f;
                if (gmqVar instanceof FaveMarketItem) {
                    Good good = ((FaveMarketItem) gmqVar).b;
                    if (good.b == j2) {
                        good.x = i2;
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        NewsEntry newsEntry3 = newsEntry;
        if (newsEntry3 == null) {
            return;
        }
        H(newsEntry3, null);
    }

    public void L(Photo photo) {
        this.b.a(new sni(24).u(this.d, this.c, new zqp(0, photo)));
    }

    public void M(Photo photo) {
        this.b.a(new sni(24).u(this.d, this.c, new n3i(photo, 15)));
    }

    public void O(NewsfeedExternalAction.c.w wVar) {
        bqp.c(this.u, wVar.a, wVar.b);
    }

    public void Q(NewsEntry newsEntry) {
        Post post = newsEntry instanceof Post ? (Post) newsEntry : null;
        if (post == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        Iterator<NewsEntry> it = this.d.iterator();
        while (it.hasNext()) {
            NewsEntry next = it.next();
            if (next instanceof Post) {
                Post post2 = (Post) next;
                if (epx.f(post2.m, post.m)) {
                    if (epx.f(next, post)) {
                        hashMap.put(next, next);
                    } else if (post2.mc()) {
                        post2.l.Ab(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID, false);
                        hashMap.put(next, next);
                    }
                }
            }
        }
        if (hashMap.isEmpty()) {
            return;
        }
        this.c.H(new com.vk.movika.sdk.base.logic.interactor.i(10, Collections.singleton(302), hashMap), new i50(hashMap, 28));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, xsna.i2c0] */
    /* JADX WARN: Type inference failed for: r1v5, types: [xsna.gmq] */
    /* JADX WARN: Type inference failed for: r3v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.vk.newsfeed.common.util.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13, types: [xsna.u1c0] */
    /* JADX WARN: Type inference failed for: r9v26, types: [com.vk.dto.newsfeed.entries.Post, com.vk.feed.core.models.news.NewsEntry] */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    public void R(int i2, int i3, NewsEntry newsEntry) {
        int w;
        Pair pair;
        u1c0 u1c0Var;
        u1c0 u1c0Var2;
        Post R;
        Feedback feedback;
        NewsEntry newsEntry2;
        u1c0 u1c0Var3;
        if (i2 == 105) {
            A(newsEntry);
            return;
        }
        if (i2 == 112) {
            I(newsEntry);
            return;
        }
        if (i2 == 115) {
            J(newsEntry);
            return;
        }
        if (i2 == 117) {
            if (!(newsEntry instanceof FaveEntry)) {
                H(newsEntry, null);
                return;
            }
            ?? r1 = ((FaveEntry) newsEntry).i.f;
            if (r1 instanceof Attachment) {
                Attachment attachment = (Attachment) r1;
                if (attachment instanceof VideoSnippetAttachment) {
                    VideoSnippetAttachment videoSnippetAttachment = (VideoSnippetAttachment) attachment;
                    attachment = videoSnippetAttachment.Pb(videoSnippetAttachment.k);
                } else if (attachment instanceof VideoAttachment) {
                    attachment = new VideoAttachment(((VideoAttachment) attachment).k);
                }
                y(attachment);
                return;
            }
            if (r1 instanceof Narrative) {
                y(new NarrativeAttachment((Narrative) r1));
                return;
            }
            if (r1 instanceof Good) {
                y(new MarketAttachment((Good) r1));
                return;
            } else if (r1 instanceof Post) {
                H((NewsEntry) r1, null);
                return;
            } else {
                H(newsEntry, null);
                return;
            }
        }
        fqp fqpVar = this.b;
        ?? r6 = this.A;
        com.vk.lists.b bVar = this.c;
        if (i2 == 119) {
            NewsEntryWithAttachments newsEntryWithAttachments = newsEntry instanceof NewsEntryWithAttachments ? (NewsEntryWithAttachments) newsEntry : null;
            if (newsEntryWithAttachments != null && (w = bVar.w(new brp(new r2n(1, newsEntry), 0))) >= 0) {
                newsEntryWithAttachments.Hb().e = false;
                u1c0 u1c0Var4 = (u1c0) bVar.c(w);
                if (u1c0Var4 == null) {
                    return;
                }
                s1c0 M0 = fqpVar.M0();
                ?? r10 = this.B;
                r10.getClass();
                List d2 = y64.d(newsEntryWithAttachments);
                ArrayList arrayList = new ArrayList();
                r10.e(arrayList, d2, newsEntryWithAttachments, u1c0Var4.b, u1c0Var4.l, u1c0Var4.m, M0);
                bVar.A(w);
                bVar.y(w, arrayList);
                r6.G(w, arrayList.size() + w, fqpVar.M0().J, bVar.d);
                bVar.H(new pf4(1 == true ? 1 : 0, newsEntryWithAttachments), new rrl(newsEntryWithAttachments, 1, 1));
                Y();
                return;
            }
            return;
        }
        if (i2 == 141) {
            Q(newsEntry);
            return;
        }
        if (i2 == 144) {
            DzenNews dzenNews = newsEntry instanceof DzenNews ? (DzenNews) newsEntry : null;
            if (dzenNews == null) {
                return;
            }
            List<DzenNewsItem> list = dzenNews.j;
            if (bVar.w(new xqp(new qpj(newsEntry, 9), 0)) >= 0) {
                int i4 = dzenNews.k;
                int size = list.size();
                if (i4 > size) {
                    i4 = size;
                }
                int i5 = dzenNews.k + dzenNews.l;
                int size2 = list.size();
                if (i5 > size2) {
                    i5 = size2;
                }
                int w2 = bVar.w(new x3l(new u6k(newsEntry, 7), 1));
                boolean z = i5 == list.size() && w2 >= 0;
                dzenNews.q = z;
                int i6 = w2 - 1;
                if (i6 < 0) {
                    i6 = 0;
                }
                if (z && dzenNews.n == null) {
                    ?? r9 = (u1c0) bVar.c(i6);
                    if (r9 != 0) {
                        r9.d = 4;
                        r4 = r9;
                    }
                    if (r4 != null) {
                        bVar.F(i6, r4);
                    }
                    bVar.A(w2);
                } else {
                    bVar.F(w2, lbs.c((u1c0) bVar.c(w2), dzenNews, null, 0, 6));
                }
                int i7 = i5 - i4;
                if (i7 < 0) {
                    i7 = 0;
                }
                ArrayList arrayList2 = new ArrayList(i7);
                new pto();
                while (r8 < i7) {
                    arrayList2.add(new p890(dzenNews, dzenNews, cn70.b(4), 17));
                    int i8 = i4 + r8;
                    u1c0 u1c0Var5 = new u1c0(241, dzenNews);
                    u1c0Var5.f = i8;
                    u1c0Var5.h = (ol60) j5g.a0(new tto(i8).a(dzenNews));
                    arrayList2.add(u1c0Var5);
                    r8++;
                }
                bVar.y(i6, arrayList2);
                dzenNews.k = i5;
                Y();
                return;
            }
            return;
        }
        if (i2 == 148) {
            ListDataSet.ArrayListImpl arrayListImpl = bVar.d;
            Iterator it = arrayListImpl.iterator();
            int i9 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i9 = -1;
                    break;
                } else if (epx.f(((u1c0) it.next()).b, newsEntry)) {
                    break;
                } else {
                    i9++;
                }
            }
            if (i9 == -1) {
                pair = new Pair(-1, 0);
            } else {
                int i10 = i9 + 1;
                while (true) {
                    u1c0 u1c0Var6 = (u1c0) j5g.b0(i10, arrayListImpl);
                    if (!epx.f(u1c0Var6 != null ? u1c0Var6.b : null, newsEntry)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                pair = new Pair(Integer.valueOf(i9), Integer.valueOf(i10 - i9));
            }
            int intValue = ((Number) pair.d()).intValue();
            int intValue2 = ((Number) pair.g()).intValue();
            if (intValue < 0 || intValue + intValue2 > arrayListImpl.size() || (u1c0Var = (u1c0) bVar.c(intValue)) == null) {
                return;
            }
            r6.getClass();
            u1c0 c2 = lbs.c(u1c0Var, null, null, 288, 3);
            NewsEntry newsEntry3 = c2.a;
            ListBuilder e2 = e43.e();
            e2.add(new fwv(y8g0.e(R.string.newsfeed_block_all_recommendations_closed_title), y8g0.e(R.string.newsfeed_block_all_recommendations_closed_message), newsEntry3));
            c2.h = (ol60) j5g.a0(e2.g());
            newsEntry3.c = false;
            c2.e = false;
            c2.d = 6;
            bVar.B(intValue, intValue2);
            bVar.x(intValue, c2);
            r6.G(intValue, intValue + 1, fqpVar.M0().J, arrayListImpl);
            Y();
            return;
        }
        if (i2 == 158) {
            T(newsEntry);
            return;
        }
        ArrayList<NewsEntry> arrayList3 = this.d;
        if (i2 == 128) {
            Iterator<NewsEntry> it2 = arrayList3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ?? next = it2.next();
                if (epx.f((NewsEntry) next, newsEntry)) {
                    r4 = next;
                    break;
                }
            }
            NewsEntryWithAttachments newsEntryWithAttachments2 = r4;
            if (newsEntryWithAttachments2 != null && (R = di60.R(newsEntryWithAttachments2)) != null && (feedback = R.g) != null) {
                feedback.e = true;
            }
            int w3 = bVar.w(new xyg(new r9k(this, newsEntryWithAttachments2), 1));
            if (w3 < 0 || (u1c0Var2 = (u1c0) bVar.c(w3)) == null) {
                return;
            }
            bVar.A(w3);
            int i11 = w3 - 1;
            u1c0 u1c0Var7 = (u1c0) bVar.c(i11);
            if (u1c0Var7 != null) {
                u1c0Var7.d = u1c0Var2.d;
                Rect rect = u1c0Var2.j;
                u1c0Var7.b().bottom = rect != null ? rect.bottom : 0;
                bVar.d(i11);
            }
            Y();
            return;
        }
        if (i2 == 129) {
            Post post = newsEntry instanceof Post ? (Post) newsEntry : null;
            if (post == null) {
                return;
            }
            Iterator<NewsEntry> it3 = arrayList3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    r8 = -1;
                    break;
                } else if (epx.f(it3.next(), post)) {
                    break;
                } else {
                    r8++;
                }
            }
            if (r8 == -1) {
                return;
            }
            NewsEntry newsEntry4 = arrayList3.get(r8);
            ?? r92 = newsEntry4 instanceof Post ? (Post) newsEntry4 : null;
            if (r92 != 0) {
                Post Nb = Post.Nb(r92, null, null, 0, null, 0, null, null, null, null, -131073);
                Nb.c = r92.c;
                Nb.g = r92.g;
                Nb.h = r92.h;
                arrayList3.set(r8, Nb);
            }
            int w4 = bVar.w(new yqp(new zqh(post, 13), 0));
            if (w4 >= 0) {
                W(w4);
                return;
            }
            return;
        }
        if (i2 == 133) {
            H(newsEntry, null);
            return;
        }
        if (i2 == 134) {
            E(newsEntry);
            return;
        }
        if (i2 == 138) {
            D(newsEntry, true);
            return;
        }
        if (i2 == 139) {
            Iterator<NewsEntry> it4 = arrayList3.iterator();
            while (true) {
                if (it4.hasNext()) {
                    newsEntry2 = it4.next();
                    if (epx.f(newsEntry2, newsEntry)) {
                        break;
                    }
                } else {
                    newsEntry2 = null;
                    break;
                }
            }
            int w5 = bVar.w(new drp(new m1k(this, newsEntry2), 0));
            if (w5 < 0 || (u1c0Var3 = (u1c0) bVar.c(w5)) == null) {
                return;
            }
            bVar.F(w5, lbs.c(u1c0Var3, null, null, 199, 3));
            return;
        }
        switch (i2) {
            case 100:
                D(newsEntry, false);
                break;
            case 101:
                E(newsEntry);
                break;
            case 102:
                H(newsEntry, Integer.valueOf(i3));
                break;
            default:
                switch (i2) {
                    case INVALID_LOG_ERROR_ENDPOINT_VALUE:
                        B(newsEntry);
                        break;
                    case 125:
                        G(newsEntry);
                        break;
                    case ASSET_FAILED_INSUFFICIENT_SPACE_VALUE:
                        int size3 = arrayList3.size();
                        while (r8 < size3) {
                            if (arrayList3.get(r8).equals(newsEntry)) {
                                arrayList3.set(r8, newsEntry);
                                break;
                            } else {
                                r8++;
                            }
                        }
                        break;
                    default:
                        switch (i2) {
                            case 153:
                                P(newsEntry);
                                break;
                            case 154:
                                N();
                                break;
                            case 155:
                                Post R2 = di60.R(newsEntry);
                                if (R2 != null) {
                                    Owner owner = R2.o;
                                    if (arrayList3 != null) {
                                        int size4 = arrayList3.size();
                                        for (int i12 = 0; i12 < size4; i12++) {
                                            NewsEntry newsEntry5 = arrayList3.get(i12);
                                            if (newsEntry5 instanceof Post) {
                                                Post post2 = (Post) newsEntry5;
                                                if (epx.f(post2.o.b, owner.b)) {
                                                    post2.uc(false);
                                                    H(newsEntry5, null);
                                                }
                                            }
                                        }
                                        break;
                                    } else {
                                        Iterator<NewsEntry> it5 = arrayList3.iterator();
                                        while (it5.hasNext()) {
                                            NewsEntry next2 = it5.next();
                                            if (next2 instanceof Post) {
                                                Post post3 = (Post) next2;
                                                if (epx.f(post3.o.b, owner.b)) {
                                                    post3.uc(false);
                                                    H(next2, null);
                                                }
                                            }
                                        }
                                        break;
                                    }
                                }
                                break;
                            case 156:
                                S(newsEntry);
                                break;
                        }
                }
        }
    }

    public void S(NewsEntry newsEntry) {
        E(newsEntry);
    }

    public void U(List<? extends NewsEntry> list, boolean z) {
        q(list);
        ArrayList arrayList = new ArrayList(list);
        e9l e9lVar = (e9l) this.y.getValue();
        e9l.a.b bVar = e9l.a.b.a;
        ArrayList<NewsEntry> arrayList2 = this.d;
        e9lVar.a(bVar, arrayList2, arrayList, null);
        arrayList2.addAll(0, arrayList);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            fqp fqpVar = this.b;
            if (!hasNext) {
                this.c.y(0, arrayList3);
                fqpVar.Xm(new gn7(this, z));
                return;
            }
            NewsEntry newsEntry = (NewsEntry) it.next();
            getRef();
            a();
            lzf0 stub = jzf0.a.a.getSTUB();
            com.vk.newsfeed.common.util.j.h(this.A, newsEntry, fqpVar.M0(), getRef(), a(), arrayList3, stub, 64);
        }
    }

    public final boolean V(NewsEntry newsEntry) {
        Iterator<NewsEntry> it = this.d.iterator();
        while (it.hasNext()) {
            if (it.next().equals(newsEntry)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public final void W(int i2) {
        com.vk.lists.b<u1c0> bVar;
        u1c0 c2;
        if (i2 >= 0 && (c2 = (bVar = this.c).c(i2)) != null) {
            bVar.A(i2);
            int i3 = i2 - 1;
            u1c0 c3 = bVar.c(i3);
            if (c3 != null) {
                c3.d = c2.d;
                bVar.d(i3);
            }
            Y();
        }
    }

    public final void Y() {
        this.h.clear();
        this.i.clear();
        this.j.clear();
        this.b.Nc();
        Z(0, 0, this.c.d);
    }

    public final void Z(int i2, int i3, List list) {
        u1c0 u1c0Var = (u1c0) j5g.a0(list);
        NewsEntry newsEntry = u1c0Var != null ? u1c0Var.b : null;
        int size = list.size();
        int i4 = 0;
        while (true) {
            fqp fqpVar = this.b;
            if (i4 >= size) {
                fqpVar.R1();
                fqpVar.Ak();
                return;
            }
            u1c0 u1c0Var2 = (u1c0) list.get(i4);
            if (!epx.f(u1c0Var2.b, newsEntry)) {
                newsEntry = u1c0Var2.b;
                i2++;
            }
            u1c0Var2.h(i2);
            if (u1c0Var2 instanceof lsi) {
                ((lsi) u1c0Var2).s.h(i2);
            } else if (u1c0Var2 instanceof a160) {
                Iterator<T> it = ((a160) u1c0Var2).q.iterator();
                while (it.hasNext()) {
                    ((u1c0) it.next()).h(i2);
                }
            }
            int zh = fqpVar.zh(i3 + i4);
            yg5 a2 = u1c0Var2.a();
            if (a2 != null) {
                this.h.put(zh, a2);
            }
            String e2 = u1c0Var2.e();
            if (e2 != null) {
                this.i.put(zh, e2);
            }
            String d2 = u1c0Var2.d();
            if (d2 != null) {
                this.j.put(zh, d2);
            }
            i4++;
        }
    }

    @Override // xsna.dqp
    public boolean a0() {
        return false;
    }

    @Override // xsna.dqp
    public final List<NewsEntry> c() {
        return this.d;
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.fb80.b
    public final void d(NewsEntry newsEntry, fb80.c cVar) {
        String Db;
        String str;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = cVar.i;
        if (newsEntry != null) {
            boolean z = newsEntry instanceof FaveEntry;
            if (z) {
                FaveEntry faveEntry = (FaveEntry) newsEntry;
                Object obj = faveEntry.i.f;
                NewsEntry newsEntry2 = obj instanceof NewsEntry ? (NewsEntry) obj : null;
                if (newsEntry2 == null || (Db = newsEntry2.Db()) == null) {
                    Db = faveEntry.m;
                }
            } else {
                Db = newsEntry.Db();
            }
            String str2 = Db;
            if (newsEntry instanceof PromoPost) {
                str = ((PromoPost) newsEntry).n.L.b;
            } else if (z) {
                FaveEntry faveEntry2 = (FaveEntry) newsEntry;
                Object obj2 = faveEntry2.i.f;
                str = obj2 instanceof NewsEntry ? ((NewsEntry) obj2).Cb().b : faveEntry2.b.b;
            } else {
                str = newsEntry.Cb().b;
            }
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.FEED_ITEM, null, null, null, str, null, 46, null);
            int i2 = cVar.e;
            boolean z2 = cVar.h;
            long j2 = cVar.c;
            long j3 = cVar.d;
            int i3 = cVar.f;
            int i4 = cVar.g;
            SchemeStat$TypeFeedItem.StateAsync stateAsync = cVar.b;
            Feedback feedback = newsEntry.g;
            new hzp0.i0(schemeStat$EventItem, i2, z2, j2, j3, new SchemeStat$TypeFeedItem(i3, i4, str2, null, stateAsync, feedback != null ? feedback.d : null, cVar.j, 8, null), cVar.i).a();
            this.D.getClass();
            o8s0.a(newsEntry, str2, cVar);
            newsEntry.Cb().f = true;
        }
        if (bu60.a.contains(mobileOfficialAppsCoreNavStat$EventScreen)) {
            ConcurrentHashMap.KeySetView<Object, Boolean> keySetView = jt50.a;
            jt50.a(SingleEvent.FEED);
        }
        boolean z3 = newsEntry instanceof DzenNews;
        if (z3) {
            ConcurrentHashMap.KeySetView<Object, Boolean> keySetView2 = jt50.a;
            jt50.a(SingleEvent.FEED_DZEN_BLOCK);
        }
        if (newsEntry == null || z3 || (newsEntry instanceof DzenStory)) {
            return;
        }
        List<String> g2 = di60.g(newsEntry);
        List<String> list = g2;
        if (list == null || list.isEmpty()) {
            return;
        }
        io.reactivex.rxjava3.internal.operators.single.s sVar = new io.reactivex.rxjava3.internal.operators.single.s(nr2.v(sa4.a(newsEntry, mobileOfficialAppsCoreNavStat$EventScreen), g2, (db4) this.s.getValue()), new ed(new lrk(this, 8), 15));
        asu0.a.getClass();
        io.reactivex.rxjava3.disposables.c subscribe = sVar.q(asu0.i()).subscribe();
        fqp fqpVar = this.b;
        fqpVar.a(subscribe);
        List<NewsfeedResearchEvent> f2 = di60.f(newsEntry);
        List<NewsfeedResearchEvent> list2 = f2;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        fqpVar.a(pq3.r((ia4) this.r.getValue(), f2).q(asu0.i()).subscribe());
    }

    @Override // xsna.dqp
    public VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
        return null;
    }

    @Override // xsna.eqp
    public final void j(UUID uuid) {
        this.b0 = uuid;
    }

    public final void o(List list, awq awqVar) {
        fqp fqpVar;
        q(list);
        ArrayList arrayList = new ArrayList(list);
        e9l e9lVar = (e9l) this.y.getValue();
        e9l.a.C2788a c2788a = e9l.a.C2788a.a;
        ArrayList<NewsEntry> arrayList2 = this.d;
        e9lVar.a(c2788a, arrayList2, arrayList, awqVar);
        int size = arrayList2.size();
        arrayList2.addAll(arrayList);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            fqpVar = this.b;
            if (!hasNext) {
                break;
            }
            NewsEntry newsEntry = (NewsEntry) it.next();
            if (awqVar != null) {
                try {
                } catch (Throwable th) {
                    com.vk.metrics.eventtracking.b.a.a(th);
                }
                if (((List) awqVar.f(newsEntry, new vkb(this, newsEntry, arrayList3, 3))) == null) {
                }
            }
            lzf0 stub = jzf0.a.a.getSTUB();
            getRef();
            a();
            com.vk.newsfeed.common.util.j.h(this.A, newsEntry, fqpVar.M0(), getRef(), a(), arrayList3, stub, 64);
        }
        com.vk.lists.b<u1c0> bVar = this.c;
        Z(size, bVar.d.size(), arrayList3);
        if (size == 0) {
            fqpVar.Q9(false);
            fqpVar.va();
        }
        bVar.n0(arrayList3);
        s(arrayList3, awqVar);
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.dqp
    public void onDestroy() {
        io.reactivex.rxjava3.disposables.c cVar;
        ce60.b.getClass();
        p870.f().g(this.F);
        p870.f().g(this.I);
        p870.f().g(this.J);
        p870.f().g(this.K);
        p870.f().g(this.L);
        p870.f().g(this.M);
        p870.f().g(this.N);
        p870.f().g(this.H);
        p870.f().g(this.P);
        p870.f().g(this.O);
        p870.f().g(this.R);
        p870.f().g(this.S);
        p870.f().g(this.T);
        p870.f().g(this.Q);
        p870.f().g(this.G);
        p870.f().g(this.U);
        io.reactivex.rxjava3.disposables.c cVar2 = this.o;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        cuz a2 = cuz.a(context);
        EntriesListPresenter$receiver$1 entriesListPresenter$receiver$1 = this.a0;
        a2.d(entriesListPresenter$receiver$1);
        Context context2 = e43.a;
        enj.s(context2 != null ? context2 : null, entriesListPresenter$receiver$1);
        this.q.a();
        int i2 = his0.d - 1;
        his0.d = i2;
        if (i2 == 0 && (cVar = his0.c) != null) {
            cVar.dispose();
        }
        rx3 rx3Var = (rx3) this.X.getValue();
        rx3Var.a.e();
        asu0.a.getClass();
        asu0.h().submit(new nx3(rx3Var, 0));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.dqp
    public void onDestroyView() {
        com.vk.lists.c cVar = this.g;
        if (cVar != null) {
            cVar.v();
        }
        this.n.a();
        ((NewsfeedOptionalAdsComponent) this.W.getValue()).la();
    }

    public final void q(List<? extends NewsEntry> list) {
        EntryHeader header;
        SourcePhoto sourcePhoto;
        Owner d2;
        SourcePhoto sourcePhoto2;
        Owner d3;
        Owner G;
        EntryHeader header2;
        SourcePhoto sourcePhoto3;
        Owner d4;
        SourcePhoto sourcePhoto4;
        Owner d5;
        Owner G2;
        List<? extends NewsEntry> list2 = list;
        boolean z = list2 instanceof List;
        HashSet<UserId> hashSet = this.p;
        if (!z || !(list2 instanceof RandomAccess)) {
            for (Parcelable parcelable : list2) {
                if (parcelable instanceof wee0) {
                    wee0 wee0Var = (wee0) parcelable;
                    Owner G3 = wee0Var.G();
                    if (j5g.P(hashSet, G3 != null ? G3.b : null) && (G = wee0Var.G()) != null) {
                        G.q = false;
                    }
                }
                if (parcelable instanceof wsx0) {
                    wsx0 wsx0Var = (wsx0) parcelable;
                    EntryHeader header3 = wsx0Var.getHeader();
                    if (j5g.P(hashSet, (header3 == null || (sourcePhoto2 = header3.b) == null || (d3 = sourcePhoto2.d()) == null) ? null : d3.b) && (header = wsx0Var.getHeader()) != null && (sourcePhoto = header.b) != null && (d2 = sourcePhoto.d()) != null) {
                        d2.q = false;
                    }
                }
            }
            return;
        }
        List<? extends NewsEntry> list3 = list2;
        int size = list3.size();
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable2 = (NewsEntry) list3.get(i2);
            if (parcelable2 instanceof wee0) {
                wee0 wee0Var2 = (wee0) parcelable2;
                Owner G4 = wee0Var2.G();
                if (j5g.P(hashSet, G4 != null ? G4.b : null) && (G2 = wee0Var2.G()) != null) {
                    G2.q = false;
                }
            }
            if (parcelable2 instanceof wsx0) {
                wsx0 wsx0Var2 = (wsx0) parcelable2;
                EntryHeader header4 = wsx0Var2.getHeader();
                if (j5g.P(hashSet, (header4 == null || (sourcePhoto4 = header4.b) == null || (d5 = sourcePhoto4.d()) == null) ? null : d5.b) && (header2 = wsx0Var2.getHeader()) != null && (sourcePhoto3 = header2.b) != null && (d4 = sourcePhoto3.d()) != null) {
                    d4.q = false;
                }
            }
        }
    }

    public boolean r(NewsEntry newsEntry) {
        return false;
    }

    @Override // xsna.dqp
    public final ListDataSet<u1c0> r0() {
        return this.c;
    }

    public final void s(ArrayList arrayList, awq awqVar) {
        boolean isEmpty = arrayList.isEmpty();
        com.vk.lists.c cVar = this.g;
        boolean z = cVar != null && cVar.z;
        boolean z2 = this.c.d.size() == 0;
        if (awqVar != null) {
            awqVar.n(isEmpty, z2, z);
        }
    }

    @Override // xsna.dqp
    public boolean s0() {
        return false;
    }

    public void t() {
        this.h.clear();
        this.i.clear();
        this.j.clear();
        com.vk.lists.b<u1c0> bVar = this.c;
        bVar.B(0, bVar.d.size());
        this.d.clear();
        fqp fqpVar = this.b;
        fqpVar.Nc();
        fqpVar.cn();
        fqpVar.ka();
        this.e.clear();
        this.f.clear();
        this.p.clear();
    }

    @Override // xsna.dqp
    public final void t0(FragmentImpl fragmentImpl) {
        a0();
        h3p0.b(fragmentImpl);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final s0d0 v() {
        return (s0d0) this.Z.getValue();
    }

    @Override // xsna.dqp
    public void v0(FragmentImpl fragmentImpl) {
        if (w()) {
            this.b.J0();
        }
    }

    public boolean w() {
        return true;
    }

    @Override // xsna.dqp
    public final void w0(Context context, jc60 jc60Var) {
        ((xzb0) this.c0.getValue()).f(context, jc60Var);
    }

    @Override // xsna.dqp
    public MobileOfficialAppsCoreNavStat$EventScreen x0() {
        UiTracker uiTracker = UiTracker.a;
        return UiTracker.c();
    }

    public final void y(Attachment attachment) {
        hfr.a aVar = new hfr.a(rli0.j(new i5g(this.d), new frp(0, attachment)));
        boolean z = false;
        while (aVar.hasNext()) {
            Parcelable parcelable = (NewsEntry) aVar.next();
            PromoPost promoPost = parcelable instanceof PromoPost ? (PromoPost) parcelable : null;
            Post post = promoPost != null ? promoPost.n : null;
            fsx0 fsx0Var = parcelable instanceof fsx0 ? (fsx0) parcelable : null;
            Post post2 = parcelable instanceof Post ? (Post) parcelable : null;
            Post post3 = post2 != null ? post2.D : null;
            boolean X = post != null ? X(post, attachment) : false;
            boolean X2 = fsx0Var != null ? X(fsx0Var, attachment) : false;
            boolean X3 = post3 != null ? X(post3, attachment) : false;
            if (X || X2 || X3) {
                this.c.u(new mt(attachment, this, parcelable, 4));
                z = true;
            }
        }
        if (z) {
            Y();
        }
    }

    @Override // xsna.dqp
    public final boolean y0(NewsEntry newsEntry) {
        ArrayList<Comment> arrayList;
        u1c0 c2;
        ArrayList<Comment> arrayList2;
        boolean e2 = hd60.a().a().e(m6r0.u0);
        if ((newsEntry instanceof Post) && e2) {
            Post post = (Post) newsEntry;
            Flags flags = post.l;
            Activity activity = post.C;
            boolean z = activity instanceof CommentsActivity;
            CommentsActivity commentsActivity = z ? (CommentsActivity) activity : null;
            if (commentsActivity != null) {
                HashSet<NewsEntry> hashSet = this.f;
                if (!hashSet.contains(newsEntry) && !flags.zb(35184372088832L) && (arrayList = commentsActivity.d) != null && !arrayList.isEmpty()) {
                    com.vk.lists.b<u1c0> bVar = this.c;
                    int size = bVar.d.size();
                    int i2 = -1;
                    for (int i3 = 0; i3 < size; i3++) {
                        if (!epx.f(bVar.c(i3).b, newsEntry)) {
                            if (i2 != -1) {
                                break;
                            }
                        } else {
                            i2 = i3;
                        }
                    }
                    if (i2 == -1 || (c2 = bVar.c(i2)) == null) {
                        return false;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    String a2 = a();
                    com.vk.newsfeed.common.util.j jVar = this.A;
                    arrayList3.addAll(jVar.t(post, post, commentsActivity, a2));
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        ((u1c0) it.next()).k = c2.k;
                    }
                    u1c0 u1c0Var = (u1c0) j5g.k0(arrayList3);
                    if (u1c0Var != null) {
                        u1c0Var.d = 4;
                    }
                    c2.d = 1;
                    hashSet.add(post);
                    flags.Ab(35184372088832L, true);
                    fqp fqpVar = this.b;
                    fqpVar.g6();
                    int i4 = i2 + 1;
                    bVar.y(i4, arrayList3);
                    jVar.G(i2, arrayList3.size() + i4, fqpVar.M0().J, bVar.d);
                    H(post, null);
                    fqpVar.Aa(new hrp(0, this, EntriesListPresenter.class, "updateList", "updateList()V", 0));
                    int i5 = c2.k;
                    CommentsActivity commentsActivity2 = z ? (CommentsActivity) activity : null;
                    if (commentsActivity2 != null && (arrayList2 = commentsActivity2.d) != null) {
                        Comment comment = (Comment) j5g.a0(arrayList2);
                        Integer valueOf = comment != null ? Integer.valueOf(comment.b) : null;
                        String valueOf2 = String.valueOf(System.currentTimeMillis());
                        new yzw();
                        yzw.a(post, i5, valueOf2, valueOf2, valueOf, null);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public abstract com.vk.lists.c z();

    @Override // xsna.dqp
    public final String z0(int i2) {
        return this.j.get(i2);
    }

    public void C() {
    }

    public void N() {
    }

    public void G(NewsEntry newsEntry) {
    }

    public void P(NewsEntry newsEntry) {
    }

    public void T(NewsEntry newsEntry) {
    }

    @Override // xsna.dqp
    public void u0(boolean z) {
    }

    @Override // xsna.fb80.b
    public final void n(Object obj, long j2, long j3) {
    }
}
