package com.vk.friends.impl.birthdays.presentation;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.vk.bridges.di.BridgeComponent;
import com.vk.bridges.di.ImBridgeComponent;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.fragments.FragmentImpl;
import com.vk.movika.sdk.base.logic.interactor.p;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import xsna.ams;
import xsna.ao50;
import xsna.ay0;
import xsna.dhr0;
import xsna.dv3;
import xsna.eb7;
import xsna.fm0;
import xsna.fpf0;
import xsna.gm50;
import xsna.ia7;
import xsna.kb7;
import xsna.km50;
import xsna.lpj;
import xsna.m7m;
import xsna.ma7;
import xsna.mk50;
import xsna.na7;
import xsna.np1;
import xsna.ots;
import xsna.oz50;
import xsna.pa7;
import xsna.vk50;
import xsna.y1z;
import xsna.za7;
import xsna.zx0;

/* compiled from: BirthdaysListFragment.kt */
/* loaded from: classes15.dex */
public final class BirthdaysListFragment extends MviImplFragment<ma7, kb7, ia7> {
    public static final /* synthetic */ int T = 0;
    public final b Q;
    public eb7 R;
    public final np1 S;

    /* compiled from: BirthdaysListFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(BirthdaysListFragment.class, null, null);
        }
    }

    /* compiled from: BirthdaysListFragment.kt */
    public static final class b extends FragmentImpl.b {
        @Override // com.vk.core.fragments.FragmentImpl.a
        public final void a(lpj lpjVar) {
            int i = BirthdaysListFragment.T;
            dhr0.a.getClass();
            dhr0.l(lpjVar);
        }
    }

    public BirthdaysListFragment() {
        int i = y1z.a;
        LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
        this.Q = new b();
        this.S = new np1(this, 3);
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        eb7 eb7Var = new eb7(this, requireContext(), this, this.S);
        this.R = eb7Var;
        return new mk50.c(eb7Var.f);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        kb7 kb7Var = (kb7) ao50Var;
        eb7 eb7Var = this.R;
        if (eb7Var == null) {
            eb7Var = null;
        }
        eb7Var.getClass();
        gm50.a.b(eb7Var, kb7Var.c, new p(eb7Var, 7));
        gm50.a.b(eb7Var, kb7Var.a, new zx0(eb7Var, 10));
        gm50.a.b(eb7Var, kb7Var.b, new ay0(eb7Var, 8));
        gm50.a.b(eb7Var, kb7Var.d, new fm0(eb7Var, 6));
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final FragmentImpl.a Jn() {
        return this.Q;
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ma7 ma7Var = (ma7) vk50Var;
        ma7Var.h.a(new na7(0, ma7Var, this), this);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        eb7 eb7Var = this.R;
        if (eb7Var == null) {
            eb7Var = null;
        }
        eb7Var.m.b();
        eb7Var.a();
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        BridgeComponent bridgeComponent = (BridgeComponent) m7m.d(this).a(fpf0.a(BridgeComponent.class));
        return new ma7(new za7(), new dv3(new ots()), new pa7(bridgeComponent.id().b(null), ((ImBridgeComponent) m7m.d(this).a(fpf0.a(ImBridgeComponent.class))).g5(), bridgeComponent.F(), ams.a(), MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS_BIRTHDAYS.toString()));
    }
}
