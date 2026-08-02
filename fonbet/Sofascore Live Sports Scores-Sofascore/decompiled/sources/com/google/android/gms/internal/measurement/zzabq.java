package com.google.android.gms.internal.measurement;

import defpackage.q7n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzabq {
    public static final String[] a = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    public static final q7n b;

    static {
        q7n q7nVar;
        int i = 0;
        while (true) {
            if (i >= 2) {
                q7nVar = new q7n();
                break;
            }
            q7nVar = null;
            try {
                q7nVar = (q7n) Class.forName(a[i]).asSubclass(q7n.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (q7nVar != null) {
                break;
            } else {
                i++;
            }
        }
        b = q7nVar;
    }
}
