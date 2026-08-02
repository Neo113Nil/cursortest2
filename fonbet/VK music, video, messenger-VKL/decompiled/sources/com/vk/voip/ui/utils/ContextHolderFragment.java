package com.vk.voip.ui.utils;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.vk.core.fragments.FragmentImpl;

/* compiled from: ContextHolderFragment.kt */
/* loaded from: classes7.dex */
public class ContextHolderFragment extends FragmentImpl {
    public Context N;

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    /* renamed from: getContext */
    public final Context mo2getContext() {
        return this.N;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        this.N = context;
        super.onAttach(context);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.N = null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return super.onGetLayoutInflater(bundle).cloneInContext(this.N);
    }
}
