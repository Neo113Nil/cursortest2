package ru.ozon.app.android.pdpoldwidgets.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes13.dex */
public final class PdpWidgetMarketingActionsBinding implements a {

    @NonNull
    public final RecyclerView actionsRv;

    @NonNull
    private final RecyclerView rootView;

    private PdpWidgetMarketingActionsBinding(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.actionsRv = recyclerView2;
    }

    @NonNull
    public static PdpWidgetMarketingActionsBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new PdpWidgetMarketingActionsBinding(recyclerView, recyclerView);
    }

    @Override // X4.a
    @NonNull
    public RecyclerView getRoot() {
        return this.rootView;
    }
}
