package io.sentry.internal;

import io.sentry.C4778l3;
import io.sentry.InterfaceC4765j0;
import io.sentry.util.C4843a;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f52103d;

    /* renamed from: e, reason: collision with root package name */
    public static final C4843a f52104e = new C4843a();

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f52105a = false;

    /* renamed from: b, reason: collision with root package name */
    public final C0765a f52106b = new C0765a();

    /* renamed from: c, reason: collision with root package name */
    public C4843a f52107c = new C4843a();

    /* renamed from: io.sentry.internal.a$a, reason: collision with other inner class name */
    public static final class C0765a {

        /* renamed from: a, reason: collision with root package name */
        public volatile String f52108a;

        /* renamed from: b, reason: collision with root package name */
        public volatile String f52109b;
    }

    public static a a() {
        if (f52103d == null) {
            InterfaceC4765j0 d10 = f52104e.d();
            try {
                if (f52103d == null) {
                    f52103d = new a();
                }
                if (d10 != null) {
                    d10.close();
                }
            } catch (Throwable th2) {
                if (d10 != null) {
                    try {
                        d10.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        return f52103d;
    }

    public void b() {
        InterfaceC4765j0 d10;
        if (this.f52105a) {
            return;
        }
        try {
            d10 = this.f52107c.d();
            try {
            } finally {
            }
        } catch (IOException unused) {
        } catch (Throwable th2) {
            this.f52105a = true;
            throw th2;
        }
        if (this.f52105a) {
            if (d10 != null) {
                d10.close();
            }
            this.f52105a = true;
            return;
        }
        Enumeration<URL> resources = ClassLoader.getSystemClassLoader().getResources("META-INF/MANIFEST.MF");
        while (resources.hasMoreElements()) {
            try {
                Attributes mainAttributes = new Manifest(resources.nextElement().openStream()).getMainAttributes();
                if (mainAttributes != null) {
                    String value = mainAttributes.getValue("Sentry-Opentelemetry-SDK-Name");
                    String value2 = mainAttributes.getValue("Implementation-Version");
                    String value3 = mainAttributes.getValue("Sentry-SDK-Name");
                    String value4 = mainAttributes.getValue("Sentry-SDK-Package-Name");
                    if (value != null && value2 != null) {
                        this.f52106b.f52108a = value;
                        this.f52106b.f52109b = value2;
                        String value5 = mainAttributes.getValue("Sentry-Opentelemetry-Version-Name");
                        if (value5 != null) {
                            C4778l3.d().b("maven:io.opentelemetry:opentelemetry-sdk", value5);
                            C4778l3.d().a("OpenTelemetry");
                        }
                        String value6 = mainAttributes.getValue("Sentry-Opentelemetry-Javaagent-Version-Name");
                        if (value6 != null) {
                            C4778l3.d().b("maven:io.opentelemetry.javaagent:opentelemetry-javaagent", value6);
                            C4778l3.d().a("OpenTelemetry-Agent");
                        }
                        if (value.equals("sentry.java.opentelemetry.agentless")) {
                            C4778l3.d().a("OpenTelemetry-Agentless");
                        }
                        if (value.equals("sentry.java.opentelemetry.agentless-spring")) {
                            C4778l3.d().a("OpenTelemetry-Agentless-Spring");
                        }
                    }
                    if (value3 != null && value2 != null && value4 != null && value3.startsWith("sentry.java")) {
                        C4778l3.d().b(value4, value2);
                    }
                }
            } catch (Exception unused2) {
            }
        }
        if (d10 != null) {
            d10.close();
        }
        this.f52105a = true;
    }
}
