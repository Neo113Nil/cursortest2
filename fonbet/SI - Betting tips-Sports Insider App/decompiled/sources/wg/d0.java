package wg;

import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.y0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class d0 extends com.logrocket.protobuf.z {
    private static final d0 DEFAULT_INSTANCE;
    public static final int HASDESK_FIELD_NUMBER = 3;
    public static final int HASINTERCOM_FIELD_NUMBER = 1;
    public static final int HASZENDESKCHAT_FIELD_NUMBER = 4;
    public static final int HASZENDESK_FIELD_NUMBER = 2;
    private static volatile y0 PARSER;
    private boolean hasDesk_;
    private boolean hasIntercom_;
    private boolean hasZendeskChat_;
    private boolean hasZendesk_;

    static {
        d0 d0Var = new d0();
        DEFAULT_INSTANCE = d0Var;
        com.logrocket.protobuf.z.n(d0.class, d0Var);
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f25261a[v.f.d(i5)]) {
            case 1:
                return new d0();
            case 2:
                return new bh.f(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"hasIntercom_", "hasZendesk_", "hasDesk_", "hasZendeskChat_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0 y0Var2 = PARSER;
                if (y0Var2 != null) {
                    return y0Var2;
                }
                synchronized (d0.class) {
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
