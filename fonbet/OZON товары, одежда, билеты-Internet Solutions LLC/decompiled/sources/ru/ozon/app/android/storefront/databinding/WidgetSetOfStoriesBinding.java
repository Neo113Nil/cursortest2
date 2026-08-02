package ru.ozon.app.android.storefront.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.storefront.R$id;

/* loaded from: classes2.dex */
public final class WidgetSetOfStoriesBinding implements a {

    @NonNull
    public final RecyclerView previewsRv;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LinearLayout setOfStoriesLl;

    @NonNull
    public final TextView titleTv;

    private WidgetSetOfStoriesBinding(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.previewsRv = recyclerView;
        this.setOfStoriesLl = linearLayout2;
        this.titleTv = textView;
    }

    @NonNull
    public static WidgetSetOfStoriesBinding bind(@NonNull View view) {
        int i11 = R$id.previewsRv;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i12 = R$id.titleTv;
            TextView textView = (TextView) C2548q.d(i12, view);
            if (textView != null) {
                return new WidgetSetOfStoriesBinding(linearLayout, recyclerView, linearLayout, textView);
            }
            i11 = i12;
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
