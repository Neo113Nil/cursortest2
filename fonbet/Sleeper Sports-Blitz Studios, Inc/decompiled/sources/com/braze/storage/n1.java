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
public final class n1 extends DataStoreProvider {
    public static final l1 b = new l1();
    public static final ConcurrentHashMap c = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f734a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(final Context context, final String str, final String str2) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f734a = LazyKt.lazy(new Function0() { // from class: com.braze.storage.n1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n1.a(context, str, str2);
            }
        });
    }

    public static final String a(Context context, String str, String str2) {
        return StringUtils.getCacheFileSuffix(context, str, str2);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        return createOrGetDataStore(CollectionsKt.listOf(new SharedPreferencesMigration(getContext(), "com.appboy.storage.appboy_event_storage" + ((String) this.f734a.getValue()), null, null, new m1(), 12, null)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return c;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.events" + ((String) this.f734a.getValue());
    }
}
