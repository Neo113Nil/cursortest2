package com.vk.debug.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.VKTabLayout;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.debug.ui.user.DebugUserSettingsFragment;
import com.vk.toggle.debug.DebugAnonymousTogglesFragment;
import com.vk.toggle.debug.DebugTogglesFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.f4m;
import xsna.l44;
import xsna.ncs;
import xsna.o2l;

/* compiled from: DebugTabsFragment.kt */
/* loaded from: classes17.dex */
public final class DebugTabsFragment extends BaseFragment {
    public static final ArrayList S;

    /* compiled from: DebugTabsFragment.kt */
    public static final class a extends ncs {
        public final DebugTabsFragment g;

        public a(DebugTabsFragment debugTabsFragment) {
            super(debugTabsFragment.getChildFragmentManager());
            this.g = debugTabsFragment;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return DebugTabsFragment.S.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final CharSequence getPageTitle(int i) {
            return this.g.getString(((b) DebugTabsFragment.S.get(i)).a);
        }
    }

    /* compiled from: DebugTabsFragment.kt */
    public static final class b {
        public final int a;
        public final Class<? extends FragmentImpl> b;

        public b(int i, Class<? extends FragmentImpl> cls) {
            this.a = i;
            this.b = cls;
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        o2l.a.getClass();
        if (o2l.f()) {
            arrayList.add(new b(R.string.debug_general, DebugDevSettingsFragment.class));
            arrayList.add(new b(R.string.debug_toggles, DebugTogglesFragment.class));
            arrayList.add(new b(R.string.anonymous_debug_toggles, DebugAnonymousTogglesFragment.class));
            arrayList.add(new b(R.string.debug_beta_general, DebugUserSettingsFragment.class));
        } else {
            arrayList.add(new b(R.string.debug_general, DebugUserSettingsFragment.class));
        }
        S = arrayList;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.debug_tabs_fragment, viewGroup, false);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((ImageView) view.findViewById(R.id.back_button)).setOnClickListener(new l44(this, 3));
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.debug_view_pager);
        viewPager.setAdapter(new a(this));
        VKTabLayout vKTabLayout = (VKTabLayout) view.findViewById(R.id.debug_tab_layout);
        vKTabLayout.setupWithViewPager(viewPager);
        if (S.size() <= 1) {
            f4m.j(vKTabLayout);
        }
    }
}
