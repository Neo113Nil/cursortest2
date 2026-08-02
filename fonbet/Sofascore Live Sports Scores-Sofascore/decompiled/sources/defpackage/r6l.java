package defpackage;

import com.sofascore.model.mvvm.model.Event;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q5h("event")
@r5h
/* loaded from: classes6.dex */
public final class r6l implements v6l {

    @NotNull
    public static final q6l Companion = new q6l();
    public final Event a;

    public /* synthetic */ r6l(int i, Event event) {
        if (1 == (i & 1)) {
            this.a = event;
        } else {
            oea.z(i, 1, p6l.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r6l) && Intrinsics.c(this.a, ((r6l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EventEntity(event=" + this.a + ")";
    }

    public r6l(Event event) {
        this.a = event;
    }
}
