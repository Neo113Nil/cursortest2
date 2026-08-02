package com.google.android.material.elevation;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;
import g0.c;
import kotlin.KotlinVersion;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ElevationOverlayProvider {
    private static final float FORMULA_MULTIPLIER = 4.5f;
    private static final float FORMULA_OFFSET = 2.0f;
    private static final int OVERLAY_ACCENT_COLOR_ALPHA = (int) Math.round(5.1000000000000005d);
    private final int colorSurface;
    private final float displayDensity;
    private final int elevationOverlayAccentColor;
    private final int elevationOverlayColor;
    private final boolean elevationOverlayEnabled;

    public ElevationOverlayProvider(@NonNull Context context) {
        this(MaterialAttributes.resolveBoolean(context, R.attr.elevationOverlayEnabled, false), MaterialColors.getColor(context, R.attr.elevationOverlayColor, 0), MaterialColors.getColor(context, R.attr.elevationOverlayAccentColor, 0), MaterialColors.getColor(context, R.attr.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean isThemeSurfaceColor(int i5) {
        return c.e(i5, KotlinVersion.MAX_COMPONENT_VALUE) == this.colorSurface;
    }

    public int calculateOverlayAlpha(float f6) {
        return Math.round(calculateOverlayAlphaFraction(f6) * 255.0f);
    }

    public float calculateOverlayAlphaFraction(float f6) {
        if (this.displayDensity <= 0.0f || f6 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f6 / r0)) * FORMULA_MULTIPLIER) + FORMULA_OFFSET) / 100.0f, 1.0f);
    }

    public int compositeOverlay(int i5, float f6, @NonNull View view) {
        return compositeOverlay(i5, getParentAbsoluteElevation(view) + f6);
    }

    public int compositeOverlayIfNeeded(int i5, float f6, @NonNull View view) {
        return compositeOverlayIfNeeded(i5, getParentAbsoluteElevation(view) + f6);
    }

    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f6, @NonNull View view) {
        return compositeOverlayWithThemeSurfaceColorIfNeeded(getParentAbsoluteElevation(view) + f6);
    }

    public float getParentAbsoluteElevation(@NonNull View view) {
        return ViewUtils.getParentAbsoluteElevation(view);
    }

    public int getThemeElevationOverlayColor() {
        return this.elevationOverlayColor;
    }

    public int getThemeSurfaceColor() {
        return this.colorSurface;
    }

    public boolean isThemeElevationOverlayEnabled() {
        return this.elevationOverlayEnabled;
    }

    public int compositeOverlay(int i5, float f6) {
        int i10;
        float calculateOverlayAlphaFraction = calculateOverlayAlphaFraction(f6);
        int alpha = Color.alpha(i5);
        int layer = MaterialColors.layer(c.e(i5, KotlinVersion.MAX_COMPONENT_VALUE), this.elevationOverlayColor, calculateOverlayAlphaFraction);
        if (calculateOverlayAlphaFraction > 0.0f && (i10 = this.elevationOverlayAccentColor) != 0) {
            layer = MaterialColors.layer(layer, c.e(i10, OVERLAY_ACCENT_COLOR_ALPHA));
        }
        return c.e(layer, alpha);
    }

    public int compositeOverlayIfNeeded(int i5, float f6) {
        return (this.elevationOverlayEnabled && isThemeSurfaceColor(i5)) ? compositeOverlay(i5, f6) : i5;
    }

    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f6) {
        return compositeOverlayIfNeeded(this.colorSurface, f6);
    }

    public ElevationOverlayProvider(boolean z5, int i5, int i10, int i11, float f6) {
        this.elevationOverlayEnabled = z5;
        this.elevationOverlayColor = i5;
        this.elevationOverlayAccentColor = i10;
        this.colorSurface = i11;
        this.displayDensity = f6;
    }
}
