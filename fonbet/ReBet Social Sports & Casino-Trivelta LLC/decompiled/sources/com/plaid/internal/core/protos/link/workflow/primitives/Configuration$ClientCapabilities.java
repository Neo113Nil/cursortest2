package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes4.dex */
public final class Configuration$ClientCapabilities extends GeneratedMessageLite<Configuration$ClientCapabilities, a> implements MessageLiteOrBuilder {
    private static final Configuration$ClientCapabilities DEFAULT_INSTANCE;
    public static final int DETECTED_WEB3_WALLET_IDS_FIELD_NUMBER = 3;
    public static final int DISABLE_CUSTOM_TABS_FIELD_NUMBER = 4;
    public static final int INCREMENTAL_CALLBACK_SUPPORT_FIELD_NUMBER = 2;
    private static volatile Parser<Configuration$ClientCapabilities> PARSER = null;
    public static final int SUPPORTS_EAGER_START_FIELD_NUMBER = 5;
    public static final int SUPPORTS_INCREMENTAL_RESULTS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<String> detectedWeb3WalletIds_ = GeneratedMessageLite.emptyProtobufList();
    private boolean disableCustomTabs_;
    private int incrementalCallbackSupport_;
    private boolean supportsEagerStart_;
    private boolean supportsIncrementalResults_;

    public static final class a extends GeneratedMessageLite.Builder<Configuration$ClientCapabilities, a> implements MessageLiteOrBuilder {
        public a() {
            super(Configuration$ClientCapabilities.DEFAULT_INSTANCE);
        }

        public final a a(boolean z10) {
            copyOnWrite();
            ((Configuration$ClientCapabilities) this.instance).setDisableCustomTabs(z10);
            return this;
        }

        public final a b(boolean z10) {
            copyOnWrite();
            ((Configuration$ClientCapabilities) this.instance).setSupportsEagerStart(z10);
            return this;
        }
    }

    static {
        Configuration$ClientCapabilities configuration$ClientCapabilities = new Configuration$ClientCapabilities();
        DEFAULT_INSTANCE = configuration$ClientCapabilities;
        GeneratedMessageLite.registerDefaultInstance(Configuration$ClientCapabilities.class, configuration$ClientCapabilities);
    }

    private Configuration$ClientCapabilities() {
    }

    private void addAllDetectedWeb3WalletIds(Iterable<String> iterable) {
        ensureDetectedWeb3WalletIdsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.detectedWeb3WalletIds_);
    }

    private void addDetectedWeb3WalletIds(String str) {
        str.getClass();
        ensureDetectedWeb3WalletIdsIsMutable();
        this.detectedWeb3WalletIds_.add(str);
    }

    private void addDetectedWeb3WalletIdsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureDetectedWeb3WalletIdsIsMutable();
        this.detectedWeb3WalletIds_.add(byteString.toStringUtf8());
    }

    private void clearDetectedWeb3WalletIds() {
        this.detectedWeb3WalletIds_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearDisableCustomTabs() {
        this.disableCustomTabs_ = false;
    }

    private void clearIncrementalCallbackSupport() {
        this.incrementalCallbackSupport_ = 0;
    }

    private void clearSupportsEagerStart() {
        this.supportsEagerStart_ = false;
    }

    private void clearSupportsIncrementalResults() {
        this.supportsIncrementalResults_ = false;
    }

    private void ensureDetectedWeb3WalletIdsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.detectedWeb3WalletIds_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.detectedWeb3WalletIds_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Configuration$ClientCapabilities getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Configuration$ClientCapabilities parseDelimitedFrom(InputStream inputStream) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$ClientCapabilities parseFrom(ByteBuffer byteBuffer) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Configuration$ClientCapabilities> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDetectedWeb3WalletIds(int i10, String str) {
        str.getClass();
        ensureDetectedWeb3WalletIdsIsMutable();
        this.detectedWeb3WalletIds_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableCustomTabs(boolean z10) {
        this.disableCustomTabs_ = z10;
    }

    private void setIncrementalCallbackSupport(h hVar) {
        this.incrementalCallbackSupport_ = hVar.getNumber();
    }

    private void setIncrementalCallbackSupportValue(int i10) {
        this.incrementalCallbackSupport_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSupportsEagerStart(boolean z10) {
        this.supportsEagerStart_ = z10;
    }

    private void setSupportsIncrementalResults(boolean z10) {
        this.supportsIncrementalResults_ = z10;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (e.f40499a[methodToInvoke.ordinal()]) {
            case 1:
                return new Configuration$ClientCapabilities();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0007\u0002\f\u0003Ț\u0004\u0007\u0005\u0007", new Object[]{"supportsIncrementalResults_", "incrementalCallbackSupport_", "detectedWeb3WalletIds_", "disableCustomTabs_", "supportsEagerStart_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Configuration$ClientCapabilities> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (Configuration$ClientCapabilities.class) {
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

    public String getDetectedWeb3WalletIds(int i10) {
        return this.detectedWeb3WalletIds_.get(i10);
    }

    public ByteString getDetectedWeb3WalletIdsBytes(int i10) {
        return ByteString.copyFromUtf8(this.detectedWeb3WalletIds_.get(i10));
    }

    public int getDetectedWeb3WalletIdsCount() {
        return this.detectedWeb3WalletIds_.size();
    }

    public List<String> getDetectedWeb3WalletIdsList() {
        return this.detectedWeb3WalletIds_;
    }

    public boolean getDisableCustomTabs() {
        return this.disableCustomTabs_;
    }

    public h getIncrementalCallbackSupport() {
        h forNumber = h.forNumber(this.incrementalCallbackSupport_);
        return forNumber == null ? h.UNRECOGNIZED : forNumber;
    }

    public int getIncrementalCallbackSupportValue() {
        return this.incrementalCallbackSupport_;
    }

    public boolean getSupportsEagerStart() {
        return this.supportsEagerStart_;
    }

    public boolean getSupportsIncrementalResults() {
        return this.supportsIncrementalResults_;
    }

    public static a newBuilder(Configuration$ClientCapabilities configuration$ClientCapabilities) {
        return DEFAULT_INSTANCE.createBuilder(configuration$ClientCapabilities);
    }

    public static Configuration$ClientCapabilities parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$ClientCapabilities parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Configuration$ClientCapabilities parseFrom(ByteString byteString) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Configuration$ClientCapabilities parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Configuration$ClientCapabilities parseFrom(byte[] bArr) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Configuration$ClientCapabilities parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Configuration$ClientCapabilities parseFrom(InputStream inputStream) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$ClientCapabilities parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$ClientCapabilities parseFrom(CodedInputStream codedInputStream) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Configuration$ClientCapabilities parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
