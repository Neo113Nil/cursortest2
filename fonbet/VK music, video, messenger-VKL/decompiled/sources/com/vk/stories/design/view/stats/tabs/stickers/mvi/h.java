package com.vk.stories.design.view.stats.tabs.stickers.mvi;

import com.vk.dto.common.data.VKList;
import com.vk.dto.polls.Poll;
import com.vk.dto.stories.model.StoryQuestionEntry;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.StoryStatisticsStickersViewState;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.alj0;
import xsna.izs;
import xsna.ual0;

/* compiled from: StoryStatisticsStickersReducer.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class h extends FunctionReferenceImpl implements izs<k, StoryStatisticsStickersViewState.c> {
    @Override // xsna.izs
    public final StoryStatisticsStickersViewState.c invoke(k kVar) {
        k kVar2 = kVar;
        ((i) this.receiver).getClass();
        Poll poll = kVar2.c.a;
        StoryStatisticsStickersViewState.d dVar = new StoryStatisticsStickersViewState.d(poll != null ? new ual0(poll) : null);
        VKList<StoryQuestionEntry> vKList = kVar2.d.a;
        return new StoryStatisticsStickersViewState.c(dVar, new StoryStatisticsStickersViewState.e(kVar2.f.size(), vKList != null ? VKList.p(vKList, new alj0(kVar2, 8)) : null, kVar2.e));
    }
}
