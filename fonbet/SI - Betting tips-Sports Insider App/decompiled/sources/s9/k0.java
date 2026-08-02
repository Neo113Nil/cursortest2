package s9;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: c, reason: collision with root package name */
    public static final k0 f23346c = new k0();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f23348b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final z f23347a = new z();

    public final n0 a(Class cls) {
        n0 u10;
        t.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f23348b;
        n0 n0Var = (n0) concurrentHashMap.get(cls);
        if (n0Var != null) {
            return n0Var;
        }
        z zVar = this.f23347a;
        zVar.getClass();
        Class cls2 = o0.f23362a;
        if (!r.class.isAssignableFrom(cls)) {
            Class cls3 = c.f23286a;
            Class cls4 = o0.f23362a;
            if (cls4 != null && !cls4.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
        m0 a7 = zVar.f23392a.a(cls);
        int i5 = a7.f23359d;
        a aVar = a7.f23356a;
        if ((i5 & 2) == 2) {
            Class cls5 = c.f23286a;
            if (r.class.isAssignableFrom(cls)) {
                u10 = new h0(o0.f23364c, o.f23360a, aVar);
            } else {
                r0 r0Var = o0.f23363b;
                n nVar = o.f23361b;
                if (nVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                u10 = new h0(r0Var, nVar, aVar);
            }
        } else {
            Class cls6 = c.f23286a;
            if (r.class.isAssignableFrom(cls)) {
                n nVar2 = null;
                i0 i0Var = j0.f23342b;
                w wVar = x.f23387b;
                r0 r0Var2 = o0.f23364c;
                if (v.f.d(a7.a()) != 1) {
                    nVar2 = o.f23360a;
                }
                n nVar3 = nVar2;
                c0 c0Var = d0.f23290b;
                if (!(a7 instanceof m0)) {
                    int[] iArr = g0.f23308n;
                    a7.getClass();
                    throw new ClassCastException();
                }
                u10 = g0.u(a7, i0Var, wVar, r0Var2, nVar3, c0Var);
            } else {
                n nVar4 = null;
                i0 i0Var2 = j0.f23341a;
                w wVar2 = x.f23386a;
                r0 r0Var3 = o0.f23363b;
                if (v.f.d(a7.a()) != 1 && (nVar4 = o.f23361b) == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                n nVar5 = nVar4;
                c0 c0Var2 = d0.f23289a;
                if (!(a7 instanceof m0)) {
                    int[] iArr2 = g0.f23308n;
                    a7.getClass();
                    throw new ClassCastException();
                }
                u10 = g0.u(a7, i0Var2, wVar2, r0Var3, nVar5, c0Var2);
            }
        }
        n0 n0Var2 = (n0) concurrentHashMap.putIfAbsent(cls, u10);
        return n0Var2 != null ? n0Var2 : u10;
    }
}
