package com.braze.storage;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import com.braze.support.StringUtils;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class o3 extends DataStoreProvider {
    public static final ConcurrentHashMap d = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final String f738a;
    public final String b;
    public final Lazy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(final Context context, String str, String str2) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f738a = str;
        this.b = str2;
        this.c = LazyKt.lazy(new Function0() { // from class: com.braze.storage.o3$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o3.a(context, this);
            }
        });
    }

    public static final String a(Context context, o3 o3Var) {
        return StringUtils.getCacheFileSuffix(context, o3Var.f738a, o3Var.b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        return createOrGetDataStore(CollectionsKt.listOf((Object[]) new SharedPreferencesMigration[]{SharedPreferencesMigrationKt.SharedPreferencesMigration$default(getContext(), "com.appboy.storage.user_cache.v3" + ((String) this.c.getValue()), null, 4, null), SharedPreferencesMigrationKt.SharedPreferencesMigration$default(getContext(), "com.braze.storage.user_cache.push_token_store" + ((String) this.c.getValue()), null, 4, null)}));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return d;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.user_cache" + ((String) this.c.getValue());
    }
}
