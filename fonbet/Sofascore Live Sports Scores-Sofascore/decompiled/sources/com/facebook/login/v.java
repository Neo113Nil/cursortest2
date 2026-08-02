package com.facebook.login;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class v {
    public static final v a = new v();
    public static r b;

    public synchronized r a(Context context) {
        r rVar;
        if (context == null) {
            try {
                context = com.facebook.w.a();
            } catch (Throwable th) {
                throw th;
            }
        }
        rVar = b;
        if (rVar == null) {
            rVar = new r(context, com.facebook.w.b());
            b = rVar;
        }
        return rVar;
    }
}
