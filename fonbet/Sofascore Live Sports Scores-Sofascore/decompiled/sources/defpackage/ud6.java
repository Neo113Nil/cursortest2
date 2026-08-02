package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.network.response.Duel;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ud6 {
    public final boolean a;
    public final Event b;
    public final Duel c;

    public ud6(boolean z, Event event, Duel duel) {
        this.a = z;
        this.b = event;
        this.c = duel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud6)) {
            return false;
        }
        ud6 ud6Var = (ud6) obj;
        return this.a == ud6Var.a && this.b.equals(ud6Var.b) && Intrinsics.c(this.c, ud6Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
        Duel duel = this.c;
        return hashCode + (duel == null ? 0 : duel.hashCode());
    }

    public final String toString() {
        return "EventWithDuel(showSport=" + this.a + ", event=" + this.b + ", duel=" + this.c + ")";
    }
}
