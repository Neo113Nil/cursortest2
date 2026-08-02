package dh;

import com.logrocket.protobuf.b1;
import com.logrocket.protobuf.c0;
import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.y;
import com.logrocket.protobuf.y0;
import com.logrocket.protobuf.z;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class c extends z {
    public static final int BASEHREF_FIELD_NUMBER = 2;
    public static final int CONTENTHASHES_FIELD_NUMBER = 1;
    private static final c DEFAULT_INSTANCE;
    private static volatile y0 PARSER;
    private c0 contentHashes_ = b1.f6669d;
    private String baseHref_ = "";

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        z.n(c.class, cVar);
    }

    public static void p(c cVar, String str) {
        cVar.getClass();
        cVar.baseHref_ = str;
    }

    public static void q(c cVar, List list) {
        c0 c0Var = cVar.contentHashes_;
        if (!((com.logrocket.protobuf.b) c0Var).f6668a) {
            cVar.contentHashes_ = z.m(c0Var);
        }
        com.logrocket.protobuf.a.a(list, cVar.contentHashes_);
    }

    public static b r() {
        return (b) DEFAULT_INSTANCE.f();
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f8380a[v.f.d(i5)]) {
            case 1:
                return new c();
            case 2:
                return new b(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002Ȉ", new Object[]{"contentHashes_", "baseHref_"});
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
}
