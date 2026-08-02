package com.vk.push.core.remote.config.omicron;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public interface AnalyticsHandler {
    void onCacheHit(DataId dataId, boolean z);

    void onCacheMiss(DataId dataId);

    void onCacheUpdated(DataId dataId);

    void onConfigReceivedFromNetwork(@NonNull String str);

    void onConfigRequestEnded(int i);

    void onConfigRequestFailedWithException(Throwable th);

    void onConfigRequestStarted(@NonNull String str);

    void onGetDataError(Throwable th, String str);

    void onHandledException(Throwable th);

    void onResponseError(DataId dataId, int i);

    void onResponseException(DataId dataId, Throwable th);

    void onResponseNotModified(DataId dataId);

    void onResponseParseException(DataId dataId, ParseException parseException);

    void onResponseSuccess(DataId dataId);

    void onWaitForActualOnTime(DataId dataId);

    void onWaitForActualTimeout(DataId dataId);
}
