package ru.ozon.app.android.storage.di.module;

import Jb.e;
import Jb.j;
import android.content.Context;
import ru.ozon.app.android.storage.OzonDatabase;

/* loaded from: classes7.dex */
public final class StorageModule_ProvideOzonDatabaseFactory implements e<OzonDatabase> {
    public static OzonDatabase provideOzonDatabase(StorageModule storageModule, Context context) {
        OzonDatabase provideOzonDatabase = storageModule.provideOzonDatabase(context);
        j.d(provideOzonDatabase);
        return provideOzonDatabase;
    }
}
