package defpackage;

import com.sofascore.results.event.EventActivity;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class h1f extends j1f {
    public final int h;

    public h1f(int i) {
        super("Tennis Analyst Promo (non-subscribers)", j7f.c, new b1f(7), a.c(EventActivity.class), null, null, 112);
        this.h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1f) && this.h == ((h1f) obj).h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h);
    }

    public final String toString() {
        return lnb.k(this.h, "TennisAnalystUnsubscribedPromo(eventId=", ")");
    }
}
