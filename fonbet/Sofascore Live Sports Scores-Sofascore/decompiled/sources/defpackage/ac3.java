package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public interface ac3 {
    default Object e(Class cls) {
        return h(oif.a(cls));
    }

    vff f(oif oifVar);

    vff g(oif oifVar);

    default Object h(oif oifVar) {
        vff g = g(oifVar);
        if (g == null) {
            return null;
        }
        return g.get();
    }

    default Set i(oif oifVar) {
        return (Set) f(oifVar).get();
    }

    default vff j(Class cls) {
        return g(oif.a(cls));
    }

    nvd k(oif oifVar);

    default nvd l(Class cls) {
        return k(oif.a(cls));
    }
}
