package com.braze.storage;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import com.braze.enums.DataStoreKey;
import com.braze.support.StringUtils;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class d3 extends DataStoreProvider {
    public static final SessionStorageDataStoreProvider$Companion d = new SessionStorageDataStoreProvider$Companion(null);
    public static final ConcurrentHashMap e = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final String f695a;
    public final String b;
    public final Lazy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(final Context context, String str, String apiKey) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f695a = str;
        this.b = apiKey;
        this.c = LazyKt.lazy(new Function0() { // from class: com.braze.storage.d3$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d3.a(context, this);
            }
        });
    }

    public static final String a(Context context, d3 d3Var) {
        return StringUtils.getCacheFileSuffix(context, d3Var.f695a, d3Var.b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        return createOrGetDataStore(CollectionsKt.listOf((Object[]) new SharedPreferencesMigration[]{SharedPreferencesMigrationKt.SharedPreferencesMigration(getContext(), "com.appboy.storage.session_storage" + ((String) this.c.getValue()), SetsKt.setOf(DataStoreKey.CURRENT_OPEN_SESSION_ID.getKey())), new SharedPreferencesMigration(getContext(), "com.appboy.storage.session_storage" + ((String) this.c.getValue()), null, null, new c3(d), 12, null)}));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return e;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.session_storage" + ((String) this.c.getValue());
    }
}
