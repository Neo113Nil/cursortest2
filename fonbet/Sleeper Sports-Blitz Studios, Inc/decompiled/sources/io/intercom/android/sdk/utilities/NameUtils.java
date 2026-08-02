package io.intercom.android.sdk.utilities;

/* loaded from: classes9.dex */
public class NameUtils {
    public static String getInitial(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? "" : String.valueOf(trim.charAt(0));
    }
}
