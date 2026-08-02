package ru.ozon.app.android.travel.feature.hotels.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public final class WidgetHotelsPageDetailsFullBinding implements a {

    @NonNull
    public final RecyclerView hotelDetailsRV;

    @NonNull
    private final RecyclerView rootView;

    private WidgetHotelsPageDetailsFullBinding(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.hotelDetailsRV = recyclerView2;
    }

    @NonNull
    public static WidgetHotelsPageDetailsFullBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new WidgetHotelsPageDetailsFullBinding(recyclerView, recyclerView);
    }

    @Override // X4.a
    @NonNull
    public RecyclerView getRoot() {
        return this.rootView;
    }
}
