package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class qv8 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final qv8 DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile Parser<qv8> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private mv8 gaugeMetadata_;
    private String sessionId_ = "";
    private Internal.ProtobufList<aw3> cpuMetricReadings_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<p10> androidMemoryReadings_ = GeneratedMessageLite.emptyProtobufList();

    static {
        qv8 qv8Var = new qv8();
        DEFAULT_INSTANCE = qv8Var;
        GeneratedMessageLite.registerDefaultInstance(qv8.class, qv8Var);
    }

    public static qv8 l() {
        return DEFAULT_INSTANCE;
    }

    public static pv8 o() {
        return (pv8) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (ov8.a[methodToInvoke.ordinal()]) {
            case 1:
                return new qv8();
            case 2:
                return new pv8(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", aw3.class, "gaugeMetadata_", "androidMemoryReadings_", p10.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<qv8> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (qv8.class) {
                    try {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            default:
                a70.i();
            case 7:
                return null;
        }
    }

    public final void h(p10 p10Var) {
        p10Var.getClass();
        Internal.ProtobufList<p10> protobufList = this.androidMemoryReadings_;
        if (!protobufList.isModifiable()) {
            this.androidMemoryReadings_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        this.androidMemoryReadings_.add(p10Var);
    }

    public final boolean hasSessionId() {
        return (this.bitField0_ & 1) != 0;
    }

    public final void i(aw3 aw3Var) {
        aw3Var.getClass();
        Internal.ProtobufList<aw3> protobufList = this.cpuMetricReadings_;
        if (!protobufList.isModifiable()) {
            this.cpuMetricReadings_ = GeneratedMessageLite.mutableCopy(protobufList);
        }
        this.cpuMetricReadings_.add(aw3Var);
    }

    public final int j() {
        return this.androidMemoryReadings_.size();
    }

    public final int k() {
        return this.cpuMetricReadings_.size();
    }

    public final mv8 m() {
        mv8 mv8Var = this.gaugeMetadata_;
        return mv8Var == null ? mv8.h() : mv8Var;
    }

    public final boolean n() {
        return (this.bitField0_ & 2) != 0;
    }

    public final void p(mv8 mv8Var) {
        mv8Var.getClass();
        this.gaugeMetadata_ = mv8Var;
        this.bitField0_ |= 2;
    }

    public final void setSessionId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }
}
