package defpackage;

import com.ironsource.U3;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jo2 {
    public static final Logger c = Logger.getLogger(ao2.class.getName());
    public final Object a = new Object();
    public final f8a b;

    public jo2(f8a f8aVar, long j, String str) {
        this.b = f8aVar;
        b(new a8a(str.concat(" created"), z7a.a, j, null));
    }

    public static void a(f8a f8aVar, Level level, String str) {
        Logger logger = c;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, U3.j.d + f8aVar + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    public final void b(a8a a8aVar) {
        int ordinal = a8aVar.b.ordinal();
        Level level = ordinal != 2 ? ordinal != 3 ? Level.FINEST : Level.FINE : Level.FINER;
        synchronized (this.a) {
        }
        a(this.b, level, a8aVar.a);
    }
}
