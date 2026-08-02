package com.braze.storage;

import androidx.datastore.core.DataStore;
import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR2\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\f0\n8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"com/braze/storage/PushMaxDataStoreProvider$Companion", "", "<init>", "()V", "Landroidx/datastore/migrations/SharedPreferencesView;", "sharedPrefs", "Landroidx/datastore/preferences/core/Preferences;", "currentData", "migratePushMaxStorageToJson", "(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Landroidx/datastore/core/DataStore;", "pushMaxDataStores", "Ljava/util/concurrent/ConcurrentHashMap;", "getPushMaxDataStores$android_sdk_base_release", "()Ljava/util/concurrent/ConcurrentHashMap;", "getPushMaxDataStores$android_sdk_base_release$annotations", "PUSH_MAX_DATA_STORE_STORAGE", "Ljava/lang/String;", "PUSH_MAX_STORAGE_SHARED_PREFS", "PUSH_MAX_METADATA_SHARED_PREFS", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PushMaxDataStoreProvider$Companion {
    public /* synthetic */ PushMaxDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getPushMaxDataStores$android_sdk_base_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migratePushMaxStorageToJson$lambda$0() {
        return "Starting migration for key: " + DataStoreKey.PUSH_MAX_CAMPAIGNS.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migratePushMaxStorageToJson$lambda$3$lambda$1(String str, Object obj) {
        return "Added push max campaign from SharedPreferences key: " + str + " with timestamp: " + obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migratePushMaxStorageToJson$lambda$3$lambda$2(Object obj) {
        return "Push max campaign value from SharedPreferences: " + obj + " is not a Long and will not be migrated to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migratePushMaxStorageToJson$lambda$5$lambda$4(Map map) {
        return "Migration for push max campaigns completed successfully. Migrated " + map.size() + " campaigns.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migratePushMaxStorageToJson$lambda$6() {
        return "Failed to migrate push max storage to DataStore.";
    }

    public final ConcurrentHashMap<String, DataStore<Preferences>> getPushMaxDataStores$android_sdk_base_release() {
        return o2.e;
    }

    public final Preferences migratePushMaxStorageToJson(SharedPreferencesView sharedPrefs, Preferences currentData) {
        String str;
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.PushMaxDataStoreProvider$Companion$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String migratePushMaxStorageToJson$lambda$0;
                migratePushMaxStorageToJson$lambda$0 = PushMaxDataStoreProvider$Companion.migratePushMaxStorageToJson$lambda$0();
                return migratePushMaxStorageToJson$lambda$0;
            }
        }, 7, (Object) null);
        if (currentData.contains(PreferencesKeys.stringKey(DataStoreKey.PUSH_MAX_CAMPAIGNS.getKey()))) {
            return currentData;
        }
        try {
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : sharedPrefs.getAll().entrySet()) {
                final String key = entry.getKey();
                final Object value = entry.getValue();
                if (value instanceof Long) {
                    linkedHashMap.put(key, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) o2.d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.PushMaxDataStoreProvider$Companion$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String migratePushMaxStorageToJson$lambda$3$lambda$1;
                            migratePushMaxStorageToJson$lambda$3$lambda$1 = PushMaxDataStoreProvider$Companion.migratePushMaxStorageToJson$lambda$3$lambda$1(key, value);
                            return migratePushMaxStorageToJson$lambda$3$lambda$1;
                        }
                    }, 7, (Object) null);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) o2.d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.PushMaxDataStoreProvider$Companion$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String migratePushMaxStorageToJson$lambda$3$lambda$2;
                            migratePushMaxStorageToJson$lambda$3$lambda$2 = PushMaxDataStoreProvider$Companion.migratePushMaxStorageToJson$lambda$3$lambda$2(value);
                            return migratePushMaxStorageToJson$lambda$3$lambda$2;
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
            mutablePreferences.set(PreferencesKeys.stringKey(DataStoreKey.PUSH_MAX_CAMPAIGNS.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.PushMaxDataStoreProvider$Companion$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migratePushMaxStorageToJson$lambda$5$lambda$4;
                    migratePushMaxStorageToJson$lambda$5$lambda$4 = PushMaxDataStoreProvider$Companion.migratePushMaxStorageToJson$lambda$5$lambda$4(linkedHashMap);
                    return migratePushMaxStorageToJson$lambda$5$lambda$4;
                }
            }, 7, (Object) null);
            return mutablePreferences;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, new Function0() { // from class: com.braze.storage.PushMaxDataStoreProvider$Companion$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migratePushMaxStorageToJson$lambda$6;
                    migratePushMaxStorageToJson$lambda$6 = PushMaxDataStoreProvider$Companion.migratePushMaxStorageToJson$lambda$6();
                    return migratePushMaxStorageToJson$lambda$6;
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    private PushMaxDataStoreProvider$Companion() {
    }
}
