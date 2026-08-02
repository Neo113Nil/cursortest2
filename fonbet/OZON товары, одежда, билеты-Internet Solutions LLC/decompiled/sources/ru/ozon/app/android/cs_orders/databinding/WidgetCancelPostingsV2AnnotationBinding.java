package ru.ozon.app.android.cs_orders.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.cs_orders.R$id;

/* loaded from: classes11.dex */
public final class WidgetCancelPostingsV2AnnotationBinding implements a {

    @NonNull
    public final DisclaimerContainer annotationV;

    @NonNull
    private final FrameLayout rootView;

    private WidgetCancelPostingsV2AnnotationBinding(@NonNull FrameLayout frameLayout, @NonNull DisclaimerContainer disclaimerContainer) {
        this.rootView = frameLayout;
        this.annotationV = disclaimerContainer;
    }

    @NonNull
    public static WidgetCancelPostingsV2AnnotationBinding bind(@NonNull View view) {
        int i11 = R$id.annotationV;
        DisclaimerContainer disclaimerContainer = (DisclaimerContainer) C2548q.d(i11, view);
        if (disclaimerContainer != null) {
            return new WidgetCancelPostingsV2AnnotationBinding((FrameLayout) view, disclaimerContainer);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
