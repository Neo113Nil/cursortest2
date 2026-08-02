package com.vk.stories.design.view.stats.tabs.viewers.mvi;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.c;
import com.vk.stories.design.view.stats.tabs.recycler.TabRecyclerPaginatedView;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.StoryStatisticsViewersViewState;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.cim0;
import xsna.dhr0;
import xsna.eim0;
import xsna.erl0;
import xsna.f5z;
import xsna.fkq0;
import xsna.ftn0;
import xsna.gm50;
import xsna.j5j;
import xsna.jfm0;
import xsna.kf8;
import xsna.kl2;
import xsna.l7s;
import xsna.lpj;
import xsna.p00;
import xsna.tql0;
import xsna.uhm0;
import xsna.yyl0;

/* compiled from: StoryStatisticsViewersMviView.kt */
/* loaded from: classes6.dex */
public final class d implements gm50 {
    public final f5z b;
    public final yyl0 c;
    public final Context d;
    public final TabRecyclerPaginatedView e;
    public final View f;
    public final uhm0 g;
    public final eim0 h;
    public final com.vk.lists.c i;

    /* compiled from: StoryStatisticsViewersMviView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoryStatisticsViewersViewState.FullPageState.values().length];
            try {
                iArr[StoryStatisticsViewersViewState.FullPageState.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoryStatisticsViewersViewState.FullPageState.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoryStatisticsViewersViewState.FullPageState.ANONYMOUS_STUB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StoryStatisticsViewersViewState.FullPageState.EMPTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StoryStatisticsViewersViewState.FullPageState.LIST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public d(View view, f5z f5zVar, StoryEntry storyEntry, b bVar, jfm0 jfm0Var, erl0 erl0Var, tql0 tql0Var, kf8 kf8Var, yyl0 yyl0Var) {
        this.b = f5zVar;
        this.c = yyl0Var;
        Context context = view.getContext();
        lpj lpjVar = context instanceof lpj ? (lpj) context : null;
        Integer valueOf = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
        dhr0.a.getClass();
        Context l7sVar = (valueOf != null && valueOf.intValue() == dhr0.u().c) ? context : new l7s(context, dhr0.u().c);
        this.d = l7sVar;
        TabRecyclerPaginatedView tabRecyclerPaginatedView = (TabRecyclerPaginatedView) view.findViewById(R.id.viewers_recycler);
        this.e = tabRecyclerPaginatedView;
        this.f = view.findViewById(R.id.viewers_anonymous_stub);
        TextView textView = (TextView) view.findViewById(R.id.viewers_stub_text);
        uhm0 uhm0Var = new uhm0(l7sVar, erl0Var, tql0Var, new cim0(this, 0), new p00(this, 11), fkq0.d(storyEntry.d) && (!storyEntry.Mb() || storyEntry.F));
        this.g = uhm0Var;
        textView.setText(l7sVar.getString(R.string.story_poll_viewers_count, 10));
        tabRecyclerPaginatedView.getRecyclerView().setClipChildren(false);
        new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, tabRecyclerPaginatedView).a();
        tabRecyclerPaginatedView.setAdapter(uhm0Var);
        tabRecyclerPaginatedView.getRecyclerView().setItemAnimator(new ftn0());
        tabRecyclerPaginatedView.setErrorTextRes(R.string.story_statistics_error_text_viewers);
        eim0 eim0Var = new eim0(storyEntry, jfm0Var, bVar.e, kf8Var);
        this.h = eim0Var;
        c.h hVar = new c.h(eim0Var);
        hVar.h = j5j.d;
        this.i = com.vk.lists.f.a(hVar, tabRecyclerPaginatedView);
    }

    public static void a(int i, View view) {
        if (view == null || view.getHeight() == i) {
            return;
        }
        bwt0.c0(i, view);
        view.post(new kl2(view, 9));
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.b;
    }
}
