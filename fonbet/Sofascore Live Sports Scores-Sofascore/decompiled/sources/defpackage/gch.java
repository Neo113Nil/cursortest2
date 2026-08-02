package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.IShareContent;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gch implements ich {
    public final Event a;

    public gch(Event event) {
        this.a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gch) && this.a.equals(((gch) obj).a);
    }

    @Override // defpackage.ich
    public final IShareContent getData() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "General(data=" + this.a + ")";
    }
}
