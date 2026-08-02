package com.mbridge.msdk.foundation.download.core;

import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.OnProgressStateListener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface RequestBuilder<T> {
    DownloadRequest<T> build();

    RequestBuilder<T> with(String str, String str2);

    RequestBuilder<T> withConnectTimeout(long j);

    RequestBuilder<T> withDirectoryPathExternal(String str);

    RequestBuilder<T> withDirectoryPathInternal(String str);

    RequestBuilder<T> withDownloadPriority(DownloadPriority downloadPriority);

    RequestBuilder<T> withDownloadStateListener(OnDownloadStateListener onDownloadStateListener);

    RequestBuilder<T> withHeader(String str, String str2);

    RequestBuilder<T> withHttpRetryCounter(int i);

    RequestBuilder<T> withProgressStateListener(OnProgressStateListener onProgressStateListener);

    RequestBuilder<T> withReadTimeout(long j);

    RequestBuilder<T> withTimeout(long j);

    RequestBuilder<T> withUserAgent(String str);

    RequestBuilder<T> withWriteTimeout(long j);
}
