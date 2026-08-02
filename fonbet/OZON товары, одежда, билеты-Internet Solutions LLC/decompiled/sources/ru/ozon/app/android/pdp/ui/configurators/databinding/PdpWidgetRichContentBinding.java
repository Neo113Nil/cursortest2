package ru.ozon.app.android.pdp.ui.configurators.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes13.dex */
public final class PdpWidgetRichContentBinding implements a {

    @NonNull
    public final ImageView pdpRichContentExpandIv;

    @NonNull
    public final Layer pdpRichContentExpandLayer;

    @NonNull
    public final Space pdpRichContentExpandRightAnchor;

    @NonNull
    public final TextAtomV2View pdpRichContentExpandTav;

    @NonNull
    public final Space pdpRichContentGradientAnchor;

    @NonNull
    public final View pdpRichContentGradientV;

    @NonNull
    public final RecyclerView pdpRichContentRv;

    @NonNull
    private final ConstraintLayout rootView;

    private PdpWidgetRichContentBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull Layer layer, @NonNull Space space, @NonNull TextAtomV2View textAtomV2View, @NonNull Space space2, @NonNull View view, @NonNull RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.pdpRichContentExpandIv = imageView;
        this.pdpRichContentExpandLayer = layer;
        this.pdpRichContentExpandRightAnchor = space;
        this.pdpRichContentExpandTav = textAtomV2View;
        this.pdpRichContentGradientAnchor = space2;
        this.pdpRichContentGradientV = view;
        this.pdpRichContentRv = recyclerView;
    }

    @NonNull
    public static PdpWidgetRichContentBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.pdpRichContentExpandIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.pdpRichContentExpandLayer;
            Layer layer = (Layer) C2548q.d(i11, view);
            if (layer != null) {
                i11 = R$id.pdpRichContentExpandRightAnchor;
                Space space = (Space) C2548q.d(i11, view);
                if (space != null) {
                    i11 = R$id.pdpRichContentExpandTav;
                    TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                    if (textAtomV2View != null) {
                        i11 = R$id.pdpRichContentGradientAnchor;
                        Space space2 = (Space) C2548q.d(i11, view);
                        if (space2 != null && (d11 = C2548q.d((i11 = R$id.pdpRichContentGradientV), view)) != null) {
                            i11 = R$id.pdpRichContentRv;
                            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                            if (recyclerView != null) {
                                return new PdpWidgetRichContentBinding((ConstraintLayout) view, imageView, layer, space, textAtomV2View, space2, d11, recyclerView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
