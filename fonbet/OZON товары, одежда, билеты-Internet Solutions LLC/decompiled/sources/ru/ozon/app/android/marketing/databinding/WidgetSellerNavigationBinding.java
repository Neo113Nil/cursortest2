package ru.ozon.app.android.marketing.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.tabs.TabLayout;
import ru.ozon.app.android.marketing.R$id;

/* loaded from: classes12.dex */
public final class WidgetSellerNavigationBinding implements a {

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TabLayout tabsTl;

    private WidgetSellerNavigationBinding(@NonNull FrameLayout frameLayout, @NonNull TabLayout tabLayout) {
        this.rootView = frameLayout;
        this.tabsTl = tabLayout;
    }

    @NonNull
    public static WidgetSellerNavigationBinding bind(@NonNull View view) {
        int i11 = R$id.tabsTl;
        TabLayout tabLayout = (TabLayout) C2548q.d(i11, view);
        if (tabLayout != null) {
            return new WidgetSellerNavigationBinding((FrameLayout) view, tabLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
