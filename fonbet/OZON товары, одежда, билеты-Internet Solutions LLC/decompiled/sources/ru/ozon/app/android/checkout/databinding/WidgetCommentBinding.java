package ru.ozon.app.android.checkout.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.atoms.af.layout.FrameAtomsLayout;
import ru.ozon.app.android.atoms.atom2.ButtonAtom;
import ru.ozon.app.android.checkout.R$id;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes11.dex */
public final class WidgetCommentBinding implements a {

    @NonNull
    public final ButtonAtom buttonAtom;

    @NonNull
    public final FrameAtomsLayout inputFAL;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final VerticalAtomsLayout titleVAL;

    private WidgetCommentBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ButtonAtom buttonAtom, @NonNull FrameAtomsLayout frameAtomsLayout, @NonNull VerticalAtomsLayout verticalAtomsLayout) {
        this.rootView = constraintLayout;
        this.buttonAtom = buttonAtom;
        this.inputFAL = frameAtomsLayout;
        this.titleVAL = verticalAtomsLayout;
    }

    @NonNull
    public static WidgetCommentBinding bind(@NonNull View view) {
        int i11 = R$id.buttonAtom;
        ButtonAtom buttonAtom = (ButtonAtom) C2548q.d(i11, view);
        if (buttonAtom != null) {
            i11 = R$id.inputFAL;
            FrameAtomsLayout frameAtomsLayout = (FrameAtomsLayout) C2548q.d(i11, view);
            if (frameAtomsLayout != null) {
                i11 = R$id.titleVAL;
                VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
                if (verticalAtomsLayout != null) {
                    return new WidgetCommentBinding((ConstraintLayout) view, buttonAtom, frameAtomsLayout, verticalAtomsLayout);
                }
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
