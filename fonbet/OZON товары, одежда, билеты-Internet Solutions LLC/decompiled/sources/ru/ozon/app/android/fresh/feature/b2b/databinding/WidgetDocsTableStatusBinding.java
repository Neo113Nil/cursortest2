package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes12.dex */
public final class WidgetDocsTableStatusBinding implements a {

    @NonNull
    public final Layer clickableAreaF;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View status;

    @NonNull
    public final IconView statusIcon;

    @NonNull
    public final TextAtomV2View statusTitle;

    private WidgetDocsTableStatusBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Layer layer, @NonNull TextAtomV2View textAtomV2View, @NonNull IconView iconView, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = constraintLayout;
        this.clickableAreaF = layer;
        this.status = textAtomV2View;
        this.statusIcon = iconView;
        this.statusTitle = textAtomV2View2;
    }

    @NonNull
    public static WidgetDocsTableStatusBinding bind(@NonNull View view) {
        int i11 = R$id.clickableAreaF;
        Layer layer = (Layer) C2548q.d(i11, view);
        if (layer != null) {
            i11 = R$id.status;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                i11 = R$id.statusIcon;
                IconView iconView = (IconView) C2548q.d(i11, view);
                if (iconView != null) {
                    i11 = R$id.statusTitle;
                    TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View2 != null) {
                        return new WidgetDocsTableStatusBinding((ConstraintLayout) view, layer, textAtomV2View, iconView, textAtomV2View2);
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
