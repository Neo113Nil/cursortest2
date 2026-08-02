package ru.ozon.app.android.abtool.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import ru.ozon.app.android.abtool.R$id;
import ru.ozon.app.android.abtool.R$layout;

/* loaded from: classes11.dex */
public final class RootFragmentBinding implements a {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TabLayout tabLayout;

    @NonNull
    public final ViewPager2 viewPager;

    private RootFragmentBinding(@NonNull LinearLayout linearLayout, @NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2) {
        this.rootView = linearLayout;
        this.tabLayout = tabLayout;
        this.viewPager = viewPager2;
    }

    @NonNull
    public static RootFragmentBinding bind(@NonNull View view) {
        int i11 = R$id.tabLayout;
        TabLayout tabLayout = (TabLayout) C2548q.d(i11, view);
        if (tabLayout != null) {
            i11 = R$id.viewPager;
            ViewPager2 viewPager2 = (ViewPager2) C2548q.d(i11, view);
            if (viewPager2 != null) {
                return new RootFragmentBinding((LinearLayout) view, tabLayout, viewPager2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static RootFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.root_fragment, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
