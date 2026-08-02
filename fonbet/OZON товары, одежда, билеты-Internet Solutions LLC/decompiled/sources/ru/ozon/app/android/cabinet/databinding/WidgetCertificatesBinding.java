package ru.ozon.app.android.cabinet.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public final class WidgetCertificatesBinding implements a {

    @NonNull
    public final RecyclerView listRv;

    @NonNull
    private final RecyclerView rootView;

    private WidgetCertificatesBinding(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.listRv = recyclerView2;
    }

    @NonNull
    public static WidgetCertificatesBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new WidgetCertificatesBinding(recyclerView, recyclerView);
    }

    @Override // X4.a
    @NonNull
    public RecyclerView getRoot() {
        return this.rootView;
    }
}
