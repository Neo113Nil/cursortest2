package com.braze.storage;

import androidx.datastore.core.DataStore;
import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR2\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\f0\n8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"com/braze/storage/EventDuplicationValidatorDataStoreProvider$Companion", "", "<init>", "()V", "Landroidx/datastore/migrations/SharedPreferencesView;", "sharedPrefs", "Landroidx/datastore/preferences/core/Preferences;", "currentData", "migrateEventDuplicationMap", "(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Landroidx/datastore/core/DataStore;", "eventDuplicationValidatorDataStores", "Ljava/util/concurrent/ConcurrentHashMap;", "getEventDuplicationValidatorDataStores$android_sdk_base_release", "()Ljava/util/concurrent/ConcurrentHashMap;", "getEventDuplicationValidatorDataStores$android_sdk_base_release$annotations", "EVENT_DUPLICATION_VALIDATION_STORAGE", "Ljava/lang/String;", "STORAGE_PREFIX", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EventDuplicationValidatorDataStoreProvider$Companion {
    public /* synthetic */ EventDuplicationValidatorDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getEventDuplicationValidatorDataStores$android_sdk_base_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateEventDuplicationMap$lambda$0() {
        return "Starting migration for key: " + DataStoreKey.EVENT_DUPLICATION_VALIDATION_STORAGE_MAP.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence migrateEventDuplicationMap$lambda$1(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "<destruct>");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Long");
        return str + ":" + ((Long) value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateEventDuplicationMap$lambda$3$lambda$2(SharedPreferencesView sharedPreferencesView) {
        return "Migration for event duplication map completed. Migrated " + sharedPreferencesView.getAll().size() + " events.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateEventDuplicationMap$lambda$4() {
        return "Failed to migrate event duplication map to DataStore.";
    }

    public final ConcurrentHashMap<String, DataStore<Preferences>> getEventDuplicationValidatorDataStores$android_sdk_base_release() {
        return u1.e;
    }

    public final Preferences migrateEventDuplicationMap(final SharedPreferencesView sharedPrefs, Preferences currentData) {
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.EventDuplicationValidatorDataStoreProvider$Companion$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String migrateEventDuplicationMap$lambda$0;
                migrateEventDuplicationMap$lambda$0 = EventDuplicationValidatorDataStoreProvider$Companion.migrateEventDuplicationMap$lambda$0();
                return migrateEventDuplicationMap$lambda$0;
            }
        }, 7, (Object) null);
        Preferences.Key<String> stringKey = PreferencesKeys.stringKey(DataStoreKey.EVENT_DUPLICATION_VALIDATION_STORAGE_MAP.getKey());
        if (currentData.contains(stringKey)) {
            return currentData;
        }
        try {
            String joinToString$default = CollectionsKt.joinToString$default(sharedPrefs.getAll().entrySet(), ",", null, null, 0, null, new Function1() { // from class: com.braze.storage.EventDuplicationValidatorDataStoreProvider$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    CharSequence migrateEventDuplicationMap$lambda$1;
                    migrateEventDuplicationMap$lambda$1 = EventDuplicationValidatorDataStoreProvider$Companion.migrateEventDuplicationMap$lambda$1((Map.Entry) obj);
                    return migrateEventDuplicationMap$lambda$1;
                }
            }, 30, null);
            MutablePreferences mutablePreferences = currentData.toMutablePreferences();
            mutablePreferences.set(stringKey, joinToString$default);
            BrazeLogger.brazelog$default(brazeLogger, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.EventDuplicationValidatorDataStoreProvider$Companion$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateEventDuplicationMap$lambda$3$lambda$2;
                    migrateEventDuplicationMap$lambda$3$lambda$2 = EventDuplicationValidatorDataStoreProvider$Companion.migrateEventDuplicationMap$lambda$3$lambda$2(SharedPreferencesView.this);
                    return migrateEventDuplicationMap$lambda$3$lambda$2;
                }
            }, 7, (Object) null);
            return mutablePreferences;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.EventDuplicationValidatorDataStoreProvider$Companion$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateEventDuplicationMap$lambda$4;
                    migrateEventDuplicationMap$lambda$4 = EventDuplicationValidatorDataStoreProvider$Companion.migrateEventDuplicationMap$lambda$4();
                    return migrateEventDuplicationMap$lambda$4;
                }
            }, 4, (Object) null);
            return currentData;
        }
    }

    private EventDuplicationValidatorDataStoreProvider$Companion() {
    }
}
