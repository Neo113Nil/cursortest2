package xg;

import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.p0;
import com.logrocket.protobuf.y;
import com.logrocket.protobuf.y0;
import com.logrocket.protobuf.z;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class l extends z {
    public static final int BITMAPS_FIELD_NUMBER = 1;
    private static final l DEFAULT_INSTANCE;
    private static volatile y0 PARSER;
    private p0 bitmaps_ = p0.f6776b;

    static {
        l lVar = new l();
        DEFAULT_INSTANCE = lVar;
        z.n(l.class, lVar);
    }

    public static p0 p(l lVar) {
        p0 p0Var = lVar.bitmaps_;
        if (!p0Var.f6777a) {
            lVar.bitmaps_ = p0Var.e();
        }
        return lVar.bitmaps_;
    }

    public static k q() {
        return (k) DEFAULT_INSTANCE.f();
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f25474a[v.f.d(i5)]) {
            case 1:
                return new l();
            case 2:
                return new k(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"bitmaps_", j.f25475a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0 y0Var2 = PARSER;
                if (y0Var2 != null) {
                    return y0Var2;
                }
                synchronized (l.class) {
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
