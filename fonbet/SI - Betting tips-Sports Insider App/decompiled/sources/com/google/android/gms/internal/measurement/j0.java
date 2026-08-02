package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j0 extends x implements l0 {
    @Override // com.google.android.gms.internal.measurement.l0
    public final void beginAdUnitExposure(String str, long j) {
        Parcel O = O();
        O.writeString(str);
        O.writeLong(j);
        P(O, 23);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel O = O();
        O.writeString(str);
        O.writeString(str2);
        z.b(O, bundle);
        P(O, 9);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void endAdUnitExposure(String str, long j) {
        Parcel O = O();
        O.writeString(str);
        O.writeLong(j);
        P(O, 24);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void generateEventId(n0 n0Var) {
        Parcel O = O();
        z.c(O, n0Var);
        P(O, 22);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getCachedAppInstanceId(n0 n0Var) {
        Parcel O = O();
        z.c(O, n0Var);
        P(O, 19);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getConditionalUserProperties(String str, String str2, n0 n0Var) {
        Parcel O = O();
        O.writeString(str);
        O.writeString(str2);
        z.c(O, n0Var);
        P(O, 10);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getCurrentScreenClass(n0 n0Var) {
        Parcel O = O();
        z.c(O, n0Var);
        P(O, 17);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getCurrentScreenName(n0 n0Var) {
        Parcel O = O();
        z.c(O, n0Var);
        P(O, 16);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getGmpAppId(n0 n0Var) {
        Parcel O = O();
        z.c(O, n0Var);
        P(O, 21);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getMaxUserProperties(String str, n0 n0Var) {
        Parcel O = O();
        O.writeString(str);
        z.c(O, n0Var);
        P(O, 6);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getUserProperties(String str, String str2, boolean z5, n0 n0Var) {
        Parcel O = O();
        O.writeString(str);
        O.writeString(str2);
        ClassLoader classLoader = z.f5372a;
        O.writeInt(z5 ? 1 : 0);
        z.c(O, n0Var);
        P(O, 5);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void initialize(t6.a aVar, zzdd zzddVar, long j) {
        Parcel O = O();
        z.c(O, aVar);
        z.b(O, zzddVar);
        O.writeLong(j);
        P(O, 1);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z5, boolean z7, long j) {
        Parcel O = O();
        O.writeString(str);
        O.writeString(str2);
        z.b(O, bundle);
        O.writeInt(1);
        O.writeInt(1);
        O.writeLong(j);
        P(O, 2);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void logHealthData(int i5, String str, t6.a aVar, t6.a aVar2, t6.a aVar3) {
        Parcel O = O();
        O.writeInt(5);
        O.writeString("Error with data collection. Data lost.");
        z.c(O, aVar);
        z.c(O, aVar2);
        z.c(O, aVar3);
        P(O, 33);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j) {
        Parcel O = O();
        z.b(O, zzdfVar);
        z.b(O, bundle);
        O.writeLong(j);
        P(O, 53);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j) {
        Parcel O = O();
        z.b(O, zzdfVar);
        O.writeLong(j);
        P(O, 54);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j) {
        Parcel O = O();
        z.b(O, zzdfVar);
        O.writeLong(j);
        P(O, 55);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j) {
        Parcel O = O();
        z.b(O, zzdfVar);
        O.writeLong(j);
        P(O, 56);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, n0 n0Var, long j) {
        Parcel O = O();
        z.b(O, zzdfVar);
        z.c(O, n0Var);
        O.writeLong(j);
        P(O, 57);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j) {
        Parcel O = O();
        z.b(O, zzdfVar);
        O.writeLong(j);
        P(O, 51);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j) {
        Parcel O = O();
        z.b(O, zzdfVar);
        O.writeLong(j);
        P(O, 52);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void retrieveAndUploadBatches(p0 p0Var) {
        Parcel O = O();
        z.c(O, p0Var);
        P(O, 58);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel O = O();
        z.b(O, bundle);
        O.writeLong(j);
        P(O, 8);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j) {
        Parcel O = O();
        z.b(O, zzdfVar);
        O.writeString(str);
        O.writeString(str2);
        O.writeLong(j);
        P(O, 50);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void setDataCollectionEnabled(boolean z5) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void setUserProperty(String str, String str2, t6.a aVar, boolean z5, long j) {
        Parcel O = O();
        O.writeString("fcm");
        O.writeString("_ln");
        z.c(O, aVar);
        O.writeInt(1);
        O.writeLong(j);
        P(O, 4);
    }
}
