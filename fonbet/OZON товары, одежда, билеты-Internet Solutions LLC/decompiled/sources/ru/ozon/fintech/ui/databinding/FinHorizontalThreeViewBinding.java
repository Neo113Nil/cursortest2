package ru.ozon.fintech.ui.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class FinHorizontalThreeViewBinding implements a {

    @NonNull
    public final FrameLayout horizontalCenterWidget;

    @NonNull
    public final LinearLayout horizontalHolder;

    @NonNull
    public final FrameLayout horizontalLeftWidget;

    @NonNull
    public final FrameLayout horizontalRightWidget;

    @NonNull
    private final LinearLayout rootView;

    private FinHorizontalThreeViewBinding(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout2, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3) {
        this.rootView = linearLayout;
        this.horizontalCenterWidget = frameLayout;
        this.horizontalHolder = linearLayout2;
        this.horizontalLeftWidget = frameLayout2;
        this.horizontalRightWidget = frameLayout3;
    }

    @NonNull
    public static FinHorizontalThreeViewBinding bind(@NonNull View view) {
        int i11 = R.id.horizontal_center_widget;
        FrameLayout frameLayout = (FrameLayout) C2548q.d(R.id.horizontal_center_widget, view);
        if (frameLayout != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i11 = R.id.horizontal_left_widget;
            FrameLayout frameLayout2 = (FrameLayout) C2548q.d(R.id.horizontal_left_widget, view);
            if (frameLayout2 != null) {
                i11 = R.id.horizontal_right_widget;
                FrameLayout frameLayout3 = (FrameLayout) C2548q.d(R.id.horizontal_right_widget, view);
                if (frameLayout3 != null) {
                    return new FinHorizontalThreeViewBinding(linearLayout, frameLayout, linearLayout, frameLayout2, frameLayout3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FinHorizontalThreeViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FinHorizontalThreeViewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.fin_horizontal_three_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
