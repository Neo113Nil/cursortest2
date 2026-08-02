package com.vk.core.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import xsna.gm6;
import xsna.im6;
import xsna.ozl;

/* compiled from: BaseMvpFragment.kt */
@ozl
/* loaded from: classes.dex */
public class BaseMvpFragment<P extends gm6> extends BaseFragment implements im6<P> {
    public P S;

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public boolean a0() {
        P io2 = io();
        return io2 != null && io2.a0();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    /* renamed from: getContext */
    public final Context mo2getContext() {
        return getActivity();
    }

    public P io() {
        return this.S;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        P io2 = io();
        if (io2 != null) {
            io2.onDestroy();
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        P io2 = io();
        if (io2 != null) {
            io2.onDestroyView();
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        P io2 = io();
        if (io2 != null) {
            io2.onPause();
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        P io2 = io();
        if (io2 != null) {
            io2.onResume();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        P io2 = io();
        if (io2 != null) {
            io2.onStart();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        P io2 = io();
        if (io2 != null) {
            io2.onStop();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        P io2 = io();
        if (io2 != null) {
            io2.d();
        }
    }
}
