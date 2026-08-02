package ru.ozon.app.android.returns.creation.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.returns.creation.R$id;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

/* loaded from: classes13.dex */
public final class ReturnCreationPaginationBinding implements a {

    @NonNull
    public final ButtonV3View nextPageSbv;

    @NonNull
    public final ButtonV3View previousPageSbv;

    @NonNull
    private final ConstraintLayout rootView;

    private ReturnCreationPaginationBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ButtonV3View buttonV3View, @NonNull ButtonV3View buttonV3View2) {
        this.rootView = constraintLayout;
        this.nextPageSbv = buttonV3View;
        this.previousPageSbv = buttonV3View2;
    }

    @NonNull
    public static ReturnCreationPaginationBinding bind(@NonNull View view) {
        int i11 = R$id.nextPageSbv;
        ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
        if (buttonV3View != null) {
            i11 = R$id.previousPageSbv;
            ButtonV3View buttonV3View2 = (ButtonV3View) C2548q.d(i11, view);
            if (buttonV3View2 != null) {
                return new ReturnCreationPaginationBinding((ConstraintLayout) view, buttonV3View, buttonV3View2);
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
