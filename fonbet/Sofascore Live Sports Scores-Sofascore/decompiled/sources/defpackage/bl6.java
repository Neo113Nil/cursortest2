package defpackage;

import androidx.window.extensions.WindowExtensionsProvider;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class bl6 {
    static {
        duf.a.getOrCreateKotlinClass(bl6.class).getSimpleName();
    }

    public static int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            int i = q62.a;
            fok fokVar = fok.a;
            return 0;
        } catch (NullPointerException unused2) {
            int i2 = q62.a;
            fok fokVar2 = fok.a;
            return 0;
        } catch (UnsupportedOperationException unused3) {
            int i3 = q62.a;
            fok fokVar3 = fok.a;
            return 0;
        }
    }
}
