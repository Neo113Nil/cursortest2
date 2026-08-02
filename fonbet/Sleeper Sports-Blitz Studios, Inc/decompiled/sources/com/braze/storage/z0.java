package com.braze.storage;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import com.braze.support.StringUtils;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class z0 extends DataStoreProvider {
    public static final x0 b = new x0();
    public static final ConcurrentHashMap c = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final String f770a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(Context context, String apiKey) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f770a = apiKey;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        return createOrGetDataStore(CollectionsKt.listOf((Object[]) new SharedPreferencesMigration[]{SharedPreferencesMigrationKt.SharedPreferencesMigration$default(getContext(), "com.braze.device_id" + StringUtils.getCacheFileSuffix(getContext(), null, this.f770a), null, 4, null), new SharedPreferencesMigration(getContext(), "com.appboy.device", null, null, new y0(), 12, null)}));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return c;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.device_id" + StringUtils.getCacheFileSuffix(getContext(), null, this.f770a);
    }
}
