package com.braze.storage;

import I0.InterfaceC1344i;
import android.content.Context;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r extends DataStoreProvider {
    static {
        new StringUtilsDataStoreProvider$Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC1344i getDataStore() {
        return createOrGetDataStore(CollectionsKt.listOf(androidx.datastore.preferences.i.b(getContext(), "com.appboy.support.stringutils.cachefilesuffix", null, 4, null)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.appboy.support.stringutils.cachefilesuffix";
    }
}
