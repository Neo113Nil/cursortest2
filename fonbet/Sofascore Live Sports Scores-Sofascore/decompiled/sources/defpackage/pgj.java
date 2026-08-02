package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pgj extends wnn {
    public final boolean i;
    public final boolean j;

    public pgj() {
        this.i = false;
        this.j = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pgj)) {
            return false;
        }
        pgj pgjVar = (pgj) obj;
        return this.j == pgjVar.j && this.i == pgjVar.i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.i), Boolean.valueOf(this.j)});
    }

    public pgj(boolean z) {
        this.i = true;
        this.j = z;
    }
}
