package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sbi extends wnn {
    public final int i;
    public final float j;

    public sbi(int i, float f) {
        boolean z = false;
        qx9.q("maxStars must be a positive integer", i > 0);
        if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f <= i) {
            z = true;
        }
        qx9.q("starRating is out of range [0, maxStars]", z);
        this.i = i;
        this.j = f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sbi)) {
            return false;
        }
        sbi sbiVar = (sbi) obj;
        return this.i == sbiVar.i && this.j == sbiVar.j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.i), Float.valueOf(this.j)});
    }

    public sbi(int i) {
        qx9.q("maxStars must be a positive integer", i > 0);
        this.i = i;
        this.j = -1.0f;
    }
}
