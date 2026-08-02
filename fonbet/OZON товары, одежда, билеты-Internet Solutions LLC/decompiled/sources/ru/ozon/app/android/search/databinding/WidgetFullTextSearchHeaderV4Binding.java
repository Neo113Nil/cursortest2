package ru.ozon.app.android.search.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.search.R$id;

/* loaded from: classes13.dex */
public final class WidgetFullTextSearchHeaderV4Binding implements a {

    @NonNull
    public final RecyclerView crosslinksRv;

    @NonNull
    public final AppCompatTextView headerTv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ConstraintLayout widgetFullTextSearchHeader;

    private WidgetFullTextSearchHeaderV4Binding(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull AppCompatTextView appCompatTextView, @NonNull ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.crosslinksRv = recyclerView;
        this.headerTv = appCompatTextView;
        this.widgetFullTextSearchHeader = constraintLayout2;
    }

    @NonNull
    public static WidgetFullTextSearchHeaderV4Binding bind(@NonNull View view) {
        int i11 = R$id.crosslinksRv;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.headerTv;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
            if (appCompatTextView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                return new WidgetFullTextSearchHeaderV4Binding(constraintLayout, recyclerView, appCompatTextView, constraintLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
