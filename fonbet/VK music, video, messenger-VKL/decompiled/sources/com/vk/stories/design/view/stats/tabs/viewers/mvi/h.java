package com.vk.stories.design.view.stats.tabs.viewers.mvi;

import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.StoryUserProfile;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.e;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.j;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Comparator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import xsna.dm50;
import xsna.gul0;
import xsna.izi0;
import xsna.j5g;
import xsna.jw5;
import xsna.ut30;

/* compiled from: StoryStatisticsViewersReducer.kt */
/* loaded from: classes6.dex */
public final class h extends dm50<StoryStatisticsViewersViewState, e, j> {
    public final gul0 d;

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        public final /* synthetic */ Set b;
        public final /* synthetic */ j c;

        public a(Set set, j jVar) {
            this.b = set;
            this.c = jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            StoryUserProfile storyUserProfile = (StoryUserProfile) t;
            UserId userId = storyUserProfile.c;
            Set set = this.b;
            boolean contains = set.contains(userId);
            boolean z = false;
            j jVar = this.c;
            Boolean valueOf = Boolean.valueOf(contains && !jVar.g.contains(storyUserProfile.c));
            StoryUserProfile storyUserProfile2 = (StoryUserProfile) t2;
            if (set.contains(storyUserProfile2.c) && !jVar.g.contains(storyUserProfile2.c)) {
                z = true;
            }
            return jw5.b(valueOf, Boolean.valueOf(z));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h(StoryEntry storyEntry, StoryOwner storyOwner, gul0 gul0Var) {
        super(new j(storyEntry, storyOwner, r3, r4, new j.c(null, null, r6), r6, EmptyList.b));
        j.d dVar = new j.d(null, 0, null, null);
        j.a aVar = new j.a(null, null);
        EmptySet emptySet = EmptySet.b;
        this.d = gul0Var;
    }

    public static VKList i(VKList vKList, Set set, j jVar) {
        VKList vKList2 = new VKList(j5g.D0(new a(set, jVar), vKList));
        vKList2.o(vKList.i());
        vKList2.l(vKList.k() == 1);
        vKList2.n(vKList.j());
        return vKList2;
    }

    @Override // xsna.dm50
    public final j c(j jVar, e eVar) {
        VKList<StoryUserProfile> vKList;
        j jVar2 = jVar;
        e eVar2 = eVar;
        j.c cVar = jVar2.f;
        j.a aVar = jVar2.e;
        j.d dVar = jVar2.d;
        if (eVar2 instanceof e.c) {
            return j.a(jVar2, ((e.c) eVar2).b, j.d.a(dVar, null, new j.b.C1829b(false), null, 3), null, null, null, null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
        }
        if (eVar2 instanceof e.d) {
            e.d dVar2 = (e.d) eVar2;
            if (dVar2 instanceof e.d.c) {
                return dVar.a == null ? j.a(jVar2, null, j.d.a(dVar, null, new j.b.C1829b(true), null, 3), null, null, null, null, 123) : !((e.d.c) dVar2).b ? j.a(jVar2, null, j.d.a(dVar, null, null, new j.b.C1829b(true), 3), null, null, null, null, 123) : j.a(jVar2, null, j.d.a(dVar, null, new j.b.C1829b(false), null, 3), null, null, null, null, 123);
            }
            if (!(dVar2 instanceof e.d.b)) {
                if (dVar2 instanceof e.d.a) {
                    e.d.a aVar2 = (e.d.a) dVar2;
                    j.b.a aVar3 = new j.b.a(aVar2.c);
                    return j.a(jVar2, null, (aVar2.b || (vKList = dVar.a) == null || vKList.isEmpty()) ? j.d.a(dVar, null, aVar3, null, 10) : j.d.a(dVar, null, null, aVar3, 7), null, null, null, null, 123);
                }
                if (dVar2 instanceof e.d.C1828d) {
                    return j.a(jVar2, null, null, null, null, null, ((e.d.C1828d) dVar2).b, 63);
                }
                throw new NoWhenBranchMatchedException();
            }
            e.d.b bVar = (e.d.b) dVar2;
            VKList<StoryUserProfile> vKList2 = bVar.b;
            if (!bVar.d) {
                VKList<StoryUserProfile> vKList3 = dVar.a;
                if (vKList3 == null) {
                    vKList3 = new VKList<>();
                }
                vKList3.addAll(vKList2);
                vKList3.o(vKList2.i());
                vKList3.l(vKList2.k() == 1);
                vKList3.n(vKList2.j());
                vKList2 = vKList3;
            }
            Set set = aVar.a;
            if (set == null) {
                set = EmptySet.b;
            }
            return j.a(jVar2, null, new j.d(i(vKList2, set, jVar2), bVar.c, null, null), null, null, null, null, 123);
        }
        if (!(eVar2 instanceof e.a)) {
            if (!(eVar2 instanceof e.b)) {
                throw new NoWhenBranchMatchedException();
            }
            e.b bVar2 = (e.b) eVar2;
            if (bVar2 instanceof e.b.C1827e) {
                return cVar.a == null ? j.a(jVar2, null, null, null, j.c.a(cVar, null, new j.b.C1829b(true), null, 5), null, null, 111) : jVar2;
            }
            if (bVar2 instanceof e.b.d) {
                return j.a(jVar2, null, null, null, j.c.a(cVar, ((e.b.d) bVar2).b, null, null, 4), null, null, 111);
            }
            if (bVar2 instanceof e.b.c) {
                return j.a(jVar2, null, null, null, j.c.a(cVar, null, new j.b.a(((e.b.c) bVar2).b), null, 5), null, null, 111);
            }
            if (bVar2 instanceof e.b.a) {
                return j.a(jVar2, null, null, null, j.c.a(cVar, null, null, izi0.k(cVar.c, Integer.valueOf(((e.b.a) bVar2).b)), 3), null, null, 111);
            }
            if (bVar2 instanceof e.b.C1826b) {
                return j.a(jVar2, null, null, null, j.c.a(cVar, null, null, EmptySet.b, 3), null, null, 111);
            }
            throw new NoWhenBranchMatchedException();
        }
        e.a aVar4 = (e.a) eVar2;
        if (aVar4 instanceof e.a.d) {
            j.b.C1829b c1829b = new j.b.C1829b(true);
            Set<UserId> set2 = aVar.a;
            aVar.getClass();
            return j.a(jVar2, null, null, new j.a(set2, c1829b), null, null, null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
        }
        if (aVar4 instanceof e.a.c) {
            VKList<StoryUserProfile> vKList4 = dVar.a;
            if (vKList4 != null) {
                dVar = j.d.a(dVar, i(vKList4, ((e.a.c) aVar4).b, jVar2), null, null, 14);
            }
            return j.a(jVar2, null, dVar, new j.a(((e.a.c) aVar4).b, null), null, null, null, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);
        }
        if (aVar4 instanceof e.a.b) {
            return j.a(jVar2, null, null, new j.a(null, new j.b.a(((e.a.b) aVar4).b)), null, null, null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
        }
        if (!(aVar4 instanceof e.a.C1825a)) {
            throw new NoWhenBranchMatchedException();
        }
        e.a.C1825a c1825a = (e.a.C1825a) aVar4;
        Set<UserId> set3 = c1825a.c;
        j.b bVar3 = aVar.b;
        aVar.getClass();
        return j.a(jVar2, null, null, new j.a(set3, bVar3), null, izi0.k(jVar2.g, c1825a.b), null, 87);
    }

    @Override // xsna.dm50
    public final StoryStatisticsViewersViewState d() {
        return new StoryStatisticsViewersViewState(e(new ut30(this, 24)));
    }

    @Override // xsna.dm50
    public final void h(j jVar, StoryStatisticsViewersViewState storyStatisticsViewersViewState) {
        f(storyStatisticsViewersViewState.a, jVar);
    }
}
