package com.vk.superapp.miniapps.impl;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.fragments.BaseFragment;
import com.vk.superapp.catalog.api.di.AppsCatalogComponent;
import xsna.a9r0;
import xsna.fpf0;
import xsna.m7m;
import xsna.oz50;

/* compiled from: AppsCatalogSectionDetailsFragment.kt */
/* loaded from: classes6.dex */
public final class AppsCatalogSectionDetailsFragment extends BaseFragment {
    public a9r0 S;

    /* compiled from: AppsCatalogSectionDetailsFragment.kt */
    public static final class a extends oz50 {
        public a(String str, String str2) {
            super(AppsCatalogSectionDetailsFragment.class, null, null);
            this.j.putString("section_id", str);
            this.j.putString("title", str2);
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.S = ((AppsCatalogComponent) m7m.d(this).mo408a(fpf0.a(AppsCatalogComponent.class))).c3(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        a9r0 a9r0Var = this.S;
        if (a9r0Var != null) {
            return a9r0Var.e(requireContext(), viewGroup);
        }
        return null;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        a9r0 a9r0Var = this.S;
        if (a9r0Var != null) {
            a9r0Var.onDestroyView();
        }
        this.S = null;
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        a9r0 a9r0Var = this.S;
        if (a9r0Var != null) {
            a9r0Var.d(requireContext(), view);
        }
    }
}
