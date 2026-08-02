package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class ly3 {
    public final LinkedHashMap a = new LinkedHashMap();

    public abstract Object a(ky3 ky3Var);

    public final boolean equals(Object obj) {
        if (obj instanceof ly3) {
            return this.a.equals(((ly3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.a + ")";
    }
}
