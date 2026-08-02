package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcn extends zzbl implements zzcp {
    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void beginAdUnitExposure(String str, long j) {
        Parcel S1 = S1();
        S1.writeString(str);
        S1.writeLong(j);
        Z1(S1, 23);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel S1 = S1();
        S1.writeString(str);
        S1.writeString(str2);
        zzbn.b(S1, bundle);
        Z1(S1, 9);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void endAdUnitExposure(String str, long j) {
        Parcel S1 = S1();
        S1.writeString(str);
        S1.writeLong(j);
        Z1(S1, 24);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void generateEventId(zzcs zzcsVar) {
        Parcel S1 = S1();
        zzbn.c(S1, zzcsVar);
        Z1(S1, 22);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getAppInstanceId(zzcs zzcsVar) {
        Parcel S1 = S1();
        zzbn.c(S1, zzcsVar);
        Z1(S1, 20);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getCachedAppInstanceId(zzcs zzcsVar) {
        Parcel S1 = S1();
        zzbn.c(S1, zzcsVar);
        Z1(S1, 19);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getConditionalUserProperties(String str, String str2, zzcs zzcsVar) {
        Parcel S1 = S1();
        S1.writeString(str);
        S1.writeString(str2);
        zzbn.c(S1, zzcsVar);
        Z1(S1, 10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getCurrentScreenClass(zzcs zzcsVar) {
        Parcel S1 = S1();
        zzbn.c(S1, zzcsVar);
        Z1(S1, 17);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getCurrentScreenName(zzcs zzcsVar) {
        Parcel S1 = S1();
        zzbn.c(S1, zzcsVar);
        Z1(S1, 16);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getGmpAppId(zzcs zzcsVar) {
        Parcel S1 = S1();
        zzbn.c(S1, zzcsVar);
        Z1(S1, 21);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getMaxUserProperties(String str, zzcs zzcsVar) {
        Parcel S1 = S1();
        S1.writeString(str);
        zzbn.c(S1, zzcsVar);
        Z1(S1, 6);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void getUserProperties(String str, String str2, boolean z, zzcs zzcsVar) {
        Parcel S1 = S1();
        S1.writeString(str);
        S1.writeString(str2);
        ClassLoader classLoader = zzbn.a;
        S1.writeInt(z ? 1 : 0);
        zzbn.c(S1, zzcsVar);
        Z1(S1, 5);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void initialize(IObjectWrapper iObjectWrapper, zzdb zzdbVar, long j) {
        Parcel S1 = S1();
        zzbn.c(S1, iObjectWrapper);
        zzbn.b(S1, zzdbVar);
        S1.writeLong(j);
        Z1(S1, 1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void initializeWithElapsedTime(IObjectWrapper iObjectWrapper, zzdb zzdbVar, long j, long j2) {
        Parcel S1 = S1();
        zzbn.c(S1, iObjectWrapper);
        zzbn.b(S1, zzdbVar);
        S1.writeLong(j);
        S1.writeLong(j2);
        Z1(S1, 60);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        Parcel S1 = S1();
        S1.writeString(str);
        S1.writeString(str2);
        zzbn.b(S1, bundle);
        S1.writeInt(z ? 1 : 0);
        S1.writeInt(1);
        S1.writeLong(j);
        S1.writeLong(j2);
        Z1(S1, 59);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel S1 = S1();
        S1.writeInt(5);
        S1.writeString(str);
        zzbn.c(S1, iObjectWrapper);
        zzbn.c(S1, iObjectWrapper2);
        zzbn.c(S1, iObjectWrapper3);
        Z1(S1, 33);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivityCreatedByScionActivityInfo(zzdd zzddVar, Bundle bundle, long j) {
        Parcel S1 = S1();
        zzbn.b(S1, zzddVar);
        zzbn.b(S1, bundle);
        S1.writeLong(j);
        Z1(S1, 53);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivityDestroyedByScionActivityInfo(zzdd zzddVar, long j) {
        Parcel S1 = S1();
        zzbn.b(S1, zzddVar);
        S1.writeLong(j);
        Z1(S1, 54);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivityPausedByScionActivityInfo(zzdd zzddVar, long j) {
        Parcel S1 = S1();
        zzbn.b(S1, zzddVar);
        S1.writeLong(j);
        Z1(S1, 55);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivityResumedByScionActivityInfo(zzdd zzddVar, long j) {
        Parcel S1 = S1();
        zzbn.b(S1, zzddVar);
        S1.writeLong(j);
        Z1(S1, 56);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivitySaveInstanceStateByScionActivityInfo(zzdd zzddVar, zzcs zzcsVar, long j) {
        Parcel S1 = S1();
        zzbn.b(S1, zzddVar);
        zzbn.c(S1, zzcsVar);
        S1.writeLong(j);
        Z1(S1, 57);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivityStartedByScionActivityInfo(zzdd zzddVar, long j) {
        Parcel S1 = S1();
        zzbn.b(S1, zzddVar);
        S1.writeLong(j);
        Z1(S1, 51);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void onActivityStoppedByScionActivityInfo(zzdd zzddVar, long j) {
        Parcel S1 = S1();
        zzbn.b(S1, zzddVar);
        S1.writeLong(j);
        Z1(S1, 52);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void registerOnMeasurementEventListener(zzcy zzcyVar) {
        Parcel S1 = S1();
        zzbn.c(S1, zzcyVar);
        Z1(S1, 35);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void retrieveAndUploadBatches(zzcv zzcvVar) {
        Parcel S1 = S1();
        zzbn.c(S1, zzcvVar);
        Z1(S1, 58);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel S1 = S1();
        zzbn.b(S1, bundle);
        S1.writeLong(j);
        Z1(S1, 8);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setConsentThirdParty(Bundle bundle, long j) {
        Parcel S1 = S1();
        zzbn.b(S1, bundle);
        S1.writeLong(j);
        Z1(S1, 45);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setCurrentScreenByScionActivityInfo(zzdd zzddVar, String str, String str2, long j) {
        Parcel S1 = S1();
        zzbn.b(S1, zzddVar);
        S1.writeString(str);
        S1.writeString(str2);
        S1.writeLong(j);
        Z1(S1, 50);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setDataCollectionEnabled(boolean z) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel S1 = S1();
        ClassLoader classLoader = zzbn.a;
        S1.writeInt(z ? 1 : 0);
        S1.writeLong(j);
        Z1(S1, 11);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setSgtmDebugInfo(Intent intent) {
        Parcel S1 = S1();
        zzbn.b(S1, intent);
        Z1(S1, 48);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setUserId(String str, long j) {
        Parcel S1 = S1();
        S1.writeString(str);
        S1.writeLong(j);
        Z1(S1, 7);
    }

    @Override // com.google.android.gms.internal.measurement.zzcp
    public final void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) {
        Parcel S1 = S1();
        S1.writeString(str);
        S1.writeString(str2);
        zzbn.c(S1, iObjectWrapper);
        S1.writeInt(z ? 1 : 0);
        S1.writeLong(j);
        Z1(S1, 4);
    }
}
