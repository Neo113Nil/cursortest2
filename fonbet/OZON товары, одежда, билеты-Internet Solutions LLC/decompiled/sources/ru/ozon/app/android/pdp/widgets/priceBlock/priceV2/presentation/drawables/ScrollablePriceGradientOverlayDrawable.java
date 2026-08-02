package ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.drawables;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u00020\tH\u0002¨\u0006\n"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/drawables/ScrollablePriceGradientOverlayDrawable;", "Landroid/graphics/drawable/DrawableWrapper;", "<init>", "()V", "setGradientColor", "", "color", "", "requireDrawable", "Landroid/graphics/drawable/LayerDrawable;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScrollablePriceGradientOverlayDrawable extends DrawableWrapper {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ScrollablePriceGradientOverlayDrawable() {
        super(r0);
        Drawable createDrawable;
        createDrawable = ScrollablePriceGradientOverlayDrawableKt.createDrawable();
    }

    private final LayerDrawable requireDrawable() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            return (LayerDrawable) drawable;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void setGradientColor(int color) {
        LayerDrawable requireDrawable = requireDrawable();
        int[] iArr = {0, color};
        Drawable drawable = requireDrawable.getDrawable(0);
        Intrinsics.g(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) drawable).setColors(iArr);
        Drawable drawable2 = requireDrawable.getDrawable(1);
        Intrinsics.g(drawable2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) drawable2).setColors(iArr);
    }
}
