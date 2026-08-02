package defpackage;

import com.ironsource.U3;
import kotlin.text.CharsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class to3 {
    public final v32 a;
    public final lj2 b;

    public to3(v32 v32Var, lj2 lj2Var) {
        this.a = v32Var;
        this.b = lj2Var;
    }

    public final String toString() {
        lj2 lj2Var = this.b;
        gu3 gu3Var = (gu3) lj2Var.e.get(gu3.c);
        String str = gu3Var != null ? gu3Var.b : null;
        StringBuilder sb = new StringBuilder("Request@");
        String num = Integer.toString(hashCode(), CharsKt.checkRadix(16));
        num.getClass();
        sb.append(num);
        sb.append(str != null ? lnb.o(U3.j.d, str, "](") : "(");
        sb.append("currentBounds()=");
        sb.append(this.a.invoke());
        sb.append(", continuation=");
        sb.append(lj2Var);
        sb.append(')');
        return sb.toString();
    }
}
