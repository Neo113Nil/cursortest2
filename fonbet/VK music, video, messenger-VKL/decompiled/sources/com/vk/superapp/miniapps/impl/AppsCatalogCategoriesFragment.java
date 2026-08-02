package com.vk.superapp.miniapps.impl;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.fragments.BaseFragment;
import com.vk.superapp.catalog.api.di.AppsCatalogComponent;
import com.vk.superapp.miniapps.impl.AppsCatalogSectionDetailsFragment;
import xsna.f8r0;
import xsna.fpf0;
import xsna.m7m;
import xsna.oz50;
import xsna.q8r0;

/* compiled from: AppsCatalogCategoriesFragment.kt */
/* loaded from: classes6.dex */
public final class AppsCatalogCategoriesFragment extends BaseFragment implements q8r0 {
    public f8r0 S;

    /* compiled from: AppsCatalogCategoriesFragment.kt */
    public static final class a extends oz50 {
    }

    @Override // xsna.q8r0
    public final void mc(String str, String str2) {
        new AppsCatalogSectionDetailsFragment.a(str, str2).l(this);
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.S = ((AppsCatalogComponent) m7m.d(this).mo408a(fpf0.a(AppsCatalogComponent.class))).U9(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        f8r0 f8r0Var = this.S;
        if (f8r0Var != null) {
            return f8r0Var.e(requireContext(), viewGroup);
        }
        return null;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        f8r0 f8r0Var = this.S;
        if (f8r0Var != null) {
            f8r0Var.onDestroyView();
        }
        this.S = null;
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        f8r0 f8r0Var = this.S;
        if (f8r0Var != null) {
            f8r0Var.d(requireContext(), view);
        }
    }

    @Override // xsna.q8r0
    public final void Rm() {
    }

    @Override // xsna.q8r0
    public final void c(boolean z) {
    }
}
