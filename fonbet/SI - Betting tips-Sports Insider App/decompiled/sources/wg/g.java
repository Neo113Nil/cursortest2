package wg;

import com.logrocket.protobuf.b1;
import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.y0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class g extends com.logrocket.protobuf.z {
    public static final int CLASSLIST_FIELD_NUMBER = 3;
    private static final g DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 2;
    public static final int NODENAME_FIELD_NUMBER = 1;
    public static final int NTHCHILD_FIELD_NUMBER = 4;
    private static volatile y0 PARSER;
    private int nthChild_;
    private String nodeName_ = "";
    private String id_ = "";
    private com.logrocket.protobuf.c0 classList_ = b1.f6669d;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        com.logrocket.protobuf.z.n(g.class, gVar);
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f25261a[v.f.d(i5)]) {
            case 1:
                return new g();
            case 2:
                return new bh.f(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ț\u0004\u0004", new Object[]{"nodeName_", "id_", "classList_", "nthChild_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0 y0Var2 = PARSER;
                if (y0Var2 != null) {
                    return y0Var2;
                }
                synchronized (g.class) {
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
