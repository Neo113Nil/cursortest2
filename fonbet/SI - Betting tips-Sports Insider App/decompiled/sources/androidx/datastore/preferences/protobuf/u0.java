package androidx.datastore.preferences.protobuf;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final u0 f1715c = new u0();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f1717b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final h0 f1716a = new h0();

    public final x0 a(Class cls) {
        x0 w10;
        Class cls2;
        a0.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f1717b;
        x0 x0Var = (x0) concurrentHashMap.get(cls);
        if (x0Var != null) {
            return x0Var;
        }
        h0 h0Var = this.f1716a;
        h0Var.getClass();
        Class cls3 = y0.f1729a;
        if (!y.class.isAssignableFrom(cls) && (cls2 = y0.f1729a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        w0 a7 = ((g0) h0Var.f1616a).a(cls);
        int i5 = a7.f1728d;
        a aVar = a7.f1725a;
        if ((i5 & 2) == 2) {
            if (y.class.isAssignableFrom(cls)) {
                w10 = new q0(y0.f1731c, s.f1688a, aVar);
            } else {
                f1 f1Var = y0.f1730b;
                r rVar = s.f1689b;
                if (rVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                w10 = new q0(f1Var, rVar, aVar);
            }
        } else if (y.class.isAssignableFrom(cls)) {
            r rVar2 = null;
            r0 r0Var = s0.f1691b;
            e0 e0Var = f0.f1612b;
            f1 f1Var2 = y0.f1731c;
            if (v.f.d(a7.a()) != 1) {
                rVar2 = s.f1688a;
            }
            r rVar3 = rVar2;
            l0 l0Var = m0.f1658b;
            if (!(a7 instanceof w0)) {
                int[] iArr = p0.f1669n;
                a7.getClass();
                throw new ClassCastException();
            }
            w10 = p0.w(a7, r0Var, e0Var, f1Var2, rVar3, l0Var);
        } else {
            r rVar4 = null;
            r0 r0Var2 = s0.f1690a;
            e0 e0Var2 = f0.f1611a;
            f1 f1Var3 = y0.f1730b;
            if (v.f.d(a7.a()) != 1 && (rVar4 = s.f1689b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            r rVar5 = rVar4;
            l0 l0Var2 = m0.f1657a;
            if (!(a7 instanceof w0)) {
                int[] iArr2 = p0.f1669n;
                a7.getClass();
                throw new ClassCastException();
            }
            w10 = p0.w(a7, r0Var2, e0Var2, f1Var3, rVar5, l0Var2);
        }
        x0 x0Var2 = (x0) concurrentHashMap.putIfAbsent(cls, w10);
        return x0Var2 != null ? x0Var2 : w10;
    }
}
