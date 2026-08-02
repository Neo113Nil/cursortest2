package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class s9l extends r9l {
    public static final x9l x;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        x = x9l.h(null, windowInsets);
    }

    public s9l(x9l x9lVar, WindowInsets windowInsets) {
        super(x9lVar, windowInsets);
    }

    @Override // defpackage.q9l, defpackage.m9l, defpackage.u9l
    public u4a i(int i) {
        return u4a.d(this.c.getInsets(w9l.a(i)));
    }

    @Override // defpackage.q9l, defpackage.m9l, defpackage.u9l
    public u4a j(int i) {
        return u4a.d(this.c.getInsetsIgnoringVisibility(w9l.a(i)));
    }

    @Override // defpackage.q9l, defpackage.m9l, defpackage.u9l
    public boolean u(int i) {
        return this.c.isVisible(w9l.a(i));
    }

    public s9l(x9l x9lVar, s9l s9lVar) {
        super(x9lVar, s9lVar);
    }

    @Override // defpackage.m9l, defpackage.u9l
    public void p(View view) {
    }
}
