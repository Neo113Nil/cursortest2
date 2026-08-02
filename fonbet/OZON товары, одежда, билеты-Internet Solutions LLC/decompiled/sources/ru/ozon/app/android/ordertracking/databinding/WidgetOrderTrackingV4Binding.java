package ru.ozon.app.android.ordertracking.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes13.dex */
public final class WidgetOrderTrackingV4Binding implements a {

    @NonNull
    public final RecyclerView orderTrackingV4List;

    @NonNull
    private final RecyclerView rootView;

    private WidgetOrderTrackingV4Binding(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.orderTrackingV4List = recyclerView2;
    }

    @NonNull
    public static WidgetOrderTrackingV4Binding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new WidgetOrderTrackingV4Binding(recyclerView, recyclerView);
    }

    @Override // X4.a
    @NonNull
    public RecyclerView getRoot() {
        return this.rootView;
    }
}
