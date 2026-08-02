package defpackage;

import android.graphics.drawable.GradientDrawable;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class tam {
    public static final tam a = new tam();

    public static float a(BlazeDp blazeDp, Float f, int i, int i2) {
        blazeDp.getClass();
        if (f != null) {
            if (f.floatValue() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f = null;
            }
            if (f != null) {
                return f.floatValue() * Integer.min(i, i2);
            }
        }
        return blazeDp.getToPx$blazesdk_release();
    }

    public static GradientDrawable b(float f, int i, int i2, Integer num) {
        GradientDrawable b = w1l.b(0);
        b.setCornerRadii(new float[]{f, f, f, f, f, f, f, f});
        if (num != null) {
            b.setColor(num.intValue());
        }
        b.setStroke(i2, i);
        return b;
    }

    public static /* synthetic */ GradientDrawable drawBorderShape$default(tam tamVar, Integer num, int i, float f, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        tamVar.getClass();
        return b(f, i, i2, num);
    }
}
