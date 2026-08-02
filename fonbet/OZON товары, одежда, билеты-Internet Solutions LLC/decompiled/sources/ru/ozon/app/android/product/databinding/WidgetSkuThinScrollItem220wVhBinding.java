package ru.ozon.app.android.product.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.product.R$id;
import ru.ozon.app.android.product.R$layout;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes13.dex */
public final class WidgetSkuThinScrollItem220wVhBinding implements a {

    @NonNull
    public final IconButtonV3View buttonIconIbv;

    @NonNull
    public final IconView iconIv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final RecyclerView stateElementsRv;

    @NonNull
    public final View stateElementsView;

    private WidgetSkuThinScrollItem220wVhBinding(@NonNull ConstraintLayout constraintLayout, @NonNull IconButtonV3View iconButtonV3View, @NonNull IconView iconView, @NonNull RecyclerView recyclerView, @NonNull View view) {
        this.rootView = constraintLayout;
        this.buttonIconIbv = iconButtonV3View;
        this.iconIv = iconView;
        this.stateElementsRv = recyclerView;
        this.stateElementsView = view;
    }

    @NonNull
    public static WidgetSkuThinScrollItem220wVhBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.buttonIconIbv;
        IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
        if (iconButtonV3View != null) {
            i11 = R$id.iconIv;
            IconView iconView = (IconView) C2548q.d(i11, view);
            if (iconView != null) {
                i11 = R$id.stateElementsRv;
                RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                if (recyclerView != null && (d11 = C2548q.d((i11 = R$id.stateElementsView), view)) != null) {
                    return new WidgetSkuThinScrollItem220wVhBinding((ConstraintLayout) view, iconButtonV3View, iconView, recyclerView, d11);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetSkuThinScrollItem220wVhBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_sku_thin_scroll_item_220w_vh, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
