package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes12.dex */
public final class WidgetDocsTableHeaderBinding implements a {

    @NonNull
    public final TextAtomV2View headerDate;

    @NonNull
    public final IconButtonV3View headerIconButton;

    @NonNull
    public final TextAtomV2View headerTitle;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetDocsTableHeaderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull IconButtonV3View iconButtonV3View, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = constraintLayout;
        this.headerDate = textAtomV2View;
        this.headerIconButton = iconButtonV3View;
        this.headerTitle = textAtomV2View2;
    }

    @NonNull
    public static WidgetDocsTableHeaderBinding bind(@NonNull View view) {
        int i11 = R$id.headerDate;
        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
        if (textAtomV2View != null) {
            i11 = R$id.headerIconButton;
            IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
            if (iconButtonV3View != null) {
                i11 = R$id.headerTitle;
                TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View2 != null) {
                    return new WidgetDocsTableHeaderBinding((ConstraintLayout) view, textAtomV2View, iconButtonV3View, textAtomV2View2);
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
