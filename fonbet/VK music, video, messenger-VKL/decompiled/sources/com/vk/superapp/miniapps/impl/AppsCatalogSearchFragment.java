package com.vk.superapp.miniapps.impl;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.search.integration.api.SearchDelegate;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import xsna.bpn0;
import xsna.oz50;
import xsna.sx0;

/* compiled from: AppsCatalogSearchFragment.kt */
/* loaded from: classes6.dex */
public final class AppsCatalogSearchFragment extends BaseFragment {
    public static final /* synthetic */ int T = 0;
    public final bpn0 S = new bpn0(new sx0(this, 1));

    /* compiled from: AppsCatalogSearchFragment.kt */
    public static final class a extends oz50 {
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ((SearchDelegate) this.S.getValue()).onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return ((SearchDelegate) this.S.getValue()).e(requireContext(), viewGroup);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((SearchDelegate) this.S.getValue()).d();
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.APPS_CATALOG_SEARCH;
    }
}
