package org.chromium.net.impl;

import j$.time.Duration;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class CronetLogger {

    public static final class CronetEngineBuilderInitializedInfo {
        public CronetVersion apiVersion;
        public Author author;
        public Boolean creationSuccessful;
        public long cronetInitializationRef;
        public CronetVersion implVersion;
        public int uid;
        public int engineBuilderCreatedLatencyMillis = -1;
        public CronetSource source = CronetSource.CRONET_SOURCE_UNSPECIFIED;

        public enum Author {
            API,
            IMPL
        }
    }

    public static final class CronetInitializedInfo {
        public String cronetImplVersion;
        public long cronetInitializationRef;
        public List<Long> httpFlagsNames;
        public Boolean httpFlagsSuccessful;
        public List<Long> httpFlagsValues;
        public int engineCreationLatencyMillis = -1;
        public int engineAsyncLatencyMillis = -1;
        public int httpFlagsLatencyMillis = -1;
        public CronetSource source = CronetSource.CRONET_SOURCE_UNSPECIFIED;
    }

    public enum CronetSource {
        CRONET_SOURCE_UNSPECIFIED,
        CRONET_SOURCE_STATICALLY_LINKED,
        CRONET_SOURCE_PLAY_SERVICES,
        CRONET_SOURCE_FALLBACK,
        CRONET_SOURCE_PLATFORM,
        CRONET_SOURCE_FAKE
    }

    public abstract long generateId();

    public abstract void logCronetEngineBuilderInitializedInfo(CronetEngineBuilderInitializedInfo info);

    public abstract void logCronetEngineCreation(long cronetEngineId, CronetEngineBuilderInfo engineBuilderInfo, CronetVersion version, CronetSource source);

    public abstract void logCronetInitializedInfo(CronetInitializedInfo info);

    public abstract void logCronetTrafficInfo(long cronetEngineId, CronetTrafficInfo trafficInfo);

    public static class CronetEngineBuilderInfo {
        private final boolean mBrotiEnabled;
        private final long mCronetInitializationRef;
        private final String mExperimentalOptions;
        private final boolean mHttp2Enabled;
        private final int mHttpCacheMode;
        private final boolean mNetworkQualityEstimatorEnabled;
        private final boolean mPublicKeyPinningBypassForLocalTrustAnchorsEnabled;
        private final boolean mQuicEnabled;
        private final String mStoragePath;
        private final int mThreadPriority;
        private final String mUserAgent;

        public CronetEngineBuilderInfo(boolean publicKeyPinningBypassForLocalTrustAnchorsEnabled, String userAgent, String storagePath, boolean quicEnabled, boolean http2Enabled, boolean brotiEnabled, int httpCacheMode, String experimentalOptions, boolean networkQualityEstimatorEnabled, int threadPriority, long cronetInitializationRef) {
            this.mPublicKeyPinningBypassForLocalTrustAnchorsEnabled = publicKeyPinningBypassForLocalTrustAnchorsEnabled;
            this.mUserAgent = userAgent;
            this.mStoragePath = storagePath;
            this.mQuicEnabled = quicEnabled;
            this.mHttp2Enabled = http2Enabled;
            this.mBrotiEnabled = brotiEnabled;
            this.mHttpCacheMode = httpCacheMode;
            this.mExperimentalOptions = experimentalOptions;
            this.mNetworkQualityEstimatorEnabled = networkQualityEstimatorEnabled;
            this.mThreadPriority = threadPriority;
            this.mCronetInitializationRef = cronetInitializationRef;
        }

        public boolean isPublicKeyPinningBypassForLocalTrustAnchorsEnabled() {
            return this.mPublicKeyPinningBypassForLocalTrustAnchorsEnabled;
        }

        public String getUserAgent() {
            return this.mUserAgent;
        }

        public String getStoragePath() {
            return this.mStoragePath;
        }

        public boolean isQuicEnabled() {
            return this.mQuicEnabled;
        }

        public boolean isHttp2Enabled() {
            return this.mHttp2Enabled;
        }

        public boolean isBrotliEnabled() {
            return this.mBrotiEnabled;
        }

        public int getHttpCacheMode() {
            return this.mHttpCacheMode;
        }

        public String getExperimentalOptions() {
            return this.mExperimentalOptions;
        }

        public boolean isNetworkQualityEstimatorEnabled() {
            return this.mNetworkQualityEstimatorEnabled;
        }

        public int getThreadPriority() {
            return this.mThreadPriority;
        }

        public long getCronetInitializationRef() {
            return this.mCronetInitializationRef;
        }
    }

    public static class CronetTrafficInfo {
        private final CronetSource mCronetSource;
        private final String mCronetVersion;
        private final boolean mDidConnectionMigrationSucceed;
        private final RequestFailureReason mFailureReason;
        private final boolean mFinalUserCallbackThrew;
        private final Duration mHeadersLatency;
        private final boolean mIsBidiStream;
        private final String mNegotiatedProtocol;
        private final int mNetworkInternalErrorCode;
        private final int mNonfinalUserCallbackExceptionCount;
        private final int mOnUploadReadCount;
        private final int mQuicErrorCode;
        private final int mReadCount;
        private final long mRequestBodySizeInBytes;
        private final long mRequestHeaderSizeInBytes;
        private final long mResponseBodySizeInBytes;
        private final long mResponseHeaderSizeInBytes;
        private final int mResponseStatusCode;
        private final boolean mSocketReused;
        private final int mSource;
        private final RequestTerminalState mTerminalState;
        private final long mTimeToConnectMillis;
        private final long mTimeToEstablishDnsMillis;
        private final long mTimeToEstablishSSLMillis;
        private final long mTimeToSendFirstByteMillis;
        private final Duration mTotalLatency;
        private final int mUid;
        private final boolean mWasConnectionMigrationAttempted;

        public enum RequestFailureReason {
            UNKNOWN,
            NETWORK,
            OTHER
        }

        public enum RequestTerminalState {
            SUCCEEDED,
            ERROR,
            CANCELLED
        }

        public CronetTrafficInfo(long requestHeaderSizeInBytes, long requestBodySizeInBytes, long responseHeaderSizeInBytes, long responseBodySizeInBytes, int responseStatusCode, Duration headersLatency, Duration totalLatency, String negotiatedProtocol, boolean wasConnectionMigrationAttempted, boolean didConnectionMigrationSucceed, RequestTerminalState terminalState, int nonfinalUserCallbackExceptionCount, int readCount, int uploadReadCount, boolean isBidiStream, boolean finalUserCallbackThrew, int uid, int networkInternalErrorCode, int quicErrorCode, int source, RequestFailureReason failureReason, boolean sockedReused, String cronetVersion, CronetSource cronetSource, long timeToEstablishDnsMillis, long timeToEstablishSSLMillis, long timeToConnectMillis, long timeToSendFirstByteMillis) {
            this.mRequestHeaderSizeInBytes = requestHeaderSizeInBytes;
            this.mRequestBodySizeInBytes = requestBodySizeInBytes;
            this.mResponseHeaderSizeInBytes = responseHeaderSizeInBytes;
            this.mResponseBodySizeInBytes = responseBodySizeInBytes;
            this.mResponseStatusCode = responseStatusCode;
            this.mHeadersLatency = headersLatency;
            this.mTotalLatency = totalLatency;
            this.mNegotiatedProtocol = negotiatedProtocol;
            this.mWasConnectionMigrationAttempted = wasConnectionMigrationAttempted;
            this.mDidConnectionMigrationSucceed = didConnectionMigrationSucceed;
            this.mTerminalState = terminalState;
            this.mNonfinalUserCallbackExceptionCount = nonfinalUserCallbackExceptionCount;
            this.mReadCount = readCount;
            this.mOnUploadReadCount = uploadReadCount;
            this.mIsBidiStream = isBidiStream;
            this.mFinalUserCallbackThrew = finalUserCallbackThrew;
            this.mUid = uid;
            this.mNetworkInternalErrorCode = networkInternalErrorCode;
            this.mQuicErrorCode = quicErrorCode;
            this.mSource = source;
            this.mFailureReason = failureReason;
            this.mSocketReused = sockedReused;
            this.mCronetVersion = cronetVersion;
            this.mCronetSource = cronetSource;
            this.mTimeToEstablishDnsMillis = timeToEstablishDnsMillis;
            this.mTimeToEstablishSSLMillis = timeToEstablishSSLMillis;
            this.mTimeToConnectMillis = timeToConnectMillis;
            this.mTimeToSendFirstByteMillis = timeToSendFirstByteMillis;
        }

        public long getRequestHeaderSizeInBytes() {
            return this.mRequestHeaderSizeInBytes;
        }

        public long getRequestBodySizeInBytes() {
            return this.mRequestBodySizeInBytes;
        }

        public long getResponseHeaderSizeInBytes() {
            return this.mResponseHeaderSizeInBytes;
        }

        public long getResponseBodySizeInBytes() {
            return this.mResponseBodySizeInBytes;
        }

        public int getResponseStatusCode() {
            return this.mResponseStatusCode;
        }

        public Duration getHeadersLatency() {
            return this.mHeadersLatency;
        }

        public Duration getTotalLatency() {
            return this.mTotalLatency;
        }

        public String getNegotiatedProtocol() {
            return this.mNegotiatedProtocol;
        }

        public boolean wasConnectionMigrationAttempted() {
            return this.mWasConnectionMigrationAttempted;
        }

        public boolean didConnectionMigrationSucceed() {
            return this.mDidConnectionMigrationSucceed;
        }

        public RequestTerminalState getTerminalState() {
            return this.mTerminalState;
        }

        public int getNonfinalUserCallbackExceptionCount() {
            return this.mNonfinalUserCallbackExceptionCount;
        }

        public int getReadCount() {
            return this.mReadCount;
        }

        public int getOnUploadReadCount() {
            return this.mOnUploadReadCount;
        }

        public boolean getIsBidiStream() {
            return this.mIsBidiStream;
        }

        public boolean getFinalUserCallbackThrew() {
            return this.mFinalUserCallbackThrew;
        }

        public int getUid() {
            return this.mUid;
        }

        public int getNetworkInternalErrorCode() {
            return this.mNetworkInternalErrorCode;
        }

        public int getQuicErrorCode() {
            return this.mQuicErrorCode;
        }

        public int getConnectionCloseSource() {
            return this.mSource;
        }

        public RequestFailureReason getFailureReason() {
            return this.mFailureReason;
        }

        public boolean getIsSocketReused() {
            return this.mSocketReused;
        }

        public String getCronetVersion() {
            return this.mCronetVersion;
        }

        public CronetSource getCronetSource() {
            return this.mCronetSource;
        }

        public long getTimeToEstablishDNSMillis() {
            return this.mTimeToEstablishDnsMillis;
        }

        public long getTimeToEstablishSSLMillis() {
            return this.mTimeToEstablishSSLMillis;
        }

        public long getTimeToConnectMillis() {
            return this.mTimeToConnectMillis;
        }

        public long getTimeToSendFirstByteMillis() {
            return this.mTimeToSendFirstByteMillis;
        }
    }

    public static class CronetVersion {
        private final int mBuildVersion;
        private final int mMajorVersion;
        private final int mMinorVersion;
        private final int mPatchVersion;

        public CronetVersion(String version) {
            String[] split = version.split("\\.");
            this.mMajorVersion = Integer.parseInt(split[0]);
            this.mMinorVersion = Integer.parseInt(split[1]);
            this.mBuildVersion = Integer.parseInt(split[2]);
            this.mPatchVersion = Integer.parseInt(split[3]);
        }

        public int getMajorVersion() {
            return this.mMajorVersion;
        }

        public int getMinorVersion() {
            return this.mMinorVersion;
        }

        public int getBuildVersion() {
            return this.mBuildVersion;
        }

        public int getPatchVersion() {
            return this.mPatchVersion;
        }

        public String toString() {
            return this.mMajorVersion + "." + this.mMinorVersion + "." + this.mBuildVersion + "." + this.mPatchVersion;
        }
    }
}
