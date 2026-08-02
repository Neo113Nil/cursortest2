package com.vk.socialgraph.init;

import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.fragments.FragmentImpl;
import com.vk.socialgraph.b;
import com.vkontakte.android.R;
import xsna.arf0;
import xsna.dhr0;
import xsna.gz80;
import xsna.iah0;

/* compiled from: BaseSocialGraphInitFragment.kt */
/* loaded from: classes5.dex */
public abstract class BaseSocialGraphInitFragment extends FragmentImpl implements arf0 {
    public View N;

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View view = this.N;
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.topMargin = (int) (iah0.p(requireContext()) * 0.225f);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onResume() {
        Window window;
        super.onResume();
        View view = getView();
        boolean b = b.b(view);
        if (gz80.a(23) && view != null) {
            int systemUiVisibility = view.getSystemUiVisibility();
            view.setSystemUiVisibility(b ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        }
        b.c(view, b);
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.setStatusBarColor(0);
        Drawable background = view != null ? view.getBackground() : null;
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        if (colorDrawable != null) {
            dhr0.t0(kn().getWindow(), colorDrawable.getColor());
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.big_icon);
        this.N = findViewById;
        if (findViewById != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
            marginLayoutParams.topMargin = (int) (iah0.p(requireContext()) * 0.225f);
            findViewById.setLayoutParams(marginLayoutParams);
        }
    }
}
