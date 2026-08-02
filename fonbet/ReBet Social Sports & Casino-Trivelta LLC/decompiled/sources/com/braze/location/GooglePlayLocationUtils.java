package com.braze.location;

import Zh.x;
import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.location.GooglePlayLocationUtils;
import com.braze.models.BrazeGeofence;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.GeofenceDataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.google.android.gms.common.api.b;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import di.C4087f;
import ei.AbstractC4212b;
import gi.e;
import io.agora.rtc2.internal.RtcEngineEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KType;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0014\u0010\u0015Jm\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u001a\b\u0002\u0010\u001b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0006\u0012\u0004\u0012\u00020\u000f0\u001a2\u001a\b\u0002\u0010\u001c\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u000f0\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001f\u0010 J5\u0010!\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\"J%\u0010#\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010\u0015¨\u0006$"}, d2 = {"Lcom/braze/location/GooglePlayLocationUtils;", "", "<init>", "()V", "Lcom/braze/storage/GeofenceDataStoreProvider;", "dataStoreProvider", "", "Lcom/braze/models/BrazeGeofence;", "retrieveRegisteredGeofencesFromLocalStorage$android_sdk_location_release", "(Lcom/braze/storage/GeofenceDataStoreProvider;)Ljava/util/List;", "retrieveRegisteredGeofencesFromLocalStorage", "Landroid/content/Context;", "context", "", "obsoleteGeofenceIds", "", "removeGeofencesRegisteredWithGeofencingClient$android_sdk_location_release", "(Landroid/content/Context;Ljava/util/List;Lcom/braze/storage/GeofenceDataStoreProvider;)V", "removeGeofencesRegisteredWithGeofencingClient", "newGeofencesToRegister", "storeRegisteredGeofencesToLocalStorage$android_sdk_location_release", "(Ljava/util/List;Lcom/braze/storage/GeofenceDataStoreProvider;)V", "storeRegisteredGeofencesToLocalStorage", "desiredGeofencesToRegister", "Landroid/app/PendingIntent;", "geofenceRequestIntent", "Lkotlin/Function1;", "removalFunction", "registerFunction", "registerGeofencesWithGooglePlayIfNecessary", "(Landroid/content/Context;Ljava/util/List;Landroid/app/PendingIntent;Lcom/braze/storage/GeofenceDataStoreProvider;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "deleteRegisteredGeofenceCache", "(Lcom/braze/storage/GeofenceDataStoreProvider;)V", "registerGeofencesWithGeofencingClient", "(Landroid/content/Context;Ljava/util/List;Landroid/app/PendingIntent;Lcom/braze/storage/GeofenceDataStoreProvider;)V", "removeGeofencesFromLocalStorage", "android-sdk-location_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SuppressLint({"MissingPermission"})
@SourceDebugExtension({"SMAP\nGooglePlayLocationUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePlayLocationUtils.kt\ncom/braze/location/GooglePlayLocationUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 DataStoreProvider.kt\ncom/braze/storage/DataStoreProvider\n+ 4 DataStoreUtils.kt\ncom/braze/support/DataStoreUtils\n+ 5 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,306:1\n1208#2,2:307\n1236#2,4:309\n774#2:313\n865#2:314\n2746#2,3:315\n866#2:318\n1563#2:319\n1634#2,3:320\n1563#2:351\n1634#2,3:352\n306#3,13:323\n320#3,5:346\n362#3,9:355\n371#3,7:372\n362#3,9:379\n371#3,7:396\n73#4,6:336\n79#4,3:343\n19#4,2:364\n21#4,5:367\n19#4,2:388\n21#4,5:391\n222#5:342\n205#5:366\n205#5:390\n*S KotlinDebug\n*F\n+ 1 GooglePlayLocationUtils.kt\ncom/braze/location/GooglePlayLocationUtils\n*L\n61#1:307,2\n61#1:309,4\n70#1:313\n70#1:314\n71#1:315,3\n70#1:318\n74#1:319\n74#1:320,3\n170#1:351\n170#1:352,3\n105#1:323,13\n105#1:346,5\n258#1:355,9\n258#1:372,7\n278#1:379,9\n278#1:396,7\n105#1:336,6\n105#1:343,3\n258#1:364,2\n258#1:367,5\n278#1:388,2\n278#1:391,5\n105#1:342\n258#1:366\n278#1:390\n*E\n"})
/* loaded from: classes.dex */
public final class GooglePlayLocationUtils {

    @NotNull
    public static final GooglePlayLocationUtils INSTANCE = new GooglePlayLocationUtils();

    private GooglePlayLocationUtils() {
    }

    @JvmStatic
    public static final void deleteRegisteredGeofenceCache(@NotNull GeofenceDataStoreProvider dataStoreProvider) {
        Intrinsics.checkNotNullParameter(dataStoreProvider, "dataStoreProvider");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: M3.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String deleteRegisteredGeofenceCache$lambda$0;
                deleteRegisteredGeofenceCache$lambda$0 = GooglePlayLocationUtils.deleteRegisteredGeofenceCache$lambda$0();
                return deleteRegisteredGeofenceCache$lambda$0;
            }
        }, 7, (Object) null);
        dataStoreProvider.clearData(DataStoreKey.REGISTERED_GEOFENCES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String deleteRegisteredGeofenceCache$lambda$0() {
        return "Deleting registered geofence cache.";
    }

    private final void registerGeofencesWithGeofencingClient(Context context, final List<BrazeGeofence> newGeofencesToRegister, PendingIntent geofenceRequestIntent, final GeofenceDataStoreProvider dataStoreProvider) {
        List<BrazeGeofence> list = newGeofencesToRegister;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(GooglePlayLocationUtilsKt.toGeofence((BrazeGeofence) it.next()));
        }
        GeofencingRequest c10 = new GeofencingRequest.a().b(arrayList).d(0).c();
        Intrinsics.checkNotNullExpressionValue(c10, "build(...)");
        Task addGeofences = LocationServices.b(context).addGeofences(c10, geofenceRequestIntent);
        final Function1 function1 = new Function1() { // from class: M3.X
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit registerGeofencesWithGeofencingClient$lambda$1;
                registerGeofencesWithGeofencingClient$lambda$1 = GooglePlayLocationUtils.registerGeofencesWithGeofencingClient$lambda$1(newGeofencesToRegister, dataStoreProvider, (Void) obj);
                return registerGeofencesWithGeofencingClient$lambda$1;
            }
        };
        addGeofences.addOnSuccessListener(new OnSuccessListener() { // from class: M3.Y
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Function1.this.invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: M3.Z
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                GooglePlayLocationUtils.registerGeofencesWithGeofencingClient$lambda$3(exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerGeofencesWithGeofencingClient$lambda$1(List list, GeofenceDataStoreProvider geofenceDataStoreProvider, Void r10) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        GooglePlayLocationUtils googlePlayLocationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) googlePlayLocationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: M3.M
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String registerGeofencesWithGeofencingClient$lambda$1$0;
                registerGeofencesWithGeofencingClient$lambda$1$0 = GooglePlayLocationUtils.registerGeofencesWithGeofencingClient$lambda$1$0();
                return registerGeofencesWithGeofencingClient$lambda$1$0;
            }
        }, 7, (Object) null);
        googlePlayLocationUtils.storeRegisteredGeofencesToLocalStorage$android_sdk_location_release(list, geofenceDataStoreProvider);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofencesWithGeofencingClient$lambda$1$0() {
        return "Geofences successfully registered with Google Play Services.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerGeofencesWithGeofencingClient$lambda$3(Exception exc) {
        if (!(exc instanceof b)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29470E, (Throwable) exc, false, new Function0() { // from class: M3.T
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String registerGeofencesWithGeofencingClient$lambda$3$5;
                    registerGeofencesWithGeofencingClient$lambda$3$5 = GooglePlayLocationUtils.registerGeofencesWithGeofencingClient$lambda$3$5();
                    return registerGeofencesWithGeofencingClient$lambda$3$5;
                }
            }, 4, (Object) null);
            return;
        }
        final int statusCode = ((b) exc).getStatusCode();
        if (statusCode == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: M3.Q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String registerGeofencesWithGeofencingClient$lambda$3$3;
                    registerGeofencesWithGeofencingClient$lambda$3$3 = GooglePlayLocationUtils.registerGeofencesWithGeofencingClient$lambda$3$3();
                    return registerGeofencesWithGeofencingClient$lambda$3$3;
                }
            }, 7, (Object) null);
            return;
        }
        switch (statusCode) {
            case 1000:
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: M3.P
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String registerGeofencesWithGeofencingClient$lambda$3$2;
                        registerGeofencesWithGeofencingClient$lambda$3$2 = GooglePlayLocationUtils.registerGeofencesWithGeofencingClient$lambda$3$2(statusCode);
                        return registerGeofencesWithGeofencingClient$lambda$3$2;
                    }
                }, 6, (Object) null);
                break;
            case 1001:
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: M3.N
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String registerGeofencesWithGeofencingClient$lambda$3$0;
                        registerGeofencesWithGeofencingClient$lambda$3$0 = GooglePlayLocationUtils.registerGeofencesWithGeofencingClient$lambda$3$0(statusCode);
                        return registerGeofencesWithGeofencingClient$lambda$3$0;
                    }
                }, 6, (Object) null);
                break;
            case RtcEngineEvent.EvtType.EVT_MEDIA_ENGINE_LOAD_SUCCESS /* 1002 */:
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: M3.O
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String registerGeofencesWithGeofencingClient$lambda$3$1;
                        registerGeofencesWithGeofencingClient$lambda$3$1 = GooglePlayLocationUtils.registerGeofencesWithGeofencingClient$lambda$3$1(statusCode);
                        return registerGeofencesWithGeofencingClient$lambda$3$1;
                    }
                }, 6, (Object) null);
                break;
            default:
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: M3.S
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String registerGeofencesWithGeofencingClient$lambda$3$4;
                        registerGeofencesWithGeofencingClient$lambda$3$4 = GooglePlayLocationUtils.registerGeofencesWithGeofencingClient$lambda$3$4(statusCode);
                        return registerGeofencesWithGeofencingClient$lambda$3$4;
                    }
                }, 6, (Object) null);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofencesWithGeofencingClient$lambda$3$0(int i10) {
        return "Geofences not registered with Google Play Services due to GEOFENCE_TOO_MANY_GEOFENCES: " + i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofencesWithGeofencingClient$lambda$3$1(int i10) {
        return "Geofences not registered with Google Play Services due to GEOFENCE_TOO_MANY_PENDING_INTENTS: " + i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofencesWithGeofencingClient$lambda$3$2(int i10) {
        return "Geofences not registered with Google Play Services due to GEOFENCE_NOT_AVAILABLE: " + i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofencesWithGeofencingClient$lambda$3$3() {
        return "Received Geofence registration success code in failure block with Google Play Services.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofencesWithGeofencingClient$lambda$3$4(int i10) {
        return "Geofence pending result returned unknown status code: " + i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofencesWithGeofencingClient$lambda$3$5() {
        return "Geofence exception encountered while adding geofences.";
    }

    @JvmStatic
    public static final void registerGeofencesWithGooglePlayIfNecessary(@NotNull Context context, @NotNull final List<BrazeGeofence> desiredGeofencesToRegister, @NotNull PendingIntent geofenceRequestIntent, @NotNull GeofenceDataStoreProvider dataStoreProvider, @NotNull Function1<? super List<String>, Unit> removalFunction, @NotNull Function1<? super List<BrazeGeofence>, Unit> registerFunction) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(desiredGeofencesToRegister, "desiredGeofencesToRegister");
        Intrinsics.checkNotNullParameter(geofenceRequestIntent, "geofenceRequestIntent");
        Intrinsics.checkNotNullParameter(dataStoreProvider, "dataStoreProvider");
        Intrinsics.checkNotNullParameter(removalFunction, "removalFunction");
        Intrinsics.checkNotNullParameter(registerFunction, "registerFunction");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        GooglePlayLocationUtils googlePlayLocationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) googlePlayLocationUtils, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: M3.a0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String registerGeofencesWithGooglePlayIfNecessary$lambda$2;
                registerGeofencesWithGooglePlayIfNecessary$lambda$2 = GooglePlayLocationUtils.registerGeofencesWithGooglePlayIfNecessary$lambda$2(desiredGeofencesToRegister);
                return registerGeofencesWithGooglePlayIfNecessary$lambda$2;
            }
        }, 6, (Object) null);
        try {
            List<BrazeGeofence> retrieveRegisteredGeofencesFromLocalStorage$android_sdk_location_release = googlePlayLocationUtils.retrieveRegisteredGeofencesFromLocalStorage$android_sdk_location_release(dataStoreProvider);
            List<BrazeGeofence> list = retrieveRegisteredGeofencesFromLocalStorage$android_sdk_location_release;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
            for (Object obj : list) {
                linkedHashMap.put(((BrazeGeofence) obj).getId(), obj);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : retrieveRegisteredGeofencesFromLocalStorage$android_sdk_location_release) {
                BrazeGeofence brazeGeofence = (BrazeGeofence) obj2;
                List<BrazeGeofence> list2 = desiredGeofencesToRegister;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.areEqual(((BrazeGeofence) it.next()).getId(), brazeGeofence.getId())) {
                            break;
                        }
                    }
                }
                arrayList.add(obj2);
            }
            final ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((BrazeGeofence) it2.next()).getId());
            }
            final ArrayList arrayList3 = new ArrayList();
            for (final BrazeGeofence brazeGeofence2 : desiredGeofencesToRegister) {
                BrazeGeofence brazeGeofence3 = (BrazeGeofence) linkedHashMap.get(brazeGeofence2.getId());
                if (brazeGeofence3 == null || !brazeGeofence2.equivalentServerData(brazeGeofence3)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: M3.b0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String registerGeofencesWithGooglePlayIfNecessary$lambda$6;
                            registerGeofencesWithGooglePlayIfNecessary$lambda$6 = GooglePlayLocationUtils.registerGeofencesWithGooglePlayIfNecessary$lambda$6(BrazeGeofence.this);
                            return registerGeofencesWithGooglePlayIfNecessary$lambda$6;
                        }
                    }, 7, (Object) null);
                    arrayList3.add(brazeGeofence2);
                }
            }
            if (arrayList2.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: M3.d0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String registerGeofencesWithGooglePlayIfNecessary$lambda$8;
                        registerGeofencesWithGooglePlayIfNecessary$lambda$8 = GooglePlayLocationUtils.registerGeofencesWithGooglePlayIfNecessary$lambda$8();
                        return registerGeofencesWithGooglePlayIfNecessary$lambda$8;
                    }
                }, 7, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: M3.c0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String registerGeofencesWithGooglePlayIfNecessary$lambda$7;
                        registerGeofencesWithGooglePlayIfNecessary$lambda$7 = GooglePlayLocationUtils.registerGeofencesWithGooglePlayIfNecessary$lambda$7(arrayList2);
                        return registerGeofencesWithGooglePlayIfNecessary$lambda$7;
                    }
                }, 7, (Object) null);
                removalFunction.invoke(arrayList2);
            }
            if (arrayList3.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: M3.z
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String registerGeofencesWithGooglePlayIfNecessary$lambda$10;
                        registerGeofencesWithGooglePlayIfNecessary$lambda$10 = GooglePlayLocationUtils.registerGeofencesWithGooglePlayIfNecessary$lambda$10();
                        return registerGeofencesWithGooglePlayIfNecessary$lambda$10;
                    }
                }, 7, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: M3.y
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String registerGeofencesWithGooglePlayIfNecessary$lambda$9;
                        registerGeofencesWithGooglePlayIfNecessary$lambda$9 = GooglePlayLocationUtils.registerGeofencesWithGooglePlayIfNecessary$lambda$9(arrayList3);
                        return registerGeofencesWithGooglePlayIfNecessary$lambda$9;
                    }
                }, 7, (Object) null);
                registerFunction.invoke(arrayList3);
            }
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: M3.A
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String registerGeofencesWithGooglePlayIfNecessary$lambda$11;
                    registerGeofencesWithGooglePlayIfNecessary$lambda$11 = GooglePlayLocationUtils.registerGeofencesWithGooglePlayIfNecessary$lambda$11();
                    return registerGeofencesWithGooglePlayIfNecessary$lambda$11;
                }
            }, 4, (Object) null);
        }
    }

    public static /* synthetic */ void registerGeofencesWithGooglePlayIfNecessary$default(final Context context, List list, final PendingIntent pendingIntent, final GeofenceDataStoreProvider geofenceDataStoreProvider, Function1 function1, Function1 function12, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            function1 = new Function1() { // from class: M3.I
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit registerGeofencesWithGooglePlayIfNecessary$lambda$0;
                    registerGeofencesWithGooglePlayIfNecessary$lambda$0 = GooglePlayLocationUtils.registerGeofencesWithGooglePlayIfNecessary$lambda$0(context, geofenceDataStoreProvider, (List) obj2);
                    return registerGeofencesWithGooglePlayIfNecessary$lambda$0;
                }
            };
        }
        Function1 function13 = function1;
        if ((i10 & 32) != 0) {
            function12 = new Function1() { // from class: M3.U
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit registerGeofencesWithGooglePlayIfNecessary$lambda$1;
                    registerGeofencesWithGooglePlayIfNecessary$lambda$1 = GooglePlayLocationUtils.registerGeofencesWithGooglePlayIfNecessary$lambda$1(context, pendingIntent, geofenceDataStoreProvider, (List) obj2);
                    return registerGeofencesWithGooglePlayIfNecessary$lambda$1;
                }
            };
        }
        registerGeofencesWithGooglePlayIfNecessary(context, list, pendingIntent, geofenceDataStoreProvider, function13, function12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerGeofencesWithGooglePlayIfNecessary$lambda$0(Context context, GeofenceDataStoreProvider geofenceDataStoreProvider, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        INSTANCE.removeGeofencesRegisteredWithGeofencingClient$android_sdk_location_release(context, it, geofenceDataStoreProvider);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerGeofencesWithGooglePlayIfNecessary$lambda$1(Context context, PendingIntent pendingIntent, GeofenceDataStoreProvider geofenceDataStoreProvider, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        INSTANCE.registerGeofencesWithGeofencingClient(context, it, pendingIntent, geofenceDataStoreProvider);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofencesWithGooglePlayIfNecessary$lambda$10() {
        return "No new geofences need to be registered with Google Play Services.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofencesWithGooglePlayIfNecessary$lambda$11() {
        return "Exception while adding geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofencesWithGooglePlayIfNecessary$lambda$2(List list) {
        return "registerGeofencesWithGooglePlayIfNecessary called with " + list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofencesWithGooglePlayIfNecessary$lambda$6(BrazeGeofence brazeGeofence) {
        return "Geofence with id: " + brazeGeofence.getId() + " is new or has been updated.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofencesWithGooglePlayIfNecessary$lambda$7(List list) {
        return "Un-registering " + list + " obsolete geofences from Google Play Services.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofencesWithGooglePlayIfNecessary$lambda$8() {
        return "No obsolete geofences need to be unregistered from Google Play Services.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofencesWithGooglePlayIfNecessary$lambda$9(List list) {
        return "Registering " + list + " new geofences with Google Play Services.";
    }

    private final void removeGeofencesFromLocalStorage(List<String> obsoleteGeofenceIds, GeofenceDataStoreProvider dataStoreProvider) {
        String str;
        List<BrazeGeofence> mutableList = CollectionsKt.toMutableList((Collection) retrieveRegisteredGeofencesFromLocalStorage$android_sdk_location_release(dataStoreProvider));
        ArrayList arrayList = new ArrayList();
        for (BrazeGeofence brazeGeofence : mutableList) {
            if (!obsoleteGeofenceIds.contains(brazeGeofence.getId())) {
                arrayList.add(brazeGeofence);
            }
        }
        final DataStoreKey dataStoreKey = DataStoreKey.REGISTERED_GEOFENCES;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils$removeGeofencesFromLocalStorage$$inlined$writeList$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Key " + DataStoreKey.this.getKey() + " is not a LIST type. Cannot write key:" + DataStoreKey.this.getKey();
                }
            }, 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                e a10 = aVar.a();
                KType typeOf = Reflection.typeOf(BrazeGeofence.class);
                MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
                str = aVar.b(new C4087f(x.b(a10, typeOf)), arrayList);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils$removeGeofencesFromLocalStorage$$inlined$writeList$2
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Failed to serialize data to JSON";
                    }
                }, 4, (Object) null);
                str = arrayList instanceof Map ? "{}" : HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            }
            dataStoreProvider.writeData(dataStoreKey, str);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils$removeGeofencesFromLocalStorage$$inlined$writeList$3
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to write list to DataStore for key: " + DataStoreKey.this.getKey();
                }
            }, 8, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeGeofencesRegisteredWithGeofencingClient$lambda$0(List list, GeofenceDataStoreProvider geofenceDataStoreProvider, Void r10) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        GooglePlayLocationUtils googlePlayLocationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) googlePlayLocationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: M3.V
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String removeGeofencesRegisteredWithGeofencingClient$lambda$0$0;
                removeGeofencesRegisteredWithGeofencingClient$lambda$0$0 = GooglePlayLocationUtils.removeGeofencesRegisteredWithGeofencingClient$lambda$0$0();
                return removeGeofencesRegisteredWithGeofencingClient$lambda$0$0;
            }
        }, 7, (Object) null);
        googlePlayLocationUtils.removeGeofencesFromLocalStorage(list, geofenceDataStoreProvider);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeGeofencesRegisteredWithGeofencingClient$lambda$0$0() {
        return "Geofences successfully un-registered with Google Play Services.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeGeofencesRegisteredWithGeofencingClient$lambda$2(Exception exc) {
        if (!(exc instanceof b)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29470E, (Throwable) exc, false, new Function0() { // from class: M3.L
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String removeGeofencesRegisteredWithGeofencingClient$lambda$2$5;
                    removeGeofencesRegisteredWithGeofencingClient$lambda$2$5 = GooglePlayLocationUtils.removeGeofencesRegisteredWithGeofencingClient$lambda$2$5();
                    return removeGeofencesRegisteredWithGeofencingClient$lambda$2$5;
                }
            }, 4, (Object) null);
            return;
        }
        final int statusCode = ((b) exc).getStatusCode();
        if (statusCode == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: M3.J
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String removeGeofencesRegisteredWithGeofencingClient$lambda$2$3;
                    removeGeofencesRegisteredWithGeofencingClient$lambda$2$3 = GooglePlayLocationUtils.removeGeofencesRegisteredWithGeofencingClient$lambda$2$3();
                    return removeGeofencesRegisteredWithGeofencingClient$lambda$2$3;
                }
            }, 7, (Object) null);
            return;
        }
        switch (statusCode) {
            case 1000:
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: M3.H
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String removeGeofencesRegisteredWithGeofencingClient$lambda$2$2;
                        removeGeofencesRegisteredWithGeofencingClient$lambda$2$2 = GooglePlayLocationUtils.removeGeofencesRegisteredWithGeofencingClient$lambda$2$2(statusCode);
                        return removeGeofencesRegisteredWithGeofencingClient$lambda$2$2;
                    }
                }, 6, (Object) null);
                break;
            case 1001:
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: M3.F
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String removeGeofencesRegisteredWithGeofencingClient$lambda$2$0;
                        removeGeofencesRegisteredWithGeofencingClient$lambda$2$0 = GooglePlayLocationUtils.removeGeofencesRegisteredWithGeofencingClient$lambda$2$0(statusCode);
                        return removeGeofencesRegisteredWithGeofencingClient$lambda$2$0;
                    }
                }, 6, (Object) null);
                break;
            case RtcEngineEvent.EvtType.EVT_MEDIA_ENGINE_LOAD_SUCCESS /* 1002 */:
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: M3.G
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String removeGeofencesRegisteredWithGeofencingClient$lambda$2$1;
                        removeGeofencesRegisteredWithGeofencingClient$lambda$2$1 = GooglePlayLocationUtils.removeGeofencesRegisteredWithGeofencingClient$lambda$2$1(statusCode);
                        return removeGeofencesRegisteredWithGeofencingClient$lambda$2$1;
                    }
                }, 6, (Object) null);
                break;
            default:
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: M3.K
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String removeGeofencesRegisteredWithGeofencingClient$lambda$2$4;
                        removeGeofencesRegisteredWithGeofencingClient$lambda$2$4 = GooglePlayLocationUtils.removeGeofencesRegisteredWithGeofencingClient$lambda$2$4(statusCode);
                        return removeGeofencesRegisteredWithGeofencingClient$lambda$2$4;
                    }
                }, 6, (Object) null);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeGeofencesRegisteredWithGeofencingClient$lambda$2$0(int i10) {
        return "Geofences cannot be un-registered with Google Play Services due to GEOFENCE_TOO_MANY_GEOFENCES: " + i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeGeofencesRegisteredWithGeofencingClient$lambda$2$1(int i10) {
        return "Geofences cannot be un-registered with Google Play Services due to GEOFENCE_TOO_MANY_PENDING_INTENTS: " + i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeGeofencesRegisteredWithGeofencingClient$lambda$2$2(int i10) {
        return "Geofences cannot be un-registered with Google Play Services due to GEOFENCE_NOT_AVAILABLE: " + i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeGeofencesRegisteredWithGeofencingClient$lambda$2$3() {
        return "Received Geofence un-registration success code in failure block with Google Play Services.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeGeofencesRegisteredWithGeofencingClient$lambda$2$4(int i10) {
        return "Geofence pending result returned unknown status code: " + i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeGeofencesRegisteredWithGeofencingClient$lambda$2$5() {
        return "Geofence exception encountered while removing geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String retrieveRegisteredGeofencesFromLocalStorage$lambda$0() {
        return "Did not find stored geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String storeRegisteredGeofencesToLocalStorage$lambda$0(List list) {
        return "Writing registered geofences: " + list + " to local storage.";
    }

    public final void removeGeofencesRegisteredWithGeofencingClient$android_sdk_location_release(@NotNull Context context, @NotNull final List<String> obsoleteGeofenceIds, @NotNull final GeofenceDataStoreProvider dataStoreProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(obsoleteGeofenceIds, "obsoleteGeofenceIds");
        Intrinsics.checkNotNullParameter(dataStoreProvider, "dataStoreProvider");
        Task removeGeofences = LocationServices.b(context).removeGeofences(obsoleteGeofenceIds);
        final Function1 function1 = new Function1() { // from class: M3.B
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit removeGeofencesRegisteredWithGeofencingClient$lambda$0;
                removeGeofencesRegisteredWithGeofencingClient$lambda$0 = GooglePlayLocationUtils.removeGeofencesRegisteredWithGeofencingClient$lambda$0(obsoleteGeofenceIds, dataStoreProvider, (Void) obj);
                return removeGeofencesRegisteredWithGeofencingClient$lambda$0;
            }
        };
        removeGeofences.addOnSuccessListener(new OnSuccessListener() { // from class: M3.C
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Function1.this.invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: M3.D
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                GooglePlayLocationUtils.removeGeofencesRegisteredWithGeofencingClient$lambda$2(exc);
            }
        });
    }

    @NotNull
    public final List<BrazeGeofence> retrieveRegisteredGeofencesFromLocalStorage$android_sdk_location_release(@NotNull GeofenceDataStoreProvider dataStoreProvider) {
        List<BrazeGeofence> arrayList;
        List emptyList;
        Intrinsics.checkNotNullParameter(dataStoreProvider, "dataStoreProvider");
        final DataStoreKey dataStoreKey = DataStoreKey.REGISTERED_GEOFENCES;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils$retrieveRegisteredGeofencesFromLocalStorage$$inlined$readList$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Key " + DataStoreKey.this.getKey() + " is not a LIST type. Returning empty list.";
                }
            }, 12, (Object) null);
            arrayList = new ArrayList<>();
        } else {
            try {
                Object readData = dataStoreProvider.readData(dataStoreKey, "");
                Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.String");
                final String str = (String) readData;
                if (StringsKt.isBlank(str)) {
                    arrayList = new ArrayList<>();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (StringsKt.isBlank(str)) {
                        emptyList = CollectionsKt.emptyList();
                    } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str).toString(), "null")) {
                        emptyList = CollectionsKt.emptyList();
                    } else {
                        try {
                            AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                            e a10 = aVar.a();
                            KType typeOf = Reflection.typeOf(BrazeGeofence.class);
                            MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
                            emptyList = (List) aVar.d(new C4087f(x.b(a10, typeOf)), str);
                        } catch (Exception e10) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils$retrieveRegisteredGeofencesFromLocalStorage$$inlined$readList$2
                                @Override // kotlin.jvm.functions.Function0
                                public final String invoke() {
                                    return "Failed to parse JSON list: '" + str + "'";
                                }
                            }, 4, (Object) null);
                            emptyList = CollectionsKt.emptyList();
                        }
                    }
                    arrayList = CollectionsKt.toMutableList((Collection) emptyList);
                }
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils$retrieveRegisteredGeofencesFromLocalStorage$$inlined$readList$3
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Failed to read list from DataStore for key: " + DataStoreKey.this.getKey();
                    }
                }, 8, (Object) null);
                arrayList = new ArrayList<>();
            }
        }
        if (arrayList.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: M3.E
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String retrieveRegisteredGeofencesFromLocalStorage$lambda$0;
                    retrieveRegisteredGeofencesFromLocalStorage$lambda$0 = GooglePlayLocationUtils.retrieveRegisteredGeofencesFromLocalStorage$lambda$0();
                    return retrieveRegisteredGeofencesFromLocalStorage$lambda$0;
                }
            }, 7, (Object) null);
        }
        return arrayList;
    }

    public final void storeRegisteredGeofencesToLocalStorage$android_sdk_location_release(@NotNull final List<BrazeGeofence> newGeofencesToRegister, @NotNull GeofenceDataStoreProvider dataStoreProvider) {
        String str;
        Intrinsics.checkNotNullParameter(newGeofencesToRegister, "newGeofencesToRegister");
        Intrinsics.checkNotNullParameter(dataStoreProvider, "dataStoreProvider");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: M3.W
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String storeRegisteredGeofencesToLocalStorage$lambda$0;
                storeRegisteredGeofencesToLocalStorage$lambda$0 = GooglePlayLocationUtils.storeRegisteredGeofencesToLocalStorage$lambda$0(newGeofencesToRegister);
                return storeRegisteredGeofencesToLocalStorage$lambda$0;
            }
        }, 7, (Object) null);
        final DataStoreKey dataStoreKey = DataStoreKey.REGISTERED_GEOFENCES;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils$storeRegisteredGeofencesToLocalStorage$$inlined$writeList$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Key " + DataStoreKey.this.getKey() + " is not a LIST type. Cannot write key:" + DataStoreKey.this.getKey();
                }
            }, 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                e a10 = aVar.a();
                KType typeOf = Reflection.typeOf(BrazeGeofence.class);
                MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
                str = aVar.b(new C4087f(x.b(a10, typeOf)), newGeofencesToRegister);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils$storeRegisteredGeofencesToLocalStorage$$inlined$writeList$2
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Failed to serialize data to JSON";
                    }
                }, 4, (Object) null);
                str = newGeofencesToRegister instanceof Map ? "{}" : HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            }
            dataStoreProvider.writeData(dataStoreKey, str);
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils$storeRegisteredGeofencesToLocalStorage$$inlined$writeList$3
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to write list to DataStore for key: " + DataStoreKey.this.getKey();
                }
            }, 8, (Object) null);
        }
    }
}
