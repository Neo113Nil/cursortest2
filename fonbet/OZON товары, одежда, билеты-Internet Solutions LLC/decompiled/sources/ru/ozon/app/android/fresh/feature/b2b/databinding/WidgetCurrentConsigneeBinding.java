package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes12.dex */
public final class WidgetCurrentConsigneeBinding implements a {

    @NonNull
    public final ButtonV3View button;

    @NonNull
    public final IconButtonV3View iconButton;

    @NonNull
    public final TextAtomV2View name;

    @NonNull
    public final TextAtomV2View requisites;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View title;

    private WidgetCurrentConsigneeBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ButtonV3View buttonV3View, @NonNull IconButtonV3View iconButtonV3View, @NonNull TextAtomV2View textAtomV2View, @NonNull TextAtomV2View textAtomV2View2, @NonNull TextAtomV2View textAtomV2View3) {
        this.rootView = constraintLayout;
        this.button = buttonV3View;
        this.iconButton = iconButtonV3View;
        this.name = textAtomV2View;
        this.requisites = textAtomV2View2;
        this.title = textAtomV2View3;
    }

    @NonNull
    public static WidgetCurrentConsigneeBinding bind(@NonNull View view) {
        int i11 = R$id.button;
        ButtonV3View buttonV3View = (ButtonV3View) C2548q.d(i11, view);
        if (buttonV3View != null) {
            i11 = R$id.iconButton;
            IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
            if (iconButtonV3View != null) {
                i11 = R$id.name;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    i11 = R$id.requisites;
                    TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View2 != null) {
                        i11 = R$id.title;
                        TextAtomV2View textAtomV2View3 = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View3 != null) {
                            return new WidgetCurrentConsigneeBinding((ConstraintLayout) view, buttonV3View, iconButtonV3View, textAtomV2View, textAtomV2View2, textAtomV2View3);
                        }
                    }
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
