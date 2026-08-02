package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class CampaignMetadataOuterClass {

    public interface CampaignAssetOrBuilder extends MessageLiteOrBuilder {
        int getPriority();

        boolean getRequired();

        String getUrl();

        ByteString getUrlBytes();
    }

    public interface CampaignMetadataOrBuilder extends MessageLiteOrBuilder {
        int getAdDataRefreshDelayMs();

        CampaignAsset getAssetsToCache(int i);

        int getAssetsToCacheCount();

        List<CampaignAsset> getAssetsToCacheList();

        ByteString getCampaignStateData();

        int getCampaignStateDataVersion();

        int getTtlSeconds();
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private CampaignMetadataOuterClass() {
    }

    public static final class CampaignAsset extends GeneratedMessageLite<CampaignAsset, Builder> implements CampaignAssetOrBuilder {
        private static final CampaignAsset DEFAULT_INSTANCE;
        private static volatile Parser<CampaignAsset> PARSER = null;
        public static final int PRIORITY_FIELD_NUMBER = 2;
        public static final int REQUIRED_FIELD_NUMBER = 3;
        public static final int URL_FIELD_NUMBER = 1;
        private int priority_;
        private boolean required_;
        private String url_ = "";

        private CampaignAsset() {
        }

        @Override // gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignAssetOrBuilder
        public String getUrl() {
            return this.url_;
        }

        @Override // gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignAssetOrBuilder
        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrl(String str) {
            str.getClass();
            this.url_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrlBytes(ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.url_ = byteString.toStringUtf8();
        }

        @Override // gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignAssetOrBuilder
        public int getPriority() {
            return this.priority_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPriority(int i) {
            this.priority_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPriority() {
            this.priority_ = 0;
        }

        @Override // gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignAssetOrBuilder
        public boolean getRequired() {
            return this.required_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequired(boolean z) {
            this.required_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequired() {
            this.required_ = false;
        }

        public static CampaignAsset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CampaignAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CampaignAsset parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CampaignAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CampaignAsset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CampaignAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CampaignAsset parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CampaignAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CampaignAsset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CampaignAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CampaignAsset parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CampaignAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CampaignAsset parseFrom(InputStream inputStream) throws IOException {
            return (CampaignAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CampaignAsset parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CampaignAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CampaignAsset parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CampaignAsset) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CampaignAsset parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CampaignAsset) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CampaignAsset parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CampaignAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CampaignAsset parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CampaignAsset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CampaignAsset campaignAsset) {
            return DEFAULT_INSTANCE.createBuilder(campaignAsset);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<CampaignAsset, Builder> implements CampaignAssetOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(CampaignAsset.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignAssetOrBuilder
            public String getUrl() {
                return ((CampaignAsset) this.instance).getUrl();
            }

            @Override // gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignAssetOrBuilder
            public ByteString getUrlBytes() {
                return ((CampaignAsset) this.instance).getUrlBytes();
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((CampaignAsset) this.instance).setUrl(str);
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((CampaignAsset) this.instance).clearUrl();
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((CampaignAsset) this.instance).setUrlBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignAssetOrBuilder
            public int getPriority() {
                return ((CampaignAsset) this.instance).getPriority();
            }

            public Builder setPriority(int i) {
                copyOnWrite();
                ((CampaignAsset) this.instance).setPriority(i);
                return this;
            }

            public Builder clearPriority() {
                copyOnWrite();
                ((CampaignAsset) this.instance).clearPriority();
                return this;
            }

            @Override // gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignAssetOrBuilder
            public boolean getRequired() {
                return ((CampaignAsset) this.instance).getRequired();
            }

            public Builder setRequired(boolean z) {
                copyOnWrite();
                ((CampaignAsset) this.instance).setRequired(z);
                return this;
            }

            public Builder clearRequired() {
                copyOnWrite();
                ((CampaignAsset) this.instance).clearRequired();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new CampaignAsset();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\u0007", new Object[]{"url_", "priority_", "required_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<CampaignAsset> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (CampaignAsset.class) {
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
            CampaignAsset campaignAsset = new CampaignAsset();
            DEFAULT_INSTANCE = campaignAsset;
            GeneratedMessageLite.registerDefaultInstance(CampaignAsset.class, campaignAsset);
        }

        public static CampaignAsset getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CampaignAsset> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: gatewayprotocol.v1.CampaignMetadataOuterClass$1, reason: invalid class name */
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

    public static final class CampaignMetadata extends GeneratedMessageLite<CampaignMetadata, Builder> implements CampaignMetadataOrBuilder {
        public static final int AD_DATA_REFRESH_DELAY_MS_FIELD_NUMBER = 4;
        public static final int ASSETS_TO_CACHE_FIELD_NUMBER = 3;
        public static final int CAMPAIGN_STATE_DATA_FIELD_NUMBER = 2;
        public static final int CAMPAIGN_STATE_DATA_VERSION_FIELD_NUMBER = 1;
        private static final CampaignMetadata DEFAULT_INSTANCE;
        private static volatile Parser<CampaignMetadata> PARSER = null;
        public static final int TTL_SECONDS_FIELD_NUMBER = 5;
        private int adDataRefreshDelayMs_;
        private int campaignStateDataVersion_;
        private int ttlSeconds_;
        private ByteString campaignStateData_ = ByteString.EMPTY;
        private Internal.ProtobufList<CampaignAsset> assetsToCache_ = emptyProtobufList();

        private CampaignMetadata() {
        }

        @Override // gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignMetadataOrBuilder
        public int getCampaignStateDataVersion() {
            return this.campaignStateDataVersion_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCampaignStateDataVersion(int i) {
            this.campaignStateDataVersion_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCampaignStateDataVersion() {
            this.campaignStateDataVersion_ = 0;
        }

        @Override // gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignMetadataOrBuilder
        public ByteString getCampaignStateData() {
            return this.campaignStateData_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCampaignStateData(ByteString byteString) {
            byteString.getClass();
            this.campaignStateData_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCampaignStateData() {
            this.campaignStateData_ = getDefaultInstance().getCampaignStateData();
        }

        @Override // gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignMetadataOrBuilder
        public List<CampaignAsset> getAssetsToCacheList() {
            return this.assetsToCache_;
        }

        public List<? extends CampaignAssetOrBuilder> getAssetsToCacheOrBuilderList() {
            return this.assetsToCache_;
        }

        @Override // gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignMetadataOrBuilder
        public int getAssetsToCacheCount() {
            return this.assetsToCache_.size();
        }

        @Override // gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignMetadataOrBuilder
        public CampaignAsset getAssetsToCache(int i) {
            return this.assetsToCache_.get(i);
        }

        public CampaignAssetOrBuilder getAssetsToCacheOrBuilder(int i) {
            return this.assetsToCache_.get(i);
        }

        private void ensureAssetsToCacheIsMutable() {
            Internal.ProtobufList<CampaignAsset> protobufList = this.assetsToCache_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.assetsToCache_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssetsToCache(int i, CampaignAsset campaignAsset) {
            campaignAsset.getClass();
            ensureAssetsToCacheIsMutable();
            this.assetsToCache_.set(i, campaignAsset);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAssetsToCache(CampaignAsset campaignAsset) {
            campaignAsset.getClass();
            ensureAssetsToCacheIsMutable();
            this.assetsToCache_.add(campaignAsset);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAssetsToCache(int i, CampaignAsset campaignAsset) {
            campaignAsset.getClass();
            ensureAssetsToCacheIsMutable();
            this.assetsToCache_.add(i, campaignAsset);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAssetsToCache(Iterable<? extends CampaignAsset> iterable) {
            ensureAssetsToCacheIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.assetsToCache_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssetsToCache() {
            this.assetsToCache_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeAssetsToCache(int i) {
            ensureAssetsToCacheIsMutable();
            this.assetsToCache_.remove(i);
        }

        @Override // gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignMetadataOrBuilder
        public int getAdDataRefreshDelayMs() {
            return this.adDataRefreshDelayMs_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdDataRefreshDelayMs(int i) {
            this.adDataRefreshDelayMs_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdDataRefreshDelayMs() {
            this.adDataRefreshDelayMs_ = 0;
        }

        @Override // gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignMetadataOrBuilder
        public int getTtlSeconds() {
            return this.ttlSeconds_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTtlSeconds(int i) {
            this.ttlSeconds_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTtlSeconds() {
            this.ttlSeconds_ = 0;
        }

        public static CampaignMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CampaignMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static CampaignMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CampaignMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CampaignMetadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CampaignMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CampaignMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CampaignMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CampaignMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CampaignMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CampaignMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CampaignMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CampaignMetadata parseFrom(InputStream inputStream) throws IOException {
            return (CampaignMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CampaignMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CampaignMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CampaignMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CampaignMetadata) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CampaignMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CampaignMetadata) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CampaignMetadata parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CampaignMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CampaignMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CampaignMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CampaignMetadata campaignMetadata) {
            return DEFAULT_INSTANCE.createBuilder(campaignMetadata);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<CampaignMetadata, Builder> implements CampaignMetadataOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(CampaignMetadata.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignMetadataOrBuilder
            public int getCampaignStateDataVersion() {
                return ((CampaignMetadata) this.instance).getCampaignStateDataVersion();
            }

            public Builder setCampaignStateDataVersion(int i) {
                copyOnWrite();
                ((CampaignMetadata) this.instance).setCampaignStateDataVersion(i);
                return this;
            }

            public Builder clearCampaignStateDataVersion() {
                copyOnWrite();
                ((CampaignMetadata) this.instance).clearCampaignStateDataVersion();
                return this;
            }

            @Override // gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignMetadataOrBuilder
            public ByteString getCampaignStateData() {
                return ((CampaignMetadata) this.instance).getCampaignStateData();
            }

            public Builder setCampaignStateData(ByteString byteString) {
                copyOnWrite();
                ((CampaignMetadata) this.instance).setCampaignStateData(byteString);
                return this;
            }

            public Builder clearCampaignStateData() {
                copyOnWrite();
                ((CampaignMetadata) this.instance).clearCampaignStateData();
                return this;
            }

            @Override // gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignMetadataOrBuilder
            public List<CampaignAsset> getAssetsToCacheList() {
                return Collections.unmodifiableList(((CampaignMetadata) this.instance).getAssetsToCacheList());
            }

            @Override // gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignMetadataOrBuilder
            public int getAssetsToCacheCount() {
                return ((CampaignMetadata) this.instance).getAssetsToCacheCount();
            }

            @Override // gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignMetadataOrBuilder
            public CampaignAsset getAssetsToCache(int i) {
                return ((CampaignMetadata) this.instance).getAssetsToCache(i);
            }

            public Builder setAssetsToCache(int i, CampaignAsset campaignAsset) {
                copyOnWrite();
                ((CampaignMetadata) this.instance).setAssetsToCache(i, campaignAsset);
                return this;
            }

            public Builder setAssetsToCache(int i, CampaignAsset.Builder builder) {
                copyOnWrite();
                ((CampaignMetadata) this.instance).setAssetsToCache(i, builder.build());
                return this;
            }

            public Builder addAssetsToCache(CampaignAsset campaignAsset) {
                copyOnWrite();
                ((CampaignMetadata) this.instance).addAssetsToCache(campaignAsset);
                return this;
            }

            public Builder addAssetsToCache(int i, CampaignAsset campaignAsset) {
                copyOnWrite();
                ((CampaignMetadata) this.instance).addAssetsToCache(i, campaignAsset);
                return this;
            }

            public Builder addAssetsToCache(CampaignAsset.Builder builder) {
                copyOnWrite();
                ((CampaignMetadata) this.instance).addAssetsToCache(builder.build());
                return this;
            }

            public Builder addAssetsToCache(int i, CampaignAsset.Builder builder) {
                copyOnWrite();
                ((CampaignMetadata) this.instance).addAssetsToCache(i, builder.build());
                return this;
            }

            public Builder addAllAssetsToCache(Iterable<? extends CampaignAsset> iterable) {
                copyOnWrite();
                ((CampaignMetadata) this.instance).addAllAssetsToCache(iterable);
                return this;
            }

            public Builder clearAssetsToCache() {
                copyOnWrite();
                ((CampaignMetadata) this.instance).clearAssetsToCache();
                return this;
            }

            public Builder removeAssetsToCache(int i) {
                copyOnWrite();
                ((CampaignMetadata) this.instance).removeAssetsToCache(i);
                return this;
            }

            @Override // gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignMetadataOrBuilder
            public int getAdDataRefreshDelayMs() {
                return ((CampaignMetadata) this.instance).getAdDataRefreshDelayMs();
            }

            public Builder setAdDataRefreshDelayMs(int i) {
                copyOnWrite();
                ((CampaignMetadata) this.instance).setAdDataRefreshDelayMs(i);
                return this;
            }

            public Builder clearAdDataRefreshDelayMs() {
                copyOnWrite();
                ((CampaignMetadata) this.instance).clearAdDataRefreshDelayMs();
                return this;
            }

            @Override // gatewayprotocol.v1.CampaignMetadataOuterClass.CampaignMetadataOrBuilder
            public int getTtlSeconds() {
                return ((CampaignMetadata) this.instance).getTtlSeconds();
            }

            public Builder setTtlSeconds(int i) {
                copyOnWrite();
                ((CampaignMetadata) this.instance).setTtlSeconds(i);
                return this;
            }

            public Builder clearTtlSeconds() {
                copyOnWrite();
                ((CampaignMetadata) this.instance).clearTtlSeconds();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new CampaignMetadata();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0004\u0002\n\u0003\u001b\u0004\u0004\u0005\u0004", new Object[]{"campaignStateDataVersion_", "campaignStateData_", "assetsToCache_", CampaignAsset.class, "adDataRefreshDelayMs_", "ttlSeconds_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<CampaignMetadata> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (CampaignMetadata.class) {
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
            CampaignMetadata campaignMetadata = new CampaignMetadata();
            DEFAULT_INSTANCE = campaignMetadata;
            GeneratedMessageLite.registerDefaultInstance(CampaignMetadata.class, campaignMetadata);
        }

        public static CampaignMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CampaignMetadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
