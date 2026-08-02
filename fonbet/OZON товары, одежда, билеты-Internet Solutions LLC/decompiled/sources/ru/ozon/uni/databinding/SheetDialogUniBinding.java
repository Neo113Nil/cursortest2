package ru.ozon.uni.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ru.ozon.uni.R$id;
import ru.ozon.uni.R$layout;

/* loaded from: classes8.dex */
public final class SheetDialogUniBinding implements a {

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final CoordinatorLayout coordinator;

    @NonNull
    public final ConstraintLayout designBottomSheet;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final View touchOutside;

    private SheetDialogUniBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull CoordinatorLayout coordinatorLayout, @NonNull ConstraintLayout constraintLayout, @NonNull View view) {
        this.rootView = frameLayout;
        this.container = frameLayout2;
        this.coordinator = coordinatorLayout;
        this.designBottomSheet = constraintLayout;
        this.touchOutside = view;
    }

    @NonNull
    public static SheetDialogUniBinding bind(@NonNull View view) {
        View d11;
        FrameLayout frameLayout = (FrameLayout) view;
        int i11 = R$id.coordinator;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) C2548q.d(i11, view);
        if (coordinatorLayout != null) {
            i11 = R$id.design_bottom_sheet;
            ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
            if (constraintLayout != null && (d11 = C2548q.d((i11 = R$id.touch_outside), view)) != null) {
                return new SheetDialogUniBinding(frameLayout, frameLayout, coordinatorLayout, constraintLayout, d11);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static SheetDialogUniBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static SheetDialogUniBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.sheet_dialog_uni, viewGroup, false);
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
