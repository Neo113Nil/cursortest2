package com.vk.reefton.protocol;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import xsna.lof0;

/* loaded from: classes5.dex */
public final class ReefProtocol$ApplicationState extends GeneratedMessageLite<ReefProtocol$ApplicationState, a> implements MessageLiteOrBuilder {
    public static final int BUILDNUMBER_FIELD_NUMBER = 2;
    public static final int BUILDTYPE_FIELD_NUMBER = 3;
    private static final ReefProtocol$ApplicationState DEFAULT_INSTANCE;
    private static volatile Parser<ReefProtocol$ApplicationState> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int buildType_;
    private String version_ = "";
    private String buildNumber_ = "";

    public enum BuildType implements Internal.EnumLite {
        UNKNOWN(0),
        DEVELOPMENT(1),
        BETA(2),
        PRODUCTION(3),
        UNRECOGNIZED(-1);

        public static final int BETA_VALUE = 2;
        public static final int DEVELOPMENT_VALUE = 1;
        public static final int PRODUCTION_VALUE = 3;
        public static final int UNKNOWN_VALUE = 0;
        private static final Internal.EnumLiteMap<BuildType> internalValueMap = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap<BuildType> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final BuildType findValueByNumber(int i) {
                if (i == 0) {
                    return BuildType.UNKNOWN;
                }
                if (i == 1) {
                    return BuildType.DEVELOPMENT;
                }
                if (i == 2) {
                    return BuildType.BETA;
                }
                if (i != 3) {
                    return null;
                }
                return BuildType.PRODUCTION;
            }
        }

        BuildType(int i) {
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

    public static final class a extends GeneratedMessageLite.Builder<ReefProtocol$ApplicationState, a> implements MessageLiteOrBuilder {
        public a() {
            super(ReefProtocol$ApplicationState.DEFAULT_INSTANCE);
        }

        public final void b(String str) {
            copyOnWrite();
            ReefProtocol$ApplicationState.b((ReefProtocol$ApplicationState) this.instance, str);
        }

        public final void c(BuildType buildType) {
            copyOnWrite();
            ReefProtocol$ApplicationState.c((ReefProtocol$ApplicationState) this.instance, buildType);
        }

        public final void d(String str) {
            copyOnWrite();
            ReefProtocol$ApplicationState.d((ReefProtocol$ApplicationState) this.instance, str);
        }
    }

    static {
        ReefProtocol$ApplicationState reefProtocol$ApplicationState = new ReefProtocol$ApplicationState();
        DEFAULT_INSTANCE = reefProtocol$ApplicationState;
        GeneratedMessageLite.registerDefaultInstance(ReefProtocol$ApplicationState.class, reefProtocol$ApplicationState);
    }

    public static void b(ReefProtocol$ApplicationState reefProtocol$ApplicationState, String str) {
        reefProtocol$ApplicationState.getClass();
        str.getClass();
        reefProtocol$ApplicationState.buildNumber_ = str;
    }

    public static void c(ReefProtocol$ApplicationState reefProtocol$ApplicationState, BuildType buildType) {
        reefProtocol$ApplicationState.getClass();
        reefProtocol$ApplicationState.buildType_ = buildType.getNumber();
    }

    public static void d(ReefProtocol$ApplicationState reefProtocol$ApplicationState, String str) {
        reefProtocol$ApplicationState.getClass();
        str.getClass();
        reefProtocol$ApplicationState.version_ = str;
    }

    public static a g() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (lof0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new ReefProtocol$ApplicationState();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f", new Object[]{"version_", "buildNumber_", "buildType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ReefProtocol$ApplicationState> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (ReefProtocol$ApplicationState.class) {
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
