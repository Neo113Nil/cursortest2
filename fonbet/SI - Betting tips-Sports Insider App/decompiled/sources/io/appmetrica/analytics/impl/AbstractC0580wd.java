package io.appmetrica.analytics.impl;

import android.content.Context;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.wd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0580wd {

    /* renamed from: a, reason: collision with root package name */
    public static C0601x9 f14836a;

    public static final synchronized C0601x9 a(Context context) {
        C0601x9 c0601x9;
        synchronized (AbstractC0580wd.class) {
            c0601x9 = f14836a;
            if (c0601x9 == null) {
                c0601x9 = new C0601x9(context, "uuid.dat");
                f14836a = c0601x9;
            }
        }
        return c0601x9;
    }
}
