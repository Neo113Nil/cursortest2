package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class q9l extends p9l {
    public static final x9l w;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        w = x9l.h(null, windowInsets);
    }

    public q9l(x9l x9lVar, WindowInsets windowInsets) {
        super(x9lVar, windowInsets);
    }

    @Override // defpackage.m9l, defpackage.u9l
    public u4a i(int i) {
        return u4a.d(this.c.getInsets(v9l.a(i)));
    }

    @Override // defpackage.m9l, defpackage.u9l
    public u4a j(int i) {
        return u4a.d(this.c.getInsetsIgnoringVisibility(v9l.a(i)));
    }

    @Override // defpackage.m9l, defpackage.u9l
    public boolean u(int i) {
        return this.c.isVisible(v9l.a(i));
    }

    public q9l(x9l x9lVar, q9l q9lVar) {
        super(x9lVar, q9lVar);
    }

    @Override // defpackage.m9l, defpackage.u9l
    public final void d(View view) {
    }
}
