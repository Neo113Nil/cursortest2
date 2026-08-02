package com.braze.storage;

import androidx.datastore.core.DataStore;
import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import com.braze.enums.DataStoreKey;
import com.braze.models.FeatureFlag;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import okhttp3.HttpUrl;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tR2\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\r0\u000b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"com/braze/storage/FeatureFlagsDataStoreProvider$Companion", "", "<init>", "()V", "Landroidx/datastore/migrations/SharedPreferencesView;", "sharedPrefs", "Landroidx/datastore/preferences/core/Preferences;", "currentData", "migrateFeatureFlagStorageToJson", "(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", "migrateFeatureFlagImpressionMapToJson", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Landroidx/datastore/core/DataStore;", "featureFlagsDataStores", "Ljava/util/concurrent/ConcurrentHashMap;", "getFeatureFlagsDataStores$android_sdk_base_release", "()Ljava/util/concurrent/ConcurrentHashMap;", "getFeatureFlagsDataStores$android_sdk_base_release$annotations", "FEATURE_FLAGS_DATA_STORE_STORAGE", "Ljava/lang/String;", "FEATURE_FLAGS_ELIGIBILITY_SHARED_PREFS", "FEATURE_FLAGS_STORAGE_SHARED_PREFS", "FEATURE_FLAGS_IMPRESSION_LOGGED_SHARED_PREFS", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FeatureFlagsDataStoreProvider$Companion {
    public /* synthetic */ FeatureFlagsDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getFeatureFlagsDataStores$android_sdk_base_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagImpressionMapToJson$lambda$10() {
        return "Starting migration for key: " + DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagImpressionMapToJson$lambda$12$lambda$11(Object obj, String str) {
        return "Added impression:" + obj + " for feature flag:" + str + " from SharedPreferences";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagImpressionMapToJson$lambda$14$lambda$13() {
        return "Migration for Feature Flags impression map completed successfully";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagImpressionMapToJson$lambda$15() {
        return "Failed to migrate Feature Flags impression map to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagStorageToJson$lambda$0() {
        return "Starting migration for key: " + DataStoreKey.FEATURE_FLAGS.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagStorageToJson$lambda$2$lambda$1(String str) {
        return "Added feature flag from SharedPreferences key: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagStorageToJson$lambda$6$lambda$4(FeatureFlag featureFlag) {
        String str;
        if (featureFlag != null) {
            str = "Successfully decoded feature flag: " + featureFlag.getId();
        } else {
            str = null;
        }
        return String.valueOf(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagStorageToJson$lambda$6$lambda$5(String str) {
        return "Failed to parse FeatureFlag from JSON: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagStorageToJson$lambda$8$lambda$7() {
        return "Migration for feature flags completed successfully";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagStorageToJson$lambda$9() {
        return "Failed to migrate feature flags storage to DataStore.";
    }

    public final ConcurrentHashMap<String, DataStore<Preferences>> getFeatureFlagsDataStores$android_sdk_base_release() {
        return z1.e;
    }

    public final Preferences migrateFeatureFlagImpressionMapToJson(SharedPreferencesView sharedPrefs, Preferences currentData) {
        String str;
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.FeatureFlagsDataStoreProvider$Companion$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String migrateFeatureFlagImpressionMapToJson$lambda$10;
                migrateFeatureFlagImpressionMapToJson$lambda$10 = FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagImpressionMapToJson$lambda$10();
                return migrateFeatureFlagImpressionMapToJson$lambda$10;
            }
        }, 7, (Object) null);
        if (currentData.contains(PreferencesKeys.stringKey(DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP.getKey()))) {
            return currentData;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : sharedPrefs.getAll().entrySet()) {
                final String key = entry.getKey();
                final Object value = entry.getValue();
                if (value instanceof Boolean) {
                    linkedHashMap.put(key, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) z1.d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.FeatureFlagsDataStoreProvider$Companion$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String migrateFeatureFlagImpressionMapToJson$lambda$12$lambda$11;
                            migrateFeatureFlagImpressionMapToJson$lambda$12$lambda$11 = FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagImpressionMapToJson$lambda$12$lambda$11(value, key);
                            return migrateFeatureFlagImpressionMapToJson$lambda$12$lambda$11;
                        }
                    }, 7, (Object) null);
                }
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Companion companion = Json.INSTANCE;
                companion.getSerializersModule();
                str = companion.encodeToString(new LinkedHashMapSerializer(StringSerializer.INSTANCE, BooleanSerializer.INSTANCE), linkedHashMap);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                str = "{}";
            }
            MutablePreferences mutablePreferences = currentData.toMutablePreferences();
            mutablePreferences.set(PreferencesKeys.stringKey(DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.FeatureFlagsDataStoreProvider$Companion$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateFeatureFlagImpressionMapToJson$lambda$14$lambda$13;
                    migrateFeatureFlagImpressionMapToJson$lambda$14$lambda$13 = FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagImpressionMapToJson$lambda$14$lambda$13();
                    return migrateFeatureFlagImpressionMapToJson$lambda$14$lambda$13;
                }
            }, 7, (Object) null);
            return mutablePreferences;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, new Function0() { // from class: com.braze.storage.FeatureFlagsDataStoreProvider$Companion$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateFeatureFlagImpressionMapToJson$lambda$15;
                    migrateFeatureFlagImpressionMapToJson$lambda$15 = FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagImpressionMapToJson$lambda$15();
                    return migrateFeatureFlagImpressionMapToJson$lambda$15;
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    public final Preferences migrateFeatureFlagStorageToJson(SharedPreferencesView sharedPrefs, Preferences currentData) {
        String str;
        final FeatureFlag featureFlag;
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.FeatureFlagsDataStoreProvider$Companion$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String migrateFeatureFlagStorageToJson$lambda$0;
                migrateFeatureFlagStorageToJson$lambda$0 = FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagStorageToJson$lambda$0();
                return migrateFeatureFlagStorageToJson$lambda$0;
            }
        }, 7, (Object) null);
        if (currentData.contains(PreferencesKeys.stringKey(DataStoreKey.FEATURE_FLAGS.getKey()))) {
            return currentData;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, Object> entry : sharedPrefs.getAll().entrySet()) {
                final String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    arrayList.add(value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) z1.d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.FeatureFlagsDataStoreProvider$Companion$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String migrateFeatureFlagStorageToJson$lambda$2$lambda$1;
                            migrateFeatureFlagStorageToJson$lambda$2$lambda$1 = FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagStorageToJson$lambda$2$lambda$1(key);
                            return migrateFeatureFlagStorageToJson$lambda$2$lambda$1;
                        }
                    }, 7, (Object) null);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                final String str2 = (String) it.next();
                try {
                    featureFlag = com.braze.support.n.f786a.a(new JSONObject(str2));
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) z1.d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.FeatureFlagsDataStoreProvider$Companion$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String migrateFeatureFlagStorageToJson$lambda$6$lambda$4;
                            migrateFeatureFlagStorageToJson$lambda$6$lambda$4 = FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagStorageToJson$lambda$6$lambda$4(FeatureFlag.this);
                            return migrateFeatureFlagStorageToJson$lambda$6$lambda$4;
                        }
                    }, 7, (Object) null);
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) z1.d, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.FeatureFlagsDataStoreProvider$Companion$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String migrateFeatureFlagStorageToJson$lambda$6$lambda$5;
                            migrateFeatureFlagStorageToJson$lambda$6$lambda$5 = FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagStorageToJson$lambda$6$lambda$5(str2);
                            return migrateFeatureFlagStorageToJson$lambda$6$lambda$5;
                        }
                    }, 4, (Object) null);
                    featureFlag = null;
                }
                if (featureFlag != null) {
                    arrayList2.add(featureFlag);
                }
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Companion companion = Json.INSTANCE;
                companion.getSerializersModule();
                str = companion.encodeToString(new ArrayListSerializer(FeatureFlag.Companion.serializer()), arrayList2);
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                str = arrayList2 instanceof Map ? "{}" : HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            }
            MutablePreferences mutablePreferences = currentData.toMutablePreferences();
            mutablePreferences.set(PreferencesKeys.stringKey(DataStoreKey.FEATURE_FLAGS.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.FeatureFlagsDataStoreProvider$Companion$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateFeatureFlagStorageToJson$lambda$8$lambda$7;
                    migrateFeatureFlagStorageToJson$lambda$8$lambda$7 = FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagStorageToJson$lambda$8$lambda$7();
                    return migrateFeatureFlagStorageToJson$lambda$8$lambda$7;
                }
            }, 7, (Object) null);
            return mutablePreferences;
        } catch (Exception e3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e3, false, new Function0() { // from class: com.braze.storage.FeatureFlagsDataStoreProvider$Companion$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateFeatureFlagStorageToJson$lambda$9;
                    migrateFeatureFlagStorageToJson$lambda$9 = FeatureFlagsDataStoreProvider$Companion.migrateFeatureFlagStorageToJson$lambda$9();
                    return migrateFeatureFlagStorageToJson$lambda$9;
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    private FeatureFlagsDataStoreProvider$Companion() {
    }
}
