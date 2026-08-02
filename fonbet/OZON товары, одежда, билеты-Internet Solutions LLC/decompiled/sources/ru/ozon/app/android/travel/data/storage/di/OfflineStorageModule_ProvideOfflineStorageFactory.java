package ru.ozon.app.android.travel.data.storage.di;

import Jb.e;
import Jb.j;
import android.content.Context;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.network.serialize.JsonSerializer;
import ru.ozon.app.android.travel.data.storage.offline.OfflineTravelStorage;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;

/* loaded from: classes7.dex */
public final class OfflineStorageModule_ProvideOfflineStorageFactory implements e<OfflineTravelStorage> {
    public static OfflineTravelStorage provideOfflineStorage(OfflineStorageModule offlineStorageModule, Context context, CoroutineDispatcherProvider coroutineDispatcherProvider, JsonSerializer jsonSerializer, JsonParser jsonParser) {
        OfflineTravelStorage provideOfflineStorage = offlineStorageModule.provideOfflineStorage(context, coroutineDispatcherProvider, jsonSerializer, jsonParser);
        j.d(provideOfflineStorage);
        return provideOfflineStorage;
    }
}
