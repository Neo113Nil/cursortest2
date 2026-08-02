package ru.ozon.app.android.courieronmap.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.card.MaterialCardView;
import ru.ozon.app.android.courieronmap.R$id;

/* loaded from: classes11.dex */
public final class BottomSheetCourierOnMapBinding implements a {

    @NonNull
    public final FrameLayout bottomSheetContainer;

    @NonNull
    private final MaterialCardView rootView;

    private BottomSheetCourierOnMapBinding(@NonNull MaterialCardView materialCardView, @NonNull FrameLayout frameLayout) {
        this.rootView = materialCardView;
        this.bottomSheetContainer = frameLayout;
    }

    @NonNull
    public static BottomSheetCourierOnMapBinding bind(@NonNull View view) {
        int i11 = R$id.bottomSheetContainer;
        FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
        if (frameLayout != null) {
            return new BottomSheetCourierOnMapBinding((MaterialCardView) view, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public MaterialCardView getRoot() {
        return this.rootView;
    }
}
