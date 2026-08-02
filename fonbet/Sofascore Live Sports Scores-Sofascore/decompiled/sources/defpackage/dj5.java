package defpackage;

import android.content.Context;
import android.graphics.Color;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class dj5 {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public dj5(Context context) {
        boolean L = x2a.L(context.getTheme(), R.attr.elevationOverlayEnabled, false);
        Integer v = o3a.v(R.attr.elevationOverlayColor, context);
        int intValue = v != null ? v.intValue() : 0;
        Integer v2 = o3a.v(R.attr.elevationOverlayAccentColor, context);
        int intValue2 = v2 != null ? v2.intValue() : 0;
        Integer v3 = o3a.v(R.attr.colorSurface, context);
        int intValue3 = v3 != null ? v3.intValue() : 0;
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = L;
        this.b = intValue;
        this.c = intValue2;
        this.d = intValue3;
        this.e = f2;
    }

    public final int a(float f2, int i) {
        int i2;
        if (!this.a || o23.k(i, 255) != this.d) {
            return i;
        }
        float min = (this.e <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int J = o3a.J(min, o23.k(i, 255), this.b);
        if (min > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (i2 = this.c) != 0) {
            J = o23.h(o23.k(i2, f), J);
        }
        return o23.k(J, alpha);
    }
}
