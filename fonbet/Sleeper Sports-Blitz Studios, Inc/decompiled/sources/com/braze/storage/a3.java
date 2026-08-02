package com.braze.storage;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import com.braze.enums.DataStoreKey;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class a3 extends DataStoreProvider {
    public static final ServerConfigDataStoreProvider$Companion b = new ServerConfigDataStoreProvider$Companion(null);
    public static final ConcurrentHashMap c = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final String f688a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(Context context, String apiKey) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f688a = apiKey;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        return createOrGetDataStore(CollectionsKt.listOf((Object[]) new SharedPreferencesMigration[]{SharedPreferencesMigrationKt.SharedPreferencesMigration(getContext(), "com.braze.storage.server_config." + this.f688a, SetsKt.setOf((Object[]) new String[]{DataStoreKey.LAST_ACCESSED_SDK_VERSION.getKey(), DataStoreKey.CONFIG_TIME.getKey(), DataStoreKey.EPHEMERAL_EVENTS_ENABLED.getKey(), DataStoreKey.GEOFENCES_ENABLED_SET.getKey(), DataStoreKey.GEOFENCES_ENABLED.getKey(), DataStoreKey.GEOFENCES_MIN_TIME_REQUEST.getKey(), DataStoreKey.GEOFENCES_MIN_TIME_REPORT.getKey(), DataStoreKey.GEOFENCES_MAX_NUM_TO_REGISTER.getKey(), DataStoreKey.MESSAGING_SESSION_TIMEOUT.getKey(), DataStoreKey.DUST_ENABLED.getKey(), DataStoreKey.CONTENT_CARDS_ENABLED.getKey(), DataStoreKey.FEATURE_FLAGS_ENABLED.getKey(), DataStoreKey.FEATURE_FLAGS_RATE_REFRESH_RATE_LIMIT.getKey(), DataStoreKey.PUSH_MAX_ENABLED.getKey(), DataStoreKey.PUSH_MAX_REDELIVER_BUFFER.getKey(), DataStoreKey.PUSH_MAX_REDELIVER_DEDUPE_BUFFER.getKey(), DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_ENABLED.getKey(), DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_CAPACITY.getKey(), DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_REFILL_RATE.getKey(), DataStoreKey.GLOBAL_REQUEST_RATE_LIMIT_ENDPOINT_OVERRIDES.getKey(), DataStoreKey.DEFAULT_REQUEST_BACKOFF_MIN_SLEEP_DURATION_MS.getKey(), DataStoreKey.DEFAULT_REQUEST_BACKOFF_MAX_SLEEP_DURATION_MS.getKey(), DataStoreKey.DEFAULT_REQUEST_BACKOFF_SCALE_FACTOR.getKey(), DataStoreKey.SDK_DEBUGGER_ENABLED.getKey(), DataStoreKey.SDK_DEBUGGER_EXPIRATION_TIME.getKey(), DataStoreKey.SDK_DEBUGGER_AUTHORIZATION_CODE.getKey(), DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_BYTES.getKey(), DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS.getKey(), DataStoreKey.SDK_DEBUGGER_MAX_PAYLOAD_BYTES.getKey(), DataStoreKey.BANNERS_ENABLED.getKey(), DataStoreKey.MAX_BANNER_PLACEMENTS.getKey()})), new SharedPreferencesMigration(getContext(), "com.braze.storage.server_config." + this.f688a, null, null, new z2(b), 12, null)}));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return c;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.serverconfig." + this.f688a;
    }
}
