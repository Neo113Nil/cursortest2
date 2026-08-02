package com.apm.insight.i;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.apm.insight.runtime.o;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class a {
    private static volatile UUID a = null;
    private static String b = "";

    private a(Context context) {
        String str;
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    String c = o.a().c();
                    if (c != null) {
                        a = UUID.fromString(c);
                    } else {
                        try {
                            str = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        } catch (Throwable unused) {
                            str = null;
                        }
                        try {
                            if (str != null) {
                                a = UUID.nameUUIDFromBytes(str.getBytes("utf8"));
                            } else {
                                a = UUID.randomUUID();
                            }
                        } catch (Throwable unused2) {
                        }
                        try {
                            o.a().b(a.toString());
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
        }
    }

    public static synchronized String a(Context context) {
        String str;
        synchronized (a.class) {
            try {
                if (TextUtils.isEmpty(b)) {
                    new a(context);
                    UUID uuid = a;
                    if (uuid != null) {
                        b = uuid.toString();
                    }
                }
                str = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
