package s7;

import java.util.HashSet;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends l3 {

    /* renamed from: d, reason: collision with root package name */
    public String f22664d;

    /* renamed from: e, reason: collision with root package name */
    public HashSet f22665e;

    /* renamed from: f, reason: collision with root package name */
    public s.e f22666f;

    /* renamed from: g, reason: collision with root package name */
    public Long f22667g;

    /* renamed from: h, reason: collision with root package name */
    public Long f22668h;

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final java.util.ArrayList n(java.lang.String r41, java.util.List r42, java.util.List r43, java.lang.Long r44, java.lang.Long r45, boolean r46) {
        /*
            Method dump skipped, instructions count: 2789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.c.n(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.ArrayList");
    }

    public final x3 o(Integer num) {
        if (this.f22666f.containsKey(num)) {
            return (x3) this.f22666f.get(num);
        }
        x3 x3Var = new x3(this, this.f22664d);
        this.f22666f.put(num, x3Var);
        return x3Var;
    }

    @Override // s7.l3
    public final void m() {
    }
}
