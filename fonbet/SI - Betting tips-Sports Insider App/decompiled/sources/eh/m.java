package eh;

import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.y;
import com.logrocket.protobuf.y0;
import com.logrocket.protobuf.z;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class m extends z {
    private static final m DEFAULT_INSTANCE;
    private static volatile y0 PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    public static final int USEDHEAP_FIELD_NUMBER = 1;
    private long timestamp_;
    private float usedHeap_;

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        z.n(m.class, mVar);
    }

    public static void p(m mVar, float f6) {
        mVar.usedHeap_ = f6;
    }

    public static void q(m mVar, long j) {
        mVar.timestamp_ = j;
    }

    public static l r() {
        return (l) DEFAULT_INSTANCE.f();
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f9247a[v.f.d(i5)]) {
            case 1:
                return new m();
            case 2:
                return new l(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0002\u0002", new Object[]{"usedHeap_", "timestamp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0 y0Var2 = PARSER;
                if (y0Var2 != null) {
                    return y0Var2;
                }
                synchronized (m.class) {
                    try {
                        y0Var = PARSER;
                        if (y0Var == null) {
                            y0Var = new y();
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
