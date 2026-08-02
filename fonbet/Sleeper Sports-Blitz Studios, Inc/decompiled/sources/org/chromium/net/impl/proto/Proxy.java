package org.chromium.net.impl.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class Proxy extends GeneratedMessageLite<Proxy, Builder> implements ProxyOrBuilder {
    private static final Proxy DEFAULT_INSTANCE;
    public static final int HOST_FIELD_NUMBER = 2;
    private static volatile Parser<Proxy> PARSER = null;
    public static final int PORT_FIELD_NUMBER = 3;
    public static final int SCHEME_FIELD_NUMBER = 1;
    private int bitField0_;
    private String host_ = "";
    private int port_;
    private int scheme_;

    private Proxy() {
    }

    @Override // org.chromium.net.impl.proto.ProxyOrBuilder
    public boolean hasScheme() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // org.chromium.net.impl.proto.ProxyOrBuilder
    public ProxyScheme getScheme() {
        ProxyScheme forNumber = ProxyScheme.forNumber(this.scheme_);
        return forNumber == null ? ProxyScheme.DIRECT : forNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScheme(ProxyScheme value) {
        this.scheme_ = value.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScheme() {
        this.bitField0_ &= -2;
        this.scheme_ = 0;
    }

    @Override // org.chromium.net.impl.proto.ProxyOrBuilder
    public boolean hasHost() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // org.chromium.net.impl.proto.ProxyOrBuilder
    public String getHost() {
        return this.host_;
    }

    @Override // org.chromium.net.impl.proto.ProxyOrBuilder
    public ByteString getHostBytes() {
        return ByteString.copyFromUtf8(this.host_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHost(String value) {
        value.getClass();
        this.bitField0_ |= 2;
        this.host_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHost() {
        this.bitField0_ &= -3;
        this.host_ = getDefaultInstance().getHost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHostBytes(ByteString value) {
        this.host_ = value.toStringUtf8();
        this.bitField0_ |= 2;
    }

    @Override // org.chromium.net.impl.proto.ProxyOrBuilder
    public boolean hasPort() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // org.chromium.net.impl.proto.ProxyOrBuilder
    public int getPort() {
        return this.port_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPort(int value) {
        this.bitField0_ |= 4;
        this.port_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPort() {
        this.bitField0_ &= -5;
        this.port_ = 0;
    }

    public static Proxy parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (Proxy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Proxy parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Proxy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Proxy parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (Proxy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Proxy parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Proxy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Proxy parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (Proxy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Proxy parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Proxy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Proxy parseFrom(InputStream input) throws IOException {
        return (Proxy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Proxy parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Proxy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Proxy parseDelimitedFrom(InputStream input) throws IOException {
        return (Proxy) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static Proxy parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Proxy) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Proxy parseFrom(CodedInputStream input) throws IOException {
        return (Proxy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Proxy parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Proxy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Proxy prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Proxy, Builder> implements ProxyOrBuilder {
        private Builder() {
            super(Proxy.DEFAULT_INSTANCE);
        }

        @Override // org.chromium.net.impl.proto.ProxyOrBuilder
        public boolean hasScheme() {
            return ((Proxy) this.instance).hasScheme();
        }

        @Override // org.chromium.net.impl.proto.ProxyOrBuilder
        public ProxyScheme getScheme() {
            return ((Proxy) this.instance).getScheme();
        }

        public Builder setScheme(ProxyScheme value) {
            copyOnWrite();
            ((Proxy) this.instance).setScheme(value);
            return this;
        }

        public Builder clearScheme() {
            copyOnWrite();
            ((Proxy) this.instance).clearScheme();
            return this;
        }

        @Override // org.chromium.net.impl.proto.ProxyOrBuilder
        public boolean hasHost() {
            return ((Proxy) this.instance).hasHost();
        }

        @Override // org.chromium.net.impl.proto.ProxyOrBuilder
        public String getHost() {
            return ((Proxy) this.instance).getHost();
        }

        @Override // org.chromium.net.impl.proto.ProxyOrBuilder
        public ByteString getHostBytes() {
            return ((Proxy) this.instance).getHostBytes();
        }

        public Builder setHost(String value) {
            copyOnWrite();
            ((Proxy) this.instance).setHost(value);
            return this;
        }

        public Builder clearHost() {
            copyOnWrite();
            ((Proxy) this.instance).clearHost();
            return this;
        }

        public Builder setHostBytes(ByteString value) {
            copyOnWrite();
            ((Proxy) this.instance).setHostBytes(value);
            return this;
        }

        @Override // org.chromium.net.impl.proto.ProxyOrBuilder
        public boolean hasPort() {
            return ((Proxy) this.instance).hasPort();
        }

        @Override // org.chromium.net.impl.proto.ProxyOrBuilder
        public int getPort() {
            return ((Proxy) this.instance).getPort();
        }

        public Builder setPort(int value) {
            copyOnWrite();
            ((Proxy) this.instance).setPort(value);
            return this;
        }

        public Builder clearPort() {
            copyOnWrite();
            ((Proxy) this.instance).clearPort();
            return this;
        }
    }

    /* renamed from: org.chromium.net.impl.proto.Proxy$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        Parser parser;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
            case 1:
                return new Proxy();
            case 2:
                return new Builder();
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"bitField0_", "scheme_", ProxyScheme.internalGetVerifier(), "host_", "port_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Proxy> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (Proxy.class) {
                    parser = PARSER;
                    if (parser == null) {
                        parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                        PARSER = parser;
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

    static {
        Proxy proxy = new Proxy();
        DEFAULT_INSTANCE = proxy;
        GeneratedMessageLite.registerDefaultInstance(Proxy.class, proxy);
    }

    public static Proxy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Proxy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
