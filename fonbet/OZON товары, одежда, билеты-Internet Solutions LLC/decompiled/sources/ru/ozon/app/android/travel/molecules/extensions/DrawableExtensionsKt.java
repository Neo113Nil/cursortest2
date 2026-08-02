package ru.ozon.app.android.travel.molecules.extensions;

import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0001\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a?\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0001\u001a\u00020\u00002\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"", "rippleColor", "", "radius", "Landroid/graphics/drawable/RippleDrawable;", "contentlessRipple", "(IF)Landroid/graphics/drawable/RippleDrawable;", "topLeftRadius", "topRightRadius", "bottomLeftRadius", "bottomRightRadius", "(IFFFF)Landroid/graphics/drawable/RippleDrawable;", "molecules_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DrawableExtensionsKt {
    @NotNull
    public static final RippleDrawable contentlessRipple(int i11, float f7) {
        ColorStateList valueOf = ColorStateList.valueOf(i11);
        float[] fArr = new float[8];
        for (int i12 = 0; i12 < 8; i12++) {
            fArr[i12] = f7;
        }
        return new RippleDrawable(valueOf, null, new ShapeDrawable(new RoundRectShape(fArr, null, null)));
    }

    public static /* synthetic */ RippleDrawable contentlessRipple$default(int i11, float f7, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f7 = 0.0f;
        }
        return contentlessRipple(i11, f7);
    }

    public static /* synthetic */ RippleDrawable contentlessRipple$default(int i11, float f7, float f11, float f12, float f13, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            f7 = 0.0f;
        }
        if ((i12 & 4) != 0) {
            f11 = 0.0f;
        }
        if ((i12 & 8) != 0) {
            f12 = 0.0f;
        }
        if ((i12 & 16) != 0) {
            f13 = 0.0f;
        }
        return contentlessRipple(i11, f7, f11, f12, f13);
    }

    @NotNull
    public static final RippleDrawable contentlessRipple(int i11, float f7, float f11, float f12, float f13) {
        return new RippleDrawable(ColorStateList.valueOf(i11), null, new ShapeDrawable(new RoundRectShape(new float[]{f7, f7, f11, f11, f13, f13, f12, f12}, null, null)));
    }
}
