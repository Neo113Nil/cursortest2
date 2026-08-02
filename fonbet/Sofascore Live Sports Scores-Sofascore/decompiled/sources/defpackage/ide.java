package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ide extends wnn {
    public final float i;

    public ide(float f) {
        qx9.q("percent must be in the range of [0, 100]", f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f <= 100.0f);
        this.i = f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ide) {
            return this.i == ((ide) obj).i;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.i)});
    }

    public ide() {
        this.i = -1.0f;
    }
}
