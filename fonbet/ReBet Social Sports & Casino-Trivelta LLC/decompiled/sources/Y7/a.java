package Y7;

import V7.b;
import V7.c;
import android.os.Handler;
import android.os.Looper;
import g6.C4331C;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f14082a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final Set f14083b = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c, reason: collision with root package name */
    public static boolean f14084c;

    /* renamed from: Y7.a$a, reason: collision with other inner class name */
    public static final class RunnableC0289a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Throwable f14085a;

        public RunnableC0289a(Throwable th2) {
            this.f14085a = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new RuntimeException(this.f14085a);
        }
    }

    public static final void a() {
        f14084c = true;
    }

    public static final void b(Throwable th2, Object o10) {
        Intrinsics.checkNotNullParameter(o10, "o");
        if (f14084c) {
            f14083b.add(o10);
            if (C4331C.p()) {
                b.c(th2);
                c.a aVar = c.a.f12570a;
                c.a.b(th2, c.EnumC0263c.CrashShield).f();
            }
            e(th2);
        }
    }

    public static final boolean c() {
        return false;
    }

    public static final boolean d(Object o10) {
        Intrinsics.checkNotNullParameter(o10, "o");
        return f14083b.contains(o10);
    }

    public static final void e(Throwable th2) {
        if (c()) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0289a(th2));
        }
    }
}
