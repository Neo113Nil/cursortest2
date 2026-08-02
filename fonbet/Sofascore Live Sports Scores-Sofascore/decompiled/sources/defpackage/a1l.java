package defpackage;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class a1l {
    public static final c1l a;

    static {
        c1l it7Var;
        try {
            it7Var = new d1l((WebViewProviderFactoryBoundaryInterface) s02.E(WebViewProviderFactoryBoundaryInterface.class, l4a.o()), 0);
        } catch (ClassNotFoundException unused) {
            it7Var = new it7(4);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            is8.h(e);
            return;
        }
        a = it7Var;
    }
}
