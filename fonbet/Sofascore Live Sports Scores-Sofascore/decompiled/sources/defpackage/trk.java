package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class trk {
    public static x9l a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        x9l h = x9l.h(null, rootWindowInsets);
        u9l u9lVar = h.a;
        u9lVar.y(h);
        View rootView = view.getRootView();
        u9lVar.d(rootView);
        u9lVar.p(rootView);
        u9lVar.q();
        return h;
    }
}
