package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Map;
import xsna.vnv;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public interface zzcc extends IInterface {
    void beginAdUnitExposure(String str, long j) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void clearMeasurementEnabled(long j) throws RemoteException;

    void endAdUnitExposure(String str, long j) throws RemoteException;

    void generateEventId(zzcf zzcfVar) throws RemoteException;

    void getAppInstanceId(zzcf zzcfVar) throws RemoteException;

    void getCachedAppInstanceId(zzcf zzcfVar) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, zzcf zzcfVar) throws RemoteException;

    void getCurrentScreenClass(zzcf zzcfVar) throws RemoteException;

    void getCurrentScreenName(zzcf zzcfVar) throws RemoteException;

    void getGmpAppId(zzcf zzcfVar) throws RemoteException;

    void getMaxUserProperties(String str, zzcf zzcfVar) throws RemoteException;

    void getSessionId(zzcf zzcfVar) throws RemoteException;

    void getTestFlag(zzcf zzcfVar, int i) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z, zzcf zzcfVar) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(vnv vnvVar, zzcl zzclVar, long j) throws RemoteException;

    void isDataCollectionEnabled(zzcf zzcfVar) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, zzcf zzcfVar, long j) throws RemoteException;

    void logHealthData(int i, String str, vnv vnvVar, vnv vnvVar2, vnv vnvVar3) throws RemoteException;

    void onActivityCreated(vnv vnvVar, Bundle bundle, long j) throws RemoteException;

    void onActivityDestroyed(vnv vnvVar, long j) throws RemoteException;

    void onActivityPaused(vnv vnvVar, long j) throws RemoteException;

    void onActivityResumed(vnv vnvVar, long j) throws RemoteException;

    void onActivitySaveInstanceState(vnv vnvVar, zzcf zzcfVar, long j) throws RemoteException;

    void onActivityStarted(vnv vnvVar, long j) throws RemoteException;

    void onActivityStopped(vnv vnvVar, long j) throws RemoteException;

    void performAction(Bundle bundle, zzcf zzcfVar, long j) throws RemoteException;

    void registerOnMeasurementEventListener(zzci zzciVar) throws RemoteException;

    void resetAnalyticsData(long j) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException;

    void setConsent(Bundle bundle, long j) throws RemoteException;

    void setConsentThirdParty(Bundle bundle, long j) throws RemoteException;

    void setCurrentScreen(vnv vnvVar, String str, String str2, long j) throws RemoteException;

    void setDataCollectionEnabled(boolean z) throws RemoteException;

    void setDefaultEventParameters(Bundle bundle) throws RemoteException;

    void setEventInterceptor(zzci zzciVar) throws RemoteException;

    void setInstanceIdProvider(zzck zzckVar) throws RemoteException;

    void setMeasurementEnabled(boolean z, long j) throws RemoteException;

    void setMinimumSessionDuration(long j) throws RemoteException;

    void setSessionTimeoutDuration(long j) throws RemoteException;

    void setUserId(String str, long j) throws RemoteException;

    void setUserProperty(String str, String str2, vnv vnvVar, boolean z, long j) throws RemoteException;

    void unregisterOnMeasurementEventListener(zzci zzciVar) throws RemoteException;
}
