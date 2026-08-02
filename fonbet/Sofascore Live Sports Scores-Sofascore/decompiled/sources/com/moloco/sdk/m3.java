package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class m3 extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final m3 DEFAULT_INSTANCE;
    private static volatile Parser<m3> PARSER = null;
    public static final int POS_FIELD_NUMBER = 2;
    public static final int SIZE_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 1;
    private a4 pos_;
    private c4 size_;
    private int type_;

    static {
        m3 m3Var = new m3();
        DEFAULT_INSTANCE = m3Var;
        GeneratedMessageLite.registerDefaultInstance(m3.class, m3Var);
    }

    public static k3 h() {
        return (k3) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (c3.a[methodToInvoke.ordinal()]) {
            case 1:
                return new m3();
            case 2:
                return new k3(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\t\u0003\t", new Object[]{"type_", "pos_", "size_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<m3> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (m3.class) {
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

    public final void i(a4 a4Var) {
        a4Var.getClass();
        this.pos_ = a4Var;
    }

    public final void j(c4 c4Var) {
        c4Var.getClass();
        this.size_ = c4Var;
    }

    public final void k(l3 l3Var) {
        this.type_ = l3Var.getNumber();
    }
}
