package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class h2 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final h2 DEFAULT_INSTANCE;
    public static final int ENABLED_FIELD_NUMBER = 1;
    private static volatile Parser<h2> PARSER = null;
    public static final int POLLING_INTERVAL_SECONDS_FIELD_NUMBER = 3;
    public static final int URL_FIELD_NUMBER = 2;
    private boolean enabled_;
    private int pollingIntervalSeconds_;
    private String url_ = "";

    static {
        h2 h2Var = new h2();
        DEFAULT_INSTANCE = h2Var;
        GeneratedMessageLite.registerDefaultInstance(h2.class, h2Var);
    }

    public static h2 h() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (l1.a[methodToInvoke.ordinal()]) {
            case 1:
                return new h2();
            case 2:
                return new g2(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002Ȉ\u0003\u0004", new Object[]{"enabled_", "url_", "pollingIntervalSeconds_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<h2> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (h2.class) {
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

    public final String getUrl() {
        return this.url_;
    }

    public final int i() {
        return this.pollingIntervalSeconds_;
    }
}
