package eh;

import com.logrocket.protobuf.b1;
import com.logrocket.protobuf.c0;
import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.y;
import com.logrocket.protobuf.y0;
import com.logrocket.protobuf.z;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class r extends z {
    private static final r DEFAULT_INSTANCE;
    public static final int MEASUREMENTS_FIELD_NUMBER = 1;
    private static volatile y0 PARSER = null;
    public static final int URL_FIELD_NUMBER = 2;
    private c0 measurements_ = b1.f6669d;
    private String url_ = "";

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        z.n(r.class, rVar);
    }

    public static void p(r rVar, q qVar) {
        rVar.getClass();
        c0 c0Var = rVar.measurements_;
        if (!((com.logrocket.protobuf.b) c0Var).f6668a) {
            rVar.measurements_ = z.m(c0Var);
        }
        rVar.measurements_.add(qVar);
    }

    public static void q(r rVar, String str) {
        rVar.getClass();
        rVar.url_ = str;
    }

    public static o t() {
        return (o) DEFAULT_INSTANCE.f();
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f9247a[v.f.d(i5)]) {
            case 1:
                return new r();
            case 2:
                return new o(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", new Object[]{"measurements_", q.class, "url_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0 y0Var2 = PARSER;
                if (y0Var2 != null) {
                    return y0Var2;
                }
                synchronized (r.class) {
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

    public final int r() {
        return this.measurements_.size();
    }

    public final String s() {
        return this.url_;
    }
}
