package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lth0;", "Lbuc;", "Lxh0;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class th0 extends buc {
    public final float a;

    public th0(float f) {
        this.a = f;
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        p3a.a("aspectRatio " + f + " must be > 0");
    }

    @Override // defpackage.buc
    public final wtc c() {
        xh0 xh0Var = new xh0();
        xh0Var.o = this.a;
        return xh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        th0 th0Var = obj instanceof th0 ? (th0) obj : null;
        if (th0Var == null || this.a != th0Var.a) {
            return false;
        }
        ((th0) obj).getClass();
        return true;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        ((xh0) wtcVar).o = this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Float.hashCode(this.a) * 31);
    }
}
