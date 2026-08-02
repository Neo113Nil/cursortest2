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
import org.chromium.net.impl.proto.ProxyOptions;

/* loaded from: classes10.dex */
public final class RequestContextConfigOptions extends GeneratedMessageLite<RequestContextConfigOptions, Builder> implements RequestContextConfigOptionsOrBuilder {
    public static final int BROTLI_ENABLED_FIELD_NUMBER = 6;
    public static final int BYPASS_PUBLIC_KEY_PINNING_FOR_LOCAL_TRUST_ANCHORS_FIELD_NUMBER = 13;
    private static final RequestContextConfigOptions DEFAULT_INSTANCE;
    public static final int DISABLE_CACHE_FIELD_NUMBER = 7;
    public static final int ENABLE_NETWORK_QUALITY_ESTIMATOR_FIELD_NUMBER = 12;
    public static final int EXPERIMENTAL_OPTIONS_FIELD_NUMBER = 10;
    public static final int HTTP2_ENABLED_FIELD_NUMBER = 5;
    public static final int HTTP_CACHE_MAX_SIZE_FIELD_NUMBER = 9;
    public static final int HTTP_CACHE_MODE_FIELD_NUMBER = 8;
    public static final int MOCK_CERT_VERIFIER_FIELD_NUMBER = 11;
    public static final int NETWORK_THREAD_PRIORITY_FIELD_NUMBER = 14;
    private static volatile Parser<RequestContextConfigOptions> PARSER = null;
    public static final int PROXY_OPTIONS_FIELD_NUMBER = 15;
    public static final int QUIC_DEFAULT_USER_AGENT_ID_FIELD_NUMBER = 4;
    public static final int QUIC_ENABLED_FIELD_NUMBER = 3;
    public static final int STORAGE_PATH_FIELD_NUMBER = 2;
    public static final int USER_AGENT_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean brotliEnabled_;
    private boolean bypassPublicKeyPinningForLocalTrustAnchors_;
    private boolean disableCache_;
    private boolean enableNetworkQualityEstimator_;
    private boolean http2Enabled_;
    private long httpCacheMaxSize_;
    private int httpCacheMode_;
    private long mockCertVerifier_;
    private int networkThreadPriority_;
    private ProxyOptions proxyOptions_;
    private boolean quicEnabled_;
    private String userAgent_ = "";
    private String storagePath_ = "";
    private String quicDefaultUserAgentId_ = "";
    private String experimentalOptions_ = "";

    private RequestContextConfigOptions() {
    }

    @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
    public boolean hasUserAgent() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
    public String getUserAgent() {
        return this.userAgent_;
    }

    @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
    public ByteString getUserAgentBytes() {
        return ByteString.copyFromUtf8(this.userAgent_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAgent(String value) {
        value.getClass();
        this.bitField0_ |= 1;
        this.userAgent_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserAgent() {
        this.bitField0_ &= -2;
        this.userAgent_ = getDefaultInstance().getUserAgent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAgentBytes(ByteString value) {
        this.userAgent_ = value.toStringUtf8();
        this.bitField0_ |= 1;
    }

    @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
    public boolean hasStoragePath() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
    public String getStoragePath() {
        return this.storagePath_;
    }

    @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
    public ByteString getStoragePathBytes() {
        return ByteString.copyFromUtf8(this.storagePath_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStoragePath(String value) {
        value.getClass();
        this.bitField0_ |= 2;
        this.storagePath_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStoragePath() {
        this.bitField0_ &= -3;
        this.storagePath_ = getDefaultInstance().getStoragePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStoragePathBytes(ByteString value) {
        this.storagePath_ = value.toStringUtf8();
        this.bitField0_ |= 2;
    }

    @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
    public boolean hasQuicEnabled() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
    public boolean getQuicEnabled() {
        return this.quicEnabled_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuicEnabled(boolean value) {
        this.bitField0_ |= 4;
        this.quicEnabled_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuicEnabled() {
        this.bitField0_ &= -5;
        this.quicEnabled_ = false;
    }

    @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
    public boolean hasQuicDefaultUserAgentId() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
    public String getQuicDefaultUserAgentId() {
        return this.quicDefaultUserAgentId_;
    }

    @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
    public ByteString getQuicDefaultUserAgentIdBytes() {
        return ByteString.copyFromUtf8(this.quicDefaultUserAgentId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuicDefaultUserAgentId(String value) {
        value.getClass();
        this.bitField0_ |= 8;
        this.quicDefaultUserAgentId_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuicDefaultUserAgentId() {
        this.bitField0_ &= -9;
        this.quicDefaultUserAgentId_ = getDefaultInstance().getQuicDefaultUserAgentId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuicDefaultUserAgentIdBytes(ByteString value) {
        this.quicDefaultUserAgentId_ = value.toStringUtf8();
        this.bitField0_ |= 8;
    }

    @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
    public boolean hasHttp2Enabled() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
    public boolean getHttp2Enabled() {
        return this.http2Enabled_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttp2Enabled(boolean value) {
        this.bitField0_ |= 16;
        this.http2Enabled_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttp2Enabled() {
        this.bitField0_ &= -17;
        this.http2Enabled_ = false;
    }

    @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
    public boolean hasBrotliEnabled() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
    public boolean getBrotliEnabled() {
        return this.brotliEnabled_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrotliEnabled(boolean value) {
        this.bitField0_ |= 32;
        this.brotliEnabled_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrotliEnabled() {
        this.bitField0_ &= -33;
        this.brotliEnabled_ = false;
    }

    @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
    public boolean hasDisableCache() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
    public boolean getDisableCache() {
        return this.disableCache_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableCache(boolean value) {
        this.bitField0_ |= 64;
        this.disableCache_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableCache() {
        this.bitField0_ &= -65;
        this.disableCache_ = false;
    }

    @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
    public boolean hasHttpCacheMode() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
    public int getHttpCacheMode() {
        return this.httpCacheMode_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttpCacheMode(int value) {
        this.bitField0_ |= 128;
        this.httpCacheMode_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttpCacheMode() {
        this.bitField0_ &= -129;
        this.httpCacheMode_ = 0;
    }

    @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
    public boolean hasHttpCacheMaxSize() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
    public long getHttpCacheMaxSize() {
        return this.httpCacheMaxSize_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttpCacheMaxSize(long value) {
        this.bitField0_ |= 256;
        this.httpCacheMaxSize_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttpCacheMaxSize() {
        this.bitField0_ &= -257;
        this.httpCacheMaxSize_ = 0L;
    }

    @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
    public boolean hasExperimentalOptions() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
    public String getExperimentalOptions() {
        return this.experimentalOptions_;
    }

    @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
    public ByteString getExperimentalOptionsBytes() {
        return ByteString.copyFromUtf8(this.experimentalOptions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentalOptions(String value) {
        value.getClass();
        this.bitField0_ |= 512;
        this.experimentalOptions_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExperimentalOptions() {
        this.bitField0_ &= -513;
        this.experimentalOptions_ = getDefaultInstance().getExperimentalOptions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentalOptionsBytes(ByteString value) {
        this.experimentalOptions_ = value.toStringUtf8();
        this.bitField0_ |= 512;
    }

    @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
    public boolean hasMockCertVerifier() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
    public long getMockCertVerifier() {
        return this.mockCertVerifier_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMockCertVerifier(long value) {
        this.bitField0_ |= 1024;
        this.mockCertVerifier_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMockCertVerifier() {
        this.bitField0_ &= -1025;
        this.mockCertVerifier_ = 0L;
    }

    @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
    public boolean hasEnableNetworkQualityEstimator() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
    public boolean getEnableNetworkQualityEstimator() {
        return this.enableNetworkQualityEstimator_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnableNetworkQualityEstimator(boolean value) {
        this.bitField0_ |= 2048;
        this.enableNetworkQualityEstimator_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnableNetworkQualityEstimator() {
        this.bitField0_ &= -2049;
        this.enableNetworkQualityEstimator_ = false;
    }

    @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
    public boolean hasBypassPublicKeyPinningForLocalTrustAnchors() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
    public boolean getBypassPublicKeyPinningForLocalTrustAnchors() {
        return this.bypassPublicKeyPinningForLocalTrustAnchors_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBypassPublicKeyPinningForLocalTrustAnchors(boolean value) {
        this.bitField0_ |= 4096;
        this.bypassPublicKeyPinningForLocalTrustAnchors_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBypassPublicKeyPinningForLocalTrustAnchors() {
        this.bitField0_ &= -4097;
        this.bypassPublicKeyPinningForLocalTrustAnchors_ = false;
    }

    @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
    public boolean hasNetworkThreadPriority() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
    public int getNetworkThreadPriority() {
        return this.networkThreadPriority_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkThreadPriority(int value) {
        this.bitField0_ |= 8192;
        this.networkThreadPriority_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkThreadPriority() {
        this.bitField0_ &= -8193;
        this.networkThreadPriority_ = 0;
    }

    @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
    public boolean hasProxyOptions() {
        return (this.bitField0_ & 16384) != 0;
    }

    @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
    public ProxyOptions getProxyOptions() {
        ProxyOptions proxyOptions = this.proxyOptions_;
        return proxyOptions == null ? ProxyOptions.getDefaultInstance() : proxyOptions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProxyOptions(ProxyOptions value) {
        value.getClass();
        this.proxyOptions_ = value;
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeProxyOptions(ProxyOptions value) {
        value.getClass();
        ProxyOptions proxyOptions = this.proxyOptions_;
        if (proxyOptions != null && proxyOptions != ProxyOptions.getDefaultInstance()) {
            this.proxyOptions_ = ProxyOptions.newBuilder(this.proxyOptions_).mergeFrom((ProxyOptions.Builder) value).buildPartial();
        } else {
            this.proxyOptions_ = value;
        }
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProxyOptions() {
        this.proxyOptions_ = null;
        this.bitField0_ &= -16385;
    }

    public static RequestContextConfigOptions parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (RequestContextConfigOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static RequestContextConfigOptions parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (RequestContextConfigOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static RequestContextConfigOptions parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (RequestContextConfigOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static RequestContextConfigOptions parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (RequestContextConfigOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static RequestContextConfigOptions parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (RequestContextConfigOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static RequestContextConfigOptions parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (RequestContextConfigOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static RequestContextConfigOptions parseFrom(InputStream input) throws IOException {
        return (RequestContextConfigOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static RequestContextConfigOptions parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (RequestContextConfigOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static RequestContextConfigOptions parseDelimitedFrom(InputStream input) throws IOException {
        return (RequestContextConfigOptions) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static RequestContextConfigOptions parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (RequestContextConfigOptions) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static RequestContextConfigOptions parseFrom(CodedInputStream input) throws IOException {
        return (RequestContextConfigOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static RequestContextConfigOptions parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (RequestContextConfigOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(RequestContextConfigOptions prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<RequestContextConfigOptions, Builder> implements RequestContextConfigOptionsOrBuilder {
        private Builder() {
            super(RequestContextConfigOptions.DEFAULT_INSTANCE);
        }

        @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
        public boolean hasUserAgent() {
            return ((RequestContextConfigOptions) this.instance).hasUserAgent();
        }

        @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
        public String getUserAgent() {
            return ((RequestContextConfigOptions) this.instance).getUserAgent();
        }

        @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
        public ByteString getUserAgentBytes() {
            return ((RequestContextConfigOptions) this.instance).getUserAgentBytes();
        }

        public Builder setUserAgent(String value) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setUserAgent(value);
            return this;
        }

        public Builder clearUserAgent() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearUserAgent();
            return this;
        }

        public Builder setUserAgentBytes(ByteString value) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setUserAgentBytes(value);
            return this;
        }

        @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
        public boolean hasStoragePath() {
            return ((RequestContextConfigOptions) this.instance).hasStoragePath();
        }

        @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
        public String getStoragePath() {
            return ((RequestContextConfigOptions) this.instance).getStoragePath();
        }

        @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
        public ByteString getStoragePathBytes() {
            return ((RequestContextConfigOptions) this.instance).getStoragePathBytes();
        }

        public Builder setStoragePath(String value) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setStoragePath(value);
            return this;
        }

        public Builder clearStoragePath() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearStoragePath();
            return this;
        }

        public Builder setStoragePathBytes(ByteString value) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setStoragePathBytes(value);
            return this;
        }

        @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
        public boolean hasQuicEnabled() {
            return ((RequestContextConfigOptions) this.instance).hasQuicEnabled();
        }

        @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
        public boolean getQuicEnabled() {
            return ((RequestContextConfigOptions) this.instance).getQuicEnabled();
        }

        public Builder setQuicEnabled(boolean value) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setQuicEnabled(value);
            return this;
        }

        public Builder clearQuicEnabled() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearQuicEnabled();
            return this;
        }

        @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
        public boolean hasQuicDefaultUserAgentId() {
            return ((RequestContextConfigOptions) this.instance).hasQuicDefaultUserAgentId();
        }

        @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
        public String getQuicDefaultUserAgentId() {
            return ((RequestContextConfigOptions) this.instance).getQuicDefaultUserAgentId();
        }

        @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
        public ByteString getQuicDefaultUserAgentIdBytes() {
            return ((RequestContextConfigOptions) this.instance).getQuicDefaultUserAgentIdBytes();
        }

        public Builder setQuicDefaultUserAgentId(String value) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setQuicDefaultUserAgentId(value);
            return this;
        }

        public Builder clearQuicDefaultUserAgentId() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearQuicDefaultUserAgentId();
            return this;
        }

        public Builder setQuicDefaultUserAgentIdBytes(ByteString value) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setQuicDefaultUserAgentIdBytes(value);
            return this;
        }

        @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
        public boolean hasHttp2Enabled() {
            return ((RequestContextConfigOptions) this.instance).hasHttp2Enabled();
        }

        @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
        public boolean getHttp2Enabled() {
            return ((RequestContextConfigOptions) this.instance).getHttp2Enabled();
        }

        public Builder setHttp2Enabled(boolean value) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setHttp2Enabled(value);
            return this;
        }

        public Builder clearHttp2Enabled() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearHttp2Enabled();
            return this;
        }

        @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
        public boolean hasBrotliEnabled() {
            return ((RequestContextConfigOptions) this.instance).hasBrotliEnabled();
        }

        @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
        public boolean getBrotliEnabled() {
            return ((RequestContextConfigOptions) this.instance).getBrotliEnabled();
        }

        public Builder setBrotliEnabled(boolean value) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setBrotliEnabled(value);
            return this;
        }

        public Builder clearBrotliEnabled() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearBrotliEnabled();
            return this;
        }

        @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
        public boolean hasDisableCache() {
            return ((RequestContextConfigOptions) this.instance).hasDisableCache();
        }

        @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
        public boolean getDisableCache() {
            return ((RequestContextConfigOptions) this.instance).getDisableCache();
        }

        public Builder setDisableCache(boolean value) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setDisableCache(value);
            return this;
        }

        public Builder clearDisableCache() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearDisableCache();
            return this;
        }

        @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
        public boolean hasHttpCacheMode() {
            return ((RequestContextConfigOptions) this.instance).hasHttpCacheMode();
        }

        @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
        public int getHttpCacheMode() {
            return ((RequestContextConfigOptions) this.instance).getHttpCacheMode();
        }

        public Builder setHttpCacheMode(int value) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setHttpCacheMode(value);
            return this;
        }

        public Builder clearHttpCacheMode() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearHttpCacheMode();
            return this;
        }

        @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
        public boolean hasHttpCacheMaxSize() {
            return ((RequestContextConfigOptions) this.instance).hasHttpCacheMaxSize();
        }

        @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
        public long getHttpCacheMaxSize() {
            return ((RequestContextConfigOptions) this.instance).getHttpCacheMaxSize();
        }

        public Builder setHttpCacheMaxSize(long value) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setHttpCacheMaxSize(value);
            return this;
        }

        public Builder clearHttpCacheMaxSize() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearHttpCacheMaxSize();
            return this;
        }

        @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
        public boolean hasExperimentalOptions() {
            return ((RequestContextConfigOptions) this.instance).hasExperimentalOptions();
        }

        @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
        public String getExperimentalOptions() {
            return ((RequestContextConfigOptions) this.instance).getExperimentalOptions();
        }

        @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
        public ByteString getExperimentalOptionsBytes() {
            return ((RequestContextConfigOptions) this.instance).getExperimentalOptionsBytes();
        }

        public Builder setExperimentalOptions(String value) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setExperimentalOptions(value);
            return this;
        }

        public Builder clearExperimentalOptions() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearExperimentalOptions();
            return this;
        }

        public Builder setExperimentalOptionsBytes(ByteString value) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setExperimentalOptionsBytes(value);
            return this;
        }

        @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
        public boolean hasMockCertVerifier() {
            return ((RequestContextConfigOptions) this.instance).hasMockCertVerifier();
        }

        @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
        public long getMockCertVerifier() {
            return ((RequestContextConfigOptions) this.instance).getMockCertVerifier();
        }

        public Builder setMockCertVerifier(long value) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setMockCertVerifier(value);
            return this;
        }

        public Builder clearMockCertVerifier() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearMockCertVerifier();
            return this;
        }

        @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
        public boolean hasEnableNetworkQualityEstimator() {
            return ((RequestContextConfigOptions) this.instance).hasEnableNetworkQualityEstimator();
        }

        @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
        public boolean getEnableNetworkQualityEstimator() {
            return ((RequestContextConfigOptions) this.instance).getEnableNetworkQualityEstimator();
        }

        public Builder setEnableNetworkQualityEstimator(boolean value) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setEnableNetworkQualityEstimator(value);
            return this;
        }

        public Builder clearEnableNetworkQualityEstimator() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearEnableNetworkQualityEstimator();
            return this;
        }

        @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
        public boolean hasBypassPublicKeyPinningForLocalTrustAnchors() {
            return ((RequestContextConfigOptions) this.instance).hasBypassPublicKeyPinningForLocalTrustAnchors();
        }

        @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
        public boolean getBypassPublicKeyPinningForLocalTrustAnchors() {
            return ((RequestContextConfigOptions) this.instance).getBypassPublicKeyPinningForLocalTrustAnchors();
        }

        public Builder setBypassPublicKeyPinningForLocalTrustAnchors(boolean value) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setBypassPublicKeyPinningForLocalTrustAnchors(value);
            return this;
        }

        public Builder clearBypassPublicKeyPinningForLocalTrustAnchors() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearBypassPublicKeyPinningForLocalTrustAnchors();
            return this;
        }

        @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
        public boolean hasNetworkThreadPriority() {
            return ((RequestContextConfigOptions) this.instance).hasNetworkThreadPriority();
        }

        @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
        public int getNetworkThreadPriority() {
            return ((RequestContextConfigOptions) this.instance).getNetworkThreadPriority();
        }

        public Builder setNetworkThreadPriority(int value) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setNetworkThreadPriority(value);
            return this;
        }

        public Builder clearNetworkThreadPriority() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearNetworkThreadPriority();
            return this;
        }

        @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
        public boolean hasProxyOptions() {
            return ((RequestContextConfigOptions) this.instance).hasProxyOptions();
        }

        @Override // org.chromium.net.impl.proto.RequestContextConfigOptionsOrBuilder
        public ProxyOptions getProxyOptions() {
            return ((RequestContextConfigOptions) this.instance).getProxyOptions();
        }

        public Builder setProxyOptions(ProxyOptions value) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setProxyOptions(value);
            return this;
        }

        public Builder setProxyOptions(ProxyOptions.Builder builderForValue) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).setProxyOptions(builderForValue.build());
            return this;
        }

        public Builder mergeProxyOptions(ProxyOptions value) {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).mergeProxyOptions(value);
            return this;
        }

        public Builder clearProxyOptions() {
            copyOnWrite();
            ((RequestContextConfigOptions) this.instance).clearProxyOptions();
            return this;
        }
    }

    /* renamed from: org.chromium.net.impl.proto.RequestContextConfigOptions$1, reason: invalid class name */
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
                return new RequestContextConfigOptions();
            case 2:
                return new Builder();
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bင\u0007\tဂ\b\nဈ\t\u000bဂ\n\fဇ\u000b\rဇ\f\u000eင\r\u000fဉ\u000e", new Object[]{"bitField0_", "userAgent_", "storagePath_", "quicEnabled_", "quicDefaultUserAgentId_", "http2Enabled_", "brotliEnabled_", "disableCache_", "httpCacheMode_", "httpCacheMaxSize_", "experimentalOptions_", "mockCertVerifier_", "enableNetworkQualityEstimator_", "bypassPublicKeyPinningForLocalTrustAnchors_", "networkThreadPriority_", "proxyOptions_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RequestContextConfigOptions> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (RequestContextConfigOptions.class) {
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
        RequestContextConfigOptions requestContextConfigOptions = new RequestContextConfigOptions();
        DEFAULT_INSTANCE = requestContextConfigOptions;
        GeneratedMessageLite.registerDefaultInstance(RequestContextConfigOptions.class, requestContextConfigOptions);
    }

    public static RequestContextConfigOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<RequestContextConfigOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
