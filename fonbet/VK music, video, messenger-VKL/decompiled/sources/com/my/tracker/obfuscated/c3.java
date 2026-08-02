package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class c3 {
    private static volatile String a;

    public static String a(Context context) {
        String str;
        String str2 = a;
        if (str2 != null) {
            return str2;
        }
        synchronized (c3.class) {
            try {
                str = a;
                if (str == null) {
                    str = p1.a(context).k();
                    if (TextUtils.isEmpty(str)) {
                        str = UUID.randomUUID().toString();
                        p1.a(context).k(str);
                        a = str;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
