package com.sofascore.results.main.favorites;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.s;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.results.R;
import com.sofascore.results.main.MainActivity;
import com.sofascore.results.main.favorites.FavoritesRootFragment;
import com.sofascore.results.mvvm.base.SofaTabLayout;
import defpackage.ct7;
import defpackage.et7;
import defpackage.io8;
import defpackage.joa;
import defpackage.krk;
import defpackage.nq8;
import defpackage.ouk;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/main/favorites/FavoritesRootFragment;", "Lcom/sofascore/results/main/AbstractFadingFragment;", "Lio8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoritesRootFragment extends Hilt_FavoritesRootFragment<io8> {
    public boolean t;
    public final joa u;
    public final joa v;
    public final joa w;

    public FavoritesRootFragment() {
        final int i = 0;
        Function0 function0 = new Function0(this) { // from class: rs7
            public final /* synthetic */ FavoritesRootFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FavoritesRootFragment favoritesRootFragment = this.b;
                switch (i2) {
                    case 0:
                        krk krkVar = favoritesRootFragment.l;
                        krkVar.getClass();
                        ViewPager2 viewPager2 = ((io8) krkVar).b;
                        SofaTabLayout sofaTabLayout = (SofaTabLayout) favoritesRootFragment.w.getValue();
                        sofaTabLayout.getClass();
                        s childFragmentManager = favoritesRootFragment.getChildFragmentManager();
                        childFragmentManager.getClass();
                        g6b lifecycle = favoritesRootFragment.getLifecycle();
                        lifecycle.getClass();
                        et7 et7Var = new et7(childFragmentManager, lifecycle, viewPager2, sofaTabLayout);
                        et7Var.G(favoritesRootFragment.t);
                        return et7Var;
                    case 1:
                        return new j41(favoritesRootFragment, 7);
                    default:
                        FragmentActivity requireActivity = favoritesRootFragment.requireActivity();
                        requireActivity.getClass();
                        return ((MainActivity) requireActivity).Q().d;
                }
            }
        };
        ysa ysaVar = ysa.c;
        this.u = ypa.a(ysaVar, function0);
        final int i2 = 1;
        this.v = ypa.a(ysaVar, new Function0(this) { // from class: rs7
            public final /* synthetic */ FavoritesRootFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FavoritesRootFragment favoritesRootFragment = this.b;
                switch (i22) {
                    case 0:
                        krk krkVar = favoritesRootFragment.l;
                        krkVar.getClass();
                        ViewPager2 viewPager2 = ((io8) krkVar).b;
                        SofaTabLayout sofaTabLayout = (SofaTabLayout) favoritesRootFragment.w.getValue();
                        sofaTabLayout.getClass();
                        s childFragmentManager = favoritesRootFragment.getChildFragmentManager();
                        childFragmentManager.getClass();
                        g6b lifecycle = favoritesRootFragment.getLifecycle();
                        lifecycle.getClass();
                        et7 et7Var = new et7(childFragmentManager, lifecycle, viewPager2, sofaTabLayout);
                        et7Var.G(favoritesRootFragment.t);
                        return et7Var;
                    case 1:
                        return new j41(favoritesRootFragment, 7);
                    default:
                        FragmentActivity requireActivity = favoritesRootFragment.requireActivity();
                        requireActivity.getClass();
                        return ((MainActivity) requireActivity).Q().d;
                }
            }
        });
        final int i3 = 2;
        this.w = ypa.a(ysaVar, new Function0(this) { // from class: rs7
            public final /* synthetic */ FavoritesRootFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FavoritesRootFragment favoritesRootFragment = this.b;
                switch (i22) {
                    case 0:
                        krk krkVar = favoritesRootFragment.l;
                        krkVar.getClass();
                        ViewPager2 viewPager2 = ((io8) krkVar).b;
                        SofaTabLayout sofaTabLayout = (SofaTabLayout) favoritesRootFragment.w.getValue();
                        sofaTabLayout.getClass();
                        s childFragmentManager = favoritesRootFragment.getChildFragmentManager();
                        childFragmentManager.getClass();
                        g6b lifecycle = favoritesRootFragment.getLifecycle();
                        lifecycle.getClass();
                        et7 et7Var = new et7(childFragmentManager, lifecycle, viewPager2, sofaTabLayout);
                        et7Var.G(favoritesRootFragment.t);
                        return et7Var;
                    case 1:
                        return new j41(favoritesRootFragment, 7);
                    default:
                        FragmentActivity requireActivity = favoritesRootFragment.requireActivity();
                        requireActivity.getClass();
                        return ((MainActivity) requireActivity).Q().d;
                }
            }
        });
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.fragment_favourites_root, (ViewGroup) null, false);
        ViewPager2 viewPager2 = (ViewPager2) nq8.B(R.id.view_pager, inflate);
        if (viewPager2 != null) {
            return new io8((ConstraintLayout) inflate, viewPager2);
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.view_pager)));
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        krk krkVar = this.l;
        krkVar.getClass();
        ((io8) krkVar).b.e((ouk) this.v.getValue());
        super.onDestroyView();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "FavoriteTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void q() {
        super.q();
        this.t = true;
        if (((io8) this.l) != null) {
            ((et7) this.u.getValue()).G(true);
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        FragmentActivity requireActivity = requireActivity();
        MainActivity mainActivity = requireActivity instanceof MainActivity ? (MainActivity) requireActivity : null;
        if (mainActivity != null) {
            mainActivity.Q().d.setSelectedTabIndicatorColor(requireContext().getColor(R.color.on_color_primary));
        }
        krk krkVar = this.l;
        krkVar.getClass();
        ViewPager2 viewPager2 = ((io8) krkVar).b;
        et7 et7Var = (et7) this.u.getValue();
        et7Var.x(ct7.h);
        viewPager2.setAdapter(et7Var);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        ((io8) krkVar2).b.a((ouk) this.v.getValue());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
    }
}
