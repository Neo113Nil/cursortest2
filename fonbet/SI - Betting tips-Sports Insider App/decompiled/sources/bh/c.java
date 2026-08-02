package bh;

import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.y;
import com.logrocket.protobuf.y0;
import com.logrocket.protobuf.z;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class c extends z {
    public static final int BROWSERHREF_FIELD_NUMBER = 3;
    private static final c DEFAULT_INSTANCE;
    public static final int FILTERHASH_FIELD_NUMBER = 1;
    public static final int FILTERTYPE_FIELD_NUMBER = 2;
    private static volatile y0 PARSER = null;
    public static final int REFERRALHREF_FIELD_NUMBER = 4;
    public static final int TEXTCONTENT_FIELD_NUMBER = 5;
    private String filterHash_ = "";
    private String filterType_ = "";
    private String browserHref_ = "";
    private String referralHref_ = "";
    private String textContent_ = "";

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        z.n(c.class, cVar);
    }

    public static void p(c cVar, String str) {
        cVar.getClass();
        str.getClass();
        cVar.filterHash_ = str;
    }

    public static void q(c cVar, String str) {
        cVar.getClass();
        str.getClass();
        cVar.filterType_ = str;
    }

    public static void r(c cVar, String str) {
        cVar.getClass();
        str.getClass();
        cVar.browserHref_ = str;
    }

    public static void s(c cVar, String str) {
        cVar.getClass();
        str.getClass();
        cVar.textContent_ = str;
    }

    public static b t() {
        return (b) DEFAULT_INSTANCE.f();
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f3226a[v.f.d(i5)]) {
            case 1:
                return new c();
            case 2:
                return new b(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"filterHash_", "filterType_", "browserHref_", "referralHref_", "textContent_"});
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
