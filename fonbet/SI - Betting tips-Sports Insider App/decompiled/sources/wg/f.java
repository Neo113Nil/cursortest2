package wg;

import com.logrocket.protobuf.b1;
import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.y0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class f extends com.logrocket.protobuf.z {
    private static final f DEFAULT_INSTANCE;
    public static final int HREF_FIELD_NUMBER = 1;
    public static final int MAXSCROLL_FIELD_NUMBER = 2;
    public static final int NODEPATH_FIELD_NUMBER = 3;
    private static volatile y0 PARSER;
    private float maxScroll_;
    private String href_ = "";
    private com.logrocket.protobuf.c0 nodePath_ = b1.f6669d;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        com.logrocket.protobuf.z.n(f.class, fVar);
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f25261a[v.f.d(i5)]) {
            case 1:
                return new f();
            case 2:
                return new bh.f(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0001\u0003\u001b", new Object[]{"href_", "maxScroll_", "nodePath_", g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0 y0Var2 = PARSER;
                if (y0Var2 != null) {
                    return y0Var2;
                }
                synchronized (f.class) {
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
