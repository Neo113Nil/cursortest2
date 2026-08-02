package com.vk.stories.design.view.stats.tabs.info.mvi;

import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.stories.design.view.stats.tabs.info.mvi.a;
import com.vk.stories.design.view.stats.tabs.info.mvi.d;
import com.vk.story.viewer.stat.domain.LoadStrategy;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptySet;
import xsna.a960;
import xsna.epx;
import xsna.hg1;
import xsna.hij0;
import xsna.ifm0;
import xsna.jfm0;
import xsna.lyl0;
import xsna.m3y;
import xsna.n240;
import xsna.oem0;
import xsna.qzl0;
import xsna.wk50;

/* compiled from: StoryStatisticsInfoFeature.kt */
/* loaded from: classes6.dex */
public final class b extends wk50<g, ifm0, a, d> {
    public final jfm0 f;
    public io.reactivex.rxjava3.disposables.c g;

    public b(StoryEntry storyEntry, jfm0 jfm0Var) {
        super(new a.C1808a(LoadStrategy.CACHE_FIRST), new f(new ifm0(storyEntry, false, null, null, EmptySet.b)));
        this.f = jfm0Var;
        this.g = EmptyDisposable.INSTANCE;
        io.reactivex.rxjava3.subjects.f<oem0> fVar = jfm0Var.o().a;
        hg1.y3 y3Var = new hg1.y3();
        fVar.getClass();
        this.e.b(new i0(fVar, y3Var).subscribe(new a960(new qzl0(this, 4), 21)));
    }

    @Override // xsna.wk50
    public final void N(ifm0 ifm0Var, a aVar) {
        ifm0 ifm0Var2 = ifm0Var;
        a aVar2 = aVar;
        StoryEntry storyEntry = ifm0Var2.b;
        if (!(aVar2 instanceof a.b)) {
            if (!(aVar2 instanceof a.C1808a)) {
                throw new NoWhenBranchMatchedException();
            }
            U(storyEntry.d, storyEntry.c, ((a.C1808a) aVar2).b, true);
        } else {
            StoryEntry storyEntry2 = ((a.b) aVar2).b;
            if (epx.f(storyEntry, storyEntry2)) {
                return;
            }
            T(new d.e(storyEntry2));
            int i = storyEntry2.c;
            U(storyEntry2.d, i, ifm0Var2.f.contains(Integer.valueOf(i)) ? LoadStrategy.ONLY_CACHE : LoadStrategy.CACHE_FIRST, false);
        }
    }

    public final void U(UserId userId, int i, LoadStrategy loadStrategy, boolean z) {
        this.g.dispose();
        if (z) {
            T(d.C1809d.b);
        }
        io.reactivex.rxjava3.disposables.c subscribe = this.f.d(userId, i, loadStrategy).subscribe(new n240(new lyl0(this, 2), 19), new m3y(new hij0(this, 6), 22));
        this.g = subscribe;
        this.e.b(subscribe);
    }
}
