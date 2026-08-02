package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.GeneratedMessageLite;
import androidx.health.platform.client.proto.b0;
import java.util.ArrayList;
import xsna.gj90;
import xsna.jye0;
import xsna.ma20;

/* compiled from: RequestProto.java */
/* loaded from: classes12.dex */
public final class r0 extends GeneratedMessageLite<r0, a> implements ma20 {
    public static final int ASC_ORDERING_FIELD_NUMBER = 7;
    public static final int DATA_ORIGIN_FILTERS_FIELD_NUMBER = 3;
    public static final int DATA_TYPE_FIELD_NUMBER = 2;
    private static final r0 DEFAULT_INSTANCE;
    public static final int LIMIT_FIELD_NUMBER = 4;
    public static final int PAGE_SIZE_FIELD_NUMBER = 5;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 6;
    private static volatile gj90<r0> PARSER = null;
    public static final int TIME_SPEC_FIELD_NUMBER = 1;
    private int bitField0_;
    private n dataType_;
    private int limit_;
    private int pageSize_;
    private b1 timeSpec_;
    private b0.d<l> dataOriginFilters_ = n0.e;
    private boolean ascOrdering_ = true;
    private String pageToken_ = "";

    /* compiled from: RequestProto.java */
    public static final class a extends GeneratedMessageLite.a<r0, a> {
        public a() {
            super(r0.DEFAULT_INSTANCE);
        }
    }

    static {
        r0 r0Var = new r0();
        DEFAULT_INSTANCE = r0Var;
        GeneratedMessageLite.r(r0.class, r0Var);
    }

    public static r0 A(byte[] bArr) throws InvalidProtocolBufferException {
        return (r0) GeneratedMessageLite.q(DEFAULT_INSTANCE, bArr);
    }

    public static void t(r0 r0Var, b1 b1Var) {
        r0Var.getClass();
        r0Var.timeSpec_ = b1Var;
        r0Var.bitField0_ |= 1;
    }

    public static void u(r0 r0Var, n nVar) {
        r0Var.getClass();
        r0Var.dataType_ = nVar;
        r0Var.bitField0_ |= 2;
    }

    public static void v(r0 r0Var, ArrayList arrayList) {
        b0.d<l> dVar = r0Var.dataOriginFilters_;
        if (!dVar.isModifiable()) {
            int size = dVar.size();
            r0Var.dataOriginFilters_ = dVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        }
        androidx.health.platform.client.proto.a.c(arrayList, r0Var.dataOriginFilters_);
    }

    public static void w(r0 r0Var, boolean z) {
        r0Var.bitField0_ |= 4;
        r0Var.ascOrdering_ = z;
    }

    public static void x(r0 r0Var, int i) {
        r0Var.bitField0_ |= 16;
        r0Var.pageSize_ = i;
    }

    public static void y(r0 r0Var, String str) {
        r0Var.getClass();
        str.getClass();
        r0Var.bitField0_ |= 32;
        r0Var.pageToken_ = str;
    }

    public static a z() {
        return DEFAULT_INSTANCE.h();
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object i(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        gj90 gj90Var;
        switch (o0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new r0();
            case 2:
                return new a();
            case 3:
                return new jye0(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004င\u0003\u0005င\u0004\u0006ဈ\u0005\u0007ဇ\u0002", new Object[]{"bitField0_", "timeSpec_", "dataType_", "dataOriginFilters_", l.class, "limit_", "pageSize_", "pageToken_", "ascOrdering_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                gj90<r0> gj90Var2 = PARSER;
                if (gj90Var2 != null) {
                    return gj90Var2;
                }
                synchronized (r0.class) {
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
