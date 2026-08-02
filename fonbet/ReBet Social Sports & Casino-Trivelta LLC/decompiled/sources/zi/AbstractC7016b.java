package zi;

import Ai.e;
import Ai.f;
import Ai.g;
import com.twilio.voice.Constants;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;
import org.slf4j.event.d;
import org.slf4j.impl.StaticLoggerBinder;

/* renamed from: zi.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7016b {

    /* renamed from: a, reason: collision with root package name */
    public static volatile int f69219a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f69220b = new f();

    /* renamed from: c, reason: collision with root package name */
    public static final Ai.c f69221c = new Ai.c();

    /* renamed from: d, reason: collision with root package name */
    public static boolean f69222d = g.f("slf4j.detectLoggerNameMismatch");
    private static final String[] API_COMPATIBILITY_LIST = {"1.6", "1.7"};

    /* renamed from: e, reason: collision with root package name */
    public static String f69223e = "org/slf4j/impl/StaticLoggerBinder.class";

    public static final void a() {
        Set set;
        try {
            try {
                if (l()) {
                    set = null;
                } else {
                    set = f();
                    t(set);
                }
                StaticLoggerBinder.getSingleton();
                f69219a = 3;
                s(set);
                p();
            } catch (Exception e10) {
                e(e10);
                throw new IllegalStateException("Unexpected initialization failure", e10);
            } catch (NoClassDefFoundError e11) {
                if (!m(e11.getMessage())) {
                    e(e11);
                    throw e11;
                }
                f69219a = 4;
                g.c("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                g.c("Defaulting to no-operation (NOP) logger implementation");
                g.c("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
                p();
            } catch (NoSuchMethodError e12) {
                String message = e12.getMessage();
                if (message != null && message.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                    f69219a = 2;
                    g.c("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                    g.c("Your binding is version 1.5.5 or earlier.");
                    g.c("Upgrade your binding to version 1.6.x.");
                }
                throw e12;
            }
        } catch (Throwable th2) {
            p();
            throw th2;
        }
    }

    public static void b(d dVar, int i10) {
        if (dVar.a().e()) {
            c(i10);
        } else {
            if (dVar.a().f()) {
                return;
            }
            d();
        }
    }

    public static void c(int i10) {
        g.c("A number (" + i10 + ") of logging calls during the initialization phase have been intercepted and are");
        g.c("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        g.c("See also http://www.slf4j.org/codes.html#replay");
    }

    public static void d() {
        g.c("The following set of substitute loggers may have been accessed");
        g.c("during the initialization phase. Logging calls during this");
        g.c("phase were not honored. However, subsequent logging calls to these");
        g.c("loggers will work as normally expected.");
        g.c("See also http://www.slf4j.org/codes.html#substituteLogger");
    }

    public static void e(Throwable th2) {
        f69219a = 2;
        g.d("Failed to instantiate SLF4J LoggerFactory", th2);
    }

    public static Set f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = AbstractC7016b.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(f69223e) : classLoader.getResources(f69223e);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
            return linkedHashSet;
        } catch (IOException e10) {
            g.d("Error getting resources from path", e10);
            return linkedHashSet;
        }
    }

    public static void g() {
        f fVar = f69220b;
        synchronized (fVar) {
            try {
                fVar.e();
                for (e eVar : fVar.d()) {
                    eVar.i(j(eVar.getName()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static ILoggerFactory h() {
        if (f69219a == 0) {
            synchronized (AbstractC7016b.class) {
                try {
                    if (f69219a == 0) {
                        f69219a = 1;
                        o();
                    }
                } finally {
                }
            }
        }
        int i10 = f69219a;
        if (i10 == 1) {
            return f69220b;
        }
        if (i10 == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i10 == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i10 == 4) {
            return f69221c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    public static InterfaceC7015a i(Class cls) {
        Class a10;
        InterfaceC7015a j10 = j(cls.getName());
        if (f69222d && (a10 = g.a()) != null && n(cls, a10)) {
            g.c(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", j10.getName(), a10.getName()));
            g.c("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return j10;
    }

    public static InterfaceC7015a j(String str) {
        return h().a(str);
    }

    public static boolean k(Set set) {
        return set.size() > 1;
    }

    public static boolean l() {
        String g10 = g.g("java.vendor.url");
        if (g10 == null) {
            return false;
        }
        return g10.toLowerCase().contains(Constants.PLATFORM_ANDROID);
    }

    public static boolean m(String str) {
        if (str == null) {
            return false;
        }
        return str.contains("org/slf4j/impl/StaticLoggerBinder") || str.contains("org.slf4j.impl.StaticLoggerBinder");
    }

    public static boolean n(Class cls, Class cls2) {
        return !cls2.isAssignableFrom(cls);
    }

    public static final void o() {
        a();
        if (f69219a == 3) {
            u();
        }
    }

    public static void p() {
        g();
        q();
        f69220b.b();
    }

    public static void q() {
        LinkedBlockingQueue c10 = f69220b.c();
        int size = c10.size();
        ArrayList<d> arrayList = new ArrayList(128);
        int i10 = 0;
        while (c10.drainTo(arrayList, 128) != 0) {
            for (d dVar : arrayList) {
                r(dVar);
                int i11 = i10 + 1;
                if (i10 == 0) {
                    b(dVar, size);
                }
                i10 = i11;
            }
            arrayList.clear();
        }
    }

    public static void r(d dVar) {
        if (dVar == null) {
            return;
        }
        e a10 = dVar.a();
        String name = a10.getName();
        if (a10.g()) {
            throw new IllegalStateException("Delegate logger cannot be null at this state.");
        }
        if (a10.f()) {
            return;
        }
        if (a10.e()) {
            a10.h(dVar);
        } else {
            g.c(name);
        }
    }

    public static void s(Set set) {
        if (set == null || !k(set)) {
            return;
        }
        g.c("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
    }

    public static void t(Set set) {
        if (k(set)) {
            g.c("Class path contains multiple SLF4J bindings.");
            Iterator it = set.iterator();
            while (it.hasNext()) {
                g.c("Found binding in [" + ((URL) it.next()) + "]");
            }
            g.c("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    public static final void u() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z10 = false;
            for (String str2 : API_COMPATIBILITY_LIST) {
                if (str.startsWith(str2)) {
                    z10 = true;
                }
            }
            if (z10) {
                return;
            }
            g.c("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(API_COMPATIBILITY_LIST).toString());
            g.c("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th2) {
            g.d("Unexpected problem occured during version sanity check", th2);
        }
    }
}
