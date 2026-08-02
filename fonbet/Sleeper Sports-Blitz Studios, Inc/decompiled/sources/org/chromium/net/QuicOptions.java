package org.chromium.net;

import j$.time.Duration;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes10.dex */
public final class QuicOptions {
    private final Set<String> mClientConnectionOptions;
    private final Boolean mCloseSessionsOnIpChange;
    private final Set<String> mConnectionOptions;
    private final Long mCryptoHandshakeTimeoutSeconds;
    private final Boolean mDelayJobsWithAvailableSpdySession;
    private final Boolean mEnableTlsZeroRtt;
    private final Set<String> mEnabledQuicVersions;
    private final Set<String> mExtraQuicheFlags;
    private final Boolean mGoawaySessionsOnIpChange;
    private final String mHandshakeUserAgent;
    private final Long mIdleConnectionTimeoutSeconds;
    private final Integer mInMemoryServerConfigsCacheSize;
    private final Boolean mIncreaseBrokenServicePeriodExponentially;
    private final Long mInitialBrokenServicePeriodSeconds;
    private final Long mPreCryptoHandshakeIdleTimeoutSeconds;
    private final Set<String> mQuicHostAllowlist;
    private final Long mRetransmittableOnWireTimeoutMillis;
    private final Boolean mRetryWithoutAltSvcOnQuicErrors;

    public @interface Experimental {
    }

    public @interface QuichePassthroughOption {
    }

    QuicOptions(Builder builder) {
        this.mQuicHostAllowlist = Collections.unmodifiableSet(new LinkedHashSet(builder.mQuicHostAllowlist));
        this.mEnabledQuicVersions = Collections.unmodifiableSet(new LinkedHashSet(builder.mEnabledQuicVersions));
        this.mConnectionOptions = Collections.unmodifiableSet(new LinkedHashSet(builder.mConnectionOptions));
        this.mClientConnectionOptions = Collections.unmodifiableSet(new LinkedHashSet(builder.mClientConnectionOptions));
        this.mInMemoryServerConfigsCacheSize = builder.mInMemoryServerConfigsCacheSize;
        this.mHandshakeUserAgent = builder.mHandshakeUserAgent;
        this.mRetryWithoutAltSvcOnQuicErrors = builder.mRetryWithoutAltSvcOnQuicErrors;
        this.mEnableTlsZeroRtt = builder.mEnableTlsZeroRtt;
        this.mPreCryptoHandshakeIdleTimeoutSeconds = builder.mPreCryptoHandshakeIdleTimeoutSeconds;
        this.mCryptoHandshakeTimeoutSeconds = builder.mCryptoHandshakeTimeoutSeconds;
        this.mIdleConnectionTimeoutSeconds = builder.mIdleConnectionTimeoutSeconds;
        this.mRetransmittableOnWireTimeoutMillis = builder.mRetransmittableOnWireTimeoutMillis;
        this.mCloseSessionsOnIpChange = builder.mCloseSessionsOnIpChange;
        this.mGoawaySessionsOnIpChange = builder.mGoawaySessionsOnIpChange;
        this.mInitialBrokenServicePeriodSeconds = builder.mInitialBrokenServicePeriodSeconds;
        this.mIncreaseBrokenServicePeriodExponentially = builder.mIncreaseBrokenServicePeriodExponentially;
        this.mDelayJobsWithAvailableSpdySession = builder.mDelayJobsWithAvailableSpdySession;
        this.mExtraQuicheFlags = Collections.unmodifiableSet(new LinkedHashSet(builder.mExtraQuicheFlags));
    }

    public Set<String> getQuicHostAllowlist() {
        return this.mQuicHostAllowlist;
    }

    public Set<String> getEnabledQuicVersions() {
        return this.mEnabledQuicVersions;
    }

    public Set<String> getConnectionOptions() {
        return this.mConnectionOptions;
    }

    public Set<String> getClientConnectionOptions() {
        return this.mClientConnectionOptions;
    }

    public Integer getInMemoryServerConfigsCacheSize() {
        return this.mInMemoryServerConfigsCacheSize;
    }

    public String getHandshakeUserAgent() {
        return this.mHandshakeUserAgent;
    }

    public Boolean getRetryWithoutAltSvcOnQuicErrors() {
        return this.mRetryWithoutAltSvcOnQuicErrors;
    }

    public Boolean getEnableTlsZeroRtt() {
        return this.mEnableTlsZeroRtt;
    }

    public Long getPreCryptoHandshakeIdleTimeoutSeconds() {
        return this.mPreCryptoHandshakeIdleTimeoutSeconds;
    }

    public Long getCryptoHandshakeTimeoutSeconds() {
        return this.mCryptoHandshakeTimeoutSeconds;
    }

    public Long getIdleConnectionTimeoutSeconds() {
        return this.mIdleConnectionTimeoutSeconds;
    }

    public Long getRetransmittableOnWireTimeoutMillis() {
        return this.mRetransmittableOnWireTimeoutMillis;
    }

    public Boolean getCloseSessionsOnIpChange() {
        return this.mCloseSessionsOnIpChange;
    }

    public Boolean getGoawaySessionsOnIpChange() {
        return this.mGoawaySessionsOnIpChange;
    }

    public Long getInitialBrokenServicePeriodSeconds() {
        return this.mInitialBrokenServicePeriodSeconds;
    }

    public Boolean getIncreaseBrokenServicePeriodExponentially() {
        return this.mIncreaseBrokenServicePeriodExponentially;
    }

    public Boolean getDelayJobsWithAvailableSpdySession() {
        return this.mDelayJobsWithAvailableSpdySession;
    }

    public Set<String> getExtraQuicheFlags() {
        return this.mExtraQuicheFlags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Boolean mCloseSessionsOnIpChange;
        private Long mCryptoHandshakeTimeoutSeconds;
        private Boolean mDelayJobsWithAvailableSpdySession;
        private Boolean mEnableTlsZeroRtt;
        private Boolean mGoawaySessionsOnIpChange;
        private String mHandshakeUserAgent;
        private Long mIdleConnectionTimeoutSeconds;
        private Integer mInMemoryServerConfigsCacheSize;
        private Boolean mIncreaseBrokenServicePeriodExponentially;
        private Long mInitialBrokenServicePeriodSeconds;
        private Long mPreCryptoHandshakeIdleTimeoutSeconds;
        private Long mRetransmittableOnWireTimeoutMillis;
        private Boolean mRetryWithoutAltSvcOnQuicErrors;
        private final Set<String> mQuicHostAllowlist = new LinkedHashSet();
        private final Set<String> mEnabledQuicVersions = new LinkedHashSet();
        private final Set<String> mConnectionOptions = new LinkedHashSet();
        private final Set<String> mClientConnectionOptions = new LinkedHashSet();
        private final Set<String> mExtraQuicheFlags = new LinkedHashSet();

        Builder() {
        }

        public Builder addAllowedQuicHost(String quicHost) {
            this.mQuicHostAllowlist.add(quicHost);
            return this;
        }

        public Builder addEnabledQuicVersion(String enabledQuicVersion) {
            this.mEnabledQuicVersions.add(enabledQuicVersion);
            return this;
        }

        public Builder addConnectionOption(String connectionOption) {
            this.mConnectionOptions.add(connectionOption);
            return this;
        }

        public Builder addClientConnectionOption(String clientConnectionOption) {
            this.mClientConnectionOptions.add(clientConnectionOption);
            return this;
        }

        public Builder setInMemoryServerConfigsCacheSize(int inMemoryServerConfigsCacheSize) {
            this.mInMemoryServerConfigsCacheSize = Integer.valueOf(inMemoryServerConfigsCacheSize);
            return this;
        }

        public Builder setHandshakeUserAgent(String handshakeUserAgent) {
            this.mHandshakeUserAgent = handshakeUserAgent;
            return this;
        }

        public Builder retryWithoutAltSvcOnQuicErrors(boolean retryWithoutAltSvcOnQuicErrors) {
            this.mRetryWithoutAltSvcOnQuicErrors = Boolean.valueOf(retryWithoutAltSvcOnQuicErrors);
            return this;
        }

        public Builder enableTlsZeroRtt(boolean enableTlsZeroRtt) {
            this.mEnableTlsZeroRtt = Boolean.valueOf(enableTlsZeroRtt);
            return this;
        }

        public Builder setPreCryptoHandshakeIdleTimeoutSeconds(long preCryptoHandshakeIdleTimeoutSeconds) {
            this.mPreCryptoHandshakeIdleTimeoutSeconds = Long.valueOf(preCryptoHandshakeIdleTimeoutSeconds);
            return this;
        }

        public Builder setCryptoHandshakeTimeoutSeconds(long cryptoHandshakeTimeoutSeconds) {
            this.mCryptoHandshakeTimeoutSeconds = Long.valueOf(cryptoHandshakeTimeoutSeconds);
            return this;
        }

        public Builder setIdleConnectionTimeoutSeconds(long idleConnectionTimeoutSeconds) {
            this.mIdleConnectionTimeoutSeconds = Long.valueOf(idleConnectionTimeoutSeconds);
            return this;
        }

        public Builder setIdleConnectionTimeout(Duration idleConnectionTimeout) {
            Objects.requireNonNull(idleConnectionTimeout);
            return setIdleConnectionTimeoutSeconds(idleConnectionTimeout.toSeconds());
        }

        public Builder setRetransmittableOnWireTimeoutMillis(long retransmittableOnWireTimeoutMillis) {
            this.mRetransmittableOnWireTimeoutMillis = Long.valueOf(retransmittableOnWireTimeoutMillis);
            return this;
        }

        public Builder closeSessionsOnIpChange(boolean closeSessionsOnIpChange) {
            this.mCloseSessionsOnIpChange = Boolean.valueOf(closeSessionsOnIpChange);
            return this;
        }

        public Builder goawaySessionsOnIpChange(boolean goawaySessionsOnIpChange) {
            this.mGoawaySessionsOnIpChange = Boolean.valueOf(goawaySessionsOnIpChange);
            return this;
        }

        public Builder setInitialBrokenServicePeriodSeconds(long initialBrokenServicePeriodSeconds) {
            this.mInitialBrokenServicePeriodSeconds = Long.valueOf(initialBrokenServicePeriodSeconds);
            return this;
        }

        public Builder increaseBrokenServicePeriodExponentially(boolean increaseBrokenServicePeriodExponentially) {
            this.mIncreaseBrokenServicePeriodExponentially = Boolean.valueOf(increaseBrokenServicePeriodExponentially);
            return this;
        }

        public Builder delayJobsWithAvailableSpdySession(boolean delayJobsWithAvailableSpdySession) {
            this.mDelayJobsWithAvailableSpdySession = Boolean.valueOf(delayJobsWithAvailableSpdySession);
            return this;
        }

        public Builder addExtraQuicheFlag(String extraQuicheFlag) {
            this.mExtraQuicheFlags.add(extraQuicheFlag);
            return this;
        }

        public QuicOptions build() {
            return new QuicOptions(this);
        }
    }
}
