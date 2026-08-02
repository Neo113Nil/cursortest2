package ru.ozon.app.android.fresh.checkout.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.fresh.checkout.R$id;
import ru.ozon.app.android.fresh.checkout.R$layout;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes12.dex */
public final class ViewCheckoutCellListBinding implements a {

    @NonNull
    public final CellView cellView;

    @NonNull
    public final VerticalAtomsLayout cellsVAL;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final FrameLayout singleCellFL;

    private ViewCheckoutCellListBinding(@NonNull FrameLayout frameLayout, @NonNull CellView cellView, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.cellView = cellView;
        this.cellsVAL = verticalAtomsLayout;
        this.singleCellFL = frameLayout2;
    }

    @NonNull
    public static ViewCheckoutCellListBinding bind(@NonNull View view) {
        int i11 = R$id.cellView;
        CellView cellView = (CellView) C2548q.d(i11, view);
        if (cellView != null) {
            i11 = R$id.cellsVAL;
            VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
            if (verticalAtomsLayout != null) {
                i11 = R$id.singleCellFL;
                FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
                if (frameLayout != null) {
                    return new ViewCheckoutCellListBinding((FrameLayout) view, cellView, verticalAtomsLayout, frameLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewCheckoutCellListBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.view_checkout_cell_list, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public FrameLayout getConstraintLayout() {
        return this.rootView;
    }
}
