package com.vk.attachpicker.impl.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.fragments.BaseFragment;
import com.vkontakte.android.R;
import xsna.g2v;
import xsna.iin0;
import xsna.iwv;
import xsna.n64;
import xsna.oz50;

/* compiled from: AchievementsFragment.kt */
/* loaded from: classes15.dex */
public final class AchievementsFragment extends BaseFragment implements iin0, n64 {
    public ViewGroup S;

    /* compiled from: AchievementsFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(AchievementsFragment.class, null, null);
        }
    }

    @Override // xsna.n64
    public final void J5() {
        g2v.c().k();
        requireContext();
        iwv.a aVar = iwv.a;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // xsna.iin0
    public final ViewGroup Wj(Context context) {
        if (this.S == null) {
            this.S = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.picker_toolbar_achievements, (ViewGroup) null);
        }
        return this.S;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getLong("peer_id");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.achievements_fragment, viewGroup, false);
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.S = null;
        super.onDestroyView();
    }
}
