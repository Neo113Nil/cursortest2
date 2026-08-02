package com.vk.reefton.protocol;

import com.google.protobuf.FloatValue;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int64Value;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import xsna.lof0;

/* loaded from: classes5.dex */
public final class ReefProtocol$LocationState extends GeneratedMessageLite<ReefProtocol$LocationState, a> implements MessageLiteOrBuilder {
    public static final int ACCURACY_FIELD_NUMBER = 5;
    public static final int ALTITUDE_FIELD_NUMBER = 8;
    private static final ReefProtocol$LocationState DEFAULT_INSTANCE;
    public static final int ELAPSEDTIME_FIELD_NUMBER = 4;
    public static final int HASALTITUDE_FIELD_NUMBER = 7;
    public static final int LAT_FIELD_NUMBER = 3;
    public static final int LON_FIELD_NUMBER = 2;
    private static volatile Parser<ReefProtocol$LocationState> PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 1;
    public static final int SPEED_FIELD_NUMBER = 6;
    private FloatValue accuracy_;
    private FloatValue altitude_;
    private Int64Value elapsedTime_;
    private boolean hasAltitude_;
    private FloatValue lat_;
    private FloatValue lon_;
    private int source_;
    private FloatValue speed_;

    public enum Source implements Internal.EnumLite {
        UNKNOWN(0),
        GPS(1),
        NETWORK(2),
        PASSIVE(3),
        UNRECOGNIZED(-1);

        public static final int GPS_VALUE = 1;
        public static final int NETWORK_VALUE = 2;
        public static final int PASSIVE_VALUE = 3;
        public static final int UNKNOWN_VALUE = 0;
        private static final Internal.EnumLiteMap<Source> internalValueMap = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap<Source> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Source findValueByNumber(int i) {
                if (i == 0) {
                    return Source.UNKNOWN;
                }
                if (i == 1) {
                    return Source.GPS;
                }
                if (i == 2) {
                    return Source.NETWORK;
                }
                if (i != 3) {
                    return null;
                }
                return Source.PASSIVE;
            }
        }

        Source(int i) {
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

    public static final class a extends GeneratedMessageLite.Builder<ReefProtocol$LocationState, a> implements MessageLiteOrBuilder {
        public a() {
            super(ReefProtocol$LocationState.DEFAULT_INSTANCE);
        }

        public final void b(FloatValue floatValue) {
            copyOnWrite();
            ReefProtocol$LocationState.b((ReefProtocol$LocationState) this.instance, floatValue);
        }

        public final void c(FloatValue floatValue) {
            copyOnWrite();
            ReefProtocol$LocationState.c((ReefProtocol$LocationState) this.instance, floatValue);
        }

        public final void d(Int64Value int64Value) {
            copyOnWrite();
            ReefProtocol$LocationState.d((ReefProtocol$LocationState) this.instance, int64Value);
        }

        public final void f(boolean z) {
            copyOnWrite();
            ReefProtocol$LocationState.f((ReefProtocol$LocationState) this.instance, z);
        }

        public final void g(FloatValue.Builder builder) {
            copyOnWrite();
            ReefProtocol$LocationState.g((ReefProtocol$LocationState) this.instance, builder.build());
        }

        public final void h(FloatValue floatValue) {
            copyOnWrite();
            ReefProtocol$LocationState.h((ReefProtocol$LocationState) this.instance, floatValue);
        }

        public final void m(Source source) {
            copyOnWrite();
            ReefProtocol$LocationState.m((ReefProtocol$LocationState) this.instance, source);
        }

        public final void n(FloatValue floatValue) {
            copyOnWrite();
            ReefProtocol$LocationState.n((ReefProtocol$LocationState) this.instance, floatValue);
        }
    }

    static {
        ReefProtocol$LocationState reefProtocol$LocationState = new ReefProtocol$LocationState();
        DEFAULT_INSTANCE = reefProtocol$LocationState;
        GeneratedMessageLite.registerDefaultInstance(ReefProtocol$LocationState.class, reefProtocol$LocationState);
    }

    public static void b(ReefProtocol$LocationState reefProtocol$LocationState, FloatValue floatValue) {
        reefProtocol$LocationState.getClass();
        floatValue.getClass();
        reefProtocol$LocationState.accuracy_ = floatValue;
    }

    public static void c(ReefProtocol$LocationState reefProtocol$LocationState, FloatValue floatValue) {
        reefProtocol$LocationState.getClass();
        floatValue.getClass();
        reefProtocol$LocationState.altitude_ = floatValue;
    }

    public static void d(ReefProtocol$LocationState reefProtocol$LocationState, Int64Value int64Value) {
        reefProtocol$LocationState.getClass();
        int64Value.getClass();
        reefProtocol$LocationState.elapsedTime_ = int64Value;
    }

    public static void f(ReefProtocol$LocationState reefProtocol$LocationState, boolean z) {
        reefProtocol$LocationState.hasAltitude_ = z;
    }

    public static void g(ReefProtocol$LocationState reefProtocol$LocationState, FloatValue floatValue) {
        reefProtocol$LocationState.getClass();
        floatValue.getClass();
        reefProtocol$LocationState.lat_ = floatValue;
    }

    public static void h(ReefProtocol$LocationState reefProtocol$LocationState, FloatValue floatValue) {
        reefProtocol$LocationState.getClass();
        floatValue.getClass();
        reefProtocol$LocationState.lon_ = floatValue;
    }

    public static void m(ReefProtocol$LocationState reefProtocol$LocationState, Source source) {
        reefProtocol$LocationState.getClass();
        reefProtocol$LocationState.source_ = source.getNumber();
    }

    public static void n(ReefProtocol$LocationState reefProtocol$LocationState, FloatValue floatValue) {
        reefProtocol$LocationState.getClass();
        floatValue.getClass();
        reefProtocol$LocationState.speed_ = floatValue;
    }

    public static a p() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (lof0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new ReefProtocol$LocationState();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\f\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\u0007\b\t", new Object[]{"source_", "lon_", "lat_", "elapsedTime_", "accuracy_", "speed_", "hasAltitude_", "altitude_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ReefProtocol$LocationState> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (ReefProtocol$LocationState.class) {
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
