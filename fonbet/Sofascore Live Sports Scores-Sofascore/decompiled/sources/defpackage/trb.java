package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class trb extends drb {
    public static final ReferenceQueue b = new ReferenceQueue();
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public static final Logger d = Logger.getLogger(trb.class.getName());
    public final qrb a;

    public trb(qrb qrbVar) {
        this.a = qrbVar;
        new srb(this, qrbVar, b, c);
    }

    @Override // defpackage.mn2
    public final String e() {
        return this.a.t.e();
    }

    @Override // defpackage.mn2
    public final wkn f(ujg ujgVar, jh2 jh2Var) {
        return this.a.t.f(ujgVar, jh2Var);
    }

    public final String toString() {
        en0 I = qea.I(this);
        I.e(this.a, "delegate");
        return I.toString();
    }
}
