package com.vk.stories.design.view.stats.tabs.viewers.mvi;

import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryViewItem;
import com.vk.stories.design.view.stats.tabs.viewers.model.StoryUserViewer;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.a;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.e;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.i;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.j;
import com.vk.story.viewer.stat.domain.LoadStrategy;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import xsna.a960;
import xsna.anm0;
import xsna.asu0;
import xsna.be50;
import xsna.cc20;
import xsna.crx;
import xsna.dh40;
import xsna.eeh0;
import xsna.epx;
import xsna.f4z;
import xsna.fbm0;
import xsna.g5g;
import xsna.gib0;
import xsna.gul0;
import xsna.hg1;
import xsna.hu50;
import xsna.iim0;
import xsna.jfm0;
import xsna.m5y;
import xsna.mga0;
import xsna.n9m0;
import xsna.oem0;
import xsna.or50;
import xsna.qg60;
import xsna.qhg0;
import xsna.qzl0;
import xsna.rzl0;
import xsna.s520;
import xsna.tk40;
import xsna.vhm0;
import xsna.whg0;
import xsna.whm0;
import xsna.wk50;
import xsna.ye40;

/* compiled from: StoryStatisticsViewersFeature.kt */
/* loaded from: classes6.dex */
public final class b extends wk50<StoryStatisticsViewersViewState, j, a, e> {
    public final jfm0 f;
    public final UserId g;
    public final anm0 h;
    public final MobileOfficialAppsConStoriesStat$ViewEntryPoint i;
    public final fbm0 j;
    public io.reactivex.rxjava3.disposables.c k;
    public io.reactivex.rxjava3.disposables.c l;
    public final f4z m;

    public b(StoryEntry storyEntry, StoryOwner storyOwner, gul0 gul0Var, jfm0 jfm0Var, UserId userId, anm0 anm0Var, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, fbm0 fbm0Var) {
        super(null, new h(storyEntry, storyOwner, gul0Var));
        this.f = jfm0Var;
        this.g = userId;
        this.h = anm0Var;
        this.i = mobileOfficialAppsConStoriesStat$ViewEntryPoint;
        this.j = fbm0Var;
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        this.k = emptyDisposable;
        this.l = emptyDisposable;
        this.m = new f4z();
        io.reactivex.rxjava3.subjects.f<oem0> fVar = jfm0Var.o().a;
        hg1.z3 z3Var = new hg1.z3();
        fVar.getClass();
        this.e.b(new i0(fVar, z3Var).subscribe(new qg60(new qhg0(this, 10), 16)));
        this.e.b(fbm0Var.a().m(asu0.a.c()).subscribe(new hu50(new whg0(this, 11), 24), new eeh0(new ye40(18), 6)));
    }

    @Override // xsna.wk50
    public final void N(j jVar, a aVar) {
        j jVar2 = jVar;
        a aVar2 = aVar;
        j.c cVar = jVar2.f;
        StoryEntry storyEntry = jVar2.b;
        if (aVar2 instanceof a.c) {
            StoryEntry storyEntry2 = ((a.c) aVar2).b;
            if (epx.f(storyEntry, storyEntry2)) {
                return;
            }
            T(new e.c(storyEntry2));
            return;
        }
        if (aVar2 instanceof a.C1820a) {
            if (jVar2.e.a == null) {
                StoryOwner storyOwner = jVar2.c;
                if ((storyOwner instanceof StoryOwner.Community) || ((storyOwner instanceof StoryOwner.Owner) && ((StoryOwner.Owner) storyOwner).l)) {
                    T(new e.a.c(EmptySet.b));
                } else {
                    this.l.dispose();
                    T(e.a.d.b);
                    io.reactivex.rxjava3.disposables.c subscribe = this.f.j(this.g, LoadStrategy.CACHE_FIRST).subscribe(new whm0(new n9m0(this, 3), 0), new be50(new mga0(this, 20), 17));
                    this.l = subscribe;
                    this.e.b(subscribe);
                }
            }
            V(storyEntry, cVar.c.contains(Integer.valueOf(storyEntry.c)) ? LoadStrategy.ONLY_CACHE : LoadStrategy.CACHE_FIRST);
            return;
        }
        if (aVar2 instanceof a.d.c) {
            T(new e.d.c(((a.d.c) aVar2).b));
            return;
        }
        if (aVar2 instanceof a.d.b) {
            a.d.b bVar = (a.d.b) aVar2;
            T(new e.d.b(bVar.c, bVar.b, bVar.d));
            return;
        }
        if (aVar2 instanceof a.d.C1823a) {
            a.d.C1823a c1823a = (a.d.C1823a) aVar2;
            T(new e.d.a(c1823a.b, c1823a.c));
            return;
        }
        if (aVar2 instanceof a.d.C1824d) {
            a.d.C1824d c1824d = (a.d.C1824d) aVar2;
            iim0 iim0Var = c1824d.b;
            StoryUserViewer storyUserViewer = c1824d.c;
            if (iim0Var instanceof iim0.c) {
                anm0.d(this.h, MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_GO_TO_MESSAGE, MobileOfficialAppsCoreNavStat$EventScreen.STORY_FEEDBACK, this.i, storyEntry, null, 48);
                this.m.b(new i.a(storyUserViewer));
                return;
            } else if (iim0Var instanceof iim0.a) {
                anm0.d(this.h, MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_HIDE_STORIES, MobileOfficialAppsCoreNavStat$EventScreen.STORY_FEEDBACK, this.i, storyEntry, null, 48);
                U(storyUserViewer, true);
                return;
            } else {
                if (!(iim0Var instanceof iim0.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                anm0.d(this.h, MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_UNHIDE_STORIES, MobileOfficialAppsCoreNavStat$EventScreen.STORY_FEEDBACK, this.i, storyEntry, null, 48);
                W(storyUserViewer, true);
                return;
            }
        }
        if (!(aVar2 instanceof a.b.C1822b)) {
            if (!(aVar2 instanceof a.b.C1821a)) {
                throw new NoWhenBranchMatchedException();
            }
            a.b.C1821a c1821a = (a.b.C1821a) aVar2;
            T(e.b.C1826b.b);
            if (epx.f(c1821a.b, storyEntry.d) && c1821a.c == storyEntry.c) {
                V(storyEntry, LoadStrategy.ONLY_API);
                return;
            }
            return;
        }
        a.b.C1822b c1822b = (a.b.C1822b) aVar2;
        List<StoriesContainer> list = cVar.a;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                g5g.y(((StoriesContainer) it.next()).g, arrayList);
            }
            if (arrayList.isEmpty()) {
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                StoryEntry storyEntry3 = (StoryEntry) it2.next();
                if (storyEntry3.c == c1822b.c && epx.f(storyEntry3.d, c1822b.b)) {
                    V(storyEntry, LoadStrategy.ONLY_API);
                    return;
                }
            }
        }
    }

    public final void U(StoryUserViewer storyUserViewer, boolean z) {
        this.e.b(this.f.e(this.g, storyUserViewer.c).subscribe(new dh40(new crx(this, storyUserViewer, z, 2), 19), new s520(new rzl0(this, 3), 23)));
    }

    public final void V(StoryEntry storyEntry, LoadStrategy loadStrategy) {
        this.k.dispose();
        if ("live_finished".equals(storyEntry.e)) {
            T(new e.b.d(EmptyList.b));
            return;
        }
        T(e.b.C1827e.b);
        io.reactivex.rxjava3.disposables.c subscribe = this.f.m(storyEntry.d, storyEntry.c, storyEntry.o, loadStrategy).subscribe(new cc20(new or50(this, 27), 25), new tk40(new gib0(this, 14), 17));
        this.k = subscribe;
        this.e.b(subscribe);
    }

    public final void W(StoryUserViewer storyUserViewer, boolean z) {
        this.e.b(this.f.g(this.g, storyUserViewer.c).subscribe(new m5y(new vhm0(this, storyUserViewer, z, 0), 27), new a960(new qzl0(this, 5), 22)));
    }
}
