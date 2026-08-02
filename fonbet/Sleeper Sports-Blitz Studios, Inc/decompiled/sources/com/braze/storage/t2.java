package com.braze.storage;

import android.content.Context;
import androidx.datastore.core.DataStore;
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
public final class t2 extends DataStoreProvider {
    public static final ConcurrentHashMap d;

    /* renamed from: a, reason: collision with root package name */
    public final String f755a;
    public final String b;
    public final Lazy c;

    static {
        new SdkAuthenticationDataStoreProvider$Companion(null);
        d = new ConcurrentHashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(final Context context, String str, String apiKey) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f755a = str;
        this.b = apiKey;
        this.c = LazyKt.lazy(new Function0() { // from class: com.braze.storage.t2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t2.a(context, this);
            }
        });
    }

    public static final String a(Context context, t2 t2Var) {
        return StringUtils.getCacheFileSuffix(context, t2Var.f755a, t2Var.b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        return createOrGetDataStore(CollectionsKt.listOf(SharedPreferencesMigrationKt.SharedPreferencesMigration(getContext(), "com.braze.storage.sdk_auth_cache" + ((String) this.c.getValue()), SetsKt.setOf(DataStoreKey.SDK_AUTH.getKey()))));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return d;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.sdk_auth" + ((String) this.c.getValue());
    }
}
