package com.mbridge.msdk.foundation.download.core;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.OnProgressStateListener;
import com.mbridge.msdk.foundation.download.utils.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class DownloadRequestBuilder<T> implements RequestBuilder<T> {
    long connectTimeout;
    String directoryPathExternal;
    String directoryPathInternal;
    DownloadMessage<T> downloadMessage;
    DownloadPriority downloadPriority = DownloadPriority.MEDIUM;
    OnDownloadStateListener downloadStateListener;
    Map<String, String> extraMap;
    HashMap<String, List<String>> headerMap;
    OnProgressStateListener progressStateListener;
    long readTimeout;
    int retry;
    long timeout;
    String userAgent;
    long writeTimeout;

    public DownloadRequestBuilder(DownloadMessage<T> downloadMessage) {
        this.downloadMessage = downloadMessage;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public DownloadRequest<T> build() {
        return DownloadRequest.create(this);
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public RequestBuilder<T> with(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (Objects.isNull(this.extraMap)) {
                this.extraMap = new HashMap();
            }
            this.extraMap.put(str, str2);
        }
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public RequestBuilder<T> withDirectoryPathExternal(String str) {
        this.directoryPathExternal = str;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public RequestBuilder<T> withDirectoryPathInternal(String str) {
        this.directoryPathInternal = str;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public RequestBuilder<T> withDownloadPriority(DownloadPriority downloadPriority) {
        this.downloadPriority = downloadPriority;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public RequestBuilder<T> withDownloadStateListener(OnDownloadStateListener onDownloadStateListener) {
        this.downloadStateListener = onDownloadStateListener;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public DownloadRequestBuilder<T> withHeader(String str, String str2) {
        HashMap<String, List<String>> hashMap = this.headerMap;
        if (hashMap == null) {
            hashMap = new HashMap<>(4);
            this.headerMap = hashMap;
        }
        List<String> list = hashMap.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.headerMap.put(str, list);
        }
        if (!list.contains(str2)) {
            list.add(str2);
        }
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public RequestBuilder<T> withProgressStateListener(OnProgressStateListener onProgressStateListener) {
        this.progressStateListener = onProgressStateListener;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public RequestBuilder<T> withTimeout(long j) {
        this.timeout = j;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public RequestBuilder<T> withWriteTimeout(long j) {
        this.writeTimeout = j;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public DownloadRequestBuilder<T> withConnectTimeout(long j) {
        this.connectTimeout = j;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public DownloadRequestBuilder<T> withHttpRetryCounter(int i) {
        this.retry = i;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public DownloadRequestBuilder<T> withReadTimeout(long j) {
        this.readTimeout = j;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public DownloadRequestBuilder<T> withUserAgent(String str) {
        this.userAgent = str;
        return this;
    }
}
