package com.vk.stories.design.view.stats.tabs.stickers.mvi;

import com.vk.dto.polls.Poll;
import com.vk.dto.polls.PollOption;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryQuestionEntry;
import com.vk.dto.stories.model.actions.ActionPoll;
import com.vk.dto.stories.model.clickable.ClickablePoll;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryViewItem;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.a;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.f;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.j;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.k;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptySet;
import xsna.anm0;
import xsna.epx;
import xsna.f4z;
import xsna.hg1;
import xsna.j3z;
import xsna.j5g;
import xsna.j6l0;
import xsna.jfm0;
import xsna.ljs;
import xsna.lkz;
import xsna.tlo0;
import xsna.wk50;
import xsna.xd40;
import xsna.xvl0;
import xsna.y0r0;
import xsna.ysg0;

/* compiled from: StoryStatisticsStickersFeature.kt */
/* loaded from: classes6.dex */
public final class b extends wk50<StoryStatisticsStickersViewState, k, a, f> {
    public final jfm0 f;
    public final anm0 g;
    public final MobileOfficialAppsConStoriesStat$ViewEntryPoint h;
    public io.reactivex.rxjava3.disposables.c i;
    public final f4z j;

    public b(StoryEntry storyEntry, jfm0 jfm0Var, anm0 anm0Var, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, ysg0<y0r0> ysg0Var) {
        super(null, new i(new k(storyEntry, new k.b(null, null), new k.c(null, null, null), false, EmptySet.b)));
        this.f = jfm0Var;
        this.g = anm0Var;
        this.h = mobileOfficialAppsConStoriesStat$ViewEntryPoint;
        this.i = EmptyDisposable.INSTANCE;
        this.j = new f4z();
        this.e.b(hg1.c(ysg0Var.a, y0r0.a.class, y0r0.b.class).subscribe(new lkz(new xd40(this, 25), 22)));
    }

    @Override // xsna.wk50
    public final void N(k kVar, a aVar) {
        ClickableSticker clickableSticker;
        ActionPoll actionPoll;
        List<ClickableSticker> list;
        Object obj;
        k kVar2 = kVar;
        a aVar2 = aVar;
        Set<StoryQuestionEntry> set = kVar2.f;
        boolean z = kVar2.e;
        StoryEntry storyEntry = kVar2.b;
        if (aVar2 instanceof a.e) {
            StoryEntry storyEntry2 = ((a.e) aVar2).b;
            if (epx.f(storyEntry, storyEntry2)) {
                return;
            }
            T(new f.c(storyEntry2));
            return;
        }
        if (aVar2 instanceof a.d) {
            this.i.dispose();
            ClickableStickers clickableStickers = storyEntry.X;
            Poll poll = null;
            if (clickableStickers == null || (list = clickableStickers.d) == null) {
                clickableSticker = null;
            } else {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((ClickableSticker) obj) instanceof ClickablePoll) {
                            break;
                        }
                    }
                }
                clickableSticker = (ClickableSticker) obj;
            }
            ClickablePoll clickablePoll = clickableSticker instanceof ClickablePoll ? (ClickablePoll) clickableSticker : null;
            if (clickablePoll != null && (actionPoll = clickablePoll.e) != null) {
                poll = actionPoll.b;
            }
            T(new f.a.b(poll));
            if (poll != null) {
                io.reactivex.rxjava3.disposables.c subscribe = this.f.h(poll.b, poll.c, poll.j).subscribe(new ljs(new j6l0(this, 6), 28), new j3z(new xvl0(this, 2), 20));
                this.i = subscribe;
                this.e.b(subscribe);
                return;
            }
            return;
        }
        boolean z2 = aVar2 instanceof a.C1811a;
        f4z f4zVar = this.j;
        if (z2) {
            if (!z) {
                f4zVar.b(j.c.a);
                return;
            } else {
                T(new f.b.g(false));
                f4zVar.b(new j.a(false));
                return;
            }
        }
        if (aVar2 instanceof a.c.j) {
            T(new f.b.C1817f(((a.c.j) aVar2).b));
            return;
        }
        if (aVar2 instanceof a.c.i) {
            a.c.i iVar = (a.c.i) aVar2;
            T(new f.b.e(iVar.b, iVar.c));
            return;
        }
        if (aVar2 instanceof a.c.h) {
            a.c.h hVar = (a.c.h) aVar2;
            T(new f.b.d(hVar.b, hVar.c));
            return;
        }
        if (aVar2 instanceof a.c.C1814c) {
            boolean z3 = !z;
            T(new f.b.g(z3));
            f4zVar.b(new j.a(z3));
            return;
        }
        if (aVar2 instanceof a.c.g) {
            f4zVar.b(new j.e(((a.c.g) aVar2).b, storyEntry));
            return;
        }
        if (aVar2 instanceof a.c.k) {
            f4zVar.b(new j.f(Collections.singletonList(((a.c.k) aVar2).b), storyEntry));
            return;
        }
        if (aVar2 instanceof a.c.d) {
            StoryQuestionEntry storyQuestionEntry = ((a.c.d) aVar2).b;
            if (z) {
                int size = set.size();
                boolean contains = set.contains(storyQuestionEntry);
                boolean z4 = !contains;
                if (contains || size != 9) {
                    T(new f.b.C1816b(storyQuestionEntry, z4));
                    return;
                } else {
                    tlo0.Companion.getClass();
                    f4zVar.b(new j.g(tlo0.a.a(R.plurals.story_question_max_selection, 9, 9)));
                    return;
                }
            }
            return;
        }
        if (aVar2 instanceof a.c.e) {
            StoryQuestionEntry storyQuestionEntry2 = ((a.c.e) aVar2).b;
            if (z) {
                return;
            }
            T(new f.b.c(storyQuestionEntry2));
            f4zVar.b(new j.a(true));
            return;
        }
        if (aVar2 instanceof a.c.f) {
            f4zVar.b(new j.f(j5g.O0(set), storyEntry));
            return;
        }
        if (aVar2 instanceof a.c.b) {
            if (z) {
                T(new f.b.g(false));
                f4zVar.b(new j.a(false));
                return;
            }
            return;
        }
        if (aVar2 instanceof a.c.C1813a) {
            T(new f.b.a(((a.c.C1813a) aVar2).b));
            return;
        }
        if (aVar2 instanceof a.c.l) {
            a.c.l lVar = (a.c.l) aVar2;
            T(new f.b.h(lVar.c, true, Integer.valueOf(lVar.b)));
            return;
        }
        if (aVar2 instanceof a.c.m) {
            a.c.m mVar = (a.c.m) aVar2;
            T(new f.b.h(mVar.c, false, Integer.valueOf(mVar.b)));
        } else {
            if (!(aVar2 instanceof a.b.C1812a)) {
                throw new NoWhenBranchMatchedException();
            }
            PollOption pollOption = ((a.b.C1812a) aVar2).b;
            Poll poll2 = kVar2.c.a;
            if (poll2 == null || pollOption.d <= 0 || poll2.i) {
                return;
            }
            anm0.d(this.g, MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_SHOW_RESULTS, MobileOfficialAppsCoreNavStat$EventScreen.STORY_FEEDBACK, this.h, storyEntry, null, 48);
            f4zVar.b(new j.d(poll2, pollOption));
        }
    }
}
