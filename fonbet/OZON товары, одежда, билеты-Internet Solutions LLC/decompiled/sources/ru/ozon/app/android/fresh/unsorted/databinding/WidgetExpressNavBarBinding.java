package ru.ozon.app.android.fresh.unsorted.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.unsorted.R$id;

/* loaded from: classes12.dex */
public final class WidgetExpressNavBarBinding implements a {

    @NonNull
    public final LinearLayout defaultContainer;

    @NonNull
    public final LinearLayout leftContainer;

    @NonNull
    public final LinearLayout rightContainer;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetExpressNavBarBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3) {
        this.rootView = constraintLayout;
        this.defaultContainer = linearLayout;
        this.leftContainer = linearLayout2;
        this.rightContainer = linearLayout3;
    }

    @NonNull
    public static WidgetExpressNavBarBinding bind(@NonNull View view) {
        int i11 = R$id.defaultContainer;
        LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
        if (linearLayout != null) {
            i11 = R$id.leftContainer;
            LinearLayout linearLayout2 = (LinearLayout) C2548q.d(i11, view);
            if (linearLayout2 != null) {
                i11 = R$id.rightContainer;
                LinearLayout linearLayout3 = (LinearLayout) C2548q.d(i11, view);
                if (linearLayout3 != null) {
                    return new WidgetExpressNavBarBinding((ConstraintLayout) view, linearLayout, linearLayout2, linearLayout3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
