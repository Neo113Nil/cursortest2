package com.vk.music.fragment.impl;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.f;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.fragments.impl.support.ParentSupportFragment;
import com.vk.core.view.FitSystemWindowsFragmentWrapperFrameLayout;
import com.vk.music.fragment.impl.MusicOfflineCatalogFragment;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.aes;
import xsna.bek0;
import xsna.eqy;
import xsna.msy;
import xsna.o0q0;
import xsna.p6y;
import xsna.qhh0;
import xsna.qwh0;
import xsna.too0;
import xsna.unh0;
import xsna.v6j;
import xsna.vds;
import xsna.xk40;
import xsna.yk40;

/* compiled from: MusicContainerFragment.kt */
/* loaded from: classes3.dex */
public final class MusicContainerFragment extends BaseFragment implements o0q0, qhh0, aes, vds, too0 {
    public static final /* synthetic */ int T = 0;
    public final Object S = msy.a(LazyThreadSafetyMode.NONE, new p6y(this, 9));

    @Override // xsna.aes
    public final void A0() {
        f io2 = io();
        if (io2 instanceof aes) {
            ((aes) io2).A0();
        }
    }

    @Override // xsna.vds
    public final int Q0() {
        return 1;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        FragmentImpl io2 = io();
        if (io2 == null) {
            return false;
        }
        return io2.a0();
    }

    @Override // xsna.o0q0
    public final Fragment getUiTrackingFragment() {
        if (isAdded()) {
            return io();
        }
        return null;
    }

    @Override // xsna.aes
    public final void h7(v6j v6jVar) {
        f io2 = io();
        if (io2 instanceof aes) {
            ((aes) io2).h7(v6jVar);
        }
    }

    public final FragmentImpl io() {
        return (FragmentImpl) ((ParentSupportFragment) In().a.H("fragment_default_tag"));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void jo() {
        FragmentImpl Ab;
        yk40 builder = ((xk40) this.S.getValue()).builder();
        Bundle arguments = getArguments();
        builder.b(arguments != null ? arguments.getString("key_url") : null, false);
        a.D(builder.j);
        com.vk.core.utils.newtork.b.a.getClass();
        if (com.vk.core.utils.newtork.b.d()) {
            Ab = builder.j().Ab();
        } else {
            eqy<bek0> eqyVar = com.vk.toggle.d.a;
            MusicOfflineCatalogFragment.a aVar = new MusicOfflineCatalogFragment.a();
            aVar.j.putBoolean("key_include_offline_mode", true);
            Ab = aVar.j().Ab();
        }
        In().q().c(R.id.inner_fragment_wrapper, Ab);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FitSystemWindowsFragmentWrapperFrameLayout fitSystemWindowsFragmentWrapperFrameLayout = new FitSystemWindowsFragmentWrapperFrameLayout(layoutInflater.getContext(), 0);
        fitSystemWindowsFragmentWrapperFrameLayout.setId(R.id.inner_fragment_wrapper);
        return fitSystemWindowsFragmentWrapperFrameLayout;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (io() == null) {
            jo();
        }
    }

    @Override // xsna.aes
    public final RectF p1() {
        f io2 = io();
        if (io2 instanceof aes) {
            return ((aes) io2).p1();
        }
        return null;
    }

    @Override // xsna.qhh0
    public final boolean s() {
        f io2 = io();
        if (io2 instanceof qhh0) {
            return ((qhh0) io2).s();
        }
        if (!(io2 instanceof qwh0)) {
            return false;
        }
        ((unh0) io2).s();
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
    }
}
