package com.facebook.drawee.backends.pipeline;

import C7.C1055t;
import C7.C1056u;
import C7.y;
import C7.z;
import android.content.Context;
import com.facebook.drawee.view.SimpleDraweeView;
import java.lang.reflect.InvocationTargetException;
import x8.AbstractC6803a;
import x8.C6805c;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f30369a = d.class;

    /* renamed from: b, reason: collision with root package name */
    public static g f30370b = null;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f30371c = false;

    public static C1055t a() {
        return b().j();
    }

    public static y b() {
        return y.l();
    }

    public static boolean c() {
        return f30371c;
    }

    public static void d(Context context) {
        f(context, null, null);
    }

    public static void e(Context context, C1056u c1056u) {
        f(context, c1056u, null);
    }

    public static void f(Context context, C1056u c1056u, b bVar) {
        g(context, c1056u, bVar, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (N7.b.d() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        N7.b.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        if (N7.b.d() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        if (N7.b.d() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
    
        if (N7.b.d() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005e, code lost:
    
        if (N7.b.d() == false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(Context context, C1056u c1056u, b bVar, boolean z10) {
        if (N7.b.d()) {
            N7.b.a("Fresco#initialize");
        }
        if (f30371c) {
            E6.a.G(f30369a, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
        } else {
            f30371c = true;
        }
        z.b(z10);
        if (!AbstractC6803a.c()) {
            if (N7.b.d()) {
                N7.b.a("Fresco.initialize->SoLoader.init");
            }
            try {
                try {
                    try {
                        Class.forName("com.facebook.imagepipeline.nativecode.NativeCodeInitializer").getMethod("init", Context.class).invoke(null, context);
                    } catch (IllegalAccessException unused) {
                        AbstractC6803a.b(new C6805c());
                    } catch (InvocationTargetException unused2) {
                        AbstractC6803a.b(new C6805c());
                    }
                } catch (ClassNotFoundException unused3) {
                    AbstractC6803a.b(new C6805c());
                } catch (NoSuchMethodException unused4) {
                    AbstractC6803a.b(new C6805c());
                }
            } catch (Throwable th2) {
                if (N7.b.d()) {
                    N7.b.b();
                }
                throw th2;
            }
        }
        Context applicationContext = context.getApplicationContext();
        if (c1056u == null) {
            y.t(applicationContext);
        } else {
            y.s(c1056u);
        }
        h(applicationContext, bVar);
        if (N7.b.d()) {
            N7.b.b();
        }
    }

    public static void h(Context context, b bVar) {
        if (N7.b.d()) {
            N7.b.a("Fresco.initializeDrawee");
        }
        g gVar = new g(context, bVar);
        f30370b = gVar;
        SimpleDraweeView.d(gVar);
        if (N7.b.d()) {
            N7.b.b();
        }
    }

    public static f i() {
        return f30370b.get();
    }
}
