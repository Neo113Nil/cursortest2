package com.braze.storage;

import androidx.datastore.core.DataStore;
import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import com.braze.Constants;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tR2\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\r0\u000b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"com/braze/storage/ContentCardsDataStoreProvider$Companion", "", "<init>", "()V", "Landroidx/datastore/migrations/SharedPreferencesView;", "sharedPrefs", "Landroidx/datastore/preferences/core/Preferences;", "currentData", "migrateContentCardsStorageToJson", "(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", "migrateContentCardsMetadataToJson", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Landroidx/datastore/core/DataStore;", "contentCardsDataStores", "Ljava/util/concurrent/ConcurrentHashMap;", "getContentCardsDataStores$android_sdk_base_release", "()Ljava/util/concurrent/ConcurrentHashMap;", "getContentCardsDataStores$android_sdk_base_release$annotations", "CONTENT_CARDS_DATA_STORE_STORAGE", "Ljava/lang/String;", "CARD_CACHE_SHARED_PREFS", "METADATA_CACHE_SHARED_PREFS", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ContentCardsDataStoreProvider$Companion {
    public /* synthetic */ ContentCardsDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getContentCardsDataStores$android_sdk_base_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsMetadataToJson$lambda$7() {
        return "Starting migration for Content Cards metadata keys.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsMetadataToJson$lambda$8() {
        return "Metadata migration completed successfully";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsMetadataToJson$lambda$9() {
        return "Failed to migrate content cards metadata to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsStorageToJson$lambda$0() {
        return "Starting migration for key: " + DataStoreKey.CONTENT_CARDS.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsStorageToJson$lambda$3$lambda$1(String str) {
        return "Added content card from SharedPreferences key: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsStorageToJson$lambda$3$lambda$2(Object obj) {
        return "Content card value from SharedPreferences: " + obj + " is not a String and will not be migrated to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsStorageToJson$lambda$5$lambda$4(List list) {
        return "Migration for content cards completed successfully. Migrated " + list.size() + " cards.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsStorageToJson$lambda$6() {
        return "Failed to migrate content cards storage to DataStore.";
    }

    public final ConcurrentHashMap<String, DataStore<Preferences>> getContentCardsDataStores$android_sdk_base_release() {
        return m.e;
    }

    public final Preferences migrateContentCardsMetadataToJson(SharedPreferencesView sharedPrefs, Preferences currentData) {
        String str;
        String str2;
        String str3 = Constants.BRAZE_SDK_VERSION;
        String str4 = HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.ContentCardsDataStoreProvider$Companion$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String migrateContentCardsMetadataToJson$lambda$7;
                migrateContentCardsMetadataToJson$lambda$7 = ContentCardsDataStoreProvider$Companion.migrateContentCardsMetadataToJson$lambda$7();
                return migrateContentCardsMetadataToJson$lambda$7;
            }
        }, 7, (Object) null);
        DataStoreKey dataStoreKey = DataStoreKey.DISMISSED_CARDS;
        if (currentData.contains(PreferencesKeys.stringKey(dataStoreKey.getKey()))) {
            return currentData;
        }
        try {
            MutablePreferences mutablePreferences = currentData.toMutablePreferences();
            Set<String> stringSet = sharedPrefs.getStringSet(dataStoreKey.getKey(), SetsKt.emptySet());
            if (stringSet == null) {
                stringSet = SetsKt.emptySet();
            }
            List list = CollectionsKt.toList(stringSet);
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Companion companion = Json.INSTANCE;
                companion.getSerializersModule();
                str = companion.encodeToString(new ArrayListSerializer(StringSerializer.INSTANCE), list);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                str = (!(list instanceof Map) && (list instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
            }
            mutablePreferences.set(PreferencesKeys.stringKey(DataStoreKey.DISMISSED_CARDS.getKey()), str);
            Set<String> stringSet2 = sharedPrefs.getStringSet(DataStoreKey.EXPIRED_CARDS.getKey(), SetsKt.emptySet());
            if (stringSet2 == null) {
                stringSet2 = SetsKt.emptySet();
            }
            List list2 = CollectionsKt.toList(stringSet2);
            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
            try {
                Json.Companion companion2 = Json.INSTANCE;
                companion2.getSerializersModule();
                str2 = companion2.encodeToString(new ArrayListSerializer(StringSerializer.INSTANCE), list2);
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                str2 = (!(list2 instanceof Map) && (list2 instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
            }
            mutablePreferences.set(PreferencesKeys.stringKey(DataStoreKey.EXPIRED_CARDS.getKey()), str2);
            Set<String> stringSet3 = sharedPrefs.getStringSet(DataStoreKey.TEST_CARDS.getKey(), SetsKt.emptySet());
            if (stringSet3 == null) {
                stringSet3 = SetsKt.emptySet();
            }
            List list3 = CollectionsKt.toList(stringSet3);
            DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
            try {
                Json.Companion companion3 = Json.INSTANCE;
                companion3.getSerializersModule();
                str4 = companion3.encodeToString(new ArrayListSerializer(StringSerializer.INSTANCE), list3);
            } catch (Exception e3) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                if ((list3 instanceof Map) || !(list3 instanceof List)) {
                    str4 = "{}";
                }
            }
            mutablePreferences.set(PreferencesKeys.stringKey(DataStoreKey.TEST_CARDS.getKey()), str4);
            DataStoreKey dataStoreKey2 = DataStoreKey.LAST_CARD_UPDATED_AT;
            mutablePreferences.set(PreferencesKeys.longKey(dataStoreKey2.getKey()), Long.valueOf(sharedPrefs.getLong(dataStoreKey2.getKey(), 0L)));
            DataStoreKey dataStoreKey3 = DataStoreKey.LAST_FULL_CARD_SYNC_AT;
            mutablePreferences.set(PreferencesKeys.longKey(dataStoreKey3.getKey()), Long.valueOf(sharedPrefs.getLong(dataStoreKey3.getKey(), 0L)));
            DataStoreKey dataStoreKey4 = DataStoreKey.LAST_CARD_STORAGE_UPDATE_TIMESTAMP;
            mutablePreferences.set(PreferencesKeys.longKey(dataStoreKey4.getKey()), Long.valueOf(sharedPrefs.getLong(dataStoreKey4.getKey(), 0L)));
            DataStoreKey dataStoreKey5 = DataStoreKey.LAST_ACCESSED_SDK_VERSION;
            String string = sharedPrefs.getString(dataStoreKey5.getKey(), Constants.BRAZE_SDK_VERSION);
            if (string != null) {
                str3 = string;
            }
            mutablePreferences.set(PreferencesKeys.stringKey(dataStoreKey5.getKey()), str3);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.ContentCardsDataStoreProvider$Companion$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateContentCardsMetadataToJson$lambda$8;
                    migrateContentCardsMetadataToJson$lambda$8 = ContentCardsDataStoreProvider$Companion.migrateContentCardsMetadataToJson$lambda$8();
                    return migrateContentCardsMetadataToJson$lambda$8;
                }
            }, 7, (Object) null);
            return mutablePreferences;
        } catch (Exception e4) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e4, false, new Function0() { // from class: com.braze.storage.ContentCardsDataStoreProvider$Companion$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateContentCardsMetadataToJson$lambda$9;
                    migrateContentCardsMetadataToJson$lambda$9 = ContentCardsDataStoreProvider$Companion.migrateContentCardsMetadataToJson$lambda$9();
                    return migrateContentCardsMetadataToJson$lambda$9;
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    public final Preferences migrateContentCardsStorageToJson(SharedPreferencesView sharedPrefs, Preferences currentData) {
        String str;
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.ContentCardsDataStoreProvider$Companion$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String migrateContentCardsStorageToJson$lambda$0;
                migrateContentCardsStorageToJson$lambda$0 = ContentCardsDataStoreProvider$Companion.migrateContentCardsStorageToJson$lambda$0();
                return migrateContentCardsStorageToJson$lambda$0;
            }
        }, 7, (Object) null);
        if (currentData.contains(PreferencesKeys.stringKey(DataStoreKey.CONTENT_CARDS.getKey()))) {
            return currentData;
        }
        try {
            final ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, Object> entry : sharedPrefs.getAll().entrySet()) {
                final String key = entry.getKey();
                final Object value = entry.getValue();
                if (value instanceof String) {
                    arrayList.add(value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) m.d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.ContentCardsDataStoreProvider$Companion$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String migrateContentCardsStorageToJson$lambda$3$lambda$1;
                            migrateContentCardsStorageToJson$lambda$3$lambda$1 = ContentCardsDataStoreProvider$Companion.migrateContentCardsStorageToJson$lambda$3$lambda$1(key);
                            return migrateContentCardsStorageToJson$lambda$3$lambda$1;
                        }
                    }, 7, (Object) null);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) m.d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.ContentCardsDataStoreProvider$Companion$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String migrateContentCardsStorageToJson$lambda$3$lambda$2;
                            migrateContentCardsStorageToJson$lambda$3$lambda$2 = ContentCardsDataStoreProvider$Companion.migrateContentCardsStorageToJson$lambda$3$lambda$2(value);
                            return migrateContentCardsStorageToJson$lambda$3$lambda$2;
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
            mutablePreferences.set(PreferencesKeys.stringKey(DataStoreKey.CONTENT_CARDS.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.ContentCardsDataStoreProvider$Companion$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateContentCardsStorageToJson$lambda$5$lambda$4;
                    migrateContentCardsStorageToJson$lambda$5$lambda$4 = ContentCardsDataStoreProvider$Companion.migrateContentCardsStorageToJson$lambda$5$lambda$4(arrayList);
                    return migrateContentCardsStorageToJson$lambda$5$lambda$4;
                }
            }, 7, (Object) null);
            return mutablePreferences;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, new Function0() { // from class: com.braze.storage.ContentCardsDataStoreProvider$Companion$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateContentCardsStorageToJson$lambda$6;
                    migrateContentCardsStorageToJson$lambda$6 = ContentCardsDataStoreProvider$Companion.migrateContentCardsStorageToJson$lambda$6();
                    return migrateContentCardsStorageToJson$lambda$6;
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    private ContentCardsDataStoreProvider$Companion() {
    }
}
