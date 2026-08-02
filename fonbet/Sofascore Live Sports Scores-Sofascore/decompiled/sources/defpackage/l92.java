package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l92 extends dwd implements Serializable {
    public final xs8 a;
    public final dwd b;

    public l92(xs8 xs8Var, dwd dwdVar) {
        this.a = xs8Var;
        this.b = dwdVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        xs8 xs8Var = this.a;
        return this.b.compare(xs8Var.apply(obj), xs8Var.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l92)) {
            return false;
        }
        l92 l92Var = (l92) obj;
        return this.a.equals(l92Var.a) && this.b.equals(l92Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return this.b + ".onResultOf(" + this.a + ")";
    }
}
