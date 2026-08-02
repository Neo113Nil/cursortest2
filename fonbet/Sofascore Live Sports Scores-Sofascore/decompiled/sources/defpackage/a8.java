package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class a8 extends p8 implements ViewTreeObserver.OnPreDrawListener {
    public final View c;
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(View view, String str) {
        super(view);
        view.getClass();
        str.getClass();
        this.c = view;
        this.d = str;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.c.getViewTreeObserver().removeOnPreDrawListener(this);
        lei leiVar = (lei) this;
        int max = Math.max(leiVar.h.getWidth(), leiVar.j.getWidth());
        leiVar.l.setGuidelineBegin(max);
        leiVar.m.setGuidelineEnd(max);
        return true;
    }
}
