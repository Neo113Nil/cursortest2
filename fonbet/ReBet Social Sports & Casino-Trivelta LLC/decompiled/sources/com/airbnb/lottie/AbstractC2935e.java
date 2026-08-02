package com.airbnb.lottie;

import android.content.Context;
import java.io.File;

/* renamed from: com.airbnb.lottie.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2935e {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f28681a = false;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f28682b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f28683c = true;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f28684d = false;

    /* renamed from: f, reason: collision with root package name */
    public static com.airbnb.lottie.network.f f28686f;

    /* renamed from: g, reason: collision with root package name */
    public static com.airbnb.lottie.network.e f28687g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile com.airbnb.lottie.network.h f28688h;

    /* renamed from: i, reason: collision with root package name */
    public static volatile com.airbnb.lottie.network.g f28689i;

    /* renamed from: j, reason: collision with root package name */
    public static ThreadLocal f28690j;

    /* renamed from: e, reason: collision with root package name */
    public static EnumC2931a f28685e = EnumC2931a.AUTOMATIC;

    /* renamed from: k, reason: collision with root package name */
    public static C3.b f28691k = new C3.c();

    public static /* synthetic */ File a(Context context) {
        return new File(context.getCacheDir(), "lottie_network_cache");
    }

    public static void b(String str) {
        if (f28682b) {
            g().a(str);
        }
    }

    public static float c(String str) {
        if (f28682b) {
            return g().b(str);
        }
        return 0.0f;
    }

    public static EnumC2931a d() {
        return f28685e;
    }

    public static boolean e() {
        return f28684d;
    }

    public static C3.b f() {
        return f28691k;
    }

    public static com.airbnb.lottie.utils.i g() {
        com.airbnb.lottie.utils.i iVar = (com.airbnb.lottie.utils.i) f28690j.get();
        if (iVar != null) {
            return iVar;
        }
        com.airbnb.lottie.utils.i iVar2 = new com.airbnb.lottie.utils.i();
        f28690j.set(iVar2);
        return iVar2;
    }

    public static boolean h() {
        return f28682b;
    }

    public static com.airbnb.lottie.network.g i(Context context) {
        com.airbnb.lottie.network.g gVar;
        if (!f28683c) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        com.airbnb.lottie.network.g gVar2 = f28689i;
        if (gVar2 != null) {
            return gVar2;
        }
        synchronized (com.airbnb.lottie.network.g.class) {
            try {
                gVar = f28689i;
                if (gVar == null) {
                    com.airbnb.lottie.network.e eVar = f28687g;
                    if (eVar == null) {
                        eVar = new com.airbnb.lottie.network.e() { // from class: com.airbnb.lottie.d
                            @Override // com.airbnb.lottie.network.e
                            public final File getCacheDir() {
                                return AbstractC2935e.a(applicationContext);
                            }
                        };
                    }
                    gVar = new com.airbnb.lottie.network.g(eVar);
                    f28689i = gVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public static com.airbnb.lottie.network.h j(Context context) {
        com.airbnb.lottie.network.h hVar;
        com.airbnb.lottie.network.h hVar2 = f28688h;
        if (hVar2 != null) {
            return hVar2;
        }
        synchronized (com.airbnb.lottie.network.h.class) {
            try {
                hVar = f28688h;
                if (hVar == null) {
                    com.airbnb.lottie.network.g i10 = i(context);
                    com.airbnb.lottie.network.f fVar = f28686f;
                    if (fVar == null) {
                        fVar = new com.airbnb.lottie.network.b();
                    }
                    hVar = new com.airbnb.lottie.network.h(i10, fVar);
                    f28688h = hVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }
}
