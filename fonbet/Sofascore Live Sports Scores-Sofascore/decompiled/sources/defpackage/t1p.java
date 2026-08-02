package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class t1p implements nap {
    @Override // defpackage.nap
    public final map a(h9p h9pVar, z6n z6nVar) {
        Class cls = z6nVar.a;
        q1p q1pVar = (q1p) cls.getAnnotation(q1p.class);
        if (q1pVar == null || cls == q1pVar.zza()) {
            return null;
        }
        return h9pVar.b(new z6n(q1pVar.zza()));
    }
}
