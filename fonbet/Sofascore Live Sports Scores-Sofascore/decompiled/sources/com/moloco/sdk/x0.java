package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class x0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final x0 DEFAULT_INSTANCE;
    public static final int MIN_STREAMING_PLAYABLE_DURATION_ON_TIMEOUT_SECS_FIELD_NUMBER = 2;
    private static volatile Parser<x0> PARSER = null;
    public static final int STREAMING_CHUNK_SIZE_KILOBYTES_FIELD_NUMBER = 1;
    private int bitField0_;
    private double minStreamingPlayableDurationOnTimeoutSecs_;
    private long streamingChunkSizeKilobytes_;

    static {
        x0 x0Var = new x0();
        DEFAULT_INSTANCE = x0Var;
        GeneratedMessageLite.registerDefaultInstance(x0.class, x0Var);
    }

    public static x0 h() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (r0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new x0();
            case 2:
                return new w0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002က\u0001", new Object[]{"bitField0_", "streamingChunkSizeKilobytes_", "minStreamingPlayableDurationOnTimeoutSecs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<x0> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (x0.class) {
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

    public final double i() {
        return this.minStreamingPlayableDurationOnTimeoutSecs_;
    }

    public final long j() {
        return this.streamingChunkSizeKilobytes_;
    }
}
