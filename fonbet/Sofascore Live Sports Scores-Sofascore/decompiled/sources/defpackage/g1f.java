package defpackage;

import com.sofascore.results.main.MainActivity;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class g1f extends j1f {
    public final int h;

    public g1f(int i) {
        super("Tennis Analyst Promo (already subscribed)", j7f.c, new b1f(6), a.c(MainActivity.class), null, null, 112);
        this.h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1f) && this.h == ((g1f) obj).h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h);
    }

    public final String toString() {
        return lnb.k(this.h, "TennisAnalystSubscribedPromo(eventId=", ")");
    }
}
