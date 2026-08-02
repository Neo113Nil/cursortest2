package ru.ozon.app.android.cs_orders.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.cs_orders.R$id;

/* loaded from: classes11.dex */
public final class WidgetComplainDeliveryCompletedStateBinding implements a {

    @NonNull
    public final LinearLayout completedStateContainer;

    @NonNull
    public final TextView completedStateSubtitle;

    @NonNull
    public final TextView completedStateTitle;

    @NonNull
    private final LinearLayout rootView;

    private WidgetComplainDeliveryCompletedStateBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.completedStateContainer = linearLayout2;
        this.completedStateSubtitle = textView;
        this.completedStateTitle = textView2;
    }

    @NonNull
    public static WidgetComplainDeliveryCompletedStateBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R$id.completedStateSubtitle;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.completedStateTitle;
            TextView textView2 = (TextView) C2548q.d(i11, view);
            if (textView2 != null) {
                return new WidgetComplainDeliveryCompletedStateBinding(linearLayout, linearLayout, textView, textView2);
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
