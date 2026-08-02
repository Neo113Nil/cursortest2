package eh;

import com.logrocket.protobuf.b1;
import com.logrocket.protobuf.c0;
import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.y;
import com.logrocket.protobuf.y0;
import com.logrocket.protobuf.z;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class f extends z {
    private static final f DEFAULT_INSTANCE;
    public static final int MEASUREMENTS_FIELD_NUMBER = 2;
    private static volatile y0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int URL_FIELD_NUMBER = 3;
    private int type_;
    private c0 measurements_ = b1.f6669d;
    private String url_ = "";

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        z.n(f.class, fVar);
    }

    public static void p(f fVar, int i5) {
        fVar.getClass();
        if (i5 == 4) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        int i10 = 1;
        if (i5 == 1) {
            i10 = 0;
        } else if (i5 != 2) {
            if (i5 == 3) {
                i10 = 2;
            } else {
                if (i5 != 4) {
                    throw null;
                }
                i10 = -1;
            }
        }
        fVar.type_ = i10;
    }

    public static void q(f fVar, e eVar) {
        fVar.getClass();
        c0 c0Var = fVar.measurements_;
        if (!((com.logrocket.protobuf.b) c0Var).f6668a) {
            fVar.measurements_ = z.m(c0Var);
        }
        fVar.measurements_.add(eVar);
    }

    public static void r(f fVar, String str) {
        fVar.getClass();
        str.getClass();
        fVar.url_ = str;
    }

    public static void s(f fVar, int i5) {
        c0 c0Var = fVar.measurements_;
        if (!((com.logrocket.protobuf.b) c0Var).f6668a) {
            fVar.measurements_ = z.m(c0Var);
        }
        fVar.measurements_.remove(i5);
    }

    public static b v() {
        return (b) DEFAULT_INSTANCE.f();
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f9247a[v.f.d(i5)]) {
            case 1:
                return new f();
            case 2:
                return new b(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002\u001b\u0003Ȉ", new Object[]{"type_", "measurements_", e.class, "url_"});
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

    public final e t(int i5) {
        return (e) this.measurements_.get(i5);
    }

    public final int u() {
        return this.measurements_.size();
    }
}
