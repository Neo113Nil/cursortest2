package w7;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import androidx.annotation.NonNull;
import androidx.core.graphics.c;

/* renamed from: w7.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C10444a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f103604a = {R.attr.state_pressed};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f103605b = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f103606c = {R.attr.state_selected};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f103607d = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    static final String f103608e = C10444a.class.getSimpleName();

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f103609f = 0;

    private C10444a() {
    }

    @NonNull
    public static ColorStateList a(ColorStateList colorStateList) {
        int[] iArr = f103606c;
        int colorForState = colorStateList != null ? colorStateList.getColorForState(f103605b, colorStateList.getDefaultColor()) : 0;
        int f7 = c.f(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
        int[][] iArr2 = {iArr, StateSet.NOTHING};
        int colorForState2 = colorStateList != null ? colorStateList.getColorForState(f103604a, colorStateList.getDefaultColor()) : 0;
        return new ColorStateList(iArr2, new int[]{f7, c.f(colorForState2, Math.min(Color.alpha(colorForState2) * 2, 255))});
    }

    @NonNull
    public static ColorStateList b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f103607d, 0)) != 0) {
            Log.w(f103608e, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean c(@NonNull int[] iArr) {
        boolean z11 = false;
        boolean z12 = false;
        for (int i11 : iArr) {
            if (i11 == 16842910) {
                z11 = true;
            } else if (i11 == 16842908 || i11 == 16842919 || i11 == 16843623) {
                z12 = true;
            }
        }
        return z11 && z12;
    }
}
