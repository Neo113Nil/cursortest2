package defpackage;

import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class qzf {
    public final jl9 a;
    public final String b;
    public final q89 c;
    public final yzf d;
    public final y6a e;
    public je2 f;

    public qzf(pzf pzfVar) {
        jl9 jl9Var = pzfVar.a;
        if (jl9Var == null) {
            a70.r("url == null");
            throw null;
        }
        this.a = jl9Var;
        this.b = pzfVar.b;
        ef0 ef0Var = pzfVar.c;
        ef0Var.getClass();
        this.c = vha.i(ef0Var);
        this.d = pzfVar.d;
        this.e = pzfVar.e;
    }

    public final je2 a() {
        je2 je2Var = this.f;
        if (je2Var != null) {
            return je2Var;
        }
        je2 je2Var2 = je2.n;
        je2 M = c5n.M(this.c);
        this.f = M;
        return M;
    }

    public final pzf b() {
        pzf pzfVar = new pzf();
        pzfVar.a = this.a;
        pzfVar.b = this.b;
        pzfVar.d = this.d;
        pzfVar.e = this.e;
        pzfVar.c = vha.k(this.c);
        return pzfVar;
    }

    public final Object c(KClass kClass) {
        kClass.getClass();
        return sha.x(kClass).cast(this.e.A(kClass));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        q89 q89Var = this.c;
        if (q89Var.size() != 0) {
            sb.append(", headers=[");
            Iterator it = q89Var.iterator();
            int i = 0;
            while (true) {
                r4 r4Var = (r4) it;
                if (!r4Var.hasNext()) {
                    sb.append(']');
                    break;
                }
                Object next = r4Var.next();
                int i2 = i + 1;
                if (i < 0) {
                    b.q();
                    throw null;
                }
                Pair pair = (Pair) next;
                String str = (String) pair.a;
                String str2 = (String) pair.b;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                if (wol.l(str)) {
                    str2 = "██";
                }
                sb.append(str2);
                i = i2;
            }
        }
        ym5 ym5Var = ym5.f;
        y6a y6aVar = this.e;
        if (!Intrinsics.c(y6aVar, ym5Var)) {
            sb.append(", tags=");
            sb.append(y6aVar);
        }
        sb.append('}');
        return sb.toString();
    }
}
