package io.sentry.util;

import io.sentry.C4778l3;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

/* renamed from: io.sentry.util.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4846d {

    /* renamed from: a, reason: collision with root package name */
    public static String f52794a = "sentry-debug-meta.properties";

    public static void a(F3 f32, List list) {
        if (list != null) {
            f(f32, list);
            b(f32, list);
            d(f32, list);
        }
    }

    public static void b(F3 f32, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Properties properties = (Properties) it.next();
            String g10 = g(properties);
            if (g10 != null) {
                String h10 = h(properties);
                if (h10 == null) {
                    h10 = "unknown";
                }
                f32.getLogger().c(EnumC4788n3.DEBUG, "Build tool found: %s, version %s", g10, h10);
                C4778l3.d().b(g10, h10);
                return;
            }
        }
    }

    public static void c(F3 f32, List list) {
        if (f32.getBundleIds().isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String property = ((Properties) it.next()).getProperty("io.sentry.bundle-ids");
                f32.getLogger().c(EnumC4788n3.DEBUG, "Bundle IDs found: %s", property);
                if (property != null) {
                    for (String str : property.split(",", -1)) {
                        f32.addBundleId(str);
                    }
                }
            }
        }
    }

    public static void d(F3 f32, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Properties properties = (Properties) it.next();
            String l10 = l(properties);
            String m10 = m(properties);
            String i10 = i(properties);
            String j10 = j(properties);
            String k10 = k(properties);
            if (l10 != null || m10 != null || i10 != null || j10 != null || k10 != null) {
                F3.g distribution = f32.getDistribution();
                if (l10 != null && !l10.isEmpty() && distribution.f50325b.isEmpty()) {
                    f32.getLogger().c(EnumC4788n3.DEBUG, "Distribution org slug found: %s", l10);
                    distribution.f50325b = l10;
                }
                if (m10 != null && !m10.isEmpty() && distribution.f50326c.isEmpty()) {
                    f32.getLogger().c(EnumC4788n3.DEBUG, "Distribution project slug found: %s", m10);
                    distribution.f50326c = m10;
                }
                if (i10 != null && !i10.isEmpty() && distribution.f50324a.isEmpty()) {
                    f32.getLogger().c(EnumC4788n3.DEBUG, "Distribution org auth token found", new Object[0]);
                    distribution.f50324a = i10;
                }
                if (j10 != null && !j10.isEmpty() && distribution.f50328e == null) {
                    f32.getLogger().c(EnumC4788n3.DEBUG, "Distribution build configuration found: %s", j10);
                    distribution.f50328e = j10;
                }
                if (k10 == null || k10.isEmpty() || distribution.f50329f != null) {
                    return;
                }
                String[] split = k10.split(",", -1);
                ArrayList arrayList = new ArrayList();
                for (String str : split) {
                    String trim = str.trim();
                    if (!trim.isEmpty()) {
                        arrayList.add(trim);
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                f32.getLogger().c(EnumC4788n3.DEBUG, "Distribution install groups override found: %s", arrayList);
                distribution.f50329f = arrayList;
                return;
            }
        }
    }

    public static void e(F3 f32, List list) {
        if (f32.getProguardUuid() == null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String n10 = n((Properties) it.next());
                if (n10 != null) {
                    f32.getLogger().c(EnumC4788n3.DEBUG, "Proguard UUID found: %s", n10);
                    f32.setProguardUuid(n10);
                    return;
                }
            }
        }
    }

    public static void f(F3 f32, List list) {
        if (list != null) {
            c(f32, list);
            e(f32, list);
        }
    }

    public static String g(Properties properties) {
        return properties.getProperty("io.sentry.build-tool");
    }

    public static String h(Properties properties) {
        return properties.getProperty("io.sentry.build-tool-version");
    }

    public static String i(Properties properties) {
        return properties.getProperty("io.sentry.distribution.auth-token");
    }

    public static String j(Properties properties) {
        return properties.getProperty("io.sentry.distribution.build-configuration");
    }

    public static String k(Properties properties) {
        return properties.getProperty("io.sentry.distribution.install-groups-override");
    }

    public static String l(Properties properties) {
        return properties.getProperty("io.sentry.distribution.org-slug");
    }

    public static String m(Properties properties) {
        return properties.getProperty("io.sentry.distribution.project-slug");
    }

    public static String n(Properties properties) {
        return properties.getProperty("io.sentry.ProguardUuids");
    }
}
