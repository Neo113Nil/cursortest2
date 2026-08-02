package xg;

import com.logrocket.protobuf.b1;
import com.logrocket.protobuf.c0;
import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.y;
import com.logrocket.protobuf.y0;
import com.logrocket.protobuf.z;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class p extends z {
    public static final int CLASSLIST_FIELD_NUMBER = 3;
    private static final p DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 2;
    public static final int NODENAME_FIELD_NUMBER = 1;
    private static volatile y0 PARSER;
    private String nodeName_ = "";
    private String id_ = "";
    private c0 classList_ = b1.f6669d;

    static {
        p pVar = new p();
        DEFAULT_INSTANCE = pVar;
        z.n(p.class, pVar);
    }

    public static void p(p pVar, String str) {
        pVar.getClass();
        pVar.id_ = str;
    }

    public static void q(p pVar, String str) {
        pVar.getClass();
        str.getClass();
        c0 c0Var = pVar.classList_;
        if (!((com.logrocket.protobuf.b) c0Var).f6668a) {
            pVar.classList_ = z.m(c0Var);
        }
        pVar.classList_.add(str);
    }

    public static void r(p pVar, String str) {
        pVar.getClass();
        str.getClass();
        pVar.nodeName_ = str;
    }

    public static o w() {
        return (o) DEFAULT_INSTANCE.f();
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f25474a[v.f.d(i5)]) {
            case 1:
                return new p();
            case 2:
                return new o(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ț", new Object[]{"nodeName_", "id_", "classList_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0 y0Var2 = PARSER;
                if (y0Var2 != null) {
                    return y0Var2;
                }
                synchronized (p.class) {
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

    public final String s() {
        return (String) this.classList_.get(0);
    }

    public final int t() {
        return this.classList_.size();
    }

    public final String u() {
        return this.id_;
    }

    public final String v() {
        return this.nodeName_;
    }
}
