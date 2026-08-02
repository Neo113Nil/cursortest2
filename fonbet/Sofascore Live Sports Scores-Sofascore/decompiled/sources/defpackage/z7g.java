package defpackage;

import android.text.TextUtils;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class z7g {
    public final String a;

    public z7g(f79 f79Var) {
        this.a = f79Var.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z7g) && this.a.equals(((z7g) obj).a) && TextUtils.equals(null, null);
    }

    public final int hashCode() {
        return Objects.hash(this.a, 1, 0, 0, null);
    }
}
