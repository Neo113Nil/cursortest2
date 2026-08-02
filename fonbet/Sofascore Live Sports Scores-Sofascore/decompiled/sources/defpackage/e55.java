package defpackage;

import android.os.Build;
import android.view.DisplayCutout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class e55 {
    public final DisplayCutout a;

    public e55(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final u4a a() {
        return Build.VERSION.SDK_INT >= 30 ? u4a.d(y9.g(this.a)) : u4a.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e55.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((e55) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
