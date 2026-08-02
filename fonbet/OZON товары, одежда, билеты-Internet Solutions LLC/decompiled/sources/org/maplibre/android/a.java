package org.maplibre.android;

import ch.C5834e;
import dg.C6197a;
import org.maplibre.android.log.Logger;

/* loaded from: classes10.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f79572a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f79573b;

    static {
        ((C5834e) MapLibre.getModuleProvider()).getClass();
        f79572a = new C6197a().a();
    }

    public static synchronized void a() {
        synchronized (a.class) {
            try {
                if (!f79573b) {
                    f79573b = true;
                    f79572a.b();
                }
            } catch (UnsatisfiedLinkError e11) {
                f79573b = false;
                Logger.e("Mbgl-LibraryLoader", "Failed to load native shared library.", e11);
                b.d("Failed to load native shared library.", e11);
            }
        }
    }

    public abstract void b();
}
