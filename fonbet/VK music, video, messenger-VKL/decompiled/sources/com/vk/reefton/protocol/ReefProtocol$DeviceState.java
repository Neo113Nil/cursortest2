package com.vk.reefton.protocol;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import xsna.lof0;

/* loaded from: classes5.dex */
public final class ReefProtocol$DeviceState extends GeneratedMessageLite<ReefProtocol$DeviceState, a> implements MessageLiteOrBuilder {
    public static final int BATTERYPCT_FIELD_NUMBER = 10;
    private static final ReefProtocol$DeviceState DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    public static final int ISAIRPLANEMODE_FIELD_NUMBER = 11;
    public static final int ISCHARGING_FIELD_NUMBER = 9;
    public static final int ISPOWERSAVEMODE_FIELD_NUMBER = 8;
    public static final int MANUFACTURER_FIELD_NUMBER = 3;
    public static final int MODEL_FIELD_NUMBER = 4;
    public static final int OS_NAME_FIELD_NUMBER = 5;
    public static final int OS_VERSION_FIELD_NUMBER = 6;
    private static volatile Parser<ReefProtocol$DeviceState> PARSER = null;
    public static final int TAC_FIELD_NUMBER = 7;
    public static final int TYPE_FIELD_NUMBER = 2;
    private float batteryPct_;
    private boolean isAirplaneMode_;
    private boolean isCharging_;
    private boolean isPowerSaveMode_;
    private int type_;
    private String identifier_ = "";
    private String manufacturer_ = "";
    private String model_ = "";
    private String osName_ = "";
    private String osVersion_ = "";
    private String tac_ = "";

    public enum Type implements Internal.EnumLite {
        UNKNOWN(0),
        PHONE(1),
        TABLET(2),
        DESKTOP(3),
        UNRECOGNIZED(-1);

        public static final int DESKTOP_VALUE = 3;
        public static final int PHONE_VALUE = 1;
        public static final int TABLET_VALUE = 2;
        public static final int UNKNOWN_VALUE = 0;
        private static final Internal.EnumLiteMap<Type> internalValueMap = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap<Type> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Type findValueByNumber(int i) {
                if (i == 0) {
                    return Type.UNKNOWN;
                }
                if (i == 1) {
                    return Type.PHONE;
                }
                if (i == 2) {
                    return Type.TABLET;
                }
                if (i != 3) {
                    return null;
                }
                return Type.DESKTOP;
            }
        }

        Type(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static final class a extends GeneratedMessageLite.Builder<ReefProtocol$DeviceState, a> implements MessageLiteOrBuilder {
        public a() {
            super(ReefProtocol$DeviceState.DEFAULT_INSTANCE);
        }

        public final void b(float f) {
            copyOnWrite();
            ReefProtocol$DeviceState.b((ReefProtocol$DeviceState) this.instance, f);
        }

        public final void c(String str) {
            copyOnWrite();
            ReefProtocol$DeviceState.c((ReefProtocol$DeviceState) this.instance, str);
        }

        public final void d(boolean z) {
            copyOnWrite();
            ReefProtocol$DeviceState.d((ReefProtocol$DeviceState) this.instance, z);
        }

        public final void f(boolean z) {
            copyOnWrite();
            ReefProtocol$DeviceState.f((ReefProtocol$DeviceState) this.instance, z);
        }

        public final void g(boolean z) {
            copyOnWrite();
            ReefProtocol$DeviceState.g((ReefProtocol$DeviceState) this.instance, z);
        }

        public final void h(String str) {
            copyOnWrite();
            ReefProtocol$DeviceState.h((ReefProtocol$DeviceState) this.instance, str);
        }

        public final void m(String str) {
            copyOnWrite();
            ReefProtocol$DeviceState.m((ReefProtocol$DeviceState) this.instance, str);
        }

        public final void n(String str) {
            copyOnWrite();
            ReefProtocol$DeviceState.n((ReefProtocol$DeviceState) this.instance, str);
        }

        public final void o(String str) {
            copyOnWrite();
            ReefProtocol$DeviceState.o((ReefProtocol$DeviceState) this.instance, str);
        }

        public final void p(String str) {
            copyOnWrite();
            ReefProtocol$DeviceState.p((ReefProtocol$DeviceState) this.instance, str);
        }

        public final void q(Type type) {
            copyOnWrite();
            ReefProtocol$DeviceState.q((ReefProtocol$DeviceState) this.instance, type);
        }
    }

    static {
        ReefProtocol$DeviceState reefProtocol$DeviceState = new ReefProtocol$DeviceState();
        DEFAULT_INSTANCE = reefProtocol$DeviceState;
        GeneratedMessageLite.registerDefaultInstance(ReefProtocol$DeviceState.class, reefProtocol$DeviceState);
    }

    public static void b(ReefProtocol$DeviceState reefProtocol$DeviceState, float f) {
        reefProtocol$DeviceState.batteryPct_ = f;
    }

    public static void c(ReefProtocol$DeviceState reefProtocol$DeviceState, String str) {
        reefProtocol$DeviceState.getClass();
        str.getClass();
        reefProtocol$DeviceState.identifier_ = str;
    }

    public static void d(ReefProtocol$DeviceState reefProtocol$DeviceState, boolean z) {
        reefProtocol$DeviceState.isAirplaneMode_ = z;
    }

    public static void f(ReefProtocol$DeviceState reefProtocol$DeviceState, boolean z) {
        reefProtocol$DeviceState.isCharging_ = z;
    }

    public static void g(ReefProtocol$DeviceState reefProtocol$DeviceState, boolean z) {
        reefProtocol$DeviceState.isPowerSaveMode_ = z;
    }

    public static void h(ReefProtocol$DeviceState reefProtocol$DeviceState, String str) {
        reefProtocol$DeviceState.getClass();
        str.getClass();
        reefProtocol$DeviceState.manufacturer_ = str;
    }

    public static void m(ReefProtocol$DeviceState reefProtocol$DeviceState, String str) {
        reefProtocol$DeviceState.getClass();
        str.getClass();
        reefProtocol$DeviceState.model_ = str;
    }

    public static void n(ReefProtocol$DeviceState reefProtocol$DeviceState, String str) {
        reefProtocol$DeviceState.getClass();
        str.getClass();
        reefProtocol$DeviceState.osName_ = str;
    }

    public static void o(ReefProtocol$DeviceState reefProtocol$DeviceState, String str) {
        reefProtocol$DeviceState.getClass();
        str.getClass();
        reefProtocol$DeviceState.osVersion_ = str;
    }

    public static void p(ReefProtocol$DeviceState reefProtocol$DeviceState, String str) {
        reefProtocol$DeviceState.getClass();
        str.getClass();
        reefProtocol$DeviceState.tac_ = str;
    }

    public static void q(ReefProtocol$DeviceState reefProtocol$DeviceState, Type type) {
        reefProtocol$DeviceState.getClass();
        reefProtocol$DeviceState.type_ = type.getNumber();
    }

    public static a s() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (lof0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new ReefProtocol$DeviceState();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0007\t\u0007\n\u0001\u000b\u0007", new Object[]{"identifier_", "type_", "manufacturer_", "model_", "osName_", "osVersion_", "tac_", "isPowerSaveMode_", "isCharging_", "batteryPct_", "isAirplaneMode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ReefProtocol$DeviceState> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (ReefProtocol$DeviceState.class) {
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
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
