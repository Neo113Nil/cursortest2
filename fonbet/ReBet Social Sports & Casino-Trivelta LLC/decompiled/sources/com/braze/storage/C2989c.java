package com.braze.storage;

import I0.InterfaceC1344i;
import android.content.Context;
import bo.app.d5;
import bo.app.e5;
import com.braze.support.StringUtils;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.braze.storage.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2989c extends DataStoreProvider {

    /* renamed from: b, reason: collision with root package name */
    public static final d5 f29412b = new d5();

    /* renamed from: a, reason: collision with root package name */
    public final String f29413a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2989c(Context context, String apiKey) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f29413a = apiKey;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC1344i getDataStore() {
        return createOrGetDataStore(CollectionsKt.listOf((Object[]) new K0.a[]{androidx.datastore.preferences.i.b(getContext(), "com.braze.device_id" + StringUtils.getCacheFileSuffix(getContext(), null, this.f29413a), null, 4, null), new K0.a(getContext(), "com.appboy.device", null, null, new e5(), 12, null)}));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.device_id" + StringUtils.getCacheFileSuffix(getContext(), null, this.f29413a);
    }
}
