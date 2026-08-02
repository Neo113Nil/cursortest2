package defpackage;

import com.sofascore.model.mvvm.model.PlayerKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class md8 {
    public final int a;

    public static String a(int i) {
        return i == 1 ? "Next" : i == 2 ? "Previous" : i == 3 ? PlayerKt.PREFERRED_FOOT_LEFT : i == 4 ? PlayerKt.PREFERRED_FOOT_RIGHT : i == 5 ? "Up" : i == 6 ? "Down" : i == 7 ? "Enter" : i == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof md8) {
            return this.a == ((md8) obj).a;
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
