package com.vk.stories.design.view.stats.tabs;

import androidx.fragment.app.Fragment;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.stories.design.view.stats.tabs.StoryStatisticsTab;
import com.vk.stories.design.view.stats.tabs.info.mvi.StoryStatisticsInfoFragment;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.StoryStatisticsStickersFragment;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.StoryStatisticsViewersFragment;
import kotlin.NoWhenBranchMatchedException;
import xsna.dhr0;
import xsna.hem0;
import xsna.scs;

/* compiled from: StoryStatisticsTabAdapter.kt */
/* loaded from: classes6.dex */
public final class a extends scs {
    public final StoryOwner l;
    public boolean m;

    /* compiled from: StoryStatisticsTabAdapter.kt */
    /* renamed from: com.vk.stories.design.view.stats.tabs.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1807a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoryStatisticsTab.values().length];
            try {
                iArr[StoryStatisticsTab.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoryStatisticsTab.VIEWERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoryStatisticsTab.STICKERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(hem0 hem0Var, StoryEntry storyEntry, StoryOwner storyOwner) {
        super(hem0Var);
        this.l = storyOwner;
        ClickableStickers clickableStickers = storyEntry.X;
        boolean z = true;
        if ((clickableStickers == null || !((Boolean) clickableStickers.h.getValue()).booleanValue()) && storyEntry.Y <= 0) {
            z = false;
        }
        this.m = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        int size = StoryStatisticsTab.k().size();
        return this.m ? size : size - 1;
    }

    @Override // xsna.scs
    public final Fragment z0(int i) {
        StoryStatisticsTab.Companion.getClass();
        StoryStatisticsTab a = StoryStatisticsTab.a.a(i);
        if (a == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int i2 = C1807a.$EnumSwitchMapping$0[a.ordinal()];
        if (i2 == 1) {
            StoryStatisticsInfoFragment.a aVar = new StoryStatisticsInfoFragment.a(StoryStatisticsInfoFragment.class, null, null);
            dhr0.a.getClass();
            aVar.w(dhr0.u().c);
            return aVar.f();
        }
        if (i2 == 2) {
            StoryStatisticsViewersFragment.a aVar2 = new StoryStatisticsViewersFragment.a(StoryStatisticsViewersFragment.class, null, null);
            aVar2.j.putParcelable("STORY_OWNER", this.l);
            dhr0.a.getClass();
            aVar2.w(dhr0.u().c);
            return aVar2.f();
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        StoryStatisticsStickersFragment.a aVar3 = new StoryStatisticsStickersFragment.a(StoryStatisticsStickersFragment.class, null, null);
        dhr0.a.getClass();
        aVar3.w(dhr0.u().c);
        return aVar3.f();
    }
}
