package defpackage;

import com.sofascore.model.mvvm.model.bettingtips.EventBetBoost;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fu1 implements iu1 {
    public final EventBetBoost a;

    public fu1(EventBetBoost eventBetBoost) {
        eventBetBoost.getClass();
        this.a = eventBetBoost;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fu1) && Intrinsics.c(this.a, ((fu1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Event(betBoost=" + this.a + ")";
    }
}
