package ru.ozon.app.android.search.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.search.R$id;
import ru.ozon.uni.android.cell.label.TitleSubtitleCellView;

/* loaded from: classes13.dex */
public final class SuggestFilterItemsBinding implements a {

    @NonNull
    public final TitleSubtitleCellView cellView;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final RecyclerView valuesRv;

    private SuggestFilterItemsBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TitleSubtitleCellView titleSubtitleCellView, @NonNull RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.cellView = titleSubtitleCellView;
        this.valuesRv = recyclerView;
    }

    @NonNull
    public static SuggestFilterItemsBinding bind(@NonNull View view) {
        int i11 = R$id.cellView;
        TitleSubtitleCellView titleSubtitleCellView = (TitleSubtitleCellView) C2548q.d(i11, view);
        if (titleSubtitleCellView != null) {
            i11 = R$id.valuesRv;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                return new SuggestFilterItemsBinding((ConstraintLayout) view, titleSubtitleCellView, recyclerView);
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
