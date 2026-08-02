package ru.ozon.app.android.account.locale.app.di.module;

import Jb.e;
import Jb.j;
import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes6.dex */
public final class AppLocaleModule_Companion_ProvidePreferencesFactory implements e<SharedPreferences> {
    public static SharedPreferences providePreferences(Context context) {
        SharedPreferences providePreferences = AppLocaleModule.INSTANCE.providePreferences(context);
        j.d(providePreferences);
        return providePreferences;
    }
}
