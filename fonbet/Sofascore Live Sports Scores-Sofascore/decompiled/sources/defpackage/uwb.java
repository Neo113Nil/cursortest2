package defpackage;

import com.sofascore.local_persistance.BrandingEvent;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class uwb {
    public final int a;
    public final BrandingEvent b;

    public uwb(int i, BrandingEvent brandingEvent) {
        brandingEvent.getClass();
        this.a = i;
        this.b = brandingEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uwb)) {
            return false;
        }
        uwb uwbVar = (uwb) obj;
        return this.a == uwbVar.a && Intrinsics.c(this.b, uwbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BrandedTarget(eventId=" + this.a + ", branding=" + this.b + ")";
    }
}
