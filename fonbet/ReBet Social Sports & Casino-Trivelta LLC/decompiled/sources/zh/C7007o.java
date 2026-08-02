package zh;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: zh.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7007o {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f69213a;

    /* renamed from: b, reason: collision with root package name */
    public static final C7007o f69214b;

    static {
        Logger logger = Logger.getLogger(C7007o.class.getName());
        f69213a = logger;
        C7007o a10 = AbstractC7005m.a();
        f69214b = a10;
        if (a10.getClass() != C7007o.class) {
            logger.log(Level.FINE, "Using the APIs optimized for: {0}", a10.c());
        }
    }

    public static C7007o b() {
        return f69214b;
    }

    public long a() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    public String c() {
        return "Java 8";
    }
}
