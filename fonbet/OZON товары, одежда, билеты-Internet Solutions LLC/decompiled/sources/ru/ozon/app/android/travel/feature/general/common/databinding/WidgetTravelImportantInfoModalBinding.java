package ru.ozon.app.android.travel.feature.general.common.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class WidgetTravelImportantInfoModalBinding implements a {

    @NonNull
    public final RecyclerView importantInfoModalRV;

    @NonNull
    private final RecyclerView rootView;

    private WidgetTravelImportantInfoModalBinding(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.importantInfoModalRV = recyclerView2;
    }

    @NonNull
    public static WidgetTravelImportantInfoModalBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new WidgetTravelImportantInfoModalBinding(recyclerView, recyclerView);
    }

    @Override // X4.a
    @NonNull
    public RecyclerView getRoot() {
        return this.rootView;
    }
}
