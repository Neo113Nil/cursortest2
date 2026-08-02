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
public final class u1 extends DataStoreProvider {
    public static final EventDuplicationValidatorDataStoreProvider$Companion d = new EventDuplicationValidatorDataStoreProvider$Companion(null);
    public static final ConcurrentHashMap e = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final String f757a;
    public final String b;
    public final Lazy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(final Context context, String str, String apiKey) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f757a = str;
        this.b = apiKey;
        this.c = LazyKt.lazy(new Function0() { // from class: com.braze.storage.u1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u1.a(context, this);
            }
        });
    }

    public static final String a(Context context, u1 u1Var) {
        return StringUtils.getCacheFileSuffix(context, u1Var.f757a, u1Var.b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        return createOrGetDataStore(CollectionsKt.listOf(new SharedPreferencesMigration(getContext(), "com.appboy.storage.event_data_validator" + ((String) this.c.getValue()), null, null, new t1(d), 12, null)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return e;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.storage.event_data_validator" + ((String) this.c.getValue());
    }
}
