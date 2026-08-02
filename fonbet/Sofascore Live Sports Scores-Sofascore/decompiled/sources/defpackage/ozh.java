package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ozh {
    public final gv9 a;

    public ozh(gv9 gv9Var) {
        gv9Var.getClass();
        this.a = gv9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ozh) && Intrinsics.c(this.a, ((ozh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SportPickerUiState(sportPickerItems=" + this.a + ")";
    }
}
