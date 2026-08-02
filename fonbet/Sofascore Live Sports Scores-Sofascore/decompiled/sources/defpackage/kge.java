package defpackage;

import com.ironsource.U3;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kge {
    public final jh2 a;
    public final qic b;
    public final ujg c;

    public kge(ujg ujgVar, qic qicVar, jh2 jh2Var) {
        z1a.y(ujgVar, "method");
        this.c = ujgVar;
        this.b = qicVar;
        z1a.y(jh2Var, "callOptions");
        this.a = jh2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kge.class != obj.getClass()) {
            return false;
        }
        kge kgeVar = (kge) obj;
        return sha.r(this.a, kgeVar.a) && sha.r(this.b, kgeVar.b) && sha.r(this.c, kgeVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        return "[method=" + this.c + " headers=" + this.b + " callOptions=" + this.a + U3.j.e;
    }
}
