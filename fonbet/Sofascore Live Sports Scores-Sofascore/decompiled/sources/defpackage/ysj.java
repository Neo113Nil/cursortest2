package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ysj implements i72 {
    public final nsj a;
    public final hv9 b;

    public ysj(nsj nsjVar, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= nsjVar.a)) {
            throw new IndexOutOfBoundsException();
        }
        this.a = nsjVar;
        this.b = hv9.v(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ysj.class != obj.getClass()) {
            return false;
        }
        ysj ysjVar = (ysj) obj;
        return this.a.equals(ysjVar.a) && this.b.equals(ysjVar.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }
}
