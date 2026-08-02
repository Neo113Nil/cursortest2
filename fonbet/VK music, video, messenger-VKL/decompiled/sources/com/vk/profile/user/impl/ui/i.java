package com.vk.profile.user.impl.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.profile.user.impl.ui.viewdelegates.SnowballsCoverHolder;
import com.vkontakte.android.R;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.ajh;
import xsna.bwt0;
import xsna.byq0;
import xsna.cpq0;
import xsna.did0;
import xsna.dqm0;
import xsna.e3m;
import xsna.e43;
import xsna.e6g;
import xsna.ewg;
import xsna.f5z;
import xsna.fnj;
import xsna.gjf0;
import xsna.gm50;
import xsna.hmp0;
import xsna.hpq0;
import xsna.iah0;
import xsna.if6;
import xsna.iml0;
import xsna.jf6;
import xsna.kcj0;
import xsna.khc0;
import xsna.kzd0;
import xsna.loq0;
import xsna.msy;
import xsna.nqq0;
import xsna.opq0;
import xsna.rn9;
import xsna.rrn0;
import xsna.s0w0;
import xsna.too0;
import xsna.w3r;
import xsna.wm80;
import xsna.y1z;
import xsna.yrn;
import xsna.ysg0;

/* compiled from: UserProfileWithTabsView.kt */
/* loaded from: classes5.dex */
public final class i implements gm50, too0 {
    public final Context b;
    public final hpq0 c;
    public final f5z d;
    public final View e;
    public final RecyclerView f;
    public final SwipeRefreshLayout g;
    public final a h;
    public final hmp0 i;
    public final ysg0<ajh> j;
    public final ProgressBar k;
    public final cpq0 l;
    public final Object m;
    public final com.vk.profile.user.impl.ui.adapter.b n;
    public final nqq0 o;

    public i(Context context, hpq0 hpq0Var, khc0 khc0Var, loq0 loq0Var, opq0 opq0Var, f5z f5zVar, UserProfileFragment.a aVar, boolean z) {
        this.b = context;
        this.c = hpq0Var;
        this.d = f5zVar;
        int i = y1z.a;
        LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
        View inflate = LayoutInflater.from(context).inflate(z ? R.layout.fragment_user_profile_with_tabs_modal : R.layout.fragment_user_profile_with_tabs, (ViewGroup) null);
        this.e = inflate;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(z ? R.id.profile_content_tabs_modal : R.id.profile_content_tabs);
        this.f = recyclerView;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(z ? R.id.user_profile_swipe_refresh_tabs_modal : R.id.user_profile_swipe_refresh_tabs);
        this.g = swipeRefreshLayout;
        a aVar2 = new a(inflate, z, aVar, recyclerView);
        this.h = aVar2;
        this.i = new hmp0(inflate, new iml0(this, 9));
        ysg0<ajh> ysg0Var = new ysg0<>();
        this.j = ysg0Var;
        this.k = (ProgressBar) inflate.findViewById(z ? R.id.progress_bar_tabs_modal : R.id.progress_bar_tabs);
        cpq0 cpq0Var = new cpq0((VkPlaceholder) inflate.findViewById(z ? R.id.profile_error_tabs_modal : R.id.profile_error_tabs));
        this.l = cpq0Var;
        Lazy a = msy.a(LazyThreadSafetyMode.NONE, new dqm0(3));
        this.m = a;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        com.vk.profile.user.impl.ui.adapter.b bVar = new com.vk.profile.user.impl.ui.adapter.b((com.vk.lists.a) a.getValue(), aVar2.h, hpq0Var, khc0Var, aVar2.e);
        this.n = bVar;
        this.o = new nqq0((com.vk.lists.a) a.getValue(), opq0Var, loq0Var, hpq0Var, khc0Var, ysg0Var.a, aVar2.e);
        aVar2.f = hpq0Var;
        aVar2.g = khc0Var;
        bwt0.h(inflate, new rrn0(this, 6));
        recyclerView.setAdapter(bVar);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(aVar2.k);
        recyclerView.addItemDecoration(new kzd0(iah0.b(20.0f), iah0.a(8), bVar, new e6g(4)));
        recyclerView.setItemAnimator(null);
        recyclerView.setClipToPadding(false);
        recyclerView.setOverScrollMode(2);
        kcj0 kcj0Var = new kcj0(this, 9);
        recyclerView.addItemDecoration(new if6.e(kcj0Var));
        Context context2 = e43.a;
        yrn yrnVar = new yrn(R.attr.vk_ui_separator_primary_alpha, e3m.a(R.dimen.divider_width, context2 != null ? context2 : null));
        int i2 = 1;
        yrnVar.n = true;
        yrnVar.m = new jf6(kcj0Var);
        float f = 16;
        yrnVar.l(iah0.a(f), 0, iah0.a(f), 0);
        recyclerView.addItemDecoration(yrnVar);
        gjf0.d(recyclerView, context, 0, 12);
        if (fnj.d(context)) {
            int a2 = gjf0.a(context, true);
            bwt0.f0(aVar2.e, a2, 0, a2, 0, 10);
            bwt0.f0(aVar2.a, a2, 0, a2, 0, 10);
            SnowballsCoverHolder snowballsCoverHolder = aVar2.c;
            bwt0.f0(snowballsCoverHolder.a, a2, 0, a2, 0, 10);
            bwt0.f0(aVar2.b, a2, 0, a2, 0, 10);
            aVar2.a.setOutlineProvider(new s0w0(e3m.a(R.dimen.profile_card_corner_radius, context), false, true));
            snowballsCoverHolder.a.setOutlineProvider(new s0w0(e3m.a(R.dimen.profile_card_corner_radius, context), false, true));
            bwt0.f0(aVar2.d, a2, 0, a2, 0, 10);
        }
        swipeRefreshLayout.setOnChildScrollUpCallback(new did0(this, 14));
        swipeRefreshLayout.setOnRefreshListener(new ewg(this, i2));
        recyclerView.setAccessibilityDelegateCompat(new w3r(recyclerView));
        recyclerView.setOnTouchListener(new rn9(this, 3));
        recyclerView.addOnScrollListener(new byq0(this));
        cpq0Var.c = new wm80(hpq0Var, 29);
    }

    @Override // xsna.too0
    public final void Ng() {
        this.h.k.Ng();
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.d;
    }
}
