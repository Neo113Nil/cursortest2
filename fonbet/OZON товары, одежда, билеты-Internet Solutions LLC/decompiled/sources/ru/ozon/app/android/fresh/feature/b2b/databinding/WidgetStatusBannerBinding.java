package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.feature.b2b.R$id;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes12.dex */
public final class WidgetStatusBannerBinding implements a {

    @NonNull
    public final BadgeView badge;

    @NonNull
    public final Layer clickableArea;

    @NonNull
    public final IconButtonV3View closeButton;

    @NonNull
    public final ConstraintLayout contentContainer;

    @NonNull
    public final TextAtomV2View description;

    @NonNull
    public final Image image;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextAtomV2View title;

    private WidgetStatusBannerBinding(@NonNull FrameLayout frameLayout, @NonNull BadgeView badgeView, @NonNull Layer layer, @NonNull IconButtonV3View iconButtonV3View, @NonNull ConstraintLayout constraintLayout, @NonNull TextAtomV2View textAtomV2View, @NonNull Image image, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = frameLayout;
        this.badge = badgeView;
        this.clickableArea = layer;
        this.closeButton = iconButtonV3View;
        this.contentContainer = constraintLayout;
        this.description = textAtomV2View;
        this.image = image;
        this.title = textAtomV2View2;
    }

    @NonNull
    public static WidgetStatusBannerBinding bind(@NonNull View view) {
        int i11 = R$id.badge;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            i11 = R$id.clickableArea;
            Layer layer = (Layer) C2548q.d(i11, view);
            if (layer != null) {
                i11 = R$id.closeButton;
                IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
                if (iconButtonV3View != null) {
                    i11 = R$id.contentContainer;
                    ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
                    if (constraintLayout != null) {
                        i11 = R$id.description;
                        TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                        if (textAtomV2View != null) {
                            i11 = R$id.image;
                            Image image = (Image) C2548q.d(i11, view);
                            if (image != null) {
                                i11 = R$id.title;
                                TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                                if (textAtomV2View2 != null) {
                                    return new WidgetStatusBannerBinding((FrameLayout) view, badgeView, layer, iconButtonV3View, constraintLayout, textAtomV2View, image, textAtomV2View2);
                                }
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
    /* renamed from: getRoot */
    public FrameLayout getConstraintLayout() {
        return this.rootView;
    }
}
