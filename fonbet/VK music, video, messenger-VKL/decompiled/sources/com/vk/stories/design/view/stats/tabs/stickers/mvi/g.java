package com.vk.stories.design.view.stats.tabs.stickers.mvi;

import android.content.Context;
import com.vk.dto.common.data.VKList;
import com.vk.dto.stories.model.StoryQuestionEntry;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.StoryStatisticsStickersViewState;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.k;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.e43;
import xsna.izs;
import xsna.j03;

/* compiled from: StoryStatisticsStickersReducer.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class g extends FunctionReferenceImpl implements izs<k, StoryStatisticsStickersViewState.f> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.vk.stories.design.view.stats.tabs.stickers.mvi.StoryStatisticsStickersViewState$b] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    @Override // xsna.izs
    public final StoryStatisticsStickersViewState.f invoke(k kVar) {
        VKList<StoryQuestionEntry> vKList;
        k kVar2 = kVar;
        ((i) this.receiver).getClass();
        k.c cVar = kVar2.d;
        k.b bVar = kVar2.c;
        k.a aVar = cVar.b;
        ?? r2 = (aVar instanceof k.a.C1818a) || (bVar.b instanceof k.a.C1818a);
        ?? r1 = (aVar instanceof k.a.b) || (bVar.b instanceof k.a.b);
        StoryStatisticsStickersViewState.FullPageState fullPageState = r2 != false ? StoryStatisticsStickersViewState.FullPageState.ERROR : r1 != false ? StoryStatisticsStickersViewState.FullPageState.LOADING : !r1 == true && (((vKList = cVar.a) == null || vKList.isEmpty()) && bVar.a == null) ? StoryStatisticsStickersViewState.FullPageState.EMPTY : StoryStatisticsStickersViewState.FullPageState.LIST;
        k.a aVar2 = cVar.c;
        StoryStatisticsStickersViewState.b.C1810b c1810b = null;
        c1810b = null;
        if (fullPageState == StoryStatisticsStickersViewState.FullPageState.LIST) {
            if (aVar2 instanceof k.a.b) {
                c1810b = StoryStatisticsStickersViewState.b.C1810b.a;
            } else if (aVar2 instanceof k.a.C1818a) {
                Context context = e43.a;
                j03.g(context != null ? context : null, ((k.a.C1818a) aVar2).a, R.string.error);
                c1810b = new StoryStatisticsStickersViewState.b.a();
            }
        }
        return new StoryStatisticsStickersViewState.f(fullPageState, c1810b);
    }
}
