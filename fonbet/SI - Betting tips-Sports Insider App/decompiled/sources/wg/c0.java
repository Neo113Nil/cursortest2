package wg;

import android.os.Build;
import com.logrocket.protobuf.c1;
import com.logrocket.protobuf.y0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class c0 extends com.logrocket.protobuf.z {
    private static final c0 DEFAULT_INSTANCE;
    public static final int DEVICENAME_FIELD_NUMBER = 2;
    public static final int DEVICETYPE_FIELD_NUMBER = 1;
    public static final int MANUFACTURER_FIELD_NUMBER = 3;
    public static final int NUMBEROFCPUCORES_FIELD_NUMBER = 5;
    private static volatile y0 PARSER = null;
    public static final int RELEASE_FIELD_NUMBER = 4;
    private int deviceType_;
    private int numberOfCpuCores_;
    private String deviceName_ = "";
    private String manufacturer_ = "";
    private String release_ = "";

    static {
        c0 c0Var = new c0();
        DEFAULT_INSTANCE = c0Var;
        com.logrocket.protobuf.z.n(c0.class, c0Var);
    }

    public static void p(c0 c0Var) {
        c0Var.getClass();
        c0Var.deviceType_ = 0;
    }

    public static void q(c0 c0Var) {
        String str = Build.MODEL;
        c0Var.getClass();
        str.getClass();
        c0Var.deviceName_ = str;
    }

    public static void r(c0 c0Var) {
        String str = Build.MANUFACTURER;
        c0Var.getClass();
        str.getClass();
        c0Var.manufacturer_ = str;
    }

    public static void s(c0 c0Var, int i5) {
        c0Var.numberOfCpuCores_ = i5;
    }

    public static void t(c0 c0Var) {
        String str = Build.VERSION.RELEASE;
        c0Var.getClass();
        str.getClass();
        c0Var.release_ = str;
    }

    public static b0 u() {
        return (b0) DEFAULT_INSTANCE.f();
    }

    @Override // com.logrocket.protobuf.z
    public final Object g(int i5) {
        y0 y0Var;
        switch (a.f25261a[v.f.d(i5)]) {
            case 1:
                return new c0();
            case 2:
                return new b0(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u000b", new Object[]{"deviceType_", "deviceName_", "manufacturer_", "release_", "numberOfCpuCores_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                y0 y0Var2 = PARSER;
                if (y0Var2 != null) {
                    return y0Var2;
                }
                synchronized (c0.class) {
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
