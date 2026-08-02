package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.GeneratedMessageLite;
import java.util.Collections;
import java.util.Map;
import xsna.gj90;
import xsna.jye0;
import xsna.ma20;

/* compiled from: DataProto.java */
/* loaded from: classes12.dex */
public final class p extends GeneratedMessageLite<p, a> implements ma20 {
    private static final p DEFAULT_INSTANCE;
    public static final int INSTANT_TIME_MILLIS_FIELD_NUMBER = 2;
    private static volatile gj90<p> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private int bitField0_;
    private long instantTimeMillis_;
    private MapFieldLite<String, r> values_ = MapFieldLite.b;

    /* compiled from: DataProto.java */
    public static final class a extends GeneratedMessageLite.a<p, a> {
    }

    /* compiled from: DataProto.java */
    public static final class b {
        public static final f0<String, r> a = new f0<>(WireFormat$FieldType.STRING, WireFormat$FieldType.MESSAGE, r.t());
    }

    static {
        p pVar = new p();
        DEFAULT_INSTANCE = pVar;
        GeneratedMessageLite.r(p.class, pVar);
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object i(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        gj90 gj90Var;
        switch (i.a[methodToInvoke.ordinal()]) {
            case 1:
                return new p();
            case 2:
                return new a(DEFAULT_INSTANCE);
            case 3:
                return new jye0(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u00012\u0002ဂ\u0000", new Object[]{"bitField0_", "values_", b.a, "instantTimeMillis_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                gj90<p> gj90Var2 = PARSER;
                if (gj90Var2 != null) {
                    return gj90Var2;
                }
                synchronized (p.class) {
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

    public final long s() {
        return this.instantTimeMillis_;
    }

    public final Map<String, r> t() {
        return Collections.unmodifiableMap(this.values_);
    }
}
