package ru.ozon.app.android.storefront.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.app.android.storefront.R$layout;

/* loaded from: classes2.dex */
public final class ActivityStoriesBinding implements a {

    @NonNull
    public final ProgressBar loadingPb;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final ViewPager2 storiesWidgetVP;

    @NonNull
    public final FrameLayout stubStoryContainer;

    private ActivityStoriesBinding(@NonNull FrameLayout frameLayout, @NonNull ProgressBar progressBar, @NonNull ViewPager2 viewPager2, @NonNull FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.loadingPb = progressBar;
        this.storiesWidgetVP = viewPager2;
        this.stubStoryContainer = frameLayout2;
    }

    @NonNull
    public static ActivityStoriesBinding bind(@NonNull View view) {
        int i11 = R$id.loadingPb;
        ProgressBar progressBar = (ProgressBar) C2548q.d(i11, view);
        if (progressBar != null) {
            i11 = R$id.storiesWidgetVP;
            ViewPager2 viewPager2 = (ViewPager2) C2548q.d(i11, view);
            if (viewPager2 != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                return new ActivityStoriesBinding(frameLayout, progressBar, viewPager2, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ActivityStoriesBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityStoriesBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.activity_stories, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
