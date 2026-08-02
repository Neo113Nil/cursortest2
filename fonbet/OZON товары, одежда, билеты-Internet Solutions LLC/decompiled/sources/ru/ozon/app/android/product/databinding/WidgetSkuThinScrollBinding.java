package ru.ozon.app.android.product.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.product.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes13.dex */
public final class WidgetSkuThinScrollBinding implements a {

    @NonNull
    public final TextAtomV2View headerTav;

    @NonNull
    public final RecyclerView itemsRv;

    @NonNull
    private final LinearLayout rootView;

    private WidgetSkuThinScrollBinding(@NonNull LinearLayout linearLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.headerTav = textAtomV2View;
        this.itemsRv = recyclerView;
    }

    @NonNull
    public static WidgetSkuThinScrollBinding bind(@NonNull View view) {
        int i11 = R$id.headerTav;
        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
        if (textAtomV2View != null) {
            i11 = R$id.itemsRv;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                return new WidgetSkuThinScrollBinding((LinearLayout) view, textAtomV2View, recyclerView);
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
