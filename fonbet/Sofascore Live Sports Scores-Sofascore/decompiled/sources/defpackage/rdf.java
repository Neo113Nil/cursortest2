package defpackage;

import com.sofascore.model.mvvm.model.Event;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rdf implements udf {
    public final Event a;

    public rdf(Event event) {
        this.a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rdf) && this.a.equals(((rdf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Event(event=" + this.a + ")";
    }
}
