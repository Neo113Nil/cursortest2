package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class s extends GeneratedMessageLite implements MessageLiteOrBuilder {
    public static final int BATTERY_STATUS_FIELD_NUMBER = 2;
    private static final s DEFAULT_INSTANCE;
    public static final int LOW_POW_MODE_FIELD_NUMBER = 3;
    public static final int MAX_BATTERY_LEVEL_FIELD_NUMBER = 1;
    private static volatile Parser<s> PARSER;
    private int batteryStatus_;
    private int bitField0_;
    private boolean lowPowMode_;
    private int maxBatteryLevel_;

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        GeneratedMessageLite.registerDefaultInstance(s.class, sVar);
    }

    public static r h() {
        return (r) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (a.a[methodToInvoke.ordinal()]) {
            case 1:
                return new s();
            case 2:
                return new r(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဌ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "maxBatteryLevel_", "batteryStatus_", "lowPowMode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<s> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (s.class) {
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

    public final void i(q qVar) {
        this.batteryStatus_ = qVar.getNumber();
        this.bitField0_ |= 2;
    }

    public final void j(boolean z) {
        this.bitField0_ |= 4;
        this.lowPowMode_ = z;
    }

    public final void k(int i) {
        this.bitField0_ |= 1;
        this.maxBatteryLevel_ = i;
    }
}
