package com.vk.stories.design.view.stats.tabs.stickers.mvi;

import com.vk.dto.common.data.VKList;
import com.vk.dto.polls.Poll;
import com.vk.dto.stories.model.StoryQuestionEntry;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.f;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptySet;
import xsna.dm50;
import xsna.lzl0;
import xsna.n7b0;
import xsna.p4g;

/* compiled from: StoryStatisticsStickersReducer.kt */
/* loaded from: classes6.dex */
public final class i extends dm50<StoryStatisticsStickersViewState, f, k> {
    @Override // xsna.dm50
    public final k c(k kVar, f fVar) {
        StoryQuestionEntry storyQuestionEntry;
        StoryQuestionEntry storyQuestionEntry2;
        VKList<StoryQuestionEntry> vKList;
        k kVar2 = kVar;
        f fVar2 = fVar;
        k.b bVar = kVar2.c;
        Set<StoryQuestionEntry> set = kVar2.f;
        k.c cVar = kVar2.d;
        if (fVar2 instanceof f.c) {
            return k.a(kVar2, ((f.c) fVar2).b, null, null, false, null, 30);
        }
        if (fVar2 instanceof f.b.C1817f) {
            f.b.C1817f c1817f = (f.b.C1817f) fVar2;
            if (cVar.a == null) {
                return k.a(kVar2, null, null, k.c.a(cVar, null, k.a.b.a, null, 1), false, null, 27);
            }
            if (!c1817f.b) {
                return k.a(kVar2, null, null, k.c.a(cVar, null, null, k.a.b.a, 1), false, null, 27);
            }
        } else {
            if (fVar2 instanceof f.b.e) {
                f.b.e eVar = (f.b.e) fVar2;
                boolean z = eVar.c;
                VKList<StoryQuestionEntry> vKList2 = eVar.b;
                if (!z) {
                    VKList<StoryQuestionEntry> vKList3 = cVar.a;
                    if (vKList3 == null) {
                        vKList3 = new VKList<>();
                    }
                    vKList3.addAll(vKList2);
                    vKList3.o(vKList2.i());
                    vKList3.n(vKList2.j());
                    vKList2 = vKList3;
                }
                return k.a(kVar2, null, null, new k.c(vKList2, null, null), false, null, 27);
            }
            if (fVar2 instanceof f.b.d) {
                f.b.d dVar = (f.b.d) fVar2;
                k.a.C1818a c1818a = new k.a.C1818a(dVar.c);
                return k.a(kVar2, null, null, (dVar.b || (vKList = cVar.a) == null || vKList.isEmpty()) ? k.c.a(cVar, null, c1818a, null, 4) : k.c.a(cVar, null, null, c1818a, 3), false, null, 27);
            }
            if (fVar2 instanceof f.b.g) {
                return k.a(kVar2, null, null, null, ((f.b.g) fVar2).b, EmptySet.b, 7);
            }
            if (fVar2 instanceof f.b.C1816b) {
                f.b.C1816b c1816b = (f.b.C1816b) fVar2;
                boolean z2 = c1816b.c;
                StoryQuestionEntry storyQuestionEntry3 = c1816b.b;
                return k.a(kVar2, null, null, null, false, z2 ? p4g.e(set, storyQuestionEntry3) : p4g.f(set, storyQuestionEntry3), 15);
            }
            if (fVar2 instanceof f.b.c) {
                return k.a(kVar2, null, null, null, true, Collections.singleton(((f.b.c) fVar2).b), 7);
            }
            if (fVar2 instanceof f.b.a) {
                int i = ((f.b.a) fVar2).b;
                VKList<StoryQuestionEntry> vKList4 = cVar.a;
                if (vKList4 != null) {
                    Iterator<StoryQuestionEntry> it = vKList4.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            storyQuestionEntry2 = null;
                            break;
                        }
                        storyQuestionEntry2 = it.next();
                        if (storyQuestionEntry2.b == i) {
                            break;
                        }
                    }
                    storyQuestionEntry = storyQuestionEntry2;
                } else {
                    storyQuestionEntry = null;
                }
                if (storyQuestionEntry != null) {
                    ArrayList arrayList = new ArrayList();
                    for (StoryQuestionEntry storyQuestionEntry4 : vKList4) {
                        if (storyQuestionEntry4.b != i) {
                            arrayList.add(storyQuestionEntry4);
                        }
                    }
                    VKList vKList5 = new VKList();
                    vKList5.addAll(arrayList);
                    vKList5.o(vKList4.i() - 1);
                    vKList5.n(vKList4.j());
                    return k.a(kVar2, null, null, k.c.a(cVar, vKList5, null, null, 6), false, null, 27);
                }
            } else {
                if (!(fVar2 instanceof f.b.h)) {
                    if (fVar2 instanceof f.a.b) {
                        Poll poll = ((f.a.b) fVar2).b;
                        bVar.getClass();
                        return k.a(kVar2, null, new k.b(poll, null), null, false, null, 29);
                    }
                    if (fVar2 instanceof f.a.C1815a) {
                        return k.a(kVar2, null, new k.b(bVar.a, new k.a.C1818a(((f.a.C1815a) fVar2).b)), null, false, null, 29);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                f.b.h hVar = (f.b.h) fVar2;
                VKList<StoryQuestionEntry> vKList6 = cVar.a;
                if (vKList6 != null) {
                    return k.a(kVar2, null, null, k.c.a(cVar, VKList.p(vKList6, new lzl0(hVar, 1)), null, null, 6), false, null, 27);
                }
            }
        }
        return kVar2;
    }

    @Override // xsna.dm50
    public final StoryStatisticsStickersViewState d() {
        return new StoryStatisticsStickersViewState(e(new n7b0(this, 10)));
    }

    @Override // xsna.dm50
    public final void h(k kVar, StoryStatisticsStickersViewState storyStatisticsStickersViewState) {
        f(storyStatisticsStickersViewState.a, kVar);
    }
}
