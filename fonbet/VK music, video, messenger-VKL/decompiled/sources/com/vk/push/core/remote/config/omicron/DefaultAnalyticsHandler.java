package com.vk.push.core.remote.config.omicron;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class DefaultAnalyticsHandler implements AnalyticsHandler {
    @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
    public void onCacheMiss(DataId dataId) {
    }

    @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
    public void onCacheUpdated(DataId dataId) {
    }

    @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
    public void onConfigReceivedFromNetwork(@NonNull String str) {
    }

    @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
    public void onConfigRequestEnded(int i) {
    }

    @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
    public void onConfigRequestFailedWithException(Throwable th) {
    }

    @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
    public void onConfigRequestStarted(@NonNull String str) {
    }

    @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
    public void onHandledException(Throwable th) {
    }

    @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
    public void onResponseNotModified(DataId dataId) {
    }

    @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
    public void onResponseSuccess(DataId dataId) {
    }

    @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
    public void onWaitForActualOnTime(DataId dataId) {
    }

    @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
    public void onWaitForActualTimeout(DataId dataId) {
    }

    @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
    public void onCacheHit(DataId dataId, boolean z) {
    }

    @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
    public void onGetDataError(Throwable th, String str) {
    }

    @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
    public void onResponseError(DataId dataId, int i) {
    }

    @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
    public void onResponseException(DataId dataId, Throwable th) {
    }

    @Override // com.vk.push.core.remote.config.omicron.AnalyticsHandler
    public void onResponseParseException(DataId dataId, ParseException parseException) {
    }
}
