package ru.ozon.app.android.fresh.unsorted.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;

/* loaded from: classes12.dex */
public final class LayoutBotConfirmButtonBinding implements a {

    @NonNull
    public final LargeButtonView confirmBv;

    @NonNull
    private final ConstraintLayout rootView;

    private LayoutBotConfirmButtonBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LargeButtonView largeButtonView) {
        this.rootView = constraintLayout;
        this.confirmBv = largeButtonView;
    }

    @NonNull
    public static LayoutBotConfirmButtonBinding bind(@NonNull View view) {
        int i11 = R$id.confirmBv;
        LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
        if (largeButtonView != null) {
            return new LayoutBotConfirmButtonBinding((ConstraintLayout) view, largeButtonView);
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
