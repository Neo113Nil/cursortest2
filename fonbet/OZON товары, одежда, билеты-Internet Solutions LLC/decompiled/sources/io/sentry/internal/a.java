package io.sentry.internal;

import io.sentry.G2;
import io.sentry.InterfaceC7097a0;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.Attributes;
import java.util.jar.Manifest;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f67992c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final io.sentry.util.a f67993d = new io.sentry.util.a();

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f67994a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private io.sentry.util.a f67995b;

    /* renamed from: io.sentry.internal.a$a, reason: collision with other inner class name */
    public static final class C1114a {
    }

    @NotNull
    public static a a() {
        if (f67992c == null) {
            InterfaceC7097a0 a11 = f67993d.a();
            try {
                if (f67992c == null) {
                    a aVar = new a();
                    aVar.f67994a = false;
                    aVar.f67995b = new io.sentry.util.a();
                    f67992c = aVar;
                }
                a11.close();
            } catch (Throwable th2) {
                try {
                    a11.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return f67992c;
    }

    public final void b() {
        InterfaceC7097a0 a11;
        if (this.f67994a) {
            return;
        }
        try {
            a11 = this.f67995b.a();
            try {
            } finally {
            }
        } catch (IOException unused) {
        } catch (Throwable th2) {
            this.f67994a = true;
            throw th2;
        }
        if (this.f67994a) {
            a11.close();
            this.f67994a = true;
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
                        String value5 = mainAttributes.getValue("Sentry-Opentelemetry-Version-Name");
                        if (value5 != null) {
                            G2.d().b("maven:io.opentelemetry:opentelemetry-sdk", value5);
                            G2.d().a("OpenTelemetry");
                        }
                        String value6 = mainAttributes.getValue("Sentry-Opentelemetry-Javaagent-Version-Name");
                        if (value6 != null) {
                            G2.d().b("maven:io.opentelemetry.javaagent:opentelemetry-javaagent", value6);
                            G2.d().a("OpenTelemetry-Agent");
                        }
                        if (value.equals("sentry.java.opentelemetry.agentless")) {
                            G2.d().a("OpenTelemetry-Agentless");
                        }
                        if (value.equals("sentry.java.opentelemetry.agentless-spring")) {
                            G2.d().a("OpenTelemetry-Agentless-Spring");
                        }
                    }
                    if (value3 != null && value2 != null && value4 != null && value3.startsWith("sentry.java")) {
                        G2.d().b(value4, value2);
                    }
                }
            } catch (Exception unused2) {
            }
        }
        a11.close();
        this.f67994a = true;
    }
}
