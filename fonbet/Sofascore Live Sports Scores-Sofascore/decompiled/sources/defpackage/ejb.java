package defpackage;

import com.ironsource.U3;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class ejb {
    public static volatile int a;
    public static final u2d b = new u2d(1);
    public static final u2d c = new u2d(0);
    public static volatile u2d d;
    public static final String[] e;

    static {
        String str;
        try {
            str = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            str.equalsIgnoreCase("true");
        }
        e = new String[]{"2.0"};
    }

    public static ArrayList a() {
        ArrayList arrayList = new ArrayList();
        final ClassLoader classLoader = ejb.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        u2d u2dVar = null;
        if (property != null && !property.isEmpty()) {
            try {
                sha.M("Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property");
                u2dVar = (u2d) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e2) {
                sha.N("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e2);
            } catch (ClassNotFoundException e3) {
                e = e3;
                sha.N("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (IllegalAccessException e4) {
                e = e4;
                sha.N("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InstantiationException e5) {
                e = e5;
                sha.N("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (NoSuchMethodException e6) {
                e = e6;
                sha.N("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InvocationTargetException e7) {
                e = e7;
                sha.N("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            }
        }
        if (u2dVar != null) {
            arrayList.add(u2dVar);
            return arrayList;
        }
        Iterator it = (System.getSecurityManager() == null ? ServiceLoader.load(u2d.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: djb
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ServiceLoader.load(u2d.class, classLoader);
            }
        })).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((u2d) it.next());
            } catch (ServiceConfigurationError e8) {
                sha.M("A SLF4J service provider failed to instantiate:\n" + e8.getMessage());
            }
        }
        return arrayList;
    }

    public static bjb b(String str) {
        u2d u2dVar;
        im9 im9Var;
        if (a == 0) {
            synchronized (ejb.class) {
                try {
                    if (a == 0) {
                        a = 1;
                        c();
                    }
                } finally {
                }
            }
        }
        int i = a;
        if (i == 1) {
            u2dVar = b;
        } else {
            if (i == 2) {
                a70.r("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
                return null;
            }
            if (i == 3) {
                u2dVar = d;
            } else {
                if (i != 4) {
                    a70.r("Unreachable code");
                    return null;
                }
                u2dVar = c;
            }
        }
        switch (u2dVar.a) {
            case 0:
                im9Var = (a99) u2dVar.b;
                break;
            default:
                im9Var = (vv4) u2dVar.b;
                break;
        }
        return im9Var.c(str);
    }

    public static final void c() {
        try {
            ArrayList a2 = a();
            f(a2);
            if (a2.isEmpty()) {
                a = 4;
                sha.M("No SLF4J providers were found.");
                sha.M("Defaulting to no-operation (NOP) logger implementation");
                sha.M("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = ejb.class.getClassLoader();
                    Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    while (systemResources.hasMoreElements()) {
                        linkedHashSet.add(systemResources.nextElement());
                    }
                } catch (IOException e2) {
                    sha.N("Error getting resources from path", e2);
                }
                e(linkedHashSet);
            } else {
                d = (u2d) a2.get(0);
                d.getClass();
                a = 3;
                if (!a2.isEmpty() && a2.size() > 1) {
                    sha.M("Actual provider is of type [" + a2.get(0) + U3.j.e);
                }
            }
            d();
            if (a == 3) {
                try {
                    switch (d.a) {
                        case 0:
                            boolean z = false;
                            for (String str : e) {
                                if ("2.0.99".startsWith(str)) {
                                    z = true;
                                }
                            }
                            if (z) {
                                return;
                            }
                            sha.M("The requested version 2.0.99 by your slf4j provider is not compatible with " + Arrays.asList(e).toString());
                            sha.M("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                            return;
                        default:
                            throw new UnsupportedOperationException();
                    }
                } catch (NoSuchFieldError unused) {
                } catch (Throwable th) {
                    sha.N("Unexpected problem occurred during version sanity check", th);
                }
            }
        } catch (Exception e3) {
            a = 2;
            sha.N("Failed to instantiate SLF4J LoggerFactory", e3);
            sw9.m("Unexpected initialization failure", e3);
        }
    }

    public static void d() {
        u2d u2dVar = b;
        synchronized (u2dVar) {
            try {
                ((vv4) u2dVar.b).a = true;
                Iterator it = new ArrayList(((ConcurrentHashMap) ((vv4) u2dVar.b).b).values()).iterator();
                while (it.hasNext()) {
                    hli hliVar = (hli) it.next();
                    hliVar.b = b(hliVar.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) ((vv4) b.b).c;
        int size = linkedBlockingQueue.size();
        ArrayList arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ili iliVar = (ili) it2.next();
                if (iliVar != null) {
                    hli hliVar2 = iliVar.b;
                    String str = hliVar2.a;
                    if (hliVar2.b == null) {
                        a70.r("Delegate logger cannot be null at this state.");
                        return;
                    } else if (!(hliVar2.b instanceof t2d)) {
                        if (!hliVar2.b()) {
                            sha.M(str);
                        } else if (hliVar2.m(iliVar.a) && hliVar2.b()) {
                            try {
                                hliVar2.d.invoke(hliVar2.b, iliVar);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (iliVar.b.b()) {
                        sha.M("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        sha.M("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        sha.M("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(iliVar.b.b instanceof t2d)) {
                        sha.M("The following set of substitute loggers may have been accessed");
                        sha.M("during the initialization phase. Logging calls during this");
                        sha.M("phase were not honored. However, subsequent logging calls to these");
                        sha.M("loggers will work as normally expected.");
                        sha.M("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
        vv4 vv4Var = (vv4) b.b;
        ((ConcurrentHashMap) vv4Var.b).clear();
        ((LinkedBlockingQueue) vv4Var.c).clear();
    }

    public static void e(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        sha.M("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            sha.M("Ignoring binding found at [" + ((URL) it.next()) + U3.j.e);
        }
        sha.M("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    public static void f(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            sha.M("Class path contains multiple SLF4J providers.");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sha.M("Found provider [" + ((u2d) it.next()) + U3.j.e);
            }
            sha.M("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
