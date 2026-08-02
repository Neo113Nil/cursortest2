package com.vk.stories.design.view.stats.tabs.viewers.mvi;

import android.content.Context;
import com.vk.dto.common.data.VKList;
import com.vk.dto.polls.Poll;
import com.vk.dto.stories.entities.StoryUserProfile;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.actions.ActionPoll;
import com.vk.dto.stories.model.clickable.ClickablePoll;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.StoryStatisticsViewersViewState;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.j;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.e43;
import xsna.izs;
import xsna.j03;

/* compiled from: StoryStatisticsViewersReducer.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class f extends FunctionReferenceImpl implements izs<j, StoryStatisticsViewersViewState.g> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.vk.stories.design.view.stats.tabs.viewers.mvi.StoryStatisticsViewersViewState$b] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // xsna.izs
    public final StoryStatisticsViewersViewState.g invoke(j jVar) {
        ClickableSticker clickableSticker;
        List<StoriesContainer> list;
        ActionPoll actionPoll;
        List<ClickableSticker> list2;
        Object obj;
        j jVar2 = jVar;
        ((h) this.receiver).getClass();
        j.d dVar = jVar2.d;
        j.c cVar = jVar2.f;
        j.a aVar = jVar2.e;
        boolean z = true;
        ?? r3 = (dVar.c instanceof j.b.a) || (aVar.b instanceof j.b.a) || (cVar.b instanceof j.b.a);
        ClickableStickers clickableStickers = jVar2.b.X;
        StoryStatisticsViewersViewState.b.C1819b c1819b = null;
        c1819b = null;
        if (clickableStickers == null || (list2 = clickableStickers.d) == null) {
            clickableSticker = null;
        } else {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((ClickableSticker) obj) instanceof ClickablePoll) {
                    break;
                }
            }
            clickableSticker = (ClickableSticker) obj;
        }
        ClickablePoll clickablePoll = clickableSticker instanceof ClickablePoll ? (ClickablePoll) clickableSticker : null;
        Poll poll = (clickablePoll == null || (actionPoll = clickablePoll.e) == null) ? null : actionPoll.b;
        VKList<StoryUserProfile> vKList = dVar.a;
        List<StoriesContainer> list3 = cVar.a;
        j.b bVar = dVar.c;
        ?? r1 = ((bVar instanceof j.b.C1829b) && ((j.b.C1829b) bVar).a) || (aVar.b instanceof j.b.C1829b) || (cVar.b instanceof j.b.C1829b);
        ?? r12 = poll != null && poll.i && bVar == null && vKList != null && vKList.i() < 10;
        if (r1 != false || (((list = list3) != null && !list.isEmpty()) || (vKList != null && !vKList.isEmpty()))) {
            z = false;
        }
        StoryStatisticsViewersViewState.FullPageState fullPageState = r3 != false ? StoryStatisticsViewersViewState.FullPageState.ERROR : r1 != false ? StoryStatisticsViewersViewState.FullPageState.LOADING : r12 != false ? StoryStatisticsViewersViewState.FullPageState.ANONYMOUS_STUB : z ? StoryStatisticsViewersViewState.FullPageState.EMPTY : StoryStatisticsViewersViewState.FullPageState.LIST;
        j.b bVar2 = dVar.d;
        if (fullPageState == StoryStatisticsViewersViewState.FullPageState.LIST) {
            if (bVar2 instanceof j.b.C1829b) {
                c1819b = StoryStatisticsViewersViewState.b.C1819b.a;
            } else if (bVar2 instanceof j.b.a) {
                Context context = e43.a;
                j03.g(context != null ? context : null, ((j.b.a) bVar2).a, R.string.error);
                c1819b = new StoryStatisticsViewersViewState.b.a();
            }
        }
        return new StoryStatisticsViewersViewState.g(fullPageState, c1819b);
    }
}
