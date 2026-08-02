package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.pdp.R$id;

/* loaded from: classes13.dex */
public final class WidgetOtherSellersTitleBinding implements a {

    @NonNull
    public final ConstraintLayout otherSellersV2title;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView titleTv;

    private WidgetOtherSellersTitleBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.otherSellersV2title = constraintLayout2;
        this.titleTv = textView;
    }

    @NonNull
    public static WidgetOtherSellersTitleBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.titleTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            return new WidgetOtherSellersTitleBinding(constraintLayout, constraintLayout, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
