package ru.ozon.app.android.fresh.navigation;

import Ib.b;

/* loaded from: classes12.dex */
public final class FreshTabMiniAppFragment_MembersInjector implements b<FreshTabMiniAppFragment> {
    public static void injectFreshMapAppNameDelegate(FreshTabMiniAppFragment freshTabMiniAppFragment, FreshMapAppNameDelegate freshMapAppNameDelegate) {
        freshTabMiniAppFragment.freshMapAppNameDelegate = freshMapAppNameDelegate;
    }

    public static void injectViewModel(FreshTabMiniAppFragment freshTabMiniAppFragment, FreshViewModel freshViewModel) {
        freshTabMiniAppFragment.viewModel = freshViewModel;
    }
}
