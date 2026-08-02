package x8;

/* renamed from: x8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6803a {

    /* renamed from: a, reason: collision with root package name */
    public static InterfaceC6804b f67953a;

    public static void a(InterfaceC6804b interfaceC6804b) {
        synchronized (AbstractC6803a.class) {
            try {
                if (f67953a != null) {
                    throw new IllegalStateException("Cannot re-initialize NativeLoader.");
                }
                f67953a = interfaceC6804b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void b(InterfaceC6804b interfaceC6804b) {
        if (c()) {
            return;
        }
        a(interfaceC6804b);
    }

    public static boolean c() {
        boolean z10;
        synchronized (AbstractC6803a.class) {
            z10 = f67953a != null;
        }
        return z10;
    }

    public static boolean d(String str) {
        return e(str, 0);
    }

    public static boolean e(String str, int i10) {
        InterfaceC6804b interfaceC6804b;
        synchronized (AbstractC6803a.class) {
            interfaceC6804b = f67953a;
            if (interfaceC6804b == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return interfaceC6804b.a(str, i10);
    }
}
