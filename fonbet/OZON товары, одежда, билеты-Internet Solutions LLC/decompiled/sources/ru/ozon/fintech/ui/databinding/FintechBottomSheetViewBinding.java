package ru.ozon.fintech.ui.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class FintechBottomSheetViewBinding implements a {

    @NonNull
    public final FintechBottomSheetContainerBinding bottomSheet;

    @NonNull
    public final View bottomSheetBackground;

    @NonNull
    public final FrameLayout bottomSheetFrame;

    @NonNull
    private final CoordinatorLayout rootView;

    private FintechBottomSheetViewBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FintechBottomSheetContainerBinding fintechBottomSheetContainerBinding, @NonNull View view, @NonNull FrameLayout frameLayout) {
        this.rootView = coordinatorLayout;
        this.bottomSheet = fintechBottomSheetContainerBinding;
        this.bottomSheetBackground = view;
        this.bottomSheetFrame = frameLayout;
    }

    @NonNull
    public static FintechBottomSheetViewBinding bind(@NonNull View view) {
        int i11 = R.id.bottom_sheet;
        View d11 = C2548q.d(R.id.bottom_sheet, view);
        if (d11 != null) {
            FintechBottomSheetContainerBinding bind = FintechBottomSheetContainerBinding.bind(d11);
            int i12 = R.id.bottom_sheet_background;
            View d12 = C2548q.d(R.id.bottom_sheet_background, view);
            if (d12 != null) {
                i12 = R.id.bottom_sheet_frame;
                FrameLayout frameLayout = (FrameLayout) C2548q.d(R.id.bottom_sheet_frame, view);
                if (frameLayout != null) {
                    return new FintechBottomSheetViewBinding((CoordinatorLayout) view, bind, d12, frameLayout);
                }
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FintechBottomSheetViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FintechBottomSheetViewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.fintech_bottom_sheet_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}
