package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.GeneratedMessageLite;
import androidx.health.platform.client.proto.b0;
import java.util.ArrayList;
import xsna.gj90;
import xsna.jye0;
import xsna.ma20;

/* compiled from: RequestProto.java */
/* loaded from: classes12.dex */
public final class p0 extends GeneratedMessageLite<p0, a> implements ma20 {
    public static final int DATA_ORIGIN_FIELD_NUMBER = 3;
    private static final p0 DEFAULT_INSTANCE;
    public static final int METRIC_SPEC_FIELD_NUMBER = 2;
    private static volatile gj90<p0> PARSER = null;
    public static final int SLICE_DURATION_MILLIS_FIELD_NUMBER = 4;
    public static final int SLICE_PERIOD_FIELD_NUMBER = 5;
    public static final int TIME_SPEC_FIELD_NUMBER = 1;
    private int bitField0_;
    private b0.d<l> dataOrigin_;
    private b0.d<q0> metricSpec_;
    private long sliceDurationMillis_;
    private String slicePeriod_;
    private b1 timeSpec_;

    /* compiled from: RequestProto.java */
    public static final class a extends GeneratedMessageLite.a<p0, a> {
        public a() {
            super(p0.DEFAULT_INSTANCE);
        }
    }

    static {
        p0 p0Var = new p0();
        DEFAULT_INSTANCE = p0Var;
        GeneratedMessageLite.r(p0.class, p0Var);
    }

    public p0() {
        n0<Object> n0Var = n0.e;
        this.metricSpec_ = n0Var;
        this.dataOrigin_ = n0Var;
        this.slicePeriod_ = "";
    }

    public static void t(p0 p0Var, b1 b1Var) {
        p0Var.getClass();
        p0Var.timeSpec_ = b1Var;
        p0Var.bitField0_ |= 1;
    }

    public static void u(p0 p0Var, ArrayList arrayList) {
        b0.d<q0> dVar = p0Var.metricSpec_;
        if (!dVar.isModifiable()) {
            int size = dVar.size();
            p0Var.metricSpec_ = dVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        }
        androidx.health.platform.client.proto.a.c(arrayList, p0Var.metricSpec_);
    }

    public static void v(p0 p0Var, ArrayList arrayList) {
        b0.d<l> dVar = p0Var.dataOrigin_;
        if (!dVar.isModifiable()) {
            int size = dVar.size();
            p0Var.dataOrigin_ = dVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        }
        androidx.health.platform.client.proto.a.c(arrayList, p0Var.dataOrigin_);
    }

    public static void w(p0 p0Var, long j) {
        p0Var.bitField0_ |= 2;
        p0Var.sliceDurationMillis_ = j;
    }

    public static a x() {
        return DEFAULT_INSTANCE.h();
    }

    public static p0 y(byte[] bArr) throws InvalidProtocolBufferException {
        return (p0) GeneratedMessageLite.q(DEFAULT_INSTANCE, bArr);
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object i(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        gj90 gj90Var;
        switch (o0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new p0();
            case 2:
                return new a();
            case 3:
                return new jye0(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဈ\u0002", new Object[]{"bitField0_", "timeSpec_", "metricSpec_", q0.class, "dataOrigin_", l.class, "sliceDurationMillis_", "slicePeriod_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                gj90<p0> gj90Var2 = PARSER;
                if (gj90Var2 != null) {
                    return gj90Var2;
                }
                synchronized (p0.class) {
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
