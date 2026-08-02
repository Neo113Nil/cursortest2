package com.apm.insight.b;

import android.content.Context;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class f {
    private static volatile f a;
    private static g c;
    private final b b;

    private f(@NonNull Context context) {
        this.b = new b(context);
        g gVar = new g();
        c = gVar;
        gVar.a();
    }

    public static f a(Context context) {
        if (a == null) {
            synchronized (f.class) {
                try {
                    if (a == null) {
                        a = new f(context);
                    }
                } finally {
                }
            }
        }
        return a;
    }

    public static g b() {
        return c;
    }

    public final void c() {
        this.b.a();
    }

    public final void d() {
        this.b.b();
    }

    public final b a() {
        return this.b;
    }
}
