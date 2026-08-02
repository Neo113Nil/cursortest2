package com.yandex.runtime.i18n;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public class I18nManagerFactory {
    @NonNull
    public static native I18nManager getI18nManagerInstance();

    @NonNull
    public static native String getLocale();

    public static native void setLocale(String str);
}
