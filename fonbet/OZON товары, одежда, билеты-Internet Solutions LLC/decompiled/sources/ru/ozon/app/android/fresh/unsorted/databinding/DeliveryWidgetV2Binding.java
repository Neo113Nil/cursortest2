package ru.ozon.app.android.fresh.unsorted.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.utils.CircleProgressView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class DeliveryWidgetV2Binding implements a {

    @NonNull
    public final CircleProgressView circleProgressBar;

    @NonNull
    public final ConstraintLayout deliveryWidgetV2;

    @NonNull
    public final ImageView iconIv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ImageView statusIconIv;

    @NonNull
    public final TextAtomV2View subtitleTextTvTv;

    @NonNull
    public final TextAtomV2View titleTextTv;

    @NonNull
    public final Guideline verticalGuideline;

    private DeliveryWidgetV2Binding(@NonNull ConstraintLayout constraintLayout, @NonNull CircleProgressView circleProgressView, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2, @NonNull Guideline guideline) {
        this.rootView = constraintLayout;
        this.circleProgressBar = circleProgressView;
        this.deliveryWidgetV2 = constraintLayout2;
        this.iconIv = imageView;
        this.statusIconIv = imageView2;
        this.subtitleTextTvTv = textAtomV2View;
        this.titleTextTv = textAtomV2View2;
        this.verticalGuideline = guideline;
    }

    @NonNull
    public static DeliveryWidgetV2Binding bind(@NonNull View view) {
        int i11 = R$id.circleProgressBar;
        CircleProgressView circleProgressView = (CircleProgressView) C2548q.d(i11, view);
        if (circleProgressView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i11 = R$id.iconIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.statusIconIv;
                ImageView imageView2 = (ImageView) C2548q.d(i11, view);
                if (imageView2 != null) {
                    i11 = R$id.subtitleTextTvTv;
                    TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View != null) {
                        i11 = R$id.titleTextTv;
                        TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View2 != null) {
                            i11 = R$id.verticalGuideline;
                            Guideline guideline = (Guideline) C2548q.d(i11, view);
                            if (guideline != null) {
                                return new DeliveryWidgetV2Binding(constraintLayout, circleProgressView, constraintLayout, imageView, imageView2, textAtomV2View, textAtomV2View2, guideline);
                            }
                        }
                    }
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
