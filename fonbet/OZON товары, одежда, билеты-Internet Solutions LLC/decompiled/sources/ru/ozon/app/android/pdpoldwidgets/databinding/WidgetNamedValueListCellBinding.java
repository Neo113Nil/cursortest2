package ru.ozon.app.android.pdpoldwidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.pdpoldwidgets.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes13.dex */
public final class WidgetNamedValueListCellBinding implements a {

    @NonNull
    public final TextAtomV2View nameTav;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View valueTav;

    private WidgetNamedValueListCellBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = constraintLayout;
        this.nameTav = textAtomV2View;
        this.valueTav = textAtomV2View2;
    }

    @NonNull
    public static WidgetNamedValueListCellBinding bind(@NonNull View view) {
        int i11 = R$id.nameTav;
        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
        if (textAtomV2View != null) {
            i11 = R$id.valueTav;
            TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View2 != null) {
                return new WidgetNamedValueListCellBinding((ConstraintLayout) view, textAtomV2View, textAtomV2View2);
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
