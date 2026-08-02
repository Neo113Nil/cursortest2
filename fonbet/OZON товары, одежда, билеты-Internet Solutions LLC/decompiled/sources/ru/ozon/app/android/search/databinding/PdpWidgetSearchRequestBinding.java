package ru.ozon.app.android.search.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.search.R$id;

/* loaded from: classes13.dex */
public final class PdpWidgetSearchRequestBinding implements a {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView searchRequestsRv;

    @NonNull
    public final TextView titleTv;

    private PdpWidgetSearchRequestBinding(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.searchRequestsRv = recyclerView;
        this.titleTv = textView;
    }

    @NonNull
    public static PdpWidgetSearchRequestBinding bind(@NonNull View view) {
        int i11 = R$id.searchRequestsRv;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.titleTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                return new PdpWidgetSearchRequestBinding((LinearLayout) view, recyclerView, textView);
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
