package com.vk.stories.design.view.stats.tabs.stickers.mvi;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.c;
import com.vk.stories.design.view.stats.tabs.recycler.TabRecyclerPaginatedView;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.StoryStatisticsStickersViewState;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.cn70;
import xsna.dhk0;
import xsna.dhm0;
import xsna.dhr0;
import xsna.f5z;
import xsna.fbl0;
import xsna.fhm0;
import xsna.ftn0;
import xsna.ghm0;
import xsna.gm50;
import xsna.hsc0;
import xsna.j5j;
import xsna.jfm0;
import xsna.l7s;
import xsna.lpj;
import xsna.p1u0;
import xsna.qbl0;
import xsna.sj1;
import xsna.uxm;
import xsna.wem0;
import xsna.wmc;
import xsna.wrl0;

/* compiled from: StoryStatisticsStickersMviView.kt */
/* loaded from: classes6.dex */
public final class c implements gm50 {
    public final f5z b;
    public final wmc c;
    public final Context d;
    public final TabRecyclerPaginatedView e;
    public final VkButton f;
    public final dhm0 g;
    public final ghm0 h;
    public final com.vk.lists.c i;

    /* compiled from: StoryStatisticsStickersMviView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoryStatisticsStickersViewState.FullPageState.values().length];
            try {
                iArr[StoryStatisticsStickersViewState.FullPageState.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoryStatisticsStickersViewState.FullPageState.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoryStatisticsStickersViewState.FullPageState.EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StoryStatisticsStickersViewState.FullPageState.LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public c(View view, f5z f5zVar, StoryEntry storyEntry, b bVar, jfm0 jfm0Var, wmc wmcVar) {
        this.b = f5zVar;
        this.c = wmcVar;
        Context context = view.getContext();
        lpj lpjVar = context instanceof lpj ? (lpj) context : null;
        Integer valueOf = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
        dhr0.a.getClass();
        context = (valueOf == null || valueOf.intValue() != dhr0.u().c) ? new l7s(context, dhr0.u().c) : context;
        this.d = context;
        TabRecyclerPaginatedView tabRecyclerPaginatedView = (TabRecyclerPaginatedView) view.findViewById(R.id.stickers_recycler);
        this.e = tabRecyclerPaginatedView;
        d dVar = new d(this);
        wrl0 wrl0Var = new wrl0(this, 4);
        e eVar = new e(this);
        dhm0 dhm0Var = new dhm0(new uxm());
        fbl0 fbl0Var = new fbl0(context, dVar);
        SparseArray<p1u0<?>> sparseArray = dhm0Var.e;
        sparseArray.put(1, fbl0Var);
        sparseArray.put(2, new wem0(wrl0Var));
        sparseArray.put(3, new qbl0(eVar));
        this.g = dhm0Var;
        dhk0 dhk0Var = new dhk0(cn70.b(16), cn70.b(0), cn70.b(16), cn70.b(8));
        dhk0Var.g = new fhm0(this);
        AbstractPaginatedView.LayoutType layoutType = AbstractPaginatedView.LayoutType.LINEAR;
        tabRecyclerPaginatedView.getClass();
        new AbstractPaginatedView.d(layoutType, tabRecyclerPaginatedView).a();
        tabRecyclerPaginatedView.setAdapter(dhm0Var);
        tabRecyclerPaginatedView.setItemDecoration(dhk0Var);
        tabRecyclerPaginatedView.getRecyclerView().setItemAnimator(new ftn0());
        tabRecyclerPaginatedView.setErrorTextRes(R.string.story_statistics_error_text_stickers);
        tabRecyclerPaginatedView.setEmptyTextRes(R.string.story_statistics_empty_text_stickers);
        ghm0 ghm0Var = new ghm0(storyEntry, jfm0Var, bVar.e, wmcVar);
        this.h = ghm0Var;
        c.h hVar = new c.h(ghm0Var);
        hVar.h = j5j.d;
        this.i = com.vk.lists.f.a(hVar, tabRecyclerPaginatedView);
        VkButton vkButton = new VkButton(context, null, 6, 0);
        vkButton.setAppearance(VkButton.Appearance.Accent);
        vkButton.setMode(VkButton.Mode.Primary);
        vkButton.setSize(VkButton.Size.Large);
        vkButton.setText(R.string.story_statistics_stickers_question_publish_button);
        bwt0.i0(vkButton, new hsc0(this, 14));
        this.f = vkButton;
    }

    public static void a(int i, View view) {
        if (view == null || view.getHeight() == i) {
            return;
        }
        bwt0.c0(i, view);
        view.post(new sj1(view, 14));
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.b;
    }
}
