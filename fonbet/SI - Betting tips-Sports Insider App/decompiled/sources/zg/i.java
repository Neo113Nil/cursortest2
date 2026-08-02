package zg;

import com.logrocket.protobuf.b1;
import com.logrocket.protobuf.c0;
import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.y;
import com.logrocket.protobuf.y0;
import com.logrocket.protobuf.z;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class i extends z {
    public static final int ARGS_FIELD_NUMBER = 2;
    private static final i DEFAULT_INSTANCE;
    public static final int LOGLEVEL_FIELD_NUMBER = 1;
    private static volatile y0 PARSER = null;
    public static final int TAG_FIELD_NUMBER = 3;
    private int logLevel_;
    private c0 args_ = b1.f6669d;
    private String tag_ = "";

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        z.n(i.class, iVar);
    }

    public static void p(i iVar) {
        iVar.getClass();
        iVar.tag_ = "LogRocket";
    }

    public static void q(i iVar, int i5) {
        int i10;
        iVar.getClass();
        if (i5 == 6) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        switch (i5) {
            case 1:
                i10 = 0;
                break;
            case 2:
                i10 = 1;
                break;
            case 3:
                i10 = 2;
                break;
            case 4:
                i10 = 3;
                break;
            case 5:
                i10 = 4;
                break;
            case 6:
                i10 = -1;
                break;
            default:
                throw null;
        }
        iVar.logLevel_ = i10;
    }

    public static void r(i iVar, fh.c cVar) {
        iVar.getClass();
        c0 c0Var = iVar.args_;
        if (!((com.logrocket.protobuf.b) c0Var).f6668a) {
            iVar.args_ = z.m(c0Var);
        }
        iVar.args_.add(cVar);
    }

    public static h u() {
        return (h) DEFAULT_INSTANCE.f();
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f25984a[v.f.d(i5)]) {
            case 1:
                return new i();
            case 2:
                return new h(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002\u001b\u0003Ȉ", new Object[]{"logLevel_", "args_", fh.c.class, "tag_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0 y0Var2 = PARSER;
                if (y0Var2 != null) {
                    return y0Var2;
                }
                synchronized (i.class) {
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

    public final fh.c s() {
        return (fh.c) this.args_.get(0);
    }

    public final int t() {
        int i5 = this.logLevel_;
        int i10 = 1;
        if (i5 != 0) {
            int i11 = 2;
            if (i5 != 1) {
                i10 = 3;
                if (i5 != 2) {
                    i11 = 4;
                    if (i5 != 3) {
                        i10 = i5 != 4 ? 0 : 5;
                    }
                }
            }
            i10 = i11;
        }
        if (i10 == 0) {
            return 6;
        }
        return i10;
    }
}
