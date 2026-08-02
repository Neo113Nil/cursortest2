package defpackage;

import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class mk implements ut3 {
    public final ut3 a;
    public final float b;

    public mk(float f, ut3 ut3Var) {
        while (ut3Var instanceof mk) {
            ut3Var = ((mk) ut3Var).a;
            f += ((mk) ut3Var).b;
        }
        this.a = ut3Var;
        this.b = f;
    }

    @Override // defpackage.ut3
    public final float a(RectF rectF) {
        return Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mk)) {
            return false;
        }
        mk mkVar = (mk) obj;
        return this.a.equals(mkVar.a) && this.b == mkVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
