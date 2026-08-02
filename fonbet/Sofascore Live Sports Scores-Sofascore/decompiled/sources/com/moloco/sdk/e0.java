package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class e0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final e0 DEFAULT_INSTANCE;
    public static final int IMP_COUNTS_FIELD_NUMBER = 4;
    public static final int LAST_IMP_TS_FIELD_NUMBER = 2;
    private static volatile Parser<e0> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_START_TS_FIELD_NUMBER = 3;
    private d0 impCounts_;
    private long lastImpTs_;
    private String sessionId_ = "";
    private long sessionStartTs_;

    static {
        e0 e0Var = new e0();
        DEFAULT_INSTANCE = e0Var;
        GeneratedMessageLite.registerDefaultInstance(e0.class, e0Var);
    }

    public static b0 h() {
        return (b0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new e0();
            case 2:
                return new b0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\t", new Object[]{"sessionId_", "lastImpTs_", "sessionStartTs_", "impCounts_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<e0> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (e0.class) {
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

    public final void i(d0 d0Var) {
        d0Var.getClass();
        this.impCounts_ = d0Var;
    }

    public final void j(long j) {
        this.lastImpTs_ = j;
    }

    public final void k(String str) {
        str.getClass();
        this.sessionId_ = str;
    }

    public final void l(long j) {
        this.sessionStartTs_ = j;
    }
}
