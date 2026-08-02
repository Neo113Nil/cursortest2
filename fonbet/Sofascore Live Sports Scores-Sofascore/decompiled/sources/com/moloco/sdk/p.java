package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class p extends GeneratedMessageLite implements MessageLiteOrBuilder {
    private static final p DEFAULT_INSTANCE;
    public static final int MUTE_SWITCH_FIELD_NUMBER = 1;
    private static volatile Parser<p> PARSER = null;
    public static final int VOL_FIELD_NUMBER = 2;
    private int bitField0_;
    private int muteSwitch_;
    private int vol_;

    static {
        p pVar = new p();
        DEFAULT_INSTANCE = pVar;
        GeneratedMessageLite.registerDefaultInstance(p.class, pVar);
    }

    public static n h() {
        return (n) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new p();
            case 2:
                return new n(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001", new Object[]{"bitField0_", "muteSwitch_", "vol_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<p> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (p.class) {
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

    public final void i(o oVar) {
        this.muteSwitch_ = oVar.getNumber();
        this.bitField0_ |= 1;
    }

    public final void j(int i) {
        this.bitField0_ |= 2;
        this.vol_ = i;
    }
}
