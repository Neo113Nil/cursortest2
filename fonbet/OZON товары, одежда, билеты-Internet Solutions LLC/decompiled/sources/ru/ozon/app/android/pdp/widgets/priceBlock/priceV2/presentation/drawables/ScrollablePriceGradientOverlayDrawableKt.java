package ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.drawables;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import kotlin.Metadata;
import ru.ozon.app.android.pdp.utils.Dimens;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroid/graphics/drawable/Drawable;", "createDrawable", "()Landroid/graphics/drawable/Drawable;", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScrollablePriceGradientOverlayDrawableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable createDrawable() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.RIGHT_LEFT);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setGradientType(0);
        gradientDrawable2.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        LayerDrawable layerDrawable = new LayerDrawable(new GradientDrawable[]{gradientDrawable, gradientDrawable2});
        Dimens dimens = Dimens.INSTANCE;
        layerDrawable.setLayerWidth(0, dimens.getDP_12());
        layerDrawable.setLayerWidth(1, dimens.getDP_12());
        layerDrawable.setLayerGravity(0, 8388611);
        layerDrawable.setLayerGravity(1, 8388613);
        return layerDrawable;
    }
}
