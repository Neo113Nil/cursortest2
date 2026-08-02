package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class mde extends GeneratedMessageLite implements nde {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final mde DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile Parser<mde> PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private lf0 applicationInfo_;
    private int bitField0_;
    private qv8 gaugeMetric_;
    private wad networkRequestMetric_;
    private fsj traceMetric_;
    private dyj transportInfo_;

    static {
        mde mdeVar = new mde();
        DEFAULT_INSTANCE = mdeVar;
        GeneratedMessageLite.registerDefaultInstance(mde.class, mdeVar);
    }

    public static lde j() {
        return (lde) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // defpackage.nde
    public final boolean a() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // defpackage.nde
    public final boolean b() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // defpackage.nde
    public final wad c() {
        wad wadVar = this.networkRequestMetric_;
        return wadVar == null ? wad.k() : wadVar;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (kde.a[methodToInvoke.ordinal()]) {
            case 1:
                return new mde();
            case 2:
                return new lde(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<mde> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (mde.class) {
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

    @Override // defpackage.nde
    public final boolean e() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // defpackage.nde
    public final fsj f() {
        fsj fsjVar = this.traceMetric_;
        return fsjVar == null ? fsj.p() : fsjVar;
    }

    @Override // defpackage.nde
    public final qv8 g() {
        qv8 qv8Var = this.gaugeMetric_;
        return qv8Var == null ? qv8.l() : qv8Var;
    }

    public final lf0 h() {
        lf0 lf0Var = this.applicationInfo_;
        return lf0Var == null ? lf0.i() : lf0Var;
    }

    public final boolean i() {
        return (this.bitField0_ & 1) != 0;
    }

    public final void k(lf0 lf0Var) {
        lf0Var.getClass();
        this.applicationInfo_ = lf0Var;
        this.bitField0_ |= 1;
    }

    public final void l(qv8 qv8Var) {
        qv8Var.getClass();
        this.gaugeMetric_ = qv8Var;
        this.bitField0_ |= 8;
    }

    public final void m(wad wadVar) {
        wadVar.getClass();
        this.networkRequestMetric_ = wadVar;
        this.bitField0_ |= 4;
    }

    public final void n(fsj fsjVar) {
        fsjVar.getClass();
        this.traceMetric_ = fsjVar;
        this.bitField0_ |= 2;
    }
}
