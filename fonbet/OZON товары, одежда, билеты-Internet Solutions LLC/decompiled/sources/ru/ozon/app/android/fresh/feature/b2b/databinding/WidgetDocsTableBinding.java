package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class WidgetDocsTableBinding implements a {

    @NonNull
    public final TextAtomV2View listTitle;

    @NonNull
    public final RecyclerView recyclerView;

    @NonNull
    private final LinearLayout rootView;

    private WidgetDocsTableBinding(@NonNull LinearLayout linearLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.listTitle = textAtomV2View;
        this.recyclerView = recyclerView;
    }

    @NonNull
    public static WidgetDocsTableBinding bind(@NonNull View view) {
        int i11 = R$id.listTitle;
        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
        if (textAtomV2View != null) {
            i11 = R$id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                return new WidgetDocsTableBinding((LinearLayout) view, textAtomV2View, recyclerView);
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
