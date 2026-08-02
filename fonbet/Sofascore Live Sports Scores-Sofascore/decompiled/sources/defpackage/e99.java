package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class e99 extends wnn {
    public final boolean i;
    public final boolean j;

    public e99() {
        this.i = false;
        this.j = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e99)) {
            return false;
        }
        e99 e99Var = (e99) obj;
        return this.j == e99Var.j && this.i == e99Var.i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.i), Boolean.valueOf(this.j)});
    }

    public e99(boolean z) {
        this.i = true;
        this.j = z;
    }
}
