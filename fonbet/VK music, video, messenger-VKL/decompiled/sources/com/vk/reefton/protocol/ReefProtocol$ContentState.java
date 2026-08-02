package com.vk.reefton.protocol;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import xsna.lof0;

/* loaded from: classes5.dex */
public final class ReefProtocol$ContentState extends GeneratedMessageLite<ReefProtocol$ContentState, a> implements MessageLiteOrBuilder {
    private static final ReefProtocol$ContentState DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 4;
    public static final int HEIGHT_FIELD_NUMBER = 5;
    public static final int HOST_FIELD_NUMBER = 3;
    public static final int IDENTIFIER_FIELD_NUMBER = 2;
    private static volatile Parser<ReefProtocol$ContentState> PARSER = null;
    public static final int PREVSESSIONPAUSETIME_FIELD_NUMBER = 7;
    public static final int QUALITY_FIELD_NUMBER = 6;
    public static final int TYPE_FIELD_NUMBER = 1;
    private double duration_;
    private int height_;
    private long prevSessionPauseTime_;
    private int quality_;
    private int type_;
    private String identifier_ = "";
    private String host_ = "";

    public enum Quality implements Internal.EnumLite {
        UNKNOWN(0),
        AUTO(1),
        P144(2),
        P240(3),
        P360(4),
        P480(5),
        P720(6),
        P1080(7),
        P1440(8),
        P2160(9),
        UNRECOGNIZED(-1);

        public static final int AUTO_VALUE = 1;
        public static final int P1080_VALUE = 7;
        public static final int P1440_VALUE = 8;
        public static final int P144_VALUE = 2;
        public static final int P2160_VALUE = 9;
        public static final int P240_VALUE = 3;
        public static final int P360_VALUE = 4;
        public static final int P480_VALUE = 5;
        public static final int P720_VALUE = 6;
        public static final int UNKNOWN_VALUE = 0;
        private static final Internal.EnumLiteMap<Quality> internalValueMap = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap<Quality> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Quality findValueByNumber(int i) {
                switch (i) {
                    case 0:
                        return Quality.UNKNOWN;
                    case 1:
                        return Quality.AUTO;
                    case 2:
                        return Quality.P144;
                    case 3:
                        return Quality.P240;
                    case 4:
                        return Quality.P360;
                    case 5:
                        return Quality.P480;
                    case 6:
                        return Quality.P720;
                    case 7:
                        return Quality.P1080;
                    case 8:
                        return Quality.P1440;
                    case 9:
                        return Quality.P2160;
                    default:
                        return null;
                }
            }
        }

        Quality(int i) {
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

    public enum Type implements Internal.EnumLite {
        UNDEFINED(0),
        VIDEO(1),
        GIF(2),
        LIVE(3),
        CLIP(4),
        STORY(5),
        UNRECOGNIZED(-1);

        public static final int CLIP_VALUE = 4;
        public static final int GIF_VALUE = 2;
        public static final int LIVE_VALUE = 3;
        public static final int STORY_VALUE = 5;
        public static final int UNDEFINED_VALUE = 0;
        public static final int VIDEO_VALUE = 1;
        private static final Internal.EnumLiteMap<Type> internalValueMap = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap<Type> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Type findValueByNumber(int i) {
                if (i == 0) {
                    return Type.UNDEFINED;
                }
                if (i == 1) {
                    return Type.VIDEO;
                }
                if (i == 2) {
                    return Type.GIF;
                }
                if (i == 3) {
                    return Type.LIVE;
                }
                if (i == 4) {
                    return Type.CLIP;
                }
                if (i != 5) {
                    return null;
                }
                return Type.STORY;
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

    public static final class a extends GeneratedMessageLite.Builder<ReefProtocol$ContentState, a> implements MessageLiteOrBuilder {
        public a() {
            super(ReefProtocol$ContentState.DEFAULT_INSTANCE);
        }

        public final void b(double d) {
            copyOnWrite();
            ReefProtocol$ContentState.b((ReefProtocol$ContentState) this.instance, d);
        }

        public final void c(int i) {
            copyOnWrite();
            ReefProtocol$ContentState.c((ReefProtocol$ContentState) this.instance, i);
        }

        public final void d(String str) {
            copyOnWrite();
            ReefProtocol$ContentState.d((ReefProtocol$ContentState) this.instance, str);
        }

        public final void f(String str) {
            copyOnWrite();
            ReefProtocol$ContentState.f((ReefProtocol$ContentState) this.instance, str);
        }

        public final void g(long j) {
            copyOnWrite();
            ReefProtocol$ContentState.g((ReefProtocol$ContentState) this.instance, j);
        }

        public final void h(Quality quality) {
            copyOnWrite();
            ReefProtocol$ContentState.h((ReefProtocol$ContentState) this.instance, quality);
        }

        public final void m(Type type) {
            copyOnWrite();
            ReefProtocol$ContentState.m((ReefProtocol$ContentState) this.instance, type);
        }
    }

    static {
        ReefProtocol$ContentState reefProtocol$ContentState = new ReefProtocol$ContentState();
        DEFAULT_INSTANCE = reefProtocol$ContentState;
        GeneratedMessageLite.registerDefaultInstance(ReefProtocol$ContentState.class, reefProtocol$ContentState);
    }

    public static void b(ReefProtocol$ContentState reefProtocol$ContentState, double d) {
        reefProtocol$ContentState.duration_ = d;
    }

    public static void c(ReefProtocol$ContentState reefProtocol$ContentState, int i) {
        reefProtocol$ContentState.height_ = i;
    }

    public static void d(ReefProtocol$ContentState reefProtocol$ContentState, String str) {
        reefProtocol$ContentState.getClass();
        str.getClass();
        reefProtocol$ContentState.host_ = str;
    }

    public static void f(ReefProtocol$ContentState reefProtocol$ContentState, String str) {
        reefProtocol$ContentState.getClass();
        str.getClass();
        reefProtocol$ContentState.identifier_ = str;
    }

    public static void g(ReefProtocol$ContentState reefProtocol$ContentState, long j) {
        reefProtocol$ContentState.prevSessionPauseTime_ = j;
    }

    public static void h(ReefProtocol$ContentState reefProtocol$ContentState, Quality quality) {
        reefProtocol$ContentState.getClass();
        reefProtocol$ContentState.quality_ = quality.getNumber();
    }

    public static void m(ReefProtocol$ContentState reefProtocol$ContentState, Type type) {
        reefProtocol$ContentState.getClass();
        reefProtocol$ContentState.type_ = type.getNumber();
    }

    public static a o() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (lof0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new ReefProtocol$ContentState();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004\u0000\u0005\u0004\u0006\f\u0007\u0002", new Object[]{"type_", "identifier_", "host_", "duration_", "height_", "quality_", "prevSessionPauseTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ReefProtocol$ContentState> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (ReefProtocol$ContentState.class) {
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
