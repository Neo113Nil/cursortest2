package li;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.ServiceLoader;

/* renamed from: li.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5470d {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f55869a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC5470d f55870b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f55871c;

    /* renamed from: li.d$a */
    public static class a extends AbstractC5470d {
        public a() {
            if (AbstractC5470d.f55869a) {
                throw new IllegalStateException("The module time4j-android is not active. Check your configuration.");
            }
        }

        @Override // li.AbstractC5470d
        public InputStream e(URI uri, boolean z10) {
            if (uri != null && !AbstractC5470d.f55871c) {
                try {
                    URL url = uri.toURL();
                    if (!z10) {
                        return url.openStream();
                    }
                    URLConnection openConnection = url.openConnection();
                    openConnection.setUseCaches(false);
                    openConnection.connect();
                    return openConnection.getInputStream();
                } catch (IOException e10) {
                    if (uri.toString().contains(".repository")) {
                        System.err.println("Warning: Loading of resource " + uri + " failed (" + e10.getMessage() + "). Consider setting the system property \"net.time4j.base.useClassloaderOnly\" for reducing overhead.");
                        e10.printStackTrace(System.err);
                    }
                }
            }
            return null;
        }

        @Override // li.AbstractC5470d
        public URI f(String str, Class cls, String str2) {
            String str3;
            try {
                try {
                    ProtectionDomain protectionDomain = cls.getProtectionDomain();
                    CodeSource codeSource = protectionDomain == null ? null : protectionDomain.getCodeSource();
                    if (codeSource != null) {
                        str3 = codeSource.getLocation().toExternalForm();
                        try {
                            if (str3.endsWith(".jar")) {
                                str3 = "jar:" + str3 + "!/";
                            }
                            str3 = str3 + str2;
                            return new URI(str3);
                        } catch (URISyntaxException unused) {
                            System.err.println("Warning: malformed resource path = " + str3);
                            return null;
                        }
                    }
                } catch (SecurityException unused2) {
                }
            } catch (URISyntaxException unused3) {
                str3 = null;
            }
            return null;
        }

        @Override // li.AbstractC5470d
        public Iterable g(Class cls) {
            return ServiceLoader.load(cls, cls.getClassLoader());
        }
    }

    static {
        boolean equalsIgnoreCase = "Dalvik".equalsIgnoreCase(System.getProperty("java.vm.name"));
        f55869a = equalsIgnoreCase;
        f55871c = !equalsIgnoreCase && Boolean.getBoolean("net.time4j.base.useClassloaderOnly");
        String property = System.getProperty("net.time4j.base.ResourceLoader");
        if (property == null) {
            f55870b = new a();
            return;
        }
        try {
            f55870b = (AbstractC5470d) Class.forName(property).newInstance();
        } catch (Exception e10) {
            throw new AssertionError("Wrong configuration of external resource loader: " + e10.getMessage());
        }
    }

    public static AbstractC5470d c() {
        return f55870b;
    }

    public final InputStream d(Class cls, String str, boolean z10) {
        if (f55869a) {
            throw new FileNotFoundException(str);
        }
        URL resource = cls.getClassLoader().getResource(str);
        if (resource == null) {
            throw new FileNotFoundException(str);
        }
        if (!z10) {
            return resource.openStream();
        }
        URLConnection openConnection = resource.openConnection();
        openConnection.setUseCaches(false);
        openConnection.connect();
        return openConnection.getInputStream();
    }

    public abstract InputStream e(URI uri, boolean z10);

    public abstract URI f(String str, Class cls, String str2);

    public abstract Iterable g(Class cls);
}
