package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class t9l extends s9l {
    public t9l(x9l x9lVar, WindowInsets windowInsets) {
        super(x9lVar, windowInsets);
    }

    @Override // defpackage.m9l, defpackage.u9l
    public List<Rect> f(int i) {
        return this.c.getBoundingRects(w9l.a(i));
    }

    @Override // defpackage.m9l, defpackage.u9l
    public List<Rect> g(int i) {
        return this.c.getBoundingRectsIgnoringVisibility(w9l.a(i));
    }

    public t9l(x9l x9lVar, t9l t9lVar) {
        super(x9lVar, t9lVar);
    }

    @Override // defpackage.m9l, defpackage.u9l
    public void q() {
    }
}
