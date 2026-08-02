package zg;

import com.logrocket.protobuf.b1;
import com.logrocket.protobuf.c0;
import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.y;
import com.logrocket.protobuf.y0;
import com.logrocket.protobuf.z;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class d extends z {
    public static final int ARCHITECTURE_FIELD_NUMBER = 2;
    private static final d DEFAULT_INSTANCE;
    public static final int MODULES_FIELD_NUMBER = 3;
    private static volatile y0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String architecture_ = "";
    private c0 modules_ = b1.f6669d;
    private int type_;

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        z.n(d.class, dVar);
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f25984a[v.f.d(i5)]) {
            case 1:
                return new d();
            case 2:
                return new bh.f(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003\u001b", new Object[]{"type_", "architecture_", "modules_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0 y0Var2 = PARSER;
                if (y0Var2 != null) {
                    return y0Var2;
                }
                synchronized (d.class) {
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
