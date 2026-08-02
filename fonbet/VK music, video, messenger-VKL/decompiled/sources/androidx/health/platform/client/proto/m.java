package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.GeneratedMessageLite;
import androidx.health.platform.client.proto.b0;
import java.util.Collections;
import java.util.Map;
import xsna.gj90;
import xsna.jye0;
import xsna.ma20;

/* compiled from: DataProto.java */
/* loaded from: classes12.dex */
public final class m extends GeneratedMessageLite<m, a> implements ma20 {
    public static final int AVG_FIELD_NUMBER = 18;
    public static final int CLIENT_ID_FIELD_NUMBER = 11;
    public static final int CLIENT_VERSION_FIELD_NUMBER = 12;
    public static final int DATA_ORIGIN_FIELD_NUMBER = 5;
    public static final int DATA_TYPE_FIELD_NUMBER = 1;
    private static final m DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 13;
    public static final int END_TIME_MILLIS_FIELD_NUMBER = 10;
    public static final int END_ZONE_OFFSET_SECONDS_FIELD_NUMBER = 20;
    public static final int INSTANT_TIME_MILLIS_FIELD_NUMBER = 8;
    public static final int MAX_FIELD_NUMBER = 17;
    public static final int MIN_FIELD_NUMBER = 16;
    public static final int ORIGIN_SAMPLE_UID_FIELD_NUMBER = 14;
    public static final int ORIGIN_SERIES_UID_FIELD_NUMBER = 4;
    private static volatile gj90<m> PARSER = null;
    public static final int RECORDING_METHOD_FIELD_NUMBER = 23;
    public static final int SERIES_VALUES_FIELD_NUMBER = 15;
    public static final int START_TIME_MILLIS_FIELD_NUMBER = 9;
    public static final int START_ZONE_OFFSET_SECONDS_FIELD_NUMBER = 19;
    public static final int SUB_TYPE_DATA_LISTS_FIELD_NUMBER = 22;
    public static final int UID_FIELD_NUMBER = 3;
    public static final int UPDATE_TIME_MILLIS_FIELD_NUMBER = 7;
    public static final int VALUES_FIELD_NUMBER = 2;
    public static final int ZONE_OFFSET_SECONDS_FIELD_NUMBER = 6;
    private k avg_;
    private int bitField0_;
    private String clientId_;
    private long clientVersion_;
    private l dataOrigin_;
    private n dataType_;
    private o device_;
    private long endTimeMillis_;
    private int endZoneOffsetSeconds_;
    private long instantTimeMillis_;
    private k max_;
    private k min_;
    private String originSampleUid_;
    private String originSeriesUid_;
    private int recordingMethod_;
    private b0.d<p> seriesValues_;
    private long startTimeMillis_;
    private int startZoneOffsetSeconds_;
    private MapFieldLite<String, b> subTypeDataLists_;
    private String uid_;
    private long updateTimeMillis_;
    private MapFieldLite<String, r> values_;
    private int zoneOffsetSeconds_;

    /* compiled from: DataProto.java */
    public static final class a extends GeneratedMessageLite.a<m, a> {
    }

    /* compiled from: DataProto.java */
    public static final class b extends GeneratedMessageLite<b, a> implements ma20 {
        private static final b DEFAULT_INSTANCE;
        private static volatile gj90<b> PARSER = null;
        public static final int VALUES_FIELD_NUMBER = 1;
        private b0.d<q> values_ = n0.e;

        /* compiled from: DataProto.java */
        public static final class a extends GeneratedMessageLite.a<b, a> {
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            GeneratedMessageLite.r(b.class, bVar);
        }

        public static b s() {
            return DEFAULT_INSTANCE;
        }

        @Override // androidx.health.platform.client.proto.GeneratedMessageLite
        public final Object i(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
            gj90 gj90Var;
            switch (i.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new b();
                case 2:
                    return new a(DEFAULT_INSTANCE);
                case 3:
                    return new jye0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", q.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    gj90<b> gj90Var2 = PARSER;
                    if (gj90Var2 != null) {
                        return gj90Var2;
                    }
                    synchronized (b.class) {
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

        public final b0.d t() {
            return this.values_;
        }
    }

    /* compiled from: DataProto.java */
    public static final class c {
        public static final f0<String, b> a = new f0<>(WireFormat$FieldType.STRING, WireFormat$FieldType.MESSAGE, b.s());
    }

    /* compiled from: DataProto.java */
    public static final class d {
        public static final f0<String, r> a = new f0<>(WireFormat$FieldType.STRING, WireFormat$FieldType.MESSAGE, r.t());
    }

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        GeneratedMessageLite.r(m.class, mVar);
    }

    public m() {
        MapFieldLite mapFieldLite = MapFieldLite.b;
        this.values_ = mapFieldLite;
        this.subTypeDataLists_ = mapFieldLite;
        this.uid_ = "";
        this.originSeriesUid_ = "";
        this.clientId_ = "";
        this.originSampleUid_ = "";
        this.seriesValues_ = n0.e;
    }

    public final int A() {
        return this.recordingMethod_;
    }

    public final b0.d B() {
        return this.seriesValues_;
    }

    public final long C() {
        return this.startTimeMillis_;
    }

    public final int D() {
        return this.startZoneOffsetSeconds_;
    }

    public final Map<String, b> E() {
        return Collections.unmodifiableMap(this.subTypeDataLists_);
    }

    public final String F() {
        return this.uid_;
    }

    public final long G() {
        return this.updateTimeMillis_;
    }

    public final Map<String, r> H() {
        return Collections.unmodifiableMap(this.values_);
    }

    public final int I() {
        return this.zoneOffsetSeconds_;
    }

    public final boolean J() {
        return (this.bitField0_ & 512) != 0;
    }

    public final boolean K() {
        return (this.bitField0_ & 2048) != 0;
    }

    public final boolean L() {
        return (this.bitField0_ & 131072) != 0;
    }

    public final boolean M() {
        return (this.bitField0_ & 65536) != 0;
    }

    public final boolean N() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean O() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // androidx.health.platform.client.proto.GeneratedMessageLite
    public final Object i(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        gj90 gj90Var;
        switch (i.a[methodToInvoke.ordinal()]) {
            case 1:
                return new m();
            case 2:
                return new a(DEFAULT_INSTANCE);
            case 3:
                return new jye0(DEFAULT_INSTANCE, "\u0001\u0016\u0000\u0001\u0001\u0017\u0016\u0002\u0001\u0000\u0001ဉ\u0000\u00022\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဉ\u0003\u0006င\u0004\u0007ဂ\u0005\bဂ\u0006\tဂ\u0007\nဂ\b\u000bဈ\t\fဂ\n\rဉ\u000b\u000eဈ\f\u000f\u001b\u0010ဉ\r\u0011ဉ\u000e\u0012ဉ\u000f\u0013င\u0010\u0014င\u0011\u00162\u0017င\u0012", new Object[]{"bitField0_", "dataType_", "values_", d.a, "uid_", "originSeriesUid_", "dataOrigin_", "zoneOffsetSeconds_", "updateTimeMillis_", "instantTimeMillis_", "startTimeMillis_", "endTimeMillis_", "clientId_", "clientVersion_", "device_", "originSampleUid_", "seriesValues_", p.class, "min_", "max_", "avg_", "startZoneOffsetSeconds_", "endZoneOffsetSeconds_", "subTypeDataLists_", c.a, "recordingMethod_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                gj90<m> gj90Var2 = PARSER;
                if (gj90Var2 != null) {
                    return gj90Var2;
                }
                synchronized (m.class) {
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

    public final String s() {
        return this.clientId_;
    }

    public final long t() {
        return this.clientVersion_;
    }

    public final l u() {
        l lVar = this.dataOrigin_;
        return lVar == null ? l.v() : lVar;
    }

    public final n v() {
        n nVar = this.dataType_;
        return nVar == null ? n.u() : nVar;
    }

    public final o w() {
        o oVar = this.device_;
        return oVar == null ? o.s() : oVar;
    }

    public final long x() {
        return this.endTimeMillis_;
    }

    public final int y() {
        return this.endZoneOffsetSeconds_;
    }

    public final long z() {
        return this.instantTimeMillis_;
    }
}
