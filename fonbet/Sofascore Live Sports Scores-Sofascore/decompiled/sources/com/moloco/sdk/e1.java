package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class e1 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final e1 DEFAULT_INSTANCE;
    public static final int EVENT_ID_FIELD_NUMBER = 2;
    public static final int LEVELPLAY_FIELD_NUMBER = 4;
    public static final int MAX_FIELD_NUMBER = 3;
    private static volatile Parser<e1> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private Object platform_;
    private int platformCase_ = 0;
    private String sessionId_ = "";
    private String eventId_ = "";

    static {
        e1 e1Var = new e1();
        DEFAULT_INSTANCE = e1Var;
        GeneratedMessageLite.registerDefaultInstance(e1.class, e1Var);
    }

    public static d1 h() {
        return (d1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (c1.a[methodToInvoke.ordinal()]) {
            case 1:
                return new e1();
            case 2:
                return new d1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003<\u0000\u0004<\u0000", new Object[]{"platform_", "platformCase_", "sessionId_", "eventId_", k1.class, i1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<e1> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (e1.class) {
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

    public final String getEventId() {
        return this.eventId_;
    }

    public final String getSessionId() {
        return this.sessionId_;
    }

    public final void i(i1 i1Var) {
        i1Var.getClass();
        this.platform_ = i1Var;
        this.platformCase_ = 4;
    }

    public final void j(String str) {
        str.getClass();
        this.sessionId_ = str;
    }

    public final void setEventId(String str) {
        str.getClass();
        this.eventId_ = str;
    }
}
