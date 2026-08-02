package com.vk.stories.design.view.stats.tabs.info.mvi;

import android.os.Bundle;
import android.view.View;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.stories.design.view.stats.tabs.info.mvi.a;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.ahm0;
import xsna.ao50;
import xsna.bpn0;
import xsna.bwt0;
import xsna.dei0;
import xsna.gm50;
import xsna.ihm0;
import xsna.jfm0;
import xsna.km50;
import xsna.mk50;
import xsna.msy;
import xsna.o8;
import xsna.oz50;
import xsna.qjg0;
import xsna.sb;
import xsna.vk50;
import xsna.w8i;
import xsna.wzb0;
import xsna.xn50;

/* compiled from: StoryStatisticsInfoFragment.kt */
/* loaded from: classes6.dex */
public final class StoryStatisticsInfoFragment extends MviImplFragment<b, g, com.vk.stories.design.view.stats.tabs.info.mvi.a> implements ihm0, w8i {
    public static final /* synthetic */ int T = 0;
    public c R;
    public final Object Q = msy.a(LazyThreadSafetyMode.NONE, new wzb0(this, 15));
    public final bpn0 S = new bpn0(new dei0(this, 13));

    /* compiled from: StoryStatisticsInfoFragment.kt */
    public static final class a extends oz50 {
    }

    public static StoryEntry fo(StoryStatisticsInfoFragment storyStatisticsInfoFragment) {
        ahm0 ti = super.ti();
        StoryEntry Id = ti != null ? ti.Id() : null;
        if (Id != null) {
            return Id;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.fragment_story_statistics_tab_info);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        c cVar = new c(view, getViewLifecycleOwner(), new o8(1, this, StoryStatisticsInfoFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 12));
        gm50.a.b(cVar, ((g) ao50Var).a, new qjg0(cVar, 7));
        this.R = cVar;
        ahm0 ti = ti();
        if (ti != null) {
            ti.bc();
        }
    }

    @Override // xsna.ihm0
    public final void K8(StoryEntry storyEntry) {
        xn50.a.c(this, new a.b(storyEntry));
    }

    @Override // xsna.ihm0
    public final boolean f3() {
        return false;
    }

    @Override // xsna.ihm0
    public final void ha(int i) {
        c cVar = this.R;
        if (cVar != null) {
            View view = cVar.c;
            if (view.getHeight() != i) {
                bwt0.c0(i, view);
                view.post(new sb(view, 11));
            }
            View view2 = cVar.e;
            if (view2.getHeight() != i) {
                bwt0.c0(i, view2);
                view2.post(new sb(view2, 11));
            }
        }
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = false;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.R = null;
        super.onDestroyView();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new b((StoryEntry) this.S.getValue(), (jfm0) this.Q.getValue());
    }

    @Override // xsna.ihm0
    public final void jj() {
    }
}
