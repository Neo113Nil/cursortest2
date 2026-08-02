package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class iu0 {
    public final String a;
    public final ArrayList b;

    public iu0(String str, ArrayList arrayList) {
        if (str == null) {
            yhk.s("Null userAgent");
            throw null;
        }
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iu0)) {
            return false;
        }
        iu0 iu0Var = (iu0) obj;
        return this.a.equals(iu0Var.a) && this.b.equals(iu0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b + "}";
    }
}
