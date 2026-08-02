package bo.app;

import com.braze.enums.DataStoreKey;
import com.braze.models.BrazeGeofence;
import com.braze.storage.GeofenceDataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import di.C4084d0;
import di.C4087f;
import di.C4096j0;
import di.Z0;
import ei.AbstractC4212b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class o8 {
    public static final String b() {
        return "Migration for " + DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP.getKey() + " completed successfully";
    }

    public static final String c() {
        return "Failed to migrate individual reeligibility map to DataStore.";
    }

    public static final String d(String str) {
        return "Migration for " + str + " completed successfully";
    }

    public static final String e(String str) {
        return "Failed to migrate " + str + " list to DataStore.";
    }

    public static final String f(String str) {
        return "Added timestamp for geofence:" + str + " from SharedPreferences";
    }

    public final L0.f a(K0.c sharedPrefs, L0.f currentData) {
        String str;
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.y8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.o8.a();
            }
        }, 7, (Object) null);
        if (currentData.b(L0.i.g(DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP.getKey()))) {
            return currentData;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                final String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Long) {
                    linkedHashMap.put(str2, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) GeofenceDataStoreProvider.Companion, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.z8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.o8.f(str2);
                        }
                    }, 7, (Object) null);
                }
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                aVar.a();
                str = aVar.b(new C4084d0(Z0.f45341a, C4096j0.f45375a), linkedHashMap);
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                str = "{}";
            }
            L0.c d10 = currentData.d();
            d10.k(L0.i.g(DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d10, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.A8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.o8.b();
                }
            }, 7, (Object) null);
            return d10;
        } catch (Exception e11) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e11, false, new Function0() { // from class: c3.B8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.o8.c();
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    public static final String b(String str) {
        return "Added geofence from SharedPreferences key: " + str;
    }

    public static final String c(String str) {
        return "Failed to decode BrazeGeofence from JSON: " + str;
    }

    public static final String a() {
        return "Starting migration for key: " + DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP.getKey();
    }

    public final L0.f a(K0.c sharedPrefs, L0.f currentData, final String key) {
        String str;
        final BrazeGeofence brazeGeofence;
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        Intrinsics.checkNotNullParameter(key, "key");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.s8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.o8.a(key);
            }
        }, 7, (Object) null);
        if (currentData.b(L0.i.g(key))) {
            return currentData;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : sharedPrefs.b().entrySet()) {
                final String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    arrayList.add(value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) GeofenceDataStoreProvider.Companion, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.t8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.o8.b(str2);
                        }
                    }, 7, (Object) null);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                final String str3 = (String) arrayList.get(i10);
                try {
                    AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                    aVar.a();
                    brazeGeofence = (BrazeGeofence) aVar.d(BrazeGeofence.Companion.serializer(), str3);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) GeofenceDataStoreProvider.Companion, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.u8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.o8.a(BrazeGeofence.this);
                        }
                    }, 7, (Object) null);
                } catch (Exception e10) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) GeofenceDataStoreProvider.Companion, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.v8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.o8.c(str3);
                        }
                    }, 4, (Object) null);
                    brazeGeofence = null;
                }
                if (brazeGeofence != null) {
                    arrayList2.add(brazeGeofence);
                }
                i10 = i11;
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                AbstractC4212b.a aVar2 = AbstractC4212b.f46079d;
                aVar2.a();
                str = aVar2.b(new C4087f(BrazeGeofence.Companion.serializer()), arrayList2);
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                str = arrayList2 instanceof Map ? "{}" : HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            }
            L0.c d10 = currentData.d();
            d10.k(L0.i.g(key), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d10, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.w8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.o8.d(key);
                }
            }, 7, (Object) null);
            return d10;
        } catch (Exception e12) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e12, false, new Function0() { // from class: c3.x8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.o8.e(key);
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    public static final String a(String str) {
        return "Starting migration for key: " + str;
    }

    public static final String a(BrazeGeofence brazeGeofence) {
        return "Successfully decoded geofence: " + brazeGeofence.getId();
    }
}
