package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h8g {
    public float a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public boolean b = true;
    public c5n c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8g)) {
            return false;
        }
        h8g h8gVar = (h8g) obj;
        return Float.compare(this.a, h8gVar.a) == 0 && this.b == h8gVar.b && Intrinsics.c(this.c, h8gVar.c);
    }

    public final int hashCode() {
        int e = dmi.e(Float.hashCode(this.a) * 31, 31, this.b);
        c5n c5nVar = this.c;
        return (e + (c5nVar == null ? 0 : c5nVar.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }
}
