package ru.ozon.app.android.ugc.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.app.android.uikit.view.atoms.progressbar.ProgressBarView;

/* loaded from: classes2.dex */
public final class WidgetReviewsProgressBinding implements a {

    @NonNull
    public final ProgressBarView reviewsProgressBar;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView subtitleTv;

    @NonNull
    public final TextView titleTv;

    private WidgetReviewsProgressBinding(@NonNull LinearLayout linearLayout, @NonNull ProgressBarView progressBarView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.reviewsProgressBar = progressBarView;
        this.subtitleTv = textView;
        this.titleTv = textView2;
    }

    @NonNull
    public static WidgetReviewsProgressBinding bind(@NonNull View view) {
        int i11 = R$id.reviewsProgressBar;
        ProgressBarView progressBarView = (ProgressBarView) C2548q.d(i11, view);
        if (progressBarView != null) {
            i11 = R$id.subtitleTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.titleTv;
                TextView textView2 = (TextView) C2548q.d(i11, view);
                if (textView2 != null) {
                    return new WidgetReviewsProgressBinding((LinearLayout) view, progressBarView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
