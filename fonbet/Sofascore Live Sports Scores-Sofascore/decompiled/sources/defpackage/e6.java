package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.slider.RangeSlider;
import com.vungle.ads.internal.ui.view.d;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class e6 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ e6(int i, View view) {
        this.a = i;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                k6 k6Var = (k6) view;
                gqc gqcVar = k6Var.d;
                k6Var.l = gqcVar.l.getX();
                k6Var.m = (gqcVar.l.getX() + gqcVar.l.getWidth()) - gqcVar.k.getWidth();
                break;
            case 1:
                ((RangeSlider) view).H();
                break;
            default:
                d.a((d) view);
                break;
        }
    }
}
