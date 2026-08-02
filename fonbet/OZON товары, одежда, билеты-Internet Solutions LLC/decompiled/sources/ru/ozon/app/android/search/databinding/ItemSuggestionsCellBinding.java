package ru.ozon.app.android.search.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.search.R$id;
import ru.ozon.uni.android.cell.CellView;

/* loaded from: classes13.dex */
public final class ItemSuggestionsCellBinding implements a {

    @NonNull
    public final CellView cellView;

    @NonNull
    private final FrameLayout rootView;

    private ItemSuggestionsCellBinding(@NonNull FrameLayout frameLayout, @NonNull CellView cellView) {
        this.rootView = frameLayout;
        this.cellView = cellView;
    }

    @NonNull
    public static ItemSuggestionsCellBinding bind(@NonNull View view) {
        int i11 = R$id.cellView;
        CellView cellView = (CellView) C2548q.d(i11, view);
        if (cellView != null) {
            return new ItemSuggestionsCellBinding((FrameLayout) view, cellView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public FrameLayout getConstraintLayout() {
        return this.rootView;
    }
}
