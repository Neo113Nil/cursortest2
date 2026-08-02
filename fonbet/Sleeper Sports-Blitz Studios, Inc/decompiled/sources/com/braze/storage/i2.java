package com.braze.storage;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

/* loaded from: classes6.dex */
public final class i2 {
    public static final String b() {
        return "Push ID storage already migrated to DataStore";
    }

    public static final String c() {
        return "Migration for push ID map completed successfully";
    }

    public static final String d() {
        return "Failed to migrate push ID storage to DataStore.";
    }

    public final Preferences a(SharedPreferencesView sharedPrefs, Preferences currentData) {
        String str;
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.i2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i2.a();
            }
        }, 7, (Object) null);
        if (currentData.contains(PreferencesKeys.stringKey(DataStoreKey.PUSH_ID_MAP.getKey()))) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.storage.i2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i2.b();
                }
            }, 6, (Object) null);
            return currentData;
        }
        try {
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : sharedPrefs.getAll().entrySet()) {
                final String key = entry.getKey();
                final Object value = entry.getValue();
                if (value instanceof Long) {
                    linkedHashMap.put(key, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) k2.d, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.storage.i2$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return i2.a(key, value);
                        }
                    }, 6, (Object) null);
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.i2$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i2.a(linkedHashMap);
                }
            }, 7, (Object) null);
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
            mutablePreferences.set(PreferencesKeys.stringKey(DataStoreKey.PUSH_ID_MAP.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.i2$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i2.c();
                }
            }, 7, (Object) null);
            return mutablePreferences;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, new Function0() { // from class: com.braze.storage.i2$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i2.d();
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    public static final String a() {
        return "Starting migration for key: " + DataStoreKey.PUSH_ID_MAP.getKey();
    }

    public static final String a(String str, Object obj) {
        return "Migrating push id: " + str + " with timestamp: " + obj;
    }

    public static final String a(Map map) {
        return "Migrated " + map.size() + " push identifiers to DataStore";
    }
}
