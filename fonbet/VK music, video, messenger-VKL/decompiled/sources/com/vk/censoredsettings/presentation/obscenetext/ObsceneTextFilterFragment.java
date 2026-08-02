package com.vk.censoredsettings.presentation.obscenetext;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.censoredsettings.di.CensoredSettingsInnerComponent;
import com.vk.censoredsettings.presentation.obscenetext.e;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vkontakte.android.R;
import xsna.ao50;
import xsna.bq00;
import xsna.eq70;
import xsna.ewy;
import xsna.fpf0;
import xsna.gm50;
import xsna.h3p0;
import xsna.hap;
import xsna.km50;
import xsna.m7m;
import xsna.mk50;
import xsna.oz50;
import xsna.q2j0;
import xsna.qcy;
import xsna.qpa;
import xsna.rpa;
import xsna.t210;
import xsna.tlo0;
import xsna.tq;
import xsna.vk50;

/* compiled from: ObsceneTextFilterFragment.kt */
/* loaded from: classes16.dex */
public final class ObsceneTextFilterFragment extends MviImplFragment<com.vk.censoredsettings.presentation.obscenetext.b, f, com.vk.censoredsettings.presentation.obscenetext.a> {
    public static final /* synthetic */ int R = 0;
    public final eq70 Q = new eq70(new eq70.a());

    /* compiled from: ObsceneTextFilterFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: ObsceneTextFilterFragment.kt */
    public final class b {
        public b() {
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.fragment_censored_settings);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        gm50.a.b(this, ((f) ao50Var).a, new bq00(this, 18));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        VkTopBar vkTopBar = (VkTopBar) view.findViewById(R.id.top_bar);
        tlo0.f h = tq.h(tlo0.Companion, R.string.censored_sett_filter);
        t210 t210Var = new t210(this, 13);
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(h, null, null, null, null, 30), objArr2, objArr, null, 14));
        vkTopBar.setBack(new VkTopBar.b(t210Var, new tlo0.f(R.string.back), null, null, null, 28));
        vkTopBar.setShowBottomDivider(true);
        h3p0.d(this, vkTopBar);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.list);
        recyclerView.setHasFixedSize(true);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.addItemDecoration(new q2j0());
        eq70 eq70Var = this.Q;
        recyclerView.setAdapter(eq70Var);
        eq70Var.c = new b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        ewy ewyVar = ((CensoredSettingsInnerComponent) m7m.d(this).mo408a(fpf0.a(CensoredSettingsInnerComponent.class))).b;
        qcy<Object>[] qcyVarArr = CensoredSettingsInnerComponent.c;
        qcy<Object> qcyVar = qcyVarArr[1];
        qpa qpaVar = (qpa) ewyVar.c();
        ewy ewyVar2 = ((CensoredSettingsInnerComponent) m7m.d(this).mo408a(fpf0.a(CensoredSettingsInnerComponent.class))).a;
        qcy<Object> qcyVar2 = qcyVarArr[0];
        return new com.vk.censoredsettings.presentation.obscenetext.b(new hap(qpaVar, (rpa) ewyVar2.c(), ((NewsFeedComponent) m7m.d(this).a(fpf0.a(NewsFeedComponent.class))).w()), new d(e.b.b));
    }
}
