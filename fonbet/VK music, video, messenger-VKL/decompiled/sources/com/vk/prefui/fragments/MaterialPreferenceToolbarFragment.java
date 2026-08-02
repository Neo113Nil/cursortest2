package com.vk.prefui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.vk.core.view.AppBarShadowView;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vkontakte.android.R;
import xsna.e4;
import xsna.f4m;
import xsna.h3p0;
import xsna.s66;
import xsna.tlo0;
import xsna.tq;

/* compiled from: MaterialPreferenceToolbarFragment.kt */
/* loaded from: classes5.dex */
public abstract class MaterialPreferenceToolbarFragment extends MaterialPreferenceFragment {
    public abstract int ho();

    @Override // com.vk.prefui.fragments.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.appkit_toolbar_fragment_hidable_with_coordinator, viewGroup, false);
        ((ViewGroup) inflate.findViewById(R.id.appkit_content)).addView(onCreateView);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        if (toolbar != null) {
            f4m.j(toolbar);
        }
        AppBarShadowView appBarShadowView = (AppBarShadowView) inflate.findViewById(R.id.shadow);
        if (appBarShadowView != null) {
            f4m.j(appBarShadowView);
        }
        return inflate;
    }

    @Override // com.vk.prefui.fragments.MaterialPreferenceFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup viewGroup;
        super.onViewCreated(view, bundle);
        VkTopBar vkTopBar = new VkTopBar(requireContext(), null, 6, 0);
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(getString(ho()), (e4) null, (VkTopBar.Middle.Text.Title.a) null, (VkTopBar.Middle.Text.Title.Size) null, 14), null, null, null, 14));
        vkTopBar.setBack(new VkTopBar.b(new s66(0, this, MaterialPreferenceToolbarFragment.class, "onToolbarNavigationClick", "onToolbarNavigationClick()V", 0, 2), tq.h(tlo0.Companion, R.string.accessibility_back), null, null, null, 28));
        View view2 = getView();
        if (view2 != null && (viewGroup = (ViewGroup) view2.findViewById(R.id.app_bar_layout)) != null) {
            viewGroup.addView(vkTopBar);
        }
        h3p0.d(this, vkTopBar);
    }
}
