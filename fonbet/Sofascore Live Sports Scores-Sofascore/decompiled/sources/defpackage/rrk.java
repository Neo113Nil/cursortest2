package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rrk implements View.OnApplyWindowInsetsListener {
    public x9l a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ kpd c;

    public rrk(View view, kpd kpdVar) {
        this.b = view;
        this.c = kpdVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        x9l h = x9l.h(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        kpd kpdVar = this.c;
        if (i < 30) {
            srk.a(windowInsets, this.b);
            if (h.equals(this.a)) {
                return kpdVar.L(view, h).g();
            }
        }
        this.a = h;
        x9l L = kpdVar.L(view, h);
        if (i >= 30) {
            return L.g();
        }
        WeakHashMap weakHashMap = bsk.a;
        view.requestApplyInsets();
        return L.g();
    }
}
