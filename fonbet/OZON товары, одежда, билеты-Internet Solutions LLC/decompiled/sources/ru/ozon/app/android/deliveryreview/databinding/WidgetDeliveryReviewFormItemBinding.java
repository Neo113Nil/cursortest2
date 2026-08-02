package ru.ozon.app.android.deliveryreview.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.deliveryreview.R$id;

/* loaded from: classes11.dex */
public final class WidgetDeliveryReviewFormItemBinding implements a {

    @NonNull
    public final RecyclerView componentRv;

    @NonNull
    public final CardView cvFormContainer;

    @NonNull
    public final LinearLayout llFormContainer;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextView titleTv;

    private WidgetDeliveryReviewFormItemBinding(@NonNull FrameLayout frameLayout, @NonNull RecyclerView recyclerView, @NonNull CardView cardView, @NonNull LinearLayout linearLayout, @NonNull TextView textView) {
        this.rootView = frameLayout;
        this.componentRv = recyclerView;
        this.cvFormContainer = cardView;
        this.llFormContainer = linearLayout;
        this.titleTv = textView;
    }

    @NonNull
    public static WidgetDeliveryReviewFormItemBinding bind(@NonNull View view) {
        int i11 = R$id.componentRv;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.cvFormContainer;
            CardView cardView = (CardView) C2548q.d(i11, view);
            if (cardView != null) {
                i11 = R$id.llFormContainer;
                LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
                if (linearLayout != null) {
                    i11 = R$id.titleTv;
                    TextView textView = (TextView) C2548q.d(i11, view);
                    if (textView != null) {
                        return new WidgetDeliveryReviewFormItemBinding((FrameLayout) view, recyclerView, cardView, linearLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public FrameLayout getConstraintLayout() {
        return this.rootView;
    }
}
