package com.braze.storage;

import androidx.datastore.core.DataStore;
import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
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

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR2\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\f0\n8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"com/braze/storage/SdkMetadataDataStoreProvider$Companion", "", "<init>", "()V", "Landroidx/datastore/migrations/SharedPreferencesView;", "sharedPrefs", "Landroidx/datastore/preferences/core/Preferences;", "currentData", "migrateMetadataToJson", "(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Landroidx/datastore/core/DataStore;", "metadataDataStores", "Ljava/util/concurrent/ConcurrentHashMap;", "getMetadataDataStores$android_sdk_base_release", "()Ljava/util/concurrent/ConcurrentHashMap;", "getMetadataDataStores$android_sdk_base_release$annotations", "METADATA_DATA_STORE_STORAGE", "Ljava/lang/String;", "METADATA_STORAGE_SHARED_PREFS", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SdkMetadataDataStoreProvider$Companion {
    public /* synthetic */ SdkMetadataDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getMetadataDataStores$android_sdk_base_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateMetadataToJson$lambda$0() {
        return "Starting migration for key: " + DataStoreKey.SDK_METADATA.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateMetadataToJson$lambda$1() {
        return "Key: " + DataStoreKey.SDK_METADATA.getKey() + " already exists in DataStore. Not performing migration.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateMetadataToJson$lambda$2(Set set) {
        return "Found " + set.size() + " metadata tags to migrate";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateMetadataToJson$lambda$4$lambda$3(List list) {
        return "Migration for SDK metadata completed successfully. Migrated " + list.size() + " tags.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateMetadataToJson$lambda$5() {
        return "Failed to migrate SDK metadata to DataStore.";
    }

    public final ConcurrentHashMap<String, DataStore<Preferences>> getMetadataDataStores$android_sdk_base_release() {
        return y2.e;
    }

    public final Preferences migrateMetadataToJson(SharedPreferencesView sharedPrefs, Preferences currentData) {
        String str;
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.SdkMetadataDataStoreProvider$Companion$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String migrateMetadataToJson$lambda$0;
                migrateMetadataToJson$lambda$0 = SdkMetadataDataStoreProvider$Companion.migrateMetadataToJson$lambda$0();
                return migrateMetadataToJson$lambda$0;
            }
        }, 7, (Object) null);
        if (currentData.contains(PreferencesKeys.stringKey(DataStoreKey.SDK_METADATA.getKey()))) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.SdkMetadataDataStoreProvider$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateMetadataToJson$lambda$1;
                    migrateMetadataToJson$lambda$1 = SdkMetadataDataStoreProvider$Companion.migrateMetadataToJson$lambda$1();
                    return migrateMetadataToJson$lambda$1;
                }
            }, 7, (Object) null);
            return currentData;
        }
        try {
            final Set<String> stringSet = sharedPrefs.getStringSet("tags", SetsKt.emptySet());
            if (stringSet == null) {
                stringSet = SetsKt.emptySet();
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.SdkMetadataDataStoreProvider$Companion$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateMetadataToJson$lambda$2;
                    migrateMetadataToJson$lambda$2 = SdkMetadataDataStoreProvider$Companion.migrateMetadataToJson$lambda$2(stringSet);
                    return migrateMetadataToJson$lambda$2;
                }
            }, 7, (Object) null);
            final List list = CollectionsKt.toList(stringSet);
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Companion companion = Json.INSTANCE;
                companion.getSerializersModule();
                str = companion.encodeToString(new ArrayListSerializer(StringSerializer.INSTANCE), list);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                str = (!(list instanceof Map) && (list instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
            }
            MutablePreferences mutablePreferences = currentData.toMutablePreferences();
            mutablePreferences.set(PreferencesKeys.stringKey(DataStoreKey.SDK_METADATA.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.SdkMetadataDataStoreProvider$Companion$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateMetadataToJson$lambda$4$lambda$3;
                    migrateMetadataToJson$lambda$4$lambda$3 = SdkMetadataDataStoreProvider$Companion.migrateMetadataToJson$lambda$4$lambda$3(list);
                    return migrateMetadataToJson$lambda$4$lambda$3;
                }
            }, 7, (Object) null);
            return mutablePreferences;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, new Function0() { // from class: com.braze.storage.SdkMetadataDataStoreProvider$Companion$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateMetadataToJson$lambda$5;
                    migrateMetadataToJson$lambda$5 = SdkMetadataDataStoreProvider$Companion.migrateMetadataToJson$lambda$5();
                    return migrateMetadataToJson$lambda$5;
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    private SdkMetadataDataStoreProvider$Companion() {
    }
}
