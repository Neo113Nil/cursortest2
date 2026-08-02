package com.vk.ads.optional.api.nativead;

import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.shy;
import xsna.urd0;

/* compiled from: NativeAd.kt */
/* loaded from: classes14.dex */
public abstract class NativeAd$NativeAdListener$AdLoadingError extends Exception {

    /* compiled from: NativeAd.kt */
    public static final class EmptyAd extends NativeAd$NativeAdListener$AdLoadingError {
        private final String errorMessage;

        public final String d() {
            return this.errorMessage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EmptyAd) && epx.f(this.errorMessage, ((EmptyAd) obj).errorMessage);
        }

        public final int hashCode() {
            return this.errorMessage.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return ho8.a(new StringBuilder("EmptyAd(errorMessage="), this.errorMessage, ')');
        }
    }

    /* compiled from: NativeAd.kt */
    public static final class LoadingFailed extends NativeAd$NativeAdListener$AdLoadingError {
        private final int errorCode;
        private final String errorMessage;
        private final int mediatedNetworkErrorCode;
        private final String mediatedNetworkErrorMessage;
        private final long requestLatencyMillis;
        private final Long waterfallLatencyMillis;
        private final String waterfallName;
        private final String waterfallTestName;

        public final int d() {
            return this.errorCode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadingFailed)) {
                return false;
            }
            LoadingFailed loadingFailed = (LoadingFailed) obj;
            return this.errorCode == loadingFailed.errorCode && epx.f(this.errorMessage, loadingFailed.errorMessage) && this.mediatedNetworkErrorCode == loadingFailed.mediatedNetworkErrorCode && epx.f(this.mediatedNetworkErrorMessage, loadingFailed.mediatedNetworkErrorMessage) && this.requestLatencyMillis == loadingFailed.requestLatencyMillis && epx.f(this.waterfallLatencyMillis, loadingFailed.waterfallLatencyMillis) && epx.f(this.waterfallName, loadingFailed.waterfallName) && epx.f(this.waterfallTestName, loadingFailed.waterfallTestName);
        }

        public final String g() {
            return this.errorMessage;
        }

        public final int h() {
            return this.mediatedNetworkErrorCode;
        }

        public final int hashCode() {
            int a = bh10.a(urd0.a(shy.a(this.mediatedNetworkErrorCode, urd0.a(Integer.hashCode(this.errorCode) * 31, 31, this.errorMessage), 31), 31, this.mediatedNetworkErrorMessage), 31, this.requestLatencyMillis);
            Long l = this.waterfallLatencyMillis;
            int hashCode = (a + (l == null ? 0 : l.hashCode())) * 31;
            String str = this.waterfallName;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.waterfallTestName;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String i() {
            return this.mediatedNetworkErrorMessage;
        }

        public final long j() {
            return this.requestLatencyMillis;
        }

        public final Long k() {
            return this.waterfallLatencyMillis;
        }

        public final String l() {
            return this.waterfallName;
        }

        public final String m() {
            return this.waterfallTestName;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            StringBuilder sb = new StringBuilder("LoadingFailed(errorCode=");
            sb.append(this.errorCode);
            sb.append(", errorMessage=");
            sb.append(this.errorMessage);
            sb.append(", mediatedNetworkErrorCode=");
            sb.append(this.mediatedNetworkErrorCode);
            sb.append(", mediatedNetworkErrorMessage=");
            sb.append(this.mediatedNetworkErrorMessage);
            sb.append(", requestLatencyMillis=");
            sb.append(this.requestLatencyMillis);
            sb.append(", waterfallLatencyMillis=");
            sb.append(this.waterfallLatencyMillis);
            sb.append(", waterfallName=");
            sb.append(this.waterfallName);
            sb.append(", waterfallTestName=");
            return ho8.a(sb, this.waterfallTestName, ')');
        }
    }

    private NativeAd$NativeAdListener$AdLoadingError() {
    }
}
