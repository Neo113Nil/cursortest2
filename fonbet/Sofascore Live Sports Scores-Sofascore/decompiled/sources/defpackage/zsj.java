package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zsj {
    public final osj a;
    public final hv9 b;

    static {
        nik.N(0);
        nik.N(1);
    }

    public zsj(osj osjVar, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= osjVar.a)) {
            throw new IndexOutOfBoundsException();
        }
        this.a = osjVar;
        this.b = hv9.v(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zsj.class == obj.getClass()) {
            zsj zsjVar = (zsj) obj;
            if (this.a.equals(zsjVar.a) && this.b.equals(zsjVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }
}
