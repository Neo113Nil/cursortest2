package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vxh implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ y3g c;

    public /* synthetic */ vxh(y3g y3gVar, View view, int i) {
        this.a = i;
        this.c = y3gVar;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = this.a;
        View view = this.b;
        y3g y3gVar = this.c;
        switch (i) {
            case 0:
                if (!((ilg) y3gVar.c).m()) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                } else {
                    break;
                }
            default:
                if (!((ilg) ((xxh) y3gVar).c).m()) {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                } else {
                    break;
                }
        }
        return true;
    }
}
