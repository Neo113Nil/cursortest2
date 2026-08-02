package ru.ozon.app.android.deliveryreview.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.deliveryreview.R$id;

/* loaded from: classes11.dex */
public final class WidgetDeliveryReviewHeaderBinding implements a {

    @NonNull
    public final TextView infoTv;

    @NonNull
    public final RecyclerView photosRv;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView titleTv;

    private WidgetDeliveryReviewHeaderBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull RecyclerView recyclerView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.infoTv = textView;
        this.photosRv = recyclerView;
        this.titleTv = textView2;
    }

    @NonNull
    public static WidgetDeliveryReviewHeaderBinding bind(@NonNull View view) {
        int i11 = R$id.infoTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.photosRv;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                i11 = R$id.titleTv;
                TextView textView2 = (TextView) C2548q.d(i11, view);
                if (textView2 != null) {
                    return new WidgetDeliveryReviewHeaderBinding((LinearLayout) view, textView, recyclerView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
