package ru.ozon.app.android.storefront.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.app.android.storefront.R$layout;
import ru.ozon.uni.android.atom.rating.RatingView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes2.dex */
public final class WidgetNewRateAppBinding implements a {

    @NonNull
    public final RatingView rating;

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextAtomV2View titleTAV;

    private WidgetNewRateAppBinding(@NonNull LinearLayout linearLayout, @NonNull RatingView ratingView, @NonNull LinearLayout linearLayout2, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = linearLayout;
        this.rating = ratingView;
        this.root = linearLayout2;
        this.titleTAV = textAtomV2View;
    }

    @NonNull
    public static WidgetNewRateAppBinding bind(@NonNull View view) {
        int i11 = R$id.rating;
        RatingView ratingView = (RatingView) C2548q.d(i11, view);
        if (ratingView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i12 = R$id.titleTAV;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i12, view);
            if (textAtomV2View != null) {
                return new WidgetNewRateAppBinding(linearLayout, ratingView, linearLayout, textAtomV2View);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetNewRateAppBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_new_rate_app, viewGroup, false);
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
