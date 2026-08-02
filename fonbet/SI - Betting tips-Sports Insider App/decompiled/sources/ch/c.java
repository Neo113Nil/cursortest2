package ch;

import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.y;
import com.logrocket.protobuf.y0;
import com.logrocket.protobuf.z;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class c extends z {
    private static final c DEFAULT_INSTANCE;
    private static volatile y0 PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private long timestamp_;
    private double value_;

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        z.n(c.class, cVar);
    }

    public static void p(c cVar, double d10) {
        cVar.value_ = d10;
    }

    public static void q(c cVar, long j) {
        cVar.timestamp_ = j;
    }

    public static b r() {
        return (b) DEFAULT_INSTANCE.f();
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f3944a[v.f.d(i5)]) {
            case 1:
                return new c();
            case 2:
                return new b(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0000", new Object[]{"timestamp_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0 y0Var2 = PARSER;
                if (y0Var2 != null) {
                    return y0Var2;
                }
                synchronized (c.class) {
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
