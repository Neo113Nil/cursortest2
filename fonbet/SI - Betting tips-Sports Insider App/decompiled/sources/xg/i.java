package xg;

import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.y;
import com.logrocket.protobuf.y0;
import com.logrocket.protobuf.z;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class i extends z {
    public static final int CONTENTS_FIELD_NUMBER = 1;
    private static final i DEFAULT_INSTANCE;
    public static final int DENSITY_FIELD_NUMBER = 4;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    private static volatile y0 PARSER = null;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private com.logrocket.protobuf.j contents_ = com.logrocket.protobuf.j.f6736b;
    private int density_;
    private int height_;
    private int width_;

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        z.n(i.class, iVar);
    }

    public static void p(i iVar, com.logrocket.protobuf.i iVar2) {
        iVar.getClass();
        iVar.contents_ = iVar2;
    }

    public static i q() {
        return DEFAULT_INSTANCE;
    }

    public static h r() {
        return (h) DEFAULT_INSTANCE.f();
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f25474a[v.f.d(i5)]) {
            case 1:
                return new i();
            case 2:
                return new h(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002\u000b\u0003\u000b\u0004\u000b", new Object[]{"contents_", "width_", "height_", "density_"});
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
}
