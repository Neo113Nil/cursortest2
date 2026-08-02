package defpackage;

import com.sofascore.model.newNetwork.PredictedEvent;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xaf implements yaf {
    public final PredictedEvent a;

    public xaf(PredictedEvent predictedEvent) {
        predictedEvent.getClass();
        this.a = predictedEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xaf) && Intrinsics.c(this.a, ((xaf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Event(event=" + this.a + ")";
    }
}
