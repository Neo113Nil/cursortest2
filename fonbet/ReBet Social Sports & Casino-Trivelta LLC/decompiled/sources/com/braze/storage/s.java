package com.braze.storage;

import I0.InterfaceC1344i;
import android.content.Context;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s extends DataStoreProvider {

    /* renamed from: a, reason: collision with root package name */
    public final String f29456a;

    static {
        new TriggerAssetDataStoreProvider$Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, String apiKey) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f29456a = apiKey;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC1344i getDataStore() {
        return createOrGetDataStore(CollectionsKt.listOf(androidx.datastore.preferences.i.b(getContext(), "com.appboy.storage.triggers.local_assets." + this.f29456a, null, 4, null)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.triggers.assets." + this.f29456a;
    }
}
