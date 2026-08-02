package eh;

import com.logrocket.protobuf.b1;
import com.logrocket.protobuf.c0;
import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.y;
import com.logrocket.protobuf.y0;
import com.logrocket.protobuf.z;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class n extends z {
    private static final n DEFAULT_INSTANCE;
    public static final int MEASUREMENTS_FIELD_NUMBER = 1;
    private static volatile y0 PARSER = null;
    public static final int URL_FIELD_NUMBER = 2;
    private c0 measurements_ = b1.f6669d;
    private String url_ = "";

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        z.n(n.class, nVar);
    }

    public static void p(n nVar) {
        nVar.getClass();
        nVar.measurements_ = b1.f6669d;
    }

    public static void q(n nVar, m mVar) {
        nVar.getClass();
        c0 c0Var = nVar.measurements_;
        if (!((com.logrocket.protobuf.b) c0Var).f6668a) {
            nVar.measurements_ = z.m(c0Var);
        }
        nVar.measurements_.add(mVar);
    }

    public static void r(n nVar, String str) {
        nVar.getClass();
        str.getClass();
        nVar.url_ = str;
    }

    public static k t() {
        return (k) DEFAULT_INSTANCE.f();
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f9247a[v.f.d(i5)]) {
            case 1:
                return new n();
            case 2:
                return new k(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", new Object[]{"measurements_", m.class, "url_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0 y0Var2 = PARSER;
                if (y0Var2 != null) {
                    return y0Var2;
                }
                synchronized (n.class) {
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

    public final int s() {
        return this.measurements_.size();
    }
}
