package ru.ozon.fintech.ui.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class FintechBottomSheetContainerBinding implements a {

    @NonNull
    public final View baseBottomSheetDragger;

    @NonNull
    public final LinearLayout bottomSheetContainer;

    @NonNull
    public final FrameLayout bottomSheetContentContainer;

    @NonNull
    private final LinearLayout rootView;

    private FintechBottomSheetContainerBinding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull LinearLayout linearLayout2, @NonNull FrameLayout frameLayout) {
        this.rootView = linearLayout;
        this.baseBottomSheetDragger = view;
        this.bottomSheetContainer = linearLayout2;
        this.bottomSheetContentContainer = frameLayout;
    }

    @NonNull
    public static FintechBottomSheetContainerBinding bind(@NonNull View view) {
        int i11 = R.id.base_bottom_sheet_dragger;
        View d11 = C2548q.d(R.id.base_bottom_sheet_dragger, view);
        if (d11 != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            FrameLayout frameLayout = (FrameLayout) C2548q.d(R.id.bottom_sheet_content_container, view);
            if (frameLayout != null) {
                return new FintechBottomSheetContainerBinding(linearLayout, d11, linearLayout, frameLayout);
            }
            i11 = R.id.bottom_sheet_content_container;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FintechBottomSheetContainerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FintechBottomSheetContainerBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.fintech_bottom_sheet_container, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
