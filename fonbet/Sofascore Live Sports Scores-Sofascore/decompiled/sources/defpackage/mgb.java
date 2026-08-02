package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mgb {
    public final long a;
    public final float b;
    public final long c;

    public mgb(lgb lgbVar) {
        this.a = lgbVar.a;
        this.b = lgbVar.b;
        this.c = lgbVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mgb)) {
            return false;
        }
        mgb mgbVar = (mgb) obj;
        return this.a == mgbVar.a && this.b == mgbVar.b && this.c == mgbVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c));
    }
}
