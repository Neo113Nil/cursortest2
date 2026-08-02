package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.1 */
/* loaded from: classes7.dex */
public final class zzde extends zzbu implements zzdc {
    zzde(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void beginAdUnitExposure(String str, long j) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeLong(j);
        zzb(23, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, bundle);
        zzb(9, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void clearMeasurementEnabled(long j) throws RemoteException {
        Parcel a_ = a_();
        a_.writeLong(j);
        zzb(43, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void endAdUnitExposure(String str, long j) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeLong(j);
        zzb(24, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void generateEventId(zzdd zzddVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzddVar);
        zzb(22, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void getAppInstanceId(zzdd zzddVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzddVar);
        zzb(20, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void getCachedAppInstanceId(zzdd zzddVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzddVar);
        zzb(19, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void getConditionalUserProperties(String str, String str2, zzdd zzddVar) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, zzddVar);
        zzb(10, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void getCurrentScreenClass(zzdd zzddVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzddVar);
        zzb(17, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void getCurrentScreenName(zzdd zzddVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzddVar);
        zzb(16, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void getGmpAppId(zzdd zzddVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzddVar);
        zzb(21, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void getMaxUserProperties(String str, zzdd zzddVar) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        zzbw.zza(a_, zzddVar);
        zzb(6, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void getSessionId(zzdd zzddVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzddVar);
        zzb(46, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void getTestFlag(zzdd zzddVar, int i) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzddVar);
        a_.writeInt(i);
        zzb(38, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void getUserProperties(String str, String str2, boolean z, zzdd zzddVar) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, z);
        zzbw.zza(a_, zzddVar);
        zzb(5, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void initForTests(Map map) throws RemoteException {
        Parcel a_ = a_();
        a_.writeMap(map);
        zzb(37, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void initialize(IObjectWrapper iObjectWrapper, zzdl zzdlVar, long j) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, iObjectWrapper);
        zzbw.zza(a_, zzdlVar);
        a_.writeLong(j);
        zzb(1, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void isDataCollectionEnabled(zzdd zzddVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzddVar);
        zzb(40, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, bundle);
        zzbw.zza(a_, z);
        zzbw.zza(a_, z2);
        a_.writeLong(j);
        zzb(2, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void logEventAndBundle(String str, String str2, Bundle bundle, zzdd zzddVar, long j) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, bundle);
        zzbw.zza(a_, zzddVar);
        a_.writeLong(j);
        zzb(3, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel a_ = a_();
        a_.writeInt(i);
        a_.writeString(str);
        zzbw.zza(a_, iObjectWrapper);
        zzbw.zza(a_, iObjectWrapper2);
        zzbw.zza(a_, iObjectWrapper3);
        zzb(33, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, iObjectWrapper);
        zzbw.zza(a_, bundle);
        a_.writeLong(j);
        zzb(27, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, iObjectWrapper);
        a_.writeLong(j);
        zzb(28, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void onActivityPaused(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, iObjectWrapper);
        a_.writeLong(j);
        zzb(29, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void onActivityResumed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, iObjectWrapper);
        a_.writeLong(j);
        zzb(30, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzdd zzddVar, long j) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, iObjectWrapper);
        zzbw.zza(a_, zzddVar);
        a_.writeLong(j);
        zzb(31, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void onActivityStarted(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, iObjectWrapper);
        a_.writeLong(j);
        zzb(25, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void onActivityStopped(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, iObjectWrapper);
        a_.writeLong(j);
        zzb(26, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void performAction(Bundle bundle, zzdd zzddVar, long j) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, bundle);
        zzbw.zza(a_, zzddVar);
        a_.writeLong(j);
        zzb(32, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void registerOnMeasurementEventListener(zzdi zzdiVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzdiVar);
        zzb(35, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void resetAnalyticsData(long j) throws RemoteException {
        Parcel a_ = a_();
        a_.writeLong(j);
        zzb(12, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, bundle);
        a_.writeLong(j);
        zzb(8, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void setConsent(Bundle bundle, long j) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, bundle);
        a_.writeLong(j);
        zzb(44, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, bundle);
        a_.writeLong(j);
        zzb(45, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, iObjectWrapper);
        a_.writeString(str);
        a_.writeString(str2);
        a_.writeLong(j);
        zzb(15, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, z);
        zzb(39, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void setDefaultEventParameters(Bundle bundle) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, bundle);
        zzb(42, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void setEventInterceptor(zzdi zzdiVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzdiVar);
        zzb(34, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void setInstanceIdProvider(zzdj zzdjVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzdjVar);
        zzb(18, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, z);
        a_.writeLong(j);
        zzb(11, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void setMinimumSessionDuration(long j) throws RemoteException {
        Parcel a_ = a_();
        a_.writeLong(j);
        zzb(13, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void setSessionTimeoutDuration(long j) throws RemoteException {
        Parcel a_ = a_();
        a_.writeLong(j);
        zzb(14, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void setSgtmDebugInfo(Intent intent) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, intent);
        zzb(48, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void setUserId(String str, long j) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeLong(j);
        zzb(7, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) throws RemoteException {
        Parcel a_ = a_();
        a_.writeString(str);
        a_.writeString(str2);
        zzbw.zza(a_, iObjectWrapper);
        zzbw.zza(a_, z);
        a_.writeLong(j);
        zzb(4, a_);
    }

    @Override // com.google.android.gms.internal.measurement.zzdc
    public final void unregisterOnMeasurementEventListener(zzdi zzdiVar) throws RemoteException {
        Parcel a_ = a_();
        zzbw.zza(a_, zzdiVar);
        zzb(36, a_);
    }
}
