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
public final class w0 extends DataStoreProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f763a = new ConcurrentHashMap();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        return createOrGetDataStore(CollectionsKt.listOf(SharedPreferencesMigrationKt.SharedPreferencesMigration(getContext(), "com.appboy.managers.device_data_provider", SetsKt.setOf((Object[]) new String[]{DataStoreKey.GOOGLE_ADVERTISING_ID.getKey(), DataStoreKey.AD_TRACKING_ENABLED.getKey()}))));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return f763a;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.device_data";
    }
}
