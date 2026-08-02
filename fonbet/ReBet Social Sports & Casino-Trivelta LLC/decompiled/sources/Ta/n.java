package Ta;

import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Object f11385a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final String f11386b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Logger f11387c;

    public n(Class cls) {
        this.f11386b = cls.getName();
    }

    public Logger a() {
        Logger logger = this.f11387c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f11385a) {
            try {
                Logger logger2 = this.f11387c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f11386b);
                this.f11387c = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
