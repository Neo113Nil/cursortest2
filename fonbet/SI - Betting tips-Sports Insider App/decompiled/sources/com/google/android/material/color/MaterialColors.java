package com.google.android.material.color;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.color.utilities.Blend;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.resources.MaterialAttributes;
import com.sports.insider.R;
import g0.c;
import kotlin.KotlinVersion;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class MaterialColors {
    public static final float ALPHA_DISABLED = 0.38f;
    public static final float ALPHA_DISABLED_LOW = 0.12f;
    public static final float ALPHA_FULL = 1.0f;
    public static final float ALPHA_LOW = 0.32f;
    public static final float ALPHA_MEDIUM = 0.54f;
    private static final int CHROMA_NEUTRAL = 6;
    private static final int TONE_ACCENT_CONTAINER_DARK = 30;
    private static final int TONE_ACCENT_CONTAINER_LIGHT = 90;
    private static final int TONE_ACCENT_DARK = 80;
    private static final int TONE_ACCENT_LIGHT = 40;
    private static final int TONE_ON_ACCENT_CONTAINER_DARK = 90;
    private static final int TONE_ON_ACCENT_CONTAINER_LIGHT = 10;
    private static final int TONE_ON_ACCENT_DARK = 20;
    private static final int TONE_ON_ACCENT_LIGHT = 100;
    private static final int TONE_SURFACE_CONTAINER_DARK = 12;
    private static final int TONE_SURFACE_CONTAINER_HIGH_DARK = 17;
    private static final int TONE_SURFACE_CONTAINER_HIGH_LIGHT = 92;
    private static final int TONE_SURFACE_CONTAINER_LIGHT = 94;

    private MaterialColors() {
    }

    public static int compositeARGBWithAlpha(int i5, int i10) {
        return c.e(i5, (Color.alpha(i5) * i10) / KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static int getColor(@NonNull View view, int i5) {
        return resolveColor(view.getContext(), MaterialAttributes.resolveTypedValueOrThrow(view, i5));
    }

    public static Integer getColorOrNull(@NonNull Context context, int i5) {
        TypedValue resolve = MaterialAttributes.resolve(context, i5);
        if (resolve != null) {
            return Integer.valueOf(resolveColor(context, resolve));
        }
        return null;
    }

    private static int getColorRole(int i5, int i10) {
        Hct fromInt = Hct.fromInt(i5);
        fromInt.setTone(i10);
        return fromInt.toInt();
    }

    @NonNull
    public static ColorRoles getColorRoles(@NonNull Context context, int i5) {
        return getColorRoles(i5, isLightTheme(context));
    }

    @NonNull
    public static ColorStateList getColorStateList(@NonNull Context context, int i5, @NonNull ColorStateList colorStateList) {
        TypedValue resolve = MaterialAttributes.resolve(context, i5);
        ColorStateList resolveColorStateList = resolve != null ? resolveColorStateList(context, resolve) : null;
        return resolveColorStateList == null ? colorStateList : resolveColorStateList;
    }

    public static ColorStateList getColorStateListOrNull(@NonNull Context context, int i5) {
        TypedValue resolve = MaterialAttributes.resolve(context, i5);
        if (resolve == null) {
            return null;
        }
        int i10 = resolve.resourceId;
        if (i10 != 0) {
            return d0.c.c(context, i10);
        }
        int i11 = resolve.data;
        if (i11 != 0) {
            return ColorStateList.valueOf(i11);
        }
        return null;
    }

    public static int getSurfaceContainerFromSeed(@NonNull Context context, int i5) {
        return getColorRole(i5, isLightTheme(context) ? TONE_SURFACE_CONTAINER_LIGHT : 12, 6);
    }

    public static int getSurfaceContainerHighFromSeed(@NonNull Context context, int i5) {
        return getColorRole(i5, isLightTheme(context) ? TONE_SURFACE_CONTAINER_HIGH_LIGHT : 17, 6);
    }

    public static int harmonize(int i5, int i10) {
        return Blend.harmonize(i5, i10);
    }

    public static int harmonizeWithPrimary(@NonNull Context context, int i5) {
        return harmonize(i5, getColor(context, R.attr.colorPrimary, MaterialColors.class.getCanonicalName()));
    }

    public static boolean isColorLight(int i5) {
        if (i5 == 0) {
            return false;
        }
        ThreadLocal threadLocal = c.f9674a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i5);
        int green = Color.green(i5);
        int blue = Color.blue(i5);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d10 = red / 255.0d;
        double pow = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        double d11 = green / 255.0d;
        double pow2 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
        double d12 = blue / 255.0d;
        double pow3 = d12 < 0.04045d ? d12 / 12.92d : Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
        double d13 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
        dArr[1] = d13;
        dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
        return d13 / 100.0d > 0.5d;
    }

    public static boolean isLightTheme(@NonNull Context context) {
        return MaterialAttributes.resolveBoolean(context, R.attr.isLightTheme, true);
    }

    public static int layer(@NonNull View view, int i5, int i10) {
        return layer(view, i5, i10, 1.0f);
    }

    private static int resolveColor(@NonNull Context context, @NonNull TypedValue typedValue) {
        int i5 = typedValue.resourceId;
        return i5 != 0 ? context.getColor(i5) : typedValue.data;
    }

    private static ColorStateList resolveColorStateList(@NonNull Context context, @NonNull TypedValue typedValue) {
        int i5 = typedValue.resourceId;
        return i5 != 0 ? d0.c.c(context, i5) : ColorStateList.valueOf(typedValue.data);
    }

    @NonNull
    public static ColorRoles getColorRoles(int i5, boolean z5) {
        return z5 ? new ColorRoles(getColorRole(i5, 40), getColorRole(i5, 100), getColorRole(i5, 90), getColorRole(i5, 10)) : new ColorRoles(getColorRole(i5, TONE_ACCENT_DARK), getColorRole(i5, 20), getColorRole(i5, TONE_ACCENT_CONTAINER_DARK), getColorRole(i5, 90));
    }

    public static int layer(@NonNull View view, int i5, int i10, float f6) {
        return layer(getColor(view, i5), getColor(view, i10), f6);
    }

    public static int getColor(Context context, int i5, String str) {
        return resolveColor(context, MaterialAttributes.resolveTypedValueOrThrow(context, i5, str));
    }

    private static int getColorRole(int i5, int i10, int i11) {
        Hct fromInt = Hct.fromInt(getColorRole(i5, i10));
        fromInt.setChroma(i11);
        return fromInt.toInt();
    }

    public static int layer(int i5, int i10, float f6) {
        return layer(i5, c.e(i10, Math.round(Color.alpha(i10) * f6)));
    }

    public static int getColor(@NonNull View view, int i5, int i10) {
        return getColor(view.getContext(), i5, i10);
    }

    public static int getColor(@NonNull Context context, int i5, int i10) {
        Integer colorOrNull = getColorOrNull(context, i5);
        return colorOrNull != null ? colorOrNull.intValue() : i10;
    }

    public static int layer(int i5, int i10) {
        return c.c(i10, i5);
    }
}
