package ru.ozon.app.android.search.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.search.R$id;

/* loaded from: classes13.dex */
public final class WidgetFullTextSearchHeaderBinding implements a {

    @NonNull
    public final RecyclerView crosslinksRv;

    @NonNull
    public final TextView headerTv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final AppCompatImageButton shareBtn;

    @NonNull
    public final ConstraintLayout widgetFullTextSearchHeader;

    private WidgetFullTextSearchHeaderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull AppCompatImageButton appCompatImageButton, @NonNull ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.crosslinksRv = recyclerView;
        this.headerTv = textView;
        this.shareBtn = appCompatImageButton;
        this.widgetFullTextSearchHeader = constraintLayout2;
    }

    @NonNull
    public static WidgetFullTextSearchHeaderBinding bind(@NonNull View view) {
        int i11 = R$id.crosslinksRv;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.headerTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.shareBtn;
                AppCompatImageButton appCompatImageButton = (AppCompatImageButton) C2548q.d(i11, view);
                if (appCompatImageButton != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    return new WidgetFullTextSearchHeaderBinding(constraintLayout, recyclerView, textView, appCompatImageButton, constraintLayout);
                }
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
