package ru.ozon.app.android.storage.di.module;

import Jb.e;
import Jb.j;
import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes7.dex */
public final class StorageModule_ProvideSharedPreferencesFactory implements e<SharedPreferences> {
    public static SharedPreferences provideSharedPreferences(StorageModule storageModule, Context context) {
        SharedPreferences provideSharedPreferences = storageModule.provideSharedPreferences(context);
        j.d(provideSharedPreferences);
        return provideSharedPreferences;
    }
}
