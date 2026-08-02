package com.vk.stories.design.view.stats.tabs.viewers.mvi;

import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.StoryUserProfile;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntryExtended;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.StoryStatisticsViewersViewState;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.j;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.izs;
import xsna.p4g;
import xsna.ptl0;

/* compiled from: StoryStatisticsViewersReducer.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class g extends FunctionReferenceImpl implements izs<j, StoryStatisticsViewersViewState.c> {
    @Override // xsna.izs
    public final StoryStatisticsViewersViewState.c invoke(j jVar) {
        j jVar2 = jVar;
        h hVar = (h) this.receiver;
        hVar.getClass();
        j.c cVar = jVar2.f;
        j.d dVar = jVar2.d;
        List<StoriesContainer> list = cVar.a;
        StoryStatisticsViewersViewState.d dVar2 = new StoryStatisticsViewersViewState.d((list == null || list.isEmpty()) ? null : hVar.d.a(p4g.q(list), new StoryEntryExtended(jVar2.b, jVar2.c), false, false));
        VKList<StoryUserProfile> vKList = dVar.a;
        Set<UserId> set = jVar2.e.a;
        VKList p = (vKList == null || set == null) ? null : VKList.p(vKList, new ptl0(set, 4));
        return new StoryStatisticsViewersViewState.c(dVar2, new StoryStatisticsViewersViewState.f(p != null ? new StoryStatisticsViewersViewState.e(p != null ? p.i() : 0, dVar.b) : null, p));
    }
}
