package xg;

import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.y;
import com.logrocket.protobuf.y0;
import com.logrocket.protobuf.z;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class c extends z {
    public static final int CLASSNAME_FIELD_NUMBER = 2;
    private static final c DEFAULT_INSTANCE;
    public static final int PACKAGENAME_FIELD_NUMBER = 1;
    private static volatile y0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 3;
    private int type_;
    private String packageName_ = "";
    private String className_ = "";

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        z.n(c.class, cVar);
    }

    public static void p(c cVar, int i5) {
        int i10;
        cVar.getClass();
        if (i5 == 9) {
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
                i10 = 5;
                break;
            case 7:
                i10 = 6;
                break;
            case 8:
                i10 = 7;
                break;
            case 9:
                i10 = -1;
                break;
            default:
                throw null;
        }
        cVar.type_ = i10;
    }

    public static void q(c cVar, String str) {
        cVar.getClass();
        str.getClass();
        cVar.packageName_ = str;
    }

    public static void r(c cVar, String str) {
        cVar.getClass();
        str.getClass();
        cVar.className_ = str;
    }

    public static b v() {
        return (b) DEFAULT_INSTANCE.f();
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f25474a[v.f.d(i5)]) {
            case 1:
                return new c();
            case 2:
                return new b(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f", new Object[]{"packageName_", "className_", "type_"});
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

    public final String s() {
        return this.className_;
    }

    public final String t() {
        return this.packageName_;
    }

    public final int u() {
        int i5;
        switch (this.type_) {
            case 0:
                i5 = 1;
                break;
            case 1:
                i5 = 2;
                break;
            case 2:
                i5 = 3;
                break;
            case 3:
                i5 = 4;
                break;
            case 4:
                i5 = 5;
                break;
            case 5:
                i5 = 6;
                break;
            case 6:
                i5 = 7;
                break;
            case 7:
                i5 = 8;
                break;
            default:
                i5 = 0;
                break;
        }
        if (i5 == 0) {
            return 9;
        }
        return i5;
    }
}
