package defpackage;

import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.lang.reflect.Proxy;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class ik5 {
    public static ActivityEmbeddingComponent a() {
        if (!c()) {
            return b();
        }
        ClassLoader classLoader = jk5.class.getClassLoader();
        if (classLoader != null) {
            hpo hpoVar = new hpo(classLoader);
            WindowExtensions windowExtensions = WindowExtensionsProvider.getWindowExtensions();
            windowExtensions.getClass();
            ActivityEmbeddingComponent a = new hog(classLoader, hpoVar, windowExtensions).a();
            if (a != null) {
                return a;
            }
        }
        return b();
    }

    public static ActivityEmbeddingComponent b() {
        Object newProxyInstance = Proxy.newProxyInstance(jk5.class.getClassLoader(), new Class[]{ActivityEmbeddingComponent.class}, new hk5());
        newProxyInstance.getClass();
        return (ActivityEmbeddingComponent) newProxyInstance;
    }

    public static boolean c() {
        try {
            ClassLoader classLoader = jk5.class.getClassLoader();
            if (classLoader == null) {
                return false;
            }
            hpo hpoVar = new hpo(classLoader);
            WindowExtensions windowExtensions = WindowExtensionsProvider.getWindowExtensions();
            windowExtensions.getClass();
            return new hog(classLoader, hpoVar, windowExtensions).a() != null;
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return false;
        }
    }
}
