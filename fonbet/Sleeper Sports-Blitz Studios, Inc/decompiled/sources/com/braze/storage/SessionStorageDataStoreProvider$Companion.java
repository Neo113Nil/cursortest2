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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR,\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\f0\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"com/braze/storage/SessionStorageDataStoreProvider$Companion", "", "<init>", "()V", "Landroidx/datastore/migrations/SharedPreferencesView;", "sharedPrefs", "Landroidx/datastore/preferences/core/Preferences;", "currentData", "migrateSealedSessionsMapToJson", "(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Landroidx/datastore/core/DataStore;", "sessionStorageDataStores", "Ljava/util/concurrent/ConcurrentHashMap;", "getSessionStorageDataStores$android_sdk_base_release", "()Ljava/util/concurrent/ConcurrentHashMap;", "SESSION_STORAGE", "Ljava/lang/String;", "SESSION_STORAGE_SHAREDPREFS_NAME", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SessionStorageDataStoreProvider$Companion {
    public /* synthetic */ SessionStorageDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateSealedSessionsMapToJson$lambda$0() {
        return "Starting migration for key: " + DataStoreKey.SESSION_STORAGE_MAP.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateSealedSessionsMapToJson$lambda$2$lambda$1(String str) {
        return "Migrated sealed session with key: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateSealedSessionsMapToJson$lambda$4$lambda$3(Map map) {
        return "Migration for sealed sessions completed. Migrated " + map.size() + " sessions.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateSealedSessionsMapToJson$lambda$5() {
        return "Failed to migrate sealed sessions map to DataStore.";
    }

    public final ConcurrentHashMap<String, DataStore<Preferences>> getSessionStorageDataStores$android_sdk_base_release() {
        return d3.e;
    }

    public final Preferences migrateSealedSessionsMapToJson(SharedPreferencesView sharedPrefs, Preferences currentData) {
        String str;
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.SessionStorageDataStoreProvider$Companion$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String migrateSealedSessionsMapToJson$lambda$0;
                migrateSealedSessionsMapToJson$lambda$0 = SessionStorageDataStoreProvider$Companion.migrateSealedSessionsMapToJson$lambda$0();
                return migrateSealedSessionsMapToJson$lambda$0;
            }
        }, 7, (Object) null);
        if (currentData.contains(PreferencesKeys.stringKey(DataStoreKey.SESSION_STORAGE_MAP.getKey()))) {
            return currentData;
        }
        try {
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : sharedPrefs.getAll().entrySet()) {
                final String key = entry.getKey();
                Object value = entry.getValue();
                if (!Intrinsics.areEqual(key, DataStoreKey.CURRENT_OPEN_SESSION_ID.getKey()) && (value instanceof String)) {
                    linkedHashMap.put(key, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d3.d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.SessionStorageDataStoreProvider$Companion$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String migrateSealedSessionsMapToJson$lambda$2$lambda$1;
                            migrateSealedSessionsMapToJson$lambda$2$lambda$1 = SessionStorageDataStoreProvider$Companion.migrateSealedSessionsMapToJson$lambda$2$lambda$1(key);
                            return migrateSealedSessionsMapToJson$lambda$2$lambda$1;
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
            mutablePreferences.set(PreferencesKeys.stringKey(DataStoreKey.SESSION_STORAGE_MAP.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.SessionStorageDataStoreProvider$Companion$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateSealedSessionsMapToJson$lambda$4$lambda$3;
                    migrateSealedSessionsMapToJson$lambda$4$lambda$3 = SessionStorageDataStoreProvider$Companion.migrateSealedSessionsMapToJson$lambda$4$lambda$3(linkedHashMap);
                    return migrateSealedSessionsMapToJson$lambda$4$lambda$3;
                }
            }, 7, (Object) null);
            return mutablePreferences;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, new Function0() { // from class: com.braze.storage.SessionStorageDataStoreProvider$Companion$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateSealedSessionsMapToJson$lambda$5;
                    migrateSealedSessionsMapToJson$lambda$5 = SessionStorageDataStoreProvider$Companion.migrateSealedSessionsMapToJson$lambda$5();
                    return migrateSealedSessionsMapToJson$lambda$5;
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    private SessionStorageDataStoreProvider$Companion() {
    }
}
