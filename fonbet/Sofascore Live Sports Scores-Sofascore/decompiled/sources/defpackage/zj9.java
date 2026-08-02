package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zj9 {
    public final lek a;
    public final ij9 b;
    public final w89 c;
    public final swd d;
    public final smi e;
    public final xh3 f;
    public final Set g;

    public zj9(lek lekVar, ij9 ij9Var, w89 w89Var, swd swdVar, smi smiVar, xh3 xh3Var) {
        Set keySet;
        ij9Var.getClass();
        this.a = lekVar;
        this.b = ij9Var;
        this.c = w89Var;
        this.d = swdVar;
        this.e = smiVar;
        this.f = xh3Var;
        Map map = (Map) xh3Var.d(ei9.a);
        this.g = (map == null || (keySet = map.keySet()) == null) ? rm5.a : keySet;
    }

    public final String toString() {
        return "HttpRequestData(url=" + this.a + ", method=" + this.b + ')';
    }
}
