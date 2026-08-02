package ru.ozon.app.android.cs_orders.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.cs_orders.R$id;
import ru.ozon.app.android.cs_orders.R$layout;

/* loaded from: classes11.dex */
public final class ItemAnnotationBinding implements a {

    @NonNull
    public final DisclaimerContainer annotationV;

    @NonNull
    private final FrameLayout rootView;

    private ItemAnnotationBinding(@NonNull FrameLayout frameLayout, @NonNull DisclaimerContainer disclaimerContainer) {
        this.rootView = frameLayout;
        this.annotationV = disclaimerContainer;
    }

    @NonNull
    public static ItemAnnotationBinding bind(@NonNull View view) {
        int i11 = R$id.annotationV;
        DisclaimerContainer disclaimerContainer = (DisclaimerContainer) C2548q.d(i11, view);
        if (disclaimerContainer != null) {
            return new ItemAnnotationBinding((FrameLayout) view, disclaimerContainer);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemAnnotationBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_annotation, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
