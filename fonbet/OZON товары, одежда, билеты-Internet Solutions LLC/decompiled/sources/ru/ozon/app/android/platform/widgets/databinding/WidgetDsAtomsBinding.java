package ru.ozon.app.android.platform.widgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.platform.widgets.R$id;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

/* loaded from: classes13.dex */
public final class WidgetDsAtomsBinding implements a {

    @NonNull
    public final FrameLayout atomContainer;

    @NonNull
    public final SingleAtom dsAtom;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ConstraintLayout widgetContainer;

    private WidgetDsAtomsBinding(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull SingleAtom singleAtom, @NonNull ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.atomContainer = frameLayout;
        this.dsAtom = singleAtom;
        this.widgetContainer = constraintLayout2;
    }

    @NonNull
    public static WidgetDsAtomsBinding bind(@NonNull View view) {
        int i11 = R$id.atomContainer;
        FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
        if (frameLayout != null) {
            i11 = R$id.dsAtom;
            SingleAtom singleAtom = (SingleAtom) C2548q.d(i11, view);
            if (singleAtom != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                return new WidgetDsAtomsBinding(constraintLayout, frameLayout, singleAtom, constraintLayout);
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
