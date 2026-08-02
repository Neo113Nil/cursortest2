package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.disclosure.disclosureTitleSubtitleCell.DisclosureTitleSubtitleCellView;

/* loaded from: classes12.dex */
public final class WidgetEdoProvidersBinding implements a {

    @NonNull
    public final DisclosureTitleSubtitleCellView cellButton;

    @NonNull
    public final RecyclerView recyclerView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextAtomV2View title;

    private WidgetEdoProvidersBinding(@NonNull LinearLayout linearLayout, @NonNull DisclosureTitleSubtitleCellView disclosureTitleSubtitleCellView, @NonNull RecyclerView recyclerView, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = linearLayout;
        this.cellButton = disclosureTitleSubtitleCellView;
        this.recyclerView = recyclerView;
        this.title = textAtomV2View;
    }

    @NonNull
    public static WidgetEdoProvidersBinding bind(@NonNull View view) {
        int i11 = R$id.cellButton;
        DisclosureTitleSubtitleCellView disclosureTitleSubtitleCellView = (DisclosureTitleSubtitleCellView) C2548q.d(i11, view);
        if (disclosureTitleSubtitleCellView != null) {
            i11 = R$id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                i11 = R$id.title;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    return new WidgetEdoProvidersBinding((LinearLayout) view, disclosureTitleSubtitleCellView, recyclerView, textAtomV2View);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
