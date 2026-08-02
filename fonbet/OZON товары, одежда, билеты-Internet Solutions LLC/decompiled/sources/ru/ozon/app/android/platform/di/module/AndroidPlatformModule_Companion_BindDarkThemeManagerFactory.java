package ru.ozon.app.android.platform.di.module;

import Jb.e;
import Jb.j;
import android.content.Context;
import android.content.SharedPreferences;
import ei0.InterfaceC6369b;
import ru.ozon.app.android.platform.theme.DarkThemeManager;

/* loaded from: classes7.dex */
public final class AndroidPlatformModule_Companion_BindDarkThemeManagerFactory implements e<DarkThemeManager> {
    public static DarkThemeManager bindDarkThemeManager(Context context, SharedPreferences sharedPreferences, InterfaceC6369b interfaceC6369b) {
        DarkThemeManager bindDarkThemeManager = AndroidPlatformModule.INSTANCE.bindDarkThemeManager(context, sharedPreferences, interfaceC6369b);
        j.d(bindDarkThemeManager);
        return bindDarkThemeManager;
    }
}
