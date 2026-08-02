package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.HorizontalScrollView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.fresh.feature.b2b.R$id;

/* loaded from: classes12.dex */
public final class WidgetFaqBinding implements a {

    @NonNull
    public final RecyclerView recyclerView;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final HorizontalAtomsLayout tabs;

    @NonNull
    public final HorizontalScrollView tabsHSV;

    private WidgetFaqBinding(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull HorizontalAtomsLayout horizontalAtomsLayout, @NonNull HorizontalScrollView horizontalScrollView) {
        this.rootView = constraintLayout;
        this.recyclerView = recyclerView;
        this.tabs = horizontalAtomsLayout;
        this.tabsHSV = horizontalScrollView;
    }

    @NonNull
    public static WidgetFaqBinding bind(@NonNull View view) {
        int i11 = R$id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.tabs;
            HorizontalAtomsLayout horizontalAtomsLayout = (HorizontalAtomsLayout) C2548q.d(i11, view);
            if (horizontalAtomsLayout != null) {
                i11 = R$id.tabsHSV;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) C2548q.d(i11, view);
                if (horizontalScrollView != null) {
                    return new WidgetFaqBinding((ConstraintLayout) view, recyclerView, horizontalAtomsLayout, horizontalScrollView);
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
