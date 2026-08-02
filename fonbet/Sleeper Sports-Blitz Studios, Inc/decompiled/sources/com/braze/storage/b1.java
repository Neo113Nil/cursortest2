package com.braze.storage;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import okhttp3.HttpUrl;

/* loaded from: classes6.dex */
public final class b1 {
    public static final String b() {
        return "Starting migration for endpoint metadata";
    }

    public static final String c() {
        return "Failed to migrate endpoint metadata to DataStore.";
    }

    public final Preferences a(SharedPreferencesView sharedPrefs, Preferences currentData) {
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.b1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b1.b();
            }
        }, 7, (Object) null);
        Preferences.Key<String> stringKey = PreferencesKeys.stringKey(DataStoreKey.ENDPOINT_LAST_REQUEST_MAP.getKey());
        Preferences.Key<String> stringKey2 = PreferencesKeys.stringKey(DataStoreKey.ENDPOINT_ATTEMPT_COUNT_MAP.getKey());
        if (currentData.contains(stringKey) && currentData.contains(stringKey2)) {
            return currentData;
        }
        try {
            Pair a2 = a(sharedPrefs);
            return a(currentData, stringKey, stringKey2, (Map) a2.component1(), (Map) a2.component2());
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.b1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return b1.c();
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    public static final String b(String str) {
        return "Migrated last request timestamp key: " + str;
    }

    public static Pair a(SharedPreferencesView sharedPreferencesView) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Map<String, Object> all = sharedPreferencesView.getAll();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : all.entrySet()) {
            if (entry.getValue() instanceof Long) {
                linkedHashMap3.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
            String str = (String) entry2.getKey();
            Object value = entry2.getValue();
            b1 b1Var = j1.b;
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Long");
            b1Var.a(str, ((Long) value).longValue(), linkedHashMap, linkedHashMap2);
        }
        return TuplesKt.to(linkedHashMap, linkedHashMap2);
    }

    public final void a(final String str, long j, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        if (StringsKt.startsWith$default(str, "uri-at-", false, 2, (Object) null)) {
            linkedHashMap2.put(str, Long.valueOf(j));
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.b1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return b1.a(str);
                }
            }, 7, (Object) null);
        } else if (StringsKt.startsWith$default(str, "uri-", false, 2, (Object) null)) {
            linkedHashMap.put(str, Long.valueOf(j));
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.b1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return b1.b(str);
                }
            }, 7, (Object) null);
        }
    }

    public static final String a(String str) {
        return "Migrated attempt count key: " + str;
    }

    public static MutablePreferences a(Preferences preferences, Preferences.Key key, Preferences.Key key2, Map map, Map map2) {
        Preferences.Key key3;
        String str;
        MutablePreferences mutablePreferences = preferences.toMutablePreferences();
        boolean contains = preferences.contains(key);
        String str2 = HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        if (!contains) {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Companion companion = Json.INSTANCE;
                companion.getSerializersModule();
                str = companion.encodeToString(new LinkedHashMapSerializer(StringSerializer.INSTANCE, LongSerializer.INSTANCE), map);
                key3 = key;
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                if (!(map instanceof Map) && (map instanceof List)) {
                    key3 = key;
                    str = HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
                } else {
                    key3 = key;
                    str = "{}";
                }
            }
            mutablePreferences.set(key3, str);
        }
        if (!preferences.contains(key2)) {
            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
            try {
                Json.Companion companion2 = Json.INSTANCE;
                companion2.getSerializersModule();
                str2 = companion2.encodeToString(new LinkedHashMapSerializer(StringSerializer.INSTANCE, LongSerializer.INSTANCE), map2);
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                if ((map2 instanceof Map) || !(map2 instanceof List)) {
                    str2 = "{}";
                }
            }
            mutablePreferences.set(key2, str2);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.b1$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b1.a();
            }
        }, 7, (Object) null);
        return mutablePreferences;
    }

    public static final String a() {
        return "Endpoint metadata migration completed successfully";
    }
}
