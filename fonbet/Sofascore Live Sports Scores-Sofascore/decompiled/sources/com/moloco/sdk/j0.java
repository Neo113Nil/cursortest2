package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class j0 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final j0 DEFAULT_INSTANCE;
    public static final int MCC_FIELD_NUMBER = 3;
    public static final int MNC_FIELD_NUMBER = 4;
    private static volatile Parser<j0> PARSER = null;
    public static final int RESTRICTED_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int mcc_;
    private int mnc_;
    private boolean restricted_;
    private int type_;

    static {
        j0 j0Var = new j0();
        DEFAULT_INSTANCE = j0Var;
        GeneratedMessageLite.registerDefaultInstance(j0.class, j0Var);
    }

    public static h0 h() {
        return (h0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new j0();
            case 2:
                return new h0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဋ\u0002\u0004ဋ\u0003", new Object[]{"bitField0_", "type_", "restricted_", "mcc_", "mnc_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<j0> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (j0.class) {
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
        this.bitField0_ |= 4;
        this.mcc_ = i;
    }

    public final void j(int i) {
        this.bitField0_ |= 8;
        this.mnc_ = i;
    }

    public final void k(boolean z) {
        this.bitField0_ |= 2;
        this.restricted_ = z;
    }

    public final void l(i0 i0Var) {
        this.type_ = i0Var.getNumber();
        this.bitField0_ |= 1;
    }
}
