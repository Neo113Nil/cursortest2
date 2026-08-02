package com.braze.storage;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.migrations.SharedPreferencesMigration;
import com.braze.support.StringUtils;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class h2 extends DataStoreProvider {
    public static final PushDeliveryDataStoreProvider$Companion c = new PushDeliveryDataStoreProvider$Companion(null);
    public static final ConcurrentHashMap d = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final String f713a;
    public final Lazy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(final Context context, String apiKey) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f713a = apiKey;
        this.b = LazyKt.lazy(new Function0() { // from class: com.braze.storage.h2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h2.a(context, this);
            }
        });
    }

    public static final String a(Context context, h2 h2Var) {
        return StringUtils.getCacheFileSuffix(context, null, h2Var.f713a);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        return createOrGetDataStore(CollectionsKt.listOf(new SharedPreferencesMigration(getContext(), "com.braze.storage.braze_push_delivery_storage" + ((String) this.b.getValue()), null, null, new g2(c), 12, null)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return d;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.push_delivery." + this.f713a;
    }
}
