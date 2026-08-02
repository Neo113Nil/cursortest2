package io.intercom.android.sdk.utilities;

/* loaded from: classes9.dex */
public class NullSafety {
    public static String valueOrEmpty(String str) {
        return str == null ? "" : str;
    }

    public static boolean valueOrDefault(Boolean bool, boolean z) {
        return bool == null ? z : bool.booleanValue();
    }
}
