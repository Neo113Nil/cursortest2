package ru.ozon.app.android.pdp.ui.configurators.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes13.dex */
public final class PdpSelectWidgetTextDescriptionBinding implements a {

    @NonNull
    public final TextAtomV2View pdpTextDescriptionContentTav;

    @NonNull
    public final ImageView pdpTextDescriptionExpandIv;

    @NonNull
    public final Layer pdpTextDescriptionExpandLayer;

    @NonNull
    public final Space pdpTextDescriptionExpandRightAnchor;

    @NonNull
    public final TextAtomV2View pdpTextDescriptionExpandTav;

    @NonNull
    public final View pdpTextDescriptionGradientV;

    @NonNull
    private final ConstraintLayout rootView;

    private PdpSelectWidgetTextDescriptionBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull ImageView imageView, @NonNull Layer layer, @NonNull Space space, @NonNull TextAtomV2View textAtomV2View2, @NonNull View view) {
        this.rootView = constraintLayout;
        this.pdpTextDescriptionContentTav = textAtomV2View;
        this.pdpTextDescriptionExpandIv = imageView;
        this.pdpTextDescriptionExpandLayer = layer;
        this.pdpTextDescriptionExpandRightAnchor = space;
        this.pdpTextDescriptionExpandTav = textAtomV2View2;
        this.pdpTextDescriptionGradientV = view;
    }

    @NonNull
    public static PdpSelectWidgetTextDescriptionBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.pdpTextDescriptionContentTav;
        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
        if (textAtomV2View != null) {
            i11 = R$id.pdpTextDescriptionExpandIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.pdpTextDescriptionExpandLayer;
                Layer layer = (Layer) C2548q.d(i11, view);
                if (layer != null) {
                    i11 = R$id.pdpTextDescriptionExpandRightAnchor;
                    Space space = (Space) C2548q.d(i11, view);
                    if (space != null) {
                        i11 = R$id.pdpTextDescriptionExpandTav;
                        TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View2 != null && (d11 = C2548q.d((i11 = R$id.pdpTextDescriptionGradientV), view)) != null) {
                            return new PdpSelectWidgetTextDescriptionBinding((ConstraintLayout) view, textAtomV2View, imageView, layer, space, textAtomV2View2, d11);
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
