package ph;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ph.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6070a {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f63204a = Logger.getLogger(AbstractC6070a.class.getName());

    public static void a(String str) {
        b(str, Level.FINEST);
    }

    public static void b(String str, Level level) {
        Logger logger = f63204a;
        if (logger.isLoggable(level)) {
            logger.log(level, str, (Throwable) new AssertionError());
        }
    }
}
