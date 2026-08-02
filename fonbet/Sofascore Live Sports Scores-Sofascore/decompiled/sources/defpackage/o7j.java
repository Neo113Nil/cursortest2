package defpackage;

import com.sofascore.model.mvvm.model.PlayerKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class o7j {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof o7j) {
            return this.a == ((o7j) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 1 ? PlayerKt.PREFERRED_FOOT_LEFT : i == 2 ? PlayerKt.PREFERRED_FOOT_RIGHT : i == 3 ? "Center" : i == 4 ? "Start" : i == 5 ? "End" : "Invalid";
    }
}
