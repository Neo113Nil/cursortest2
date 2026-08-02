package com.braze.storage;

import androidx.datastore.core.DataStore;
import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tR2\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\r0\u000b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"com/braze/storage/TriggerDataStoreProvider$Companion", "", "<init>", "()V", "Landroidx/datastore/migrations/SharedPreferencesView;", "sharedPrefs", "Landroidx/datastore/preferences/core/Preferences;", "currentData", "migrateTriggersStorageToJson", "(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", "migrateTriggersReeligibilityToJson", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Landroidx/datastore/core/DataStore;", "triggersDataStores", "Ljava/util/concurrent/ConcurrentHashMap;", "getTriggersDataStores$android_sdk_base_release", "()Ljava/util/concurrent/ConcurrentHashMap;", "getTriggersDataStores$android_sdk_base_release$annotations", "TRIGGERS_DATA_STORE_STORAGE", "Ljava/lang/String;", "TRIGGERS_STORAGE_SHARED_PREFS", "TRIGGERS_REELIGIBILITY_SHARED_PREFS", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TriggerDataStoreProvider$Companion {
    public /* synthetic */ TriggerDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getTriggersDataStores$android_sdk_base_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersReeligibilityToJson$lambda$11$lambda$10(String str) {
        return "Added timestamp for trigger:" + str + " from SharedPreferences";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersReeligibilityToJson$lambda$13$lambda$12() {
        return "Migration for " + DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP.getKey() + " completed successfully";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersReeligibilityToJson$lambda$14() {
        return "Failed to migrate triggers reeligibility map to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersReeligibilityToJson$lambda$8() {
        return "Starting migration for key: " + DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersReeligibilityToJson$lambda$9() {
        return "Migration already completed for triggered actions impression maps. Skipping.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$0() {
        return "Starting migration for key: " + DataStoreKey.TRIGGERED_ACTIONS.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$1() {
        return "Migration already completed for triggered actions. Skipping.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$4$lambda$2(String str) {
        return "Added triggered action from SharedPreferences key: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$4$lambda$3(String str, Object obj) {
        return "Triggered action with key:" + str + " and value:" + obj + " from SharedPreferences has an invalid value and will not be migrated to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$6$lambda$5(List list) {
        return "Migration for triggered actions completed successfully. Migrated " + list.size() + " actions.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$7() {
        return "Failed to migrate triggered actions to DataStore.";
    }

    public final ConcurrentHashMap<String, DataStore<Preferences>> getTriggersDataStores$android_sdk_base_release() {
        return m3.e;
    }

    public final Preferences migrateTriggersReeligibilityToJson(SharedPreferencesView sharedPrefs, Preferences currentData) {
        String str;
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String migrateTriggersReeligibilityToJson$lambda$8;
                migrateTriggersReeligibilityToJson$lambda$8 = TriggerDataStoreProvider$Companion.migrateTriggersReeligibilityToJson$lambda$8();
                return migrateTriggersReeligibilityToJson$lambda$8;
            }
        }, 7, (Object) null);
        if (currentData.contains(PreferencesKeys.stringKey(DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP.getKey()))) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateTriggersReeligibilityToJson$lambda$9;
                    migrateTriggersReeligibilityToJson$lambda$9 = TriggerDataStoreProvider$Companion.migrateTriggersReeligibilityToJson$lambda$9();
                    return migrateTriggersReeligibilityToJson$lambda$9;
                }
            }, 7, (Object) null);
            return currentData;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : sharedPrefs.getAll().entrySet()) {
                final String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Long) {
                    linkedHashMap.put(key, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) m3.d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String migrateTriggersReeligibilityToJson$lambda$11$lambda$10;
                            migrateTriggersReeligibilityToJson$lambda$11$lambda$10 = TriggerDataStoreProvider$Companion.migrateTriggersReeligibilityToJson$lambda$11$lambda$10(key);
                            return migrateTriggersReeligibilityToJson$lambda$11$lambda$10;
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
            mutablePreferences.set(PreferencesKeys.stringKey(DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateTriggersReeligibilityToJson$lambda$13$lambda$12;
                    migrateTriggersReeligibilityToJson$lambda$13$lambda$12 = TriggerDataStoreProvider$Companion.migrateTriggersReeligibilityToJson$lambda$13$lambda$12();
                    return migrateTriggersReeligibilityToJson$lambda$13$lambda$12;
                }
            }, 7, (Object) null);
            return mutablePreferences;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, new Function0() { // from class: com.braze.storage.TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateTriggersReeligibilityToJson$lambda$14;
                    migrateTriggersReeligibilityToJson$lambda$14 = TriggerDataStoreProvider$Companion.migrateTriggersReeligibilityToJson$lambda$14();
                    return migrateTriggersReeligibilityToJson$lambda$14;
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    public final Preferences migrateTriggersStorageToJson(SharedPreferencesView sharedPrefs, Preferences currentData) {
        String str;
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String migrateTriggersStorageToJson$lambda$0;
                migrateTriggersStorageToJson$lambda$0 = TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$0();
                return migrateTriggersStorageToJson$lambda$0;
            }
        }, 7, (Object) null);
        if (currentData.contains(PreferencesKeys.stringKey(DataStoreKey.TRIGGERED_ACTIONS.getKey()))) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateTriggersStorageToJson$lambda$1;
                    migrateTriggersStorageToJson$lambda$1 = TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$1();
                    return migrateTriggersStorageToJson$lambda$1;
                }
            }, 7, (Object) null);
            return currentData;
        }
        try {
            final ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, Object> entry : sharedPrefs.getAll().entrySet()) {
                final String key = entry.getKey();
                final Object value = entry.getValue();
                if (!(value instanceof String) || StringsKt.isBlank((CharSequence) value)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) m3.d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String migrateTriggersStorageToJson$lambda$4$lambda$3;
                            migrateTriggersStorageToJson$lambda$4$lambda$3 = TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$4$lambda$3(key, value);
                            return migrateTriggersStorageToJson$lambda$4$lambda$3;
                        }
                    }, 7, (Object) null);
                } else {
                    arrayList.add(value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) m3.d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String migrateTriggersStorageToJson$lambda$4$lambda$2;
                            migrateTriggersStorageToJson$lambda$4$lambda$2 = TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$4$lambda$2(key);
                            return migrateTriggersStorageToJson$lambda$4$lambda$2;
                        }
                    }, 7, (Object) null);
                }
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Companion companion = Json.INSTANCE;
                companion.getSerializersModule();
                str = companion.encodeToString(new ArrayListSerializer(StringSerializer.INSTANCE), arrayList);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                str = arrayList instanceof Map ? "{}" : HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            }
            MutablePreferences mutablePreferences = currentData.toMutablePreferences();
            mutablePreferences.set(PreferencesKeys.stringKey(DataStoreKey.TRIGGERED_ACTIONS.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateTriggersStorageToJson$lambda$6$lambda$5;
                    migrateTriggersStorageToJson$lambda$6$lambda$5 = TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$6$lambda$5(arrayList);
                    return migrateTriggersStorageToJson$lambda$6$lambda$5;
                }
            }, 7, (Object) null);
            return mutablePreferences;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, new Function0() { // from class: com.braze.storage.TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateTriggersStorageToJson$lambda$7;
                    migrateTriggersStorageToJson$lambda$7 = TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$7();
                    return migrateTriggersStorageToJson$lambda$7;
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    private TriggerDataStoreProvider$Companion() {
    }
}
