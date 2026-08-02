package com.vk.dzenarticle.impl.ui.store;

import com.vk.audience.api.domain.AudienceResearchSurfaceCode;
import com.vk.core.serialize.Serializer;
import com.vk.dzenarticle.impl.domain.DzenArticle;
import com.vk.dzenarticle.impl.domain.ReadStatState;
import com.vk.dzenarticle.impl.ui.entity.DzenArticleState;
import com.vk.feed.core.models.NewsfeedResearch;
import com.vk.feed.core.models.NewsfeedResearchEvent;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.movika.sdk.base.observable.i;
import com.vk.stat.scheme.MobileOfficialAppsConDzenStat$ArticleInfo;
import com.vk.stat.scheme.MobileOfficialAppsConDzenStat$ArticleInfoArticleId;
import com.vk.stat.scheme.MobileOfficialAppsConDzenStat$CloseArticleEvent;
import com.vk.stat.scheme.MobileOfficialAppsConDzenStat$OpenArticleEvent;
import com.vk.stat.scheme.MobileOfficialAppsConDzenStat$ScrollArticleEvent;
import com.vk.stat.scheme.MobileOfficialAppsConDzenStat$ShareClickEvent;
import com.vk.stat.scheme.MobileOfficialAppsConDzenStat$TypeDzenArticleItem;
import com.vk.toggle.b;
import com.vk.toggle.features.FeedFeatures;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.a0a;
import xsna.b520;
import xsna.bl50;
import xsna.bwj;
import xsna.c5g;
import xsna.cro;
import xsna.cw50;
import xsna.dro;
import xsna.dwj;
import xsna.epx;
import xsna.f4;
import xsna.fe0;
import xsna.fro;
import xsna.g3q;
import xsna.g8;
import xsna.gzn;
import xsna.hu1;
import xsna.jl50;
import xsna.la2;
import xsna.lj50;
import xsna.ll50;
import xsna.m4g;
import xsna.mro;
import xsna.msy;
import xsna.myc0;
import xsna.ncg;
import xsna.nro;
import xsna.on50;
import xsna.oro;
import xsna.ot;
import xsna.py;
import xsna.rdi;
import xsna.sj50;
import xsna.sro;
import xsna.tol;
import xsna.trf;
import xsna.uro;
import xsna.xi0;
import xsna.y8m;
import xsna.yok0;
import xsna.z14;
import xsna.zu50;

/* compiled from: DzenArticleInlineActor.kt */
/* loaded from: classes18.dex */
public final class DzenArticleInlineActor extends bl50<DzenArticleState, cro, on50, bwj, dwj, fro> {
    public final oro c;
    public final sj50<DzenArticleState, on50, ll50<on50, bwj, dwj>, jl50<DzenArticleState>, fro> d;
    public final Object e;

    /* compiled from: DzenArticleInlineActor.kt */
    public static final class StubNewsEntry extends NewsEntry {
        public static final Serializer.c<StubNewsEntry> CREATOR = new a();
        public final String i;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<StubNewsEntry> {
            @Override // com.vk.core.serialize.Serializer.c
            public final StubNewsEntry a(Serializer serializer) {
                String H = serializer.H();
                if (H == null) {
                    H = "";
                }
                return new StubNewsEntry(H);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StubNewsEntry[i];
            }
        }

        public StubNewsEntry(String str) {
            this.i = str;
        }

        @Override // com.vk.feed.core.models.news.NewsEntry
        public final String Db() {
            return this.i;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.i);
        }

        @Override // com.vk.feed.core.models.news.NewsEntry
        public final int zb() {
            return -1;
        }
    }

    public DzenArticleInlineActor(oro oroVar, sj50<DzenArticleState, on50, ll50<on50, bwj, dwj>, jl50<DzenArticleState>, fro> sj50Var) {
        super(sj50Var);
        this.c = oroVar;
        this.d = sj50Var;
        this.e = msy.a(LazyThreadSafetyMode.NONE, new f4(14));
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
    public static final void m(DzenArticleInlineActor dzenArticleInlineActor, DzenArticle dzenArticle) {
        NewsfeedResearch newsfeedResearch;
        oro oroVar = dzenArticleInlineActor.c;
        dro d = oroVar.d();
        String str = ((DzenArticleState) dzenArticleInlineActor.b.getCurrentState()).b;
        String str2 = dzenArticle.c;
        String entryPoint = oroVar.getEntryPoint();
        d.getClass();
        dro.b(new MobileOfficialAppsConDzenStat$TypeDzenArticleItem(new MobileOfficialAppsConDzenStat$OpenArticleEvent(epx.f(entryPoint, "from_deeplink") ? MobileOfficialAppsConDzenStat$OpenArticleEvent.EntryPoint.DEEPLINK : MobileOfficialAppsConDzenStat$OpenArticleEvent.EntryPoint.FEED_BLOCK, new MobileOfficialAppsConDzenStat$ArticleInfo(new MobileOfficialAppsConDzenStat$ArticleInfoArticleId(str), str2)), null, null, null, 14, null));
        if (((Boolean) dzenArticleInlineActor.e.getValue()).booleanValue() && (newsfeedResearch = dzenArticle.n) != null) {
            AudienceResearchSurfaceCode audienceResearchSurfaceCode = AudienceResearchSurfaceCode.DZEN_ARTICLE;
            List<String> list = newsfeedResearch.b;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(oroVar.f().a((String) it.next()).b(audienceResearchSurfaceCode).build());
            }
            oroVar.c().b(arrayList);
            for (NewsfeedResearchEvent newsfeedResearchEvent : newsfeedResearch.c) {
                oroVar.c().a(newsfeedResearchEvent.b, newsfeedResearchEvent.c);
            }
        }
    }

    @Override // xsna.bl50, xsna.qj50
    public final sj50<DzenArticleState, on50, ll50<on50, bwj, dwj>, jl50<DzenArticleState>, fro> W() {
        return this.d;
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        xi0 xi0Var;
        fe0 fe0Var;
        fe0 fe0Var2;
        xi0 xi0Var2;
        fe0 fe0Var3;
        String str;
        fe0 fe0Var4;
        String str2;
        fe0 fe0Var5;
        fe0 fe0Var6;
        zu50 zu50Var;
        zu50 zu50Var2;
        cro croVar = (cro) lj50Var;
        b520 b520Var = null;
        if (croVar.equals(cro.o.b)) {
            g3q.a(this, new mro(this, null));
            if (((DzenArticleState) this.b.getCurrentState()).e != DzenArticleState.LoadingState.NOT_INITIALIZED) {
                rdi.y(this, new m4g(this, 16));
                return;
            } else {
                rdi.y(this, new ot(21));
                g3q.a(this, new nro(this, new trf(this, 20), null));
                return;
            }
        }
        if (croVar.equals(cro.n.b)) {
            oro oroVar = this.c;
            sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var = this.b;
            if (((DzenArticleState) sj50Var.getCurrentState()).e == DzenArticleState.LoadingState.IDLE && ((DzenArticleState) sj50Var.getCurrentState()).d.b != 0) {
                DzenArticle dzenArticle = ((DzenArticleState) sj50Var.getCurrentState()).c;
                if (dzenArticle != null) {
                    ReadStatState readStatState = ((DzenArticleState) sj50Var.getCurrentState()).d;
                    long currentTimeMillis = (System.currentTimeMillis() - readStatState.b) / 1000;
                    String str3 = ((DzenArticleState) sj50Var.getCurrentState()).b;
                    if (!readStatState.d) {
                        dro d = oroVar.d();
                        String str4 = dzenArticle.c;
                        d.getClass();
                        dro.a(MobileOfficialAppsConDzenStat$CloseArticleEvent.CloseType.WITHOUT_READ, currentTimeMillis, str3, str4);
                    } else if (!readStatState.g || currentTimeMillis < 60) {
                        dro d2 = oroVar.d();
                        String str5 = dzenArticle.c;
                        d2.getClass();
                        dro.a(MobileOfficialAppsConDzenStat$CloseArticleEvent.CloseType.READ_PART, currentTimeMillis, str3, str5);
                    } else {
                        dro d3 = oroVar.d();
                        String str6 = dzenArticle.c;
                        d3.getClass();
                        dro.a(MobileOfficialAppsConDzenStat$CloseArticleEvent.CloseType.READ_FULL, currentTimeMillis, str3, str6);
                    }
                }
                rdi.y(this, new py(23));
            }
            uro b = oroVar.b();
            String str7 = ((DzenArticleState) sj50Var.getCurrentState()).b;
            b.getClass();
            FeedFeatures feedFeatures = FeedFeatures.DZEN_CAROUSEL_MEDIASCOPE;
            feedFeatures.getClass();
            if (b.A.a(feedFeatures) && b.a.compareAndSet(true, false)) {
                yok0 yok0Var = b.b;
                if (yok0Var != null) {
                    yok0Var.b(null);
                }
                b.b = null;
                myc0.h(b.c, null, null, new sro(b, str7, null), 3);
                return;
            }
            return;
        }
        if (croVar.equals(cro.m.b)) {
            sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var2 = this.b;
            xi0 xi0Var3 = ((DzenArticleState) sj50Var2.getCurrentState()).f;
            if (xi0Var3 != null && (zu50Var2 = xi0Var3.a) != null) {
                zu50Var2.a();
            }
            xi0 xi0Var4 = ((DzenArticleState) sj50Var2.getCurrentState()).g;
            if (xi0Var4 != null && (zu50Var = xi0Var4.a) != null) {
                zu50Var.a();
            }
            rdi.y(this, new la2(26));
            rdi.y(this, new i(28));
            return;
        }
        if ((croVar instanceof cro.c) || (croVar instanceof cro.q)) {
            c(fro.a.a);
            return;
        }
        if (croVar.equals(cro.l.b)) {
            rdi.y(this, new g8(20));
            g3q.a(this, new nro(this, new ncg(this, 17), null));
            return;
        }
        if (croVar.equals(cro.p.b)) {
            DzenArticle dzenArticle2 = ((DzenArticleState) this.b.getCurrentState()).c;
            if (dzenArticle2 == null) {
                return;
            }
            dro d4 = this.c.d();
            String str8 = ((DzenArticleState) this.b.getCurrentState()).b;
            String str9 = dzenArticle2.c;
            d4.getClass();
            dro.b(new MobileOfficialAppsConDzenStat$TypeDzenArticleItem(null, null, null, new MobileOfficialAppsConDzenStat$ShareClickEvent(new MobileOfficialAppsConDzenStat$ArticleInfo(new MobileOfficialAppsConDzenStat$ArticleInfoArticleId(str8), str9)), 7, null));
            c(new fro.d("https://" + a0a.d + "/feed?w=actual-news-" + ((DzenArticleState) this.b.getCurrentState()).b));
            return;
        }
        if (croVar.equals(cro.f.b)) {
            rdi.y(this, new y8m(2));
            return;
        }
        if (croVar instanceof cro.g) {
            c(new fro.c(((cro.g) croVar).b));
            return;
        }
        if (croVar instanceof cro.s) {
            cro.s sVar = (cro.s) croVar;
            zu50 zu50Var3 = sVar.b;
            cw50 cw50Var = sVar.c;
            fe0 fe0Var7 = sVar.d;
            if (zu50Var3 == null || cw50Var == null || fe0Var7 == null) {
                return;
            }
            rdi.y(this, new z14(zu50Var3, cw50Var, fe0Var7, 5));
            return;
        }
        if (croVar instanceof cro.i) {
            cro.i iVar = (cro.i) croVar;
            zu50 zu50Var4 = iVar.b;
            cw50 cw50Var2 = iVar.c;
            fe0 fe0Var8 = iVar.d;
            if (zu50Var4 == null || cw50Var2 == null || fe0Var8 == null) {
                return;
            }
            rdi.y(this, new tol(zu50Var4, cw50Var2, fe0Var8, 1));
            return;
        }
        if (croVar.equals(cro.e.b)) {
            rdi.y(this, new la2(26));
            return;
        }
        if (croVar.equals(cro.d.b)) {
            rdi.y(this, new i(28));
            return;
        }
        if (croVar.equals(cro.r.b)) {
            xi0 xi0Var5 = ((DzenArticleState) this.b.getCurrentState()).f;
            if (xi0Var5 == null || (fe0Var6 = xi0Var5.c) == null) {
                return;
            }
            q("type_top_ad", fe0Var6);
            return;
        }
        if (croVar.equals(cro.h.b)) {
            xi0 xi0Var6 = ((DzenArticleState) this.b.getCurrentState()).g;
            if (xi0Var6 == null || (fe0Var5 = xi0Var6.c) == null) {
                return;
            }
            q("type_middle_ad", fe0Var5);
            return;
        }
        if (croVar instanceof cro.b) {
            cro.b bVar = (cro.b) croVar;
            String str10 = bVar.b;
            String str11 = bVar.c;
            sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var3 = this.b;
            if (epx.f(str11, "type_top_ad")) {
                xi0 xi0Var7 = ((DzenArticleState) sj50Var3.getCurrentState()).f;
                if (xi0Var7 == null || (fe0Var4 = xi0Var7.c) == null) {
                    return;
                }
                Iterator<b520> it = fe0Var4.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    b520 next = it.next();
                    if (epx.f(next.a, str10)) {
                        b520Var = next;
                        break;
                    }
                }
                b520 b520Var2 = b520Var;
                if (b520Var2 == null || (str2 = b520Var2.c) == null) {
                    return;
                }
                fe0Var4.c(str2);
                rdi.y(this, new la2(26));
                return;
            }
            if (!epx.f(str11, "type_middle_ad") || (xi0Var2 = ((DzenArticleState) sj50Var3.getCurrentState()).g) == null || (fe0Var3 = xi0Var2.c) == null) {
                return;
            }
            Iterator<b520> it2 = fe0Var3.c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                b520 next2 = it2.next();
                if (epx.f(next2.a, str10)) {
                    b520Var = next2;
                    break;
                }
            }
            b520 b520Var3 = b520Var;
            if (b520Var3 == null || (str = b520Var3.c) == null) {
                return;
            }
            fe0Var3.c(str);
            rdi.y(this, new i(28));
            return;
        }
        if (croVar instanceof cro.a) {
            String str12 = ((cro.a) croVar).b;
            sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var4 = this.b;
            if (epx.f(str12, "type_top_ad")) {
                xi0 xi0Var8 = ((DzenArticleState) sj50Var4.getCurrentState()).f;
                if (xi0Var8 == null || (fe0Var2 = xi0Var8.c) == null) {
                    return;
                }
                fe0Var2.a();
                return;
            }
            if (!epx.f(str12, "type_middle_ad") || (xi0Var = ((DzenArticleState) sj50Var4.getCurrentState()).g) == null || (fe0Var = xi0Var.c) == null) {
                return;
            }
            fe0Var.a();
            return;
        }
        if (!(croVar instanceof cro.k)) {
            if (!croVar.equals(cro.j.b)) {
                throw new NoWhenBranchMatchedException();
            }
            rdi.y(this, new gzn(1));
            return;
        }
        int i = ((cro.k) croVar).b;
        oro oroVar2 = this.c;
        sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var5 = this.b;
        DzenArticle dzenArticle3 = ((DzenArticleState) sj50Var5.getCurrentState()).c;
        if (dzenArticle3 != null) {
            String str13 = dzenArticle3.c;
            ReadStatState readStatState2 = ((DzenArticleState) sj50Var5.getCurrentState()).d;
            String str14 = ((DzenArticleState) sj50Var5.getCurrentState()).b;
            if (i >= 1 && !readStatState2.c) {
                oroVar2.d().getClass();
                dro.c(MobileOfficialAppsConDzenStat$ScrollArticleEvent.ScrollPesent.SCROLLED_P1, str14, str13);
            }
            if (i >= 25 && !readStatState2.d) {
                oroVar2.d().getClass();
                dro.c(MobileOfficialAppsConDzenStat$ScrollArticleEvent.ScrollPesent.SCROLLED_P25, str14, str13);
            }
            if (i >= 50 && !readStatState2.e) {
                oroVar2.d().getClass();
                dro.c(MobileOfficialAppsConDzenStat$ScrollArticleEvent.ScrollPesent.SCROLLED_P50, str14, str13);
            }
        }
        DzenArticle dzenArticle4 = ((DzenArticleState) sj50Var5.getCurrentState()).c;
        if (dzenArticle4 != null) {
            String str15 = dzenArticle4.c;
            ReadStatState readStatState3 = ((DzenArticleState) sj50Var5.getCurrentState()).d;
            String str16 = ((DzenArticleState) sj50Var5.getCurrentState()).b;
            if (i >= 75 && !readStatState3.f) {
                oroVar2.d().getClass();
                dro.c(MobileOfficialAppsConDzenStat$ScrollArticleEvent.ScrollPesent.SCROLLED_P75, str16, str15);
            }
            if (i >= 99 && !readStatState3.g) {
                oroVar2.d().getClass();
                dro.c(MobileOfficialAppsConDzenStat$ScrollArticleEvent.ScrollPesent.SCROLLED_P99, str16, str15);
            }
            if (i >= 100 && !readStatState3.h) {
                oroVar2.d().getClass();
                dro.c(MobileOfficialAppsConDzenStat$ScrollArticleEvent.ScrollPesent.SCROLLED_P100, str16, str15);
            }
        }
        rdi.y(this, new hu1(this, i, 1));
    }

    public final void q(String str, fe0 fe0Var) {
        ArrayList<b520> arrayList = fe0Var.c;
        ArrayList arrayList2 = new ArrayList();
        Iterator<b520> it = arrayList.iterator();
        while (it.hasNext()) {
            b520 next = it.next();
            if (epx.f(next.b, "complain")) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((b520) it2.next()).a);
        }
        c(new fro.b(new StubNewsEntry(str), (String[]) arrayList3.toArray(new String[0])));
    }
}
