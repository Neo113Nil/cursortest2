package ru.ozon.app.android.ugc.core.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.ugc.core.R$id;

/* loaded from: classes2.dex */
public final class WidgetReviewSortsBinding implements a {

    @NonNull
    public final AppCompatImageView arrowIv;

    @NonNull
    public final Layer reviewSortsLayer;

    @NonNull
    public final ConstraintLayout reviewSortsWidget;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final AppCompatTextView titleTv;

    private WidgetReviewSortsBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull Layer layer, @NonNull ConstraintLayout constraintLayout2, @NonNull AppCompatTextView appCompatTextView) {
        this.rootView = constraintLayout;
        this.arrowIv = appCompatImageView;
        this.reviewSortsLayer = layer;
        this.reviewSortsWidget = constraintLayout2;
        this.titleTv = appCompatTextView;
    }

    @NonNull
    public static WidgetReviewSortsBinding bind(@NonNull View view) {
        int i11 = R$id.arrowIv;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
        if (appCompatImageView != null) {
            i11 = R$id.reviewSortsLayer;
            Layer layer = (Layer) C2548q.d(i11, view);
            if (layer != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i11 = R$id.titleTv;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                if (appCompatTextView != null) {
                    return new WidgetReviewSortsBinding(constraintLayout, appCompatImageView, layer, constraintLayout, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
