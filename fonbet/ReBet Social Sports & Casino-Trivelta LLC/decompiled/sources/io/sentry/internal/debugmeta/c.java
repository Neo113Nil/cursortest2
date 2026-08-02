package io.sentry.internal.debugmeta;

import io.sentry.EnumC4788n3;
import io.sentry.ILogger;
import io.sentry.util.AbstractC4844b;
import io.sentry.util.AbstractC4846d;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

/* loaded from: classes3.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final ILogger f52111a;

    /* renamed from: b, reason: collision with root package name */
    public final ClassLoader f52112b;

    public c(ILogger iLogger) {
        this(iLogger, c.class.getClassLoader());
    }

    @Override // io.sentry.internal.debugmeta.a
    public List a() {
        InputStream openStream;
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.f52112b.getResources(AbstractC4846d.f52794a);
            while (resources.hasMoreElements()) {
                URL nextElement = resources.nextElement();
                try {
                    openStream = nextElement.openStream();
                } catch (RuntimeException e10) {
                    this.f52111a.a(EnumC4788n3.ERROR, e10, "%s file is malformed.", nextElement);
                }
                try {
                    Properties properties = new Properties();
                    properties.load(openStream);
                    arrayList.add(properties);
                    this.f52111a.c(EnumC4788n3.INFO, "Debug Meta Data Properties loaded from %s", nextElement);
                    if (openStream != null) {
                        openStream.close();
                    }
                } catch (Throwable th2) {
                    if (openStream != null) {
                        try {
                            openStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        } catch (IOException e11) {
            this.f52111a.a(EnumC4788n3.ERROR, e11, "Failed to load %s", AbstractC4846d.f52794a);
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        this.f52111a.c(EnumC4788n3.INFO, "No %s file was found.", AbstractC4846d.f52794a);
        return null;
    }

    public c(ILogger iLogger, ClassLoader classLoader) {
        this.f52111a = iLogger;
        this.f52112b = AbstractC4844b.a(classLoader);
    }
}
