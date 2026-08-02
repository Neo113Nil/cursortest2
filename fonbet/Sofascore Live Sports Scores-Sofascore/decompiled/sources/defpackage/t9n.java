package defpackage;

import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class t9n extends p0p {
    public String e;
    public HashSet f;
    public dh0 g;
    public Long h;
    public Long i;

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final java.util.ArrayList U(java.lang.String r37, java.util.List r38, java.util.List r39, java.lang.Long r40, java.lang.Long r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 2753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t9n.U(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.ArrayList");
    }

    public final ddp V(Integer num) {
        if (this.g.containsKey(num)) {
            return (ddp) this.g.get(num);
        }
        ddp ddpVar = new ddp(this, this.e);
        this.g.put(num, ddpVar);
        return ddpVar;
    }

    @Override // defpackage.p0p
    public final void T() {
    }
}
