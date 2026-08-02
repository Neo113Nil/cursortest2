package com.vk.search.ui.impl.catalog;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.fragments.BaseFragment;
import com.vk.search.integration.api.SearchDelegate;
import kotlin.LazyThreadSafetyMode;
import xsna.msy;
import xsna.myd0;
import xsna.oz50;
import xsna.w8i;

/* compiled from: SearchOwnerVideosCatalogFragment.kt */
/* loaded from: classes5.dex */
public final class SearchOwnerVideosCatalogFragment extends BaseFragment implements w8i {
    public static final /* synthetic */ int T = 0;
    public final Object S = msy.a(LazyThreadSafetyMode.NONE, new myd0(this, 8));

    /* compiled from: SearchOwnerVideosCatalogFragment.kt */
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
}
