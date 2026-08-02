package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.GeneratedMessageLite;
import xsna.gj90;
import xsna.jye0;
import xsna.ma20;

/* compiled from: TimeProto.java */
/* loaded from: classes12.dex */
public final class b1 extends GeneratedMessageLite<b1, a> implements ma20 {
    private static final b1 DEFAULT_INSTANCE;
    public static final int END_LOCAL_DATE_TIME_FIELD_NUMBER = 4;
    public static final int END_TIME_EPOCH_MS_FIELD_NUMBER = 2;
    private static volatile gj90<b1> PARSER = null;
    public static final int START_LOCAL_DATE_TIME_FIELD_NUMBER = 3;
    public static final int START_TIME_EPOCH_MS_FIELD_NUMBER = 1;
    private int bitField0_;
    private long endTimeEpochMs_;
    private long startTimeEpochMs_;
    private String startLocalDateTime_ = "";
    private String endLocalDateTime_ = "";

    /* compiled from: TimeProto.java */
    public static final class a extends GeneratedMessageLite.a<b1, a> {
        public a() {
            super(b1.DEFAULT_INSTANCE);
        }
    }

    static {
        b1 b1Var = new b1();
        DEFAULT_INSTANCE = b1Var;
        GeneratedMessageLite.r(b1.class, b1Var);
    }

    public static void t(b1 b1Var, long j) {
        b1Var.bitField0_ |= 1;
        b1Var.startTimeEpochMs_ = j;
    }

    public static void u(b1 b1Var, long j) {
        b1Var.bitField0_ |= 2;
        b1Var.endTimeEpochMs_ = j;
    }

    public static void v(b1 b1Var, String str) {
        b1Var.getClass();
        str.getClass();
        b1Var.bitField0_ |= 4;
        b1Var.startLocalDateTime_ = str;
    }

    public static void w(b1 b1Var, String str) {
        b1Var.getClass();
        str.getClass();
        b1Var.bitField0_ |= 8;
        b1Var.endLocalDateTime_ = str;
    }

    public static a x() {
        return DEFAULT_INSTANCE.h();
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object i(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        gj90 gj90Var;
        switch (a1.a[methodToInvoke.ordinal()]) {
            case 1:
                return new b1();
            case 2:
                return new a();
            case 3:
                return new jye0(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "startTimeEpochMs_", "endTimeEpochMs_", "startLocalDateTime_", "endLocalDateTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                gj90<b1> gj90Var2 = PARSER;
                if (gj90Var2 != null) {
                    return gj90Var2;
                }
                synchronized (b1.class) {
                    try {
                        gj90Var = PARSER;
                        if (gj90Var == null) {
                            gj90Var = new GeneratedMessageLite.b();
                            PARSER = gj90Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return gj90Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
