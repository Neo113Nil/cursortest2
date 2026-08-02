package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

/* loaded from: classes12.dex */
public final class WidgetAddEdoV2ButtonBinding implements a {

    @NonNull
    public final ButtonV3View addEdoAdditionalBtn;

    @NonNull
    public final ButtonV3View addEdoBtn;

    @NonNull
    public final TextAtomV2View addEdoDescriptionTv;

    @NonNull
    private final LinearLayout rootView;

    private WidgetAddEdoV2ButtonBinding(@NonNull LinearLayout linearLayout, @NonNull ButtonV3View buttonV3View, @NonNull ButtonV3View buttonV3View2, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = linearLayout;
        this.addEdoAdditionalBtn = buttonV3View;
        this.addEdoBtn = buttonV3View2;
        this.addEdoDescriptionTv = textAtomV2View;
    }

    @NonNull
    public static WidgetAddEdoV2ButtonBinding bind(@NonNull View view) {
        int i11 = R$id.addEdoAdditionalBtn;
        ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
        if (buttonV3View != null) {
            i11 = R$id.addEdoBtn;
            ButtonV3View buttonV3View2 = (ButtonV3View) C2548q.d(i11, view);
            if (buttonV3View2 != null) {
                i11 = R$id.addEdoDescriptionTv;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    return new WidgetAddEdoV2ButtonBinding((LinearLayout) view, buttonV3View, buttonV3View2, textAtomV2View);
                }
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
