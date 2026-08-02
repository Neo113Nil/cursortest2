package ru.ozon.app.android.storage.di.module;

import Jb.e;
import Jb.j;
import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes7.dex */
public final class StorageModule_ProvideEncryptedSharedPreferencesFactory implements e<SharedPreferences> {
    public static SharedPreferences provideEncryptedSharedPreferences(StorageModule storageModule, Context context) {
        SharedPreferences provideEncryptedSharedPreferences = storageModule.provideEncryptedSharedPreferences(context);
        j.d(provideEncryptedSharedPreferences);
        return provideEncryptedSharedPreferences;
    }
}
