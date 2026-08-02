package com.braze.storage;

import I0.InterfaceC1344i;
import android.content.Context;
import bo.app.nc;
import com.braze.enums.DataStoreKey;
import com.braze.support.StringUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l extends DataStoreProvider {

    /* renamed from: d, reason: collision with root package name */
    public static final PushMaxDataStoreProvider$Companion f29438d = new PushMaxDataStoreProvider$Companion(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f29439a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29440b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f29441c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(final Context context, String str, String apiKey) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f29439a = str;
        this.f29440b = apiKey;
        this.f29441c = LazyKt.lazy(new Function0() { // from class: X3.N0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.braze.storage.l.a(context, this);
            }
        });
    }

    public static final String a(Context context, l lVar) {
        return StringUtils.getCacheFileSuffix(context, lVar.f29439a, lVar.f29440b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC1344i getDataStore() {
        return createOrGetDataStore(CollectionsKt.listOf((Object[]) new K0.a[]{androidx.datastore.preferences.i.a(getContext(), "com.braze.storage.braze_push_max_metadata" + ((String) this.f29441c.getValue()), SetsKt.setOf(DataStoreKey.PUSH_MAX_LAST_UPDATE.getKey())), new K0.a(getContext(), "com.braze.storage.braze_push_max_storage" + ((String) this.f29441c.getValue()), null, null, new nc(f29438d), 12, null)}));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.pushmax" + ((String) this.f29441c.getValue());
    }
}
