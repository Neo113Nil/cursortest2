package defpackage;

import java.util.IdentityHashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class y89 extends ln8 {
    public final o6a g;
    public final efb h;

    public y89(o6a o6aVar, efb efbVar) {
        z1a.y(o6aVar, "delegate");
        this.g = o6aVar;
        z1a.y(efbVar, "healthListener");
        this.h = efbVar;
    }

    @Override // defpackage.o6a
    public final sm0 B() {
        sm0 B = this.g.B();
        B.getClass();
        Boolean bool = Boolean.TRUE;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(ffb.e, bool);
        for (Map.Entry entry : B.a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((rm0) entry.getKey(), entry.getValue());
            }
        }
        return new sm0(identityHashMap);
    }

    @Override // defpackage.o6a
    public final void M(efb efbVar) {
        this.g.M(new x89(0, this, efbVar));
    }

    @Override // defpackage.ln8
    public final o6a S() {
        return this.g;
    }
}
