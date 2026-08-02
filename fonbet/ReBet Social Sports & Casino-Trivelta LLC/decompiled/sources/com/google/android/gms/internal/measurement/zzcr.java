package com.google.android.gms.internal.measurement;

import N9.b;
import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* loaded from: classes2.dex */
public interface zzcr extends IInterface {
    void beginAdUnitExposure(String str, long j10);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j10);

    void endAdUnitExposure(String str, long j10);

    void generateEventId(zzcu zzcuVar);

    void getAppInstanceId(zzcu zzcuVar);

    void getCachedAppInstanceId(zzcu zzcuVar);

    void getConditionalUserProperties(String str, String str2, zzcu zzcuVar);

    void getCurrentScreenClass(zzcu zzcuVar);

    void getCurrentScreenName(zzcu zzcuVar);

    void getGmpAppId(zzcu zzcuVar);

    void getMaxUserProperties(String str, zzcu zzcuVar);

    void getSessionId(zzcu zzcuVar);

    void getTestFlag(zzcu zzcuVar, int i10);

    void getUserProperties(String str, String str2, boolean z10, zzcu zzcuVar);

    void initForTests(Map map);

    void initialize(b bVar, zzdd zzddVar, long j10);

    void isDataCollectionEnabled(zzcu zzcuVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10);

    void logEventAndBundle(String str, String str2, Bundle bundle, zzcu zzcuVar, long j10);

    void logHealthData(int i10, String str, b bVar, b bVar2, b bVar3);

    void onActivityCreated(b bVar, Bundle bundle, long j10);

    void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j10);

    void onActivityDestroyed(b bVar, long j10);

    void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j10);

    void onActivityPaused(b bVar, long j10);

    void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j10);

    void onActivityResumed(b bVar, long j10);

    void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j10);

    void onActivitySaveInstanceState(b bVar, zzcu zzcuVar, long j10);

    void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, zzcu zzcuVar, long j10);

    void onActivityStarted(b bVar, long j10);

    void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j10);

    void onActivityStopped(b bVar, long j10);

    void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j10);

    void performAction(Bundle bundle, zzcu zzcuVar, long j10);

    void registerOnMeasurementEventListener(zzda zzdaVar);

    void resetAnalyticsData(long j10);

    void retrieveAndUploadBatches(zzcx zzcxVar);

    void setConditionalUserProperty(Bundle bundle, long j10);

    void setConsent(Bundle bundle, long j10);

    void setConsentThirdParty(Bundle bundle, long j10);

    void setCurrentScreen(b bVar, String str, String str2, long j10);

    void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j10);

    void setDataCollectionEnabled(boolean z10);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(zzda zzdaVar);

    void setInstanceIdProvider(zzdc zzdcVar);

    void setMeasurementEnabled(boolean z10, long j10);

    void setMinimumSessionDuration(long j10);

    void setSessionTimeoutDuration(long j10);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j10);

    void setUserProperty(String str, String str2, b bVar, boolean z10, long j10);

    void unregisterOnMeasurementEventListener(zzda zzdaVar);
}
