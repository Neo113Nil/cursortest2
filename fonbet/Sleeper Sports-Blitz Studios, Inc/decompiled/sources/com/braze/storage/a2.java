package com.braze.storage;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import com.braze.enums.DataStoreKey;
import com.braze.models.BrazeGeofence;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import okhttp3.HttpUrl;

/* loaded from: classes6.dex */
public final class a2 {
    public static final String b() {
        return "Migration for " + DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP.getKey() + " completed successfully";
    }

    public static final String c() {
        return "Failed to migrate individual reeligibility map to DataStore.";
    }

    public static final String d(String str) {
        return "Starting migration for key: " + str;
    }

    public static final String e(String str) {
        return "Added geofence from SharedPreferences key: " + str;
    }

    public static final String f(String str) {
        return "Added timestamp for geofence:" + str + " from SharedPreferences";
    }

    public final Preferences a(SharedPreferencesView sharedPrefs, Preferences currentData) {
        String str;
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.a2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a2.a();
            }
        }, 7, (Object) null);
        if (currentData.contains(PreferencesKeys.stringKey(DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP.getKey()))) {
            return currentData;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : sharedPrefs.getAll().entrySet()) {
                final String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Long) {
                    linkedHashMap.put(key, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) GeofenceDataStoreProvider.Companion, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.a2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return a2.f(key);
                        }
                    }, 7, (Object) null);
                }
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Companion companion = Json.INSTANCE;
                companion.getSerializersModule();
                str = companion.encodeToString(new LinkedHashMapSerializer(StringSerializer.INSTANCE, LongSerializer.INSTANCE), linkedHashMap);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                str = "{}";
            }
            MutablePreferences mutablePreferences = currentData.toMutablePreferences();
            mutablePreferences.set(PreferencesKeys.stringKey(DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.a2$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a2.b();
                }
            }, 7, (Object) null);
            return mutablePreferences;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, new Function0() { // from class: com.braze.storage.a2$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a2.c();
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    public static final String b(String str) {
        return "Migration for " + str + " completed successfully";
    }

    public static final String c(String str) {
        return "Failed to migrate " + str + " list to DataStore.";
    }

    public static final String a() {
        return "Starting migration for key: " + DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP.getKey();
    }

    public final Preferences a(SharedPreferencesView sharedPrefs, Preferences currentData, final String key) {
        String str;
        final BrazeGeofence brazeGeofence;
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        Intrinsics.checkNotNullParameter(key, "key");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.a2$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a2.d(key);
            }
        }, 7, (Object) null);
        if (currentData.contains(PreferencesKeys.stringKey(key))) {
            return currentData;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, Object> entry : sharedPrefs.getAll().entrySet()) {
                final String key2 = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    arrayList.add(value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) GeofenceDataStoreProvider.Companion, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.a2$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return a2.e(key2);
                        }
                    }, 7, (Object) null);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                final String str2 = (String) it.next();
                try {
                    Json.Companion companion = Json.INSTANCE;
                    companion.getSerializersModule();
                    brazeGeofence = (BrazeGeofence) companion.decodeFromString(BrazeGeofence.Companion.serializer(), str2);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) GeofenceDataStoreProvider.Companion, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.a2$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return a2.a(BrazeGeofence.this);
                        }
                    }, 7, (Object) null);
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) GeofenceDataStoreProvider.Companion, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.a2$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return a2.a(str2);
                        }
                    }, 4, (Object) null);
                    brazeGeofence = null;
                }
                if (brazeGeofence != null) {
                    arrayList2.add(brazeGeofence);
                }
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Companion companion2 = Json.INSTANCE;
                companion2.getSerializersModule();
                str = companion2.encodeToString(new ArrayListSerializer(BrazeGeofence.Companion.serializer()), arrayList2);
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                str = arrayList2 instanceof Map ? "{}" : HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            }
            MutablePreferences mutablePreferences = currentData.toMutablePreferences();
            mutablePreferences.set(PreferencesKeys.stringKey(key), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.a2$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a2.b(key);
                }
            }, 7, (Object) null);
            return mutablePreferences;
        } catch (Exception e3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e3, false, new Function0() { // from class: com.braze.storage.a2$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a2.c(key);
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    public static final String a(BrazeGeofence brazeGeofence) {
        return "Successfully decoded geofence: " + brazeGeofence.getId();
    }

    public static final String a(String str) {
        return "Failed to decode BrazeGeofence from JSON: " + str;
    }
}
