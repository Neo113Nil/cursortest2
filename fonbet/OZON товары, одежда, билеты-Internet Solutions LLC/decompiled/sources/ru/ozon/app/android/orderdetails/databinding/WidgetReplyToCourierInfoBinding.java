package ru.ozon.app.android.orderdetails.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.atoms.af.layout.FrameAtomsLayout;
import ru.ozon.app.android.orderdetails.R$id;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes13.dex */
public final class WidgetReplyToCourierInfoBinding implements a {

    @NonNull
    public final FrameAtomsLayout descriptionAtoms;

    @NonNull
    public final VerticalAtomsLayout headerAtoms;

    @NonNull
    private final LinearLayout rootView;

    private WidgetReplyToCourierInfoBinding(@NonNull LinearLayout linearLayout, @NonNull FrameAtomsLayout frameAtomsLayout, @NonNull VerticalAtomsLayout verticalAtomsLayout) {
        this.rootView = linearLayout;
        this.descriptionAtoms = frameAtomsLayout;
        this.headerAtoms = verticalAtomsLayout;
    }

    @NonNull
    public static WidgetReplyToCourierInfoBinding bind(@NonNull View view) {
        int i11 = R$id.descriptionAtoms;
        FrameAtomsLayout frameAtomsLayout = (FrameAtomsLayout) C2548q.d(i11, view);
        if (frameAtomsLayout != null) {
            i11 = R$id.headerAtoms;
            VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
            if (verticalAtomsLayout != null) {
                return new WidgetReplyToCourierInfoBinding((LinearLayout) view, frameAtomsLayout, verticalAtomsLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
