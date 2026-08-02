package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class Common$PaneAutoSubmitOptions extends GeneratedMessageLite<Common$PaneAutoSubmitOptions, b> implements MessageLiteOrBuilder {
    public static final int AUTO_SUBMIT_ACTION_FIELD_NUMBER = 1;
    public static final int AUTO_SUBMIT_DELAY_MS_FIELD_NUMBER = 2;
    private static final Common$PaneAutoSubmitOptions DEFAULT_INSTANCE;
    private static volatile Parser<Common$PaneAutoSubmitOptions> PARSER;
    private int autoSubmitAction_;
    private int autoSubmitDelayMs_;

    public enum a implements Internal.EnumLite {
        AUTO_SUBMIT_UNKNOWN(0),
        AUTO_SUBMIT_PRIMARY_BUTTON_TAP(1),
        AUTO_SUBMIT_SECONDARY_BUTTON_TAP(2),
        AUTO_SUBMIT_TERTIARY_BUTTON_TAP(3),
        AUTO_SUBMIT_EXIT(4),
        UNRECOGNIZED(-1);

        public static final int AUTO_SUBMIT_EXIT_VALUE = 4;
        public static final int AUTO_SUBMIT_PRIMARY_BUTTON_TAP_VALUE = 1;
        public static final int AUTO_SUBMIT_SECONDARY_BUTTON_TAP_VALUE = 2;
        public static final int AUTO_SUBMIT_TERTIARY_BUTTON_TAP_VALUE = 3;
        public static final int AUTO_SUBMIT_UNKNOWN_VALUE = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final C0570a f40101b = new C0570a();

        /* renamed from: a, reason: collision with root package name */
        public final int f40103a;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneAutoSubmitOptions$a$a, reason: collision with other inner class name */
        public class C0570a implements Internal.EnumLiteMap<a> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final a findValueByNumber(int i10) {
                return a.forNumber(i10);
            }
        }

        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final b f40104a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i10) {
                return a.forNumber(i10) != null;
            }
        }

        a(int i10) {
            this.f40103a = i10;
        }

        public static a forNumber(int i10) {
            if (i10 == 0) {
                return AUTO_SUBMIT_UNKNOWN;
            }
            if (i10 == 1) {
                return AUTO_SUBMIT_PRIMARY_BUTTON_TAP;
            }
            if (i10 == 2) {
                return AUTO_SUBMIT_SECONDARY_BUTTON_TAP;
            }
            if (i10 == 3) {
                return AUTO_SUBMIT_TERTIARY_BUTTON_TAP;
            }
            if (i10 != 4) {
                return null;
            }
            return AUTO_SUBMIT_EXIT;
        }

        public static Internal.EnumLiteMap<a> internalGetValueMap() {
            return f40101b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f40104a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f40103a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static a valueOf(int i10) {
            return forNumber(i10);
        }
    }

    public static final class b extends GeneratedMessageLite.Builder<Common$PaneAutoSubmitOptions, b> implements MessageLiteOrBuilder {
        public b() {
            super(Common$PaneAutoSubmitOptions.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions = new Common$PaneAutoSubmitOptions();
        DEFAULT_INSTANCE = common$PaneAutoSubmitOptions;
        GeneratedMessageLite.registerDefaultInstance(Common$PaneAutoSubmitOptions.class, common$PaneAutoSubmitOptions);
    }

    private Common$PaneAutoSubmitOptions() {
    }

    private void clearAutoSubmitAction() {
        this.autoSubmitAction_ = 0;
    }

    private void clearAutoSubmitDelayMs() {
        this.autoSubmitDelayMs_ = 0;
    }

    public static Common$PaneAutoSubmitOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$PaneAutoSubmitOptions parseDelimitedFrom(InputStream inputStream) {
        return (Common$PaneAutoSubmitOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$PaneAutoSubmitOptions parseFrom(ByteBuffer byteBuffer) {
        return (Common$PaneAutoSubmitOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$PaneAutoSubmitOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAutoSubmitAction(a aVar) {
        this.autoSubmitAction_ = aVar.getNumber();
    }

    private void setAutoSubmitActionValue(int i10) {
        this.autoSubmitAction_ = i10;
    }

    private void setAutoSubmitDelayMs(int i10) {
        this.autoSubmitDelayMs_ = i10;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (C3588j.f40405a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$PaneAutoSubmitOptions();
            case 2:
                return new b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0004", new Object[]{"autoSubmitAction_", "autoSubmitDelayMs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$PaneAutoSubmitOptions> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (Common$PaneAutoSubmitOptions.class) {
                    try {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    } catch (Throwable th2) {
                        throw th2;
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

    public a getAutoSubmitAction() {
        a forNumber = a.forNumber(this.autoSubmitAction_);
        return forNumber == null ? a.UNRECOGNIZED : forNumber;
    }

    public int getAutoSubmitActionValue() {
        return this.autoSubmitAction_;
    }

    public int getAutoSubmitDelayMs() {
        return this.autoSubmitDelayMs_;
    }

    public static b newBuilder(Common$PaneAutoSubmitOptions common$PaneAutoSubmitOptions) {
        return DEFAULT_INSTANCE.createBuilder(common$PaneAutoSubmitOptions);
    }

    public static Common$PaneAutoSubmitOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PaneAutoSubmitOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$PaneAutoSubmitOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PaneAutoSubmitOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$PaneAutoSubmitOptions parseFrom(ByteString byteString) {
        return (Common$PaneAutoSubmitOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$PaneAutoSubmitOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PaneAutoSubmitOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$PaneAutoSubmitOptions parseFrom(byte[] bArr) {
        return (Common$PaneAutoSubmitOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$PaneAutoSubmitOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PaneAutoSubmitOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$PaneAutoSubmitOptions parseFrom(InputStream inputStream) {
        return (Common$PaneAutoSubmitOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$PaneAutoSubmitOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PaneAutoSubmitOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$PaneAutoSubmitOptions parseFrom(CodedInputStream codedInputStream) {
        return (Common$PaneAutoSubmitOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$PaneAutoSubmitOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PaneAutoSubmitOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
