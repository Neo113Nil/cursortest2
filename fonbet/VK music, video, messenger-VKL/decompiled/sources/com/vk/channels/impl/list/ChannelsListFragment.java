package com.vk.channels.impl.list;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.vk.channels.impl.list.g;
import com.vk.channels.impl.list.onboarding.di.ChannelsOnboardingDiComponent;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.fragments.internal.transition.impl.TransitionAnimationSimple$Companion$Type;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.im.mvicomponent.MultiComponentFragment;
import com.vk.im.reporters.api.di.ImReportersComponent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.asu0;
import xsna.bpn0;
import xsna.bzb0;
import xsna.cau0;
import xsna.dhr0;
import xsna.e43;
import xsna.f4m;
import xsna.fpf0;
import xsna.fz5;
import xsna.g2v;
import xsna.i7o0;
import xsna.jd;
import xsna.kgb;
import xsna.kju0;
import xsna.kwg0;
import xsna.l1;
import xsna.ld;
import xsna.lhb;
import xsna.lpj;
import xsna.m1;
import xsna.m7m;
import xsna.mo3;
import xsna.msy;
import xsna.nu2;
import xsna.nwy;
import xsna.oz50;
import xsna.qcy;
import xsna.shb;
import xsna.too0;
import xsna.uhb;
import xsna.y1z;
import xsna.yj50;
import xsna.yn50;
import xsna.zdw;
import xsna.zeb;

/* compiled from: ChannelsListFragment.kt */
/* loaded from: classes16.dex */
public final class ChannelsListFragment extends MultiComponentFragment implements too0 {
    public static final /* synthetic */ int f0 = 0;
    public final b U;
    public Toolbar V;
    public final Object W;
    public final Object X;
    public shb Y;
    public final boolean Z;
    public final Object a0;
    public com.vk.channels.impl.list.a b0;
    public int c0;
    public Integer d0;
    public final bpn0 e0;

    /* compiled from: ChannelsListFragment.kt */
    public static class a extends oz50 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(ChannelsListFragment.class, null, null);
            g2v.c().getClass();
            if (z) {
                u(TransitionAnimationSimple$Companion$Type.SLIDE_FROM_RIGHT.h());
            }
        }

        public final void y() {
            this.j.putBoolean("without_toolbar", true);
        }
    }

    /* compiled from: ChannelsListFragment.kt */
    public static final class b extends FragmentImpl.b {
        @Override // com.vk.core.fragments.FragmentImpl.a
        public final void a(lpj lpjVar) {
            int i = y1z.a;
            LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
            dhr0.a.getClass();
            dhr0.l(lpjVar);
        }
    }

    public ChannelsListFragment() {
        super(R.layout.im_channel_list_fragment);
        this.U = new b();
        zdw zdwVar = i7o0.b;
        zdwVar = zdwVar == null ? null : zdwVar;
        l1 l1Var = new l1(this, 16);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.W = msy.a(lazyThreadSafetyMode, l1Var);
        zdw zdwVar2 = i7o0.b;
        cau0 cau0Var = (zdwVar2 != null ? zdwVar2 : null).b.r().h;
        this.X = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.ui.g(this, 20));
        zdwVar.d().getClass();
        this.Z = false;
        this.a0 = msy.a(lazyThreadSafetyMode, new m1(this, 14));
        this.e0 = new bpn0(new jd(this, 19));
    }

    public static zeb lo() {
        zdw zdwVar = i7o0.b;
        if (zdwVar == null) {
            zdwVar = null;
        }
        zeb c = zdwVar.c();
        if (c != null) {
            return c;
        }
        throw new IllegalStateException("ChannelsFeatureDependencies is not provided in imUiModule");
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final FragmentImpl.a Jn() {
        return this.U;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        this.U.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.im.mvicomponent.MviComponentFragment
    public final Iterable<yj50<?, ?, ?, ?, ?, ?, ?>> fo() {
        uhb uhbVar;
        ListBuilder e = e43.e();
        zeb lo = lo();
        ?? r9 = this.X;
        boolean z = this.Z;
        if (z) {
            nwy nwyVar = ((ChannelsOnboardingDiComponent) r9.getValue()).b;
            qcy<Object> qcyVar = ChannelsOnboardingDiComponent.c[0];
            uhbVar = (uhb) nwyVar.c();
        } else {
            uhbVar = null;
        }
        com.vk.channels.impl.list.a aVar = new com.vk.channels.impl.list.a(this, this, lo, uhbVar, (bzb0) this.e0.getValue(), ((ImReportersComponent) m7m.d(this).a(fpf0.a(ImReportersComponent.class))).K());
        this.b0 = aVar;
        aVar.l(new ld(this, 19));
        e.add(aVar);
        if (z) {
            fz5 fz5Var = ((ChannelsOnboardingDiComponent) r9.getValue()).a;
            zdw zdwVar = i7o0.b;
            e.add(new lhb(this, ((kju0) (zdwVar != null ? zdwVar : null).c()).k));
        }
        return e.g();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.im.mvicomponent.MultiComponentFragment
    public final EmptyList ko(yn50 yn50Var) {
        if ((yn50Var instanceof g.c) && !((Boolean) this.W.getValue()).booleanValue()) {
            asu0.a.d().c(new kgb(0, this, yn50Var));
        }
        return EmptyList.b;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void mo(boolean z) {
        Toolbar toolbar = this.V;
        if (toolbar == null) {
            toolbar = null;
        }
        toolbar.setTitle(z ? R.string.vkim_sync_state_refreshing_dots : ((Boolean) this.a0.getValue()).booleanValue() ? R.string.vkim_communities_group_item_name : R.string.vkim_channels_group_item_name);
    }

    @Override // com.vk.im.mvicomponent.MviComponentFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = false;
    }

    @Override // com.vk.im.mvicomponent.MviComponentFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        shb shbVar = this.Y;
        if (shbVar != null) {
            ((io.reactivex.rxjava3.disposables.c) shbVar.b).dispose();
        }
        this.Y = null;
        this.c0 = 0;
        this.d0 = null;
        super.onDestroyView();
        ((bzb0) this.e0.getValue()).a();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        ((kju0) lo()).n.b = false;
        super.onPause();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (isHidden()) {
            return;
        }
        ((kju0) lo()).n.b = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.im.mvicomponent.MviComponentFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.V = (Toolbar) view.findViewById(R.id.toolbar);
        if (((Boolean) this.W.getValue()).booleanValue()) {
            Toolbar toolbar = this.V;
            if (toolbar == null) {
                toolbar = null;
            }
            toolbar.setVisibility(8);
        } else {
            Toolbar toolbar2 = this.V;
            if (toolbar2 == null) {
                toolbar2 = null;
            }
            toolbar2.setNavigationOnClickListener(new mo3(this, 3));
            mo(false);
        }
        if (this.Z) {
            View findViewById = view.findViewById(R.id.channels_onboarding_banner_container);
            nwy nwyVar = ((ChannelsOnboardingDiComponent) this.X.getValue()).b;
            qcy<Object> qcyVar = ChannelsOnboardingDiComponent.c[0];
            uhb uhbVar = (uhb) nwyVar.c();
            shb shbVar = new shb();
            shbVar.a = findViewById;
            f4m.j(findViewById);
            io.reactivex.rxjava3.subjects.d dVar = uhbVar.d;
            int i = kwg0.a;
            shbVar.b = io.reactivex.rxjava3.kotlin.c.f(2, dVar, null, new nu2("ChannelsOnboardingVisibilityController", 2), new com.vk.voip.ui.menu.feature.a(shbVar, 18));
            this.Y = shbVar;
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        com.vk.channels.impl.list.a aVar = this.b0;
        if (aVar != null) {
            com.vk.channels.impl.list.b feature = aVar.getFeature();
            uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.IM_CHANNELS_LIST;
            SchemeStat$EventItem schemeStat$EventItem = feature.t;
            if (schemeStat$EventItem != null) {
                uiTrackingScreen.f = schemeStat$EventItem;
            }
            feature.t = null;
        }
    }
}
