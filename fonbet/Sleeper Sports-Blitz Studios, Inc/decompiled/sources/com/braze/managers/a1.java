package com.braze.managers;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import com.braze.enums.DataStoreKey;
import com.braze.storage.DataStoreProvider;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class a1 extends DataStoreProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f574a = new ConcurrentHashMap();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        return createOrGetDataStore(CollectionsKt.listOf(SharedPreferencesMigrationKt.SharedPreferencesMigration(getContext(), "com.braze.push_registration", SetsKt.setOf((Object[]) new String[]{DataStoreKey.PUSH_REGISTRATION_VERSION_CODE.getKey(), DataStoreKey.PUSH_REGISTRATION_PERSISTENT_DEVICE_ID.getKey(), DataStoreKey.PUSH_REGISTRATION_ID_KEY.getKey()}))));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return f574a;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.push_storage";
    }
}
