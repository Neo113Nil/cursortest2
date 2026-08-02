package com.fyber.inneractive.sdk.util;

/* loaded from: classes12.dex */
public abstract class i1 {
    public static String a(String str, int i) {
        if (i <= 0 || str.length() <= i) {
            return str;
        }
        return str.substring(0, i - 3) + "...";
    }
}
