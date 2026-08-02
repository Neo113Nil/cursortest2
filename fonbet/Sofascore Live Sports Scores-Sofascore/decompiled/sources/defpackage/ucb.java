package defpackage;

import com.sofascore.model.mvvm.model.Event;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ucb {
    public final Event a;

    public ucb(Event event) {
        event.getClass();
        this.a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ucb) && Intrinsics.c(this.a, ((ucb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RefreshEventTime(event=" + this.a + ")";
    }
}
