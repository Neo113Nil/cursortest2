package ru.ozon.app.android.atoms.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes11.dex */
public final class AtomCellRadioGroupBinding implements a {

    @NonNull
    public final VerticalAtomsLayout itemsVAL;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView titleTv;

    private AtomCellRadioGroupBinding(@NonNull ConstraintLayout constraintLayout, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.itemsVAL = verticalAtomsLayout;
        this.titleTv = textView;
    }

    @NonNull
    public static AtomCellRadioGroupBinding bind(@NonNull View view) {
        int i11 = R$id.itemsVAL;
        VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
        if (verticalAtomsLayout != null) {
            i11 = R$id.titleTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                return new AtomCellRadioGroupBinding((ConstraintLayout) view, verticalAtomsLayout, textView);
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
