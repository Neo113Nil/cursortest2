package defpackage;

import com.sofascore.model.mvvm.model.Event;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bu7 {
    public final Event a;
    public final xmd b;

    public bu7(Event event, xmd xmdVar) {
        event.getClass();
        this.a = event;
        this.b = xmdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu7)) {
            return false;
        }
        bu7 bu7Var = (bu7) obj;
        return Intrinsics.c(this.a, bu7Var.a) && Intrinsics.c(this.b, bu7Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        xmd xmdVar = this.b;
        return hashCode + (xmdVar == null ? 0 : xmdVar.hashCode());
    }

    public final String toString() {
        return "FeaturedEventData(event=" + this.a + ", oddsState=" + this.b + ")";
    }
}
