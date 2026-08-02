package com.vk.ads.yandex.api.nativead;

import xsna.epx;
import xsna.ho8;

/* compiled from: YandexNativeAd.kt */
/* loaded from: classes14.dex */
public abstract class YandexNativeAdError extends Exception {

    /* compiled from: YandexNativeAd.kt */
    public static final class ContinuousError extends YandexNativeAdError {
        private final String errorMessage;

        public ContinuousError() {
            super(0);
            this.errorMessage = "Yandex wasn't been able to find ads for a couple of times";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContinuousError) && epx.f(this.errorMessage, ((ContinuousError) obj).errorMessage);
        }

        public final int hashCode() {
            return this.errorMessage.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return ho8.a(new StringBuilder("ContinuousError(errorMessage="), this.errorMessage, ')');
        }
    }

    /* compiled from: YandexNativeAd.kt */
    public static final class LoadingFailed extends YandexNativeAdError {
        private final int errorCode;
        private final String errorMessage;

        public LoadingFailed(int i, String str) {
            super(0);
            this.errorCode = i;
            this.errorMessage = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadingFailed)) {
                return false;
            }
            LoadingFailed loadingFailed = (LoadingFailed) obj;
            return this.errorCode == loadingFailed.errorCode && epx.f(this.errorMessage, loadingFailed.errorMessage);
        }

        public final int hashCode() {
            return this.errorMessage.hashCode() + (Integer.hashCode(this.errorCode) * 31);
        }

        @Override // java.lang.Throwable
        public final String toString() {
            StringBuilder sb = new StringBuilder("LoadingFailed(errorCode=");
            sb.append(this.errorCode);
            sb.append(", errorMessage=");
            return ho8.a(sb, this.errorMessage, ')');
        }
    }

    public /* synthetic */ YandexNativeAdError(int i) {
        this();
    }

    private YandexNativeAdError() {
    }
}
