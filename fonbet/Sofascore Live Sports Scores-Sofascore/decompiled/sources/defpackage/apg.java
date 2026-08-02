package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class apg {
    public final ClassLoader a;
    public final hpo b;
    public final cqa c;

    public apg(ClassLoader classLoader, hpo hpoVar) {
        this.a = classLoader;
        this.b = hpoVar;
        this.c = new cqa(classLoader);
    }

    public static final boolean d(apg apgVar) {
        Class<?> loadClass = apgVar.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        loadClass.getClass();
        return ljg.v(loadClass.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class)) && ljg.v(loadClass.getMethod("removeWindowLayoutInfoListener", Consumer.class));
    }

    public final WindowLayoutComponent a() {
        int a;
        cqa cqaVar = this.c;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        try {
            ((ClassLoader) cqaVar.a).loadClass("androidx.window.extensions.WindowExtensionsProvider").getClass();
            int i = 4;
            if (tz9.Z("WindowExtensionsProvider#getWindowExtensions is not valid", new e6g(cqaVar, i)) && tz9.Z("WindowExtensions#getWindowLayoutComponent is not valid", new zog(this, z ? 1 : 0)) && tz9.Z("FoldingFeature class is not valid", new zog(this, 1)) && (a = bl6.a()) >= 1) {
                if (a == 1) {
                    z = c();
                } else if (a < 5) {
                    z = b();
                } else if (b() && tz9.Z("DisplayFoldFeature is not valid", new zog(this, 3)) && tz9.Z("SupportedWindowFeatures is not valid", new zog(this, 2)) && tz9.Z("WindowLayoutComponent#getSupportedWindowFeatures is not valid", new zog(this, i))) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!z) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        if (!c()) {
            return false;
        }
        StringBuilder sb = new StringBuilder("WindowLayoutComponent#addWindowLayoutInfoListener(");
        sb.append(Context.class.getName());
        sb.append(", androidx.window.extensions.core.util.function.Consumer) is not valid");
        return tz9.Z(sb.toString(), new zog(this, 6));
    }

    public final boolean c() {
        return tz9.Z("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new zog(this, 5));
    }
}
