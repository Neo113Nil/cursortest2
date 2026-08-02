package com.braze.storage;

import I0.InterfaceC1344i;
import android.content.Context;
import bo.app.ld;
import bo.app.md;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m extends DataStoreProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final ld f29442a = new ld();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC1344i getDataStore() {
        return createOrGetDataStore(CollectionsKt.listOf(new K0.a(getContext(), "com.appboy.override.configuration.cache", null, null, new md(), 12, null)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.override.runtime_config";
    }
}
