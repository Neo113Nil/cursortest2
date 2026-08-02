package com.getcapacitor;

import android.text.TextUtils;

@Deprecated
/* loaded from: classes8.dex */
public abstract class LogUtils {

    @Deprecated
    public static final String LOG_TAG_CORE = "Capacitor";

    @Deprecated
    public static final String LOG_TAG_PLUGIN = "Capacitor/Plugin";

    @Deprecated
    public static String getCoreTag(String... strArr) {
        return getLogTag("Capacitor", strArr);
    }

    @Deprecated
    public static String getPluginTag(String... strArr) {
        return getLogTag(LOG_TAG_PLUGIN, strArr);
    }

    private static String getLogTag(String str, String[] strArr) {
        return (strArr == null || strArr.length <= 0) ? str : str + "/" + TextUtils.join("/", strArr);
    }
}
