package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class g0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final g0 DEFAULT_INSTANCE;
    public static final int LOW_MEM_FIELD_NUMBER = 1;
    public static final int LOW_MEM_THRESHOLD_BYTES_FIELD_NUMBER = 2;
    private static volatile Parser<g0> PARSER = null;
    public static final int TOTAL_MEM_BYTES_FIELD_NUMBER = 3;
    private int bitField0_;
    private long lowMemThresholdBytes_;
    private boolean lowMem_;
    private long totalMemBytes_;

    static {
        g0 g0Var = new g0();
        DEFAULT_INSTANCE = g0Var;
        GeneratedMessageLite.registerDefaultInstance(g0.class, g0Var);
    }

    public static f0 h() {
        return (f0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new g0();
            case 2:
                return new f0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဃ\u0001\u0003ဃ\u0002", new Object[]{"bitField0_", "lowMem_", "lowMemThresholdBytes_", "totalMemBytes_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<g0> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (g0.class) {
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

    public final void i(boolean z) {
        this.bitField0_ |= 1;
        this.lowMem_ = z;
    }

    public final void j(long j) {
        this.bitField0_ |= 2;
        this.lowMemThresholdBytes_ = j;
    }

    public final void k(long j) {
        this.bitField0_ |= 4;
        this.totalMemBytes_ = j;
    }
}
