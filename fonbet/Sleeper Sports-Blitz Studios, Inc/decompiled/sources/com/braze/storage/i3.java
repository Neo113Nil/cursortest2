package com.braze.storage;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import com.braze.support.StringUtils;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class i3 extends DataStoreProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f718a;

    static {
        new StringUtilsDataStoreProvider$Companion(null);
        f718a = new ConcurrentHashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        return createOrGetDataStore(CollectionsKt.listOf(SharedPreferencesMigrationKt.SharedPreferencesMigration$default(getContext(), StringUtils.CACHE_SUFFIX_PREFERENCES_FILE, null, 4, null)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return f718a;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return StringUtils.CACHE_SUFFIX_PREFERENCES_FILE;
    }
}
