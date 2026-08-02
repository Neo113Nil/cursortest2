package dh;

import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.y;
import com.logrocket.protobuf.y0;
import com.logrocket.protobuf.z;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class f extends z {
    public static final int BITMAPID_FIELD_NUMBER = 1;
    public static final int COMPRESSEDBYTES_FIELD_NUMBER = 3;
    private static final f DEFAULT_INSTANCE;
    public static final int ORIGINALBYTES_FIELD_NUMBER = 2;
    private static volatile y0 PARSER;
    private int bitmapId_;
    private int compressedBytes_;
    private int originalBytes_;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        z.n(f.class, fVar);
    }

    public static void p(f fVar, int i5) {
        fVar.bitmapId_ = i5;
    }

    public static void q(f fVar, int i5) {
        fVar.originalBytes_ = i5;
    }

    public static void r(f fVar, int i5) {
        fVar.compressedBytes_ = i5;
    }

    public static e s() {
        return (e) DEFAULT_INSTANCE.f();
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f8380a[v.f.d(i5)]) {
            case 1:
                return new f();
            case 2:
                return new e(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b", new Object[]{"bitmapId_", "originalBytes_", "compressedBytes_"});
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
}
