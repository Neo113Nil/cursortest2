package com.vk.games.presentation.fragments;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.search.integration.api.SearchDelegate;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import kotlin.LazyThreadSafetyMode;
import xsna.msy;
import xsna.n1i;
import xsna.oz50;

/* compiled from: GamesCatalogSearchFragment.kt */
/* loaded from: classes17.dex */
public final class GamesCatalogSearchFragment extends BaseFragment {
    public static final /* synthetic */ int T = 0;
    public final Object S = msy.a(LazyThreadSafetyMode.NONE, new n1i(this, 10));

    /* compiled from: GamesCatalogSearchFragment.kt */
    public static final class a extends oz50 {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ((SearchDelegate) this.S.getValue()).onConfigurationChanged(configuration);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return ((SearchDelegate) this.S.getValue()).e(requireContext(), viewGroup);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((SearchDelegate) this.S.getValue()).d();
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.APPS_GAMES_CATALOG_SEARCH;
    }
}
