package androidx.core.view;

import android.view.DisplayCutout;
import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f1350a;

    public l(DisplayCutout displayCutout) {
        this.f1350a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f1350a, ((l) obj).f1350a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f1350a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f1350a + "}";
    }
}
