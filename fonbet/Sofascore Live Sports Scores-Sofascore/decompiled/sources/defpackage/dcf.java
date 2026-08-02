package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dcf {
    public static final dcf c = new dcf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new lz2(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
    public final float a;
    public final lz2 b;

    public dcf(float f, lz2 lz2Var) {
        this.a = f;
        this.b = lz2Var;
        if (Float.isNaN(f)) {
            a70.p("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dcf)) {
            return false;
        }
        dcf dcfVar = (dcf) obj;
        return this.a == dcfVar.a && Intrinsics.c(this.b, dcfVar.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.a + ", range=" + this.b + ", steps=0)";
    }
}
