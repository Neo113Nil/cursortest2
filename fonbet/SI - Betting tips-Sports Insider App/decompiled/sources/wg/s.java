package wg;

import com.logrocket.protobuf.b1;
import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.y0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class s extends com.logrocket.protobuf.z {
    private static final s DEFAULT_INSTANCE;
    public static final int EVENTS_FIELD_NUMBER = 1;
    private static volatile y0 PARSER;
    private com.logrocket.protobuf.c0 events_ = b1.f6669d;

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        com.logrocket.protobuf.z.n(s.class, sVar);
    }

    public static void p(s sVar, q qVar) {
        sVar.getClass();
        com.logrocket.protobuf.c0 c0Var = sVar.events_;
        if (!((com.logrocket.protobuf.b) c0Var).f6668a) {
            sVar.events_ = com.logrocket.protobuf.z.m(c0Var);
        }
        sVar.events_.add(qVar);
    }

    public static r q() {
        return (r) DEFAULT_INSTANCE.f();
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f25261a[v.f.d(i5)]) {
            case 1:
                return new s();
            case 2:
                return new r(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"events_", q.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0 y0Var2 = PARSER;
                if (y0Var2 != null) {
                    return y0Var2;
                }
                synchronized (s.class) {
                    try {
                        y0Var = PARSER;
                        if (y0Var == null) {
                            y0Var = new com.logrocket.protobuf.y();
                            PARSER = y0Var;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return y0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
