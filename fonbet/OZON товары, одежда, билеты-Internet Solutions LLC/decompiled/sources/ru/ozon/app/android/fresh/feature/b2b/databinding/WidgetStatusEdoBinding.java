package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes12.dex */
public final class WidgetStatusEdoBinding implements a {

    @NonNull
    public final BadgeView badge;

    @NonNull
    public final Layer clickableArea;

    @NonNull
    public final IconButtonV3View closeButton;

    @NonNull
    public final ImageView image;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomV2View title;

    private WidgetStatusEdoBinding(@NonNull ConstraintLayout constraintLayout, @NonNull BadgeView badgeView, @NonNull Layer layer, @NonNull IconButtonV3View iconButtonV3View, @NonNull ImageView imageView, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = constraintLayout;
        this.badge = badgeView;
        this.clickableArea = layer;
        this.closeButton = iconButtonV3View;
        this.image = imageView;
        this.title = textAtomV2View;
    }

    @NonNull
    public static WidgetStatusEdoBinding bind(@NonNull View view) {
        int i11 = R$id.badge;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            i11 = R$id.clickableArea;
            Layer layer = (Layer) C2548q.d(i11, view);
            if (layer != null) {
                i11 = R$id.closeButton;
                IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
                if (iconButtonV3View != null) {
                    i11 = R$id.image;
                    ImageView imageView = (ImageView) C2548q.d(i11, view);
                    if (imageView != null) {
                        i11 = R$id.title;
                        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View != null) {
                            return new WidgetStatusEdoBinding((ConstraintLayout) view, badgeView, layer, iconButtonV3View, imageView, textAtomV2View);
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
