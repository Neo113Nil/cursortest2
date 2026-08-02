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
public final class k2 extends DataStoreProvider {
    public static final i2 d = new i2();
    public static final ConcurrentHashMap e = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final String f725a;
    public final String b;
    public final Lazy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(final Context context, String str, String str2) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f725a = str;
        this.b = str2;
        this.c = LazyKt.lazy(new Function0() { // from class: com.braze.storage.k2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.a(context, this);
            }
        });
    }

    public static final String a(Context context, k2 k2Var) {
        return StringUtils.getCacheFileSuffix(context, k2Var.f725a, k2Var.b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        return createOrGetDataStore(CollectionsKt.listOf(new SharedPreferencesMigration(getContext(), "com.braze.storage.push_identifier_storage" + ((String) this.c.getValue()), null, null, new j2(), 12, null)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final ConcurrentHashMap getDataStoreCache() {
        return e;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.push_identifier" + ((String) this.c.getValue());
    }
}
