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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

/* loaded from: classes6.dex */
public final class l1 {
    public static final String b() {
        return "Failed to migrate event storage to DataStore.";
    }

    public final Preferences a(SharedPreferencesView sharedPrefs, Preferences currentData) {
        String str;
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.l1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l1.a();
            }
        }, 7, (Object) null);
        if (currentData.contains(PreferencesKeys.stringKey(DataStoreKey.EVENT_STORAGE_MAP.getKey()))) {
            return currentData;
        }
        try {
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : sharedPrefs.getAll().entrySet()) {
                final String key = entry.getKey();
                final Object value = entry.getValue();
                if (value instanceof String) {
                    linkedHashMap.put(key, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) n1.b, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.l1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return l1.a(key);
                        }
                    }, 7, (Object) null);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) n1.b, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.l1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return l1.a(value);
                        }
                    }, 7, (Object) null);
                }
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Companion companion = Json.INSTANCE;
                companion.getSerializersModule();
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                str = companion.encodeToString(new LinkedHashMapSerializer(stringSerializer, stringSerializer), linkedHashMap);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                str = "{}";
            }
            MutablePreferences mutablePreferences = currentData.toMutablePreferences();
            mutablePreferences.set(PreferencesKeys.stringKey(DataStoreKey.EVENT_STORAGE_MAP.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.l1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l1.a(linkedHashMap);
                }
            }, 7, (Object) null);
            return mutablePreferences;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, new Function0() { // from class: com.braze.storage.l1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l1.b();
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    public static final String a() {
        return "Starting migration for key: " + DataStoreKey.EVENT_STORAGE_MAP.getKey();
    }

    public static final String a(String str) {
        return "Added event from SharedPreferences key: " + str;
    }

    public static final String a(Object obj) {
        return "Event value from SharedPreferences: " + obj + " is not a String and will not be migrated to DataStore.";
    }

    public static final String a(Map map) {
        return "Migration for events completed successfully. Migrated " + map.size() + " events.";
    }
}
