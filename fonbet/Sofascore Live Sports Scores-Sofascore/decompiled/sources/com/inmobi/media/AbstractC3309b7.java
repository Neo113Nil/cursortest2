package com.inmobi.media;

import android.content.Context;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.b7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3309b7 {
    public static final void a(Context context) {
        context.getClass();
        ConcurrentHashMap concurrentHashMap = Qa.b;
        Iterator it = kotlin.collections.b.j(Pa.a("carb_store"), Pa.a("aes_key_store"), Pa.a("mraid_js_store"), Pa.a("omid_js_store"), Pa.a("user_info_store"), Pa.a("coppa_store"), Pa.a("gesture_info_store"), Pa.a("display_info_store"), Pa.a("unified_id_info_store"), Pa.a("app_bundle_store"), Pa.a("pub_signals_store"), Pa.a("CrashSession-store")).iterator();
        while (it.hasNext()) {
            context.deleteSharedPreferences((String) it.next());
        }
    }

    public static final void a(File file) {
        file.getClass();
        try {
            if (file.exists()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    defpackage.r4 r4Var = new defpackage.r4(listFiles);
                    while (r4Var.hasNext()) {
                        File file2 = (File) r4Var.next();
                        if (file2.isDirectory()) {
                            a(file2);
                        } else if (file2.delete()) {
                            file2.getName();
                        }
                    }
                }
                if (file.delete()) {
                    file.getName();
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
