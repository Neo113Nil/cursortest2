package com.vk.search.communities.map.impl.ui.details;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.ecomm.reviews.api.di.ReviewsComponent;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.repository.data.api.ExtendedProfilesRepository;
import com.vk.search.communities.map.api.domain.LocationCoordinate;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import xsna.ao50;
import xsna.bm01;
import xsna.boh0;
import xsna.bpn0;
import xsna.coh0;
import xsna.eoh0;
import xsna.f540;
import xsna.fkq0;
import xsna.fpf0;
import xsna.gl6;
import xsna.km50;
import xsna.koh0;
import xsna.loh0;
import xsna.m7m;
import xsna.mk50;
import xsna.msy;
import xsna.o1e0;
import xsna.oz50;
import xsna.skd;
import xsna.t6g0;
import xsna.vg20;
import xsna.vig0;
import xsna.vk50;
import xsna.vnh0;
import xsna.woh0;
import xsna.wqg;
import xsna.wt30;
import xsna.xwk;
import xsna.ynh0;
import xsna.z3g;

/* compiled from: SearchCommunitiesOnMapDetailsFragment.kt */
/* loaded from: classes5.dex */
public final class SearchCommunitiesOnMapDetailsFragment extends MviImplFragment<boh0, loh0, ynh0> implements z3g {
    public static final /* synthetic */ int T = 0;
    public koh0 Q;
    public final bpn0 R = new bpn0(new wt30(this, 15));
    public z3g.a S;

    /* compiled from: SearchCommunitiesOnMapDetailsFragment.kt */
    public static final class a {
        public final Bundle a;

        public a(Bundle bundle) {
            this.a = bundle;
        }
    }

    /* compiled from: SearchCommunitiesOnMapDetailsFragment.kt */
    public static final class b extends oz50 {
        public final Object m;

        public b() {
            super(SearchCommunitiesOnMapDetailsFragment.class, null, null);
            this.m = msy.a(LazyThreadSafetyMode.NONE, new f540(this, 22));
        }
    }

    /* compiled from: SearchCommunitiesOnMapDetailsFragment.kt */
    public static final /* synthetic */ class c extends MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            return ((SearchCommunitiesOnMapDetailsFragment) this.receiver).Q;
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            ((SearchCommunitiesOnMapDetailsFragment) this.receiver).Q = (koh0) obj;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        koh0 koh0Var = new koh0(requireContext(), getViewLifecycleOwner());
        new c(this, SearchCommunitiesOnMapDetailsFragment.class, "detailsView", "getDetailsView()Lcom/vk/search/communities/map/impl/ui/details/compose/SearchCommunitiesOnMapDetailsView;", 0).set(koh0Var);
        koh0Var.e4(this.S);
        return new mk50.c(koh0Var.c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        loh0 loh0Var = (loh0) ao50Var;
        koh0 koh0Var = this.Q;
        if (koh0Var != null) {
            koh0Var.f(loh0Var, new coh0(1, getFeature(), boh0.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", 0));
        }
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((boh0) vk50Var).k.a(new gl6(1, this, SearchCommunitiesOnMapDetailsFragment.class, "onSideEffect", "onSideEffect(Lcom/vk/search/communities/map/impl/ui/details/mvi/sideeffect/SearchCommunitiesOnMapDetailsSideEffect;)V", 0, 10), this);
    }

    @Override // xsna.z3g
    public final void e4(z3g.a aVar) {
        this.S = aVar;
        koh0 koh0Var = this.Q;
        if (koh0Var != null) {
            koh0Var.e4(aVar);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 101) {
            getFeature().C(ynh0.h.b);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.Q = null;
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Parcelable parcelable;
        Parcelable parcelable2;
        Parcelable parcelable3;
        Object parcelable4;
        Object parcelable5;
        Object parcelable6;
        vig0 xa = ((ReviewsComponent) m7m.d(this).a(fpf0.a(ReviewsComponent.class))).xa();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            parcelable6 = bundle.getParcelable("group_id", UserId.class);
            parcelable = (Parcelable) parcelable6;
        } else {
            Parcelable parcelable7 = bundle.getParcelable("group_id");
            if (!(parcelable7 instanceof UserId)) {
                parcelable7 = null;
            }
            parcelable = (UserId) parcelable7;
        }
        UserId userId = (UserId) parcelable;
        UserId a2 = userId != null ? fkq0.a(userId) : null;
        if (a2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (i >= 33) {
            parcelable5 = bundle.getParcelable("location", LocationCoordinate.class);
            parcelable2 = (Parcelable) parcelable5;
        } else {
            Parcelable parcelable8 = bundle.getParcelable("location");
            if (!(parcelable8 instanceof LocationCoordinate)) {
                parcelable8 = null;
            }
            parcelable2 = (LocationCoordinate) parcelable8;
        }
        ynh0.e eVar = new ynh0.e(a2, (LocationCoordinate) parcelable2);
        eoh0 eoh0Var = new eoh0(xa);
        t6g0 t6g0Var = t6g0.b;
        ExtendedProfilesRepository c2 = t6g0.c();
        wqg wqgVar = new wqg();
        bm01 bm01Var = new bm01(new vg20());
        woh0 woh0Var = new woh0(t6g0.b(), new skd(), xwk.e().T().m(), o1e0.a);
        if (i >= 33) {
            parcelable4 = bundle.getParcelable("search_stats_logging_info", SearchStatsLoggingInfo.class);
            parcelable3 = (Parcelable) parcelable4;
        } else {
            Parcelable parcelable9 = bundle.getParcelable("search_stats_logging_info");
            if (!(parcelable9 instanceof SearchStatsLoggingInfo)) {
                parcelable9 = null;
            }
            parcelable3 = (SearchStatsLoggingInfo) parcelable9;
        }
        return new boh0(eVar, eoh0Var, c2, wqgVar, bm01Var, woh0Var, new vnh0((SearchStatsLoggingInfo) parcelable3));
    }
}
