package org.chromium.net.impl;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collection;
import java.util.Collections;
import org.chromium.net.CronetException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes10.dex */
public class RequestFinishedInfoImpl extends RequestFinishedInfo {
    private final Collection<Object> mAnnotations;
    private final CronetException mException;
    private final int mFinishedReason;
    private final RequestFinishedInfo.Metrics mMetrics;
    private final UrlResponseInfo mResponseInfo;
    private final String mUrl;

    @Retention(RetentionPolicy.SOURCE)
    public @interface FinishedReason {
    }

    public RequestFinishedInfoImpl(String url, Collection<Object> annotations, RequestFinishedInfo.Metrics metrics, int finishedReason, UrlResponseInfo responseInfo, CronetException exception) {
        this.mUrl = url;
        this.mAnnotations = annotations;
        this.mMetrics = metrics;
        this.mFinishedReason = finishedReason;
        this.mResponseInfo = responseInfo;
        this.mException = exception;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public String getUrl() {
        return this.mUrl;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public Collection<Object> getAnnotations() {
        Collection<Object> collection = this.mAnnotations;
        return collection == null ? Collections.EMPTY_LIST : collection;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public RequestFinishedInfo.Metrics getMetrics() {
        return this.mMetrics;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public int getFinishedReason() {
        return this.mFinishedReason;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public UrlResponseInfo getResponseInfo() {
        return this.mResponseInfo;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public CronetException getException() {
        return this.mException;
    }
}
