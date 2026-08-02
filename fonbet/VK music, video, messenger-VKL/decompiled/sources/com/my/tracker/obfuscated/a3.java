package com.my.tracker.obfuscated;

import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;

/* loaded from: classes.dex */
public abstract class a3 {
    public static String a(String str, String str2, String str3) {
        return a(str + "." + str2, str3);
    }

    public static String a(String str, String str2) {
        Uri.Builder encodedAuthority = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).encodedAuthority(str);
        if (str2 != null) {
            encodedAuthority.appendEncodedPath(str2);
        }
        return encodedAuthority.toString();
    }
}
