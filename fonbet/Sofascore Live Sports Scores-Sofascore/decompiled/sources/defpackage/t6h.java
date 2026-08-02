package defpackage;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class t6h {
    public final gfb a;
    public final Object b;

    public t6h(gfb gfbVar, Object obj) {
        this.a = gfbVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t6h.class != obj.getClass()) {
            return false;
        }
        t6h t6hVar = (t6h) obj;
        return sha.r(this.a, t6hVar.a) && sha.r(this.b, t6hVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        en0 I = qea.I(this);
        I.e(this.a, IronSourceConstants.EVENTS_PROVIDER);
        I.e(this.b, "config");
        return I.toString();
    }
}
