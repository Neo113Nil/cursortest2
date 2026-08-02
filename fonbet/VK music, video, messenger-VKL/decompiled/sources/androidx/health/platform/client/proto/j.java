package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.GeneratedMessageLite;
import androidx.health.platform.client.proto.b0;
import java.util.Collections;
import java.util.Map;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.gj90;
import xsna.jye0;
import xsna.ma20;

/* compiled from: DataProto.java */
/* loaded from: classes12.dex */
public final class j extends GeneratedMessageLite<j, a> implements ma20 {
    public static final int DATA_ORIGINS_FIELD_NUMBER = 8;
    private static final j DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUES_FIELD_NUMBER = 6;
    public static final int END_LOCAL_DATE_TIME_FIELD_NUMBER = 4;
    public static final int END_TIME_EPOCH_MS_FIELD_NUMBER = 2;
    public static final int LONG_VALUES_FIELD_NUMBER = 7;
    private static volatile gj90<j> PARSER = null;
    public static final int START_LOCAL_DATE_TIME_FIELD_NUMBER = 3;
    public static final int START_TIME_EPOCH_MS_FIELD_NUMBER = 1;
    public static final int ZONE_OFFSET_SECONDS_FIELD_NUMBER = 5;
    private int bitField0_;
    private b0.d<l> dataOrigins_;
    private MapFieldLite<String, Double> doubleValues_;
    private String endLocalDateTime_;
    private long endTimeEpochMs_;
    private MapFieldLite<String, Long> longValues_;
    private String startLocalDateTime_;
    private long startTimeEpochMs_;
    private int zoneOffsetSeconds_;

    /* compiled from: DataProto.java */
    public static final class a extends GeneratedMessageLite.a<j, a> {
    }

    /* compiled from: DataProto.java */
    public static final class b {
        public static final f0<String, Double> a = new f0<>(WireFormat$FieldType.STRING, WireFormat$FieldType.DOUBLE, Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE));
    }

    /* compiled from: DataProto.java */
    public static final class c {
        public static final f0<String, Long> a = new f0<>(WireFormat$FieldType.STRING, WireFormat$FieldType.INT64, 0L);
    }

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        GeneratedMessageLite.r(j.class, jVar);
    }

    public j() {
        MapFieldLite mapFieldLite = MapFieldLite.b;
        this.doubleValues_ = mapFieldLite;
        this.longValues_ = mapFieldLite;
        this.startLocalDateTime_ = "";
        this.endLocalDateTime_ = "";
        this.dataOrigins_ = n0.e;
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object i(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        gj90 gj90Var;
        switch (i.a[methodToInvoke.ordinal()]) {
            case 1:
                return new j();
            case 2:
                return new a(DEFAULT_INSTANCE);
            case 3:
                return new jye0(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0002\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004\u00062\u00072\b\u001b", new Object[]{"bitField0_", "startTimeEpochMs_", "endTimeEpochMs_", "startLocalDateTime_", "endLocalDateTime_", "zoneOffsetSeconds_", "doubleValues_", b.a, "longValues_", c.a, "dataOrigins_", l.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                gj90<j> gj90Var2 = PARSER;
                if (gj90Var2 != null) {
                    return gj90Var2;
                }
                synchronized (j.class) {
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

    public final b0.d s() {
        return this.dataOrigins_;
    }

    public final Map<String, Double> t() {
        return Collections.unmodifiableMap(this.doubleValues_);
    }

    public final long u() {
        return this.endTimeEpochMs_;
    }

    public final Map<String, Long> v() {
        return Collections.unmodifiableMap(this.longValues_);
    }

    public final long w() {
        return this.startTimeEpochMs_;
    }

    public final int x() {
        return this.zoneOffsetSeconds_;
    }

    public final boolean y() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean z() {
        return (this.bitField0_ & 1) != 0;
    }
}
