package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class d0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int BANNER_FIELD_NUMBER = 4;
    private static final d0 DEFAULT_INSTANCE;
    public static final int INTERSTITIAL_FIELD_NUMBER = 1;
    public static final int MREC_FIELD_NUMBER = 3;
    public static final int NATIVE_FIELD_NUMBER = 5;
    private static volatile Parser<d0> PARSER = null;
    public static final int REWARDED_FIELD_NUMBER = 2;
    private int banner_;
    private int interstitial_;
    private int mrec_;
    private int native_;
    private int rewarded_;

    static {
        d0 d0Var = new d0();
        DEFAULT_INSTANCE = d0Var;
        GeneratedMessageLite.registerDefaultInstance(d0.class, d0Var);
    }

    public static c0 h() {
        return (c0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new d0();
            case 2:
                return new c0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004", new Object[]{"interstitial_", "rewarded_", "mrec_", "banner_", "native_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<d0> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (d0.class) {
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

    public final void i(int i) {
        this.banner_ = i;
    }

    public final void j(int i) {
        this.interstitial_ = i;
    }

    public final void k(int i) {
        this.mrec_ = i;
    }

    public final void l(int i) {
        this.native_ = i;
    }

    public final void m(int i) {
        this.rewarded_ = i;
    }
}
