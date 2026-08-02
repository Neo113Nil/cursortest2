package com.vungle.ads.internal.util;

import android.content.Context;
import android.webkit.URLUtil;
import defpackage.c28;
import defpackage.d28;
import defpackage.z55;
import java.io.File;
import kotlin.io.FileWalkDirection;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class z {
    public static long a(Context context) {
        long j;
        context.getClass();
        long j2 = 0;
        try {
            File file = new File(context.getApplicationInfo().dataDir, "app_webview");
            if (file.exists() && file.exists()) {
                z55 z55Var = new z55(c28.e(file, FileWalkDirection.a));
                j = 0;
                while (z55Var.hasNext()) {
                    File file2 = (File) z55Var.next();
                    if (file2.isFile()) {
                        j += file2.length();
                    }
                }
            } else {
                j = 0;
            }
            try {
                File cacheDir = context.getCacheDir();
                if (!cacheDir.exists()) {
                    return j;
                }
                File i = d28.i(cacheDir, "webviewCache");
                if (i.exists()) {
                    z55 z55Var2 = new z55(c28.e(i, FileWalkDirection.a));
                    while (z55Var2.hasNext()) {
                        File file3 = (File) z55Var2.next();
                        if (file3.isFile()) {
                            j2 += file3.length();
                        }
                    }
                }
                return j + j2;
            } catch (Exception e) {
                e = e;
                j2 = j;
                boolean z = u.a;
                StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Error reading WebView data size: ");
                a.append(e.getMessage());
                t.b("WebViewSize", a.toString());
                return j2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static boolean a(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return URLUtil.isHttpsUrl(str) || URLUtil.isHttpUrl(str);
    }

    public static boolean a() {
        return false;
    }
}
