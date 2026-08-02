package org.chromium.net.impl;

import android.net.http.HttpException;
import android.net.http.UrlRequest$Callback;
import android.net.http.UrlResponseInfo;
import java.nio.ByteBuffer;
import java.util.Objects;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.impl.CronetExceptionTranslationUtils;

/* loaded from: classes10.dex */
class AndroidUrlRequestCallbackWrapper implements UrlRequest$Callback {
    private final UrlRequest.Callback mBackend;
    private AndroidUrlRequestWrapper mWrappedRequest;

    public AndroidUrlRequestCallbackWrapper(UrlRequest.Callback backend) {
        this.mBackend = (UrlRequest.Callback) Objects.requireNonNull(backend, "Callback is required.");
    }

    public void onRedirectReceived(android.net.http.UrlRequest request, final UrlResponseInfo info, final String newLocationUrl) throws Exception {
        CronetExceptionTranslationUtils.executeTranslatingCronetExceptions(new CronetExceptionTranslationUtils.CronetWork() { // from class: org.chromium.net.impl.AndroidUrlRequestCallbackWrapper$$ExternalSyntheticLambda2
            @Override // org.chromium.net.impl.CronetExceptionTranslationUtils.CronetWork
            public final Object run() {
                Object lambda$onRedirectReceived$0;
                lambda$onRedirectReceived$0 = AndroidUrlRequestCallbackWrapper.this.lambda$onRedirectReceived$0(info, newLocationUrl);
                return lambda$onRedirectReceived$0;
            }
        }, Exception.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onRedirectReceived$0(UrlResponseInfo urlResponseInfo, String str) throws Exception {
        this.mBackend.onRedirectReceived(this.mWrappedRequest, AndroidUrlResponseInfoWrapper.createForUrlRequest(urlResponseInfo), str);
        return null;
    }

    public void onResponseStarted(android.net.http.UrlRequest request, final UrlResponseInfo info) throws Exception {
        CronetExceptionTranslationUtils.executeTranslatingCronetExceptions(new CronetExceptionTranslationUtils.CronetWork() { // from class: org.chromium.net.impl.AndroidUrlRequestCallbackWrapper$$ExternalSyntheticLambda0
            @Override // org.chromium.net.impl.CronetExceptionTranslationUtils.CronetWork
            public final Object run() {
                Object lambda$onResponseStarted$1;
                lambda$onResponseStarted$1 = AndroidUrlRequestCallbackWrapper.this.lambda$onResponseStarted$1(info);
                return lambda$onResponseStarted$1;
            }
        }, Exception.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onResponseStarted$1(UrlResponseInfo urlResponseInfo) throws Exception {
        this.mBackend.onResponseStarted(this.mWrappedRequest, AndroidUrlResponseInfoWrapper.createForUrlRequest(urlResponseInfo));
        return null;
    }

    public void onReadCompleted(android.net.http.UrlRequest request, final UrlResponseInfo info, final ByteBuffer byteBuffer) throws Exception {
        CronetExceptionTranslationUtils.executeTranslatingCronetExceptions(new CronetExceptionTranslationUtils.CronetWork() { // from class: org.chromium.net.impl.AndroidUrlRequestCallbackWrapper$$ExternalSyntheticLambda1
            @Override // org.chromium.net.impl.CronetExceptionTranslationUtils.CronetWork
            public final Object run() {
                Object lambda$onReadCompleted$2;
                lambda$onReadCompleted$2 = AndroidUrlRequestCallbackWrapper.this.lambda$onReadCompleted$2(info, byteBuffer);
                return lambda$onReadCompleted$2;
            }
        }, Exception.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onReadCompleted$2(UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) throws Exception {
        this.mBackend.onReadCompleted(this.mWrappedRequest, AndroidUrlResponseInfoWrapper.createForUrlRequest(urlResponseInfo), byteBuffer);
        return null;
    }

    public void onSucceeded(android.net.http.UrlRequest request, UrlResponseInfo info) {
        AndroidUrlResponseInfoWrapper createForUrlRequest = AndroidUrlResponseInfoWrapper.createForUrlRequest(info);
        try {
            this.mBackend.onSucceeded(this.mWrappedRequest, createForUrlRequest);
        } finally {
            this.mWrappedRequest.maybeReportMetrics(0, createForUrlRequest, null);
        }
    }

    public void onFailed(android.net.http.UrlRequest request, UrlResponseInfo info, HttpException error) {
        AndroidUrlResponseInfoWrapper createForUrlRequest = AndroidUrlResponseInfoWrapper.createForUrlRequest(info);
        CronetException translateCheckedAndroidCronetException = CronetExceptionTranslationUtils.translateCheckedAndroidCronetException(error);
        try {
            this.mBackend.onFailed(this.mWrappedRequest, createForUrlRequest, translateCheckedAndroidCronetException);
        } finally {
            this.mWrappedRequest.maybeReportMetrics(1, createForUrlRequest, translateCheckedAndroidCronetException);
        }
    }

    public void onCanceled(android.net.http.UrlRequest request, UrlResponseInfo info) {
        AndroidUrlResponseInfoWrapper createForUrlRequest = AndroidUrlResponseInfoWrapper.createForUrlRequest(info);
        try {
            this.mBackend.onCanceled(this.mWrappedRequest, createForUrlRequest);
        } finally {
            this.mWrappedRequest.maybeReportMetrics(2, createForUrlRequest, null);
        }
    }

    void setRequest(AndroidUrlRequestWrapper request) {
        this.mWrappedRequest = request;
    }
}
