package com.braze.storage;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import okhttp3.HttpUrl;
import org.json.JSONArray;

@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R&\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"com/braze/storage/ServerConfigDataStoreProvider$Companion", "", "<init>", "()V", "Landroidx/datastore/migrations/SharedPreferencesView;", "sharedPrefs", "Landroidx/datastore/preferences/core/MutablePreferences;", "mutablePrefs", "Lcom/braze/enums/DataStoreKey;", SDKConstants.PARAM_KEY, "", "migrateBlocklistedList", "(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/MutablePreferences;Lcom/braze/enums/DataStoreKey;)V", "Landroidx/datastore/preferences/core/Preferences;", "currentData", "migrateBlocklistedLists", "(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", "", "SERVER_CONFIG_DATA_STORE_STORAGE", "Ljava/lang/String;", "SERVER_CONFIG_SHARED_PREFS", "Ljava/util/concurrent/ConcurrentHashMap;", "Landroidx/datastore/core/DataStore;", "serverConfigDataStores", "Ljava/util/concurrent/ConcurrentHashMap;", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ServerConfigDataStoreProvider$Companion {
    public /* synthetic */ ServerConfigDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final void migrateBlocklistedList(SharedPreferencesView sharedPrefs, MutablePreferences mutablePrefs, final DataStoreKey key) {
        String str;
        try {
            String string = sharedPrefs.getString(key.getKey(), null);
            if (string != null && !StringsKt.isBlank(string)) {
                JSONArray jSONArray = new JSONArray(string);
                final ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String string2 = jSONArray.getString(i);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    arrayList.add(string2);
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
                mutablePrefs.set(PreferencesKeys.stringKey(key.getKey()), str);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.ServerConfigDataStoreProvider$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String migrateBlocklistedList$lambda$4;
                        migrateBlocklistedList$lambda$4 = ServerConfigDataStoreProvider$Companion.migrateBlocklistedList$lambda$4(DataStoreKey.this, arrayList);
                        return migrateBlocklistedList$lambda$4;
                    }
                }, 7, (Object) null);
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.ServerConfigDataStoreProvider$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateBlocklistedList$lambda$5;
                    migrateBlocklistedList$lambda$5 = ServerConfigDataStoreProvider$Companion.migrateBlocklistedList$lambda$5(DataStoreKey.this);
                    return migrateBlocklistedList$lambda$5;
                }
            }, 7, (Object) null);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, new Function0() { // from class: com.braze.storage.ServerConfigDataStoreProvider$Companion$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateBlocklistedList$lambda$6;
                    migrateBlocklistedList$lambda$6 = ServerConfigDataStoreProvider$Companion.migrateBlocklistedList$lambda$6(DataStoreKey.this);
                    return migrateBlocklistedList$lambda$6;
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedList$lambda$4(DataStoreKey dataStoreKey, List list) {
        return "Migrated " + dataStoreKey.getKey() + " with " + list.size() + " items.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedList$lambda$5(DataStoreKey dataStoreKey) {
        return "No data found for " + dataStoreKey.getKey() + ", skipping";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedList$lambda$6(DataStoreKey dataStoreKey) {
        return "Failed to migrate " + dataStoreKey.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedLists$lambda$0() {
        return "Starting migration for blocklisted lists";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedLists$lambda$1() {
        return "Blocklisted lists already migrated, skipping";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedLists$lambda$2() {
        return "Migration for blocklisted lists completed successfully";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedLists$lambda$3() {
        return "Failed to migrate blocklisted lists to DataStore";
    }

    public final Preferences migrateBlocklistedLists(SharedPreferencesView sharedPrefs, Preferences currentData) {
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.ServerConfigDataStoreProvider$Companion$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String migrateBlocklistedLists$lambda$0;
                migrateBlocklistedLists$lambda$0 = ServerConfigDataStoreProvider$Companion.migrateBlocklistedLists$lambda$0();
                return migrateBlocklistedLists$lambda$0;
            }
        }, 7, (Object) null);
        DataStoreKey dataStoreKey = DataStoreKey.BLOCKLISTED_EVENTS;
        if (!currentData.contains(PreferencesKeys.stringKey(dataStoreKey.getKey()))) {
            DataStoreKey dataStoreKey2 = DataStoreKey.BLOCKLISTED_ATTRIBUTES;
            if (!currentData.contains(PreferencesKeys.stringKey(dataStoreKey2.getKey()))) {
                DataStoreKey dataStoreKey3 = DataStoreKey.BLOCKLISTED_PURCHASES;
                if (!currentData.contains(PreferencesKeys.stringKey(dataStoreKey3.getKey()))) {
                    try {
                        MutablePreferences mutablePreferences = currentData.toMutablePreferences();
                        migrateBlocklistedList(sharedPrefs, mutablePreferences, dataStoreKey);
                        migrateBlocklistedList(sharedPrefs, mutablePreferences, dataStoreKey2);
                        migrateBlocklistedList(sharedPrefs, mutablePreferences, dataStoreKey3);
                        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.ServerConfigDataStoreProvider$Companion$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String migrateBlocklistedLists$lambda$2;
                                migrateBlocklistedLists$lambda$2 = ServerConfigDataStoreProvider$Companion.migrateBlocklistedLists$lambda$2();
                                return migrateBlocklistedLists$lambda$2;
                            }
                        }, 7, (Object) null);
                        return mutablePreferences;
                    } catch (Exception e) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.ServerConfigDataStoreProvider$Companion$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String migrateBlocklistedLists$lambda$3;
                                migrateBlocklistedLists$lambda$3 = ServerConfigDataStoreProvider$Companion.migrateBlocklistedLists$lambda$3();
                                return migrateBlocklistedLists$lambda$3;
                            }
                        }, 4, (Object) null);
                        return currentData;
                    }
                }
            }
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.ServerConfigDataStoreProvider$Companion$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String migrateBlocklistedLists$lambda$1;
                migrateBlocklistedLists$lambda$1 = ServerConfigDataStoreProvider$Companion.migrateBlocklistedLists$lambda$1();
                return migrateBlocklistedLists$lambda$1;
            }
        }, 7, (Object) null);
        return currentData;
    }

    private ServerConfigDataStoreProvider$Companion() {
    }
}
