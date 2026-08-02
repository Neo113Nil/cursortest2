package com.vk.feed.blacklist.impl.presentation.blacklist;

import android.os.Bundle;
import android.view.View;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.DefaultEmptyView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.mvi.androidx.MviImplFragment;
import com.vkontakte.android.R;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyThreadSafetyMode;
import xsna.ae7;
import xsna.ao50;
import xsna.de7;
import xsna.e40;
import xsna.ee7;
import xsna.gko;
import xsna.gm50;
import xsna.h3p0;
import xsna.k9;
import xsna.ke7;
import xsna.km50;
import xsna.lz0;
import xsna.mk50;
import xsna.msy;
import xsna.ng1;
import xsna.oz50;
import xsna.s5;
import xsna.sd4;
import xsna.t5;
import xsna.tlo0;
import xsna.tq;
import xsna.v34;
import xsna.vk50;
import xsna.yn;

/* compiled from: BlacklistFragment.kt */
/* loaded from: classes18.dex */
public final class BlacklistFragment extends MviImplFragment<b, g, com.vk.feed.blacklist.impl.presentation.blacklist.a> {
    public static final /* synthetic */ int V = 0;
    public final Object Q;
    public final Object R;
    public final Object S;
    public RecyclerPaginatedView T;
    public final AtomicBoolean U;

    /* compiled from: BlacklistFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(BlacklistFragment.class, null, null);
        }
    }

    public BlacklistFragment() {
        s5 s5Var = new s5(this, 9);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.Q = msy.a(lazyThreadSafetyMode, s5Var);
        this.R = msy.a(lazyThreadSafetyMode, new t5(this, 11));
        this.S = msy.a(lazyThreadSafetyMode, new com.vk.newsfeed.posting.mediapicker.photovk.base.a(this, 8));
        this.U = new AtomicBoolean();
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.fragment_blacklist);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        gm50.a.b(this, ((g) ao50Var).a, new k9(this, 13));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((b) vk50Var).g.a(new lz0(this, 9), this);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        VkTopBar vkTopBar = (VkTopBar) view.findViewById(R.id.toolbar);
        vkTopBar.setBefore(h3p0.a(this) ? new VkTopBar.c.f(new gko(R.drawable.vk_icon_arrow_left_outline_28), tq.h(tlo0.Companion, R.string.back), new ng1(this, 7), null, null, 56) : null);
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, R.string.blacklist_title), null, null, null, com.vk.core.compose.component.semantics.b.a(null, new sd4(2), 3), 14), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14));
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) view.findViewById(R.id.vk_rpb_list);
        this.T = recyclerPaginatedView;
        recyclerPaginatedView.getRecyclerView().setClipToPadding(false);
        View emptyView = recyclerPaginatedView.getEmptyView();
        DefaultEmptyView defaultEmptyView = emptyView instanceof DefaultEmptyView ? (DefaultEmptyView) emptyView : null;
        if (defaultEmptyView != null) {
            defaultEmptyView.setDefaultText(R.string.blacklist_empty);
            defaultEmptyView.setDefaultImage(0);
            defaultEmptyView.a();
        }
        recyclerPaginatedView.o = true;
        new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, recyclerPaginatedView).a();
        recyclerPaginatedView.setAdapter((ae7) this.S.getValue());
        recyclerPaginatedView.setUiStateCallbacks(new de7(this));
        c.h hVar = new c.h(new yn((ee7) this.Q.getValue(), new v34(this, 2), new e40(this, 3), getFeature().e));
        hVar.c = 10;
        com.vk.lists.f.a(hVar, recyclerPaginatedView);
        RecyclerPaginatedView recyclerPaginatedView2 = this.T;
        (recyclerPaginatedView2 != null ? recyclerPaginatedView2 : null).getRecyclerView().getPaddingBottom();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new b((ee7) this.Q.getValue(), new e(ke7.h));
    }
}
