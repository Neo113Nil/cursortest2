package ru.ozon.app.android.common.ui.taglist.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public final class WidgetScrollingTagListBinding implements a {

    @NonNull
    private final RecyclerView rootView;

    @NonNull
    public final RecyclerView tagListRv;

    private WidgetScrollingTagListBinding(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.tagListRv = recyclerView2;
    }

    @NonNull
    public static WidgetScrollingTagListBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new WidgetScrollingTagListBinding(recyclerView, recyclerView);
    }

    @Override // X4.a
    @NonNull
    public RecyclerView getRoot() {
        return this.rootView;
    }
}
