package ru.ozon.app.android.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.main.R$id;
import ru.ozon.app.android.main.R$layout;

/* loaded from: classes12.dex */
public final class ActivityBenchmarkBinding implements a {

    @NonNull
    public final FrameLayout benchmarkFragmentContainer;

    @NonNull
    private final FrameLayout rootView;

    private ActivityBenchmarkBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.benchmarkFragmentContainer = frameLayout2;
    }

    @NonNull
    public static ActivityBenchmarkBinding bind(@NonNull View view) {
        int i11 = R$id.benchmarkFragmentContainer;
        FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
        if (frameLayout != null) {
            return new ActivityBenchmarkBinding((FrameLayout) view, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ActivityBenchmarkBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityBenchmarkBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.activity_benchmark, viewGroup, false);
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
