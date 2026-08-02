package com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.api.model.ReviewsActionType;
import com.vk.ecomm.reviews.api.model.createreview.CreateCommunityReviewData;
import com.vk.ecomm.reviews.impl.communities.reviews.data.storage.ConnectYClientsData;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.e;
import com.vk.ecomm.reviews.model.sort.ReviewsSort;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeCommunityReviewView;
import com.vk.stat.scheme.CommonMarketStat$RatingType;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a7f0;
import xsna.aa9;
import xsna.am0;
import xsna.arm0;
import xsna.b25;
import xsna.big0;
import xsna.bpn0;
import xsna.c5g;
import xsna.c7;
import xsna.d05;
import xsna.drm0;
import xsna.e43;
import xsna.efk0;
import xsna.epx;
import xsna.f4z;
import xsna.f57;
import xsna.fkq0;
import xsna.gxh;
import xsna.gzh;
import xsna.h7v;
import xsna.ha;
import xsna.hyh;
import xsna.hzp0;
import xsna.iie;
import xsna.izh;
import xsna.izs;
import xsna.j5g;
import xsna.jxh;
import xsna.jzh;
import xsna.kf1;
import xsna.kyh;
import xsna.lt0;
import xsna.mig;
import xsna.mj50;
import xsna.mla0;
import xsna.mzp0;
import xsna.n1d;
import xsna.nj;
import xsna.nm0;
import xsna.oj;
import xsna.q3j;
import xsna.ql2;
import xsna.qxh;
import xsna.rmg;
import xsna.rw;
import xsna.s3q0;
import xsna.s6;
import xsna.srg;
import xsna.tlo0;
import xsna.tq;
import xsna.txh;
import xsna.ugg0;
import xsna.vyh;
import xsna.vzh;
import xsna.w40;
import xsna.wj50;
import xsna.wk50;
import xsna.wl0;
import xsna.wyh;
import xsna.wzf;
import xsna.xx0;
import xsna.xyh;
import xsna.y2u0;
import xsna.y90;
import xsna.yo9;
import xsna.zgb;

/* compiled from: CommunityReviewsFeature.kt */
/* loaded from: classes18.dex */
public final class d extends wk50<g, vzh, c, e> {
    public final hyh f;
    public final mla0 g;
    public final gzh h;
    public final mzp0 i;
    public final q3j j;
    public final b25 k;
    public final h7v l;
    public final nm0 m;
    public final f4z n;
    public final f4z o;
    public final f4z p;
    public final jzh q;
    public final io.reactivex.rxjava3.disposables.g r;
    public final bpn0 s;
    public final bpn0 t;

    /* compiled from: CommunityReviewsFeature.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<e, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(e eVar) {
            ((d) this.receiver).T(eVar);
            return s3q0.a;
        }
    }

    public d() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, mla0 mla0Var, gzh gzhVar, mzp0 mzp0Var, q3j q3jVar, b25 b25Var, h7v h7vVar, nm0 nm0Var) {
        super(c.k.b, fVar);
        hyh hyhVar = new hyh();
        this.f = hyhVar;
        this.g = mla0Var;
        this.h = gzhVar;
        this.i = mzp0Var;
        this.j = q3jVar;
        this.k = b25Var;
        this.l = h7vVar;
        this.m = nm0Var;
        f4z f4zVar = new f4z();
        this.n = f4zVar;
        f4z f4zVar2 = new f4z();
        this.o = f4zVar2;
        this.p = new f4z();
        this.q = new jzh(f4zVar, f4zVar2, b25Var);
        this.r = new io.reactivex.rxjava3.disposables.g();
        this.s = new bpn0(new w40(this, 27));
        this.t = new bpn0(new xyh(this, 0));
    }

    public static void Y(d dVar, UserId userId, ReviewsSort reviewsSort, Map map) {
        xx0 xx0Var = new xx0(20);
        mzp0 mzp0Var = dVar.i;
        if (mzp0Var != null) {
            mzp0Var.a();
        }
        dVar.r.b(a7f0.a.f(dVar, dVar.h.a(0, userId, reviewsSort.h(), 0, map).l(new ql2(new s6(dVar, 25), 12)), new wl0(dVar, xx0Var), new srg(dVar, 1), 1));
    }

    public static Map Z(vzh vzhVar, int i, boolean z) {
        Map<Integer, txh> map = vzhVar.n;
        txh txhVar = map.get(Integer.valueOf(i));
        if (txhVar == null) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(Integer.valueOf(i), txh.a(txhVar, 0, false, false, z, null, false, 2096639));
        return linkedHashMap;
    }

    @Override // xsna.wk50
    public final void N(vzh vzhVar, c cVar) {
        List<List<jxh>> list;
        vzh vzhVar2 = vzhVar;
        c cVar2 = cVar;
        yo9 yo9Var = vzhVar2.m;
        Throwable th = vzhVar2.C;
        Map<UserId, big0> map = vzhVar2.z;
        int i = vzhVar2.i;
        Float f = vzhVar2.h;
        boolean z = vzhVar2.r;
        Map<Integer, txh> map2 = vzhVar2.n;
        UserId userId = vzhVar2.b;
        boolean z2 = cVar2 instanceof c.k;
        int i2 = 12;
        gzh gzhVar = this.h;
        if (z2) {
            T(e.i.b);
            UserId c = this.k.c();
            ReviewsSort reviewsSort = ReviewsSort.PUBLISHED_FROM_NEW_TO_OLD_SORT;
            T(new e.m(reviewsSort));
            T(new e.f(c, reviewsSort));
            Y(this, userId, reviewsSort, map);
            a7f0.a.e(this, ((gxh) gzhVar.d.b).N0(fkq0.a(userId)), null, new d05(i2, this, new ha(this, 25)), new f57(13), null, 9);
            return;
        }
        if (cVar2 instanceof c.t) {
            Y(this, userId, vzhVar2.v, map);
            return;
        }
        if (cVar2 instanceof c.m) {
            if (map2.size() % 20 == 0) {
                Integer num = vzhVar2.o.b;
                if (num == null || num.intValue() > 0) {
                    if ((!map2.isEmpty() && th != null) || vzhVar2.B || z) {
                        return;
                    }
                    X(vzhVar2);
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList = null;
        arrayList = null;
        char c2 = 1;
        if (cVar2 instanceof c.s) {
            if (vzhVar2.p != null || map2.isEmpty()) {
                C(c.k.b);
                return;
            } else {
                if (z) {
                    return;
                }
                this.r.b(null);
                T(e.n.b);
                Y(this, userId, vzhVar2.v, map);
                C(c.d.b);
                return;
            }
        }
        if (cVar2 instanceof c.p) {
            if (z || map2.isEmpty() || th == null) {
                return;
            }
            X(vzhVar2);
            return;
        }
        if (cVar2 instanceof c.a) {
            T(e.a.b);
            if (yo9Var != null) {
                C(c.n.e.b);
                return;
            } else {
                C(c.n.g.b);
                return;
            }
        }
        boolean z3 = cVar2 instanceof c.o;
        f4z f4zVar = this.n;
        if (z3) {
            f4zVar.b(new izh.c(vzhVar2.u));
            return;
        }
        if (cVar2 instanceof c.n) {
            c.n nVar = (c.n) cVar2;
            jzh jzhVar = this.q;
            f4z f4zVar2 = jzhVar.a;
            f4z f4zVar3 = jzhVar.b;
            if (nVar instanceof c.n.i) {
                qxh qxhVar = ((c.n.i) nVar).b;
                if (qxhVar == null) {
                    return;
                }
                boolean z4 = vzhVar2.c;
                ListBuilder e = e43.e();
                UserId userId2 = qxhVar.c;
                boolean z5 = qxhVar.j;
                ugg0 ugg0Var = qxhVar.h;
                boolean f2 = epx.f(userId2, jzhVar.c.c());
                if (!f2 && ugg0Var.d) {
                    e.add(ReviewsActionType.ACTION_REPLY);
                }
                if (!drm0.N(ugg0Var.c.a)) {
                    e.add(ReviewsActionType.ACTION_COPY_TEXT);
                }
                if (z4 && qxhVar.k && !z5) {
                    e.add(ReviewsActionType.ACTION_PIN);
                }
                if (z4 && z5) {
                    e.add(ReviewsActionType.ACTION_UNPIN);
                }
                if (!f2) {
                    e.add(ReviewsActionType.ACTION_REPORT);
                }
                if (qxhVar.d) {
                    e.add(ReviewsActionType.ACTION_DELETE);
                }
                if (qxhVar.e) {
                    e.add(ReviewsActionType.ACTION_EDIT);
                }
                ListBuilder g = e.g();
                if (g.isEmpty()) {
                    return;
                }
                f4zVar3.b(new kyh.i(g, qxhVar));
                return;
            }
            if (nVar instanceof c.n.j) {
                f4zVar2.b(new izh.h(((c.n.j) nVar).b));
                return;
            }
            if (nVar instanceof c.n.f) {
                f4zVar2.b(new izh.e(((c.n.f) nVar).b.b, vzhVar2.g));
                return;
            }
            if (nVar instanceof c.n.g) {
                f4zVar3.b(new kyh.c(userId, f, Integer.valueOf(i), vzhVar2.t));
                return;
            }
            if (nVar instanceof c.n.e) {
                f4zVar3.b(new kyh.b(yo9Var != null ? (String) yo9Var.c : null, yo9Var != null ? (String) yo9Var.d : null));
                return;
            }
            if (nVar instanceof c.n.a) {
                f4zVar3.b(kyh.e.a);
                return;
            }
            if (nVar instanceof c.n.b) {
                c.n.b bVar = (c.n.b) nVar;
                f4zVar3.b(new kyh.f(bVar.b, bVar.c));
                return;
            }
            if (nVar instanceof c.n.C1013c) {
                c.n.C1013c c1013c = (c.n.C1013c) nVar;
                f4zVar3.b(new kyh.g(c1013c.b, c1013c.c));
                return;
            }
            if (!(nVar instanceof c.n.h)) {
                if (!(nVar instanceof c.n.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                f4zVar3.b(new kyh.j());
                return;
            }
            c.n.h hVar = (c.n.h) nVar;
            int i3 = hVar.c;
            int i4 = hVar.b;
            txh txhVar = map2.get(Integer.valueOf(i3));
            if (txhVar != null && (list = txhVar.i) != null) {
                List<List<jxh>> list2 = list;
                ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    List<jxh> list3 = (List) it.next();
                    ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
                    String str = null;
                    for (jxh jxhVar : list3) {
                        if (str == null) {
                            str = jxhVar.d;
                        }
                        arrayList3.add(new ImageSize(jxhVar.a, jxhVar.b, jxhVar.c, null, (char) 0, false, 56, null));
                    }
                    arrayList2.add(new y2u0(arrayList3, str != null ? arm0.m(10, str) : null));
                }
                arrayList = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new Image(((y2u0) it2.next()).b));
                }
            }
            if (arrayList == null || ((Image) j5g.b0(i4, arrayList)) == null) {
                return;
            }
            f4zVar2.b(new izh.f(arrayList, i4));
            return;
        }
        if (cVar2 instanceof c.y) {
            b0(((c.y) cVar2).b);
            return;
        }
        boolean z6 = cVar2 instanceof c.e;
        f4z f4zVar4 = this.p;
        if (z6) {
            f4zVar4.b(new vyh.a(((c.e) cVar2).b));
            f4zVar4.b(new vyh.f(tq.h(tlo0.Companion, R.string.text_copied)));
            return;
        }
        if (cVar2 instanceof c.x) {
            f4zVar4.b(vyh.e.a);
            return;
        }
        boolean z7 = cVar2 instanceof c.b.a;
        hyh hyhVar = this.f;
        if (z7) {
            hyhVar.b(userId.b, f, Integer.valueOf(i));
            return;
        }
        if (cVar2 instanceof c.b.C1011b) {
            long j = userId.b;
            Float f3 = vzhVar2.e;
            Integer num2 = vzhVar2.f;
            hyhVar.getClass();
            new hzp0.j(new SchemeStat$EventItem(SchemeStat$EventItem.Type.GROUP, null, Long.valueOf(j), null, null, null, 58, null), new CommonCommunitiesStat$TypeCommunityReviewView(CommonCommunitiesStat$TypeCommunityReviewView.Type.TYPE_COMMUNITY_REVIEW_SHOW, new mig(), null, CommonMarketStat$RatingType.COMMUNITY, f3, num2, Long.valueOf(j), 4, null)).a();
            return;
        }
        if (cVar2 instanceof c.l) {
            c.l lVar = (c.l) cVar2;
            LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
            int i5 = lVar.b;
            txh txhVar2 = map2.get(Integer.valueOf(i5));
            if (txhVar2 == null) {
                return;
            }
            UserId userId3 = txhVar2.d.a;
            if (txhVar2.g) {
                a7f0.a.f(this, gzhVar.a.c(i5, userId3), new aa9(linkedHashMap, lVar, txhVar2, this, 3), new nj(12), 1);
                return;
            } else {
                a7f0.a.f(this, gzhVar.a.d(i5, userId3), new wyh(linkedHashMap, lVar, txhVar2, this, 0), new oj(16), 1);
                return;
            }
        }
        if (cVar2 instanceof c.f) {
            c.f fVar = (c.f) cVar2;
            b0(true);
            a7f0.a.f(this, gzhVar.a.g(fVar.b), new rw(this, vzhVar2, fVar, 8), new rmg(this, 4), 1);
            return;
        }
        boolean z8 = cVar2 instanceof c.g;
        f4z f4zVar5 = this.o;
        if (z8) {
            f4zVar5.b(new kyh.c(userId, f, Integer.valueOf(i), new CreateCommunityReviewData(null, null, null, Integer.valueOf(((c.g) cVar2).b), 7, null)));
            return;
        }
        if (cVar2 instanceof c.v) {
            c.v vVar = (c.v) cVar2;
            b0(true);
            a7f0.a.f(this, gzhVar.a.a(vVar.b), new zgb(this, vzhVar2, vVar, c2 == true ? 1 : 0), new n1d(this, 10), 1);
            return;
        }
        if (cVar2 instanceof c.h) {
            int i6 = ((c.h) cVar2).b;
            txh txhVar3 = map2.get(Integer.valueOf(i6));
            if (txhVar3 == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(map2);
            linkedHashMap2.put(Integer.valueOf(i6), txh.a(txhVar3, 0, false, !txhVar3.h, false, null, false, 2097023));
            T(new e.s(linkedHashMap2));
            return;
        }
        if (cVar2 instanceof c.C1012c) {
            T(new e.c(((c.C1012c) cVar2).b));
            return;
        }
        if (cVar2 instanceof c.i) {
            ReviewsSort reviewsSort2 = ReviewsSort.PUBLISHED_FROM_NEW_TO_OLD_SORT;
            ReviewsSort reviewsSort3 = vzhVar2.v;
            efk0 efk0Var = new efk0(reviewsSort2, R.string.community_reviews_filter_item_newest, reviewsSort2 == reviewsSort3);
            ReviewsSort reviewsSort4 = ReviewsSort.WITH_PHOTOS_SORT;
            efk0 efk0Var2 = new efk0(reviewsSort4, R.string.community_reviews_filter_item_with_photos, reviewsSort4 == reviewsSort3);
            ReviewsSort reviewsSort5 = ReviewsSort.HIGHEST_MARKS_SORT;
            efk0 efk0Var3 = new efk0(reviewsSort5, R.string.community_reviews_filter_item_highest_mark, reviewsSort5 == reviewsSort3);
            ReviewsSort reviewsSort6 = ReviewsSort.LOWEST_MARKS_SORT;
            f4zVar4.b(new vyh.b(e43.l(efk0Var, efk0Var2, efk0Var3, new efk0(reviewsSort6, R.string.community_reviews_filter_item_lowest_mark, reviewsSort6 == reviewsSort3))));
            return;
        }
        if (cVar2 instanceof c.q) {
            ReviewsSort reviewsSort7 = ((c.q) cVar2).b;
            b0(true);
            T(new e.m(reviewsSort7));
            Y(this, userId, reviewsSort7, map);
            return;
        }
        if (cVar2 instanceof c.z) {
            f4zVar.b(new izh.b(userId));
            return;
        }
        if (cVar2 instanceof c.w) {
            f4zVar5.b(new kyh.d(userId));
            return;
        }
        if (cVar2 instanceof c.j) {
            T(e.o.b);
            if (((c.j) cVar2).b) {
                q3j q3jVar = this.j;
                ConnectYClientsData a2 = q3jVar.a();
                ((SharedPreferences) q3jVar.b.getValue()).edit().putString(String.valueOf(fkq0.a(q3jVar.a).b), new Gson().toJson(new ConnectYClientsData(LocalDate.now().toString(), (a2 != null ? a2.a() : 0) + 1))).apply();
                return;
            }
            return;
        }
        if (cVar2 instanceof c.u) {
            ((mj50) this.s.getValue()).a(vzhVar2, cVar2);
            return;
        }
        if (!(cVar2 instanceof c.d)) {
            if (!(cVar2 instanceof c.r)) {
                throw new NoWhenBranchMatchedException();
            }
            ((mj50) this.t.getValue()).a(vzhVar2, cVar2);
        } else if (vzhVar2.d) {
            a7f0.a.f(this, gzhVar.c.c(userId), new kf1(this, 26), new lt0(24), 1);
            a7f0.a.f(this, gzhVar.c.d(userId), new wzf(this, 5), new y90(18), 1);
        }
    }

    public final wj50<kyh> U() {
        return this.o;
    }

    public final wj50<izh> V() {
        return this.n;
    }

    public final wj50<vyh> W() {
        return this.p;
    }

    public final void X(vzh vzhVar) {
        T(e.j.c.b);
        Integer valueOf = Integer.valueOf(vzhVar.o.a);
        UserId userId = vzhVar.b;
        String h = vzhVar.v.h();
        Map<Integer, txh> map = vzhVar.n;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, txh> entry : map.entrySet()) {
            if (!entry.getValue().j) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.r.b(a7f0.a.f(this, this.h.a(valueOf, userId, h, Integer.valueOf(linkedHashMap.size()), vzhVar.z).l(new c7(new am0(24), 22)), new a(1, this, d.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0), new iie(this, 4), 1));
    }

    public final void b0(boolean z) {
        T(new e.q(z));
    }
}
