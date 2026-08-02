package io.sentry;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17087a;

    /* renamed from: b, reason: collision with root package name */
    public final b6 f17088b;

    public /* synthetic */ t(b6 b6Var, int i5) {
        this.f17087a = i5;
        this.f17088b = b6Var;
    }

    @Override // io.sentry.n1
    public boolean a() {
        r a7;
        switch (this.f17087a) {
            case 0:
                return z4.d().c(this.f17088b.getFatalLogger());
            default:
                if (io.sentry.internal.a.f16511c == null) {
                    a7 = io.sentry.internal.a.f16512d.a();
                    try {
                        if (io.sentry.internal.a.f16511c == null) {
                            io.sentry.internal.a.f16511c = new io.sentry.internal.a();
                        }
                        a7.close();
                    } finally {
                        try {
                            a7.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                }
                io.sentry.internal.a aVar = io.sentry.internal.a.f16511c;
                if (!aVar.f16513a) {
                    try {
                        a7 = aVar.f16514b.a();
                        try {
                            if (!aVar.f16513a) {
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
                                                    z4.d().b("maven:io.opentelemetry:opentelemetry-sdk", value5);
                                                    z4.d().a("OpenTelemetry");
                                                }
                                                String value6 = mainAttributes.getValue("Sentry-Opentelemetry-Javaagent-Version-Name");
                                                if (value6 != null) {
                                                    z4.d().b("maven:io.opentelemetry.javaagent:opentelemetry-javaagent", value6);
                                                    z4.d().a("OpenTelemetry-Agent");
                                                }
                                                if (value.equals("sentry.java.opentelemetry.agentless")) {
                                                    z4.d().a("OpenTelemetry-Agentless");
                                                }
                                                if (value.equals("sentry.java.opentelemetry.agentless-spring")) {
                                                    z4.d().a("OpenTelemetry-Agentless-Spring");
                                                }
                                            }
                                            if (value3 != null && value2 != null && value4 != null && value3.startsWith("sentry.java")) {
                                                z4.d().b(value4, value2);
                                            }
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            a7.close();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    } catch (IOException unused2) {
                    } catch (Throwable th4) {
                        aVar.f16513a = true;
                        throw th4;
                    }
                    aVar.f16513a = true;
                }
                return z4.d().c(this.f17088b.getFatalLogger());
        }
    }

    public List b() {
        ArrayList c2 = c(new Exception().getStackTrace(), false);
        if (c2 == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(c2.size());
        Iterator it = c2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (Boolean.TRUE.equals(((io.sentry.protocol.z) next).f16952k)) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(c2.size());
        Iterator it2 = c2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            String str = ((io.sentry.protocol.z) next2).f16948f;
            if (str == null || (!str.startsWith("sun.") && !str.startsWith("java.") && !str.startsWith("android.") && !str.startsWith("com.android."))) {
                arrayList2.add(next2);
            }
        }
        return arrayList2;
    }

    public ArrayList c(StackTraceElement[] stackTraceElementArr, boolean z5) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (z5 || !className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
                    io.sentry.protocol.z zVar = new io.sentry.protocol.z();
                    zVar.f16952k = d(className);
                    zVar.f16948f = className;
                    zVar.f16947e = stackTraceElement.getMethodName();
                    zVar.f16946d = stackTraceElement.getFileName();
                    if (stackTraceElement.getLineNumber() >= 0) {
                        zVar.f16949g = Integer.valueOf(stackTraceElement.getLineNumber());
                    }
                    zVar.f16954m = Boolean.valueOf(stackTraceElement.isNativeMethod());
                    arrayList.add(zVar);
                    if (arrayList.size() >= 100) {
                        break;
                    }
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public Boolean d(String str) {
        if (str == null || str.isEmpty()) {
            return Boolean.TRUE;
        }
        b6 b6Var = this.f17088b;
        Iterator<String> it = b6Var.getInAppIncludes().iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return Boolean.TRUE;
            }
        }
        Iterator<String> it2 = b6Var.getInAppExcludes().iterator();
        while (it2.hasNext()) {
            if (str.startsWith(it2.next())) {
                return Boolean.FALSE;
            }
        }
        return null;
    }
}
