package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes13.dex */
public final class PdpWidgetCharacteristicsBinding implements a {

    @NonNull
    public final RecyclerView characteristicsRv;

    @NonNull
    public final Layer pdpTextDescriptionExpandLayer;

    @NonNull
    public final Space pdpTextDescriptionExpandLeftAnchor;

    @NonNull
    public final TextAtomV2View pdpTextDescriptionExpandTav;

    @NonNull
    public final View pdpTextDescriptionGradientV;

    @NonNull
    public final ConstraintLayout rootCl;

    @NonNull
    private final ConstraintLayout rootView;

    private PdpWidgetCharacteristicsBinding(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull Layer layer, @NonNull Space space, @NonNull TextAtomV2View textAtomV2View, @NonNull View view, @NonNull ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.characteristicsRv = recyclerView;
        this.pdpTextDescriptionExpandLayer = layer;
        this.pdpTextDescriptionExpandLeftAnchor = space;
        this.pdpTextDescriptionExpandTav = textAtomV2View;
        this.pdpTextDescriptionGradientV = view;
        this.rootCl = constraintLayout2;
    }

    @NonNull
    public static PdpWidgetCharacteristicsBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.characteristicsRv;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.pdpTextDescriptionExpandLayer;
            Layer layer = (Layer) C2548q.d(i11, view);
            if (layer != null) {
                i11 = R$id.pdpTextDescriptionExpandLeftAnchor;
                Space space = (Space) C2548q.d(i11, view);
                if (space != null) {
                    i11 = R$id.pdpTextDescriptionExpandTav;
                    TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View != null && (d11 = C2548q.d((i11 = R$id.pdpTextDescriptionGradientV), view)) != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        return new PdpWidgetCharacteristicsBinding(constraintLayout, recyclerView, layer, space, textAtomV2View, d11, constraintLayout);
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
