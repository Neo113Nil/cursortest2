package com.braze.storage;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import com.braze.enums.DataStoreKey;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class s0 extends DataStoreProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f750a = new ConcurrentHashMap();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        return createOrGetDataStore(CollectionsKt.listOf(SharedPreferencesMigrationKt.SharedPreferencesMigration(getContext(), "persistent.com.braze.storage.delayed_initialization_cache", SetsKt.setOf((Object[]) new String[]{DataStoreKey.DELAYED_INIT_ENABLED.getKey(), DataStoreKey.DELAYED_INIT_SET_DURING_RUNTIME_FLAG.getKey(), DataStoreKey.DELAYED_INIT_ANALYTICS_BEHAVIOR_FLAG.getKey()}))));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return f750a;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.delayed_initialization";
    }
}
