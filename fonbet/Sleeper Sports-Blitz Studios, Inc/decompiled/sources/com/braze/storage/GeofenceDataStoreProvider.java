package com.braze.storage;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import androidx.datastore.preferences.core.Preferences;
import com.braze.enums.DataStoreKey;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\tR&\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00108TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/braze/storage/GeofenceDataStoreProvider;", "Lcom/braze/storage/DataStoreProvider;", "Landroid/content/Context;", "context", "", "apiKey", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "getDataStoreFileName", "()Ljava/lang/String;", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "getDataStore", "()Landroidx/datastore/core/DataStore;", "Ljava/lang/String;", "getApiKey", "Ljava/util/concurrent/ConcurrentHashMap;", "getDataStoreCache", "()Ljava/util/concurrent/ConcurrentHashMap;", "dataStoreCache", "Companion", "com/braze/storage/a2", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GeofenceDataStoreProvider extends DataStoreProvider {
    public static final String GEOFENCES_DATA_STORE_STORAGE = "com.braze.geofences";
    public static final String GEOFENCE_GLOBAL_ELIGIBILITY_SHARED_PREFS_LOCATION = "com.appboy.managers.geofences.eligibility.global";
    public static final String GEOFENCE_INDIVIDUAL_ELIGIBILITY_SHARED_PREFS_LOCATION = "com.appboy.managers.geofences.eligibility.individual";
    public static final String GEOFENCE_STORAGE_SHARED_PREFS_LOCATION = "com.appboy.managers.geofences.storage";
    public static final String REGISTERED_GEOFENCE_SHARED_PREFS_LOCATION = "com.appboy.support.geofences";
    private final String apiKey;
    public static final a2 Companion = new a2();
    private static final ConcurrentHashMap<String, DataStore<Preferences>> geofenceDataStores = new ConcurrentHashMap<>();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeofenceDataStoreProvider(Context context, String apiKey) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.apiKey = apiKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getDataStore$migrateGeofencesListToJson(a2 a2Var, SharedPreferencesView sharedPrefs, Preferences currentData, Continuation continuation) {
        a2Var.getClass();
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        return a2Var.a(sharedPrefs, currentData, DataStoreKey.GEOFENCES.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object getDataStore$migrateIndividualReeligibilityMapToJson(a2 a2Var, SharedPreferencesView sharedPreferencesView, Preferences preferences, Continuation continuation) {
        return a2Var.a(sharedPreferencesView, preferences);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getDataStore$migrateRegisteredGeofencesListToJson(a2 a2Var, SharedPreferencesView sharedPrefs, Preferences currentData, Continuation continuation) {
        a2Var.getClass();
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        Intrinsics.checkNotNullParameter(currentData, "currentData");
        return a2Var.a(sharedPrefs, currentData, DataStoreKey.REGISTERED_GEOFENCES.getKey());
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.braze.storage.DataStoreProvider
    public DataStore<Preferences> getDataStore() {
        SharedPreferencesMigration<Preferences> SharedPreferencesMigration = SharedPreferencesMigrationKt.SharedPreferencesMigration(getContext(), "com.appboy.managers.geofences.eligibility.global." + this.apiKey, SetsKt.setOf((Object[]) new String[]{DataStoreKey.GLOBAL_LAST_REPORT.getKey(), DataStoreKey.GLOBAL_LAST_REQUEST.getKey()}));
        Context context = getContext();
        String str = "com.appboy.managers.geofences.eligibility.individual." + this.apiKey;
        a2 a2Var = Companion;
        return createOrGetDataStore(CollectionsKt.listOf((Object[]) new SharedPreferencesMigration[]{SharedPreferencesMigration, new SharedPreferencesMigration(context, str, null, null, new b2(a2Var), 12, null), new SharedPreferencesMigration(getContext(), "com.appboy.managers.geofences.storage." + this.apiKey, null, null, new c2(a2Var), 12, null), new SharedPreferencesMigration(getContext(), REGISTERED_GEOFENCE_SHARED_PREFS_LOCATION, 0 == true ? 1 : 0, null, new d2(a2Var), 12, null)}));
    }

    @Override // com.braze.storage.DataStoreProvider
    public ConcurrentHashMap<String, DataStore<Preferences>> getDataStoreCache() {
        return geofenceDataStores;
    }

    @Override // com.braze.storage.DataStoreProvider
    public String getDataStoreFileName() {
        return "com.braze.geofences." + this.apiKey;
    }
}
