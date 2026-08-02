package ru.ozon.app.android.pdpoldwidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.pdpoldwidgets.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes13.dex */
public final class WidgetNamedValueListHeaderBinding implements a {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final VerticalAtomsLayout subtitlesVal;

    @NonNull
    public final TextAtomV2View titleTav;

    private WidgetNamedValueListHeaderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = constraintLayout;
        this.subtitlesVal = verticalAtomsLayout;
        this.titleTav = textAtomV2View;
    }

    @NonNull
    public static WidgetNamedValueListHeaderBinding bind(@NonNull View view) {
        int i11 = R$id.subtitlesVal;
        VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
        if (verticalAtomsLayout != null) {
            i11 = R$id.titleTav;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                return new WidgetNamedValueListHeaderBinding((ConstraintLayout) view, verticalAtomsLayout, textAtomV2View);
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
