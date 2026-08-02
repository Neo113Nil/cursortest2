package io.sentry.internal.modules;

import io.sentry.I2;
import io.sentry.ILogger;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class c extends d {

    /* renamed from: e, reason: collision with root package name */
    private final Pattern f68004e;

    /* renamed from: f, reason: collision with root package name */
    private final Pattern f68005f;

    /* renamed from: g, reason: collision with root package name */
    private final ClassLoader f68006g;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f68007a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f68008b;

        public a(@NotNull String str, @NotNull String str2) {
            this.f68007a = str;
            this.f68008b = str2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull ILogger iLogger) {
        super(iLogger);
        ClassLoader classLoader = c.class.getClassLoader();
        this.f68004e = Pattern.compile(".*/(.+)!/META-INF/MANIFEST.MF");
        this.f68005f = Pattern.compile("(.*?)-(\\d+\\.\\d+.*).jar");
        this.f68006g = io.sentry.util.b.a(classLoader);
    }

    @Override // io.sentry.internal.modules.d
    protected final Map<String, String> b() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.f68006g.getResources("META-INF/MANIFEST.MF");
            while (resources.hasMoreElements()) {
                Matcher matcher = this.f68004e.matcher(resources.nextElement().toString());
                a aVar = null;
                String group = (matcher.matches() && matcher.groupCount() == 1) ? matcher.group(1) : null;
                if (group != null) {
                    Matcher matcher2 = this.f68005f.matcher(group);
                    if (matcher2.matches() && matcher2.groupCount() == 2) {
                        aVar = new a(matcher2.group(1), matcher2.group(2));
                    }
                }
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
        } catch (Throwable th2) {
            this.f68010a.a(I2.ERROR, "Unable to detect modules via manifest files.", th2);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar2 = (a) it.next();
            hashMap.put(aVar2.f68007a, aVar2.f68008b);
        }
        return hashMap;
    }
}
