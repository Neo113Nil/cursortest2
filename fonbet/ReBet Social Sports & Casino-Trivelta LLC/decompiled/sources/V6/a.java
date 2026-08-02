package V6;

import android.os.Looper;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static a f12522a;

    /* renamed from: V6.a$a, reason: collision with other inner class name */
    public interface InterfaceC0262a {
        void release();
    }

    public static synchronized a b() {
        a aVar;
        synchronized (a.class) {
            try {
                if (f12522a == null) {
                    f12522a = new b();
                }
                aVar = f12522a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public static boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public abstract void a(InterfaceC0262a interfaceC0262a);

    public abstract void d(InterfaceC0262a interfaceC0262a);
}
