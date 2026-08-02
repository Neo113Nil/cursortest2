package io.sentry.internal.modules;

import io.sentry.EnumC4788n3;
import io.sentry.ILogger;
import io.sentry.util.AbstractC4844b;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class c extends d {

    /* renamed from: e, reason: collision with root package name */
    public final Pattern f52119e;

    /* renamed from: f, reason: collision with root package name */
    public final Pattern f52120f;

    /* renamed from: g, reason: collision with root package name */
    public final ClassLoader f52121g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f52122a;

        /* renamed from: b, reason: collision with root package name */
        public final String f52123b;

        public a(String str, String str2) {
            this.f52122a = str;
            this.f52123b = str2;
        }
    }

    public c(ILogger iLogger) {
        this(c.class.getClassLoader(), iLogger);
    }

    @Override // io.sentry.internal.modules.d
    public Map b() {
        HashMap hashMap = new HashMap();
        for (a aVar : e()) {
            hashMap.put(aVar.f52122a, aVar.f52123b);
        }
        return hashMap;
    }

    public final a d(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = this.f52120f.matcher(str);
        if (matcher.matches() && matcher.groupCount() == 2) {
            return new a(matcher.group(1), matcher.group(2));
        }
        return null;
    }

    public final List e() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.f52121g.getResources("META-INF/MANIFEST.MF");
            while (resources.hasMoreElements()) {
                a d10 = d(f(resources.nextElement()));
                if (d10 != null) {
                    arrayList.add(d10);
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            this.f52125a.b(EnumC4788n3.ERROR, "Unable to detect modules via manifest files.", th2);
            return arrayList;
        }
    }

    public final String f(URL url) {
        Matcher matcher = this.f52119e.matcher(url.toString());
        if (matcher.matches() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        return null;
    }

    public c(ClassLoader classLoader, ILogger iLogger) {
        super(iLogger);
        this.f52119e = Pattern.compile(".*/(.+)!/META-INF/MANIFEST.MF");
        this.f52120f = Pattern.compile("(.*?)-(\\d+\\.\\d+.*).jar");
        this.f52121g = AbstractC4844b.a(classLoader);
    }
}
