package com.google.android.gms.internal.measurement;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzrn {
    public static final Object a = new Object();
    public static Thread b;
    public static volatile Handler c;

    public static Handler a() {
        if (c == null) {
            synchronized (a) {
                try {
                    if (c == null) {
                        c = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return c;
    }
}
