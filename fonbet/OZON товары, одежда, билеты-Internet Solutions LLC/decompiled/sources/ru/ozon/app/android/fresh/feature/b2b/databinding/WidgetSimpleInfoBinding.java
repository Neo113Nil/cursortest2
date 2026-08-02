package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.fresh.feature.b2b.R$id;

/* loaded from: classes12.dex */
public final class WidgetSimpleInfoBinding implements a {

    @NonNull
    public final RecyclerView itemsRV;

    @NonNull
    private final FrameLayout rootView;

    private WidgetSimpleInfoBinding(@NonNull FrameLayout frameLayout, @NonNull RecyclerView recyclerView) {
        this.rootView = frameLayout;
        this.itemsRV = recyclerView;
    }

    @NonNull
    public static WidgetSimpleInfoBinding bind(@NonNull View view) {
        int i11 = R$id.itemsRV;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            return new WidgetSimpleInfoBinding((FrameLayout) view, recyclerView);
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
