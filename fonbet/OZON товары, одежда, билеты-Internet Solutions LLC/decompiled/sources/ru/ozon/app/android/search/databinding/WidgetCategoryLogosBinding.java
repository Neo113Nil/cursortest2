package ru.ozon.app.android.search.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.search.R$id;

/* loaded from: classes13.dex */
public final class WidgetCategoryLogosBinding implements a {

    @NonNull
    public final FrameLayout categoryLogosFl;

    @NonNull
    public final RecyclerView rV;

    @NonNull
    private final FrameLayout rootView;

    private WidgetCategoryLogosBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull RecyclerView recyclerView) {
        this.rootView = frameLayout;
        this.categoryLogosFl = frameLayout2;
        this.rV = recyclerView;
    }

    @NonNull
    public static WidgetCategoryLogosBinding bind(@NonNull View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i11 = R$id.rV;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            return new WidgetCategoryLogosBinding(frameLayout, frameLayout, recyclerView);
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
