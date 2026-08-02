package ru.ozon.app.android.search.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.search.R$id;

/* loaded from: classes13.dex */
public final class WidgetCategoryMenuBinding implements a {

    @NonNull
    public final ConstraintLayout containerCl;

    @NonNull
    public final View divider;

    @NonNull
    public final TextView nameTv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final View selectedV;

    private WidgetCategoryMenuBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull View view, @NonNull TextView textView, @NonNull View view2) {
        this.rootView = constraintLayout;
        this.containerCl = constraintLayout2;
        this.divider = view;
        this.nameTv = textView;
        this.selectedV = view2;
    }

    @NonNull
    public static WidgetCategoryMenuBinding bind(@NonNull View view) {
        View d11;
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.divider;
        View d12 = C2548q.d(i11, view);
        if (d12 != null) {
            i11 = R$id.nameTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null && (d11 = C2548q.d((i11 = R$id.selectedV), view)) != null) {
                return new WidgetCategoryMenuBinding(constraintLayout, constraintLayout, d12, textView, d11);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
