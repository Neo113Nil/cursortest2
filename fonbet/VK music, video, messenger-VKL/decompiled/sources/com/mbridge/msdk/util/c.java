package com.mbridge.msdk.util;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.GoogleApiAvailability;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CronetEnvironmentCheckUtil.java */
/* loaded from: classes14.dex */
public class c {
    private static boolean a = false;
    public static String b = "";

    public static void a() {
        if (c()) {
            try {
                GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
                Context d = com.mbridge.msdk.foundation.controller.c.n().d();
                googleApiAvailability.getClass();
                com.google.android.gms.common.a.a(d);
                GoogleApiAvailability googleApiAvailability2 = GoogleApiAvailability.getInstance();
                Context d2 = com.mbridge.msdk.foundation.controller.c.n().d();
                googleApiAvailability2.getClass();
                com.google.android.gms.common.a.d(d2);
                try {
                    String b2 = b();
                    boolean isEmpty = TextUtils.isEmpty(b2);
                    a = !isEmpty;
                    if (isEmpty) {
                        return;
                    }
                    b = b2;
                } catch (Throwable th) {
                    q0.b("CronetEnvCheckUtil", th.getMessage());
                }
            } catch (Throwable th2) {
                q0.b("CronetEnvCheckUtil", th2.getMessage());
                a = false;
            }
        }
    }

    private static String b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Pair.create(1, "org.chromium.net.impl.JavaCronetProvider"));
        arrayList.add(Pair.create(2, "org.chromium.net.impl.NativeCronetProvider"));
        arrayList.add(Pair.create(3, "com.google.android.gms.net.PlayServicesCronetProvider"));
        arrayList.add(Pair.create(4, "com.google.android.gms.net.GmsCoreCronetProvider"));
        try {
            StringBuilder sb = new StringBuilder();
            ClassLoader classLoader = com.mbridge.msdk.foundation.controller.c.n().d().getClassLoader();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                try {
                    if (!TextUtils.isEmpty(classLoader.loadClass((String) pair.second).getConstructor(Context.class).newInstance(com.mbridge.msdk.foundation.controller.c.n().d()).getClass().getName())) {
                        if (sb.length() > 0) {
                            sb.append(StringUtils.COMMA);
                        }
                        sb.append(pair.first);
                    }
                } catch (Throwable th) {
                    q0.b("CronetEnvCheckUtil", th.getMessage());
                }
            }
            return sb.toString();
        } catch (Throwable th2) {
            q0.b("CronetEnvCheckUtil", th2.getMessage());
            return "";
        }
    }

    public static boolean c() {
        return s0.a().a("cronet_env_check", false);
    }
}
