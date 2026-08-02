package org.chromium.net.impl.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import org.chromium.net.impl.proto.Proxy;

/* loaded from: classes10.dex */
public final class ProxyOptions extends GeneratedMessageLite<ProxyOptions, Builder> implements ProxyOptionsOrBuilder {
    private static final ProxyOptions DEFAULT_INSTANCE;
    private static volatile Parser<ProxyOptions> PARSER = null;
    public static final int PROXIES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Proxy> proxies_ = emptyProtobufList();

    private ProxyOptions() {
    }

    @Override // org.chromium.net.impl.proto.ProxyOptionsOrBuilder
    public List<Proxy> getProxiesList() {
        return this.proxies_;
    }

    public List<? extends ProxyOrBuilder> getProxiesOrBuilderList() {
        return this.proxies_;
    }

    @Override // org.chromium.net.impl.proto.ProxyOptionsOrBuilder
    public int getProxiesCount() {
        return this.proxies_.size();
    }

    @Override // org.chromium.net.impl.proto.ProxyOptionsOrBuilder
    public Proxy getProxies(int index) {
        return this.proxies_.get(index);
    }

    public ProxyOrBuilder getProxiesOrBuilder(int index) {
        return this.proxies_.get(index);
    }

    private void ensureProxiesIsMutable() {
        Internal.ProtobufList<Proxy> protobufList = this.proxies_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.proxies_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProxies(int index, Proxy value) {
        value.getClass();
        ensureProxiesIsMutable();
        this.proxies_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProxies(Proxy value) {
        value.getClass();
        ensureProxiesIsMutable();
        this.proxies_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProxies(int index, Proxy value) {
        value.getClass();
        ensureProxiesIsMutable();
        this.proxies_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProxies(Iterable<? extends Proxy> values) {
        ensureProxiesIsMutable();
        AbstractMessageLite.addAll((Iterable) values, (List) this.proxies_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProxies() {
        this.proxies_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeProxies(int index) {
        ensureProxiesIsMutable();
        this.proxies_.remove(index);
    }

    public static ProxyOptions parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (ProxyOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static ProxyOptions parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (ProxyOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static ProxyOptions parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (ProxyOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static ProxyOptions parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (ProxyOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static ProxyOptions parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (ProxyOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static ProxyOptions parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (ProxyOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static ProxyOptions parseFrom(InputStream input) throws IOException {
        return (ProxyOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static ProxyOptions parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (ProxyOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static ProxyOptions parseDelimitedFrom(InputStream input) throws IOException {
        return (ProxyOptions) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static ProxyOptions parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (ProxyOptions) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static ProxyOptions parseFrom(CodedInputStream input) throws IOException {
        return (ProxyOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static ProxyOptions parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (ProxyOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(ProxyOptions prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<ProxyOptions, Builder> implements ProxyOptionsOrBuilder {
        private Builder() {
            super(ProxyOptions.DEFAULT_INSTANCE);
        }

        @Override // org.chromium.net.impl.proto.ProxyOptionsOrBuilder
        public List<Proxy> getProxiesList() {
            return Collections.unmodifiableList(((ProxyOptions) this.instance).getProxiesList());
        }

        @Override // org.chromium.net.impl.proto.ProxyOptionsOrBuilder
        public int getProxiesCount() {
            return ((ProxyOptions) this.instance).getProxiesCount();
        }

        @Override // org.chromium.net.impl.proto.ProxyOptionsOrBuilder
        public Proxy getProxies(int index) {
            return ((ProxyOptions) this.instance).getProxies(index);
        }

        public Builder setProxies(int index, Proxy value) {
            copyOnWrite();
            ((ProxyOptions) this.instance).setProxies(index, value);
            return this;
        }

        public Builder setProxies(int index, Proxy.Builder builderForValue) {
            copyOnWrite();
            ((ProxyOptions) this.instance).setProxies(index, builderForValue.build());
            return this;
        }

        public Builder addProxies(Proxy value) {
            copyOnWrite();
            ((ProxyOptions) this.instance).addProxies(value);
            return this;
        }

        public Builder addProxies(int index, Proxy value) {
            copyOnWrite();
            ((ProxyOptions) this.instance).addProxies(index, value);
            return this;
        }

        public Builder addProxies(Proxy.Builder builderForValue) {
            copyOnWrite();
            ((ProxyOptions) this.instance).addProxies(builderForValue.build());
            return this;
        }

        public Builder addProxies(int index, Proxy.Builder builderForValue) {
            copyOnWrite();
            ((ProxyOptions) this.instance).addProxies(index, builderForValue.build());
            return this;
        }

        public Builder addAllProxies(Iterable<? extends Proxy> values) {
            copyOnWrite();
            ((ProxyOptions) this.instance).addAllProxies(values);
            return this;
        }

        public Builder clearProxies() {
            copyOnWrite();
            ((ProxyOptions) this.instance).clearProxies();
            return this;
        }

        public Builder removeProxies(int index) {
            copyOnWrite();
            ((ProxyOptions) this.instance).removeProxies(index);
            return this;
        }
    }

    /* renamed from: org.chromium.net.impl.proto.ProxyOptions$1, reason: invalid class name */
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
                return new ProxyOptions();
            case 2:
                return new Builder();
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"proxies_", Proxy.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ProxyOptions> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (ProxyOptions.class) {
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
        ProxyOptions proxyOptions = new ProxyOptions();
        DEFAULT_INSTANCE = proxyOptions;
        GeneratedMessageLite.registerDefaultInstance(ProxyOptions.class, proxyOptions);
    }

    public static ProxyOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<ProxyOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
