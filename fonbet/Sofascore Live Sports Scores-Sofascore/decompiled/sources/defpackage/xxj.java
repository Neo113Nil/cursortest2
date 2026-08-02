package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xxj implements wxj {
    public final Set a;
    public final jv0 b;
    public final gyj c;

    public xxj(Set set, jv0 jv0Var, gyj gyjVar) {
        this.a = set;
        this.b = jv0Var;
        this.c = gyjVar;
    }

    public final p03 a(String str, kn5 kn5Var, kwj kwjVar) {
        Set set = this.a;
        if (set.contains(kn5Var)) {
            return new p03(this.b, str, kn5Var, kwjVar, this.c, 16);
        }
        sw9.n("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{kn5Var, set});
        return null;
    }
}
