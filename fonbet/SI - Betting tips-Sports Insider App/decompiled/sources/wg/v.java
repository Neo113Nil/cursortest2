package wg;

import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.p0;
import com.logrocket.protobuf.y0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class v extends com.logrocket.protobuf.z {
    private static final v DEFAULT_INSTANCE;
    public static final int EMAIL_FIELD_NUMBER = 3;
    public static final int ISANONYMOUS_FIELD_NUMBER = 4;
    public static final int ISUPDATE_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile y0 PARSER = null;
    public static final int TRAITS_FIELD_NUMBER = 5;
    public static final int USERID_FIELD_NUMBER = 1;
    private boolean isAnonymous_;
    private boolean isUpdate_;
    private p0 traits_ = p0.f6776b;
    private String userID_ = "";
    private String name_ = "";
    private String email_ = "";

    static {
        v vVar = new v();
        DEFAULT_INSTANCE = vVar;
        com.logrocket.protobuf.z.n(v.class, vVar);
    }

    public static void p(v vVar, String str) {
        vVar.getClass();
        str.getClass();
        vVar.userID_ = str;
    }

    public static void q(v vVar, boolean z5) {
        vVar.isAnonymous_ = z5;
    }

    public static void r(v vVar, String str) {
        vVar.getClass();
        vVar.name_ = str;
    }

    public static void s(v vVar, boolean z5) {
        vVar.isUpdate_ = z5;
    }

    public static void t(v vVar, String str) {
        vVar.getClass();
        vVar.email_ = str;
    }

    public static p0 u(v vVar) {
        p0 p0Var = vVar.traits_;
        if (!p0Var.f6777a) {
            vVar.traits_ = p0Var.e();
        }
        return vVar.traits_;
    }

    public static t v() {
        return (t) DEFAULT_INSTANCE.f();
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f25261a[v.f.d(i5)]) {
            case 1:
                return new v();
            case 2:
                return new t(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0007\u00052\u0006\u0007", new Object[]{"userID_", "name_", "email_", "isAnonymous_", "traits_", u.f25264a, "isUpdate_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0 y0Var2 = PARSER;
                if (y0Var2 != null) {
                    return y0Var2;
                }
                synchronized (v.class) {
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
