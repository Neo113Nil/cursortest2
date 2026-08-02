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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tR2\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\r0\u000b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"com/braze/storage/BannersDataStoreProvider$Companion", "", "<init>", "()V", "Landroidx/datastore/migrations/SharedPreferencesView;", "sharedPrefs", "Landroidx/datastore/preferences/core/Preferences;", "currentData", "migrateBannerStorageToJson", "(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", "migrateBannerImpressionMapToJson", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Landroidx/datastore/core/DataStore;", "bannersDataStores", "Ljava/util/concurrent/ConcurrentHashMap;", "getBannersDataStores$android_sdk_base_release", "()Ljava/util/concurrent/ConcurrentHashMap;", "getBannersDataStores$android_sdk_base_release$annotations", "BANNERS_DATA_STORE_STORAGE", "Ljava/lang/String;", "BANNERS_STORAGE_SHARED_PREFS", "BANNERS_ELIGIBILITY_SHARED_PREFS", "BANNERS_IMPRESSION_LOGGED_SHARED_PREFS", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BannersDataStoreProvider$Companion {
    public /* synthetic */ BannersDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getBannersDataStores$android_sdk_base_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerImpressionMapToJson$lambda$11$lambda$10() {
        return "Migration for Banners impression map completed successfully.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerImpressionMapToJson$lambda$12() {
        return "Failed to migrate banner impression map to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerImpressionMapToJson$lambda$7() {
        return "Starting migration for key: " + DataStoreKey.BANNERS_IMPRESSION_MAP.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerImpressionMapToJson$lambda$9$lambda$8(Object obj, String str) {
        return "Added impression:" + obj + " for banner:" + str + " from SharedPreferences";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerStorageToJson$lambda$0() {
        return "Starting migration for key: " + DataStoreKey.BANNERS.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerStorageToJson$lambda$3$lambda$1(String str) {
        return "Added banner from SharedPreferences key: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerStorageToJson$lambda$3$lambda$2(Object obj) {
        return "Banner value from SharedPreferences: " + obj + " is not a String and will not be migrated to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerStorageToJson$lambda$5$lambda$4(List list) {
        return "Migration for banners completed successfully. Migrated " + list.size() + " banners.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerStorageToJson$lambda$6() {
        return "Failed to migrate banner storage to DataStore.";
    }

    public final ConcurrentHashMap<String, DataStore<Preferences>> getBannersDataStores$android_sdk_base_release() {
        return e.e;
    }

    public final Preferences migrateBannerImpressionMapToJson(SharedPreferencesView sharedPrefs, Preferences currentData) {
        String str;
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.BannersDataStoreProvider$Companion$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String migrateBannerImpressionMapToJson$lambda$7;
                migrateBannerImpressionMapToJson$lambda$7 = BannersDataStoreProvider$Companion.migrateBannerImpressionMapToJson$lambda$7();
                return migrateBannerImpressionMapToJson$lambda$7;
            }
        }, 7, (Object) null);
        if (currentData.contains(PreferencesKeys.stringKey(DataStoreKey.BANNERS_IMPRESSION_MAP.getKey()))) {
            return currentData;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : sharedPrefs.getAll().entrySet()) {
                final String key = entry.getKey();
                final Object value = entry.getValue();
                if (value instanceof Boolean) {
                    linkedHashMap.put(key, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) e.d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.BannersDataStoreProvider$Companion$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String migrateBannerImpressionMapToJson$lambda$9$lambda$8;
                            migrateBannerImpressionMapToJson$lambda$9$lambda$8 = BannersDataStoreProvider$Companion.migrateBannerImpressionMapToJson$lambda$9$lambda$8(value, key);
                            return migrateBannerImpressionMapToJson$lambda$9$lambda$8;
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
            mutablePreferences.set(PreferencesKeys.stringKey(DataStoreKey.BANNERS_IMPRESSION_MAP.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.BannersDataStoreProvider$Companion$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateBannerImpressionMapToJson$lambda$11$lambda$10;
                    migrateBannerImpressionMapToJson$lambda$11$lambda$10 = BannersDataStoreProvider$Companion.migrateBannerImpressionMapToJson$lambda$11$lambda$10();
                    return migrateBannerImpressionMapToJson$lambda$11$lambda$10;
                }
            }, 7, (Object) null);
            return mutablePreferences;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, new Function0() { // from class: com.braze.storage.BannersDataStoreProvider$Companion$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateBannerImpressionMapToJson$lambda$12;
                    migrateBannerImpressionMapToJson$lambda$12 = BannersDataStoreProvider$Companion.migrateBannerImpressionMapToJson$lambda$12();
                    return migrateBannerImpressionMapToJson$lambda$12;
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    public final Preferences migrateBannerStorageToJson(SharedPreferencesView sharedPrefs, Preferences currentData) {
        String str;
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.BannersDataStoreProvider$Companion$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String migrateBannerStorageToJson$lambda$0;
                migrateBannerStorageToJson$lambda$0 = BannersDataStoreProvider$Companion.migrateBannerStorageToJson$lambda$0();
                return migrateBannerStorageToJson$lambda$0;
            }
        }, 7, (Object) null);
        if (currentData.contains(PreferencesKeys.stringKey(DataStoreKey.BANNERS.getKey()))) {
            return currentData;
        }
        try {
            final ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, Object> entry : sharedPrefs.getAll().entrySet()) {
                final String key = entry.getKey();
                final Object value = entry.getValue();
                if (value instanceof String) {
                    arrayList.add(value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) e.d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.BannersDataStoreProvider$Companion$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String migrateBannerStorageToJson$lambda$3$lambda$1;
                            migrateBannerStorageToJson$lambda$3$lambda$1 = BannersDataStoreProvider$Companion.migrateBannerStorageToJson$lambda$3$lambda$1(key);
                            return migrateBannerStorageToJson$lambda$3$lambda$1;
                        }
                    }, 7, (Object) null);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) e.d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.BannersDataStoreProvider$Companion$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String migrateBannerStorageToJson$lambda$3$lambda$2;
                            migrateBannerStorageToJson$lambda$3$lambda$2 = BannersDataStoreProvider$Companion.migrateBannerStorageToJson$lambda$3$lambda$2(value);
                            return migrateBannerStorageToJson$lambda$3$lambda$2;
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
            mutablePreferences.set(PreferencesKeys.stringKey(DataStoreKey.BANNERS.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.BannersDataStoreProvider$Companion$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateBannerStorageToJson$lambda$5$lambda$4;
                    migrateBannerStorageToJson$lambda$5$lambda$4 = BannersDataStoreProvider$Companion.migrateBannerStorageToJson$lambda$5$lambda$4(arrayList);
                    return migrateBannerStorageToJson$lambda$5$lambda$4;
                }
            }, 7, (Object) null);
            return mutablePreferences;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, new Function0() { // from class: com.braze.storage.BannersDataStoreProvider$Companion$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateBannerStorageToJson$lambda$6;
                    migrateBannerStorageToJson$lambda$6 = BannersDataStoreProvider$Companion.migrateBannerStorageToJson$lambda$6();
                    return migrateBannerStorageToJson$lambda$6;
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    private BannersDataStoreProvider$Companion() {
    }
}
