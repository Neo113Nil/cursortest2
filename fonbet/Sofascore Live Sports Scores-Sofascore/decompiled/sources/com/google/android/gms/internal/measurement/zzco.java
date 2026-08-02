package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzco extends zzbm implements zzcp {
    public zzco() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static zzcp asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof zzcp ? (zzcp) queryLocalInterface : new zzcn(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        zzcs zzcsVar = null;
        zzcv zzcvVar = null;
        zzcs zzcsVar2 = null;
        zzcs zzcsVar3 = null;
        zzcs zzcsVar4 = null;
        zzcs zzcsVar5 = null;
        zzcy zzcyVar = null;
        zzcy zzcyVar2 = null;
        zzcy zzcyVar3 = null;
        zzcs zzcsVar6 = null;
        zzcs zzcsVar7 = null;
        zzcs zzcsVar8 = null;
        zzcs zzcsVar9 = null;
        zzcs zzcsVar10 = null;
        zzcs zzcsVar11 = null;
        zzda zzdaVar = null;
        zzcs zzcsVar12 = null;
        zzcs zzcsVar13 = null;
        zzcs zzcsVar14 = null;
        zzcs zzcsVar15 = null;
        zzcs zzcsVar16 = null;
        switch (i) {
            case 1:
                IObjectWrapper S1 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzdb zzdbVar = (zzdb) zzbn.a(parcel, zzdb.CREATOR);
                long readLong = parcel.readLong();
                zzbn.d(parcel);
                initialize(S1, zzdbVar, readLong);
                break;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) zzbn.a(parcel, Bundle.CREATOR);
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                long readLong2 = parcel.readLong();
                zzbn.d(parcel);
                logEvent(readString, readString2, bundle, z2, z3, readLong2);
                break;
            case 3:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Bundle bundle2 = (Bundle) zzbn.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcsVar = queryLocalInterface instanceof zzcs ? (zzcs) queryLocalInterface : new zzcq(readStrongBinder);
                }
                zzcs zzcsVar17 = zzcsVar;
                long readLong3 = parcel.readLong();
                zzbn.d(parcel);
                logEventAndBundle(readString3, readString4, bundle2, zzcsVar17, readLong3);
                break;
            case 4:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IObjectWrapper S12 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                ClassLoader classLoader = zzbn.a;
                z = parcel.readInt() != 0;
                long readLong4 = parcel.readLong();
                zzbn.d(parcel);
                setUserProperty(readString5, readString6, S12, z, readLong4);
                break;
            case 5:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                ClassLoader classLoader2 = zzbn.a;
                z = parcel.readInt() != 0;
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcsVar16 = queryLocalInterface2 instanceof zzcs ? (zzcs) queryLocalInterface2 : new zzcq(readStrongBinder2);
                }
                zzbn.d(parcel);
                getUserProperties(readString7, readString8, z, zzcsVar16);
                break;
            case 6:
                String readString9 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcsVar15 = queryLocalInterface3 instanceof zzcs ? (zzcs) queryLocalInterface3 : new zzcq(readStrongBinder3);
                }
                zzbn.d(parcel);
                getMaxUserProperties(readString9, zzcsVar15);
                break;
            case 7:
                String readString10 = parcel.readString();
                long readLong5 = parcel.readLong();
                zzbn.d(parcel);
                setUserId(readString10, readLong5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) zzbn.a(parcel, Bundle.CREATOR);
                long readLong6 = parcel.readLong();
                zzbn.d(parcel);
                setConditionalUserProperty(bundle3, readLong6);
                break;
            case 9:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                Bundle bundle4 = (Bundle) zzbn.a(parcel, Bundle.CREATOR);
                zzbn.d(parcel);
                clearConditionalUserProperty(readString11, readString12, bundle4);
                break;
            case 10:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcsVar14 = queryLocalInterface4 instanceof zzcs ? (zzcs) queryLocalInterface4 : new zzcq(readStrongBinder4);
                }
                zzbn.d(parcel);
                getConditionalUserProperties(readString13, readString14, zzcsVar14);
                break;
            case 11:
                ClassLoader classLoader3 = zzbn.a;
                z = parcel.readInt() != 0;
                long readLong7 = parcel.readLong();
                zzbn.d(parcel);
                setMeasurementEnabled(z, readLong7);
                break;
            case 12:
                long readLong8 = parcel.readLong();
                zzbn.d(parcel);
                resetAnalyticsData(readLong8);
                break;
            case 13:
                long readLong9 = parcel.readLong();
                zzbn.d(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case 14:
                long readLong10 = parcel.readLong();
                zzbn.d(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case 15:
                IObjectWrapper S13 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                long readLong11 = parcel.readLong();
                zzbn.d(parcel);
                setCurrentScreen(S13, readString15, readString16, readLong11);
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcsVar13 = queryLocalInterface5 instanceof zzcs ? (zzcs) queryLocalInterface5 : new zzcq(readStrongBinder5);
                }
                zzbn.d(parcel);
                getCurrentScreenName(zzcsVar13);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcsVar12 = queryLocalInterface6 instanceof zzcs ? (zzcs) queryLocalInterface6 : new zzcq(readStrongBinder6);
                }
                zzbn.d(parcel);
                getCurrentScreenClass(zzcsVar12);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    zzdaVar = queryLocalInterface7 instanceof zzda ? (zzda) queryLocalInterface7 : new zzcz(readStrongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider");
                }
                zzbn.d(parcel);
                setInstanceIdProvider(zzdaVar);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcsVar11 = queryLocalInterface8 instanceof zzcs ? (zzcs) queryLocalInterface8 : new zzcq(readStrongBinder8);
                }
                zzbn.d(parcel);
                getCachedAppInstanceId(zzcsVar11);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcsVar10 = queryLocalInterface9 instanceof zzcs ? (zzcs) queryLocalInterface9 : new zzcq(readStrongBinder9);
                }
                zzbn.d(parcel);
                getAppInstanceId(zzcsVar10);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcsVar9 = queryLocalInterface10 instanceof zzcs ? (zzcs) queryLocalInterface10 : new zzcq(readStrongBinder10);
                }
                zzbn.d(parcel);
                getGmpAppId(zzcsVar9);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcsVar8 = queryLocalInterface11 instanceof zzcs ? (zzcs) queryLocalInterface11 : new zzcq(readStrongBinder11);
                }
                zzbn.d(parcel);
                generateEventId(zzcsVar8);
                break;
            case 23:
                String readString17 = parcel.readString();
                long readLong12 = parcel.readLong();
                zzbn.d(parcel);
                beginAdUnitExposure(readString17, readLong12);
                break;
            case 24:
                String readString18 = parcel.readString();
                long readLong13 = parcel.readLong();
                zzbn.d(parcel);
                endAdUnitExposure(readString18, readLong13);
                break;
            case 25:
                IObjectWrapper S14 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                zzbn.d(parcel);
                onActivityStarted(S14, readLong14);
                break;
            case 26:
                IObjectWrapper S15 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                zzbn.d(parcel);
                onActivityStopped(S15, readLong15);
                break;
            case 27:
                IObjectWrapper S16 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) zzbn.a(parcel, Bundle.CREATOR);
                long readLong16 = parcel.readLong();
                zzbn.d(parcel);
                onActivityCreated(S16, bundle5, readLong16);
                break;
            case 28:
                IObjectWrapper S17 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                zzbn.d(parcel);
                onActivityDestroyed(S17, readLong17);
                break;
            case 29:
                IObjectWrapper S18 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                zzbn.d(parcel);
                onActivityPaused(S18, readLong18);
                break;
            case 30:
                IObjectWrapper S19 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                zzbn.d(parcel);
                onActivityResumed(S19, readLong19);
                break;
            case 31:
                IObjectWrapper S110 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcsVar7 = queryLocalInterface12 instanceof zzcs ? (zzcs) queryLocalInterface12 : new zzcq(readStrongBinder12);
                }
                long readLong20 = parcel.readLong();
                zzbn.d(parcel);
                onActivitySaveInstanceState(S110, zzcsVar7, readLong20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) zzbn.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcsVar6 = queryLocalInterface13 instanceof zzcs ? (zzcs) queryLocalInterface13 : new zzcq(readStrongBinder13);
                }
                long readLong21 = parcel.readLong();
                zzbn.d(parcel);
                performAction(bundle6, zzcsVar6, readLong21);
                break;
            case 33:
                int readInt = parcel.readInt();
                String readString19 = parcel.readString();
                IObjectWrapper S111 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                IObjectWrapper S112 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                IObjectWrapper S113 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbn.d(parcel);
                logHealthData(readInt, readString19, S111, S112, S113);
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzcyVar3 = queryLocalInterface14 instanceof zzcy ? (zzcy) queryLocalInterface14 : new zzcw(readStrongBinder14);
                }
                zzbn.d(parcel);
                setEventInterceptor(zzcyVar3);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzcyVar2 = queryLocalInterface15 instanceof zzcy ? (zzcy) queryLocalInterface15 : new zzcw(readStrongBinder15);
                }
                zzbn.d(parcel);
                registerOnMeasurementEventListener(zzcyVar2);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzcyVar = queryLocalInterface16 instanceof zzcy ? (zzcy) queryLocalInterface16 : new zzcw(readStrongBinder16);
                }
                zzbn.d(parcel);
                unregisterOnMeasurementEventListener(zzcyVar);
                break;
            case 37:
                HashMap readHashMap = parcel.readHashMap(zzbn.a);
                zzbn.d(parcel);
                initForTests(readHashMap);
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcsVar5 = queryLocalInterface17 instanceof zzcs ? (zzcs) queryLocalInterface17 : new zzcq(readStrongBinder17);
                }
                int readInt2 = parcel.readInt();
                zzbn.d(parcel);
                getTestFlag(zzcsVar5, readInt2);
                break;
            case 39:
                ClassLoader classLoader4 = zzbn.a;
                z = parcel.readInt() != 0;
                zzbn.d(parcel);
                setDataCollectionEnabled(z);
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcsVar4 = queryLocalInterface18 instanceof zzcs ? (zzcs) queryLocalInterface18 : new zzcq(readStrongBinder18);
                }
                zzbn.d(parcel);
                isDataCollectionEnabled(zzcsVar4);
                break;
            case 41:
            case 47:
            case 49:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) zzbn.a(parcel, Bundle.CREATOR);
                zzbn.d(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long readLong22 = parcel.readLong();
                zzbn.d(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case 44:
                Bundle bundle8 = (Bundle) zzbn.a(parcel, Bundle.CREATOR);
                long readLong23 = parcel.readLong();
                zzbn.d(parcel);
                setConsent(bundle8, readLong23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) zzbn.a(parcel, Bundle.CREATOR);
                long readLong24 = parcel.readLong();
                zzbn.d(parcel);
                setConsentThirdParty(bundle9, readLong24);
                break;
            case 46:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcsVar3 = queryLocalInterface19 instanceof zzcs ? (zzcs) queryLocalInterface19 : new zzcq(readStrongBinder19);
                }
                zzbn.d(parcel);
                getSessionId(zzcsVar3);
                break;
            case 48:
                Intent intent = (Intent) zzbn.a(parcel, Intent.CREATOR);
                zzbn.d(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                zzdd zzddVar = (zzdd) zzbn.a(parcel, zzdd.CREATOR);
                String readString20 = parcel.readString();
                String readString21 = parcel.readString();
                long readLong25 = parcel.readLong();
                zzbn.d(parcel);
                setCurrentScreenByScionActivityInfo(zzddVar, readString20, readString21, readLong25);
                break;
            case 51:
                zzdd zzddVar2 = (zzdd) zzbn.a(parcel, zzdd.CREATOR);
                long readLong26 = parcel.readLong();
                zzbn.d(parcel);
                onActivityStartedByScionActivityInfo(zzddVar2, readLong26);
                break;
            case 52:
                zzdd zzddVar3 = (zzdd) zzbn.a(parcel, zzdd.CREATOR);
                long readLong27 = parcel.readLong();
                zzbn.d(parcel);
                onActivityStoppedByScionActivityInfo(zzddVar3, readLong27);
                break;
            case 53:
                zzdd zzddVar4 = (zzdd) zzbn.a(parcel, zzdd.CREATOR);
                Bundle bundle10 = (Bundle) zzbn.a(parcel, Bundle.CREATOR);
                long readLong28 = parcel.readLong();
                zzbn.d(parcel);
                onActivityCreatedByScionActivityInfo(zzddVar4, bundle10, readLong28);
                break;
            case 54:
                zzdd zzddVar5 = (zzdd) zzbn.a(parcel, zzdd.CREATOR);
                long readLong29 = parcel.readLong();
                zzbn.d(parcel);
                onActivityDestroyedByScionActivityInfo(zzddVar5, readLong29);
                break;
            case 55:
                zzdd zzddVar6 = (zzdd) zzbn.a(parcel, zzdd.CREATOR);
                long readLong30 = parcel.readLong();
                zzbn.d(parcel);
                onActivityPausedByScionActivityInfo(zzddVar6, readLong30);
                break;
            case 56:
                zzdd zzddVar7 = (zzdd) zzbn.a(parcel, zzdd.CREATOR);
                long readLong31 = parcel.readLong();
                zzbn.d(parcel);
                onActivityResumedByScionActivityInfo(zzddVar7, readLong31);
                break;
            case 57:
                zzdd zzddVar8 = (zzdd) zzbn.a(parcel, zzdd.CREATOR);
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzcsVar2 = queryLocalInterface20 instanceof zzcs ? (zzcs) queryLocalInterface20 : new zzcq(readStrongBinder20);
                }
                long readLong32 = parcel.readLong();
                zzbn.d(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(zzddVar8, zzcsVar2, readLong32);
                break;
            case 58:
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 != null) {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    zzcvVar = queryLocalInterface21 instanceof zzcv ? (zzcv) queryLocalInterface21 : new zzct(readStrongBinder21, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                }
                zzbn.d(parcel);
                retrieveAndUploadBatches(zzcvVar);
                break;
            case 59:
                String readString22 = parcel.readString();
                String readString23 = parcel.readString();
                Bundle bundle11 = (Bundle) zzbn.a(parcel, Bundle.CREATOR);
                boolean z4 = parcel.readInt() != 0;
                boolean z5 = parcel.readInt() != 0;
                long readLong33 = parcel.readLong();
                long readLong34 = parcel.readLong();
                zzbn.d(parcel);
                logEventWithElapsedTime(readString22, readString23, bundle11, z4, z5, readLong33, readLong34);
                break;
            case 60:
                IObjectWrapper S114 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzdb zzdbVar2 = (zzdb) zzbn.a(parcel, zzdb.CREATOR);
                long readLong35 = parcel.readLong();
                long readLong36 = parcel.readLong();
                zzbn.d(parcel);
                initializeWithElapsedTime(S114, zzdbVar2, readLong35, readLong36);
                break;
            case 61:
                long readLong37 = parcel.readLong();
                long readLong38 = parcel.readLong();
                zzbn.d(parcel);
                resetAnalyticsDataWithElapsedTime(readLong37, readLong38);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
