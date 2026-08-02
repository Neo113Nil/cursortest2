package ru.ozon.app.android.travel.utils;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJJ\u0010\u0004\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\tJ*\u0010\u0004\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ1\u0010\u0004\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\u00072\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u0011J8\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\tJ\u001a\u0010\u0012\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014J2\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0007¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/utils/RoundedBackgroundProducer;", "", "<init>", "()V", "produce", "Landroid/graphics/drawable/ShapeDrawable;", "backgroundColor", "", "radius", "", "Landroid/graphics/drawable/GradientDrawable;", "strokeColor", "strokeWidth", "topLeftRadius", "topRightRadius", "bottomLeftRadius", "bottomRightRadius", "(ILjava/lang/Integer;IF)Landroid/graphics/drawable/GradientDrawable;", "produceGradient", "colors", "", "produceBottomContainerBackground", "Landroid/graphics/drawable/Drawable;", "radiusTop", "inset", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RoundedBackgroundProducer {
    public static /* synthetic */ GradientDrawable produce$default(RoundedBackgroundProducer roundedBackgroundProducer, int i11, int i12, int i13, float f7, float f11, float f12, float f13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            f7 = 0.0f;
        }
        if ((i14 & 16) != 0) {
            f11 = 0.0f;
        }
        if ((i14 & 32) != 0) {
            f12 = 0.0f;
        }
        if ((i14 & 64) != 0) {
            f13 = 0.0f;
        }
        return roundedBackgroundProducer.produce(i11, i12, i13, f7, f11, f12, f13);
    }

    public static /* synthetic */ GradientDrawable produceGradient$default(RoundedBackgroundProducer roundedBackgroundProducer, float f7, int[] iArr, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            iArr = null;
        }
        return roundedBackgroundProducer.produceGradient(f7, iArr);
    }

    @NotNull
    public final ShapeDrawable produce(int backgroundColor, float radius) {
        return produce(backgroundColor, radius, radius, radius, radius);
    }

    @NotNull
    public final Drawable produceBottomContainerBackground(float radiusTop, int inset, int strokeWidth, int backgroundColor, int strokeColor) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(backgroundColor);
        gradientDrawable.setStroke(strokeWidth, strokeColor);
        gradientDrawable.setCornerRadii(new float[]{radiusTop, radiusTop, radiusTop, radiusTop, 0.0f, 0.0f, 0.0f, 0.0f});
        return new InsetDrawable((Drawable) gradientDrawable, inset, 0, inset, inset);
    }

    @NotNull
    public final GradientDrawable produceGradient(float radius, int[] colors) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        float[] fArr = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            fArr[i11] = radius;
        }
        gradientDrawable.setCornerRadii(fArr);
        if (colors != null && colors.length <= 1) {
            return gradientDrawable;
        }
        gradientDrawable.setColors(colors);
        return gradientDrawable;
    }

    public static /* synthetic */ ShapeDrawable produce$default(RoundedBackgroundProducer roundedBackgroundProducer, int i11, float f7, float f11, float f12, float f13, int i12, Object obj) {
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
        return roundedBackgroundProducer.produce(i11, f7, f11, f12, f13);
    }

    @NotNull
    public final GradientDrawable produce(int backgroundColor, int strokeColor, int strokeWidth, float topLeftRadius, float topRightRadius, float bottomLeftRadius, float bottomRightRadius) {
        float[] fArr = {topLeftRadius, topLeftRadius, topRightRadius, topRightRadius, bottomRightRadius, bottomRightRadius, bottomLeftRadius, bottomLeftRadius};
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(fArr);
        gradientDrawable.setStroke(strokeWidth, strokeColor);
        gradientDrawable.setColor(backgroundColor);
        return gradientDrawable;
    }

    @NotNull
    public final GradientDrawable produce(int backgroundColor, int strokeColor, int strokeWidth, float radius) {
        float[] fArr = {radius, radius, radius, radius, radius, radius, radius, radius};
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(fArr);
        gradientDrawable.setStroke(strokeWidth, strokeColor);
        gradientDrawable.setColor(backgroundColor);
        return gradientDrawable;
    }

    @NotNull
    public final GradientDrawable produce(int backgroundColor, Integer strokeColor, int strokeWidth, float radius) {
        float[] fArr = {radius, radius, radius, radius, radius, radius, radius, radius};
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(fArr);
        if (strokeColor != null) {
            gradientDrawable.setStroke(strokeWidth, strokeColor.intValue());
        }
        gradientDrawable.setColor(backgroundColor);
        return gradientDrawable;
    }

    @NotNull
    public final ShapeDrawable produce(int backgroundColor, float topLeftRadius, float topRightRadius, float bottomLeftRadius, float bottomRightRadius) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{topLeftRadius, topLeftRadius, topRightRadius, topRightRadius, bottomRightRadius, bottomRightRadius, bottomLeftRadius, bottomLeftRadius}, null, null));
        shapeDrawable.getPaint().setColor(backgroundColor);
        return shapeDrawable;
    }
}
