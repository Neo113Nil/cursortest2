package defpackage;

import com.sofascore.model.mvvm.model.PlayerKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p7j {
    public final int a;

    public static String a(int i) {
        return i == 1 ? PlayerKt.PREFERRED_FOOT_LEFT : i == 2 ? PlayerKt.PREFERRED_FOOT_RIGHT : i == 3 ? "Center" : i == 4 ? "Justify" : i == 5 ? "Start" : i == 6 ? "End" : i == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p7j) {
            return this.a == ((p7j) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
